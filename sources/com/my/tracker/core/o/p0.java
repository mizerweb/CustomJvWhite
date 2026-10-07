package com.my.tracker.core.o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.my.tracker.core.utils.TimeUtils;

/* JADX INFO: loaded from: classes.dex */
final class p0 {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;

    public static class a implements b {
        private final Cursor a;

        public a(SQLiteDatabase sQLiteDatabase) {
            this.a = sQLiteDatabase.rawQuery("SELECT id, data FROM table_partial_proto_packet ORDER BY ts", null);
        }

        @Override // com.my.tracker.core.o.b
        public long a() {
            return this.a.getLong(0);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.core.o.b
        public byte[] j() {
            return this.a.getBlob(1);
        }

        @Override // com.my.tracker.core.o.b
        public boolean moveToNext() {
            return this.a.moveToNext();
        }
    }

    public p0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id not in   (SELECT id    FROM table_partial_proto_packet    ORDER BY TS DESC    LIMIT ?  )");
        this.c = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_partial_proto_packet(data, ts) VALUES (?, ?)");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_partial_proto_packet WHERE id = ?");
    }

    public void a(byte[] bArr) {
        try {
            long jCurrentTimeMillis = TimeUtils.currentTimeMillis();
            this.c.bindBlob(1, bArr);
            this.c.bindLong(2, jCurrentTimeMillis);
            this.c.executeInsert();
        } finally {
            this.c.clearBindings();
        }
    }

    public void b(long j) {
        try {
            this.b.bindLong(1, j);
            this.b.executeUpdateDelete();
        } finally {
            this.b.clearBindings();
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_partial_proto_packet(id INTEGER PRIMARY KEY AUTOINCREMENT, data BLOB NOT NULL, ts INTEGER(8))");
    }

    public b a() {
        return new a(this.a);
    }

    public void a(long j) {
        try {
            this.d.bindLong(1, j);
            this.d.executeUpdateDelete();
        } finally {
            this.d.clearBindings();
        }
    }
}
