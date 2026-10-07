package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationFactoryInitParams;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.events.AnalyticsEventListener;
import ru.ok.android.externcalls.sdk.ext.JsonExtKt;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes3.dex */
public final class mi1 implements a92 {
    public static final hj8 e = new hj8(1, 99, 1);
    public static final hj8 f = new hj8(1, 10, 1);
    public final fsb a;
    public final ny8 b;
    public final ifh c;
    public final ifh d;

    public mi1(final ny8 ny8Var, final ny8 ny8Var2, final ny8 ny8Var3, fsb fsbVar, final ny8 ny8Var4, final ny8 ny8Var5, final ny8 ny8Var6, final ny8 ny8Var7, final ny8 ny8Var8, final ny8 ny8Var9, ny8 ny8Var10, final ny8 ny8Var11) {
        this.a = fsbVar;
        this.b = ny8Var10;
        this.c = new ifh(new w40(ny8Var10, 3));
        this.d = new ifh(new af7() { // from class: ii1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v193 */
            /* JADX WARN: Type inference failed for: r0v194, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r0v249 */
            /* JADX WARN: Type inference failed for: r0v250, types: [ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate] */
            /* JADX WARN: Type inference failed for: r0v257 */
            /* JADX WARN: Type inference failed for: r0v258, types: [ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate] */
            /* JADX WARN: Type inference failed for: r0v265 */
            /* JADX WARN: Type inference failed for: r0v266, types: [iq8] */
            /* JADX WARN: Type inference failed for: r0v32, types: [ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$Builder] */
            /* JADX WARN: Type inference failed for: r0v322 */
            /* JADX WARN: Type inference failed for: r0v323 */
            /* JADX WARN: Type inference failed for: r0v324 */
            /* JADX WARN: Type inference failed for: r0v325 */
            /* JADX WARN: Type inference failed for: r0v45 */
            /* JADX WARN: Type inference failed for: r0v46, types: [n81] */
            /* JADX WARN: Type inference failed for: r0v47 */
            /* JADX WARN: Type inference failed for: r11v21 */
            /* JADX WARN: Type inference failed for: r11v22, types: [woc] */
            /* JADX WARN: Type inference failed for: r11v63 */
            /* JADX WARN: Type inference failed for: r12v19 */
            /* JADX WARN: Type inference failed for: r12v20, types: [boolean] */
            /* JADX WARN: Type inference failed for: r12v33 */
            /* JADX WARN: Type inference failed for: r15v10 */
            /* JADX WARN: Type inference failed for: r15v6 */
            /* JADX WARN: Type inference failed for: r15v7, types: [et7] */
            /* JADX WARN: Type inference failed for: r2v67 */
            /* JADX WARN: Type inference failed for: r2v68, types: [woc] */
            /* JADX WARN: Type inference failed for: r2v82 */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v3, types: [vke] */
            /* JADX WARN: Type inference failed for: r3v45 */
            /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Long] */
            /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, ru.ok.android.externcalls.sdk.ConversationFactory, ru.ok.android.externcalls.sdk.ConversationFactoryParams] */
            /* JADX WARN: Type inference failed for: r8v12 */
            /* JADX WARN: Type inference failed for: r8v13 */
            @Override // defpackage.af7
            public final Object invoke() {
                String str;
                String stringOrDefault;
                ?? n81Var;
                ?? vkeVar;
                boolean z;
                boolean zOptBoolean;
                int i;
                u5g u5gVar;
                Object cfVar;
                int i2;
                ?? wocVar;
                dh6 dh6Var;
                ?? r0;
                Object objValueOf;
                Float fValueOf;
                mi1 mi1Var = this.a;
                ifh ifhVar = mi1Var.c;
                ny8 ny8Var12 = ny8Var3;
                wxb wxbVar = (wxb) ny8Var12.getValue();
                gjf gjfVar = (gjf) ny8Var4.getValue();
                wxbVar.getClass();
                int iIntValue = ((Number) ((g5d) gjfVar).a.d().i()).intValue();
                int i3 = 3;
                y3e li1Var = iIntValue == 3 ? new li1() : new x3e();
                ny8 ny8Var13 = ny8Var;
                Context context = (Context) ny8Var13.getValue();
                ConversationFactoryInitParams.PeerConnection.Builder nativeLibraryLoader = new ConversationFactoryInitParams.PeerConnection.Builder().setEarlyAudioPlayoutEnabled(false).setEarlyAudioRecordingEnabled(false).setSimulcastEnabled(((Boolean) ifhVar.getValue()).booleanValue()).setNativeLibraryLoader(new hu(li1Var, 2, new wab(context.getApplicationContext())));
                String str2 = (String) mi1Var.b().V0.a(e5d.S6[98]).i();
                String str3 = "can't read traffic markers";
                if (str2.length() == 0) {
                    stringOrDefault = null;
                    str = null;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (JsonExtKt.getBooleanOrDefault(jSONObject, MLFeatureConfigProviderBase.ENABLED_KEY, false)) {
                            str = null;
                            try {
                                stringOrDefault = JsonExtKt.getStringOrDefault(jSONObject, "stun", "0x8021:0xfc09b46f");
                            } catch (JSONException e2) {
                                e = e2;
                                li1Var.logException("CallsSdk", "can't read traffic markers", e);
                                stringOrDefault = str;
                            }
                        } else {
                            str = null;
                            stringOrDefault = str;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        str = null;
                    }
                }
                if (stringOrDefault != null) {
                    nativeLibraryLoader.setUdpMarker(stringOrDefault);
                }
                b5d b5dVar = mi1Var.b().U0;
                zv8[] zv8VarArr = e5d.S6;
                if (((Boolean) b5dVar.a(zv8VarArr[97]).i()).booleanValue()) {
                    nativeLibraryLoader.setLogger(li1Var);
                }
                ?? peerConnection = new ConversationFactoryInitParams.Builder(context).setPeerConnection(nativeLibraryLoader.build());
                long jLongValue = ((Number) mi1Var.b().K5.a(zv8VarArr[350]).i()).longValue();
                ConversationFactory.init(peerConnection.setSharedSettingsStorageEnabled(jLongValue <= 0 ? str : Long.valueOf(TimeUnit.SECONDS.toMillis(jLongValue))).build());
                ?? conversationFactory = new ConversationFactory(mi1Var.a, (Context) ny8Var13.getValue(), "ONE_ME");
                uik uikVar = new uik(i3, ny8Var2);
                String str4 = (String) mi1Var.b().V1.a(zv8VarArr[150]).i();
                co0 co0Var = co0.e;
                if (str4 != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str4);
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("calcNetworkStatusConfig");
                        if (jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled", true) : true) {
                            n81Var = new n81(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("redline", 0.3d) : 0.3d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("redlineMargin", 0.1d) : 0.1d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("ratingWeightUp", 1.0d) : 1.0d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("ratingWeightDown", 1.0d) : 1.0d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("goodRtt", 0.4d) : 0.4d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("rttWeightUp", 0.25d) : 0.25d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("rttWeightDown", 0.25d) : 0.25d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("rttStep", 0.055d) : 0.055d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("rttStepWeight", 0.12d) : 0.12d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("fastLossWeight", 0.6d) : 0.6d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("slowLossWeight", 0.25d) : 0.25d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("fastLossValue", 13.0d) : 13.0d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("slowLossValue", 7.0d) : 7.0d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("criticalRtt", -1.0d) : -1.0d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("criticalFastLoss", -1.0d) : -1.0d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("criticalSlowLoss", -1.0d) : -1.0d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("newNetworkRatingModelEnabled", true) : true, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("goodLoss", 0.0d) : 0.0d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("lossStep", 0.015d) : 0.015d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("lossStepWeight", 0.17d) : 0.17d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("bitrateRatingEnabled", true) : true, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("bitrateRatingInfluenceFactor", 1.0d) : 1.0d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("estimatedBitrateWeightUp", 0.75d) : 0.75d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("estimatedBitrateWeightDown", 0.75d) : 0.75d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("reportedBitrateWeightUp", 0.75d) : 0.75d, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("reportedBitrateWeightDown", 0.75d) : 0.75d);
                        } else {
                            n81Var = str;
                        }
                        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("reportNetworkStatusConfig");
                        if (jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optBoolean("enabled", true) : true) {
                            vkeVar = new vke(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optInt("networkStatusReportIntervalMs", 5000) : 5000, jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optInt("networkStatusReportForceIntervalMs", 10000) : 10000, jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optDouble("networkStatusReportThreshold", 0.15d) : 0.15d);
                        } else {
                            vkeVar = str;
                        }
                        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("signalingConfig");
                        boolean zOptBoolean2 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optBoolean("dcReportNetworkStatEnabled", true) : true;
                        if (jSONObjectOptJSONObject3 != null) {
                            z = false;
                            zOptBoolean = jSONObjectOptJSONObject3.optBoolean("producerCommandV3", false);
                        } else {
                            z = false;
                            zOptBoolean = false;
                        }
                        bo0 bo0Var = new bo0(zOptBoolean2, zOptBoolean);
                        JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("debugLoggingConfig");
                        co0Var = new co0(n81Var, vkeVar, bo0Var, new ao0(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optBoolean("debugLogging", z) : z, jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optBoolean("debugVerboseLogging", z) : false));
                    } catch (Exception e4) {
                        mi1Var = mi1Var;
                        ifhVar = ifhVar;
                        i3 = 3;
                        str3 = "can't read traffic markers";
                        li1Var.logException("BadNetworkIndicatorConfig", "Can't parse BadNetworkIndicatorConfig", e4);
                    }
                } else {
                    mi1Var = mi1Var;
                    ifhVar = ifhVar;
                    i3 = 3;
                    str3 = "can't read traffic markers";
                }
                conversationFactory.setBadNetworkIndicatorConfig(co0Var);
                conversationFactory.setEnableLossRttBadConnectionHandling(true);
                conversationFactory.setScreenCapturePermissionProvider(uikVar);
                conversationFactory.setDeviceAudioShareEnabled(true);
                ClientCapabilities clientCapabilities = ClientCapabilities.INSTANCE.empty().set(ClientCapabilities.Capability.SCREEN_TRACK_PRODUCER, true).set(ClientCapabilities.Capability.VIDEO_TRACKS, true).set(ClientCapabilities.Capability.WAITING_HALL, true).set(ClientCapabilities.Capability.FILTER_DEFAULTS, true).set(ClientCapabilities.Capability.SCREEN_TRACK_CONSUMER, true).set(ClientCapabilities.Capability.ADMIN_MUTE_NOTIFY, true).set(ClientCapabilities.Capability.HOLD, ((Boolean) mi1Var.b().y().i()).booleanValue()).set(ClientCapabilities.Capability.ADD_PARTICIPANT, true).set(ClientCapabilities.Capability.USE_P2P_RELAY, true).set(ClientCapabilities.Capability.SESSION_STATE_UPDATES, true);
                ClientCapabilities.Capability capability = ClientCapabilities.Capability.WAIT_FOR_ADMIN;
                b5d b5dVar2 = mi1Var.b().K0;
                zv8[] zv8VarArr2 = e5d.S6;
                conversationFactory.setClientCapabilities(clientCapabilities.set(capability, ((Boolean) b5dVar2.a(zv8VarArr2[87]).i()).booleanValue()));
                if (((Boolean) mi1Var.b().l1.a(zv8VarArr2[114]).i()).booleanValue()) {
                    conversationFactory.setVideoCodecs(new String[]{"H265", "H264", "VP8"});
                } else {
                    conversationFactory.setVideoCodecs(new String[]{"H264", "VP8"});
                }
                ih6 experiments = conversationFactory.getExperiments();
                if (((Boolean) ifhVar.getValue()).booleanValue()) {
                    y7b y7bVar = experiments.a.G;
                    zv8 zv8Var = z7b.k0[31];
                    y7bVar.b(fh6.c);
                } else if (((Boolean) mi1Var.b().A5.a(zv8VarArr2[340]).i()).booleanValue()) {
                    y7b y7bVar2 = experiments.a.G;
                    zv8 zv8Var2 = z7b.k0[31];
                    y7bVar2.b(fh6.b);
                } else {
                    y7b y7bVar3 = experiments.a.G;
                    zv8 zv8Var3 = z7b.k0[31];
                    y7bVar3.b(fh6.a);
                }
                z7b z7bVar = experiments.a;
                y7b y7bVar4 = z7bVar.e;
                zv8[] zv8VarArr3 = z7b.k0;
                zv8 zv8Var4 = zv8VarArr3[i3];
                Boolean bool = Boolean.TRUE;
                y7bVar4.b(bool);
                y7b y7bVar5 = z7bVar.q;
                zv8 zv8Var5 = zv8VarArr3[15];
                y7bVar5.b(bool);
                String str5 = (String) mi1Var.b().m1.a(zv8VarArr2[115]).i();
                if (str5.length() == 0) {
                    u5gVar = new u5g();
                    i = 0;
                } else {
                    try {
                        JSONObject jSONObject3 = new JSONObject(str5);
                        i = 0;
                        try {
                            u5gVar = new u5g(JsonExtKt.getBooleanOrDefault(jSONObject3, "fbbt", false), Long.valueOf(oc9.x(JsonExtKt.getLongOrDefault(jSONObject3, "fbt", 10000L), 0L, 60000L)), JsonExtKt.getBooleanOrDefault(jSONObject3, "fba", true), oc9.x(JsonExtKt.getLongOrDefault(jSONObject3, "ct", 5000L), 0L, 5000L));
                        } catch (JSONException e5) {
                            e = e5;
                            li1Var.logException("CallsSdk", str3, e);
                            u5gVar = new u5g();
                        }
                    } catch (JSONException e6) {
                        e = e6;
                        i = 0;
                    }
                }
                y7b y7bVar6 = z7bVar.r;
                zv8[] zv8VarArr4 = z7b.k0;
                zv8 zv8Var6 = zv8VarArr4[16];
                y7bVar6.b(u5gVar);
                y7b y7bVar7 = z7bVar.w;
                zv8 zv8Var7 = zv8VarArr4[21];
                Boolean bool2 = Boolean.TRUE;
                y7bVar7.b(bool2);
                y7b y7bVar8 = z7bVar.v;
                int i4 = 20;
                zv8 zv8Var8 = zv8VarArr4[20];
                y7bVar8.b(bool2);
                b5d b5dVar3 = mi1Var.b().l1;
                zv8[] zv8VarArr5 = e5d.S6;
                Boolean bool3 = (Boolean) b5dVar3.a(zv8VarArr5[114]).i();
                bool3.getClass();
                y7b y7bVar9 = z7bVar.z;
                zv8 zv8Var9 = zv8VarArr4[24];
                y7bVar9.b(bool3);
                y7b y7bVar10 = z7bVar.A;
                zv8 zv8Var10 = zv8VarArr4[25];
                y7bVar10.b(bool2);
                yhb yhbVar = (yhb) mi1Var.b().e1.a(zv8VarArr5[107]).i();
                Boolean bool4 = yhbVar.a;
                Integer num = yhbVar.b;
                gpb gpbVar = new gpb(bool4 != null ? bool4.booleanValue() : i, num != null ? num.intValue() : 2);
                y7b y7bVar11 = z7bVar.V;
                zv8 zv8Var11 = zv8VarArr4[46];
                y7bVar11.b(gpbVar);
                af afVar = (af) mi1Var.b().W0.a(zv8VarArr5[99]).i();
                Boolean bool5 = afVar.a;
                if (bool5 == null) {
                    cfVar = str;
                } else if (bool5.equals(bool2)) {
                    String str6 = afVar.b;
                    cfVar = str6 != null ? new cf(str6) : df.a;
                } else {
                    if (!bool5.equals(Boolean.FALSE)) {
                        ore.o();
                        return str;
                    }
                    cfVar = bf.a;
                }
                if (cfVar != null) {
                    y7b y7bVar12 = z7bVar.x;
                    zv8 zv8Var12 = zv8VarArr4[22];
                    y7bVar12.b(cfVar);
                }
                String str7 = ((yhb) mi1Var.b().e1.a(zv8VarArr5[107]).i()).c;
                ?? wocVar2 = str7 != null ? new woc(str7, 1) : str;
                String str8 = ((af) mi1Var.b().W0.a(zv8VarArr5[99]).i()).c;
                if (str8 != null) {
                    i2 = 2;
                    wocVar = new woc(str8, 2);
                } else {
                    i2 = 2;
                    wocVar = str;
                }
                woc[] wocVarArr = {wocVar2, wocVar};
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (i < i2) {
                    woc wocVar3 = wocVarArr[i];
                    if (wocVar3 != null) {
                        linkedHashSet.add(wocVar3);
                    }
                    i++;
                    i2 = 2;
                }
                woc wocVar4 = (woc) ww3.s1(linkedHashSet);
                if (wocVar4 != null) {
                    y7b y7bVar13 = z7bVar.W;
                    zv8 zv8Var13 = zv8VarArr4[47];
                    y7bVar13.b(wocVar4);
                }
                y7b y7bVar14 = z7bVar.L;
                zv8 zv8Var14 = zv8VarArr4[36];
                y7bVar14.b(bool2);
                b5d b5dVar4 = mi1Var.b().x1;
                zv8[] zv8VarArr6 = e5d.S6;
                Boolean bool6 = (Boolean) b5dVar4.a(zv8VarArr6[126]).i();
                bool6.getClass();
                y7b y7bVar15 = z7bVar.E;
                zv8 zv8Var15 = zv8VarArr4[29];
                y7bVar15.b(bool6);
                Boolean bool7 = (Boolean) mi1Var.b().w1.a(zv8VarArr6[125]).i();
                bool7.getClass();
                y7b y7bVar16 = z7bVar.D;
                zv8 zv8Var16 = zv8VarArr4[28];
                y7bVar16.b(bool7);
                Boolean bool8 = (Boolean) mi1Var.b().y1.a(zv8VarArr6[127]).i();
                bool8.getClass();
                y7b y7bVar17 = z7bVar.C;
                zv8 zv8Var17 = zv8VarArr4[27];
                y7bVar17.b(bool8);
                y7b y7bVar18 = z7bVar.P;
                zv8 zv8Var18 = zv8VarArr4[40];
                y7bVar18.b(bool2);
                Boolean bool9 = (Boolean) mi1Var.b().A1.a(zv8VarArr6[129]).i();
                bool9.getClass();
                y7b y7bVar19 = z7bVar.M;
                zv8 zv8Var19 = zv8VarArr4[37];
                y7bVar19.b(bool9);
                y7b y7bVar20 = z7bVar.J;
                zv8 zv8Var20 = zv8VarArr4[34];
                y7bVar20.b(bool2);
                s7f s7fVar = (s7f) ((et3) ny8Var9.getValue());
                int iIntValue2 = ((Number) s7fVar.h0.m(s7fVar, s7f.j0[57])).intValue();
                if (iIntValue2 != 1) {
                    dh6Var = iIntValue2 != 2 ? dh6.a : dh6.c;
                } else {
                    dh6Var = dh6.b;
                }
                y7b y7bVar21 = z7bVar.I;
                zv8 zv8Var21 = zv8VarArr4[33];
                y7bVar21.b(dh6Var);
                y7b y7bVar22 = z7bVar.R;
                zv8 zv8Var22 = zv8VarArr4[42];
                y7bVar22.b(bool2);
                long jLongValue2 = ((Number) mi1Var.b().a1.a(zv8VarArr6[103]).i()).longValue();
                if (jLongValue2 > 0) {
                    Integer numValueOf = Integer.valueOf(oc9.w((int) jLongValue2, mi1.f));
                    y7b y7bVar23 = z7bVar.S;
                    zv8 zv8Var23 = zv8VarArr4[43];
                    y7bVar23.b(numValueOf);
                }
                y7b y7bVar24 = z7bVar.T;
                zv8 zv8Var24 = zv8VarArr4[44];
                y7bVar24.b(bool2);
                y7b y7bVar25 = z7bVar.Q;
                zv8 zv8Var25 = zv8VarArr4[41];
                y7bVar25.b(bool2);
                Boolean bool10 = (Boolean) mi1Var.b().Y0.a(zv8VarArr6[101]).i();
                bool10.getClass();
                y7b y7bVar26 = z7bVar.U;
                zv8 zv8Var26 = zv8VarArr4[45];
                y7bVar26.b(bool10);
                Boolean bool11 = (Boolean) mi1Var.b().Z0.a(zv8VarArr6[102]).i();
                bool11.getClass();
                y7b y7bVar27 = z7bVar.c0;
                zv8 zv8Var27 = zv8VarArr4[53];
                y7bVar27.b(bool11);
                y7b y7bVar28 = z7bVar.X;
                zv8 zv8Var28 = zv8VarArr4[48];
                y7bVar28.b(bool2);
                ka2 ka2Var = (ka2) mi1Var.b().H5.a(zv8VarArr6[347]).i();
                Object x5gVar = ka2Var.a ? new x5g(ka2Var.b, ka2Var.c, ka2Var.d, ka2Var.e) : str;
                y7b y7bVar29 = z7bVar.b0;
                zv8 zv8Var29 = zv8VarArr4[52];
                y7bVar29.b(x5gVar);
                long jLongValue3 = ((Number) mi1Var.b().b1.a(zv8VarArr6[104]).i()).longValue();
                hj8 hj8Var = mi1.e;
                int i5 = hj8Var.a;
                if (jLongValue3 > hj8Var.b || i5 > jLongValue3) {
                    r0 = str;
                } else {
                    fValueOf = Float.valueOf(jLongValue3 / 100.0f);
                }
                if (r0 != 0) {
                    r0 = fValueOf;
                    objValueOf = Float.valueOf(oc9.u(r0.floatValue(), 0.1f, 1.0f));
                } else {
                    r0 = fValueOf;
                    objValueOf = str;
                }
                y7b y7bVar30 = z7bVar.Y;
                zv8 zv8Var30 = zv8VarArr4[49];
                y7bVar30.b(objValueOf);
                try {
                    a82 a82Var = (a82) mi1Var.b().f1.a(zv8VarArr6[108]).i();
                    x80 x80Var = new x80(a82Var.a, a82Var.b);
                    y7b y7bVar31 = z7bVar.Z;
                    zv8 zv8Var31 = zv8VarArr4[50];
                    y7bVar31.b(x80Var);
                } catch (Throwable unused) {
                }
                b5d b5dVar5 = mi1Var.b().g1;
                zv8[] zv8VarArr7 = e5d.S6;
                Boolean bool12 = (Boolean) b5dVar5.a(zv8VarArr7[109]).i();
                bool12.getClass();
                y7b y7bVar32 = z7bVar.e0;
                zv8[] zv8VarArr8 = z7b.k0;
                zv8 zv8Var32 = zv8VarArr8[55];
                y7bVar32.b(bool12);
                y7b y7bVar33 = z7bVar.d0;
                zv8 zv8Var33 = zv8VarArr8[54];
                Boolean bool13 = Boolean.TRUE;
                y7bVar33.b(bool13);
                Boolean bool14 = (Boolean) mi1Var.b().k1.a(zv8VarArr7[113]).i();
                bool14.getClass();
                y7b y7bVar34 = z7bVar.f0;
                zv8 zv8Var34 = zv8VarArr8[56];
                y7bVar34.b(bool14);
                Boolean bool15 = (Boolean) mi1Var.b().h1.a(zv8VarArr7[110]).i();
                bool15.getClass();
                y7b y7bVar35 = z7bVar.g0;
                zv8 zv8Var35 = zv8VarArr8[57];
                y7bVar35.b(bool15);
                boolean z2 = !((Boolean) mi1Var.b().j1.a(zv8VarArr7[112]).i()).booleanValue();
                y7b y7bVar36 = z7bVar.i0;
                zv8 zv8Var36 = zv8VarArr8[59];
                y7bVar36.b(Boolean.valueOf(z2));
                y7b y7bVar37 = z7bVar.K;
                zv8 zv8Var37 = zv8VarArr8[35];
                y7bVar37.b(bool13);
                Boolean bool16 = (Boolean) mi1Var.b().C5.a(zv8VarArr7[342]).i();
                bool16.getClass();
                y7b y7bVar38 = z7bVar.j0;
                zv8 zv8Var38 = zv8VarArr8[60];
                y7bVar38.b(bool16);
                Boolean bool17 = (Boolean) mi1Var.b().z1.a(zv8VarArr7[128]).i();
                bool17.getClass();
                y7b y7bVar39 = z7bVar.B;
                zv8 zv8Var39 = zv8VarArr8[26];
                y7bVar39.b(bool17);
                Boolean bool18 = (Boolean) mi1Var.b().i1.a(zv8VarArr7[111]).i();
                bool18.getClass();
                y7b y7bVar40 = z7bVar.h0;
                zv8 zv8Var40 = zv8VarArr8[58];
                y7bVar40.b(bool18);
                if (((Boolean) mi1Var.b().X0.a(zv8VarArr7[100]).i()).booleanValue()) {
                    y7b y7bVar41 = conversationFactory.getExperiments().a.j;
                    zv8 zv8Var41 = zv8VarArr8[8];
                    y7bVar41.b(bool13);
                    conversationFactory.getAnalyticsSender().getConfiguration().setUploadConfigProvider(new p51(19));
                }
                boolean zBooleanValue = ((Boolean) mi1Var.b().B1.a(zv8VarArr7[130]).i()).booleanValue();
                ny8 ny8Var14 = ny8Var5;
                conversationFactory.setP2pStartConversationDelegate(zBooleanValue ? (StartConversationDelegate) ny8Var14.getValue() : str);
                conversationFactory.setConfroomStartConversationDelegate(((Boolean) mi1Var.b().n1.a(zv8VarArr7[116]).i()).booleanValue() ? (StartConversationDelegate) ny8Var14.getValue() : str);
                conversationFactory.setJoinConversationDelegate(((Boolean) mi1Var.b().c1.a(zv8VarArr7[105]).i()).booleanValue() ? (iq8) ny8Var6.getValue() : str);
                conversationFactory.setHangupApiDelegate(((Boolean) mi1Var.b().o1.a(zv8VarArr7[117]).i()).booleanValue() ? (et7) ny8Var7.getValue() : str);
                conversationFactory.setAnalyticsEventListener((AnalyticsEventListener) ny8Var8.getValue());
                conversationFactory.setLogger(li1Var);
                conversationFactory.setLogConfiguration(new ki1(ny8Var12));
                conversationFactory.setAnimojiDataSupplier(new yr8(12));
                conversationFactory.getAnalyticsSender().getConfiguration().setApplicationNameProvider(new p51(i4));
                conversationFactory.setSslProvider(new ex8(7, (xd5) ny8Var11.getValue()));
                return conversationFactory;
            }
        });
    }

    public final e5d b() {
        return (e5d) this.b.getValue();
    }
}
