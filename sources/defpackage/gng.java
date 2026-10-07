package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gng extends nq4 {
    public my d;
    public long e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ing h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gng(ing ingVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = ingVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, 0L, 0, this);
    }
}
