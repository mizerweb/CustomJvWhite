package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import okcalls.g;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i5a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer numJ;
        int i = 1;
        switch (this.a) {
            case 0:
                k5a k5aVar = (k5a) this.c;
                Pair pair = (Pair) this.d;
                ((r75) k5aVar.b.i).e(((Integer) pair.first).intValue(), (x4a) pair.second, (t99) this.e, (uz9) this.f, (IOException) this.g, this.b);
                return;
            case 1:
                zzf zzfVar = (zzf) this.c;
                Context context = (Context) this.d;
                EglBase eglBase = (EglBase) this.e;
                CidLogger cidLogger = (CidLogger) this.f;
                xt1 xt1Var = (xt1) this.g;
                boolean z = this.b;
                v88 v88Var = xt1Var.r;
                String strO = v88Var.l;
                StringBuilder sb = new StringBuilder();
                if (v88Var.s) {
                    sb.append("WebRTC-Audio-OpusGeneratePlc/Enabled/WebRTC-OVC-OpusMaxPlcDurationMs/200/");
                }
                ef efVar = v88Var.v;
                if (efVar instanceof cf) {
                    sb.append("WebRTC-OVC-OpusParameterPredictor/Enabled|" + ((cf) efVar).a + "/");
                } else if (cqk.d(efVar, df.a)) {
                    sb.append("WebRTC-OVC-OpusParameterPredictor/Enabled/");
                } else if (!cqk.d(efVar, bf.a)) {
                    ore.o();
                    return;
                }
                if (v88Var.y) {
                    sb.append("WebRTC-OVC-LinearMinBitrate/Enabled/");
                }
                if (v88Var.B) {
                    sb.append("WebRTC-OVC-DisableAudioProcessing/Enabled/");
                }
                if (v88Var.C) {
                    sb.append("WebRTC-OVC-LogAudioCapture/Enabled/");
                }
                if (v88Var.z) {
                    sb.append("WebRTC-OVC-AdaptComplexity/Enabled/");
                }
                ch6 ch6Var = v88Var.M;
                boolean z2 = false;
                if (ch6Var instanceof bh6) {
                    sb.append("WebRTC-OVC-PathToBitrateDump/" + z5h.I0(((bh6) ch6Var).a, '/', '|', false) + "/");
                }
                String string = sb.toString();
                if (string.length() <= 0) {
                    string = null;
                }
                if (strO == null && string == null) {
                    strO = null;
                } else if (strO == null && string != null) {
                    strO = string;
                } else if (strO == null || string != null) {
                    strO = zo5.o(string, strO);
                }
                v88 v88Var2 = xt1Var.r;
                boolean z3 = v88Var2.C;
                boolean z4 = z && v88Var2.S;
                boolean z5 = v88Var2.N || v88Var2.P;
                x80 x80Var = v88Var2.W;
                zzfVar.l = eglBase;
                cidLogger.log("SharedPeerConnectionFac", "create");
                zzfVar.c = "H264";
                cidLogger.log("SharedPeerConnectionFac", "Preferred video codec: " + zzfVar.c);
                cidLogger.log("SharedPeerConnectionFac", "Create internal peer connection factory ...");
                kzi kziVar = new kzi(cidLogger, new vzf(zzfVar, 0), z2);
                euc eucVar = new euc(zzfVar, kziVar, cidLogger);
                JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(context);
                b1k b1kVar = new b1k(21);
                zzfVar.i = b1kVar;
                JavaAudioDeviceModule.Builder useLowLatency = builder.setAudioRecordSampleHook(b1kVar).setAudioRecordStateCallback(kziVar).setAudioRecordErrorCallback(eucVar).setAudioTrackStateCallback(kziVar).setAudioTrackErrorCallback(kziVar).setUseSilenceProviderIfMutedOnInit(qpc.E()).setReadyToPlayModeEnabled(z5).setUseLowLatency(z4);
                if (x80Var != null && x80Var.a) {
                    xp9 xp9Var = new xp9(x80Var, i, cidLogger);
                    try {
                        numJ = xp9Var.J();
                    } catch (Throwable th) {
                        g gVar = new g(th);
                        CidLogger cidLogger2 = (CidLogger) xp9Var.c;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        cidLogger2.reportException("AudioUtils", message, gVar);
                        numJ = null;
                    }
                    if (numJ != null) {
                        useLowLatency.setSampleRate(numJ.intValue());
                    }
                    break;
                }
                zzfVar.j = useLowLatency.createAudioDeviceModule();
                WeakReference weakReference = new WeakReference(context);
                boolean z6 = zzfVar.s;
                vzf vzfVar = new vzf(zzfVar, 1);
                tw5 tw5Var = new tw5();
                tw5Var.a = weakReference;
                tw5Var.b = cidLogger;
                tw5Var.c = vzfVar;
                tw5Var.d = fqb.a(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, TimeUnit.MILLISECONDS, i3f.a());
                tw5Var.e = l66.a;
                tw5Var.f = new AtomicBoolean(false);
                tw5Var.g = new AtomicBoolean(false);
                zzfVar.k = tw5Var;
                if (z6 && Build.VERSION.SDK_INT >= 29) {
                    brb brbVar = (brb) tw5Var.d;
                    g9i g9iVar = new g9i(tw5Var);
                    xr8 xr8Var = new xr8();
                    brbVar.getClass();
                    vx8 vx8Var = new vx8(g9iVar, xr8Var);
                    brbVar.f(vx8Var);
                    tw5Var.e = vx8Var;
                }
                if (z3) {
                    b1k b1kVar2 = zzfVar.i;
                    ewj ewjVar = new ewj();
                    zzfVar.q = ewjVar;
                    ((CopyOnWriteArraySet) b1kVar2.b).add(new n3k(0L, ewjVar));
                }
                if (qpc.E()) {
                    zzfVar.j.setMicrophoneMute(true);
                }
                rpc rpcVar = qpc.i0 == null ? new rpc(null, null, null, false, false, false, false, null) : (rpc) qpc.i0.a;
                String str = rpcVar.h;
                String str2 = rpcVar.b;
                String strConcat = "WebRTC-IntelVP8/Enabled/WebRTC-Audio-SendSideBwe/Enabled/WebRTC-SendSideBwe-WithOverhead/Enabled/WebRTC-FeedbackTimeout/Enabled/WebRTC-Bwe-SafeResetOnRouteChange/Enabled/".concat("WebRTC-Audio-Red-For-Opus/Enabled-2/").concat("WebRTC-SpsPpsIdrIsH264Keyframe/Enabled/");
                String str3 = rpcVar.a;
                if (!TextUtils.isEmpty(str3)) {
                    strConcat = nbh.v(strConcat, "WebRTC-OK-StunCustomAttr/Enabled-", str3, "/");
                }
                if (!TextUtils.isEmpty(str2)) {
                    strConcat = nbh.v(strConcat, "WebRTC-OK-TurnChannelDataMark/", str2, "/");
                }
                Integer num = rpcVar.c;
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue < 0) {
                        iIntValue = 1000;
                    }
                    strConcat = strConcat + "WebRTC-RttMult/Enabled-1.0," + iIntValue + "/";
                }
                String strConcat2 = strConcat.concat("WebRTC-Bwe-LossBasedBweV2/Enabled:true,CandidateFactors:1.02|1.0|0.95,DelayBasedCandidate:true,HigherBwBiasFactor:0.0002,HigherLogBwBiasFactor:0.02,ObservationDurationLowerBound:250ms,InstantUpperBoundBwBalance:75kbps,BwRampupUpperBoundFactor:1000000.0,InstantUpperBoundTemporalWeightFactor:0.9,TemporalWeightFactor:0.9,MaxIncreaseFactor:1.3,NewtonStepSize:0.75,InherentLossUpperBoundBwBalance:75kbps,LossThresholdOfHighBandwidthPreference:0.15,NotIncreaseIfInherentLossLessThanAverageLoss:true,_20230522/");
                if (rpcVar.d) {
                    strConcat2 = strConcat2.concat("WebRTC-OVC-Audio-EarlyStartPlayout/Enabled/");
                }
                if (rpcVar.e) {
                    strConcat2 = strConcat2.concat("WebRTC-OVC-Audio-EarlyStartRecording/Enabled/");
                }
                if (rpcVar.f) {
                    strConcat2 = strConcat2.concat("WebRTC-OVC-Audio-AudioProcessingOffOnMute/Enabled/");
                }
                if (rpcVar.g) {
                    strConcat2 = strConcat2.concat("WebRTC-OVC-HardwareSimulcast/Enabled/");
                }
                String strConcat3 = strConcat2.concat("WebRTC-OVC-Audio-OpusNoLACE/Enabled/").concat("WebRTC-AdjustOpusBandwidth/Enabled/").concat("WebRTC-OVC-DREDLowBitrate/Enabled/").concat("WebRTC-Audio-StableTargetAdaptation/Enabled/").concat("WebRTC-OVC-Audio-OpusAdapterMinBitrate/Enabled:16000/").concat("WebRTC-Audio-AdaptivePtime/enabled:true,min_payload_bitrate:16kbps,min_encoder_bitrate:16kbps,use_slow_adaptation:true/").concat("WebRTC-OVC-DisableSharedSocket/Enabled/");
                if (str != null && str.length() != 0) {
                    strConcat3 = strConcat3.concat(str);
                }
                if (strO != null && strO.length() != 0) {
                    strConcat3 = strConcat3.concat(strO);
                }
                cidLogger.log("SharedPeerConnectionFac", "Field trials: ".concat(strConcat3));
                PeerConnectionFactory.initializeFieldTrials(strConcat3);
                zzfVar.d = PeerConnectionFactory.builder().setVideoDecoderFactory(zzfVar.h).setVideoEncoderFactory(zzfVar.n).setAudioDeviceModule(zzfVar.j).createPeerConnectionFactory();
                if (zzfVar.d == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Factory creation failed");
                    ArrayList arrayList = zzfVar.g;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        try {
                            ((j3k) obj).b.accept(illegalStateException);
                        } catch (Throwable th2) {
                            zzfVar.b.reportException("SharedPeerConnectionFac", "Error in withFactory onError callback", th2);
                        }
                    }
                    zzfVar.g.clear();
                    throw illegalStateException;
                }
                cidLogger.log("SharedPeerConnectionFac", uza.b(zzfVar.d).concat(" was created"));
                zzfVar.e = true;
                ArrayList arrayList2 = zzfVar.g;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    j3k j3kVar = (j3k) obj2;
                    Consumer consumer = j3kVar.a;
                    PeerConnectionFactory peerConnectionFactory = zzfVar.d;
                    Consumer consumer2 = j3kVar.b;
                    try {
                        consumer.accept(peerConnectionFactory);
                    } catch (Throwable th3) {
                        zzfVar.b.reportException("SharedPeerConnectionFac", "Error in withFactory action", th3);
                        try {
                            consumer2.accept(th3);
                        } catch (Throwable th4) {
                            zzfVar.b.reportException("SharedPeerConnectionFac", "Error in withFactory onError callback", th4);
                        }
                    }
                }
                zzfVar.g.clear();
                boolean z7 = uza.a;
                cidLogger.log("SharedPeerConnectionFac", "Is VIDEO HW acceleration enabled? ".concat(!z7 ? "yes" : "no"));
                if (z7) {
                    return;
                }
                cidLogger.log("SharedPeerConnectionFac", "Enable video hardware acceleration options for ".concat(uza.b(zzfVar.d)));
                return;
            default:
                bui buiVar = (bui) this.c;
                zbh zbhVar = (zbh) this.d;
                pf2 pf2Var = (pf2) this.e;
                cui cuiVar = (cui) this.f;
                msh mshVar = (msh) this.g;
                boolean z8 = this.b;
                if (pf2Var == buiVar.e()) {
                    buiVar.z = zbhVar.d(pf2Var, true);
                    u2j u2jVar = (u2j) cuiVar.i(cui.b);
                    Objects.requireNonNull(u2jVar);
                    u2jVar.f(buiVar.z, mshVar, z8);
                    buiVar.U();
                    return;
                }
                return;
        }
    }
}
