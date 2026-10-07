package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class udi extends nq4 {
    public q3b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vdi f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udi(vdi vdiVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = vdiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, this);
    }
}
