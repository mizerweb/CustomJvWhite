package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tl6 extends nq4 {
    public dm6 d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dm6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl6(dm6 dm6Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = dm6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return dm6.a(this.g, null, this);
    }
}
