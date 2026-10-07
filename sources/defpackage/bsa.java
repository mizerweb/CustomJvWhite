package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bsa extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ jsa e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsa(jsa jsaVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = jsaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.A0(null, this);
    }
}
