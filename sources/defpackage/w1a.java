package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w1a extends nq4 {
    public rt2 d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ b2a g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1a(b2a b2aVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = b2aVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return b2a.b(this.g, null, null, this);
    }
}
