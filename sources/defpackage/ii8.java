package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ii8 extends nq4 {
    public uy3 d;
    public c46 e;
    public Iterator f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ki8 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii8(ki8 ki8Var, nq4 nq4Var) {
        super(nq4Var);
        this.h = ki8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, null, this);
    }
}
