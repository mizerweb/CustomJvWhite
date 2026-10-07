package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hgi extends nq4 {
    public ahi d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ zgi g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgi(zgi zgiVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = zgiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.k(null, this);
    }
}
