package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o9k extends BaseAnalyticsEvent {
    public final String b;

    public o9k(String str) {
        super("vkcm_sdk_client_get_intermediate_token_start");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9k) && cqk.d(this.b, ((o9k) obj).b);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        ul9 ul9Var = new ul9();
        ul9Var.put("master_package_name", this.b);
        return ul9Var.b();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return x05.i(new StringBuilder("GetIntermediateTokenStartAnalyticsEvent(masterPackageName="), this.b, ')');
    }
}
