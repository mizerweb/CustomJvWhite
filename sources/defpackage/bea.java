package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bea extends nq4 {
    public rt2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ cea f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bea(cea ceaVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = ceaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.n(null, this);
    }
}
