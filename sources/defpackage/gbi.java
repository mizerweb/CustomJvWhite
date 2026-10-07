package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gbi extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ hbi f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbi(hbi hbiVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = hbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, this);
    }
}
