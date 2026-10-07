package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x97 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga7 b;
    public final /* synthetic */ aec c;
    public final /* synthetic */ int d;

    public /* synthetic */ x97(ga7 ga7Var, aec aecVar, int i, int i2) {
        this.a = i2;
        this.b = ga7Var;
        this.c = aecVar;
        this.d = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = this.d;
        aec aecVar = this.c;
        ga7 ga7Var = this.b;
        switch (i) {
            case 0:
                Iterator it = ga7Var.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).n(aecVar, i2);
                }
                break;
            default:
                Iterator it2 = ga7Var.b.iterator();
                while (it2.hasNext()) {
                    ((xdc) it2.next()).h(aecVar, i2);
                }
                break;
        }
        return sbiVar;
    }
}
