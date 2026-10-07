package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hni extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ phf e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hni(phf phfVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = phfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.w(this);
    }
}
