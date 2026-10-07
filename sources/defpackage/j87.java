package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j87 extends nq4 {
    public k87 d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ k87 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j87(k87 k87Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = k87Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(0L, this, null, false);
    }
}
