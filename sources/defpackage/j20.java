package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class j20 extends nq4 {
    public long d;
    public Collection e;
    public /* synthetic */ Object f;
    public final /* synthetic */ p20 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(p20 p20Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = p20Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.K(0L, this);
    }
}
