package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class okf extends ilf {
    public final long l;
    public final long m;
    public final long n;

    public okf(nkf nkfVar) {
        super(nkfVar);
        this.l = nkfVar.h;
        this.m = nkfVar.i;
        this.n = nkfVar.j;
    }

    @Override // defpackage.ilf
    public final rfa C() {
        w60 w60Var;
        sfa sfaVarL = s().l(this.m);
        if (i().N(this.l) != null && sfaVarL != null) {
            c46 c46Var = sfaVarL.n;
            int i = c46Var.i();
            for (int i2 = 0; i2 < i; i2++) {
                e70 e70VarH = c46Var.h(i2);
                if (e70VarH == null) {
                    break;
                }
                o60 o60Var = e70VarH.b;
                boolean zE = e70VarH.e();
                long j = this.n;
                if ((zE && o60Var.i == j) || ((e70VarH.h() && e70VarH.d.a == j) || (((w60Var = e70VarH.f) != null && w60Var.a == j) || (e70VarH.g() && e70VarH.g.a == j)))) {
                    if (e70VarH.e()) {
                        o60 o60Var2 = new o60(o60Var.c());
                        c60 c60VarJ = e70VarH.j();
                        c60VarJ.b = o60Var2;
                        e70VarH = c60VarJ.a();
                    }
                    f70 f70Var = new f70();
                    f70Var.a = Collections.singletonList(e70VarH);
                    c46 c46VarC = f70Var.c();
                    String str = e70VarH.g() ? e70VarH.g.b : null;
                    rfa rfaVar = new rfa();
                    rfaVar.g = str;
                    rfaVar.n = c46VarC;
                    return rfaVar;
                }
            }
        }
        return null;
    }

    @Override // defpackage.ilf
    public final String D() {
        return "ServiceTaskForwardAttachMessage";
    }
}
