package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m23 extends nq4 {
    public e70 d;
    public sfa e;
    public j60 f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ n23 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m23(n23 n23Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = n23Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return n23.C(this.i, null, null, null, this);
    }
}
