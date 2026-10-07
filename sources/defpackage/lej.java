package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lej extends nq4 {
    public jx0 d;
    public cx0 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ rej g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lej(rej rejVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = rejVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return rej.b(this.g, null, null, this);
    }
}
