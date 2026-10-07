package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q9d extends nq4 {
    public c79 d;
    public c79 e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ s9d h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9d(s9d s9dVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = s9dVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return s9d.B(this.h, null, false, null, false, this);
    }
}
