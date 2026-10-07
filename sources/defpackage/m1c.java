package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m1c extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ o1c e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1c(o1c o1cVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = o1cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        this.e.a(null, null, this);
        return hu4.a;
    }
}
