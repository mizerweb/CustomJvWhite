package defpackage;

import com.vk.push.common.analytics.AnalyticsSender;

/* JADX INFO: loaded from: classes3.dex */
public final class whk extends nq4 {
    public efk d;
    public AnalyticsSender e;
    public /* synthetic */ Object f;
    public final /* synthetic */ efk g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whk(efk efkVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = efkVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return efk.b(this.g, this);
    }
}
