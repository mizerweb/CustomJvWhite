package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class uxe implements Closeable {
    public static final z86 f = new z86("proto");
    public final n3f a;
    public final pt3 b;
    public final pt3 c;
    public final lh0 d;
    public final Provider e;

    public uxe(pt3 pt3Var, pt3 pt3Var2, lh0 lh0Var, n3f n3fVar, Provider provider) {
        this.a = n3fVar;
        this.b = pt3Var;
        this.c = pt3Var2;
        this.d = lh0Var;
        this.e = provider;
    }

    public static String P(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((ii0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object W(Cursor cursor, sxe sxeVar) {
        try {
            return sxeVar.mo41apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long y(SQLiteDatabase sQLiteDatabase, ij0 ij0Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(ij0Var.a, String.valueOf(yhd.a(ij0Var.c))));
        byte[] bArr = ij0Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final Object A(sxe sxeVar) {
        SQLiteDatabase sQLiteDatabaseL = l();
        sQLiteDatabaseL.beginTransaction();
        try {
            Object objMo41apply = sxeVar.mo41apply(sQLiteDatabaseL);
            sQLiteDatabaseL.setTransactionSuccessful();
            return objMo41apply;
        } finally {
            sQLiteDatabaseL.endTransaction();
        }
    }

    public final ArrayList E(SQLiteDatabase sQLiteDatabase, ij0 ij0Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lY = y(sQLiteDatabase, ij0Var);
        if (lY == null) {
            return arrayList;
        }
        W(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", ApiProtocol.PARAM_PAYLOAD, "code", "inline"}, "context_id = ?", new String[]{lY.toString()}, null, null, null, String.valueOf(i)), new oo(this, arrayList, ij0Var, 25));
        return arrayList;
    }

    public final void I(long j, he9 he9Var, String str) {
        A(new jw2(str, he9Var, j, 7));
    }

    public final Object K(hfh hfhVar) {
        SQLiteDatabase sQLiteDatabaseL = l();
        pt3 pt3Var = this.c;
        long jI = pt3Var.i();
        while (true) {
            try {
                sQLiteDatabaseL.beginTransaction();
                try {
                    Object objA = hfhVar.a();
                    sQLiteDatabaseL.setTransactionSuccessful();
                    return objA;
                } finally {
                    sQLiteDatabaseL.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (pt3Var.i() >= ((long) this.d.c) + jI) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final SQLiteDatabase l() {
        n3f n3fVar = this.a;
        Objects.requireNonNull(n3fVar);
        pt3 pt3Var = this.c;
        long jI = pt3Var.i();
        while (true) {
            try {
                return n3fVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (pt3Var.i() >= ((long) this.d.c) + jI) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
