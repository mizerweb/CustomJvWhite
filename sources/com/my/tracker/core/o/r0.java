package com.my.tracker.core.o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
final class r0 {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;

    public static final class a implements g0 {
        private final Cursor a;

        public a(SQLiteDatabase sQLiteDatabase, long j) {
            this.a = sQLiteDatabase.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", new String[]{String.valueOf(j)});
        }

        @Override // com.my.tracker.core.o.g0
        public long c() {
            return this.a.getLong(1);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.core.o.g0
        public long d() {
            return this.a.getLong(2);
        }

        @Override // com.my.tracker.core.o.g0
        public boolean h() {
            return this.a.isNull(2);
        }

        @Override // com.my.tracker.core.o.g0
        public boolean moveToNext() {
            return this.a.moveToNext();
        }
    }

    public r0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.c = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
    }

    public long a(long j) {
        Cursor cursorRawQuery = this.a.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", new String[]{String.valueOf(j)});
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

    public g0 b(long j) {
        return new a(this.a, j);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
    }

    public void a(long j, long j2, boolean z, long j3) {
        try {
            this.b.bindLong(1, j);
            this.b.bindLong(2, j2);
            SQLiteStatement sQLiteStatement = this.b;
            if (z) {
                sQLiteStatement.bindNull(3);
            } else {
                sQLiteStatement.bindLong(3, j3);
            }
            this.b.executeInsert();
        } finally {
            this.b.clearBindings();
        }
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
