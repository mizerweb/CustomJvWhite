package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ki5 extends nq4 {
    public azg d;
    public yqg e;
    public long f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ aj5 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki5(aj5 aj5Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = aj5Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(null, 0L, this);
    }
}
