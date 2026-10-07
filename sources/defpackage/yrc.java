package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yrc extends nq4 {
    public wrc d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ asc g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrc(asc ascVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ascVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return asc.e(this.g, null, this);
    }
}
