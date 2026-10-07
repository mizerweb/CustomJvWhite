package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cxa implements y4a {
    public final ks9 a = new ks9(21, this);
    public final y65 b = new y65();
    public boolean c;
    public final /* synthetic */ dxa d;

    public cxa(dxa dxaVar) {
        this.d = dxaVar;
    }

    @Override // defpackage.y4a
    public final void a(ur0 ur0Var, ush ushVar) {
        dxa dxaVar = this.d;
        dxaVar.d = ushVar;
        if (this.c) {
            return;
        }
        this.c = true;
        u0a u0aVarE = ur0Var.e(new x4a(ushVar.l(0)), this.b, 0L);
        dxaVar.c = u0aVarE;
        u0aVarE.s(this.a, 0L);
    }
}
