package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tqe extends nq4 {
    public bre d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bre f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqe(bre breVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = breVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return bre.b(this.f, this);
    }
}
