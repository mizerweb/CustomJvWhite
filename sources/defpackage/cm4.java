package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cm4 extends nq4 {
    public long d;
    public String e;
    public String f;
    public fi4 g;
    public String h;
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dm4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm4(dm4 dm4Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = dm4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, this, null, null);
    }
}
