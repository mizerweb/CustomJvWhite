package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b3k extends nq4 {
    public k4k d;
    public j9b e;
    public xr8 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ k4k h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3k(k4k k4kVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = k4kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(this);
    }
}
