package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kgj extends nq4 {
    public igj d;
    public ogj e;
    public es8 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ lgj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgj(lgj lgjVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = lgjVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, this);
    }
}
