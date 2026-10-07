package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zgf extends nq4 {
    public zyg d;
    public CharSequence e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ahf h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgf(ahf ahfVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = ahfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, 0L, null, this);
    }
}
