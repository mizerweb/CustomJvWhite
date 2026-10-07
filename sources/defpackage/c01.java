package defpackage;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class c01 {
    public String a;
    public String b;
    public long c;

    public c01(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApiProtocol.KEY_TOKEN, str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static c01 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new c01(0L, str, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c01(jSONObject.getLong("timestamp"), jSONObject.getString(ApiProtocol.KEY_TOKEN), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public c01() {
    }
}
