package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bh4 extends nq4 {
    public long d;
    public String e;
    public String f;
    public ii4 g;
    public String h;
    public String i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ch4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh4(ch4 ch4Var, nq4 nq4Var) {
        super(nq4Var);
        this.l = ch4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(0L, this, null, null);
    }
}
