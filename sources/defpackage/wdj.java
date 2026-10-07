package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wdj implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xdj b;
    public final /* synthetic */ sej c;

    public /* synthetic */ wdj(xdj xdjVar, sej sejVar, int i) {
        this.a = i;
        this.b = xdjVar;
        this.c = sejVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        sej sejVar = this.c;
        xdj xdjVar = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                xdjVar.b.d(qxeVar, sejVar);
                break;
            default:
                xdjVar.c.G(qxeVar, sejVar);
                break;
        }
        return sbiVar;
    }
}
