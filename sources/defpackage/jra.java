package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jra extends nq4 {
    public l49 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kra f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jra(kra kraVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = kraVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.emit(null, this);
    }
}
