package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xqe implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bre b;
    public final /* synthetic */ List c;

    public /* synthetic */ xqe(bre breVar, List list, int i) {
        this.a = i;
        this.b = breVar;
        this.c = list;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        List list = this.c;
        bre breVar = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                breVar.b.c(qxeVar, list);
                break;
            default:
                breVar.c.c(qxeVar, list);
                break;
        }
        return sbiVar;
    }
}
