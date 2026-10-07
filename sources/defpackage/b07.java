package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b07 extends nq4 {
    public vmb d;
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ vmb g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b07(vmb vmbVar, lq4 lq4Var) {
        super(lq4Var);
        this.g = vmbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
