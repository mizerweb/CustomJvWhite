package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n31 {
    public int a;

    public n31(int i) {
        this.a = i;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = cqk.i(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void a(int i) {
        this.a = i | this.a;
    }

    public boolean d(int i) {
        return (this.a & i) == i;
    }

    public void f(id7 id7Var) {
    }

    public void g(id7 id7Var) {
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + id7Var + ".path");
        SQLiteDatabase sQLiteDatabase = id7Var.a;
        if (!sQLiteDatabase.isOpen()) {
            String path = sQLiteDatabase.getPath();
            if (path != null) {
                b(path);
                return;
            }
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = sQLiteDatabase.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                id7Var.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<T> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    b((String) ((Pair) it.next()).second);
                }
            } else {
                String path2 = sQLiteDatabase.getPath();
                if (path2 != null) {
                    b(path2);
                }
            }
        }
    }

    public abstract void i(id7 id7Var);

    public abstract void k(id7 id7Var, int i, int i2);

    public abstract void n(id7 id7Var);

    public abstract void p(id7 id7Var, int i, int i2);
}
