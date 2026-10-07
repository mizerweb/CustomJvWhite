package com.my.tracker.core.o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
final class m0 {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;

    public static final class a implements p {
        private final Cursor a;

        public a(SQLiteDatabase sQLiteDatabase, long j) {
            this.a = sQLiteDatabase.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", new String[]{String.valueOf(j)});
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.core.o.p
        public long k() {
            return this.a.getLong(1);
        }

        @Override // com.my.tracker.core.o.p
        public boolean moveToNext() {
            return this.a.moveToNext();
        }
    }

    public m0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.c = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
    }

    public long a(long j) {
        Cursor cursorRawQuery = this.a.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", new String[]{String.valueOf(j)});
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void b(long j, long j2) {
        try {
            this.b.bindLong(1, j);
            this.b.bindLong(2, j2);
            this.b.execute();
        } finally {
            this.b.clearBindings();
        }
    }

    public p b(long j) {
        return new a(this.a, j);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
    }

    public void a() {
        this.d.executeUpdateDelete();
    }

    public long a(long j, long j2) {
        try {
            this.c.bindLong(1, j);
            this.c.bindLong(2, j2);
            long jExecuteUpdateDelete = this.c.executeUpdateDelete();
            return jExecuteUpdateDelete;
        } finally {
            this.c.clearBindings();
        }
    }
}
