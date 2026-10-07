package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class z27 extends nq4 {
    public ArrayList d;
    public ny8 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ f37 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z27(f37 f37Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = f37Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return f37.C(this.g, null, null, null, this);
    }
}
