package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d63 extends nq4 {
    public sfa d;
    public /* synthetic */ Object e;
    public final /* synthetic */ l63 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d63(l63 l63Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = l63Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.Y(null, this);
    }
}
