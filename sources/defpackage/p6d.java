package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class p6d {
    public static final /* synthetic */ zv8[] o;
    public final gu4 a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final xhh f;
    public final pvb g;
    public final ny8 h;
    public final p3c i = qyj.S();
    public volatile long j;
    public final mjg k;
    public final r8e l;
    public final mjg m;
    public final r8e n;

    static {
        z8b z8bVar = new z8b(p6d.class, "loadJob", "getLoadJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        o = new zv8[]{z8bVar};
    }

    public p6d(dq4 dq4Var, long j, long j2, long j3, int i, xhh xhhVar, pvb pvbVar, ny8 ny8Var) {
        this.a = dq4Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = xhhVar;
        this.g = pvbVar;
        this.h = ny8Var;
        mjg mjgVarA = p90.a(r66.a);
        this.k = mjgVarA;
        this.l = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(0);
        this.m = mjgVarA2;
        this.n = new r8e(mjgVarA2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(long j, long j2, long j3, int i, long j4, nq4 nq4Var) {
        o6d o6dVar;
        if (nq4Var instanceof o6d) {
            o6dVar = (o6d) nq4Var;
            int i2 = o6dVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o6dVar.f = i2 - Integer.MIN_VALUE;
            } else {
                o6dVar = new o6d(this, nq4Var);
            }
        } else {
            o6dVar = new o6d(this, nq4Var);
        }
        Object poeVar = o6dVar.d;
        int i3 = o6dVar.f;
        try {
            if (i3 == 0) {
                ch3.d0(poeVar);
                dad dadVar = new dad(j, j3, j2, i, j4);
                pvb pvbVar = this.g;
                o6dVar.f = 1;
                poeVar = pvbVar.D(dadVar, o6dVar);
                hu4 hu4Var = hu4.a;
                if (poeVar == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(poeVar);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            return null;
        }
        return poeVar;
    }
}
