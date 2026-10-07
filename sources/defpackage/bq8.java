package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bq8 extends nq4 {
    public String d;
    public st2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ cq8 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq8(cq8 cq8Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = cq8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
