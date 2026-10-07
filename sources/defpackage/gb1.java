package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gb1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hb1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb1(hb1 hb1Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = hb1Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        hb1 hb1Var = this.g;
        switch (i) {
            case 0:
                gb1 gb1Var = new gb1(hb1Var, lq4Var, 0);
                gb1Var.f = obj;
                return gb1Var;
            default:
                gb1 gb1Var2 = new gb1(hb1Var, lq4Var, 1);
                gb1Var2.f = obj;
                return gb1Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((gb1) create((xd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((gb1) create((gc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hb1 hb1Var = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                xd xdVar = (xd) obj2;
                ch3.d0(obj);
                py1 py1Var = null;
                if (xdVar instanceof ld) {
                    ld ldVar = (ld) xdVar;
                    if (!ldVar.a) {
                        py1Var = ry1.x;
                    } else if (!ldVar.b) {
                        py1Var = ry1.w;
                    }
                } else if (xdVar instanceof nd) {
                    nd ndVar = (nd) xdVar;
                    if (!ndVar.a) {
                        py1Var = ry1.v;
                    } else if (!ndVar.b) {
                        py1Var = ry1.u;
                    }
                } else if (xdVar instanceof rd) {
                    rd rdVar = (rd) xdVar;
                    if (!rdVar.a) {
                        py1Var = ry1.t;
                    } else if (!rdVar.b) {
                        py1Var = ry1.s;
                    }
                } else if (xdVar instanceof qd) {
                    if (!((qd) xdVar).a) {
                        py1Var = ry1.y;
                    }
                } else if (xdVar instanceof vd) {
                    py1Var = ((vd) xdVar).a ? ry1.B : ry1.C;
                }
                if (py1Var != null) {
                    a8j.x(hb1Var.i, py1Var);
                }
                break;
            default:
                ch3.d0(obj);
                hb1Var.C((gc) obj2);
                break;
        }
        return sbiVar;
    }
}
