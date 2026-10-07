package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gdk extends BaseAnalyticsEvent {
    public final String b;
    public final List c;

    public gdk(String str, List list) {
        super("vkcm_sdk_client_skip_push");
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        ul9 ul9Var = new ul9();
        String str = this.b;
        ExtensionsKt.setPushToken(ul9Var, str);
        List list = this.c;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RemoteMessage) it.next()).getMessageId());
        }
        ExtensionsKt.setPushIds(ul9Var, str, arrayList);
        ul9Var.put("reason", "token_diff");
        return ul9Var.b();
    }
}
