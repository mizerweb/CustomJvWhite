package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wrg extends nq4 {
    public u8b d;
    public l9b e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ asg h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrg(asg asgVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = asgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.j(null, false, this);
    }
}
