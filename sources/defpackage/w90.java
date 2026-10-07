package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w90 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ x90 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(x90 x90Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = x90Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
