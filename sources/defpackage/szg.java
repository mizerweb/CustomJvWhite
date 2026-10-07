package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class szg extends nq4 {
    public rzg d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vzg f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szg(vzg vzgVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = vzgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return vzg.a(this.f, null, this);
    }
}
