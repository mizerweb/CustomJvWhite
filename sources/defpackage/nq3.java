package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nq3 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq3(qu quVar, int i, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = quVar;
        this.g = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                nq3 nq3Var = new nq3((pq3) this.h, (s6) obj2, lq4Var);
                nq3Var.g = ((Number) obj).intValue();
                return nq3Var;
            default:
                nq3 nq3Var2 = new nq3((qu) obj2, this.g, lq4Var);
                nq3Var2.h = obj;
                return nq3Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((nq3) create(Integer.valueOf(((Number) obj).intValue()), (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((nq3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                int i = this.g;
                hu4 hu4Var = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    String str = (String) ((pq3) this.h).i;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.h(i, "onNewActivityFlow "), null);
                        }
                    }
                    v2a v2aVar = (v2a) ((pq3) this.h).b;
                    List list = (List) ((s6) this.i).get();
                    this.g = i;
                    this.f = 1;
                    v2aVar.getClass();
                    ao5 ao5Var = ao5.a;
                    Object objK0 = yab.K0(rk9.a.S0(), new ca(v2aVar, list, null), this);
                    if (objK0 != hu4Var) {
                        objK0 = sbiVar;
                    }
                    if (objK0 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
                qu quVar = (qu) this.i;
                gu4 gu4Var = (gu4) this.h;
                hu4 hu4Var2 = hu4.a;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    pgg pggVar = (pgg) quVar.c;
                    this.h = gu4Var;
                    this.f = 1;
                    rb8 rb8Var = (rb8) pggVar.a;
                    obj = yab.K0(((n0c) rb8Var.d).b(), new cb8(rb8Var, null), this);
                    if (obj == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                soe soeVar = (soe) obj;
                gm0.n("qu", "onStateChanged: allMediaCountResult is " + soeVar);
                if (soeVar instanceof ooe) {
                    gm0.V("qu", "onStateChanged: error", ((ooe) soeVar).a);
                } else {
                    if (!(soeVar instanceof qoe)) {
                        ore.o();
                        return null;
                    }
                    if (this.g != ((Number) ((qoe) soeVar).a()).intValue() && cqk.x(gu4Var)) {
                        ((d2) quVar.d).invoke();
                    }
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq3(pq3 pq3Var, s6 s6Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = pq3Var;
        this.i = s6Var;
    }
}
