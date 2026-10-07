package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tkd extends nq4 {
    public ckd d;
    public cf7 e;
    public wie f;
    public boolean g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ xkd j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkd(xkd xkdVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = xkdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(null, null, null, false, null, this);
    }
}
