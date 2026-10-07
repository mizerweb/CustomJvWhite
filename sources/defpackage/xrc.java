package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xrc extends nq4 {
    public er3 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ asc f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrc(asc ascVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = ascVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(this);
    }
}
