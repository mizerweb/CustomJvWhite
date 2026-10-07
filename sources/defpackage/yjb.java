package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yjb extends nq4 {
    public xjb d;
    public rt2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ zjb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjb(zjb zjbVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = zjbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
