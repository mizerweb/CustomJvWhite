package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p83 extends nq4 {
    public Set d;
    public g83 e;
    public g83 f;
    public l8b g;
    public /* synthetic */ Object h;
    public final /* synthetic */ t83 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p83(t83 t83Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = t83Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.g(null, null, null, null, null, this);
    }
}
