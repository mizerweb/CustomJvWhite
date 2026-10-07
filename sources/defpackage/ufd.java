package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ufd extends nq4 {
    public akb d;
    public my2 e;
    public ex9 f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ vfd i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufd(vfd vfdVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = vfdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(null, null, null, this);
    }
}
