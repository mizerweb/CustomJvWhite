package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sn2 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ un2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn2(un2 un2Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = un2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
