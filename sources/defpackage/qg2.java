package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qg2 {
    public final vo8 a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final Object d = new Object();
    public final ArrayList e = new ArrayList();
    public final Object f = new Object();
    public final ArrayList g = new ArrayList();

    public qg2(vo8 vo8Var) {
        this.a = vo8Var;
    }

    public final void a(Runnable runnable, int i) {
        boolean zAdd;
        String str;
        int i2 = og2.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 == 1) {
            synchronized (this.b) {
                zAdd = this.c.add(runnable);
            }
        } else if (i2 == 2) {
            synchronized (this.d) {
                zAdd = this.e.add(runnable);
            }
        } else if (i2 != 3) {
            ore.o();
            return;
        } else {
            synchronized (this.f) {
                zAdd = this.g.add(runnable);
            }
        }
        if (zAdd) {
            return;
        }
        StringBuilder sb = new StringBuilder("CameraPipeLifetime already shut down. This is unexpected. Executing ");
        if (i == 1) {
            str = "CAMERA";
        } else if (i != 2) {
            str = i != 3 ? "null" : "THREAD";
        } else {
            str = "SCOPE";
        }
        sb.append(str);
        sb.append(" shutdown action immediately...");
        Log.e("CXCP", sb.toString());
        runnable.run();
    }

    public final void b() {
        synchronized (this.b) {
            Log.d("CXCP", "Shutting down cameras...");
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        synchronized (this.d) {
            try {
                Log.d("CXCP", "Shutting down scopes...");
                Iterator it2 = this.e.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f) {
            Log.d("CXCP", "Shutting down threads...");
            Iterator it3 = this.g.iterator();
            while (it3.hasNext()) {
                ((Runnable) it3.next()).run();
            }
        }
    }
}
