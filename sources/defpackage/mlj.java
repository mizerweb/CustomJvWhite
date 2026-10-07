package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mlj extends nq4 {
    public klj d;
    public glj e;
    public mgb f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qlj h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlj(qlj qljVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = qljVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.i(null, this);
    }
}
