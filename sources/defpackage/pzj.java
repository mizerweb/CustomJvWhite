package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pzj implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qzj b;
    public final /* synthetic */ qxe c;

    public /* synthetic */ pzj(qzj qzjVar, qxe qxeVar, int i) {
        this.a = i;
        this.b = qzjVar;
        this.c = qxeVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        qxe qxeVar = this.c;
        qzj qzjVar = this.b;
        mw mwVar = (mw) obj;
        switch (i) {
            case 0:
                qzjVar.a(qxeVar, mwVar);
                break;
            default:
                qzjVar.b(qxeVar, mwVar);
                break;
        }
        return sbiVar;
    }
}
