package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class bu0 extends nq4 {
    public String d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ du0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu0(du0 du0Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = du0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return du0.h(this.g, null, null, this);
    }
}
