package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nkc extends ux8 implements tf7 {
    public final /* synthetic */ okc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkc(okc okcVar) {
        super(3);
        this.a = okcVar;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        br4 br4Var = (br4) obj;
        gr4 gr4Var = (gr4) obj2;
        hr4 hr4Var = (hr4) obj3;
        okc okcVar = this.a;
        if (okcVar.a != null) {
            okc.a(okcVar, br4Var, br4Var, gr4Var, hr4Var);
        }
        return sbi.a;
    }
}
