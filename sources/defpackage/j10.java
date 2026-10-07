package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class j10 extends nq4 {
    public y10 d;
    public i64 e;
    public i64 f;
    public Collection g;
    public long h;
    public long i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ y10 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j10(y10 y10Var, lq4 lq4Var) {
        super(lq4Var);
        this.p = y10Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return y10.p(this.p, 0L, false, false, false, this);
    }
}
