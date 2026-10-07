package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bfb extends nq4 {
    public j9b d;
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ kfb h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfb(kfb kfbVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = kfbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(this);
    }
}
