package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e3k extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ k4k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3k(k4k k4kVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = k4kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(this);
    }
}
