package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q83 extends nq4 {
    public g83 d;
    public g83 e;
    public xf5 f;
    public LinkedHashMap g;
    public Object h;
    public Object i;
    public d83 j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ t83 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q83(t83 t83Var, nq4 nq4Var) {
        super(nq4Var);
        this.m = t83Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(null, null, null, null, this);
    }
}
