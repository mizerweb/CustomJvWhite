package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fm7 extends nq4 {
    public gm7 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ gm7 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm7(gm7 gm7Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = gm7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        Object objA = this.f.a(0L, null, 0L, null, 0, this);
        return objA == hu4.a ? objA : new roe(objA);
    }
}
