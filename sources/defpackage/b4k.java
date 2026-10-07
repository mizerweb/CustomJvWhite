package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import com.vk.push.core.utils.MessageIdUtilsKt;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b4k extends BaseAnalyticsEvent {
    public final String b;
    public final String c;
    public final String d;

    public b4k(String str, String str2, String str3) {
        super("vkcm_sdk_client_click_push");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        String str;
        ul9 ul9Var = new ul9();
        String str2 = this.b;
        if (str2 != null && (str = this.c) != null) {
            ExtensionsKt.setPushId(ul9Var, MessageIdUtilsKt.formPushId(str2, str));
        }
        ul9Var.put("action", this.d);
        return ul9Var.b();
    }
}
