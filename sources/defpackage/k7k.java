package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k7k extends BaseAnalyticsEvent {
    public final RemoteMessage b;

    public k7k(RemoteMessage remoteMessage) {
        super("vkcm_sdk_client_receive_push");
        this.b = remoteMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7k) && cqk.d(this.b, ((k7k) obj).b);
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
        return "PushReceiveAnalyticsEvent(message=" + this.b + ')';
    }
}
