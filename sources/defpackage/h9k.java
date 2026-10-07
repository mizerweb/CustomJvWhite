package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h9k extends nq4 {
    public r9k d;
    public /* synthetic */ Object e;
    public final /* synthetic */ r9k f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9k(r9k r9kVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = r9kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
