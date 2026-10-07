package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zef extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ hff e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zef(hff hffVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = hffVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return hff.C(this.e, null, null, null, this);
    }
}
