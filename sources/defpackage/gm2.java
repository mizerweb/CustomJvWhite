package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gm2 extends nq4 {
    public long d;
    public boolean e;
    public AutoCloseable f;
    public /* synthetic */ Object g;
    public final /* synthetic */ pm2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm2(pm2 pm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = pm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return pm2.d(this.h, 0L, false, this);
    }
}
