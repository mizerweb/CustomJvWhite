package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ame extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ dme e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ame(dme dmeVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = dmeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.l(this);
    }
}
