package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pm3 extends nq4 {
    public j9b d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tm3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm3(tm3 tm3Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = tm3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(this);
    }
}
