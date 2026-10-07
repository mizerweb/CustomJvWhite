package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cc3 extends nq4 {
    public int d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ldf g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc3(ldf ldfVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ldfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(0L, 0, null, null, false, this);
    }
}
