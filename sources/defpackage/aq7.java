package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aq7 extends nq4 {
    public l9b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bq7 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq7(bq7 bq7Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = bq7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(this);
    }
}
