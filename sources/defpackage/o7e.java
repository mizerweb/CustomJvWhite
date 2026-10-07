package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o7e extends nq4 {
    public hja d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u7e g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7e(u7e u7eVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = u7eVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.w(null, 0L, null, this);
    }
}
