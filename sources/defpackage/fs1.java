package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fs1 extends nq4 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hs1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs1(hs1 hs1Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = hs1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, this);
    }
}
