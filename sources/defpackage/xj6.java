package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xj6 extends nq4 {
    public vg4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ yj6 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj6(yj6 yj6Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = yj6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, null, this);
    }
}
