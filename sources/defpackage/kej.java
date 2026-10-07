package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kej extends nq4 {
    public kx0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rej f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kej(rej rejVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = rejVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.i(null, null, this);
    }
}
