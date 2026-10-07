package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u20 extends nq4 {
    public rt2 d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ w20 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(w20 w20Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = w20Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, null, this);
    }
}
