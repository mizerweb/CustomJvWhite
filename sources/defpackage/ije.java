package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ije extends nq4 {
    public tri d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kje g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ije(kje kjeVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = kjeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, this);
    }
}
