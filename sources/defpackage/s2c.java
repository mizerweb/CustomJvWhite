package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s2c extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ t2c e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2c(t2c t2cVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = t2cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return t2c.a(this.e, null, this);
    }
}
