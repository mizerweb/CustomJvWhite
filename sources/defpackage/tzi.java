package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tzi extends nq4 {
    public l9b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xzi f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzi(xzi xziVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = xziVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(this);
    }
}
