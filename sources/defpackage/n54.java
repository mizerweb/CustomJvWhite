package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class n54 extends mdh implements qf7 {
    public p54 e;
    public long f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ o54 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n54(boolean z, o54 o54Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = z;
        this.j = o54Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        n54 n54Var = new n54(this.i, this.j, lq4Var);
        n54Var.h = obj;
        return n54Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((n54) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162 A[LOOP:0: B:60:0x015c->B:62:0x0162, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0190  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object poeVar;
        p54 p54Var;
        long jLongValue;
        ArrayList arrayList;
        Object objI;
        Object objD;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.g;
        int i2 = 10;
        int i3 = 1;
        try {
            if (i == 0) {
                ch3.d0(obj);
                boolean z = this.i;
                ny8 ny8Var = this.j.d;
                if (z) {
                    xb9 xb9Var = (xb9) ((et3) ny8Var.getValue());
                    xb9Var.Q0.B(xb9Var, xb9.g1[34], 0L);
                    jLongValue = 0;
                } else {
                    xb9 xb9Var2 = (xb9) ((et3) ny8Var.getValue());
                    jLongValue = ((Number) xb9Var2.Q0.m(xb9Var2, xb9.g1[34])).longValue();
                }
                String str = this.j.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.j(jLongValue, "Start get complain reasons from server, current sync="), null);
                    }
                }
                ky kyVar = new ky(kfc.z3, 4);
                kyVar.f(jLongValue, "complainSync");
                pvb pvbVar = (pvb) this.j.b.getValue();
                this.h = null;
                this.e = null;
                this.f = jLongValue;
                this.g = 1;
                objD = pvbVar.D(kyVar, this);
                if (objD == hu4Var) {
                }
                return hu4Var;
            }
            if (i == 1) {
                jLongValue = this.f;
                ch3.d0(obj);
                objD = obj;
            } else if (i == 2) {
                jLongValue = this.f;
                p54Var = this.e;
                ch3.d0(obj);
                l54 l54Var = (l54) this.j.c.getValue();
                List<j54> list = p54Var.d;
                arrayList = new ArrayList(yw3.W0(list, 10));
                for (j54 j54Var : list) {
                    arrayList.add(new m54(j54Var.a.a(), j54Var.b));
                }
                this.h = null;
                this.e = null;
                this.f = jLongValue;
                this.g = 3;
                objI = ch3.I(this, l54Var.a, false, true, new w14(l54Var, i3, arrayList));
                if (objI != hu4Var) {
                    objI = sbiVar;
                }
                if (objI == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
            return sbiVar;
            poeVar = (p54) objD;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        o54 o54Var = this.j;
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            String str2 = o54Var.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, "Fail get complain reasons", null);
                }
            }
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        p54Var = (p54) poeVar;
        if (p54Var != null) {
            xb9 xb9Var3 = (xb9) ((et3) this.j.d.getValue());
            xb9Var3.Q0.B(xb9Var3, xb9.g1[34], Long.valueOf(p54Var.c));
            if (!p54Var.d.isEmpty()) {
                l54 l54Var2 = (l54) this.j.c.getValue();
                this.h = null;
                this.e = p54Var;
                this.f = jLongValue;
                this.g = 2;
                Object objI2 = ch3.I(this, l54Var2.a, false, true, new w83(i2));
                if (objI2 != hu4Var) {
                    objI2 = sbiVar;
                }
                if (objI2 != hu4Var) {
                    l54 l54Var3 = (l54) this.j.c.getValue();
                    List<j54> list2 = p54Var.d;
                    arrayList = new ArrayList(yw3.W0(list2, 10));
                    while (r0.hasNext()) {
                        arrayList.add(new m54(j54Var.a.a(), j54Var.b));
                    }
                    this.h = null;
                    this.e = null;
                    this.f = jLongValue;
                    this.g = 3;
                    objI = ch3.I(this, l54Var3.a, false, true, new w14(l54Var3, i3, arrayList));
                    if (objI != hu4Var) {
                        objI = sbiVar;
                    }
                    if (objI == hu4Var) {
                    }
                }
                return hu4Var;
            }
        }
        return sbiVar;
    }
}
