package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l5f extends nq4 {
    public j6f d;
    public l9b e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ n5f h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5f(n5f n5fVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = n5fVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return n5f.a(this.h, null, false, this);
    }
}
