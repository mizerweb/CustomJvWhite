package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y97 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga7 b;
    public final /* synthetic */ aec c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ y97(ga7 ga7Var, aec aecVar, boolean z, int i) {
        this.a = i;
        this.b = ga7Var;
        this.c = aecVar;
        this.d = z;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        boolean z = this.d;
        aec aecVar = this.c;
        ga7 ga7Var = this.b;
        switch (i) {
            case 0:
                Iterator it = ga7Var.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).j(aecVar, z);
                }
                break;
            default:
                Iterator it2 = ga7Var.b.iterator();
                while (it2.hasNext()) {
                    ((xdc) it2.next()).m(aecVar, z);
                }
                break;
        }
        return sbiVar;
    }
}
