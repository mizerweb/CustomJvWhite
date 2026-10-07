package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kh8 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ so5 f;
    public yx6 g;
    public x0c h;
    public ynh i;
    public int j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh8(so5 so5Var, lq4 lq4Var) {
        super(lq4Var);
        this.f = so5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
