package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mn3 extends nq4 {
    public long d;
    public List e;
    public boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ xn3 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn3(xn3 xn3Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = xn3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(0L, this, null, false);
    }
}
