package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l7k extends BaseAnalyticsEvent {
    public final String b;
    public final Object c;
    public final long d;

    public l7k(String str, Object obj, long j) {
        super("vkcm_sdk_client_get_intermediate_token_finish");
        this.b = str;
        this.c = obj;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7k)) {
            return false;
        }
        l7k l7kVar = (l7k) obj;
        return cqk.d(this.b, l7kVar.b) && cqk.d(this.c, l7kVar.c) && this.d == l7kVar.d;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        ul9 ul9Var = new ul9();
        ul9Var.put("master_package_name", this.b);
        ExtensionsKt.setIntervalMs(ul9Var, this.d);
        ExtensionsKt.setResult$default(ul9Var, this.c, null, null, 6, null);
        return ul9Var.b();
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        return Long.hashCode(this.d) + (((obj == null ? 0 : obj.hashCode()) + iHashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetIntermediateTokenFinishAnalyticsEvent(masterPackageName=");
        sb.append(this.b);
        sb.append(", result=");
        sb.append((Object) roe.b(this.c));
        sb.append(", intervalMs=");
        return zo5.u(sb, this.d, ')');
    }
}
