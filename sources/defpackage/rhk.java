package defpackage;

import com.vk.push.core.domain.model.CallingAppIds;

/* JADX INFO: loaded from: classes3.dex */
public final class rhk extends nq4 {
    public CallingAppIds d;
    public euc e;
    public /* synthetic */ Object f;
    public final /* synthetic */ euc g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhk(euc eucVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = eucVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        Object objF = this.g.f(null, this);
        return objF == hu4.a ? objF : new roe(objF);
    }
}
