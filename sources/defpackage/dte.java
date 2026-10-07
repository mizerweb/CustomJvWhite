package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dte extends nq4 {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vre f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dte(vre vreVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = vreVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return vre.l(this.f, this);
    }
}
