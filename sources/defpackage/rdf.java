package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rdf extends nq4 {
    public sdf d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sdf f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdf(sdf sdfVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = sdfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(this);
    }
}
