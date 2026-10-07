package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q4d extends na7 {
    public final tsh f;

    public q4d(ush ushVar) {
        super(ushVar);
        this.f = new tsh();
    }

    @Override // defpackage.na7, defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        ush ushVar = this.e;
        rsh rshVarF = ushVar.f(i, rshVar, z);
        if (ushVar.m(rshVarF.c, this.f, 0L).a()) {
            rshVarF.i(rshVar.a, rshVar.b, rshVar.c, rshVar.d, rshVar.e, fa.f, true);
            return rshVarF;
        }
        rshVarF.f = true;
        return rshVarF;
    }
}
