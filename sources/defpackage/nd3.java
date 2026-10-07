package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nd3 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ xd3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd3(xd3 xd3Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = xd3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b0(this);
    }
}
