package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j65 extends nq4 {
    public String d;
    public qlb e;
    public /* synthetic */ Object f;
    public final /* synthetic */ k65 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j65(k65 k65Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = k65Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, this);
    }
}
