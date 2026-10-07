package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rka extends nq4 {
    public Long d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tka g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rka(tka tkaVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = tkaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.u(0L, null, null, this);
    }
}
