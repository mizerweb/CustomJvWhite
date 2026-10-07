package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j76 extends nq4 {
    public vg4 d;
    public tlg e;
    public /* synthetic */ Object f;
    public final /* synthetic */ k76 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j76(k76 k76Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = k76Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return k76.b(this.g, null, null, this);
    }
}
