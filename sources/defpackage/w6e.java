package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class w6e extends nq4 {
    public r5b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x6e f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6e(x6e x6eVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = x6eVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return x6e.a(this.f, null, this);
    }
}
