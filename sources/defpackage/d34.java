package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d34 extends nq4 {
    public long d;
    public long e;
    public int f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ l34 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d34(l34 l34Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = l34Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.v(null, 0L, 0L, 0, false, this);
    }
}
