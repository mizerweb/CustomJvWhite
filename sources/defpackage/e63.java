package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e63 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ l63 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e63(int i, l63 l63Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.f = l63Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        l63 l63Var = this.f;
        switch (i) {
            case 0:
                return new e63(0, l63Var, lq4Var);
            default:
                return new e63(1, l63Var, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((e63) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((e63) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                l63 l63Var = this.f;
                pzf pzfVar = l63Var.A1;
                zv8[] zv8VarArr = l63.O1;
                qy9 qy9VarL = l63Var.L();
                qy9 qy9Var = ((o53) l63Var.u1.a.getValue()).a;
                if ((qy9VarL instanceof py9) && cqk.d(qy9Var, qy9VarL)) {
                    mjg mjgVar = l63Var.C1;
                    Boolean bool = Boolean.TRUE;
                    mjgVar.getClass();
                    mjgVar.j(null, bool);
                    pzfVar.a(bool);
                } else {
                    pzfVar.a(Boolean.FALSE);
                }
                return sbiVar;
            default:
                je9 je9Var = je9.d;
                ch3.d0(obj);
                int i = ((nic) this.f.v1.getValue()).a;
                if (i == 0 || !(i == 2 || i == 1)) {
                    int i2 = sic.d;
                    float fB = dfl.b(2);
                    String str = this.f.p;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Media viewer. New orientation by toggle: landscape, angle: " + fB, null);
                    }
                    mjg mjgVar2 = this.f.v1;
                    nic nicVar = new nic(2, fB);
                    mjgVar2.getClass();
                    mjgVar2.j(null, nicVar);
                } else {
                    int i3 = sic.d;
                    float fB2 = dfl.b(3);
                    String str2 = this.f.p;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "Media viewer. New orientation by toggle: portrait, angle: " + fB2, null);
                    }
                    mjg mjgVar3 = this.f.v1;
                    nic nicVar2 = new nic(3, fB2);
                    mjgVar3.getClass();
                    mjgVar3.j(null, nicVar2);
                }
                return sbi.a;
        }
    }
}
