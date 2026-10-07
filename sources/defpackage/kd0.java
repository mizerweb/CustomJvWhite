package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kd0 extends nq4 {
    public jd0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ld0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd0(ld0 ld0Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = ld0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
