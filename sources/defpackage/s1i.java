package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s1i extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ u1i e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1i(u1i u1iVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = u1iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
