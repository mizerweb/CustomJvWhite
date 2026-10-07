package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.database.DatabaseIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y95 {
    public static final String e = g(3, 4);
    public static final String[] f = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    public final m35 b;
    public boolean d;
    public final String a = "ExoPlayerDownloads";
    public final Object c = new Object();

    public y95(m35 m35Var) {
        this.b = m35Var;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String str2 = vqi.a;
            for (String str3 : str.split(",", -1)) {
                String[] strArrSplit = str3.split("\\.", -1);
                lvb.b0(strArrSplit.length == 3);
                arrayList.add(new k4h(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
            }
        }
        return arrayList;
    }

    public static rp5 e(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String strN = uya.n(cursor.getString(1));
        ArrayList arrayListA = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        ss5 ss5Var = new ss5(string, uri, strN, arrayListA, blob, cursor.getString(4), cursor.getBlob(5), null, null);
        ps5 ps5Var = new ps5();
        ps5Var.a = cursor.getLong(13);
        ps5Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new rp5(ss5Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, ps5Var);
    }

    public static rp5 f(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        ss5 ss5Var = new ss5(string, uri, uya.n(str), a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5), null, null);
        ps5 ps5Var = new ps5();
        ps5Var.a = cursor.getLong(13);
        ps5Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new rp5(ss5Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, ps5Var);
    }

    public static String g(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    public final void b() {
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            try {
                int iA = usi.a(this.b.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        usi.c(writableDatabase, 0, "", 3);
                        ArrayList arrayListH = iA == 2 ? h(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(this.a));
                        writableDatabase.execSQL("CREATE TABLE " + this.a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayListH.iterator();
                        while (it.hasNext()) {
                            j((rp5) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.d = true;
            } catch (SQLException e2) {
                throw new DatabaseIOException((Throwable) e2);
            }
        }
    }

    public final Cursor c(String str, String[] strArr) {
        try {
            return this.b.getReadableDatabase().query(this.a, f, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new DatabaseIOException((Throwable) e2);
        }
    }

    public final rp5 d(String str) {
        b();
        try {
            Cursor cursorC = c("id = ?", new String[]{str});
            try {
                if (cursorC.getCount() == 0) {
                    cursorC.close();
                    return null;
                }
                cursorC.moveToNext();
                rp5 rp5VarE = e(cursorC);
                cursorC.close();
                return rp5VarE;
            } catch (Throwable th) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            throw new DatabaseIOException((Throwable) e2);
        }
        throw new DatabaseIOException((Throwable) e2);
    }

    public final ArrayList h(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        String str = this.a;
        if (!vqi.m0(sQLiteDatabase, str)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(str, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(f(cursorQuery));
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void i(rp5 rp5Var) {
        b();
        try {
            j(rp5Var, this.b.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new DatabaseIOException((Throwable) e2);
        }
    }

    public final void j(rp5 rp5Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = rp5Var.a.e;
        if (bArr == null) {
            bArr = vqi.b;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", rp5Var.a.a);
        contentValues.put("mime_type", rp5Var.a.c);
        contentValues.put("uri", rp5Var.a.b.toString());
        List list = rp5Var.a.d;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            k4h k4hVar = (k4h) list.get(i);
            sb.append(k4hVar.a);
            sb.append('.');
            sb.append(k4hVar.b);
            sb.append('.');
            sb.append(k4hVar.c);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", rp5Var.a.f);
        contentValues.put("data", rp5Var.a.g);
        contentValues.put("state", Integer.valueOf(rp5Var.b));
        contentValues.put("start_time_ms", Long.valueOf(rp5Var.c));
        contentValues.put("update_time_ms", Long.valueOf(rp5Var.d));
        contentValues.put("content_length", Long.valueOf(rp5Var.e));
        contentValues.put("stop_reason", Integer.valueOf(rp5Var.f));
        contentValues.put("failure_reason", Integer.valueOf(rp5Var.g));
        contentValues.put("percent_downloaded", Float.valueOf(rp5Var.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(rp5Var.h.a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.a, null, contentValues);
    }

    public final void k(String str) {
        b();
        try {
            this.b.getWritableDatabase().delete(this.a, "id = ?", new String[]{str});
        } catch (SQLiteException e2) {
            throw new DatabaseIOException((Throwable) e2);
        }
    }

    public final void l() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.b.getWritableDatabase().update(this.a, contentValues, "state = 2", null);
        } catch (SQLException e2) {
            throw new DatabaseIOException((Throwable) e2);
        }
    }

    public final void m() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.b.getWritableDatabase().update(this.a, contentValues, null, null);
        } catch (SQLException e2) {
            throw new DatabaseIOException((Throwable) e2);
        }
    }

    public final void n(int i, String str) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.b.getWritableDatabase().update(this.a, contentValues, e + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new DatabaseIOException((Throwable) e2);
        }
    }
}
