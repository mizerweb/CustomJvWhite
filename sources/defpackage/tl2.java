package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tl2 extends nq4 {
    public long d;
    public int e;
    public pm2 f;
    public List g;
    public rl2 h;
    public AutoCloseable i;
    public /* synthetic */ Object j;
    public final /* synthetic */ pm2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl2(pm2 pm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = pm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(null, 0L, 0, null, this);
    }
}
