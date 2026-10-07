package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kv0 extends nq4 {
    public long d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ mv0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv0(mv0 mv0Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = mv0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(0L, this);
    }
}
