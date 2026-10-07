package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mwg extends nq4 {
    public qwg d;
    public ptf e;
    public hxg f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ qwg i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwg(qwg qwgVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = qwgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return qwg.g(this.i, null, null, this);
    }
}
