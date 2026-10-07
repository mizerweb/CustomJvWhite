package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hzd extends nq4 {
    public Map d;
    public /* synthetic */ Object e;
    public final /* synthetic */ kzd f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzd(kzd kzdVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = kzdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
