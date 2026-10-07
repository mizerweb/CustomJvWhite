package defpackage;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/* JADX INFO: loaded from: classes.dex */
public final class nsc extends mdh implements qf7 {
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;
    public final /* synthetic */ osc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsc(osc oscVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = oscVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new nsc(this.k, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((nsc) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        long epochMilli;
        long jA;
        long j;
        long jMax;
        int i = this.j;
        sbi sbiVar = sbi.a;
        osc oscVar = this.k;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            xb9 xb9Var = (xb9) oscVar.b;
            jLongValue = ((Number) xb9Var.J0.m(xb9Var, xb9.g1[27])).longValue();
            if (jLongValue == -1) {
                p41 p41Var = oscVar.d;
                this.e = jLongValue;
                this.j = 1;
                if (p41Var.a(this, sbiVar) != hu4Var) {
                    return sbiVar;
                }
            } else {
                epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                jA = osc.a(oscVar);
                j = jLongValue + jA;
                jMax = Math.max(0L, j - epochMilli);
                this.e = jLongValue;
                this.f = epochMilli;
                this.g = jA;
                this.h = j;
                this.i = jMax;
                this.j = 2;
                if (rx8.t(jMax, this) != hu4Var) {
                }
            }
        }
        if (i == 1) {
            ch3.d0(obj);
            return sbiVar;
        }
        if (i != 2) {
            if (i == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jMax = this.i;
        j = this.h;
        jA = this.g;
        epochMilli = this.f;
        jLongValue = this.e;
        ch3.d0(obj);
        p41 p41Var2 = oscVar.d;
        this.e = jLongValue;
        this.f = epochMilli;
        this.g = jA;
        this.h = j;
        this.i = jMax;
        this.j = 3;
        return p41Var2.a(this, sbiVar) == hu4Var ? hu4Var : sbiVar;
    }
}
