package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dua extends nq4 {
    public d83 d;
    public String e;
    public qlb f;
    public int g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ hua j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dua(hua huaVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = huaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.s(null, null, null, false, 0, 0L, null, null, this);
    }
}
