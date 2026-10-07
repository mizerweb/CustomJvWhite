package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y2h extends nq4 {
    public zzg d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ b3h g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2h(b3h b3hVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = b3hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return b3h.a(this.g, null, null, this);
    }
}
