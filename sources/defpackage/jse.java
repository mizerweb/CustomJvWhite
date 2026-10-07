package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jse extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ose f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jse(ose oseVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = oseVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.s(0L, this);
    }
}
