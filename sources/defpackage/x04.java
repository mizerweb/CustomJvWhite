package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x04 extends nq4 {
    public gu4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a14 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x04(a14 a14Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = a14Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return a14.a(this.f, null, this);
    }
}
