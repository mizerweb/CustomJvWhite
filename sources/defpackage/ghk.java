package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ghk extends ux8 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu4 b;
    public final /* synthetic */ phk c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ghk(gu4 gu4Var, phk phkVar, String str, int i) {
        super(1);
        this.a = i;
        this.b = gu4Var;
        this.c = phkVar;
        this.d = str;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = this.b;
        switch (i) {
            case 0:
                yab.i0(gu4Var, null, 0, new xgk((fjh) obj, null, this.c, this.d, 0), 3);
                break;
            default:
                yab.i0(gu4Var, null, 0, new xgk((fjh) obj, null, this.c, this.d, 1), 3);
                break;
        }
        return sbiVar;
    }
}
