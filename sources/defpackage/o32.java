package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o32 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ p32 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o32(p32 p32Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = p32Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h(this);
    }
}
