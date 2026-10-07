package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ora extends nq4 {
    public jna d;
    public rt2 e;
    public long f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ jsa i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ora(jsa jsaVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = jsaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return jsa.H(this.i, null, null, this);
    }
}
