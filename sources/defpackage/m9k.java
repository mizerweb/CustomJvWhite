package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m9k extends BaseAnalyticsEvent {
    public final String b;
    public final int c;

    public m9k(String str, int i) {
        super("vkcm_sdk_client_invalidate_token");
        this.b = str;
        this.c = i;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        String str;
        ul9 ul9Var = new ul9();
        ExtensionsKt.setPushToken(ul9Var, this.b);
        int i = this.c;
        if (i == 1) {
            str = "SDK_USER";
        } else if (i == 2) {
            str = "HOST";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "NO_HOST_INSTALLED";
        }
        ul9Var.put("invalidate_initiator", str.toLowerCase(Locale.ROOT));
        return ul9Var.b();
    }
}
