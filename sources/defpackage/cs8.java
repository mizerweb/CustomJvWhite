package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cs8 extends nq4 {
    public qf7 d;
    public es8 e;
    public Object f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ es8 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs8(es8 es8Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = es8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.d(null, this);
    }
}
