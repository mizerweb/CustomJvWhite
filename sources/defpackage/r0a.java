package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class r0a {
    public static JSONObject a(Set set, yt1 yt1Var, dnf dnfVar) throws JSONException {
        String str;
        set.getClass();
        dnfVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", yt1Var != null ? yt1Var.b() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int i = q0a.$EnumSwitchMapping$0[((n0a) it.next()).ordinal()];
            if (i == 1) {
                str = "AUDIO";
            } else if (i == 2) {
                str = "VIDEO";
            } else if (i == 3) {
                str = "SCREEN_SHARING";
            } else {
                if (i != 4) {
                    ore.o();
                    return null;
                }
                str = "MOVIE_SHARING";
            }
            jSONArray.put(str);
        }
        jSONObject.put("requestedMedia", jSONArray);
        jSONObject.put("command", "mute-participant");
        if (dnfVar instanceof cnf) {
            jSONObject.put("roomId", ((cnf) dnfVar).a);
        }
        return jSONObject;
    }

    public static JSONObject b(Map map, yt1 yt1Var, dnf dnfVar) throws JSONException {
        map.getClass();
        dnfVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", yt1Var != null ? yt1Var.b() : null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("AUDIO", kql.A((o0a) map.get(n0a.a)));
        jSONObject2.put("VIDEO", kql.A((o0a) map.get(n0a.b)));
        jSONObject2.put("SCREEN_SHARING", kql.A((o0a) map.get(n0a.c)));
        jSONObject2.put("MOVIE_SHARING", kql.A((o0a) map.get(n0a.d)));
        jSONObject.put("muteStates", jSONObject2);
        jSONObject.put("command", "mute-participant");
        if (dnfVar instanceof cnf) {
            jSONObject.put("roomId", ((cnf) dnfVar).a);
        }
        return jSONObject;
    }
}
