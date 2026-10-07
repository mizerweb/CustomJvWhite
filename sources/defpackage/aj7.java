package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aj7 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ej7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj7(ej7 ej7Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = ej7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ej7 ej7Var = this.h;
        switch (i) {
            case 0:
                aj7 aj7Var = new aj7(ej7Var, lq4Var, 0);
                aj7Var.g = obj;
                return aj7Var;
            default:
                aj7 aj7Var2 = new aj7(ej7Var, lq4Var, 1);
                aj7Var2.g = obj;
                return aj7Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((aj7) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((aj7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        List list;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        ej7 ej7Var = this.h;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                gi7 gi7Var = ej7Var.e;
                ylc ylcVar = (ylc) this.g;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    int iIntValue = ((Number) ylcVar.a).intValue();
                    ni7 ni7Var = (ni7) ylcVar.b;
                    if (cqk.d(ni7Var, ii7.b)) {
                        boolean zC = ((wsc) ej7Var.i.getValue()).c(wsc.n);
                        p41 p41Var = ej7Var.u;
                        if (zC) {
                            this.g = null;
                            this.f = 1;
                            if (p41Var.a(this, qh7.a) == hu4Var) {
                                return hu4Var;
                            }
                            a8j.x(gi7Var.d, xh7.a);
                        } else {
                            this.g = null;
                            this.f = 2;
                            if (p41Var.a(this, rh7.a) == hu4Var) {
                                return hu4Var;
                            }
                        }
                    } else if (ni7Var instanceof ki7) {
                        ic6 ic6Var = gi7Var.d;
                        if (ej7Var.c.a) {
                            iIntValue--;
                        }
                        a8j.x(ic6Var, new ai7(iIntValue, ((nh7) ej7Var.t.a.getValue()).a.b(), ((ki7) ni7Var).c));
                    } else if (cqk.d(ni7Var, li7.b)) {
                        if (((f5d) ((wo6) ej7Var.k.getValue())).C()) {
                            a8j.x(gi7Var.d, zh7.a);
                        }
                    } else if (!cqk.d(ni7Var, ji7.b) && !cqk.d(ni7Var, mi7.b)) {
                        ore.o();
                        return null;
                    }
                } else if (i2 == 1) {
                    ch3.d0(obj);
                    a8j.x(gi7Var.d, xh7.a);
                } else {
                    if (i2 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
                mjg mjgVar = ej7Var.q;
                gu4 gu4Var = (gu4) this.g;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    gm0.n("ej7", "loadMoreItems(): loadingItemsJob start");
                    Boolean bool = Boolean.TRUE;
                    mjgVar.getClass();
                    mjgVar.j(null, bool);
                    nh7 nh7Var = (nh7) ej7Var.s.getValue();
                    if (nh7Var != null) {
                        rb8 rb8Var = ej7Var.f;
                        int i4 = ej7Var.p.b;
                        this.g = gu4Var;
                        this.f = 1;
                        obj = yab.K0(((n0c) rb8Var.d).b(), new fb8(nh7Var, i4, rb8Var, null), this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    }
                    return sbiVar;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    list = (List) obj;
                    if (cqk.x(gu4Var)) {
                        mjg mjgVar2 = ej7Var.n;
                        mjgVar2.j(null, ww3.G1(list, (Collection) mjgVar2.getValue()));
                        gm0.n("ej7", "loadMoreItems(): loadingItemsJob finish");
                    }
                    return sbiVar;
                }
                ch3.d0(obj);
                ob9 ob9Var = (ob9) obj;
                Boolean bool2 = Boolean.FALSE;
                mjgVar.getClass();
                mjgVar.j(null, bool2);
                gm0.n("ej7", "loadMoreItems(): get result " + ob9Var);
                if (cqk.x(gu4Var) && !(ob9Var instanceof mb9)) {
                    if (!(ob9Var instanceof nb9)) {
                        ore.o();
                        return null;
                    }
                    List list2 = ((nb9) ob9Var).a;
                    this.g = gu4Var;
                    this.f = 2;
                    obj = ej7.B(ej7Var, list2, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                    list = (List) obj;
                    if (cqk.x(gu4Var)) {
                        mjg mjgVar3 = ej7Var.n;
                        mjgVar3.j(null, ww3.G1(list, (Collection) mjgVar3.getValue()));
                        gm0.n("ej7", "loadMoreItems(): loadingItemsJob finish");
                    }
                }
                return sbiVar;
        }
    }
}
