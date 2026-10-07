package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class egi extends nq4 {
    public j9b d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ zgi g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egi(zgi zgiVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = zgiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(this);
    }
}
