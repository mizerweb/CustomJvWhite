package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class owg implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qwg b;
    public final /* synthetic */ qxe c;

    public /* synthetic */ owg(qwg qwgVar, qxe qxeVar, int i) {
        this.a = i;
        this.b = qwgVar;
        this.c = qxeVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        qxe qxeVar = this.c;
        qwg qwgVar = this.b;
        vi9 vi9Var = (vi9) obj;
        switch (i) {
            case 0:
                qwgVar.c(qxeVar, vi9Var);
                break;
            case 1:
                qwgVar.d(qxeVar, vi9Var);
                break;
            case 2:
                qwgVar.a(qxeVar, vi9Var);
                break;
            case 3:
                qwgVar.e(qxeVar, vi9Var);
                break;
            default:
                qwgVar.b(qxeVar, vi9Var);
                break;
        }
        return sbiVar;
    }
}
