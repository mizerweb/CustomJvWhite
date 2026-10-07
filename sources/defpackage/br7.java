package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class br7 extends nq4 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ cr7 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br7(cr7 cr7Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = cr7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, 0, this);
    }
}
