package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i8i extends nq4 {
    public c79 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ k8i f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8i(k8i k8iVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = k8iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return k8i.B(this.f, null, this);
    }
}
