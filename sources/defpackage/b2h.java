package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b2h extends nq4 {
    public long d;
    public boolean e;
    public l9b f;
    public /* synthetic */ Object g;
    public final /* synthetic */ i2h h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2h(i2h i2hVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = i2hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(0L, false, this);
    }
}
