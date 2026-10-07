package defpackage;

import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes.dex */
public final class gi3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;

    public /* synthetic */ gi3(h5 h5Var, int i) {
        this.a = i;
        this.b = h5Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        h5 h5Var = this.b;
        switch (i) {
            case 0:
                ((iv4) h5Var.c(87)).a(null, (IssueKeyException) obj);
                return sbi.a;
            case 1:
                drc drcVar = (drc) obj;
                drcVar.e = (rrc) h5Var.c(8);
                krc krcVar = (krc) h5Var.c(9);
                drcVar.d = krcVar != null ? krcVar.a : null;
                drcVar.f = (exb) h5Var.c(10);
                drcVar.e((zqc) h5Var.c(11));
                drcVar.c();
                drcVar.i = new pig();
                return drcVar;
            case 2:
                drc drcVar2 = (drc) obj;
                drcVar2.e = (rrc) h5Var.c(8);
                krc krcVar2 = (krc) h5Var.c(9);
                drcVar2.d = krcVar2 != null ? krcVar2.a : null;
                drcVar2.f = (exb) h5Var.c(10);
                drcVar2.e((zqc) h5Var.c(11));
                drcVar2.c();
                drcVar2.f(h5Var.a(0));
                return drcVar2;
            case 3:
                drc drcVar3 = (drc) obj;
                drcVar3.e = (rrc) h5Var.c(8);
                krc krcVar3 = (krc) h5Var.c(9);
                drcVar3.d = krcVar3 != null ? krcVar3.a : null;
                drcVar3.f = (exb) h5Var.c(10);
                drcVar3.e((zqc) h5Var.c(11));
                drcVar3.c();
                drcVar3.i = new ng9();
                drcVar3.e((zqc) h5Var.c(14));
                drcVar3.f(h5Var.a(0));
                return drcVar3;
            default:
                drc drcVar4 = (drc) obj;
                drcVar4.e = (rrc) h5Var.c(8);
                krc krcVar4 = (krc) h5Var.c(9);
                drcVar4.d = krcVar4 != null ? krcVar4.a : null;
                drcVar4.f = (exb) h5Var.c(10);
                drcVar4.e((zqc) h5Var.c(11));
                drcVar4.c();
                drcVar4.d(new s03(h5Var.d(0), (rrc) h5Var.c(8), 0));
                drcVar4.f(h5Var.a(0));
                return drcVar4;
        }
    }
}
