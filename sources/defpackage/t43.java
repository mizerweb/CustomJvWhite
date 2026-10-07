package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t43 extends nq4 {
    public t7a d;
    public rt2 e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ x43 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t43(x43 x43Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = x43Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return x43.C(this.h, null, this);
    }
}
