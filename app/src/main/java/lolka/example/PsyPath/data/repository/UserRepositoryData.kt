package lolka.example.PsyPath.data.repository

import android.util.Log
import lolka.example.PsyPath.data.retrofit.model.PatientDataRetrofit
import lolka.example.PsyPath.data.retrofit.model.RetrofitLogin
import lolka.example.PsyPath.data.retrofit.model.RetrofitSomeData
import lolka.example.PsyPath.data.retrofit.model.RetrofitTask
import lolka.example.PsyPath.domain.repository.UserRepository
import lolka.example.PsyPath.data.retrofit.repository.RetrofitRepository
import lolka.example.PsyPath.data.storage.Service
import lolka.example.PsyPath.data.storage.models.PatientDataStorage
import lolka.example.PsyPath.data.storage.models.SessionStorage
import lolka.example.PsyPath.data.storage.models.SomeDataStorage
import lolka.example.PsyPath.data.storage.models.TaskStorage
import lolka.example.PsyPath.domain.model.*

class UserRepositoryData(
    private val service: Service,
    private val retrofitRepository: RetrofitRepository
    ): UserRepository {

    override suspend fun pushSomeDataToServer(props: SomeData): String {
        val resp = retrofitRepository.pushSomeDataToServer(props = RetrofitSomeData(
            some = props.some
        ))
        return "true"
    }

    override suspend fun getSomeDataFromServer(): SomeData {
        val data:RetrofitSomeData = retrofitRepository.getSomeData()
        return SomeData(some = data.some)
    }


    override suspend fun insertToDataBase(props: SomeData) {
        service.insertToDatabase(props = SomeDataStorage(
            some = props.some
        ))
    }

    override suspend fun getFromDatabase(): SomeData {
        val data = service.getFromDatabase()
        return SomeData(
            id = data.id,
            some = data.some
        )
    }

    override suspend fun pushPatientDataToServer(props: PatientData):Session {
        val data = retrofitRepository.pushPatientDataToServer(PatientDataRetrofit(
            login = props.login,
            password = props.password,
            name = props.name,
            birthday = props.birthday,
            oms = props.oms,
            dms = props.dms,
            disease = props.disease,
            spec_id = props.spec_id
        ))
        Log.d("resp",data.body()?.role.toString())
        Log.d("resp",data.body()?.session.toString())
        return Session(
            session = data.body()?.session.toString(),
            role = data.body()?.role.toString()
        )
    }

    override suspend fun getAllMessages(props: UserDataToGetMessages): MutableList<Message> {

        val array:MutableList<Message> = ArrayList()
        return array

    }

    override suspend fun pushMessageToServer(props: Message): String {

        return "dsfsf"

    }

    override suspend fun insertPatientDataToDatabase(props: PatientData) {
        service.insertPatientDataToDatabase(PatientDataStorage(
            login = props.login,
            password = props.password,
            name = props.name,
            birthday = props.birthday,
            oms = props.oms,
            dms = props.dms,
            disease = props.disease,
            spec_id = props.spec_id
        ))
    }

    override suspend fun getPatientDataToDatabase(): PatientData {

        val props = service.getPatientDataFromDatabase()

        return PatientData(
            login = props.login,
            password = props.password,
            name = props.name,
            birthday = props.birthday,
            oms = props.oms,
            dms = props.dms,
            disease = props.disease,
            spec_id = props.spec_id
        )

    }

    override suspend fun insertTaskToDatabase(task: Task) {
        service.insertTaskToDatabase(
            TaskStorage(
                text = task.text,
                time = task.time
            )
        )
    }

    override suspend fun getTasksFromDatabase(): MutableList<Task> {

        val array:MutableList<Task> = ArrayList()
        val data = service.getTaskFromDatabase()

        for(i in 0 until data.size){
            array.add(
                Task(
                    text = data[i].text,
                    time = data[i].time
                )
            )
        }
        return array
    }

    override suspend fun pushTaskToServer(task: Task): Int {
        val resp = retrofitRepository.pushTaskToServer(RetrofitTask(
            text = task.text,
            time = task.time
        ))

        return resp.body()?.id!!
    }

    override suspend fun saveSession(session: Session) {
        service.saveSession(SessionStorage(
            session = session.session,
            role = session.role
        ))
    }

    override suspend fun getSession(): Session {

        val data = service.getSession()

        return Session(
            session = data.session,
            role = data.role
        )

    }

    override suspend fun checkUser(login: Login): String {
       val resp = retrofitRepository.checkUser(RetrofitLogin(
            login.login
        ))

        return resp.body().toString()
    }


}