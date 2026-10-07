package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kql {
    public static String A(o0a o0aVar) {
        if (o0aVar == null) {
            return null;
        }
        int i = kgk.a[o0aVar.ordinal()];
        if (i == 1) {
            return "UNMUTE";
        }
        if (i == 2) {
            return "MUTE";
        }
        if (i == 3) {
            return "MUTE_PERMANENT";
        }
        if (i == 4) {
            return null;
        }
        qr7.y(o0aVar, "Unknown media option state: ");
        return null;
    }

    public static String B(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static Integer C(JSONObject jSONObject) {
        String strOptString;
        if (jSONObject.has(ApiProtocol.PARAM_CAPABILITIES) && (strOptString = jSONObject.optString(ApiProtocol.PARAM_CAPABILITIES, null)) != null) {
            try {
                return Integer.valueOf(Integer.parseInt(strOptString, 16));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static ArrayList D(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                arrayList.add(jSONArrayOptJSONArray.getJSONObject(i).getString("externalId"));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public static yt1 E(JSONObject jSONObject) {
        try {
            return yt1.a(jSONObject.getString("speaker"));
        } catch (JSONException | Exception unused) {
            return null;
        }
    }

    public static ArrayList F(JSONObject jSONObject) {
        return G(jSONObject, "activeParticipants");
    }

    public static ArrayList G(JSONObject jSONObject, String str) {
        yt1 yt1VarA;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            try {
                try {
                    yt1VarA = yt1.a(jSONArrayOptJSONArray.getString(i));
                } catch (Exception unused) {
                    yt1VarA = null;
                }
                if (yt1VarA != null) {
                    arrayList.add(yt1VarA);
                }
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public static String H(JSONObject jSONObject) {
        return jSONObject.optString("state");
    }

    public static cu1 I(JSONObject jSONObject) {
        return new cu1(Boolean.valueOf(jSONObject.getBoolean("connected")));
    }

    public static cu1 J(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("sessionState");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return new cu1(Boolean.valueOf(jSONObjectOptJSONObject.getBoolean("connected")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String K(ajf ajfVar) {
        String str;
        String str2;
        x52 x52Var = ajfVar.a;
        x52 x52Var2 = ajfVar.a;
        u1b u1bVar = x52Var.c;
        if (u1bVar != null) {
            str = ":m" + u1bVar.a;
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x52Var2.b.b());
        sb.append(":");
        int i = kgk.b[x52Var2.a.ordinal()];
        if (i == 1) {
            str2 = "sCAMERA";
        } else if (i == 2) {
            str2 = "sSCREEN";
        } else if (i == 3) {
            str2 = "sMOVIE";
        } else if (i == 4) {
            str2 = "sSTREAM";
        } else {
            if (i != 5) {
                ore.q("Unknown VideoTrackType");
                return null;
            }
            str2 = "sANIMOJI";
        }
        return zo5.w(sb, str2, str);
    }

    public static HashSet L(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        ft7 ft7Var;
        if (!"hungup".equals(jSONObject.optString("notification")) || (jSONArrayOptJSONArray = jSONObject.optJSONArray("errors")) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            int iOptInt = jSONArrayOptJSONArray.optInt(i, Integer.MIN_VALUE);
            if (iOptInt != Integer.MIN_VALUE) {
                ft7[] ft7VarArrValues = ft7.values();
                int length = ft7VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        ft7Var = null;
                        break;
                    }
                    ft7Var = ft7VarArrValues[i2];
                    if (iOptInt == ft7Var.a) {
                        break;
                    }
                    i2++;
                }
                if (ft7Var != null) {
                    hashSet.add(ft7Var);
                }
            }
        }
        return hashSet;
    }

    public static x52 M(String str) {
        String[] strArrSplit = str.split(":");
        int length = strArrSplit.length;
        v4j v4jVar = v4j.a;
        yt1 yt1VarA = null;
        u1b u1bVar = null;
        v4j v4jVar2 = v4jVar;
        int i = 0;
        while (true) {
            if (i >= length) {
                if (yt1VarA == null) {
                    return null;
                }
                xtj xtjVar = new xtj(4);
                xtjVar.b = yt1VarA;
                xtjVar.c = v4jVar2;
                xtjVar.d = u1bVar;
                return xtjVar.p();
            }
            String str2 = strArrSplit[i];
            if (str2 != null) {
                if (str2.startsWith("u") || str2.startsWith("g")) {
                    try {
                        yt1VarA = yt1.a(str);
                    } catch (Exception unused) {
                        yt1VarA = null;
                    }
                }
                if (str2.startsWith("s")) {
                    switch (str2) {
                        case "sANIMOJI":
                            v4jVar2 = v4j.c;
                            break;
                        case "sMOVIE":
                            v4jVar2 = v4j.d;
                            break;
                        case "sCAMERA":
                            v4jVar2 = v4jVar;
                            break;
                        case "sSCREEN":
                            v4jVar2 = v4j.b;
                            break;
                        case "sSTREAM":
                            v4jVar2 = v4j.e;
                            break;
                        default:
                            ore.q("Unknown video track type");
                            return null;
                    }
                }
                if (str2.startsWith("m")) {
                    u1bVar = new u1b(Long.parseLong(str2.substring(1)));
                }
            }
            i++;
        }
    }

    public static yt1 N(String str) {
        yt1 yt1VarA = null;
        if (!TextUtils.isEmpty(str) && str.startsWith("audio-") && str.length() != 6) {
            try {
                yt1VarA = yt1.a(str.substring(6));
            } catch (Exception unused) {
            }
        }
        return yt1VarA != null ? yt1VarA : O(str);
    }

    public static yt1 O(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("video-") && str.length() != 6) {
            try {
                return yt1.a(str.substring(6));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static vj7 a(JSONObject jSONObject, Boolean bool, boolean z) throws JSONException {
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, jSONObject2.toString());
        }
        return b(jSONObject, "add-participant");
    }

    public static vj7 b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("command", str);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            return new vj7(jSONObject2, 0);
        } catch (JSONException e) {
            qr7.o(e);
            return null;
        }
    }

    public static JSONObject c(tif tifVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("maxH264Decoders", tifVar.a);
        Integer num = tifVar.b;
        if (num != null) {
            jSONObject.put("estimatedPerformanceIndex", num);
        }
        jSONObject.put("producerNotificationDataChannelVersion", 7);
        jSONObject.put("producerCommandDataChannelVersion", tifVar.c);
        jSONObject.put("audioMix", true);
        jSONObject.put("consumerUpdate", tifVar.d);
        jSONObject.put("onDemandTracks", tifVar.e);
        jSONObject.put("singleSession", true);
        jSONObject.put("unifiedPlan", true);
        jSONObject.put("fastScreenShare", true);
        if (tifVar.f) {
            jSONObject.put("producerScreenDataChannelVersion", 1);
        }
        if (tifVar.g) {
            jSONObject.put("consumerScreenDataChannelVersion", 1);
        }
        if (tifVar.h) {
            jSONObject.put("animojiDataChannelVersion", 2);
        }
        if (tifVar.i) {
            jSONObject.put("animojiBackendRender", true);
        }
        if (tifVar.k) {
            jSONObject.put("asrDataChannelVersion", 1);
        }
        if (tifVar.l) {
            jSONObject.put("consumerFastScreenShare", true);
        }
        jSONObject.put("consumerFastScreenShareQualityOnDemand", true);
        if (tifVar.m) {
            jSONObject.put("audioShare", true);
        }
        if (tifVar.n) {
            jSONObject.put("simulcast", true);
            jSONObject.put("simulcastNativeOrder", true);
        }
        jSONObject.put("red", true);
        int i = tifVar.j;
        if (i > 0) {
            jSONObject.put("videoTracksCount", i);
            jSONObject.put("csrcAccessible", true);
        }
        if (tifVar.o) {
            jSONObject.put("transparentAudio", true);
        }
        return jSONObject;
    }

    public static void d(yt1 yt1Var, JSONObject jSONObject, boolean z) {
        jSONObject.put("participantId", yt1Var.a);
        jSONObject.put("participantType", bc1.r(yt1Var.b));
        if (z) {
            jSONObject.put("deviceIdx", yt1Var.c);
        }
    }

    public static void e(JSONObject jSONObject, String str, Collection collection) {
        if (collection != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put(((yt1) it.next()).b());
            }
            jSONObject.put(str, jSONArray);
        }
    }

    public static vj7 f(Set set, Set set2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jSONObject.put(((m91) it.next()).name(), true);
                }
            }
            if (set2 != null) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    jSONObject.put(((m91) it2.next()).name(), false);
                }
            }
            vj7 vj7VarB = b(null, "change-options");
            vj7VarB.a.put("options", jSONObject);
            return vj7VarB;
        } catch (JSONException e) {
            qr7.o(e);
            return null;
        }
    }

    public static vj7 g(Map map, yt1 yt1Var) {
        try {
            vj7 vj7VarB = b(null, "change-participant-state");
            JSONObject jSONObject = vj7VarB.a;
            JSONObject jSONObjectPut = new JSONObject().put("state", new JSONObject(map));
            jSONObjectPut.getClass();
            jSONObject.put("participantState", jSONObjectPut);
            if (yt1Var == null) {
                return vj7VarB;
            }
            jSONObject.put("participantId", yt1Var.b());
            return vj7VarB;
        } catch (JSONException e) {
            qr7.o(e);
            return null;
        }
    }

    public static vj7 h(yt1 yt1Var, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("participantId", yt1Var.a);
            jSONObject2.put("participantType", bc1.r(yt1Var.b));
            jSONObject2.put("deviceIdx", yt1Var.c);
            jSONObject2.put("data", jSONObject);
            return b(jSONObject2, "custom-data");
        } catch (JSONException e) {
            qr7.o(e);
            return null;
        }
    }

    public static hi1 i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            int iOptInt = jSONObject.optInt("deviceIdx", 0);
            int i = 3;
            if (jSONObject.has("decorativeExternalParticipantId")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("decorativeExternalParticipantId");
                if (jSONObject2 == null) {
                    return null;
                }
                String string = jSONObject2.getString("id");
                String lowerCase = jSONObject2.getString("type").toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (!lowerCase.equals("anonym")) {
                    i = !lowerCase.equals("vk") ? 1 : 2;
                }
                return new hi1(string, i, iOptInt);
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("externalId");
            if (jSONObject3 == null) {
                return null;
            }
            String string2 = jSONObject3.getString("id");
            String lowerCase2 = jSONObject3.getString("type").toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (!lowerCase2.equals("anonym")) {
                i = !lowerCase2.equals("vk") ? 1 : 2;
            }
            return new hi1(string2, i, iOptInt);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONObject j(yt1 yt1Var, SessionDescription sessionDescription, boolean z, String str, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        d(yt1Var, jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", sessionDescription.type.canonicalForm());
        jSONObject2.put("sdp", sessionDescription.description);
        if (sessionDescription.type.equals(SessionDescription.Type.OFFER) && z) {
            jSONObject2.put("p2pRelay", "true");
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("sdp", jSONObject2);
        if (i != 0) {
            jSONObject3.put(ApiProtocol.PARAM_CAPABILITIES, Integer.toHexString(i));
        }
        if (str != null) {
            jSONObject3.put("label", str);
        }
        jSONObject.put("data", jSONObject3);
        return jSONObject;
    }

    public static o0a k(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("UNMUTE")) {
            return o0a.a;
        }
        if (str.equals("MUTE")) {
            return o0a.b;
        }
        if (str.equals("MUTE_PERMANENT")) {
            return o0a.c;
        }
        return null;
    }

    public static HashMap l(JSONObject jSONObject) {
        HashMap map = new HashMap();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("muteStates");
        if (jSONObjectOptJSONObject != null) {
            map.put(n0a.a, k(jSONObjectOptJSONObject.optString("AUDIO")));
            map.put(n0a.b, k(jSONObjectOptJSONObject.optString("VIDEO")));
            map.put(n0a.c, k(jSONObjectOptJSONObject.optString("SCREEN_SHARING")));
            map.put(n0a.d, k(jSONObjectOptJSONObject.optString("MOVIE_SHARING")));
        }
        return map;
    }

    public static p8b m(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediaSettings");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new p8b(jSONObjectOptJSONObject.optBoolean("isAudioEnabled", false), jSONObjectOptJSONObject.optBoolean("isVideoEnabled", false), jSONObjectOptJSONObject.optBoolean("isScreenSharingEnabled", false), jSONObjectOptJSONObject.optBoolean("isAnimojiEnabled", false));
    }

    public static JSONObject n(i5g i5gVar, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isVideoEnabled", i5gVar.a);
            jSONObject.put("isAudioEnabled", i5gVar.b);
            jSONObject.put("isScreenSharingEnabled", i5gVar.c);
            jSONObject.put("isAnimojiEnabled", i5gVar.e);
            if (z) {
                jSONObject.put("isFastScreenSharingEnabled", i5gVar.d);
            }
            if (z2) {
                jSONObject.put("isAudioSharingEnabled", i5gVar.f);
            }
            return jSONObject;
        } catch (JSONException e) {
            qr7.o(e);
            return null;
        }
    }

    public static bpc o(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ApiProtocol.PARAM_PEER_ID);
        if (jSONObjectOptJSONObject != null) {
            return new bpc(jSONObjectOptJSONObject.getString("id"));
        }
        return null;
    }

    public static vj7 p(yt1 yt1Var, boolean z) {
        try {
            vj7 vj7VarB = b(null, "promote-participant");
            JSONObject jSONObject = vj7VarB.a;
            jSONObject.put("demote", !z);
            jSONObject.put("participantId", yt1Var.b());
            return vj7VarB;
        } catch (JSONException e) {
            qr7.o(e);
            return null;
        }
    }

    public static vj7 q(yt1 yt1Var, List list, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", yt1Var.b());
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((bu1) it.next());
        }
        jSONObject.put("roles", jSONArray);
        jSONObject.put("revoke", z);
        return b(jSONObject, "grant-roles");
    }

    public static vj7 r(yt1 yt1Var, dnf dnfVar, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", yt1Var.b());
        if (dnfVar instanceof cnf) {
            jSONObject.put("roomId", ((cnf) dnfVar).a);
        }
        jSONObject.put("unpin", !z);
        return b(jSONObject, "pin-participant");
    }

    public static vj7 s(yt1 yt1Var, IceCandidate iceCandidate) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("candidate", uza.c(iceCandidate));
        jSONObject.put("sdpMid", iceCandidate.sdpMid);
        jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidate", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        d(yt1Var, jSONObject3, true);
        jSONObject3.put("data", jSONObject2);
        return b(jSONObject3, "transmit-data");
    }

    public static vj7 t(yt1 yt1Var, IceCandidate[] iceCandidateArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (IceCandidate iceCandidate : iceCandidateArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidate", uza.c(iceCandidate));
            jSONObject.put("sdpMid", iceCandidate.sdpMid);
            jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidates-removed", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        d(yt1Var, jSONObject3, true);
        jSONObject3.put("data", jSONObject2);
        return b(jSONObject3, "transmit-data");
    }

    public static ArrayList u(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("roles")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    arrayList.add(bu1.valueOf(jSONArrayOptJSONArray.getString(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    public static vj7 v(long j, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-movie");
        jSONObject.put("movieId", j);
        jSONObject.put("pause", z);
        return new vj7(jSONObject, 0);
    }

    public static yt1 w(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("participantId");
        String strOptString = jSONObject.optString("participantType");
        return new yt1("GROUP".equals(strOptString) ? 2 : 1, jSONObject.optInt("deviceIdx"), jOptLong);
    }

    public static yt1 x(JSONObject jSONObject) {
        long jOptLong = jSONObject.optLong("id");
        String strOptString = jSONObject.optString("idType");
        return new yt1("GROUP".equals(strOptString) ? 2 : 1, jSONObject.optInt("deviceIdx"), jOptLong);
    }

    public static vpc y(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        ypc ypcVarA = null;
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        int iOptInt = jSONObjectOptJSONObject.optInt("maxDimension");
        int iOptInt2 = jSONObjectOptJSONObject.optInt("maxBitrateK");
        int iOptInt3 = jSONObjectOptJSONObject.optInt("maxFramerate");
        String strOptString = jSONObjectOptJSONObject.optString("degradationPreference");
        try {
            ypcVarA = ypc.a(jSONObjectOptJSONObject.getJSONObject("bitrates"));
        } catch (Exception unused) {
        }
        return new vpc(iOptInt, iOptInt, iOptInt2, iOptInt3, strOptString, ypcVarA, 1, 0, "");
    }

    public static boolean z(JSONObject jSONObject) {
        return jSONObject.optBoolean("unpin", false);
    }
}
