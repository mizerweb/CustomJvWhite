package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iv6 extends nq4 {
    public long d;
    public long e;
    public rt2 f;
    public sfa g;
    public /* synthetic */ Object h;
    public final /* synthetic */ jv6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv6(jv6 jv6Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = jv6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(0L, 0L, this);
    }
}
