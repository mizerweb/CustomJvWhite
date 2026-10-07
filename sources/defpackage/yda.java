package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yda extends nq4 {
    public long d;
    public rt2 e;
    public sfa f;
    public fda g;
    public List h;
    public List i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cea m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yda(cea ceaVar, nq4 nq4Var) {
        super(nq4Var);
        this.m = ceaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(0L, this);
    }
}
