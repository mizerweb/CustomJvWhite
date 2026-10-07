package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ved extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ ted f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ved(ted tedVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = tedVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
