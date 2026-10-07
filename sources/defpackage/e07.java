package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e07 extends nq4 {
    public he d;
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ he g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e07(he heVar, lq4 lq4Var) {
        super(lq4Var);
        this.g = heVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.emit(null, this);
    }
}
