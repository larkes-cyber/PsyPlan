package lolka.example.PsyPath.data.storage.database_for_goals.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import lolka.example.PsyPath.data.storage.database_for_goals.entity.EntitySomeData;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SomeDao_Impl implements SomeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EntitySomeData> __insertionAdapterOfEntitySomeData;

  private final EntityDeletionOrUpdateAdapter<EntitySomeData> __deletionAdapterOfEntitySomeData;

  private final EntityDeletionOrUpdateAdapter<EntitySomeData> __updateAdapterOfEntitySomeData;

  public SomeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEntitySomeData = new EntityInsertionAdapter<EntitySomeData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `EntitySomeData` (`id`,`some`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntitySomeData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSome() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSome());
        }
      }
    };
    this.__deletionAdapterOfEntitySomeData = new EntityDeletionOrUpdateAdapter<EntitySomeData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `EntitySomeData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntitySomeData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfEntitySomeData = new EntityDeletionOrUpdateAdapter<EntitySomeData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `EntitySomeData` SET `id` = ?,`some` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EntitySomeData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSome() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSome());
        }
        if (value.getId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getId());
        }
      }
    };
  }

  @Override
  public Object addSome(final EntitySomeData entitySomeData,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEntitySomeData.insert(entitySomeData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object removeSome(final EntitySomeData entitySomeData,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfEntitySomeData.handle(entitySomeData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateSome(final EntitySomeData entitySomeData,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfEntitySomeData.handle(entitySomeData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllSome(final Continuation<? super List<EntitySomeData>> continuation) {
    final String _sql = "SELECT * FROM EntitySomeData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<EntitySomeData>>() {
      @Override
      public List<EntitySomeData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSome = CursorUtil.getColumnIndexOrThrow(_cursor, "some");
          final List<EntitySomeData> _result = new ArrayList<EntitySomeData>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EntitySomeData _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpSome;
            if (_cursor.isNull(_cursorIndexOfSome)) {
              _tmpSome = null;
            } else {
              _tmpSome = _cursor.getString(_cursorIndexOfSome);
            }
            _item = new EntitySomeData(_tmpId,_tmpSome);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
