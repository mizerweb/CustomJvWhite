package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class v17 extends nq4 {
    public r17 d;
    public r17 e;
    public LinkedHashSet f;
    public LinkedHashSet g;
    public /* synthetic */ Object h;
    public final /* synthetic */ w17 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v17(w17 w17Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = w17Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return w17.f(this.i, null, null, this);
    }
}
