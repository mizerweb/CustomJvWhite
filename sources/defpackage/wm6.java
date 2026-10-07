package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wm6 extends nq4 {
    public an6 d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ an6 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm6(an6 an6Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = an6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return an6.c(this.g, null, this);
    }
}
