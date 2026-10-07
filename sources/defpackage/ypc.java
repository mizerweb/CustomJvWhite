package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ypc {
    public final Map a;

    public ypc(Map map) {
        this.a = map;
    }

    public static final ypc a(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            jSONArrayNames = new JSONArray();
        }
        int length = jSONArrayNames.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArrayNames.getString(i);
            JSONArray jSONArray = jSONObject.getJSONArray(string);
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2.has("dimension") && jSONObject2.has("bitrate")) {
                    arrayList.add(new xpc(jSONObject2.getInt("dimension"), jSONObject2.getInt("bitrate")));
                }
            }
            string.getClass();
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap.put(lowerCase, ww3.M1(arrayList, new xa8(15)));
        }
        return new ypc(linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypc) && this.a.equals(((ypc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PeerVideoSettingsBitrateTable(bitrateTables=" + this.a + ")";
    }
}
