package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class lre extends nq4 {
    public te7 d;
    public LinkedHashSet e;
    public /* synthetic */ Object f;
    public final /* synthetic */ mre g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lre(mre mreVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = mreVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
