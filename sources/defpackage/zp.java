package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zp extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ aq e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(aq aqVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = aqVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.u(this);
    }
}
