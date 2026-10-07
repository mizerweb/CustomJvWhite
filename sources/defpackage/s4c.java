package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s4c extends nq4 {
    public vg4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ v4c f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4c(v4c v4cVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = v4cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}
