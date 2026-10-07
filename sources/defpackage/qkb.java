package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qkb extends nq4 {
    public pkb d;
    public /* synthetic */ Object e;
    public final /* synthetic */ rkb f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkb(rkb rkbVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = rkbVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
