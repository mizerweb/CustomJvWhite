package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f2h extends nq4 {
    public long d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ i2h g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2h(i2h i2hVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = i2hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.h(0L, this);
    }
}
