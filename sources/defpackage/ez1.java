package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ez1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ h02 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez1(h02 h02Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = h02Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        h02 h02Var = this.g;
        switch (i) {
            case 0:
                ez1 ez1Var = new ez1(h02Var, lq4Var, 0);
                ez1Var.f = obj;
                return ez1Var;
            case 1:
                ez1 ez1Var2 = new ez1(h02Var, lq4Var, 1);
                ez1Var2.f = obj;
                return ez1Var2;
            case 2:
                ez1 ez1Var3 = new ez1(h02Var, lq4Var, 2);
                ez1Var3.f = obj;
                return ez1Var3;
            case 3:
                ez1 ez1Var4 = new ez1(lq4Var, h02Var, 3);
                ez1Var4.f = obj;
                return ez1Var4;
            case 4:
                ez1 ez1Var5 = new ez1(lq4Var, h02Var, 4);
                ez1Var5.f = obj;
                return ez1Var5;
            case 5:
                ez1 ez1Var6 = new ez1(lq4Var, h02Var, 5);
                ez1Var6.f = obj;
                return ez1Var6;
            default:
                ez1 ez1Var7 = new ez1(h02Var, lq4Var, 6);
                ez1Var7.f = obj;
                return ez1Var7;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((ez1) create((rbb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ez1) create((u4f) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((ez1) create((xd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((ez1) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((ez1) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((ez1) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((ez1) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.e;
        sbi sbiVar = sbi.a;
        h02 h02Var = this.g;
        switch (i) {
            case 0:
                rbb rbbVar = (rbb) this.f;
                ch3.d0(obj);
                a8j.x(h02Var.G, rbbVar);
                return sbiVar;
            case 1:
                u4f u4fVar = (u4f) this.f;
                ch3.d0(obj);
                int iOrdinal = u4fVar.ordinal();
                if (iOrdinal == 0) {
                    return sbiVar;
                }
                if (iOrdinal == 1) {
                    a8j.x(h02Var.G, ry1.r);
                    return sbiVar;
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    return sbiVar;
                }
                ore.o();
                return null;
            case 2:
                ic6 ic6Var = h02Var.G;
                xd xdVar = (xd) this.f;
                ch3.d0(obj);
                if (xdVar instanceof nd) {
                    a8j.x(ic6Var, ry1.b);
                } else if (xdVar instanceof ld) {
                    a8j.x(ic6Var, ry1.c);
                } else if (xdVar instanceof kd) {
                    a8j.x(ic6Var, ry1.d);
                } else if (xdVar instanceof rd) {
                    a8j.x(ic6Var, ry1.e);
                } else if (xdVar instanceof jd) {
                    a8j.x(ic6Var, ry1.f);
                } else if (xdVar instanceof gd) {
                    a8j.x(ic6Var, ry1.g);
                } else if (xdVar instanceof fd) {
                    a8j.x(ic6Var, ry1.h);
                } else if (xdVar instanceof od) {
                    a8j.x(ic6Var, ry1.i);
                } else if (xdVar instanceof md) {
                    a8j.x(ic6Var, ry1.j);
                } else if (xdVar instanceof sd) {
                    a8j.x(ic6Var, ry1.k);
                } else if (xdVar instanceof td) {
                    a8j.x(ic6Var, ry1.l);
                } else if (xdVar instanceof wd) {
                    a8j.x(ic6Var, ry1.m);
                } else if (xdVar instanceof pd) {
                    a8j.x(ic6Var, ry1.n);
                } else if (xdVar instanceof ud) {
                    a8j.x(ic6Var, ry1.o);
                } else if (xdVar instanceof hd) {
                    a8j.x(ic6Var, ry1.p);
                } else if (xdVar instanceof id) {
                    a8j.x(ic6Var, ry1.A);
                } else if (xdVar instanceof vd) {
                    a8j.x(ic6Var, ((vd) xdVar).a ? ry1.B : ry1.C);
                }
                return sbiVar;
            case 3:
                Object obj2 = this.f;
                ch3.d0(obj);
                mjg mjgVar = h02Var.s;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, new ao1(false, null, false, false, 16777215)));
                return sbiVar;
            case 4:
                Object obj3 = this.f;
                ch3.d0(obj);
                ((Boolean) obj3).getClass();
                mjg mjgVar2 = h02Var.s;
                do {
                    value2 = mjgVar2.getValue();
                } while (!mjgVar2.h(value2, h02Var.q.b((ao1) value2)));
                return sbiVar;
            case 5:
                Object obj4 = this.f;
                ch3.d0(obj);
                ((Boolean) obj4).getClass();
                mjg mjgVar3 = h02Var.s;
                do {
                    value3 = mjgVar3.getValue();
                } while (!mjgVar3.h(value3, h02Var.q.b((ao1) value3)));
                return sbiVar;
            default:
                ylc ylcVar = (ylc) this.f;
                ch3.d0(obj);
                x02 x02Var = (x02) ylcVar.a;
                x02 x02Var2 = (x02) ylcVar.b;
                if (r5h.X0(x02Var.s()) && x02Var2 != null && ((Boolean) x02Var2.isHeldByMe().getValue()).booleanValue() && !h02Var.I().h()) {
                    mjg mjgVar4 = h02Var.w;
                    do {
                        value4 = mjgVar4.getValue();
                    } while (!mjgVar4.h(value4, new pf1("")));
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez1(lq4 lq4Var, h02 h02Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = h02Var;
    }
}
