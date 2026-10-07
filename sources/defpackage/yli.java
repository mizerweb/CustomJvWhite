package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yli extends nq4 {
    public wfe d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zli f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yli(zli zliVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = zliVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, null, null, null, null, this);
    }
}
