package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ozj implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qzj b;
    public final /* synthetic */ mzj c;

    public /* synthetic */ ozj(qzj qzjVar, mzj mzjVar, int i) {
        this.a = i;
        this.b = qzjVar;
        this.c = mzjVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        mzj mzjVar = this.c;
        qzj qzjVar = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                qzjVar.b.d(qxeVar, mzjVar);
                break;
            default:
                qzjVar.c.G(qxeVar, mzjVar);
                break;
        }
        return sbiVar;
    }
}
