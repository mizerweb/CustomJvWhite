package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class q20 extends nq4 {
    public Collection d;
    public rt2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ w20 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q20(w20 w20Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = w20Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.j(null, this);
    }
}
