package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z3k extends BaseAnalyticsEvent {
    public final String b;
    public final boolean c;

    public z3k(String str, boolean z) {
        super("vkcm_sdk_client_init");
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3k)) {
            return false;
        }
        z3k z3kVar = (z3k) obj;
        return cqk.d(this.b, z3kVar.b) && this.c == z3kVar.c;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        ul9 ul9Var = new ul9();
        ExtensionsKt.setPushToken(ul9Var, this.b);
        ExtensionsKt.set(ul9Var, "are_pushes_enabled", this.c);
        return ul9Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSdkInitAnalyticsEvent(pushToken=");
        sb.append(this.b);
        sb.append(", arePushesEnabled=");
        return c0a.p(sb, this.c, ')');
    }
}
