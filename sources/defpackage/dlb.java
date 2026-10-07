package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dlb extends nq4 {
    public vg4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ flb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlb(flb flbVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = flbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}
