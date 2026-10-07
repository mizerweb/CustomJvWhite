package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t53 extends nq4 {
    public qy9 d;
    public p20 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l63 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t53(l63 l63Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = l63Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return l63.B(this.g, null, this);
    }
}
