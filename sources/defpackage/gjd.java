package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gjd extends nq4 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ g85 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjd(g85 g85Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = g85Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        g85.u(this.f, this);
        return hu4.a;
    }
}
