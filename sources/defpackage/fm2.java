package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fm2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ pm2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm2(pm2 pm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = pm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.m(0, this);
    }
}
