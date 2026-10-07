package ru.ok.android.externcalls.sdk.api;

import android.util.Base64;
import defpackage.hs4;
import defpackage.hu8;
import defpackage.ore;
import defpackage.vu8;
import defpackage.xel;
import defpackage.zo5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
import ru.ok.android.api.json.JsonTypeMismatchException;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.rate.Question;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.util.compressor.LZ4;

/* JADX INFO: loaded from: classes3.dex */
public class ConversationParams {
    private static final String LOG_TAG = "ConversationParams";
    public static final hu8 PARSER = new hs4(6);
    public String clientType;
    public int deviceIndex;
    public String endpoint;
    public String id;
    public boolean isP2PForbidden;
    public Integer ispAsNo;
    public String ispAsOrg;
    public String locCc;
    public String locReg;
    public RateCallData rateCallData;
    public List<PeerConnection.IceServer> stunTurnServers = new ArrayList();
    public String token;
    public List<String> wsIps;
    public String wtEndpoint;
    public List<String> wtIps;

    public static ConversationParams decode(String str) {
        int i;
        try {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length >= 2 && (i = Integer.parseInt(strArrSplit[0])) > 0) {
                byte[] bArr = new byte[i];
                if (LZ4.a(Base64.decode(strArrSplit[1], 0), bArr) == i) {
                    return parseCallParamsCompact(new JSONObject(new String(bArr)));
                }
            }
            return null;
        } catch (Throwable th) {
            ore.h("Error decode conversation params", th);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ConversationParams fromInternalParams(String str, vu8 vu8Var, boolean z) {
        ConversationParams conversationParams = new ConversationParams();
        try {
            conversationParams.id = str;
            ArrayList arrayList = new ArrayList();
            vu8Var.p();
            while (vu8Var.hasNext()) {
                String strName = vu8Var.name();
                switch (strName.hashCode()) {
                    case 3541178:
                        if (!strName.equals("stun")) {
                            vu8Var.x();
                        } else {
                            arrayList.addAll(CallInfoParser.parseStun(vu8Var));
                        }
                        break;
                    case 3571837:
                        if (!strName.equals("turn")) {
                            vu8Var.x();
                        } else {
                            arrayList.addAll(CallInfoParser.parseTurn(vu8Var));
                        }
                        break;
                    case 684155794:
                        if (!strName.equals("wtEndpoint")) {
                            vu8Var.x();
                        } else {
                            conversationParams.wtEndpoint = vu8Var.F();
                        }
                        break;
                    case 1102453157:
                        if (!strName.equals("clientType")) {
                            vu8Var.x();
                        } else {
                            conversationParams.clientType = vu8Var.F();
                        }
                        break;
                    case 1419796927:
                        if (!strName.equals("wsIpAddresses")) {
                            vu8Var.x();
                        } else if (!z) {
                            vu8Var.x();
                        } else {
                            conversationParams.wsIps = CallInfoParser.parseIpAddresses(vu8Var);
                        }
                        break;
                    case 1548879646:
                        if (!strName.equals("wtIpAddresses")) {
                            vu8Var.x();
                        } else if (!z) {
                            vu8Var.x();
                        } else {
                            conversationParams.wtIps = CallInfoParser.parseIpAddresses(vu8Var);
                        }
                        break;
                    case 1741102485:
                        if (!strName.equals(ApiProtocol.KEY_ENDPOINT)) {
                            vu8Var.x();
                        } else {
                            conversationParams.endpoint = vu8Var.F();
                        }
                        break;
                    default:
                        vu8Var.x();
                        break;
                }
            }
            conversationParams.stunTurnServers = arrayList;
            return conversationParams;
        } catch (Exception e) {
            GlobalRTCLogger.logException(LOG_TAG, e.getMessage() == null ? "Exception during parsing internal params ".concat(e.getClass().getName()) : e.getMessage(), e);
            return null;
        }
    }

    private static List<String> jsonArrayToStringList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String strOptString = jSONArray.optString(i, null);
            if (strOptString != null) {
                linkedList.add(strOptString);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public static ConversationParams parseCallParams(JSONObject jSONObject) {
        try {
            ConversationParams conversationParams = new ConversationParams();
            conversationParams.token = jSONObject.getString(ApiProtocol.KEY_TOKEN);
            conversationParams.deviceIndex = jSONObject.optInt(ApiProtocol.KEY_DEVICE_IDX, 0);
            conversationParams.clientType = jSONObject.optString(ApiProtocol.KEY_CLIENT_TYPE);
            conversationParams.rateCallData = parseRateCallData(jSONObject);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ApiProtocol.KEY_TURN_SERVER);
            if (jSONObjectOptJSONObject == null) {
                GlobalRTCLogger.logException(LOG_TAG, "null turn", new NullPointerException("null turn"));
            } else {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("urls");
                String strOptString = jSONObjectOptJSONObject.optString("username", null);
                String strOptString2 = jSONObjectOptJSONObject.optString("credential", null);
                if (jSONArrayOptJSONArray != null && strOptString != null && strOptString2 != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(jSONArrayOptJSONArray.getString(i)).setUsername(strOptString).setPassword(strOptString2).createIceServer());
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(ApiProtocol.KEY_STUN_SERVER);
            if (jSONObjectOptJSONObject2 == null) {
                GlobalRTCLogger.logException(LOG_TAG, "null stun", new NullPointerException("null stun"));
            } else {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("urls");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(jSONArrayOptJSONArray2.getString(i2)).createIceServer());
                    }
                }
            }
            conversationParams.endpoint = jSONObject.optString(ApiProtocol.KEY_ENDPOINT);
            conversationParams.wtEndpoint = jSONObject.optString(ApiProtocol.KEY_WT_ENDPOINT, null);
            if (jSONObject.has("isp_as_no")) {
                conversationParams.ispAsNo = Integer.valueOf(jSONObject.optInt("isp_as_no"));
            }
            conversationParams.ispAsOrg = jSONObject.optString("isp_as_org");
            conversationParams.locCc = jSONObject.optString("loc_cc");
            conversationParams.locReg = jSONObject.optString("loc_reg");
            return conversationParams;
        } catch (JSONException e) {
            GlobalRTCLogger.logException(LOG_TAG, "json exception", e);
            return null;
        }
    }

    private static ConversationParams parseCallParamsCompact(JSONObject jSONObject) {
        ConversationParams conversationParams = new ConversationParams();
        try {
            conversationParams.token = jSONObject.getString("tkn");
            conversationParams.clientType = jSONObject.optString("srcp");
            String strOptString = jSONObject.optString("trne", null);
            String strOptString2 = jSONObject.optString("trnu", null);
            String strOptString3 = jSONObject.optString("trnp", null);
            if (strOptString != null && !strOptString.isEmpty() && strOptString2 != null && strOptString3 != null) {
                for (String str : strOptString.split(",")) {
                    if (!str.isEmpty()) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(str).setUsername(strOptString2).setPassword(strOptString3).createIceServer());
                    }
                }
            }
            String strOptString4 = jSONObject.optString("stne", null);
            if (strOptString4 != null && !strOptString4.isEmpty()) {
                for (String str2 : strOptString4.split(",")) {
                    if (!str2.isEmpty()) {
                        conversationParams.stunTurnServers.add(PeerConnection.IceServer.builder(str2).createIceServer());
                    }
                }
            }
            conversationParams.endpoint = jSONObject.optString("wse");
            conversationParams.wsIps = jsonArrayToStringList(jSONObject.optJSONArray("wsip"));
            conversationParams.wtEndpoint = jSONObject.optString("wte", null);
            conversationParams.wtIps = jsonArrayToStringList(jSONObject.optJSONArray("wtip"));
            return conversationParams;
        } catch (JSONException e) {
            ore.h("No token provided", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static RateCallData parseRateCallData(JSONObject jSONObject) throws JSONException {
        ?? arrayList;
        int iOptInt = jSONObject.optInt("max_rate_for_question", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("questions");
        if (jSONArrayOptJSONArray != null) {
            arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                arrayList.add(new Question(jSONObject2.getInt("id"), jSONObject2.getString("text")));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        return new RateCallData(iOptInt, arrayList);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConversationParams{endpoint='");
        sb.append(this.endpoint);
        sb.append("', token='");
        sb.append(this.token);
        sb.append("', rateCallData=");
        sb.append(this.rateCallData);
        sb.append(", deviceIndex=");
        sb.append(this.deviceIndex);
        sb.append(", stunTurnServers=");
        sb.append(this.stunTurnServers);
        sb.append(", ispAsNo=");
        sb.append(this.ispAsNo);
        sb.append(", ispAsOrg='");
        sb.append(this.ispAsOrg);
        sb.append("', locCc='");
        sb.append(this.locCc);
        sb.append("', locReg='");
        return zo5.w(sb, this.locReg, "'}");
    }

    public static ConversationParams parseCallParams(vu8 vu8Var) throws JsonTypeMismatchException, IOException {
        return parseCallParams(xel.c(vu8Var));
    }
}
