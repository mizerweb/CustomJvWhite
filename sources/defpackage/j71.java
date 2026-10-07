package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j71 implements s25 {
    public j6g a;
    public i1m c;
    public boolean e;
    public s25 f;
    public int g;
    public final kq6 b = new kq6(0);
    public w71 d = w71.O;

    @Override // defpackage.s25
    /* JADX INFO: renamed from: b */
    public final k71 a() {
        s25 s25Var = this.f;
        return d(s25Var != null ? s25Var.a() : null, this.g, 0);
    }

    public final k71 c() {
        s25 s25Var = this.f;
        return d(s25Var != null ? s25Var.a() : null, this.g | 1, -4000);
    }

    public final k71 d(u25 u25Var, int i, int i2) {
        i71 i71Var;
        j6g j6gVar = this.a;
        j6gVar.getClass();
        if (this.e || u25Var == null) {
            i71Var = null;
        } else {
            i1m i1mVar = this.c;
            if (i1mVar != null) {
                j6g j6gVar2 = (j6g) i1mVar.a;
                j6gVar2.getClass();
                i71Var = new i71(j6gVar2);
            } else {
                i71Var = new i71(j6gVar);
            }
        }
        return new k71(j6gVar, u25Var, this.b.a(), i71Var, this.d, i, i2, null);
    }

    public final void e(j6g j6gVar) {
        this.a = j6gVar;
    }

    public final void f(i1m i1mVar) {
        this.c = i1mVar;
        this.e = i1mVar == null;
    }

    public final void g() {
        this.g = 2;
    }

    public final void h(s25 s25Var) {
        this.f = s25Var;
    }
}
