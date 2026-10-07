package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g9g extends nq4 {
    public m9g d;
    public /* synthetic */ Object e;
    public final /* synthetic */ m9g f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9g(m9g m9gVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = m9gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(this);
    }
}
