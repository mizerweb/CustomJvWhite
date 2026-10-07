package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cfd implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dfd b;

    public /* synthetic */ cfd(dfd dfdVar) {
        this.a = 0;
        this.b = dfdVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        dfd dfdVar = this.b;
        switch (i) {
            case 0:
                Iterator it = dfdVar.g.iterator();
                while (it.hasNext()) {
                    ((g3j) it.next()).getClass();
                }
                break;
            case 1:
                Iterator it2 = dfdVar.g.iterator();
                while (it2.hasNext()) {
                    ((g3j) it2.next()).getClass();
                }
                break;
            case 2:
                Iterator it3 = dfdVar.g.iterator();
                while (it3.hasNext()) {
                    ((g3j) it3.next()).getClass();
                }
                break;
            default:
                Iterator it4 = dfdVar.g.iterator();
                while (it4.hasNext()) {
                    ((g3j) it4.next()).getClass();
                }
                break;
        }
        return sbiVar;
    }

    public /* synthetic */ cfd(dfd dfdVar, ym5 ym5Var, long j, long j2, int i) {
        this.a = i;
        this.b = dfdVar;
    }

    public /* synthetic */ cfd(dfd dfdVar, ym5 ym5Var, Exception exc) {
        this.a = 1;
        this.b = dfdVar;
    }
}
