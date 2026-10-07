package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v04 extends nq4 {
    public sfa d;
    public /* synthetic */ Object e;
    public final /* synthetic */ js8 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v04(js8 js8Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = js8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.m(null, this);
    }
}
