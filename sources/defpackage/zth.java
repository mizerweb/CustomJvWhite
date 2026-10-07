package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zth extends nq4 {
    public jrc d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ guh g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zth(guh guhVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = guhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.i(null, this);
    }
}
