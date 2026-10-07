package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n73 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ o73 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n73(o73 o73Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = o73Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return o73.a(this.e, null, this);
    }
}
