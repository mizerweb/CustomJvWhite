package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class on2 extends nq4 {
    public ln2 d;
    public un2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ un2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on2(un2 un2Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = un2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}
