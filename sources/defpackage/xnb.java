package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xnb extends nq4 {
    public rt2 d;
    public long e;
    public long f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ aob i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnb(aob aobVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = aobVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return aob.a(this.i, null, 0L, this);
    }
}
