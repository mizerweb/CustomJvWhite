package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class teb implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xeb b;

    public /* synthetic */ teb(xeb xebVar, int i) {
        this.a = i;
        this.b = xebVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        xeb xebVar = this.b;
        switch (i) {
            case 0:
                a8j.x(xebVar.i, feb.b);
                break;
            default:
                a8j.x(xebVar.i, rt3.b);
                break;
        }
        return sbiVar;
    }
}
