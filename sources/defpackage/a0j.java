package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a0j extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ vmb f;
    public yx6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0j(vmb vmbVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = vmbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
