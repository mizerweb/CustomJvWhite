package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cva extends nq4 {
    public rt2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fva f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cva(fva fvaVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = fvaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
