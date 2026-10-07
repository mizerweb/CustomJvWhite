package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zi7 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ej7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi7(ej7 ej7Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = ej7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ej7 ej7Var = this.g;
        switch (i) {
            case 0:
                zi7 zi7Var = new zi7(ej7Var, lq4Var, 0);
                zi7Var.f = obj;
                return zi7Var;
            default:
                zi7 zi7Var2 = new zi7(ej7Var, lq4Var, 1);
                zi7Var2.f = obj;
                return zi7Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((zi7) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((zi7) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        ej7 ej7Var = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ylc ylcVar = (ylc) obj2;
                ch3.d0(obj);
                nh7 nh7Var = (nh7) ylcVar.a;
                List list = (List) ylcVar.b;
                gm0.n("ej7", "got album and items, items size = " + list.size());
                mjg mjgVar = ej7Var.q;
                Boolean bool = Boolean.FALSE;
                mjgVar.getClass();
                mjgVar.j(null, bool);
                ej7Var.s.setValue(nh7Var);
                mjg mjgVar2 = ej7Var.n;
                mjgVar2.getClass();
                mjgVar2.j(null, list);
                break;
            default:
                ch3.d0(obj);
                ej7Var.l.setValue((List) obj2);
                break;
        }
        return sbiVar;
    }
}
