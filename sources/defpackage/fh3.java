package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class fh3 extends nq4 {
    public gh3 d;
    public nx2 e;
    public ConcurrentHashMap f;
    public long g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ gh3 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh3(gh3 gh3Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = gh3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return gh3.a(this.j, 0L, null, null, this);
    }
}
