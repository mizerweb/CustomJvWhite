package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ioi extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ joi f;
    public yx6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioi(joi joiVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = joiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
