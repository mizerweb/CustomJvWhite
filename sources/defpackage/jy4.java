package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jy4 extends nq4 {
    public vy2 d;
    public rqe e;
    public /* synthetic */ Object f;
    public final /* synthetic */ sy4 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy4(sy4 sy4Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = sy4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return sy4.a(this.g, 0, null, this);
    }
}
