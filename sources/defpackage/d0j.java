package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class d0j implements c3j {
    public final String a = d0j.class.getName();
    public sgg b;
    public final dq4 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public e3j h;
    public final pzf i;
    public final q8e j;

    public d0j(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        lk9 lk9VarC = ((n0c) ((xhh) ny8Var2.getValue())).c();
        nah nahVarA = wk8.a();
        lk9VarC.getClass();
        this.c = cqk.a(lvb.x0(lk9VarC, nahVarA));
        this.d = ny8Var;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        pzf pzfVarB = e9i.b(1, 0, 2);
        this.i = pzfVarB;
        this.j = new q8e(pzfVarB);
    }

    @Override // defpackage.c3j
    public final void b() {
        l1j l1jVar;
        if (this.h == null || (l1jVar = (l1j) ww3.t1(this.j.a.d())) == null) {
            return;
        }
        this.i.a(l1jVar);
    }

    @Override // defpackage.c3j
    public final void c() {
        l1j l1jVar;
        if (this.h == null || (l1jVar = (l1j) ww3.t1(this.j.a.d())) == null) {
            return;
        }
        l1jVar.h(k1j.b);
        this.i.a(l1jVar);
    }

    @Override // defpackage.c3j
    public final void e() throws IllegalAccessException, InvocationTargetException {
        if (this.h != null) {
            l1j l1jVar = (l1j) ww3.t1(this.j.a.d());
            if (l1jVar != null) {
                l1jVar.h(k1j.b);
                this.i.a(l1jVar);
            }
            e3j e3jVar = this.h;
            if (e3jVar == null) {
                return;
            }
            sgg sggVar = this.b;
            if (sggVar != null) {
                sggVar.b(null);
            }
            this.b = yab.i0(this.c, null, 0, new oli(e3jVar, this, null, 5), 3);
        }
    }

    @Override // defpackage.c3j
    public final void i() throws IllegalAccessException, InvocationTargetException {
        if (this.h != null) {
            l1j l1jVar = (l1j) ww3.t1(this.j.a.d());
            if (l1jVar != null) {
                l1jVar.h(k1j.f);
                this.i.a(l1jVar);
            }
            sgg sggVar = this.b;
            if (sggVar != null) {
                sggVar.b(null);
            }
            this.b = null;
            e3j e3jVar = this.h;
            if (e3jVar != null) {
                e3jVar.clear();
            }
            e3j e3jVar2 = this.h;
            if (e3jVar2 != null) {
                ((w8g) this.d.getValue()).a(e3jVar2);
            }
            this.h = null;
        }
    }

    @Override // defpackage.c3j
    public final void m() throws IllegalAccessException, InvocationTargetException {
        if (this.h != null) {
            l1j l1jVar = (l1j) ww3.t1(this.j.a.d());
            if (l1jVar != null) {
                l1jVar.h(k1j.d);
                this.i.a(l1jVar);
            }
            sgg sggVar = this.b;
            if (sggVar != null) {
                sggVar.b(null);
            }
            this.b = null;
        }
    }

    @Override // defpackage.c3j
    public final void n(float f) {
        e3j e3jVar = this.h;
        if (e3jVar != null) {
            e3jVar.b(f);
        }
    }

    @Override // defpackage.c3j
    public final void p() throws IllegalAccessException, InvocationTargetException {
        if (this.h != null) {
            l1j l1jVar = (l1j) ww3.t1(this.j.a.d());
            if (l1jVar != null) {
                l1jVar.h(k1j.e);
                this.i.a(l1jVar);
            }
            sgg sggVar = this.b;
            if (sggVar != null) {
                sggVar.b(null);
            }
            this.b = null;
            e3j e3jVar = this.h;
            if (e3jVar != null) {
                e3jVar.clear();
            }
            e3j e3jVar2 = this.h;
            if (e3jVar2 != null) {
                ((w8g) this.d.getValue()).a(e3jVar2);
            }
            this.h = null;
        }
    }

    public final void r(float f) {
        l1j l1jVar = (l1j) ww3.t1(this.j.a.d());
        rui ruiVarE = l1jVar != null ? l1jVar.e() : null;
        if (ruiVarE == null) {
            gm0.Y(this.a, "We cannot seek a videoContent because is null");
            return;
        }
        long duration = (long) ((f / 100.0f) * ruiVarE.getDuration());
        e3j e3jVar = this.h;
        if (e3jVar != null) {
            e3jVar.seekTo(duration);
        }
    }
}
