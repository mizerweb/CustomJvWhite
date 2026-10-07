package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jjh extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjh(ljh ljhVar, Throwable th, int i) {
        super(1);
        this.a = i;
        this.b = th;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Throwable th = this.b;
        switch (i) {
            case 0:
                t64 t64Var = (t64) obj;
                ljh.f(t64Var.b, new kr0(t64Var, 7, th));
                break;
            default:
                stb stbVar = ((o89) obj).b;
                if (stbVar != null) {
                    ljh.f(null, new ijh(stbVar, th, 1));
                }
                break;
        }
        return sbiVar;
    }
}
