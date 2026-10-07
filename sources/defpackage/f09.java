package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f09 extends nq4 {
    public int d;
    public int e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ i09 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f09(i09 i09Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = i09Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
