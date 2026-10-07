package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nia extends nq4 {
    public long d;
    public sfa e;
    public /* synthetic */ Object f;
    public final /* synthetic */ oia g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nia(oia oiaVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = oiaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(0L, this);
    }
}
