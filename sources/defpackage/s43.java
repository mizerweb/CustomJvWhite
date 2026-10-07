package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s43 extends nq4 {
    public l49 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ f90 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s43(f90 f90Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = f90Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
