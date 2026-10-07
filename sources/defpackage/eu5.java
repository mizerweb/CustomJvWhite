package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class eu5 {
    public du5 d;
    public final cu5 f;
    public boolean a = false;
    public boolean b = false;
    public boolean c = true;
    public au5 e = null;

    public eu5(wj7 wj7Var) {
        this.f = cu5.c ? new cu5() : cu5.b;
        if (wj7Var != null) {
            j(wj7Var);
        }
    }

    public final void a() {
        if (this.a) {
            return;
        }
        cu5 cu5Var = this.f;
        bu5 bu5Var = bu5.g;
        cu5Var.a(bu5Var);
        this.a = true;
        au5 au5Var = this.e;
        if (au5Var != null) {
            u0 u0Var = (u0) au5Var;
            if (u0Var.h != null) {
                qe7.v();
                if (pj6.a.h(2)) {
                    pj6.f(u0.v, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(u0Var)), u0Var.j, u0Var.m ? "request already submitted" : "request needs submit");
                }
                u0Var.a.a(bu5Var);
                u0Var.h.getClass();
                u0Var.b.b(u0Var);
                u0Var.l = true;
                if (!u0Var.m) {
                    u0Var.r();
                }
                qe7.v();
            }
        }
    }

    public final void b() {
        if (this.b && this.c) {
            a();
        } else {
            c();
        }
    }

    public final void c() {
        if (this.a) {
            cu5 cu5Var = this.f;
            bu5 bu5Var = bu5.h;
            cu5Var.a(bu5Var);
            this.a = false;
            if (e()) {
                u0 u0Var = (u0) this.e;
                u0Var.getClass();
                qe7.v();
                if (pj6.a.h(2)) {
                    pj6.e(u0.v, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(u0Var)), u0Var.j);
                }
                u0Var.a.a(bu5Var);
                u0Var.l = false;
                ag5 ag5Var = u0Var.b;
                ag5Var.getClass();
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    synchronized (ag5Var.a) {
                        try {
                            if (!((ArrayList) ag5Var.c).contains(u0Var)) {
                                ((ArrayList) ag5Var.c).add(u0Var);
                                boolean z = ((ArrayList) ag5Var.c).size() == 1;
                                if (z) {
                                    ((Handler) ag5Var.b).post((zn) ag5Var.e);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    u0Var.m();
                }
                qe7.v();
            }
        }
    }

    public final ote d() {
        du5 du5Var = this.d;
        if (du5Var == null) {
            return null;
        }
        return ((wj7) du5Var).d;
    }

    public final boolean e() {
        au5 au5Var = this.e;
        return au5Var != null && ((u0) au5Var).h == this.d;
    }

    public final void f() {
        this.f.a(bu5.o);
        this.b = true;
        b();
    }

    public final void g() {
        this.f.a(bu5.p);
        this.b = false;
        b();
    }

    public final void h(boolean z) {
        if (this.c == z) {
            return;
        }
        this.f.a(z ? bu5.q : bu5.r);
        this.c = z;
        b();
    }

    public final void i(au5 au5Var) {
        boolean z = this.a;
        if (z) {
            c();
        }
        boolean zE = e();
        cu5 cu5Var = this.f;
        if (zE) {
            cu5Var.a(bu5.d);
            ((s1d) this.e).w(null);
        }
        this.e = au5Var;
        if (au5Var != null) {
            cu5Var.a(bu5.c);
            ((s1d) this.e).w(this.d);
        } else {
            cu5Var.a(bu5.e);
        }
        if (z) {
            a();
        }
    }

    public final void j(du5 du5Var) {
        this.f.a(bu5.a);
        boolean zE = e();
        ote oteVarD = d();
        if (oteVarD != null) {
            oteVarD.f = null;
        }
        du5Var.getClass();
        this.d = du5Var;
        ote oteVar = ((wj7) du5Var).d;
        h(oteVar == null || oteVar.isVisible());
        ote oteVarD2 = d();
        if (oteVarD2 != null) {
            oteVarD2.f = this;
        }
        if (zE) {
            ((s1d) this.e).w(du5Var);
        }
    }

    public final String toString() {
        dc9 dc9VarC = qdl.c(this);
        dc9VarC.w("controllerAttached", this.a);
        dc9VarC.w("holderAttached", this.b);
        dc9VarC.w("drawableVisible", this.c);
        dc9VarC.v(this.f.a.toString(), "events");
        return dc9VarC.toString();
    }
}
