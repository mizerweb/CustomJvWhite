package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cgk extends nq4 {
    public vog d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ vog g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgk(vog vogVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = vogVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
