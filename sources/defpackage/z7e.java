package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z7e extends nq4 {
    public x7e d;
    public s5e e;
    public /* synthetic */ Object f;
    public final /* synthetic */ a8e g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7e(a8e a8eVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = a8eVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return a8e.B(this.g, null, this);
    }
}
