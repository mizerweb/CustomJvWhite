package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m7h extends nq4 {
    public n7h d;
    public yxe e;
    public /* synthetic */ Object f;
    public final /* synthetic */ n7h g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7h(n7h n7hVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = n7hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}
