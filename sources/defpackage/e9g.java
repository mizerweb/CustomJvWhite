package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e9g extends nq4 {
    public Object d;
    public Object e;
    public Object f;
    public wfe g;
    public m9g h;
    public /* synthetic */ Object i;
    public final /* synthetic */ f9g j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9g(f9g f9gVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = f9gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
