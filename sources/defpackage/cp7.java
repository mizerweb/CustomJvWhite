package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class cp7 extends nq4 {
    public String d;
    public Serializable e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ep7 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp7(ep7 ep7Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = ep7Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return ep7.a(this.g, null, this);
    }
}
