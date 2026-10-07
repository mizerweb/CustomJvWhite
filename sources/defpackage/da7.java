package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class da7 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ga7 b;
    public final /* synthetic */ ldc c;
    public final /* synthetic */ t4j d;

    public /* synthetic */ da7(ga7 ga7Var, ldc ldcVar, t4j t4jVar, int i) {
        this.a = i;
        this.b = ga7Var;
        this.c = ldcVar;
        this.d = t4jVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        t4j t4jVar = this.d;
        ldc ldcVar = this.c;
        ga7 ga7Var = this.b;
        switch (i) {
            case 0:
                Iterator it = ga7Var.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).f(ldcVar, t4jVar);
                }
                break;
            default:
                Iterator it2 = ga7Var.b.iterator();
                while (it2.hasNext()) {
                    ((xdc) it2.next()).u(ldcVar, t4jVar);
                }
                break;
        }
        return sbiVar;
    }
}
