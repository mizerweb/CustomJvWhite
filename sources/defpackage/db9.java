package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class db9 extends nq4 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fb9 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db9(fb9 fb9Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = fb9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(0L, this);
    }
}
