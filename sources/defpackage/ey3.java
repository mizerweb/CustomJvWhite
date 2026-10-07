package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ey3 extends nq4 {
    public q24 d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hy3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey3(hy3 hy3Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = hy3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, null, this);
    }
}
