package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d37 extends nq4 {
    public r17 d;
    public pw e;
    public Iterator f;
    public /* synthetic */ Object g;
    public final /* synthetic */ f37 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d37(f37 f37Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = f37Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.R(null, this);
    }
}
