package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k9k extends nq4 {
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ r9k g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9k(r9k r9kVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = r9kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
