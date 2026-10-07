package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qxa extends nq4 {
    public sxa d;
    public u8b e;
    public u8b f;
    public Object[] g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sxa l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxa(sxa sxaVar, nq4 nq4Var) {
        super(nq4Var);
        this.l = sxaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return sxa.a(this.l, null, null, null, this);
    }
}
