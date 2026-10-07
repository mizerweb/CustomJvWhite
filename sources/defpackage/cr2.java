package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cr2 extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dr2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr2(dr2 dr2Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = dr2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, this, null, null);
    }
}
