package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qm2 extends nq4 {
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rm2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm2(rm2 rm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = rm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, 0, null, 0, 0, 0, this);
    }
}
