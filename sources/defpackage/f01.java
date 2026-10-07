package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f01 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ l01 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f01(l01 l01Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = l01Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
