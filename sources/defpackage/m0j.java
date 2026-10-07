package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m0j extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ n0j e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0j(n0j n0jVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = n0jVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return n0j.a(this.e, null, this);
    }
}
