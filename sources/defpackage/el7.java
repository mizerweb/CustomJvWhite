package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class el7 extends nq4 {
    public fda d;
    public long e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ fl7 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el7(fl7 fl7Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = fl7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return fl7.a(this.h, null, null, this);
    }
}
