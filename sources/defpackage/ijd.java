package defpackage;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ijd {
    public static final String l = n1g.Z("Processor");
    public final Context b;
    public final ja4 c;
    public final azj d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public ijd(Context context, ja4 ja4Var, azj azjVar, WorkDatabase workDatabase) {
        this.b = context;
        this.c = ja4Var;
        this.d = azjVar;
        this.e = workDatabase;
    }

    public static boolean d(String str, h0k h0kVar, int i) throws IllegalAccessException, InvocationTargetException {
        String str2 = l;
        if (h0kVar == null) {
            n1g.x().p(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        h0kVar.m.q(new WorkerStoppedException(i));
        n1g.x().p(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(md6 md6Var) {
        synchronized (this.k) {
            this.j.add(md6Var);
        }
    }

    public final h0k b(String str) {
        h0k h0kVar = (h0k) this.f.remove(str);
        boolean z = h0kVar != null;
        if (!z) {
            h0kVar = (h0k) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        try {
                            this.b.startService(qfh.e(this.b));
                        } catch (Throwable th) {
                            n1g.x().t(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return h0kVar;
    }

    public final h0k c(String str) {
        h0k h0kVar = (h0k) this.f.get(str);
        return h0kVar == null ? (h0k) this.g.get(str) : h0kVar;
    }
}
