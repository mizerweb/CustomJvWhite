package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cgh extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ hgh e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgh(hgh hghVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = hghVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(this);
    }
}
