package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lig extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ fbg e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lig(fbg fbgVar, lq4 lq4Var) {
        super(lq4Var);
        this.e = fbgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(0, this);
    }
}
