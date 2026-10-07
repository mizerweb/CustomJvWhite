package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fg3 extends nq4 {
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ gg3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg3(gg3 gg3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = gg3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(0L, false, this);
    }
}
