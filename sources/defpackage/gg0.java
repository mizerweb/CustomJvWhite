package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gg0 extends nq4 {
    public gof d;
    public /* synthetic */ Object e;
    public final /* synthetic */ jg0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg0(jg0 jg0Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = jg0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
