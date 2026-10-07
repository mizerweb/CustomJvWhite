package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i0h extends nq4 {
    public long d;
    public float e;
    public l9b f;
    public /* synthetic */ Object g;
    public final /* synthetic */ n0h h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0h(n0h n0hVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = n0hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(0L, 0.0f, this);
    }
}
