package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m5j extends nq4 {
    public e70 d;
    public d70 e;
    public long f;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ n5j i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5j(n5j n5jVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = n5jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(null, 0L, 0L, false, this);
    }
}
