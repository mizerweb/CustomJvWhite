package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class km6 extends nq4 {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ um6 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km6(um6 um6Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = um6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return um6.b(this.f, null, this);
    }
}
