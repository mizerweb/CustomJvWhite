package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kbd extends nq4 {
    public ozh d;
    public af4 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ obd g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbd(obd obdVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = obdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(null, this);
    }
}
