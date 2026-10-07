package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hkh extends nq4 {
    public List d;
    public v44 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ okh g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkh(okh okhVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = okhVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
