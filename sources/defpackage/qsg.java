package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qsg extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ssg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsg(ssg ssgVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = ssgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
