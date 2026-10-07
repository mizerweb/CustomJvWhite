package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bv0 extends nq4 {
    public boolean d;
    public boolean e;
    public mjg f;
    public /* synthetic */ Object g;
    public final /* synthetic */ cv0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0(cv0 cv0Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = cv0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(false, false, this);
    }
}
