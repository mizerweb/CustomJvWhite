package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class is1 extends nq4 {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ js1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is1(js1 js1Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = js1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, null, false, 0L, this);
    }
}
