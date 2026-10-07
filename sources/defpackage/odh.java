package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class odh extends mdh implements qf7 {
    public pdh e;
    public Serializable f;
    public pdh g;
    public Long h;
    public pdh i;
    public Long j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ pdh o;
    public final /* synthetic */ Long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odh(pdh pdhVar, Long l, lq4 lq4Var) {
        super(2, lq4Var);
        this.o = pdhVar;
        this.p = l;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        odh odhVar = new odh(this.o, this.p, lq4Var);
        odhVar.n = obj;
        return odhVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((odh) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0152  */
    /* JADX WARN: Code duplicated, block: B:56:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x015e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:65:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        pdh pdhVar;
        Long l;
        int i;
        pdh pdhVar2;
        Long l2;
        pdh pdhVar3;
        pdh pdhVar4;
        Long l3;
        Long l4;
        int i2;
        pdh pdhVar5;
        okh okhVarU;
        long jLongValue;
        String str;
        a4c a4cVar;
        int i3;
        Long l5;
        je9 je9Var;
        String str2;
        a4c a4cVar2;
        okh okhVarU2;
        long jLongValue2;
        je9 je9Var2;
        Object objA;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) this.n;
        hu4 hu4Var = hu4.a;
        int i4 = this.m;
        int i5 = 0;
        if (i4 == 0) {
            ch3.d0(obj);
            pdh pdhVar6 = this.o;
            Long l6 = this.p;
            try {
                this.n = null;
                this.e = pdhVar6;
                this.f = l6;
                this.g = pdhVar6;
                this.h = l6;
                this.i = pdhVar6;
                this.j = l6;
                this.k = 0;
                this.l = 0;
                this.m = 1;
                if (pdhVar6.C(gu4Var, this) != hu4Var) {
                    pdhVar3 = pdhVar6;
                    pdhVar4 = pdhVar3;
                    l3 = l6;
                    l = l3;
                    l4 = l;
                    i2 = 0;
                    pdhVar5 = pdhVar4;
                    i = 0;
                    okhVarU = pdhVar5.u();
                    jLongValue = l4.longValue();
                    this.n = null;
                    this.e = pdhVar4;
                    this.f = l;
                    this.g = pdhVar3;
                    this.h = l3;
                    this.i = null;
                    this.j = null;
                    this.k = i;
                    this.l = i2;
                    this.m = 2;
                    if (okhVarU.m(jLongValue, this) != hu4Var) {
                        return sbiVar;
                    }
                }
            } catch (CancellationException e) {
                e = e;
                pdhVar2 = pdhVar6;
                l2 = l6;
                i = 0;
                str2 = pdhVar2.b;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "task cancelled", null);
                    }
                }
                okhVarU2 = pdhVar2.u();
                jLongValue2 = l2.longValue();
                this.n = null;
                this.e = null;
                this.f = e;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = i;
                this.l = 0;
                this.m = 3;
                if (okhVarU2.m(jLongValue2, this) == hu4Var) {
                    throw e;
                }
            } catch (Throwable th) {
                th = th;
                pdhVar = pdhVar6;
                l = l6;
                i = 0;
                str = pdhVar.b;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "failed", th);
                    }
                }
                pdhVar.A();
                okh okhVarU3 = pdhVar.u();
                this.n = null;
                this.e = pdhVar;
                this.f = l;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = i;
                this.l = 0;
                this.m = 4;
                okhVarU3.n(pdhVar);
                if (sbiVar != hu4Var) {
                    i3 = i;
                    l5 = l;
                    okh okhVarU4 = pdhVar.u();
                    long jLongValue3 = l5.longValue();
                    this.n = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    this.i = null;
                    this.k = i3;
                    this.l = i5;
                    this.m = 5;
                    objA = okhVarU4.c().a(jLongValue3, this);
                    if (objA != hu4Var) {
                        objA = sbiVar;
                    }
                    if (objA == hu4Var) {
                        return sbiVar;
                    }
                }
            }
            return hu4Var;
        }
        if (i4 == 1) {
            i2 = this.l;
            i = this.k;
            l3 = this.j;
            pdhVar3 = this.i;
            l = this.h;
            pdhVar4 = this.g;
            l4 = (Long) this.f;
            pdhVar5 = this.e;
            try {
                ch3.d0(obj);
                okhVarU = pdhVar5.u();
                jLongValue = l4.longValue();
                this.n = null;
                this.e = pdhVar4;
                this.f = l;
                this.g = pdhVar3;
                this.h = l3;
                this.i = null;
                this.j = null;
                this.k = i;
                this.l = i2;
                this.m = 2;
                if (okhVarU.m(jLongValue, this) != hu4Var) {
                    return hu4Var;
                }
            } catch (CancellationException e2) {
                e = e2;
                l2 = l3;
                pdhVar2 = pdhVar3;
                str2 = pdhVar2.b;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "task cancelled", null);
                    }
                }
                okhVarU2 = pdhVar2.u();
                jLongValue2 = l2.longValue();
                this.n = null;
                this.e = null;
                this.f = e;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = i;
                this.l = 0;
                this.m = 3;
                if (okhVarU2.m(jLongValue2, this) == hu4Var) {
                    throw e;
                }
            } catch (Throwable th2) {
                th = th2;
                pdhVar = pdhVar4;
                str = pdhVar.b;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "failed", th);
                    }
                }
                pdhVar.A();
                okh okhVarU5 = pdhVar.u();
                this.n = null;
                this.e = pdhVar;
                this.f = l;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = i;
                this.l = 0;
                this.m = 4;
                okhVarU5.n(pdhVar);
                if (sbiVar != hu4Var) {
                    i3 = i;
                    l5 = l;
                    okh okhVarU6 = pdhVar.u();
                    long jLongValue4 = l5.longValue();
                    this.n = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    this.i = null;
                    this.k = i3;
                    this.l = i5;
                    this.m = 5;
                    objA = okhVarU6.c().a(jLongValue4, this);
                    if (objA != hu4Var) {
                        objA = sbiVar;
                    }
                    if (objA == hu4Var) {
                        return sbiVar;
                    }
                }
            }
        } else if (i4 == 2) {
            i = this.k;
            l2 = this.h;
            pdhVar2 = this.g;
            Long l7 = (Long) this.f;
            pdh pdhVar7 = this.e;
            try {
                ch3.d0(obj);
            } catch (CancellationException e3) {
                e = e3;
                str2 = pdhVar2.b;
                a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, "task cancelled", null);
                    }
                }
                okhVarU2 = pdhVar2.u();
                jLongValue2 = l2.longValue();
                this.n = null;
                this.e = null;
                this.f = e;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = i;
                this.l = 0;
                this.m = 3;
                if (okhVarU2.m(jLongValue2, this) == hu4Var) {
                    return hu4Var;
                }
                throw e;
            } catch (Throwable th3) {
                th = th3;
                pdhVar = pdhVar7;
                l = l7;
                str = pdhVar.b;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "failed", th);
                    }
                }
                pdhVar.A();
                okh okhVarU7 = pdhVar.u();
                this.n = null;
                this.e = pdhVar;
                this.f = l;
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = i;
                this.l = 0;
                this.m = 4;
                okhVarU7.n(pdhVar);
                if (sbiVar != hu4Var) {
                    i3 = i;
                    l5 = l;
                    okh okhVarU8 = pdhVar.u();
                    long jLongValue5 = l5.longValue();
                    this.n = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    this.i = null;
                    this.k = i3;
                    this.l = i5;
                    this.m = 5;
                    objA = okhVarU8.c().a(jLongValue5, this);
                    if (objA != hu4Var) {
                        objA = sbiVar;
                    }
                    if (objA == hu4Var) {
                    }
                }
                return hu4Var;
            }
        } else {
            if (i4 == 3) {
                CancellationException cancellationException = (CancellationException) this.f;
                ch3.d0(obj);
                throw cancellationException;
            }
            if (i4 == 4) {
                i5 = this.l;
                i3 = this.k;
                l5 = (Long) this.f;
                pdhVar = this.e;
                ch3.d0(obj);
                okh okhVarU9 = pdhVar.u();
                long jLongValue6 = l5.longValue();
                this.n = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                this.i = null;
                this.k = i3;
                this.l = i5;
                this.m = 5;
                objA = okhVarU9.c().a(jLongValue6, this);
                if (objA != hu4Var) {
                    objA = sbiVar;
                }
                if (objA == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i4 != 5) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        }
        return sbiVar;
    }
}
