package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q5e implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5e b;
    public final /* synthetic */ qxe c;

    public /* synthetic */ q5e(r5e r5eVar, qxe qxeVar, int i) {
        this.a = i;
        this.b = r5eVar;
        this.c = qxeVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        qxe qxeVar = this.c;
        r5e r5eVar = this.b;
        mw mwVar = (mw) obj;
        switch (i) {
            case 0:
                r5eVar.a(qxeVar, mwVar);
                break;
            default:
                r5eVar.b(qxeVar, mwVar);
                break;
        }
        return sbiVar;
    }
}
