package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wnc extends nq4 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ znc f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnc(znc zncVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = zncVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(null, null, this);
    }
}
