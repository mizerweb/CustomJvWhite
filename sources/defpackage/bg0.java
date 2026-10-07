package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bg0 extends nq4 {
    public ArrayList d;
    public b9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dg0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(dg0 dg0Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = dg0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, this);
    }
}
