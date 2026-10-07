package defpackage;

import android.os.Bundle;
import com.vk.push.common.messaging.NotificationAnalyticsPayload;

/* JADX INFO: loaded from: classes3.dex */
public final class e4k extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4k(Bundle bundle, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = bundle;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Bundle bundle = this.f;
        switch (i) {
            case 0:
                return new e4k(bundle, lq4Var, 0);
            case 1:
                return new e4k(bundle, lq4Var, 1);
            default:
                return new e4k(bundle, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Bundle bundle = this.f;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                return new e4k(bundle, lq4Var, 0).invokeSuspend(sbiVar);
            case 1:
                return new e4k(bundle, lq4Var, 1).invokeSuspend(sbiVar);
            default:
                return new e4k(bundle, lq4Var, 2).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Bundle bundle = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                String string = bundle != null ? bundle.getString("vkpns.analytics_payload.push_token_part") : null;
                String string2 = bundle != null ? bundle.getString("vkpns.analytics_payload.message_id") : null;
                if (string == null || string2 == null) {
                    return null;
                }
                return NotificationAnalyticsPayload.INSTANCE.createSafe(string, string2);
            case 1:
                ch3.d0(obj);
                if (bundle != null) {
                    return new Integer(bundle.getInt("vkpns.click_event_marker.request_code"));
                }
                return null;
            default:
                ch3.d0(obj);
                return Boolean.valueOf(bundle.containsKey("vkpns.click_event_marker"));
        }
    }
}
