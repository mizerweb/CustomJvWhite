package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cn4 extends nq4 {
    public dn4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dn4 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn4(dn4 dn4Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = dn4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return dn4.a(this.f, this);
    }
}
