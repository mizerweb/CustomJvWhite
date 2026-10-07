package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aua extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ hua e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aua(hua huaVar, lq4 lq4Var) {
        super(lq4Var);
        this.e = huaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.o(null, this);
    }
}
