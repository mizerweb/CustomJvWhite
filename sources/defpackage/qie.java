package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qie extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rie f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qie(rie rieVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = rieVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, this);
    }
}
