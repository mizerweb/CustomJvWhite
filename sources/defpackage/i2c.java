package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i2c extends nq4 {
    public cf7 d;
    public j9b e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ m2c i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2c(m2c m2cVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = m2cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.g(null, this);
    }
}
