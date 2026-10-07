package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q1m {
    public static final /* synthetic */ int a = 0;

    public static final String a(int[] iArr) {
        char[] cArr = new char[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) iArr[i];
        }
        return new String(cArr);
    }

    public static String b(String str) {
        if (ch3.r(str)) {
            gm0.W("q1m", "getPhotoToken: response is empty or null", new Object[0]);
            return null;
        }
        try {
            ArrayList arrayListC = c(str);
            if (arrayListC.isEmpty()) {
                return null;
            }
            return (String) arrayListC.get(0);
        } catch (Exception e) {
            gm0.V("q1m", "getPhotoToken: exception while getting photo token from response", e);
            return null;
        }
    }

    public static ArrayList c(String str) throws Exception {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_msg")) {
                gm0.m("q1m", "getPhotoToken: got json error: %s", jSONObject.getString("error_msg"));
                return arrayList;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("photos");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                arrayList.add(jSONObject2.getJSONObject(itKeys.next()).getString(ApiProtocol.KEY_TOKEN));
            }
            return arrayList;
        } catch (Exception e) {
            gm0.V("q1m", "Exception while parsing photo upload response", e);
            throw e;
        }
    }
}
