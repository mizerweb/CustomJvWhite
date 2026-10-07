package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aje implements mjd {
    public final /* synthetic */ int a;
    public final mjd b;

    public /* synthetic */ aje(mjd mjdVar, int i) {
        this.a = i;
        this.b = mjdVar;
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        int i = this.a;
        mjd mjdVar = this.b;
        switch (i) {
            case 0:
                mjdVar.b(new zie(lq0Var, 0), es0Var);
                break;
            default:
                mjdVar.b(new zie(lq0Var, 1), es0Var);
                break;
        }
    }
}
