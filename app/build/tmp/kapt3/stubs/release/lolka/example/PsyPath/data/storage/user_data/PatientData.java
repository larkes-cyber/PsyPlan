package lolka.example.PsyPath.data.storage.user_data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Llolka/example/PsyPath/data/storage/user_data/PatientData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sessionSharedPreference", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "sharedPreferences", "getPatientData", "Llolka/example/PsyPath/data/storage/models/PatientDataStorage;", "getSession", "Llolka/example/PsyPath/data/storage/models/SessionStorage;", "insertPatientData", "", "data", "saveSession", "props", "app_release"})
public final class PatientData {
    private final android.content.Context context = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.content.SharedPreferences sessionSharedPreference = null;
    
    public PatientData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.data.storage.models.PatientDataStorage getPatientData() {
        return null;
    }
    
    public final void insertPatientData(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.models.PatientDataStorage data) {
    }
    
    public final void saveSession(@org.jetbrains.annotations.NotNull()
    lolka.example.PsyPath.data.storage.models.SessionStorage props) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final lolka.example.PsyPath.data.storage.models.SessionStorage getSession() {
        return null;
    }
}