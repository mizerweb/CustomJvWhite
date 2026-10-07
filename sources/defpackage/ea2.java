package defpackage;

import android.os.Build;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public class ea2 implements sb5 {
    public final wsc a;
    public final osc b;
    public final svj c;
    public final af7 d;
    public final g19 e;
    public final et3 f;
    public boolean g;
    public boolean h;
    public final da2 i;
    public String j;

    public ea2(wsc wscVar, osc oscVar, svj svjVar, af7 af7Var, g19 g19Var, et3 et3Var) {
        this.a = wscVar;
        this.b = oscVar;
        this.c = svjVar;
        this.d = af7Var;
        this.e = g19Var;
        this.f = et3Var;
        da2 da2Var = new da2();
        this.i = da2Var;
        this.j = "ALL_GRANTED";
        g19Var.f().a(this);
        e9i.j0(n1g.v(new fz6(oscVar.g, new qn6(this, (lq4) null, 9), 3), da2Var.b, n09.e), tre.d0(g19Var));
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 29 || this.a.b.a()) {
            return;
        }
        String name = getClass().getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(hashCode(), "Request fsi: "), null);
            }
        }
        wsc wscVar = this.a;
        svj svjVar = this.c;
        wscVar.getClass();
        svjVar.a(wsc.q, 180, R.string.permission_fsi_request, R.string.permission_fsi_request_rationale, R.string.permissions_fsi_request_positive_button, new jsc(R.drawable.calls_avd));
        this.j = "NEED_FSI";
    }

    public void b() {
        if (this.a.e()) {
            a();
        } else {
            String name = getClass().getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, zo5.h(hashCode(), "Request post notification: "), null);
                }
            }
            this.a.j(this.c, true);
            this.j = "NEED_POST_NOTIFICATION";
        }
        ((xb9) this.f).i0(0);
        this.b.b(true);
    }

    public final void c() {
        String name = getClass().getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(hashCode(), "delayExecution: "), null);
            }
        }
        this.h = true;
        this.i.b.g(n09.d);
    }

    public String d() {
        wsc wscVar = this.a;
        if (wscVar.e()) {
            return !wscVar.b.a() ? "NEED_FSI" : "ALL_GRANTED";
        }
        return "NEED_POST_NOTIFICATION";
    }

    public void e(int i) {
        if (i == 177 && this.a.e()) {
            a();
        }
    }

    public final void f() {
        je9 je9Var = je9.d;
        String name = getClass().getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "requestPermissionOnResume: shouldRequestOnResume " + this.g + " " + hashCode(), null);
        }
        osc oscVar = this.b;
        if (oscVar.f) {
            gm0.Y(osc.class.getName(), "Early return in initialize cuz of isInitialized");
        } else {
            oscVar.f = true;
            String name2 = osc.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, "Start permission timer on init", null);
            }
            oscVar.e = yab.i0((wmi) oscVar.c.getValue(), null, 0, new nsc(oscVar, null), 3);
        }
        if (this.g || !(cqk.d(this.j, "ALL_GRANTED") || cqk.d(this.j, d()))) {
            g();
        }
    }

    public final void g() {
        je9 je9Var = je9.d;
        String name = getClass().getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, zo5.h(hashCode(), "requestPermissionsIfNeeded: "), null);
        }
        if (((Boolean) this.d.invoke()).booleanValue()) {
            String name2 = getClass().getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, zo5.h(hashCode(), "forbidRequest: "), null);
            }
            this.b.b(false);
            return;
        }
        if (this.e.f().d.a(n09.e)) {
            b();
            this.g = false;
            return;
        }
        String name3 = getClass().getName();
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, name3, zo5.h(hashCode(), "Host not in resumed state: "), null);
        }
        this.g = true;
    }

    public final void h() {
        String name = getClass().getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(hashCode(), "resumeExecution: "), null);
            }
        }
        if (this.h) {
            n09 n09Var = this.e.f().d;
            n09 n09Var2 = n09.e;
            if (n09Var.a(n09Var2)) {
                this.i.b.g(n09Var2);
                f();
            }
        }
        this.h = false;
    }

    @Override // defpackage.sb5
    public final void onDestroy(g19 g19Var) {
        g19Var.f().f(this);
    }

    @Override // defpackage.sb5
    public final void onPause(g19 g19Var) {
        this.i.b.g(n09.d);
    }

    @Override // defpackage.sb5
    public final void onResume(g19 g19Var) {
        if (this.h) {
            gm0.Y(getClass().getName(), "Early return in onResume cuz of executionDelayed");
        } else {
            this.i.b.g(n09.e);
            f();
        }
    }
}
