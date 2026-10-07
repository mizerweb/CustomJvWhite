package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lb8 extends nq4 {
    public String d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ rb8 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb8(rb8 rb8Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = rb8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.h(null, false, this);
    }
}
