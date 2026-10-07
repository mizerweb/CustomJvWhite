package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yse extends nq4 {
    public ate d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ate f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yse(ate ateVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = ateVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, this);
    }
}
