package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i9k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ r9k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9k(r9k r9kVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = r9kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
