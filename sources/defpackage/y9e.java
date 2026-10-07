package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y9e implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aae b;
    public final /* synthetic */ List c;

    public /* synthetic */ y9e(aae aaeVar, List list, int i) {
        this.a = i;
        this.b = aaeVar;
        this.c = list;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        List list = this.c;
        aae aaeVar = this.b;
        qxe qxeVar = (qxe) obj;
        switch (i) {
            case 0:
                aaeVar.b.c(qxeVar, list);
                break;
            default:
                aaeVar.c.H(qxeVar, list);
                break;
        }
        return sbiVar;
    }
}
