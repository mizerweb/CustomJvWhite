package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hcg implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ icg b;
    public final /* synthetic */ kcg c;

    public /* synthetic */ hcg(icg icgVar, kcg kcgVar, int i) {
        this.a = i;
        this.b = icgVar;
        this.c = kcgVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        kcg kcgVar = this.c;
        icg icgVar = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                icgVar.c.d(qxeVar, kcgVar);
                break;
            default:
                icgVar.c.d(qxeVar, kcgVar);
                break;
        }
        return sbiVar;
    }
}
