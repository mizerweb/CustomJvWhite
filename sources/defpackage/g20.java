package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g20 extends nq4 {
    public iga d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ p20 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g20(p20 p20Var, lq4 lq4Var) {
        super(lq4Var);
        this.g = p20Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.I(null, this);
    }
}
