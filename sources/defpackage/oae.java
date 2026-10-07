package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oae extends nq4 {
    public aae d;
    public eae e;
    public /* synthetic */ Object f;
    public final /* synthetic */ wae g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oae(wae waeVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = waeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, this);
    }
}
