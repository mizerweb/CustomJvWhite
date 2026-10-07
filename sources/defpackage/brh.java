package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class brh extends nq4 {
    public yx6 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a6f f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brh(a6f a6fVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = a6fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        this.f.collect(null, this);
        return hu4.a;
    }
}
