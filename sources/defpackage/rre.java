package defpackage;

import android.content.Intent;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class rre {
    public dq4 a;
    public vt4 b;
    public Executor c;
    public iif d;
    public th5 e;
    public jl8 f;
    public boolean h;
    public final c46 g = new c46(new fl9(0, this, rre.class, "onClosed", "onClosed()V", 0, 6));
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ore.k("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        id7 writableDatabase = g().getWritableDatabase();
        if (!writableDatabase.G0()) {
            jl8 jl8Var = this.f;
            if (jl8Var == null) {
                jl8Var = null;
            }
            jl8Var.getClass();
            lvb.z0(new qn6(jl8Var, (lq4) null, 21));
        }
        if (writableDatabase.P()) {
            writableDatabase.y();
        } else {
            writableDatabase.l();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wm9.P0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((qr3) ((rv8) entry.getKey())).d(), entry.getValue());
        }
        return r66.a;
    }

    public abstract jl8 d();

    public pic e() {
        throw new jib();
    }

    public final void f() {
        g().getWritableDatabase().E();
        if (k()) {
            return;
        }
        jl8 jl8Var = this.f;
        if (jl8Var == null) {
            jl8Var = null;
        }
        jl8Var.c.g(jl8Var.f, jl8Var.g);
    }

    public final dbh g() {
        th5 th5Var = this.e;
        if (th5Var == null) {
            th5Var = null;
        }
        dbh dbhVar = (dbh) th5Var.g;
        if (dbhVar != null) {
            return dbhVar;
        }
        ore.k("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set h() {
        return ww3.X1(new ArrayList(yw3.W0(c76.a, 10)));
    }

    public LinkedHashMap i() {
        int iP0 = wm9.P0(yw3.W0(c76.a, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        return new LinkedHashMap(iP0);
    }

    public final boolean j() {
        th5 th5Var = this.e;
        if (th5Var == null) {
            th5Var = null;
        }
        return ((dbh) th5Var.g) != null;
    }

    public final boolean k() {
        return m() && g().getWritableDatabase().G0();
    }

    public final void l(qxe qxeVar) {
        jl8 jl8Var = this.f;
        if (jl8Var == null) {
            jl8Var = null;
        }
        nub nubVar = jl8Var.c;
        nubVar.getClass();
        vxe vxeVarO0 = qxeVar.O0("PRAGMA query_only");
        try {
            vxeVarO0.M0();
            boolean zS0 = vxeVarO0.s0();
            p90.f(vxeVarO0, null);
            if (!zS0) {
                n1g.u(qxeVar, "PRAGMA temp_store = MEMORY");
                n1g.u(qxeVar, "PRAGMA recursive_triggers = 1");
                n1g.u(qxeVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (nubVar.a) {
                    n1g.u(qxeVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    n1g.u(qxeVar, z5h.J0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                prb prbVar = (prb) nubVar.h;
                ReentrantLock reentrantLock = prbVar.a;
                reentrantLock.lock();
                try {
                    prbVar.d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (jl8Var.k) {
                try {
                    i5b i5bVar = jl8Var.j;
                    if (i5bVar != null) {
                        Intent intent = jl8Var.i;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i5bVar.c(intent);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                p90.f(vxeVarO0, th3);
                throw th4;
            }
        }
    }

    public final boolean m() {
        th5 th5Var = this.e;
        if (th5Var == null) {
            th5Var = null;
        }
        id7 id7Var = (id7) th5Var.h;
        if (id7Var != null) {
            return id7Var.isOpen();
        }
        return false;
    }

    public final Object n(af7 af7Var) {
        if (!j()) {
            return ch3.G(this, false, true, new vsc(1, af7Var));
        }
        b();
        try {
            Object objInvoke = af7Var.invoke();
            p();
            return objInvoke;
        } finally {
            f();
        }
    }

    public final Object o(Callable callable) {
        return n(new ap9(22, callable));
    }

    public final void p() {
        g().getWritableDatabase().o0();
    }

    public final Object q(boolean z, qf7 qf7Var, nq4 nq4Var) {
        th5 th5Var = this.e;
        if (th5Var == null) {
            th5Var = null;
        }
        return ((fe4) th5Var.f).h(z, qf7Var, nq4Var);
    }
}
