package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uec extends nq4 {
    public Object d;
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ vec g;
    public sfe h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uec(vec vecVar, lq4 lq4Var) {
        super(lq4Var);
        this.g = vecVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
