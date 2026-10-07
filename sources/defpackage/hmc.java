package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hmc extends nq4 {
    public List d;
    public b9b e;
    public long[] f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ t84 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmc(t84 t84Var, lq4 lq4Var) {
        super(lq4Var);
        this.r = t84Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return t84.a(this.r, null, this);
    }
}
