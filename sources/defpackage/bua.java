package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bua extends nq4 {
    public kmb d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hua f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bua(hua huaVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = huaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return hua.b(this.f, null, this);
    }
}
