package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c4k extends BaseAnalyticsEvent {
    public final Object b;
    public final long c;

    public c4k(long j, Object obj) {
        super("vkcm_sdk_client_exchange_intermediate_token");
        this.b = obj;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4k)) {
            return false;
        }
        c4k c4kVar = (c4k) obj;
        return cqk.d(this.b, c4kVar.b) && this.c == c4kVar.c;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        ul9 ul9Var = new ul9();
        ExtensionsKt.setResult$default(ul9Var, this.b, ei6.d, null, 4, null);
        ExtensionsKt.setIntervalMs(ul9Var, this.c);
        return ul9Var.b();
    }

    public final int hashCode() {
        Object obj = this.b;
        return Long.hashCode(this.c) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExchangePushTokenAnalyticsEvent(result=");
        sb.append((Object) roe.b(this.b));
        sb.append(", intervalMs=");
        return zo5.u(sb, this.c, ')');
    }
}
