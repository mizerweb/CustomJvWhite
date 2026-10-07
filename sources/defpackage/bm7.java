package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bm7 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ cm7 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm7(cm7 cm7Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = cm7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return cm7.a(this.e, 0L, null, this);
    }
}
