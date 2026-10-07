package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.text.TextUtils;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class id7 implements Closeable {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final ny8 d = rx8.P(2, new i94(24));
    public static final ny8 e = rx8.P(2, new i94(25));
    public final SQLiteDatabase a;

    public id7(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public final od7 A(String str) {
        return new od7(this.a.compileStatement(str));
    }

    public final void E() {
        this.a.endTransaction();
    }

    public final boolean G0() {
        return this.a.inTransaction();
    }

    public final void I(String str) {
        this.a.execSQL(str);
    }

    public final void K(String str, Object[] objArr) {
        this.a.execSQL(str, objArr);
    }

    public final boolean P() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    public final Cursor W(fbh fbhVar) {
        final gd7 gd7Var = new gd7(fbhVar);
        return this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: hd7
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) gd7Var.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, fbhVar.l(), c, null);
    }

    public final Cursor Y(String str) {
        return W(new fbc(str, 13, null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final boolean isOpen() {
        return this.a.isOpen();
    }

    public final Cursor k0(String str, Object[] objArr) {
        return W(new fbc(str, 13, objArr));
    }

    public final void l() {
        this.a.beginTransaction();
    }

    public final void o0() {
        this.a.setTransactionSuccessful();
    }

    public final int r0(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        int i2 = 0;
        if (contentValues.size() == 0) {
            ore.p("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(b[i]);
        sb.append(str);
        sb.append(" SET ");
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        od7 od7VarA = A(sb.toString());
        vd7.c(od7VarA, objArr2);
        return od7VarA.c.executeUpdateDelete();
    }

    public final void y() {
        this.a.beginTransactionNonExclusive();
    }
}
