package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mbd extends nq4 {
    public Object d;
    public Throwable e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ obd h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbd(obd obdVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = obdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.g(null, null, this);
    }
}
