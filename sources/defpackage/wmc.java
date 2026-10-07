package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class wmc {
    public final CidLogger a;

    public wmc(CidLogger cidLogger) {
        this.a = cidLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [s66] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap] */
    public static au1 a(yt1 yt1Var, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        ?? map;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("participantState");
        au1 au1Var = new au1(yt1Var);
        HashMap map2 = au1Var.a;
        if (jSONObjectOptJSONObject2 == null) {
            map2.put("hand", new zt1("0", 0L));
            return au1Var;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("state");
        if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("stateUpdateTs")) == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
        if (itKeys.hasNext()) {
            map = new HashMap(jSONObjectOptJSONObject3.length());
            do {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject3.optString(next));
            } while (itKeys.hasNext());
        } else {
            map = s66.a;
        }
        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
        if (itKeys2.hasNext()) {
            do {
                String next2 = itKeys2.next();
                String str = (String) map.get(next2);
                if (str != null) {
                    long jOptLong = jSONObjectOptJSONObject.optLong(next2);
                    next2.getClass();
                    map2.put(next2, new zt1(str, jOptLong));
                }
            } while (itKeys2.hasNext());
        }
        return au1Var;
    }

    public List b(JSONArray jSONArray) {
        au1 au1VarA;
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                au1VarA = a(yt1.a(jSONObject.getString("id")), jSONObject);
            } catch (JSONException e) {
                this.a.logException("ParticipantStateParser", "Can't parse one state with index=" + i + " from participantList=" + jSONArray, e);
                au1VarA = null;
            }
            arrayList.add(au1VarA);
        }
        return ww3.o1(arrayList);
    }

    public List c(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("participants");
            jSONArray.getClass();
            return b(jSONArray);
        } catch (JSONException e) {
            this.a.logException("ParticipantStateParser", "Can't parse state from participantList " + jSONObject, e);
            return r66.a;
        }
    }

    public au1 d(JSONObject jSONObject) {
        try {
            yt1 yt1VarW = kql.w(jSONObject);
            if (yt1VarW.a == 0) {
                yt1VarW = kql.x(jSONObject);
            }
            return a(yt1VarW, jSONObject);
        } catch (JSONException e) {
            this.a.logException("ParticipantStateParser", "Can't parse state from " + jSONObject, e);
            return null;
        }
    }

    public wmc(CidLogger cidLogger, iw8 iw8Var) {
        this.a = cidLogger;
    }
}
