package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lka extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ nka e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lka(nka nkaVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = nkaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return nka.b(this.e, this);
    }
}
