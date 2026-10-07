package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lm2 extends nq4 {
    public int d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public pm2 i;
    public List j;
    public rl2 k;
    public AutoCloseable l;
    public /* synthetic */ Object m;
    public final /* synthetic */ pm2 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm2(pm2 pm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.n = pm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.p(null, 0, 0L, null, false, this);
    }
}
