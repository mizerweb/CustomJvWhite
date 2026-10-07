package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vl7 extends nq4 {
    public long d;
    public long e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ wl7 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl7(wl7 wl7Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = wl7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(0L, 0L, null, this);
    }
}
