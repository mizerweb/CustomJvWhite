package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r9d extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ s9d e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9d(s9d s9dVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = s9dVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.E(this);
    }
}
