package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k93 extends nq4 {
    public long d;
    public long e;
    public long f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ l93 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k93(l93 l93Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = l93Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(0L, 0L, 0L, false, this);
    }
}
