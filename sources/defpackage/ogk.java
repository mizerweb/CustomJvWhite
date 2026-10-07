package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ogk extends nq4 {
    public tgk d;
    public j9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tgk g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogk(tgk tgkVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = tgkVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
