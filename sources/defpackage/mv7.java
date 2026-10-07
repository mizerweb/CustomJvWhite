package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mv7 extends nq4 {
    public long d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ nv7 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv7(nv7 nv7Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = nv7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(0L, false, this);
    }
}
