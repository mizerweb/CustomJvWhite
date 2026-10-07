package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cuh extends nq4 {
    public jrc d;
    public long e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ guh h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuh(guh guhVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = guhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.m(null, this);
    }
}
