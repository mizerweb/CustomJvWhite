package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yg9 extends nq4 {
    public long d;
    public long e;
    public et3 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ zg9 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg9(zg9 zg9Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = zg9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
