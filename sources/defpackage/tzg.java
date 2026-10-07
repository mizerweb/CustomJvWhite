package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tzg extends nq4 {
    public int d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ vzg g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzg(vzg vzgVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = vzgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return vzg.b(this.g, 0, this);
    }
}
