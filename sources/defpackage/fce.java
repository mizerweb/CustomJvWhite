package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fce extends nq4 {
    public fbe d;
    public g4b e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ jce h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fce(jce jceVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = jceVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return jce.B(this.h, null, 0L, null, null, false, this);
    }
}
