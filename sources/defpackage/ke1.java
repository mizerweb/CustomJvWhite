package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ke1 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ le1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke1(le1 le1Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = le1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
