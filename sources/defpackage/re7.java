package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class re7 extends usc {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re7(int i, String[] strArr) {
        super(strArr);
        this.f = i;
    }

    @Override // defpackage.usc
    public final ssc f() {
        int i = this.f;
        ssc sscVar = ssc.b;
        ssc sscVar2 = ssc.a;
        ny8 ny8Var = this.b;
        switch (i) {
            case 0:
                return ((wsc) ny8Var.getValue()).b.a() ? sscVar2 : sscVar;
            default:
                return ((wsc) ny8Var.getValue()).e() ? sscVar2 : sscVar;
        }
    }
}
