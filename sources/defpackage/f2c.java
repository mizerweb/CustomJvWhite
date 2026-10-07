package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f2c extends nq4 {
    public j9b d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ m2c g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2c(m2c m2cVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = m2cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(this);
    }
}
