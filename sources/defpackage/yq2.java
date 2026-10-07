package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yq2 extends nq4 {
    public Throwable d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ar2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq2(ar2 ar2Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = ar2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ar2.C(this.f, null, this);
    }
}
