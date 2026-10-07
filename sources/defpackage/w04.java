package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w04 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ js8 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w04(js8 js8Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = js8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.o(this);
    }
}
