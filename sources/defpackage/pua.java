package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pua extends nq4 {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sua f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pua(sua suaVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = suaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.o(0L, this, null);
    }
}
