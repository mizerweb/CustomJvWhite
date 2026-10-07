package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a00 extends nq4 {
    public pw d;
    public pw e;
    public ufe f;
    public /* synthetic */ Object g;
    public final /* synthetic */ b00 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(b00 b00Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = b00Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.R(null, null, null, this);
    }
}
