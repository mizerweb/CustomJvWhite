package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hg3 extends nq4 {
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ig3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg3(ig3 ig3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = ig3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, false, this);
    }
}
