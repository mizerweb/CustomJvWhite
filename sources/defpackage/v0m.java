package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v0m {
    public static final ahi a(gka gkaVar) {
        String str = gkaVar.a.c;
        return new ahi(gkaVar.b, gkaVar.c, gkaVar.d, str);
    }

    public static mu7 b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("buildUuid");
            if (r5h.X0(strOptString)) {
                strOptString = null;
            }
            String strOptString2 = jSONObject.optString("tag");
            return new mu7(strOptString, r5h.X0(strOptString2) ? null : strOptString2);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
