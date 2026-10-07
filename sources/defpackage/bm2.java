package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bm2 extends nq4 {
    public pm2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pm2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm2(pm2 pm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = pm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.i(this);
    }
}
