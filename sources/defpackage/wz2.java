package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wz2 extends nq4 {
    public long d;
    public boolean e;
    public qf7 f;
    public tw2 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ h03 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz2(h03 h03Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = h03Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(0L, false, null, this);
    }
}
