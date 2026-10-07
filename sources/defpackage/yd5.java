package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yd5 extends nq4 {
    public String d;
    public wfe e;
    public wfe f;
    public wfe g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ae5 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd5(ae5 ae5Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = ae5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(null, null, null, null, this);
    }
}
