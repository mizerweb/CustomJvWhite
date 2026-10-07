package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i7k extends BaseAnalyticsEvent {
    public final Object b;

    public i7k(Object obj) {
        super("vkcm_sdk_client_requested_master_host");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7k) && cqk.d(this.b, ((i7k) obj).b);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        ul9 ul9Var = new ul9();
        ExtensionsKt.setResult(ul9Var, this.b, ei6.g, ei6.h);
        return ul9Var.b();
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "MasterHostRequestResultEvent(result=" + ((Object) roe.b(this.b)) + ')';
    }
}
