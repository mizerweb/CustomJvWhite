package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i87 extends nq4 {
    public k87 d;
    public boolean e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ k87 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i87(k87 k87Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = k87Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, false, false, this);
    }
}
