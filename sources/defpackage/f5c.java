package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f5c extends nq4 {
    public qlb d;
    public d83 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ g5c h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5c(g5c g5cVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = g5cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.e(null, null, this);
    }
}
