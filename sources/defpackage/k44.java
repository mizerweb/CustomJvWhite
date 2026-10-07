package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k44 extends nq4 {
    public ms8 d;
    public pkj e;
    public String f;
    public /* synthetic */ Object g;
    public final /* synthetic */ l44 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k44(l44 l44Var, lq4 lq4Var) {
        super(lq4Var);
        this.h = l44Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, null, null, this);
    }
}
