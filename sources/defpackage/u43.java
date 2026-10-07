package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u43 extends nq4 {
    public w7a d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x43 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u43(x43 x43Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = x43Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return x43.E(this.f, null, this);
    }
}
