package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gff extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hff g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gff(hff hffVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = hffVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        hff hffVar = this.g;
        switch (i) {
            case 0:
                gff gffVar = new gff(hffVar, lq4Var, 0);
                gffVar.f = obj;
                return gffVar;
            default:
                gff gffVar2 = new gff(hffVar, lq4Var, 1);
                gffVar2.f = obj;
                return gffVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((gff) create((yh7) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((gff) create((uff) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hff hffVar = this.g;
        switch (i) {
            case 0:
                yh7 yh7Var = (yh7) this.f;
                ch3.d0(obj);
                as9 as9Var = hffVar.d;
                List list = yh7Var.a;
                mjg mjgVar = as9Var.w;
                mjgVar.getClass();
                mjgVar.j(null, list);
                return sbiVar;
            default:
                gi7 gi7Var = hffVar.e;
                uff uffVar = (uff) this.f;
                ch3.d0(obj);
                if (uffVar instanceof qff) {
                    a8j.x(gi7Var.e, new vh7(((qff) uffVar).a));
                } else if (cqk.d(uffVar, pff.a)) {
                    a8j.x(gi7Var.e, th7.a);
                } else if (!(uffVar instanceof tff)) {
                    ore.o();
                    return null;
                }
                return sbiVar;
        }
    }
}
