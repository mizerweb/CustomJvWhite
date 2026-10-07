package com.vk.push.core.analytics;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.feature.CommonFeaturesKt;
import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import defpackage.ao5;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.gu4;
import defpackage.hu4;
import defpackage.i26;
import defpackage.j95;
import defpackage.lq4;
import defpackage.ore;
import defpackage.p41;
import defpackage.r5h;
import defpackage.sbi;
import defpackage.vp0;
import defpackage.wm9;
import defpackage.wp0;
import defpackage.yab;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH¤@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH¤@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/vk/push/core/analytics/BaseAnalyticsSender;", "Lcom/vk/push/common/analytics/AnalyticsSender;", "Lcom/vk/push/core/feature/FeatureManager;", "featureManager", "Lcom/vk/push/common/analytics/AnalyticsTimingsStore;", "timingsStore", "Lcom/vk/push/common/Logger;", "logger", "Lgu4;", "scope", "<init>", "(Lcom/vk/push/core/feature/FeatureManager;Lcom/vk/push/common/analytics/AnalyticsTimingsStore;Lcom/vk/push/common/Logger;Lgu4;)V", "", "", "getBaseParams", "(Llq4;)Ljava/lang/Object;", "Lcom/vk/push/common/analytics/BaseAnalyticsEvent;", "event", "params", "Lsbi;", "sendImpl", "(Lcom/vk/push/common/analytics/BaseAnalyticsEvent;Ljava/util/Map;Llq4;)Ljava/lang/Object;", "send", "(Lcom/vk/push/common/analytics/BaseAnalyticsEvent;)V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseAnalyticsSender implements AnalyticsSender {
    public final FeatureManager a;
    public final AnalyticsTimingsStore b;
    public final Logger c;
    public final p41 d;

    public BaseAnalyticsSender(FeatureManager featureManager, AnalyticsTimingsStore analyticsTimingsStore, Logger logger, gu4 gu4Var) {
        this.a = featureManager;
        this.b = analyticsTimingsStore;
        this.c = logger;
        this.d = yab.b(-2, 1, null, 4);
        yab.i0(gu4Var, null, 0, new i26(this, (lq4) null, 11), 3);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$handleEvent(BaseAnalyticsSender baseAnalyticsSender, BaseAnalyticsEvent baseAnalyticsEvent, lq4 lq4Var) {
        vp0 vp0Var;
        BaseAnalyticsSender baseAnalyticsSender2;
        BaseAnalyticsEvent baseAnalyticsEvent2;
        LinkedHashMap linkedHashMapT0;
        baseAnalyticsSender.getClass();
        if (lq4Var instanceof vp0) {
            vp0Var = (vp0) lq4Var;
            int i = vp0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                vp0Var.h = i - Integer.MIN_VALUE;
            } else {
                vp0Var = new vp0(baseAnalyticsSender, lq4Var);
            }
        } else {
            vp0Var = new vp0(baseAnalyticsSender, lq4Var);
        }
        Object objA = vp0Var.f;
        int i2 = vp0Var.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objA);
            vp0Var.d = baseAnalyticsSender;
            vp0Var.e = baseAnalyticsEvent;
            vp0Var.h = 1;
            objA = baseAnalyticsSender.a(baseAnalyticsEvent, vp0Var);
            if (objA != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            baseAnalyticsEvent = vp0Var.e;
            baseAnalyticsSender = vp0Var.d;
            ch3.d0(objA);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(objA);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            baseAnalyticsEvent2 = vp0Var.e;
            baseAnalyticsSender2 = vp0Var.d;
            ch3.d0(objA);
        }
        linkedHashMapT0 = wm9.T0((Map) objA, baseAnalyticsEvent2.getParams());
        baseAnalyticsSender2.getClass();
        vp0Var.d = null;
        vp0Var.e = null;
        vp0Var.h = 3;
        if (baseAnalyticsSender2.sendImpl(baseAnalyticsEvent2, linkedHashMapT0, vp0Var) != hu4Var) {
            return hu4Var;
        }
        return sbiVar;
        if (!((Boolean) objA).booleanValue()) {
            baseAnalyticsSender.getClass();
            return sbiVar;
        }
        vp0Var.d = baseAnalyticsSender;
        vp0Var.e = baseAnalyticsEvent;
        vp0Var.h = 2;
        objA = baseAnalyticsSender.getBaseParams(vp0Var);
        if (objA != hu4Var) {
            BaseAnalyticsEvent baseAnalyticsEvent3 = baseAnalyticsEvent;
            baseAnalyticsSender2 = baseAnalyticsSender;
            baseAnalyticsEvent2 = baseAnalyticsEvent3;
            linkedHashMapT0 = wm9.T0((Map) objA, baseAnalyticsEvent2.getParams());
            baseAnalyticsSender2.getClass();
            vp0Var.d = null;
            vp0Var.e = null;
            vp0Var.h = 3;
            if (baseAnalyticsSender2.sendImpl(baseAnalyticsEvent2, linkedHashMapT0, vp0Var) != hu4Var) {
                return sbiVar;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(BaseAnalyticsEvent baseAnalyticsEvent, lq4 lq4Var) {
        wp0 wp0Var;
        if (lq4Var instanceof wp0) {
            wp0Var = (wp0) lq4Var;
            int i = wp0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                wp0Var.g = i - Integer.MIN_VALUE;
            } else {
                wp0Var = new wp0(this, lq4Var);
            }
        } else {
            wp0Var = new wp0(this, lq4Var);
        }
        Object featureValue = wp0Var.e;
        int i2 = wp0Var.g;
        if (i2 == 0) {
            ch3.d0(featureValue);
            Feature.StringFeature analyticsEventsBlackList = CommonFeaturesKt.getAnalyticsEventsBlackList();
            wp0Var.d = baseAnalyticsEvent;
            wp0Var.g = 1;
            featureValue = this.a.getFeatureValue(analyticsEventsBlackList, wp0Var);
            hu4 hu4Var = hu4.a;
            if (featureValue == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            baseAnalyticsEvent = wp0Var.d;
            ch3.d0(featureValue);
        }
        return Boolean.valueOf(!r5h.m1((CharSequence) featureValue, new String[]{","}, 6).contains(baseAnalyticsEvent.getEventName()));
    }

    public abstract Object getBaseParams(lq4 lq4Var);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.push.common.analytics.AnalyticsSender
    public void send(BaseAnalyticsEvent event) {
        this.b.storeTiming((Class<? extends BaseAnalyticsEvent>) event.getClass());
        this.d.c(event);
    }

    public abstract Object sendImpl(BaseAnalyticsEvent baseAnalyticsEvent, Map<String, String> map, lq4 lq4Var);

    public /* synthetic */ BaseAnalyticsSender(FeatureManager featureManager, AnalyticsTimingsStore analyticsTimingsStore, Logger logger, gu4 gu4Var, int i, j95 j95Var) {
        this(featureManager, analyticsTimingsStore, logger, (i & 8) != 0 ? cqk.a(CoroutineExtensionsKt.getSingleThread(ao5.a)) : gu4Var);
    }
}
