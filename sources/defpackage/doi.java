package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class doi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ gpi g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ doi(gpi gpiVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = gpiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        gpi gpiVar = this.g;
        switch (i) {
            case 0:
                doi doiVar = new doi(gpiVar, lq4Var, 0);
                doiVar.f = ((Boolean) obj).booleanValue();
                return doiVar;
            default:
                doi doiVar2 = new doi(gpiVar, lq4Var, 1);
                doiVar2.f = ((Boolean) obj).booleanValue();
                return doiVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((doi) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((doi) create(bool, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                boolean z = this.f;
                ch3.d0(obj);
                gpi gpiVar = this.g;
                if (z) {
                    gpiVar.K(9);
                } else {
                    gpiVar.O(9);
                }
                return sbi.a;
            default:
                boolean z2 = this.f;
                ch3.d0(obj);
                gpi gpiVar2 = this.g;
                if (z2) {
                    String str = gpiVar2.p;
                    a4c a4cVar = gm0.f;
                    lq4 lq4Var = null;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "resume player", null);
                        }
                    }
                    mpi mpiVar = (mpi) gpiVar2.t1.a.getValue();
                    if (!cqk.d(mpiVar, ipi.a)) {
                        int i = 29;
                        if (mpiVar instanceof lpi) {
                            l95 l95Var = gpiVar2.q1;
                            sgg sggVar = (sgg) l95Var.f;
                            if (sggVar == null || !sggVar.isActive()) {
                                l95Var.f = yab.i0((gu4) l95Var.c, null, 0, new i20(l95Var, lq4Var, i), 3);
                            }
                        } else if (mpiVar instanceof jpi) {
                            l95 l95Var2 = gpiVar2.q1;
                            sgg sggVar2 = (sgg) l95Var2.f;
                            if (sggVar2 == null || !sggVar2.isActive()) {
                                l95Var2.f = yab.i0((gu4) l95Var2.c, null, 0, new i20(l95Var2, lq4Var, i), 3);
                            }
                        } else {
                            if (!(mpiVar instanceof kpi)) {
                                ore.o();
                                return null;
                            }
                            a8j.x(gpiVar2.r1, cqi.a);
                        }
                    }
                } else {
                    px8 px8Var = gpi.B1;
                    gpiVar2.L();
                }
                return sbi.a;
        }
    }
}
