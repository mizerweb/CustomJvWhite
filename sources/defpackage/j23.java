package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j23 extends nq4 {
    public String d;
    public d70 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ n23 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j23(n23 n23Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = n23Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return n23.B(this.g, null, null, null, this);
    }
}
