package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hje extends nq4 {
    public String d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kje g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hje(kje kjeVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = kjeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
