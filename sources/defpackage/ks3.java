package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ks3 extends nq4 {
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ns3 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks3(ns3 ns3Var, nq4 nq4Var) {
        super(nq4Var);
        this.j = ns3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
