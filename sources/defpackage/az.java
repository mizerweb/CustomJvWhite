package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class az extends nq4 {
    public Collection d;
    public /* synthetic */ Object e;
    public final /* synthetic */ u50 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(u50 u50Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = u50Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.j(null, this);
    }
}
