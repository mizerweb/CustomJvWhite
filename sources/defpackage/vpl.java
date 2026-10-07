package defpackage;

import java.math.BigInteger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vpl {
    public static final void a(JSONObject jSONObject, Map map) throws JSONException {
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
    }

    public static final void b(JSONObject jSONObject, String str, Object obj) throws JSONException {
        jSONObject.put(str, obj);
    }

    public static String c() {
        h4e h4eVar = i4e.a;
        return new BigInteger(Long.toUnsignedString(i4e.b.f()), 10).toString(36);
    }
}
