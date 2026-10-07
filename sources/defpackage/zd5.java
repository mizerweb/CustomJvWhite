package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zd5 extends nq4 {
    public wfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ae5 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd5(ae5 ae5Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = ae5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ae5.a(this.f, null, this);
    }
}
