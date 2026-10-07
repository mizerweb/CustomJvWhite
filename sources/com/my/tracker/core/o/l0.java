package com.my.tracker.core.o;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
final class l0 {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;

    public static final class b implements SQLiteDatabase.CursorFactory {
        private final long a;
        private final byte[] b;

        public b(long j, byte[] bArr) {
            this.a = j;
            this.b = bArr;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.a);
            sQLiteQuery.bindBlob(2, this.b);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public l0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, proto_id, major, body) VALUES (?, ?, ?, ?)");
        this.c = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.d = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
    }

    public long a(long j, int i, boolean z, byte[] bArr) {
        try {
            this.b.bindLong(1, j);
            this.b.bindLong(2, i);
            this.b.bindLong(3, z ? 1L : 0L);
            this.b.bindBlob(4, bArr);
            return this.b.executeInsert();
        } finally {
            this.b.clearBindings();
        }
    }

    public o b() {
        return new a(this.a);
    }

    public long c() {
        Cursor cursorRawQuery = this.a.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j;
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

    public o b(long j, byte[] bArr) {
        return new a(this.a, j, bArr);
    }

    public static final class a implements o {
        private final Cursor a;

        public a(SQLiteDatabase sQLiteDatabase, long j, byte[] bArr) {
            this.a = sQLiteDatabase.rawQueryWithFactory(new b(j, bArr), "SELECT id, type, proto_id, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", null, "table_events");
        }

        @Override // com.my.tracker.core.o.o
        public long a() {
            return this.a.getLong(0);
        }

        @Override // com.my.tracker.core.o.o
        public long b() {
            return this.a.getLong(5);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.core.o.o
        public long e() {
            return this.a.getLong(1);
        }

        @Override // com.my.tracker.core.o.o
        public byte[] g() {
            return this.a.getBlob(4);
        }

        @Override // com.my.tracker.core.o.o
        public int i() {
            return this.a.getInt(2);
        }

        @Override // com.my.tracker.core.o.o
        public boolean moveToNext() {
            return this.a.moveToNext();
        }

        public a(SQLiteDatabase sQLiteDatabase) {
            this.a = sQLiteDatabase.rawQuery("SELECT id, type, proto_id, major, body, ts_skipped FROM table_events", null);
        }
    }

    public long a(long j) {
        Cursor cursorRawQuery = this.a.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", new String[]{String.valueOf(j)});
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

    public long a(long j, byte[] bArr) {
        Cursor cursorRawQueryWithFactory = this.a.rawQueryWithFactory(new b(j, bArr), "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", null, "table_events");
        try {
            if (!cursorRawQueryWithFactory.moveToNext()) {
                cursorRawQueryWithFactory.close();
                return 0L;
            }
            long j2 = cursorRawQueryWithFactory.getLong(0);
            cursorRawQueryWithFactory.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQueryWithFactory != null) {
                try {
                    cursorRawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, proto_id INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
    }

    public void a(long j, long j2) {
        try {
            this.d.bindLong(1, j2);
            this.d.bindLong(2, j);
            this.d.executeUpdateDelete();
        } finally {
            this.d.clearBindings();
        }
    }

    public void a() {
        this.c.executeUpdateDelete();
    }
}
