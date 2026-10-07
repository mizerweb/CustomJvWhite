package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e2c extends nq4 {
    public l9b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ m2c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2c(m2c m2cVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = m2cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return m2c.a(this.f, this);
    }
}
