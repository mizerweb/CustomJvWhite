package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q2k extends nq4 {
    public l4k d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l4k g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2k(l4k l4kVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = l4kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
