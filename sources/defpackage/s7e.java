package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s7e extends nq4 {
    public sfa d;
    public /* synthetic */ Object e;
    public final /* synthetic */ u7e f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7e(u7e u7eVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = u7eVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.B(null, null, this);
    }
}
