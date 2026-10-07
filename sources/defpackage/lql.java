package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lql {
    public static void a(StringBuilder sb, String str, Map map) {
        String name;
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                name = ((CameraCharacteristics.Key) key).getName();
            } else if (key instanceof CaptureRequest.Key) {
                name = ((CaptureRequest.Key) key).getName();
            } else {
                name = key instanceof CaptureResult.Key ? ((CaptureResult.Key) key).getName() : String.valueOf(key);
            }
            Object value = entry.getValue();
            x05.m(name, value instanceof Object[] ? a.h1((Object[]) value, null, "[", "]", new w83(22), 25) : String.valueOf(value), arrayList);
        }
        for (ylc ylcVar : ww3.M1(arrayList, new lv5(21))) {
            sb.append("  " + r5h.b1(50, (String) ylcVar.a) + ' ' + ((String) ylcVar.b) + '\n');
        }
    }

    public static String b(String str) {
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (str2.equals(ApiProtocol.KEY_TOKEN)) {
                builderClearQuery.appendQueryParameter(str2, "<HIDDEN>");
            } else {
                builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return builderClearQuery.build().toString();
    }

    public static String c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(ApiProtocol.PARAM_JOIN_LINK)) {
                jSONObject.put(ApiProtocol.PARAM_JOIN_LINK, "<HIDDEN>");
            }
            if (jSONObject.has("conversation")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("conversation");
                if (jSONObject2.has(ApiProtocol.PARAM_JOIN_LINK)) {
                    jSONObject2.put(ApiProtocol.PARAM_JOIN_LINK, "<HIDDEN>");
                }
            }
            if (jSONObject.has(ApiProtocol.KEY_ENDPOINT)) {
                jSONObject.put(ApiProtocol.KEY_ENDPOINT, b(jSONObject.getString(ApiProtocol.KEY_ENDPOINT)));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }
}
