package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fjb extends nq4 {
    public jkb d;
    public st2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ gjb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjb(gjb gjbVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = gjbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
