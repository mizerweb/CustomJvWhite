package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rz3 extends nq4 {
    public rt2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tz3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz3(tz3 tz3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = tz3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return tz3.b(this.f, this);
    }
}
