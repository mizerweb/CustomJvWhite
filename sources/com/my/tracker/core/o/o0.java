package com.my.tracker.core.o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
final class o0 {
    private final SQLiteDatabase a;
    private final SQLiteStatement b;
    private final SQLiteStatement c;
    private final SQLiteStatement d;

    public o0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(param_key, value) VALUES (?, ?)");
        this.c = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE param_key=?");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE param_key=?");
    }

    public void a(String str, Long l) {
        if (l == null) {
            try {
                this.d.bindString(1, str);
                this.d.executeUpdateDelete();
                return;
            } finally {
                this.d.clearBindings();
            }
        }
        long jLongValue = l.longValue();
        try {
            this.b.bindString(1, str);
            this.b.bindLong(2, jLongValue);
            long jExecuteInsert = this.b.executeInsert();
            SQLiteStatement sQLiteStatement = this.b;
            if (jExecuteInsert != -1) {
                sQLiteStatement.clearBindings();
                return;
            }
            sQLiteStatement.clearBindings();
            try {
                this.c.bindLong(1, jLongValue);
                this.c.bindString(2, str);
                this.c.executeUpdateDelete();
            } finally {
                this.c.clearBindings();
            }
        } catch (Throwable th) {
            this.b.clearBindings();
            throw th;
        }
    }

    public Long a(String str) {
        Cursor cursorRawQuery = this.a.rawQuery("SELECT value FROM table_params WHERE param_key=?", new String[]{str});
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return null;
            }
            Long lValueOf = Long.valueOf(cursorRawQuery.getLong(0));
            cursorRawQuery.close();
            return lValueOf;
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

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(param_key TEXT PRIMARY KEY, value INTEGER)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramsparam_key ON table_params(param_key)");
    }
}
