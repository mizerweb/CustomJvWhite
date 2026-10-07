package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tsc extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ usc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsc(usc uscVar, lq4 lq4Var) {
        super(lq4Var);
        this.e = uscVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        usc.g(this.e, null, this);
        return hu4.a;
    }
}
