package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fgi extends nq4 {
    public vfi d;
    public kp4 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ zgi g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgi(zgi zgiVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = zgiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.g(null, null, this);
    }
}
