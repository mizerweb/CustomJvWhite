package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ozi extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ fbg f;
    public Object g;
    public yx6 h;
    public l9b i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozi(fbg fbgVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = fbgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
