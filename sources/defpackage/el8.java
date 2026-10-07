package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class el8 extends nq4 {
    public int d;
    public int e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ gl8 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el8(gl8 gl8Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = gl8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(0, 0, this);
    }
}
