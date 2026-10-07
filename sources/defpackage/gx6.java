package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gx6 extends nq4 {
    public ArrayList d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ix6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx6(ix6 ix6Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = ix6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(this);
    }
}
