package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k67 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n67 b;
    public final /* synthetic */ aac c;

    public /* synthetic */ k67(n67 n67Var, aac aacVar, int i) {
        this.a = i;
        this.b = n67Var;
        this.c = aacVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        aac aacVar = this.c;
        n67 n67Var = this.b;
        switch (i) {
            case 0:
                List list = n67Var.m;
                if (list != null) {
                    aacVar.j();
                    n67Var.p.b(list, null);
                }
                n67Var.m = null;
                break;
            default:
                pz4 pz4Var = n67Var.d;
                if (pz4Var != null) {
                    aacVar.k(pz4Var);
                }
                n67Var.d = null;
                n67Var.e = null;
                n67Var.j = null;
                d20 d20Var = n67Var.p;
                n67Var.m = d20Var.f;
                d20Var.b(null, null);
                break;
        }
        return sbiVar;
    }
}
