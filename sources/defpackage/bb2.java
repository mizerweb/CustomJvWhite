package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bb2 extends nq4 {
    public i64 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ db2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb2(db2 db2Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = db2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(0L, this);
    }
}
