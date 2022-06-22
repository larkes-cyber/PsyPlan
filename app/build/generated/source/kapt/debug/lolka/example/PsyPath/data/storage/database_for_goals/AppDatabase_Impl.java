package lolka.example.PsyPath.data.storage.database_for_goals;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lolka.example.PsyPath.data.storage.database_for_goals.dao.SomeDao;
import lolka.example.PsyPath.data.storage.database_for_goals.dao.SomeDao_Impl;
import lolka.example.PsyPath.data.storage.database_for_goals.dao.TaskDao;
import lolka.example.PsyPath.data.storage.database_for_goals.dao.TaskDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile SomeDao _someDao;

  private volatile TaskDao _taskDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `EntitySomeData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `some` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `EntityTask` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `text` TEXT NOT NULL, `time` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2a6edef85790db2e5e337ef0f0b383a5')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `EntitySomeData`");
        _db.execSQL("DROP TABLE IF EXISTS `EntityTask`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsEntitySomeData = new HashMap<String, TableInfo.Column>(2);
        _columnsEntitySomeData.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEntitySomeData.put("some", new TableInfo.Column("some", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEntitySomeData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEntitySomeData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEntitySomeData = new TableInfo("EntitySomeData", _columnsEntitySomeData, _foreignKeysEntitySomeData, _indicesEntitySomeData);
        final TableInfo _existingEntitySomeData = TableInfo.read(_db, "EntitySomeData");
        if (! _infoEntitySomeData.equals(_existingEntitySomeData)) {
          return new RoomOpenHelper.ValidationResult(false, "EntitySomeData(lolka.example.PsyPath.data.storage.database_for_goals.entity.EntitySomeData).\n"
                  + " Expected:\n" + _infoEntitySomeData + "\n"
                  + " Found:\n" + _existingEntitySomeData);
        }
        final HashMap<String, TableInfo.Column> _columnsEntityTask = new HashMap<String, TableInfo.Column>(3);
        _columnsEntityTask.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEntityTask.put("text", new TableInfo.Column("text", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEntityTask.put("time", new TableInfo.Column("time", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEntityTask = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEntityTask = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEntityTask = new TableInfo("EntityTask", _columnsEntityTask, _foreignKeysEntityTask, _indicesEntityTask);
        final TableInfo _existingEntityTask = TableInfo.read(_db, "EntityTask");
        if (! _infoEntityTask.equals(_existingEntityTask)) {
          return new RoomOpenHelper.ValidationResult(false, "EntityTask(lolka.example.PsyPath.data.storage.database_for_goals.entity.EntityTask).\n"
                  + " Expected:\n" + _infoEntityTask + "\n"
                  + " Found:\n" + _existingEntityTask);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2a6edef85790db2e5e337ef0f0b383a5", "d146e9117252f5e1bf902c006f6ec2d0");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "EntitySomeData","EntityTask");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `EntitySomeData`");
      _db.execSQL("DELETE FROM `EntityTask`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SomeDao.class, SomeDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TaskDao.class, TaskDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public SomeDao someDao() {
    if (_someDao != null) {
      return _someDao;
    } else {
      synchronized(this) {
        if(_someDao == null) {
          _someDao = new SomeDao_Impl(this);
        }
        return _someDao;
      }
    }
  }

  @Override
  public TaskDao taskDao() {
    if (_taskDao != null) {
      return _taskDao;
    } else {
      synchronized(this) {
        if(_taskDao == null) {
          _taskDao = new TaskDao_Impl(this);
        }
        return _taskDao;
      }
    }
  }
}
