package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dhk extends nq4 {
    public tgk d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tgk f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhk(tgk tgkVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = tgkVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return tgk.b(this.f, this);
    }
}
