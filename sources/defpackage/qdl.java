package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qdl {
    public static final vj7 a(yt1 yt1Var, boolean z) {
        try {
            return kql.h(yt1Var, new JSONObject().put("sdk", new JSONObject().put("type", "bad-net").put(SdkMetricStatEvent.VALUE_KEY, z)));
        } catch (JSONException e) {
            qr7.o(e);
            return null;
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static dc9 c(Object obj) {
        return new dc9(obj.getClass().getSimpleName(), 12);
    }
}
