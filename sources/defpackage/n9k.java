package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n9k extends BaseAnalyticsEvent {
    public final RemoteMessage b;

    public n9k(RemoteMessage remoteMessage) {
        super("vkcm_sdk_client_show_push");
        this.b = remoteMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9k) && cqk.d(this.b, ((n9k) obj).b);
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        ul9 ul9Var = new ul9();
        RemoteMessage remoteMessage = this.b;
        ExtensionsKt.setPushToken(ul9Var, remoteMessage.getToken());
        ExtensionsKt.setPushId(ul9Var, remoteMessage.getToken(), remoteMessage.getMessageId());
        return ul9Var.b();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PushShowAnalyticsEvent(message=" + this.b + ')';
    }
}
