package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class sn3 extends nq4 {
    public Set d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xn3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn3(xn3 xn3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = xn3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.q(0L, null, this);
    }
}
