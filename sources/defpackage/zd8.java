package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zd8 extends nq4 {
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ae8 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd8(ae8 ae8Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = ae8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
