package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nkh extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ okh f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkh(okh okhVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = okhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.m(0L, this);
    }
}
