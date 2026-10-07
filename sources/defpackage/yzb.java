package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yzb extends nq4 {
    public mm9 d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ d0c h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzb(d0c d0cVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = d0cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, 0, 0, 0, 0, this);
    }
}
