package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class dd3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ xd3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dd3(xd3 xd3Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xd3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        xd3 xd3Var = this.g;
        switch (i) {
            case 0:
                return new dd3(xd3Var, lq4Var, 0);
            case 1:
                return new dd3(xd3Var, lq4Var, 1);
            case 2:
                return new dd3(xd3Var, lq4Var, 2);
            case 3:
                return new dd3(xd3Var, lq4Var, 3);
            case 4:
                return new dd3(xd3Var, lq4Var, 4);
            default:
                return new dd3(xd3Var, lq4Var, 5);
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
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((dd3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        nx2 nx2Var;
        String str;
        vg4 vg4VarW;
        nx2 nx2Var2;
        String str2;
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        xd3 xd3Var = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                rt2 rt2Var = (rt2) xd3Var.G1.a.getValue();
                if (rt2Var == null || (nx2Var = rt2Var.b) == null || (str = nx2Var.J) == null) {
                    return sbiVar;
                }
                cq8 cq8Var = (cq8) xd3Var.E.getValue();
                this.f = 1;
                return cq8Var.a(str, this) == hu4Var ? hu4Var : sbiVar;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                rt2 rt2Var2 = (rt2) xd3Var.G1.a.getValue();
                if (rt2Var2 == null || (vg4VarW = rt2Var2.w()) == null) {
                    return sbiVar;
                }
                long jV = vg4VarW.v();
                nm4 nm4Var = (nm4) xd3Var.x.getValue();
                this.f = 1;
                return nm4Var.a(jV, this) == hu4Var ? hu4Var : sbiVar;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    jz jzVar = new jz(xd3Var.G1, 13);
                    this.f = 1;
                    obj = e9i.N(jzVar, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return new Long(((rt2) obj).a);
            case 3:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                rt2 rt2Var3 = (rt2) xd3Var.G1.a.getValue();
                if (rt2Var3 == null || (nx2Var2 = rt2Var3.b) == null || (str2 = nx2Var2.J) == null) {
                    return sbiVar;
                }
                cq8 cq8Var2 = (cq8) xd3Var.E.getValue();
                this.f = 1;
                return cq8Var2.a(str2, this) == hu4Var ? hu4Var : sbiVar;
            case 4:
                int i6 = this.f;
                if (i6 == 0) {
                    ch3.d0(obj);
                    long j = xd3Var.q1.b;
                    this.f = 1;
                    if (rx8.t(j, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                mjg mjgVar = xd3Var.O1;
                Boolean bool = Boolean.FALSE;
                mjgVar.getClass();
                mjgVar.j(null, bool);
                return sbiVar;
            default:
                int i7 = this.f;
                if (i7 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    obj = xd3Var.P(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i7 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                long jLongValue = ((Number) obj).longValue();
                zv8[] zv8VarArr = xd3.X1;
                qw2 qw2VarJ = ((xn3) xd3Var.I.getValue()).j();
                rt2 rt2VarN = qw2VarJ.N(jLongValue);
                if (rt2VarN != null) {
                    qw2VarJ.x(rt2VarN, 0L, true);
                    ((pvb) qw2VarJ.r.get()).o(rt2VarN.a);
                }
                a8j.x(xd3Var.L1, new mc3(R.string.oneme_chat_notifications_on_snackbar_title, null, new Integer(R.drawable.icon_check_round_fill), 2));
                return sbiVar;
        }
    }
}
