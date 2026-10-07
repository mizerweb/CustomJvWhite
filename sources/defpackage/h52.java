package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h52 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ j52 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h52(j52 j52Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = j52Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return j52.a(this.e, this);
    }
}
