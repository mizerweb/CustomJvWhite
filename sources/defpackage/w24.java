package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w24 extends mdh implements cf7 {
    public Long e;
    public l34 f;
    public q24 g;
    public Iterator h;
    public long i;
    public boolean j;
    public int k;
    public int l;
    public final /* synthetic */ Long m;
    public final /* synthetic */ List n;
    public final /* synthetic */ l34 o;
    public final /* synthetic */ q24 p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w24(Long l, List list, l34 l34Var, q24 q24Var, long j, lq4 lq4Var) {
        super(1, lq4Var);
        this.m = l;
        this.n = list;
        this.o = l34Var;
        this.p = q24Var;
        this.q = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new w24(this.m, this.n, this.o, this.p, this.q, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((w24) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Long l;
        int i;
        l34 l34Var;
        q24 q24Var;
        long j;
        boolean z;
        int i2 = this.l;
        Long l2 = null;
        if (i2 == 0) {
            ch3.d0(obj);
            Long l3 = this.m;
            if (l3 != null && l3.longValue() >= 0) {
                l2 = l3;
            }
            Iterator it2 = this.n.iterator();
            it = it2;
            l = l2;
            i = 0;
            l34Var = this.o;
            q24Var = this.p;
            j = this.q;
            z = true;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.k;
            boolean z2 = this.j;
            long j2 = this.i;
            Iterator it3 = this.h;
            q24 q24Var2 = this.g;
            l34 l34Var2 = this.f;
            Long l4 = this.e;
            ch3.d0(obj);
            z = z2;
            q24Var = q24Var2;
            i = i3;
            it = it3;
            l34Var = l34Var2;
            l = l4;
            j = j2;
        }
        while (it.hasNext()) {
            gda gdaVar = (gda) it.next();
            ki8 ki8Var = (ki8) l34Var.d.getValue();
            v7e v7eVar = new v7e(l);
            this.e = l;
            this.f = l34Var;
            this.g = q24Var;
            this.h = it;
            this.i = j;
            this.j = z;
            this.k = i;
            this.l = 1;
            Object objB = ki8.b(ki8Var, q24Var, gdaVar, j, z, v7eVar, this, 8);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        }
        return sbi.a;
    }
}
