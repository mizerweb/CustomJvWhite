package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.BaseAnalyticsSender;
import com.vk.push.core.feature.FeatureManager;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d4k extends BaseAnalyticsSender {
    public final xva e;
    public final q9k f;

    public d4k(xva xvaVar, q9k q9kVar, AnalyticsTimingsStore analyticsTimingsStore, FeatureManager featureManager, Logger logger) {
        super(featureManager, analyticsTimingsStore, logger.createLogger("ClientAnalyticsSender"), null, 8, null);
        this.e = xvaVar;
        this.f = q9kVar;
    }

    @Override // com.vk.push.core.analytics.BaseAnalyticsSender
    public final Object getBaseParams(lq4 lq4Var) {
        return this.f.a(lq4Var);
    }

    @Override // com.vk.push.core.analytics.BaseAnalyticsSender
    public final Object sendImpl(BaseAnalyticsEvent baseAnalyticsEvent, Map map, lq4 lq4Var) {
        ek2 ek2Var = new ek2(1, p90.B(lq4Var));
        ek2Var.u();
        uxa uxaVar = new uxa(baseAnalyticsEvent.getEventName(), System.currentTimeMillis(), map);
        ri riVar = (ri) this.e.b;
        new g8g(1, new d8g(new g8g(0, new kr0(riVar, 10, uxaVar)), (k1k) riVar.e, 1)).a(new c8g(rl0.e, new ik5(6, ek2Var)));
        Object objS = ek2Var.s();
        return objS == hu4.a ? objS : sbi.a;
    }
}
