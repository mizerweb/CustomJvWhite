package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nz5 extends nq4 {
    public q24 d;
    public CharSequence e;
    public s04 f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ oz5 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz5(oz5 oz5Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = oz5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, 0L, null, this);
    }
}
