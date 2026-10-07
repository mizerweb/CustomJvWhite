package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j8b implements aw8 {
    public static final j8b a = new j8b();
    public static final dw b = new dw(ti9.b);

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        i8b i8bVar = (i8b) obj;
        int i = i8bVar.b;
        dw dwVar = b;
        x74 x74VarR = u76Var.r(dwVar, i);
        int i2 = i8bVar.b;
        for (int i3 = 0; i3 < i2; i3++) {
            x74VarR.e(dwVar, i3, i8bVar.b(i3));
        }
        x74VarR.c();
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        i8b i8bVar = new i8b();
        dw dwVar = b;
        v74 v74VarA = r55Var.a(dwVar);
        for (int iV = v74VarA.v(dwVar); iV != -1; iV = v74VarA.v(dwVar)) {
            i8bVar.a(v74VarA.q(dwVar, iV));
        }
        v74VarA.j(dwVar);
        return i8bVar;
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
