package defpackage;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class b99 {
    public static final Object k = new Object();
    public final Object a;
    public final iye b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final zn j;

    public b99() {
        this.a = new Object();
        this.b = new iye();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new zn(9, this);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        tv.S().k.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        ore.k(c0a.o("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(a99 a99Var) {
        if (a99Var.b) {
            if (!a99Var.d()) {
                a99Var.a(false);
                return;
            }
            int i = a99Var.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            a99Var.c = i2;
            a99Var.a.a(this.e);
        }
    }

    public final void c(a99 a99Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (a99Var != null) {
                b(a99Var);
                a99Var = null;
            } else {
                iye iyeVar = this.b;
                iyeVar.getClass();
                fye fyeVar = new fye(iyeVar);
                iyeVar.c.put(fyeVar, Boolean.FALSE);
                while (fyeVar.hasNext()) {
                    b((a99) ((Map.Entry) fyeVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(g19 g19Var, srb srbVar) {
        Object obj;
        a("observe");
        if (g19Var.f().d == n09.a) {
            return;
        }
        z89 z89Var = new z89(this, g19Var, srbVar);
        iye iyeVar = this.b;
        eye eyeVarA = iyeVar.a(srbVar);
        if (eyeVarA != null) {
            obj = eyeVarA.b;
        } else {
            eye eyeVar = new eye(srbVar, z89Var);
            iyeVar.d++;
            eye eyeVar2 = iyeVar.b;
            if (eyeVar2 == null) {
                iyeVar.a = eyeVar;
                iyeVar.b = eyeVar;
            } else {
                eyeVar2.c = eyeVar;
                eyeVar.d = eyeVar2;
                iyeVar.b = eyeVar;
            }
            obj = null;
        }
        a99 a99Var = (a99) obj;
        if (a99Var != null && !a99Var.c(g19Var)) {
            ore.p("Cannot add the same observer with different lifecycles");
        } else {
            if (a99Var != null) {
                return;
            }
            g19Var.f().a(z89Var);
        }
    }

    public final void f(srb srbVar) {
        Object obj;
        a("observeForever");
        y89 y89Var = new y89(this, srbVar);
        iye iyeVar = this.b;
        eye eyeVarA = iyeVar.a(srbVar);
        if (eyeVarA != null) {
            obj = eyeVarA.b;
        } else {
            eye eyeVar = new eye(srbVar, y89Var);
            iyeVar.d++;
            eye eyeVar2 = iyeVar.b;
            if (eyeVar2 == null) {
                iyeVar.a = eyeVar;
                iyeVar.b = eyeVar;
            } else {
                eyeVar2.c = eyeVar;
                eyeVar.d = eyeVar2;
                iyeVar.b = eyeVar;
            }
            obj = null;
        }
        a99 a99Var = (a99) obj;
        if (a99Var instanceof z89) {
            ore.p("Cannot add the same observer with different lifecycles");
        } else {
            if (a99Var != null) {
                return;
            }
            y89Var.a(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            tv.S().T(this.j);
        }
    }

    public void j(srb srbVar) {
        a("removeObserver");
        a99 a99Var = (a99) this.b.b(srbVar);
        if (a99Var == null) {
            return;
        }
        a99Var.b();
        a99Var.a(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public b99(Object obj) {
        this.a = new Object();
        this.b = new iye();
        this.c = 0;
        this.f = k;
        this.j = new zn(9, this);
        this.e = obj;
        this.g = 0;
    }
}
