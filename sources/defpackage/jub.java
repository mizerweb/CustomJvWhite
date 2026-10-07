package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jub extends nq4 {
    public cvb d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kub g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jub(kub kubVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = kubVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
