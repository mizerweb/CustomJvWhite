package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q81 implements n4g {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ q81(o91 o91Var, int i) {
        this.a = i;
        this.b = o91Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v84, types: [ru.ok.android.externcalls.sdk.j] */
    /* JADX WARN: Type inference failed for: r0v87, types: [q4g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ru.ok.android.externcalls.sdk.factory.internal.CidLogger, y3e] */
    /* JADX WARN: Type inference failed for: r4v0, types: [oh1] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, o91] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void a(JSONObject jSONObject) throws JSONException {
        ?? r4;
        boolean z;
        it7 it7VarValueOf;
        it7 it7VarValueOf2;
        boolean z2;
        du1 du1VarG;
        boolean z3;
        boolean z4;
        p8b p8bVar;
        boolean z5;
        p8b p8bVar2;
        boolean z6;
        boolean z7;
        e2b e2bVarB;
        oh1 oh1Var = oh1.y;
        ?? r6 = this.b;
        oh1 oh1Var2 = oh1.j;
        zvh zvhVar = zvh.b;
        o0a o0aVar = o0a.c;
        ?? r5 = oh1.l;
        bnf bnfVar = bnf.a;
        int i = 20;
        r6.d.execute(new qe(r6, i, jSONObject));
        gj2 gj2Var = r6.I0;
        gj2Var.getClass();
        gj2Var.b = System.nanoTime();
        String string = jSONObject.getString("notification");
        string.getClass();
        switch (string.hashCode()) {
            case -1970255734:
                i = string.equals("participant-animoji-changed") ? 0 : -1;
                break;
            case -1946759356:
                i = string.equals("closed-conversation") ? 1 : -1;
                break;
            case -1837281659:
                i = string.equals("options-changed") ? 2 : -1;
                break;
            case -1824193402:
                i = string.equals("custom-data") ? 3 : -1;
                break;
            case -1326342510:
                i = string.equals("chat-message") ? 4 : -1;
                break;
            case -1230859622:
                i = string.equals("session-state") ? 5 : -1;
                break;
            case -1206103903:
                i = string.equals("hungup") ? 6 : -1;
                break;
            case -1183787100:
                i = string.equals("join-link-changed") ? 7 : -1;
                break;
            case -1136546043:
                i = string.equals("record-started") ? 8 : -1;
                break;
            case -1123680175:
                i = string.equals("record-stopped") ? 9 : -1;
                break;
            case -1009634793:
                i = string.equals("realloc-con") ? 10 : -1;
                break;
            case -952973404:
                i = string.equals("roles-changed") ? 11 : -1;
                break;
            case -891376444:
                i = string.equals("accepted-call") ? 12 : -1;
                break;
            case -855742144:
                i = string.equals("room-participants-updated") ? 13 : -1;
                break;
            case -776083981:
                i = string.equals("multiparty-chat-created") ? 14 : -1;
                break;
            case -775651618:
                i = string.equals("connection") ? 15 : -1;
                break;
            case -615745013:
                i = string.equals("participants-state-changed") ? 16 : -1;
                break;
            case -555091700:
                i = string.equals("rate-call-data") ? 17 : -1;
                break;
            case -318071351:
                i = string.equals("decorative-participant-id-changed") ? 18 : -1;
                break;
            case -299374874:
                i = string.equals("rooms-updated") ? 19 : -1;
                break;
            case -191501435:
                if (!string.equals("feedback")) {
                    i = -1;
                }
                break;
            case -130352389:
                i = string.equals("pin-participant") ? 21 : -1;
                break;
            case -109284890:
                i = string.equals("participant-added") ? 22 : -1;
                break;
            case -53726114:
                i = string.equals("participant-state-changed") ? 23 : -1;
                break;
            case -6349260:
                i = string.equals("asr-started") ? 24 : -1;
                break;
            case 3208383:
                i = string.equals("hold") ? 25 : -1;
                break;
            case 6516608:
                i = string.equals("asr-stopped") ? 26 : -1;
                break;
            case 45361494:
                i = string.equals("topology-changed") ? 27 : -1;
                break;
            case 65959073:
                i = string.equals("promotion-approved") ? 28 : -1;
                break;
            case 148230891:
                i = string.equals("switch-micro") ? 29 : -1;
                break;
            case 335380875:
                i = string.equals("url-sharing-info-updated") ? 30 : -1;
                break;
            case 378271103:
                i = string.equals("mute-participant") ? 31 : -1;
                break;
            case 540816845:
                i = string.equals("registered-peer") ? 32 : -1;
                break;
            case 614369236:
                i = string.equals("transmitted-data") ? 33 : -1;
                break;
            case 778113871:
                i = string.equals("force-media-settings-change") ? 34 : -1;
                break;
            case 1037842889:
                i = string.equals("room-updated") ? 35 : -1;
                break;
            case 1094077426:
                i = string.equals("feature-set-changed") ? 36 : -1;
                break;
            case 1128844070:
                i = string.equals("audio-activity") ? 37 : -1;
                break;
            case 1145321190:
                i = string.equals("speaker-changed") ? 38 : -1;
                break;
            case 1175114531:
                i = string.equals("participant-joined") ? 39 : -1;
                break;
            case 1323654813:
                i = string.equals("features-per-role-changed") ? 40 : -1;
                break;
            case 1467147485:
                i = string.equals("stalled-activity") ? 41 : -1;
                break;
            case 1685715486:
                i = string.equals("chat-room-updated") ? 42 : -1;
                break;
            case 1736968659:
                i = string.equals("media-settings-changed") ? 43 : -1;
                break;
            case 1885175990:
                i = string.equals("movie-share-started") ? 44 : -1;
                break;
            case 1898041858:
                i = string.equals("movie-share-stopped") ? 45 : -1;
                break;
            case 2022715558:
                i = string.equals("promote-participant") ? 46 : -1;
                break;
            case 2138278323:
                i = string.equals("settings-update") ? 47 : -1;
                break;
            default:
                i = -1;
                break;
        }
        switch (i) {
            case 0:
                r6.x0.a(jSONObject);
                break;
            case 1:
                r6.N.log("OKRTCCall", "handleCloseConversation");
                r6.m0 = false;
                String strOptString = jSONObject.optString("reason");
                try {
                    if (!TextUtils.isEmpty(strOptString)) {
                        try {
                            it7VarValueOf = it7.valueOf(strOptString);
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                            it7VarValueOf = null;
                        }
                        r6.J = it7VarValueOf;
                    }
                } catch (IllegalArgumentException unused) {
                    r6.N.logException("OKRTCCall", "close.conversation.notify", new Exception(qv1.k("close.conversation.notify.unknown.reason.", strOptString)));
                }
                r6.e1.E(iql.b(d5g.a(strOptString), jSONObject.optString("errorCode"), null));
                r6.n(r5, null);
                r6.t("conversation_closed", null);
                break;
            case 2:
                r6.i(jSONObject.getJSONArray("options"));
                break;
            case 3:
                r6.r(jSONObject);
                break;
            case 4:
                r6.O0.f().e(jSONObject);
                break;
            case 5:
                if (!kql.w(jSONObject).equals(r6.j0.k().a())) {
                    r6.j0.g(new smc(kql.w(jSONObject), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new due(kql.I(jSONObject))), null);
                }
                break;
            case 6:
                yt1 yt1VarW = kql.w(jSONObject);
                if (yt1VarW.equals(r6.j0.k().a())) {
                    String string2 = jSONObject.getString("reason");
                    String strOptString2 = jSONObject.optString("explanationHtml");
                    String strOptString3 = jSONObject.optString("errorCode");
                    r6.N.log("OKRTCCall", qv1.k("We were removed from the conversation, reason = ", string2));
                    try {
                        it7VarValueOf2 = it7.valueOf(string2);
                    } catch (IllegalArgumentException e2) {
                        e2.printStackTrace();
                        it7VarValueOf2 = null;
                    }
                    r6.J = it7VarValueOf2;
                    r6.e1.E(iql.b(d5g.a(string2), strOptString3, strOptString2));
                    r6.n(oh1.c, new gt7(strOptString2, strOptString3, kql.L(jSONObject)));
                    r6.E0 = false;
                    r6.t("removed", null);
                } else {
                    r6.d0.a(r6.j0.l(yt1VarW));
                    ru1 ru1Var = r6.j0;
                    ru1Var.getClass();
                    if (yt1VarW.equals(r6.C0)) {
                        r6.C0 = null;
                        r6.n(oh1Var, null);
                    }
                }
                break;
            case 7:
                String strOptString4 = jSONObject.optString(ApiProtocol.PARAM_JOIN_LINK);
                r6.z = strOptString4;
                r6.n(oh1.D, strOptString4);
                break;
            case 8:
                ((kw1) r6.T0.getValue()).b(jSONObject);
                break;
            case 9:
                ((kw1) r6.T0.getValue()).c(jSONObject);
                break;
            case 10:
                r6.N.log("OKRTCCall", "Unexpected notification " + jSONObject + ". Ignore, because session id support is on");
                break;
            case 11:
                String strOptString5 = jSONObject.optString("participantId");
                if (!strOptString5.isEmpty()) {
                    yt1 yt1VarA = yt1.a(strOptString5);
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("roles");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            try {
                                try {
                                    arrayList.add(bu1.valueOf(jSONArrayOptJSONArray.getString(i2)));
                                } catch (IllegalArgumentException e3) {
                                    r6.N.logException("OKRTCCall", "invalid ROLE in handleRolesChanged", e3);
                                }
                            } catch (JSONException e4) {
                                r6.N.logException("OKRTCCall", "handleRolesChanged", e4);
                            }
                        }
                    }
                    r6.F0.k(arrayList, yt1VarA);
                    du1 du1VarL = r6.j0.l(yt1VarA);
                    if (du1VarL != null) {
                        ArrayList arrayList2 = du1VarL.d;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        du1 du1VarK = r6.j0.k();
                        if (du1VarL == du1VarK) {
                            i12 i12Var = r6.S0;
                            Iterator it = du1VarK.e.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = false;
                                } else if (((bu1) it.next()) == bu1.b) {
                                    z2 = true;
                                }
                            }
                            i12Var.d(z2);
                        }
                    }
                    r6.n(oh1.w, du1VarL);
                }
                break;
            case 12:
                r6.N.log("OKRTCCall", "handleAcceptCallNotification");
                yt1 yt1VarW2 = kql.w(jSONObject);
                if (!yt1VarW2.equals(r6.j0.k().a())) {
                    if (!r6.D && !r6.m1) {
                        r6.z();
                        r6.n0.L();
                    }
                    wwf wwfVar = r6.M;
                    if (wwfVar.b) {
                        r6.N.log("OKRTCCall", "New accept from participantId=" + yt1VarW2);
                    } else {
                        wwfVar.b();
                    }
                    zq1 zq1Var = r6.F0;
                    n8b n8bVarF = zq1Var.f(jSONObject, yt1VarW2, "handleAcceptCall", zq1Var.h(r6.j0.k).a(), true);
                    p8b p8bVarM = kql.m(jSONObject);
                    if (p8bVarM == null) {
                        throw new NullPointerException(jSONObject.toString());
                    }
                    try {
                        ru1 ru1Var2 = r6.j0;
                        imc xr8Var = new xr8();
                        imc xr8Var2 = new xr8();
                        imc xr8Var3 = new xr8();
                        due dueVar = new due(kql.o(jSONObject));
                        due dueVar2 = new due(n8bVarF);
                        due dueVar3 = new due(p8bVarM);
                        due dueVar4 = new due(kql.u(jSONObject));
                        hi1 hi1VarI = kql.i(jSONObject);
                        if (hi1VarI != null) {
                            xr8Var = new due(hi1VarI);
                        }
                        imc imcVar = xr8Var;
                        due dueVar5 = new due(r6.N0.a.d(jSONObject, r6.j0.k));
                        Integer numC = kql.C(jSONObject);
                        if (numC != null) {
                            xr8Var2 = new due(numC);
                        }
                        imc imcVar2 = xr8Var2;
                        cu1 cu1VarJ = kql.J(jSONObject);
                        if (cu1VarJ != null) {
                            xr8Var3 = new due(cu1VarJ);
                        }
                        du1VarG = ru1Var2.g(new smc(yt1VarW2, dueVar, dueVar2, dueVar3, dueVar4, imcVar, dueVar5, imcVar2, xr8Var3), null);
                    } catch (IllegalStateException e5) {
                        r6.N.reportException("OKRTCCall", "accept.call.add", e5);
                        du1VarG = null;
                    }
                    r6.m0 = true;
                    if (r6.v) {
                        r6.l.removeMessages(132);
                        r6.n(oh1Var2, du1VarG);
                    }
                } else {
                    r6.n(oh1.d, null);
                    r6.t("accepted.on.other.device", null);
                }
                break;
            case 13:
                ((xde) r6.O0.c).I(jSONObject);
                break;
            case 14:
                long j = jSONObject.getLong(ApiProtocol.PARAM_CHAT_ID);
                r6.Z = j;
                r6.n(oh1.o, Long.valueOf(j));
                break;
            case 15:
                r6.N.log("OKRTCCall", "handleConnection");
                JSONObject jSONObject2 = jSONObject.getJSONObject("conversation");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediaModifiers");
                h0a h0aVar = r6.u0;
                h0aVar.getClass();
                if (jSONObjectOptJSONObject != null) {
                    h0aVar.a = jSONObjectOptJSONObject.optBoolean("denoise");
                    h0aVar.b = jSONObjectOptJSONObject.optBoolean("denoiseAnn");
                }
                r6.j(jSONObject2);
                r6.F0.n(jSONObject2, "handleConnection", 2, bnfVar, true);
                r6.k(jSONObject2, jSONObject.getBoolean("isConcurrent"), false);
                r6.o(jSONObject);
                cyl.c(r6.z0, jSONObject.optLong("stamp", 0L));
                if (r6.E0 || !"ENDED".equals(jSONObject2.getString("state"))) {
                    ?? r0 = r6.T;
                    if (r0 != 0) {
                        r0.a(r6);
                    }
                    if (r6.E0) {
                        zq1 zq1Var2 = r6.F0;
                        zq1Var2.getClass();
                        zq1Var2.i = new n8b();
                    }
                    r6.F0.l(true);
                    ?? r1 = r6.k;
                    if (r1 != 0) {
                        r1.h(r6);
                    }
                    r6.n(oh1.v, null);
                    boolean z8 = r6.C;
                    if (z8 || !r6.v || r6.m1) {
                        r6.I();
                    } else if (z8) {
                        r6.N.log("OKRTCCall", "Can't start interaction twice. Ignore");
                    } else {
                        r6.C = true;
                        r6.I();
                        r6.n0.s(!((v88) r6.n.a()).n());
                        r6.N.log("OKRTCCall", "Call started as ".concat(r6.y ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND));
                    }
                    r6.W0.e();
                } else {
                    r6.e1.E(ConversationEndReason.ConversationAlreadyEnded.INSTANCE);
                    r6.n(r5, null);
                    r6.t("conversation.ended", null);
                }
                break;
            case 16:
                for (au1 au1Var : r6.N0.e.c(jSONObject)) {
                    r6.Q0.n.onStateChanged(au1Var.b, au1Var);
                }
                break;
            case 17:
                r6.O0.j().onRateCall(jSONObject);
                break;
            case 18:
                r6.O0.g().K(jSONObject);
                break;
            case 19:
                ((xde) r6.O0.c).K(jSONObject);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                r6.O0.i().J(jSONObject);
                break;
            case 21:
                String strOptString6 = jSONObject.optString("participantId");
                if (!strOptString6.isEmpty()) {
                    yt1 yt1VarA2 = yt1.a(strOptString6);
                    boolean z9 = kql.z(jSONObject);
                    r6.F0.j(yt1VarA2, z9);
                    Integer numValueOf = jSONObject.has("roomId") ? Integer.valueOf(jSONObject.optInt("roomId")) : null;
                    if (numValueOf != null && numValueOf.intValue() > 0) {
                        r6.S0.c(z9, yt1VarA2, new cnf(numValueOf.intValue()));
                    } else if (z9) {
                        r6.C0 = null;
                    } else {
                        r6.C0 = yt1VarA2;
                    }
                    r6.n(oh1Var, r6.C0);
                }
                break;
            case 22:
                r6.N.log("OKRTCCall", "handleParticipantAdded");
                yt1 yt1VarW3 = kql.w(jSONObject);
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("participant");
                if (!yt1VarW3.equals(r6.j0.k().a())) {
                    r6.C(yt1VarW3, jSONObjectOptJSONObject2);
                }
                break;
            case 23:
                au1 au1VarD = r6.N0.e.d(jSONObject);
                if (au1VarD != null) {
                    r6.Q0.n.onStateChanged(au1VarD.b, au1VarD);
                }
                break;
            case 24:
                ((tb1) r6.U0.getValue()).b(jSONObject);
                break;
            case 25:
                String strOptString7 = jSONObject.optString("participantId");
                if (!strOptString7.isEmpty()) {
                    yt1 yt1VarA3 = yt1.a(strOptString7);
                    du1 du1VarL2 = r6.j0.l(yt1VarA3);
                    if (du1VarL2 == null) {
                        r6.N.log("OKRTCCall", "unknown participant id " + yt1VarA3.a);
                    } else {
                        boolean zOptBoolean = jSONObject.optBoolean("hold");
                        if (!yt1VarA3.equals(r6.j0.k().a())) {
                            r6.Q0.b().a(String.valueOf(yt1VarA3.a), zOptBoolean);
                            CidLogger cidLogger = r6.N;
                            if (zOptBoolean) {
                                cidLogger.log("OKRTCCall", "got remote hold from participant " + du1VarL2);
                                r6.l.removeMessages(131);
                                du1VarL2.t = true;
                                r6.n0.E(du1VarL2);
                            } else {
                                cidLogger.log("OKRTCCall", "got remote unhold from participant " + du1VarL2);
                                du1VarL2.t = false;
                                if (!r6.m1) {
                                    r6.n0.F(du1VarL2);
                                }
                            }
                        }
                    }
                }
                break;
            case 26:
                ((tb1) r6.U0.getValue()).c(jSONObject);
                break;
            case 27:
                r6.N.log("OKRTCCall", "handleNewTopology");
                zvh zvhVarA = zvh.a(jSONObject.getString("topology"));
                if (!r6.n0.I(zvhVarA)) {
                    r6.f(zvhVarA, false);
                }
                r6.d(r6.n0, 1);
                break;
            case 28:
                r6.O0.m().q(jSONObject);
                break;
            case 29:
                if (jSONObject.has("mute")) {
                    r6.n(jSONObject.getBoolean("mute") ? oh1.s : oh1.t, null);
                } else {
                    r6.N.log("OKRTCCall", "switch-micro without 'mute'");
                }
                break;
            case 30:
                r6.O0.l().o(jSONObject);
                break;
            case 31:
                r6.F0.i(jSONObject);
                break;
            case 32:
                yt1 yt1VarW4 = kql.w(jSONObject);
                bpc bpcVarO = kql.o(jSONObject);
                String strOptString8 = jSONObject.optString("platform");
                String strOptString9 = jSONObject.optString("clientType");
                r6.l.removeMessages(132);
                r6.n(oh1.k, null);
                r6.j0.n(yt1VarW4, bpcVarO, strOptString8, strOptString9);
                break;
            case 33:
                r6.N.log("OKRTCCall", "handleTransmittedDataNotification");
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                JSONObject jSONObjectOptJSONObject3 = jSONObject3.optJSONObject("sdp");
                SessionDescription sessionDescription = jSONObjectOptJSONObject3 != null ? new SessionDescription(SessionDescription.Type.fromCanonicalForm(jSONObjectOptJSONObject3.getString("type")), jSONObjectOptJSONObject3.getString("sdp")) : null;
                if (sessionDescription != null) {
                    yt1 yt1VarW5 = kql.w(jSONObject);
                    bpc bpcVarO2 = kql.o(jSONObject);
                    try {
                        z3 = jSONObjectOptJSONObject3.getBoolean("p2pRelay");
                    } catch (Exception unused2) {
                        z3 = false;
                    }
                    SessionDescription.Type type = sessionDescription.type;
                    if (type == SessionDescription.Type.OFFER) {
                        if (r6.j0.l(yt1VarW5) == null) {
                            r6.N.logException("OKRTCCall", "td.sdp.npe", new Exception("td.sdp.unknown.participant"));
                        } else {
                            if (z3) {
                                r6.N.log("OKRTCCall", "handle remote offer. firstConnection? " + r6.Q + ", isP2PRelayForced " + r6.f1);
                                if (r6.Q) {
                                    r6.N.log("OKRTCCall", "redirection to P2P relay initiated by server");
                                    r6.f1 = true;
                                    r6.n0.X(true);
                                    Iterator it2 = r6.l0.iterator();
                                    while (it2.hasNext()) {
                                        ((dwh) it2.next()).onTopologyUpdated(zvhVar, zvhVar);
                                    }
                                } else if (!r6.f1) {
                                    r6.N.log("OKRTCCall", "redirection to P2P relay initiated by opponent");
                                    r6.f1 = true;
                                    r6.f(zvhVar, false);
                                    r6.d(r6.n0, 1);
                                }
                            }
                            r6.n0.q(yt1VarW5, sessionDescription);
                        }
                    } else if (type == SessionDescription.Type.ANSWER && bpcVarO2 != null) {
                        du1 du1VarG2 = r6.j0.g(new smc(yt1VarW5, new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8()), bnfVar);
                        if (du1VarG2.c() && Objects.equals(du1.u, du1VarG2.k)) {
                            r6.j0.g(new smc(yt1VarW5, new due(bpcVarO2), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8()), bnfVar);
                        }
                        r6.N.log("OKRTCCall", "handle remote answer. isP2PRelayEnabledByServer? " + z3 + " already forced? " + r6.f1);
                        if (!z3 && r6.f1) {
                            r6.G(r6.n0);
                        }
                        if (z3) {
                            r6.f1 = true;
                            r6.n0.X(true);
                            Iterator it3 = r6.l0.iterator();
                            while (it3.hasNext()) {
                                ((dwh) it3.next()).onTopologyUpdated(zvhVar, zvhVar);
                            }
                        }
                    }
                } else if (!jSONObject3.has("candidate") && !jSONObject3.has("candidates-removed")) {
                    r6.N.logException("OKRTCCall", "unhandled.transmitted.data", new Exception("transmitted.data.has.unknown.type"));
                }
                break;
            case 34:
                r6.N.log("OKRTCCall", "handleForceChangeMediaSettings");
                p8b p8bVarM2 = kql.m(jSONObject);
                if (p8bVarM2 == null) {
                    r6.N.reportException("OKRTCCall", "ms.force.change.npe", new Exception("ms.force.change.no.mediasettings"));
                } else {
                    if (p8bVarM2.e || !(z6 = (p8bVar2 = r6.t0).e)) {
                        z4 = false;
                    } else {
                        if (z6) {
                            p8bVar2.e = false;
                            p8bVar2.a();
                        }
                        r6.n(oh1.q, null);
                        z4 = true;
                    }
                    if (!p8bVarM2.f && (z5 = (p8bVar = r6.t0).f)) {
                        if (z5) {
                            p8bVar.f = false;
                            p8bVar.a();
                        }
                        r6.n(oh1.r, null);
                        z4 = true;
                    }
                    if (z4) {
                        r6.I();
                    }
                }
                break;
            case vg8.l /* 35 */:
                ((xde) r6.O0.c).J(jSONObject);
                break;
            case 36:
                ((ljf) r6.O0.b).Q(jSONObject);
                r6.N.log("OKRTCCall", "handleFeatureSetChanged");
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("features");
                if (jSONArrayOptJSONArray2 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArrayOptJSONArray2.length()) {
                            z7 = false;
                        } else if ("ADD_PARTICIPANT".equalsIgnoreCase(jSONArrayOptJSONArray2.optString(i3))) {
                            z7 = true;
                        } else {
                            i3++;
                        }
                    }
                } else {
                    z7 = false;
                }
                r6.N.log("OKRTCCall", "setFeatureAddParticipantEnabled, ".concat(uza.e(Boolean.valueOf(z7))));
                if (r6.s0 != z7) {
                    r6.s0 = z7;
                }
                break;
            case LangUtils.HASH_OFFSET /* 37 */:
                ArrayList arrayListF = kql.F(jSONObject);
                if (arrayListF != null) {
                    r6.j0.t(arrayListF);
                }
                break;
            case 38:
                yt1 yt1VarE = kql.E(jSONObject);
                if (yt1VarE != null) {
                    r6.j0.r(yt1VarE);
                }
                break;
            case 39:
                r6.N.log("OKRTCCall", "handleParticipantJoined");
                JSONObject jSONObject4 = jSONObject.getJSONObject("participant");
                yt1 yt1VarX = kql.x(jSONObject4);
                if (!yt1VarX.equals(r6.j0.a.a)) {
                    zq1 zq1Var3 = r6.F0;
                    n8b n8bVarF2 = zq1Var3.f(jSONObject4, yt1VarX, "handleParticipantJoined", zq1Var3.h(bnfVar).a(), true);
                    p8b p8bVarM3 = kql.m(jSONObject4);
                    if (p8bVarM3 == null) {
                        r6.N.logException("OKRTCCall", "joined.notify", new Exception("joined.notify.mediaSettings.is.null"));
                    }
                    bpc bpcVarO3 = kql.o(jSONObject4);
                    du1 du1VarL3 = r6.j0.l(yt1VarX);
                    if (bpcVarO3 == null || du1VarL3 == null || !du1VarL3.c() || bpcVarO3.equals(du1VarL3.k) || Objects.equals(du1.u, du1VarL3.k)) {
                        ru1 ru1Var3 = r6.j0;
                        imc xr8Var4 = new xr8();
                        xr8 xr8Var5 = new xr8();
                        xr8 xr8Var6 = new xr8();
                        imc xr8Var7 = new xr8();
                        due dueVar6 = new due(bpcVarO3);
                        imc dueVar7 = xr8Var6;
                        due dueVar8 = new due(n8bVarF2);
                        if (p8bVarM3 != null) {
                            xr8Var4 = new due(p8bVarM3);
                        }
                        imc dueVar9 = xr8Var5;
                        due dueVar10 = new due(kql.u(jSONObject4));
                        hi1 hi1VarI2 = kql.i(jSONObject4);
                        if (hi1VarI2 != null) {
                            dueVar9 = new due(hi1VarI2);
                        }
                        imc imcVar3 = dueVar9;
                        due dueVar11 = new due(r6.N0.a.d(jSONObject4, bnfVar));
                        Integer numC2 = kql.C(jSONObject4);
                        if (numC2 != null) {
                            dueVar7 = new due(numC2);
                        }
                        imc imcVar4 = dueVar7;
                        cu1 cu1VarJ2 = kql.J(jSONObject4);
                        if (cu1VarJ2 != null) {
                            xr8Var7 = new due(cu1VarJ2);
                        }
                        du1 du1VarG3 = ru1Var3.g(new smc(yt1VarX, dueVar6, dueVar8, xr8Var4, dueVar10, imcVar3, dueVar11, imcVar4, xr8Var7), bnfVar);
                        String strH = kql.H(jSONObject4);
                        if (!du1VarG3.c() && "ACCEPTED".equals(strH)) {
                            du1VarG3.f(du1.u);
                        }
                        r6.n0.r(du1VarG3, true);
                        if (r6.v) {
                            r6.N.log("OKRTCCall", "Opponent accepted (joined) call: " + du1VarG3);
                            if (!r6.D) {
                                r6.z();
                            }
                            r6.m0 = true;
                            wwf wwfVar2 = r6.M;
                            if (!wwfVar2.b) {
                                wwfVar2.b();
                            }
                            r6.l.removeMessages(132);
                            r6.n(oh1Var2, du1VarG3);
                        }
                    } else {
                        r6.N.logException("OKRTCCall", "joined.notify", new Exception("joined.notify.participant.aready.exist"));
                    }
                }
                break;
            case 40:
                ((ljf) r6.O0.b).R(jSONObject);
                break;
            case 41:
                ArrayList arrayListG = kql.G(jSONObject, "stalledParticipants");
                if (arrayListG != null) {
                    r6.D0 = arrayListG;
                }
                break;
            case 42:
                ((ewe) r6.O0.e).p(jSONObject);
                break;
            case 43:
                r6.N.log("OKRTCCall", "handleMediaSettingsChanged");
                yt1 yt1VarW6 = kql.w(jSONObject);
                if (!yt1VarW6.equals(r6.j0.a.a)) {
                    du1 du1VarL4 = r6.j0.l(yt1VarW6);
                    if (du1VarL4 == null) {
                        r6.N.reportException("OKRTCCall", "ms.changed.npe", new Exception("participant.is.null"));
                    } else {
                        p8b p8bVarM4 = kql.m(jSONObject);
                        if (p8bVarM4 == null) {
                            r6.N.reportException("OKRTCCall", "ms.changed.absent", new Exception("no.mediasettings.in.notification"));
                        } else {
                            n8b n8bVar = du1VarL4.b;
                            n8bVar.getClass();
                            n8b n8bVar2 = new n8b(n8bVar.a, n8bVar.b, n8bVar.c, n8bVar.d);
                            n8b n8bVar3 = du1VarL4.b;
                            o0a o0aVar2 = n8bVar3.a;
                            o0a o0aVar3 = o0a.d;
                            if (o0aVar2 == o0aVar3 && du1VarL4.c.e && !p8bVarM4.e) {
                                n8bVar2.a = o0aVar;
                            }
                            if (n8bVar3.b == o0aVar3 && du1VarL4.c.f && !p8bVarM4.f) {
                                n8bVar2.b = o0aVar;
                            }
                            if (n8bVar3.c == o0aVar3 && du1VarL4.c.b && !p8bVarM4.b) {
                                n8bVar2.c = o0aVar;
                            }
                            boolean z10 = du1VarL4.c.g;
                            boolean z11 = p8bVarM4.g;
                            if (z10 != z11) {
                                nl nlVar = r6.x0;
                                nlVar.getClass();
                                if (nlVar.i) {
                                    km kmVar = nlVar.h;
                                    yt1 yt1Var = du1VarL4.a;
                                    if (yt1Var == null) {
                                        kmVar.getClass();
                                    } else {
                                        kmVar.g.post(new jm(z11, kmVar, yt1Var, 0));
                                    }
                                }
                            }
                            ru1 ru1Var4 = r6.j0;
                            smc smcVar = new smc(yt1VarW6, new xr8(), new due(n8bVar2), new due(p8bVarM4), new xr8(), new xr8(), new xr8(), new xr8(), new xr8());
                            ru1Var4.getClass();
                            ru1Var4.g(smcVar, null);
                            r6.n(oh1.f, null);
                        }
                    }
                }
                break;
            case 44:
                ((xtj) r6.O0.a).x(jSONObject);
                break;
            case 45:
                xtj xtjVar = (xtj) r6.O0.a;
                ru1 ru1Var5 = (ru1) xtjVar.b;
                tx txVar = (tx) xtjVar.c;
                txVar.getClass();
                try {
                    e2bVarB = tx.b(jSONObject);
                } catch (Throwable th) {
                    txVar.a.logException("VideoStreamsParser", "Can't parse stop movie notification", th);
                    e2bVarB = null;
                }
                if (e2bVarB != null) {
                    yt1 yt1Var2 = e2bVarB.a;
                    du1 du1VarL5 = ru1Var5.l(yt1Var2);
                    if (du1VarL5 != null) {
                        List list = du1VarL5.r;
                        list.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : list) {
                            r1b r1bVar = (r1b) obj;
                            if (!r1bVar.a.equals(e2bVarB.c) || r1bVar.d != e2bVarB.d) {
                                arrayList3.add(obj);
                            }
                        }
                        ru1Var5.g(new smc(yt1Var2, new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new due(arrayList3), new xr8(), new xr8()), null);
                    }
                    ((s81) xtjVar.d).invoke(oh1.G, e2bVarB);
                }
                break;
            case 46:
                try {
                    boolean z12 = jSONObject.getBoolean("demote");
                    r6.E0 = z12;
                    try {
                        if (!z12) {
                            JSONObject jSONObject5 = jSONObject.getJSONObject("conversation");
                            if ("ENDED".equals(jSONObject5.getString("state"))) {
                                r6.e1.E(ConversationEndReason.ConversationAlreadyEnded.INSTANCE);
                                r6.n(r5, null);
                                r6.t("conversation.ended", null);
                            } else {
                                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("mediaModifiers");
                                h0a h0aVar2 = r6.u0;
                                h0aVar2.getClass();
                                if (jSONObjectOptJSONObject4 != null) {
                                    h0aVar2.a = jSONObjectOptJSONObject4.optBoolean("denoise");
                                    h0aVar2.b = jSONObjectOptJSONObject4.optBoolean("denoiseAnn");
                                }
                                r6.j(jSONObject5);
                                try {
                                    r5 = "OKRTCCall";
                                    z = true;
                                    r6.F0.n(jSONObject5, "handlePromoteParticipant", 2, bnfVar, true);
                                    r6.k(jSONObject5, jSONObject.optBoolean("isConcurrent", false), true);
                                    r6.o(jSONObject);
                                    r6.H();
                                    r6.B();
                                } catch (JSONException e6) {
                                    e = e6;
                                    r4 = "OKRTCCall";
                                    r6.N.logException(r4, "handlePromoteParticipant " + e.getMessage(), e);
                                }
                            }
                        } else {
                            r5 = "OKRTCCall";
                            z = true;
                            if (!((o91) r6.a1.a).t.contains(m91.e)) {
                                r6.j0.i();
                            }
                            zq1 zq1Var4 = r6.F0;
                            zq1Var4.getClass();
                            zq1Var4.i = new n8b();
                        }
                        r6.F0.l(z);
                        r6.Q0.d.onMeInWaitingRoomChanged(z12);
                        r6.I();
                    } catch (JSONException e7) {
                        e = e7;
                        r4 = r5;
                    }
                } catch (JSONException e8) {
                    e = e8;
                    r4 = "OKRTCCall";
                }
                break;
            case 47:
                r6.n1 = kql.y(jSONObject, "screenSharing");
                r6.o1 = kql.y(jSONObject, "camera");
                r6.A();
                if (r6.P) {
                    zn0 zn0Var = r6.O;
                    zn0Var.getClass();
                    JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("settings");
                    if (jSONObjectOptJSONObject5 != null) {
                        dak dakVar = zn0Var.j;
                        JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("badNet");
                        dakVar.getClass();
                        if (jSONObjectOptJSONObject6 != null) {
                            dakVar.a = jSONObjectOptJSONObject6.optInt(RttRateHintConfig.RTT);
                            dakVar.b = jSONObjectOptJSONObject6.optDouble("loss");
                        }
                        dak dakVar2 = zn0Var.i;
                        JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject5.optJSONObject("goodNet");
                        dakVar2.getClass();
                        if (jSONObjectOptJSONObject7 != null) {
                            dakVar2.a = jSONObjectOptJSONObject7.optInt(RttRateHintConfig.RTT);
                            dakVar2.b = jSONObjectOptJSONObject7.optDouble("loss");
                        }
                    }
                }
                break;
        }
        r6.I0.L("notification handling of ".concat(string));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (r8.contains(r10) != false) goto L76;
     */
    @Override // defpackage.n4g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResponse(org.json.JSONObject r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q81.onResponse(org.json.JSONObject):void");
    }
}
