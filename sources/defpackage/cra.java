package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cra extends nq4 {
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ jsa f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cra(jsa jsaVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = jsaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return jsa.E(this.f, 0L, this);
    }
}
