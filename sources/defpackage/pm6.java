package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pm6 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ um6 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm6(um6 um6Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = um6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.l(null, this);
    }
}
