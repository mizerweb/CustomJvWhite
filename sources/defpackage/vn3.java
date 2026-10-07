package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class vn3 extends nq4 {
    public long d;
    public Set e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ xn3 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn3(xn3 xn3Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = xn3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.x(0L, null, 0, this);
    }
}
