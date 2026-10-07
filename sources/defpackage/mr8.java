package defpackage;

import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mr8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ sr8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr8(sr8 sr8Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = sr8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        sr8 sr8Var = this.g;
        switch (i) {
            case 0:
                return new mr8(sr8Var, lq4Var, 0);
            case 1:
                mr8 mr8Var = new mr8(sr8Var, lq4Var, 1);
                mr8Var.f = ((Number) obj).intValue();
                return mr8Var;
            default:
                return new mr8(sr8Var, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((mr8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                ((mr8) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((mr8) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x017a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objP;
        rt2 rt2Var;
        Object objA;
        Object objP2;
        rt2 rt2Var2;
        Object objA2;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        sr8 sr8Var = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ic6 ic6Var = sr8Var.r;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i2 == 2) {
                            ch3.d0(obj);
                            objP = obj;
                            rt2Var = (rt2) objP;
                            if (rt2Var != null) {
                                vq8 vq8Var = (vq8) sr8Var.g.getValue();
                                long j = sr8Var.c;
                                long jA = rt2Var.A();
                                this.f = 3;
                                objA = vq8Var.a(j, jA, r66.a, tq8.a, this);
                                if (objA == hu4Var) {
                                    return hu4Var;
                                }
                            }
                            return sbiVar;
                        }
                        if (i2 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                        objA = ((roe) obj).a;
                    }
                    if (!(objA instanceof poe)) {
                        a8j.x(ic6Var, new br8(new tnh(R.string.join_requests_approve_all_success)));
                    }
                    if (roe.a(objA) != null) {
                        a8j.x(ic6Var, new zq8(new tnh(R.string.join_requests_approve_all_error)));
                    }
                    return sbiVar;
                }
                ch3.d0(obj);
                sgg sggVar = sr8Var.l;
                if (sggVar != null) {
                    this.f = 1;
                    if (sggVar.g(this) == hu4Var) {
                        return hu4Var;
                    }
                }
                r8e r8eVarK = ((xn3) sr8Var.e.getValue()).k(sr8Var.c);
                this.f = 2;
                objP = e9i.P(r8eVarK, this);
                if (objP == hu4Var) {
                    return hu4Var;
                }
                rt2Var = (rt2) objP;
                if (rt2Var != null) {
                    vq8 vq8Var2 = (vq8) sr8Var.g.getValue();
                    long j2 = sr8Var.c;
                    long jA2 = rt2Var.A();
                    this.f = 3;
                    objA = vq8Var2.a(j2, jA2, r66.a, tq8.a, this);
                    if (objA == hu4Var) {
                        return hu4Var;
                    }
                    if (!(objA instanceof poe)) {
                        a8j.x(ic6Var, new br8(new tnh(R.string.join_requests_approve_all_success)));
                    }
                    if (roe.a(objA) != null) {
                        a8j.x(ic6Var, new zq8(new tnh(R.string.join_requests_approve_all_error)));
                    }
                }
                return sbiVar;
            case 1:
                int i3 = this.f;
                ch3.d0(obj);
                baa baaVar = sr8Var.d;
                mjg mjgVar = sr8Var.n;
                int i4 = ((kr8) mjgVar.getValue()).b;
                kr8 kr8Var = new kr8(i3, i3 > 0 ? new vnh(R.string.join_requests_screen_title_count, a.n1(new Object[]{new Integer(i3)})) : new tnh(R.string.join_requests_screen_title));
                mjgVar.getClass();
                mjgVar.j(null, kr8Var);
                if (i3 > i4 && !baaVar.a() && !((Boolean) sr8Var.j.getValue()).booleanValue()) {
                    baaVar.d();
                }
                return sbiVar;
            default:
                ic6 ic6Var2 = sr8Var.r;
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i5 == 2) {
                            ch3.d0(obj);
                            objP2 = obj;
                            rt2Var2 = (rt2) objP2;
                            if (rt2Var2 != null) {
                                vq8 vq8Var3 = (vq8) sr8Var.g.getValue();
                                long j3 = sr8Var.c;
                                long jA3 = rt2Var2.A();
                                this.f = 3;
                                objA2 = vq8Var3.a(j3, jA3, r66.a, tq8.b, this);
                                if (objA2 == hu4Var) {
                                    return hu4Var;
                                }
                            }
                            return sbiVar;
                        }
                        if (i5 != 3) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                        objA2 = ((roe) obj).a;
                    }
                    if (!(objA2 instanceof poe)) {
                        a8j.x(ic6Var2, new br8(new tnh(R.string.join_requests_reject_all_success)));
                    }
                    if (roe.a(objA2) != null) {
                        a8j.x(ic6Var2, new zq8(new tnh(R.string.join_requests_reject_all_error)));
                    }
                    return sbiVar;
                }
                ch3.d0(obj);
                sgg sggVar2 = sr8Var.m;
                if (sggVar2 != null) {
                    this.f = 1;
                    if (sggVar2.g(this) == hu4Var) {
                        return hu4Var;
                    }
                }
                r8e r8eVarK2 = ((xn3) sr8Var.e.getValue()).k(sr8Var.c);
                this.f = 2;
                objP2 = e9i.P(r8eVarK2, this);
                if (objP2 == hu4Var) {
                    return hu4Var;
                }
                rt2Var2 = (rt2) objP2;
                if (rt2Var2 != null) {
                    vq8 vq8Var4 = (vq8) sr8Var.g.getValue();
                    long j4 = sr8Var.c;
                    long jA4 = rt2Var2.A();
                    this.f = 3;
                    objA2 = vq8Var4.a(j4, jA4, r66.a, tq8.b, this);
                    if (objA2 == hu4Var) {
                        return hu4Var;
                    }
                    if (!(objA2 instanceof poe)) {
                        a8j.x(ic6Var2, new br8(new tnh(R.string.join_requests_reject_all_success)));
                    }
                    if (roe.a(objA2) != null) {
                        a8j.x(ic6Var2, new zq8(new tnh(R.string.join_requests_reject_all_error)));
                    }
                }
                return sbiVar;
        }
    }
}
