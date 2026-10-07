package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cze extends nq4 {
    public o60 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dze f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cze(dze dzeVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = dzeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
