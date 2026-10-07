package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ggb extends nq4 {
    public mjf d;
    public /* synthetic */ Object e;
    public final /* synthetic */ jgb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggb(jgb jgbVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = jgbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return jgb.e(this.f, null, this);
    }
}
