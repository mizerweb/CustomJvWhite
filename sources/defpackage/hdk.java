package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hdk extends BaseAnalyticsEvent {
    public final String b;
    public final long c;
    public final Object d;
    public final String e;

    public hdk(String str, long j, Object obj, String str2) {
        super("vkcm_sdk_client_subscribe_for_pushes");
        this.b = str;
        this.c = j;
        this.d = obj;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdk)) {
            return false;
        }
        hdk hdkVar = (hdk) obj;
        return cqk.d(this.b, hdkVar.b) && this.c == hdkVar.c && cqk.d(this.d, hdkVar.d) && cqk.d(this.e, hdkVar.e);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        ul9 ul9Var = new ul9();
        ExtensionsKt.setPushToken(ul9Var, this.b);
        ExtensionsKt.setIntervalMs(ul9Var, this.c);
        ExtensionsKt.setResult(ul9Var, this.d, ei6.n, new yck(this));
        return ul9Var.b();
    }

    public final int hashCode() {
        int iG = qt4.g(this.b.hashCode() * 31, 31, this.c);
        Object obj = this.d;
        return this.e.hashCode() + (((obj == null ? 0 : obj.hashCode()) + iG) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegisterForPushesAnalyticsEvent(pushToken=");
        sb.append(this.b);
        sb.append(", intervalMs=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append((Object) roe.b(this.d));
        sb.append(", masterPackageName=");
        return x05.i(sb, this.e, ')');
    }
}
