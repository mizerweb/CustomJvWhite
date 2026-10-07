package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kgc extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ t6b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgc(t6b t6bVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = t6bVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
