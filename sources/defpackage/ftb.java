package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ftb extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ltb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ftb(ltb ltbVar, int i) {
        super(0);
        this.a = i;
        this.b = ltbVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ltb ltbVar = this.b;
        switch (i) {
            case 0:
                ltbVar.d();
                break;
            case 1:
                ltbVar.c();
                break;
            default:
                ltbVar.d();
                break;
        }
        return sbiVar;
    }
}
