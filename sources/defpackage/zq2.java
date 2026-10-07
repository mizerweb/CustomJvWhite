package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zq2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ar2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq2(ar2 ar2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = ar2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.D(this);
    }
}
