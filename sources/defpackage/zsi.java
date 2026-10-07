package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewStub;

/* JADX INFO: loaded from: classes4.dex */
public final class zsi extends t8j implements er1 {
    public final y8j a;
    public final ViewStub b;
    public final xd1 c;
    public final mr1 d;
    public final m e;
    public final xy1 f;
    public int h;
    public boolean i;
    public boolean g = true;
    public final String j = zsi.class.getName();

    public zsi(y8j y8jVar, ViewStub viewStub, xd1 xd1Var, mr1 mr1Var, m mVar, xy1 xy1Var) {
        this.a = y8jVar;
        this.b = viewStub;
        this.c = xd1Var;
        this.d = mr1Var;
        this.e = mVar;
        this.f = xy1Var;
    }

    @Override // defpackage.er1
    public final boolean a(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.er1
    public final boolean b(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.er1
    public final void c() {
    }

    @Override // defpackage.er1
    public final void d() {
        this.a.j(this);
    }

    @Override // defpackage.er1
    public final boolean e() {
        return false;
    }

    @Override // defpackage.er1
    public final void g() {
        this.a.e(this);
    }

    @Override // defpackage.t8j
    public final void h(int i) {
        this.g = i == 0;
    }

    @Override // defpackage.t8j
    public final void i(int i, float f, int i2) {
        if (f == 0.0f) {
            this.h = i;
        }
        int iL = this.d.l() - 1;
        int i3 = this.h;
        ViewStub viewStub = this.b;
        xd1 xd1Var = this.c;
        if (iL != i3) {
            if (n7j.n(viewStub)) {
                xd1Var.setVisibility(8);
            }
            this.i = false;
            return;
        }
        if (!n7j.n(viewStub)) {
            n7j.m(viewStub, xd1Var, null);
        }
        boolean z = this.h > i;
        if (z) {
            f = 1.0f - f;
        }
        double d = f;
        if (0.1d > d || d > 0.6d) {
            if (0.6d <= d && d <= 0.99d && !this.i) {
                this.i = true;
                int i4 = Build.VERSION.SDK_INT;
                y8j y8jVar = this.a;
                if (i4 >= 30) {
                    p0m.a(y8jVar, lt7.GESTURE_START);
                }
                int i5 = this.h;
                y8jVar.h(z ? i5 - 1 : i5 + 1, true);
            } else if (n7j.n(viewStub)) {
                xd1Var.setVisibility(8);
            }
        } else if (xd1Var.getVisibility() != 0) {
            isk.d(this.c, true, 0L, null, 6);
        }
        xd1Var.setTranslationY((((Number) this.f.invoke()).floatValue() - i2) + (yl5.d().getDisplayMetrics().density * (-50.0f)));
        xd1Var.a(f);
    }

    @Override // defpackage.er1
    public final boolean isIdle() {
        return this.g;
    }

    @Override // defpackage.t8j
    public final void j(int i) {
        lr1 lr1Var;
        x7j x7jVar;
        boolean z = this.a.r;
        String str = this.j;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "viewpager position changed position=" + i + " isUserInputEnabled=" + z, null);
            }
        }
        if (z && (lr1Var = (lr1) this.d.J(i)) != null && (x7jVar = lr1Var.a) != x7j.b) {
            this.e.invoke(x7jVar);
        }
        this.a.setUserInputEnabled(true);
    }
}
