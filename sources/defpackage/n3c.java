package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n3c extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ o3c e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3c(o3c o3cVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = o3cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return o3c.a(this.e, null, this);
    }
}
