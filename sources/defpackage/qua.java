package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qua extends nq4 {
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sua f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qua(sua suaVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = suaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.q(0L, 0L, 0L, false, 0, null, this);
    }
}
