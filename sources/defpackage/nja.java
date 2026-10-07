package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nja extends nq4 {
    public long d;
    public List e;
    public w3b f;
    public /* synthetic */ Object g;
    public final /* synthetic */ pja h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nja(pja pjaVar, nq4 nq4Var) {
        super(nq4Var);
        this.h = pjaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.u(0L, null, null, this);
    }
}
