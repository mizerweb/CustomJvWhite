package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e7h extends nq4 {
    public rt2 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ f7h g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7h(f7h f7hVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = f7hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return f7h.a(this.g, null, this);
    }
}
