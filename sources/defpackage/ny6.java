package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class ny6 implements yx6 {
    public final /* synthetic */ vfe a;
    public final /* synthetic */ long b;
    public final /* synthetic */ njd c;
    public final /* synthetic */ wfe d;
    public final /* synthetic */ gu4 e;
    public final /* synthetic */ vt4 f;

    public ny6(vfe vfeVar, long j, njd njdVar, wfe wfeVar, gu4 gu4Var, vt4 vt4Var) {
        this.a = vfeVar;
        this.b = j;
        this.c = njdVar;
        this.d = wfeVar;
        this.e = gu4Var;
        this.f = vt4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) throws IllegalAccessException, InvocationTargetException {
        my6 my6Var;
        if (lq4Var instanceof my6) {
            my6Var = (my6) lq4Var;
            int i = my6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                my6Var.f = i - Integer.MIN_VALUE;
            } else {
                my6Var = new my6(this, lq4Var);
            }
        } else {
            my6Var = new my6(this, lq4Var);
        }
        Object obj2 = my6Var.d;
        int i2 = my6Var.f;
        wfe wfeVar = this.d;
        if (i2 == 0) {
            ch3.d0(obj2);
            ghb ghbVar = ew5.b;
            long jG = ew5.g(qe7.P(System.nanoTime(), lw5.NANOSECONDS));
            vfe vfeVar = this.a;
            long j = vfeVar.a;
            if (j < jG) {
                vfeVar.a = jG + this.b;
                my6Var.f = 1;
                Object objA = this.c.f.a(my6Var, obj);
                hu4 hu4Var = hu4.a;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            } else {
                tt4 tt4Var = (xf5) wfeVar.a;
                if (tt4Var != null) {
                    ((up8) tt4Var).b(null);
                }
                wfeVar.a = yab.h(this.e, null, 0, new ly6(vfeVar, jG, j, this.b, this.f, this.c, obj, null), 3);
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj2);
        tt4 tt4Var2 = (xf5) wfeVar.a;
        if (tt4Var2 != null) {
            ((up8) tt4Var2).b(null);
        }
        return sbi.a;
    }
}
