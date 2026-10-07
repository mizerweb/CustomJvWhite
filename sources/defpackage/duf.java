package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class duf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ euf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ duf(euf eufVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = eufVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        euf eufVar = this.f;
        switch (i) {
            case 0:
                return new duf(eufVar, lq4Var, 0);
            default:
                return new duf(eufVar, lq4Var, 1);
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
                ((duf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((duf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        b81 b81Var;
        int i = this.e;
        sbi sbiVar = sbi.a;
        euf eufVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                mjg mjgVar = eufVar.p;
                if (((Boolean) ((e5d) eufVar.g.getValue()).k().i()).booleanValue()) {
                    boolean zF = ((wsc) eufVar.j.getValue()).f();
                    if (((xb9) ((et3) eufVar.i.getValue())).U().a.isEmpty() && !zF) {
                        obj2 = tf0.a;
                    } else if (zF) {
                        int iD = qt4.D(((lp3) eufVar.k.getValue()).a());
                        if (iD == 0) {
                            obj2 = uf0.a;
                        } else {
                            if (iD != 1 && iD != 2) {
                                ore.o();
                                return null;
                            }
                            obj2 = rf0.a;
                        }
                    } else {
                        obj2 = sf0.a;
                    }
                } else {
                    obj2 = uf0.a;
                }
                mjgVar.getClass();
                mjgVar.j(null, obj2);
                return sbiVar;
            default:
                ch3.d0(obj);
                dc9 dc9VarA = ((hq6) eufVar.h.getValue()).a();
                y1 y1Var = new y1(0, t71.b);
                long jH = 0;
                while (y1Var.hasNext()) {
                    switch (u71.$EnumSwitchMapping$0[((t71) y1Var.next()).ordinal()]) {
                        case 1:
                            b81Var = b81.c;
                            break;
                        case 2:
                            b81Var = b81.d;
                            break;
                        case 3:
                            b81Var = b81.e;
                            break;
                        case 4:
                            b81Var = b81.f;
                            break;
                        case 5:
                            b81Var = b81.h;
                            break;
                        case 6:
                            b81Var = b81.i;
                            break;
                        case 7:
                            b81Var = b81.l;
                            break;
                        default:
                            ore.o();
                            return null;
                    }
                    jH += dc9VarA.H(b81Var);
                }
                mjg mjgVar2 = eufVar.m;
                xnh xnhVar = new xnh(woh.v(jH, false, eufVar.c));
                mjgVar2.getClass();
                mjgVar2.j(null, xnhVar);
                return sbiVar;
        }
    }
}
