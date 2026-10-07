package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g6j extends nq4 {
    public sfa d;
    public /* synthetic */ Object e;
    public final /* synthetic */ i6j f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6j(i6j i6jVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = i6jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return i6j.B(this.f, this);
    }
}
