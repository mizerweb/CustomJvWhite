package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q13 extends nq4 {
    public x7a d;
    public tnh e;
    public ynh f;
    public /* synthetic */ Object g;
    public final /* synthetic */ r13 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q13(r13 r13Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = r13Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, null, null, this);
    }
}
