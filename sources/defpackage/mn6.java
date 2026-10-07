package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mn6 extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ un6 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn6(un6 un6Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = un6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.o(0L, this);
    }
}
