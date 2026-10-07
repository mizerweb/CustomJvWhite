package defpackage;

import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.ExtensionsKt;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class fdk extends BaseAnalyticsEvent {
    public final ArrayList b;

    public fdk(ArrayList arrayList) {
        super("vkcm_sdk_client_no_master_host_found");
        this.b = arrayList;
    }

    @Override // com.vk.push.common.analytics.BaseAnalyticsEvent
    public final Map getParams() {
        ul9 ul9Var = new ul9();
        ExtensionsKt.set(ul9Var, "installed_apps", this.b);
        return ul9Var.b();
    }
}
