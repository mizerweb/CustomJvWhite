package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vj2 extends nq4 {
    public long d;
    public String e;
    public sfa f;
    public /* synthetic */ Object g;
    public final /* synthetic */ wj2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj2(wj2 wj2Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = wj2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(0L, this, null);
    }
}
