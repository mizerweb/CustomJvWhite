package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.BaseAnalyticsSender;

/* JADX INFO: loaded from: classes4.dex */
public final class vp0 extends nq4 {
    public BaseAnalyticsSender d;
    public BaseAnalyticsEvent e;
    public /* synthetic */ Object f;
    public final /* synthetic */ BaseAnalyticsSender g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp0(BaseAnalyticsSender baseAnalyticsSender, lq4 lq4Var) {
        super(lq4Var);
        this.g = baseAnalyticsSender;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return BaseAnalyticsSender.access$handleEvent(this.g, null, this);
    }
}
