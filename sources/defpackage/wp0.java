package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.BaseAnalyticsSender;

/* JADX INFO: loaded from: classes4.dex */
public final class wp0 extends nq4 {
    public BaseAnalyticsEvent d;
    public /* synthetic */ Object e;
    public final /* synthetic */ BaseAnalyticsSender f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(BaseAnalyticsSender baseAnalyticsSender, lq4 lq4Var) {
        super(lq4Var);
        this.f = baseAnalyticsSender;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
