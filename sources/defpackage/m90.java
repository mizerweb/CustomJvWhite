package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m90 {
    public final w7b a;
    public final w8g b;
    public final pzf c;
    public final q8e d;
    public final ny8 e;
    public boolean f;
    public Long g;
    public final k90 h;
    public final l90 i;

    public m90(w7b w7bVar, w8g w8gVar, dq4 dq4Var, ny8 ny8Var) {
        this.a = w7bVar;
        this.b = w8gVar;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 5);
        this.c = pzfVarB;
        this.d = new q8e(pzfVarB);
        this.e = ny8Var;
        xb9 xb9Var = (xb9) ((et3) ny8Var.getValue());
        boolean zBooleanValue = ((Boolean) xb9Var.F0.m(xb9Var, xb9.g1[22])).booleanValue();
        this.f = zBooleanValue;
        k90 k90Var = new k90(0, this);
        this.h = k90Var;
        l90 l90Var = new l90(this);
        this.i = l90Var;
        if (zBooleanValue) {
            return;
        }
        w7bVar.a(k90Var);
        w8gVar.get().q0(l90Var);
        vd7.B(dq4Var.a).Y(new g3(3, this));
    }

    public final void a() {
        if (this.g == null || this.f) {
            gm0.Y(m90.class.getName(), "Early return in onboardingEnded cuz of currentMediaId == null || isOnboardingComplete");
            return;
        }
        this.f = true;
        xb9 xb9Var = (xb9) ((et3) this.e.getValue());
        xb9Var.F0.B(xb9Var, xb9.g1[22], Boolean.TRUE);
    }
}
