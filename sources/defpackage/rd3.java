package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rd3 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ he f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd3(he heVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = heVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
