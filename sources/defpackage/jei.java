package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jei extends nq4 {
    public long d;
    public long e;
    public int f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ lei i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jei(lei leiVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = leiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(0L, 0L, 0L, 0, false, false, this);
    }
}
