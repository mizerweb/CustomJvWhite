package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iz6 extends nq4 {
    public vmb d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vmb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz6(vmb vmbVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = vmbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
