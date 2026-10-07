package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jtg extends nq4 {
    public long d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ltg g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtg(ltg ltgVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = ltgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(0L, this);
    }
}
