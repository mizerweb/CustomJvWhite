package ru.ok.android.externcalls.sdk;

import defpackage.ch6;
import defpackage.co0;
import defpackage.eh6;
import defpackage.fh6;
import defpackage.ih;
import defpackage.n11;
import defpackage.r66;
import defpackage.u5g;
import defpackage.v88;
import defpackage.vt1;
import defpackage.wbb;
import defpackage.woc;
import defpackage.wt1;
import defpackage.x5g;
import defpackage.x80;
import defpackage.xt1;
import defpackage.y7b;
import defpackage.z3e;
import defpackage.z7b;
import defpackage.zv8;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/CallUtil;", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/ConversationBuilder;", "builder", "Lxt1;", "createCallParams", "(Lru/ok/android/externcalls/sdk/ConversationBuilder;)Lxt1;", "Lvt1;", "createBitrates", "()Lvt1;", "Lz3e;", "LOG_CONFIGURATION", "Lz3e;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallUtil {
    public static final CallUtil INSTANCE = new CallUtil();
    public static final z3e LOG_CONFIGURATION = new z3e() { // from class: ru.ok.android.externcalls.sdk.CallUtil$LOG_CONFIGURATION$1
        @Override // defpackage.z3e
        public /* bridge */ /* synthetic */ boolean shouldHideSensitiveInformation() {
            return false;
        }

        @Override // defpackage.z3e
        public /* bridge */ /* synthetic */ boolean shouldThrottleSignalingLogs() {
            return true;
        }
    };

    private CallUtil() {
    }

    public static final vt1 createBitrates() {
        return new vt1();
    }

    public static final xt1 createCallParams(ConversationBuilder builder) {
        vt1 vt1VarCreateBitrates = builder.bitrates;
        if (vt1VarCreateBitrates == null) {
            vt1VarCreateBitrates = createBitrates();
        }
        vt1 vt1Var = vt1VarCreateBitrates;
        z7b z7bVar = builder.experiments;
        boolean zBooleanValue = ((Boolean) z7bVar.b.a(z7b.k0[0])).booleanValue();
        int iIntValue = ((Number) z7bVar.c.a(z7b.k0[1])).intValue();
        y7b y7bVar = z7bVar.d;
        zv8[] zv8VarArr = z7b.k0;
        wt1 wt1Var = (wt1) y7bVar.a(zv8VarArr[2]);
        boolean zBooleanValue2 = ((Boolean) z7bVar.e.a(z7b.k0[3])).booleanValue();
        boolean zBooleanValue3 = ((Boolean) z7bVar.f.a(z7b.k0[4])).booleanValue();
        boolean zBooleanValue4 = ((Boolean) z7bVar.g.a(z7b.k0[5])).booleanValue();
        boolean zBooleanValue5 = ((Boolean) z7bVar.h.a(z7b.k0[6])).booleanValue();
        boolean zBooleanValue6 = ((Boolean) z7bVar.i.a(z7b.k0[7])).booleanValue();
        boolean zBooleanValue7 = ((Boolean) z7bVar.j.a(z7b.k0[8])).booleanValue();
        Double d = (Double) z7bVar.k.a(z7b.k0[9]);
        Double d2 = (Double) z7bVar.l.a(z7b.k0[10]);
        String str = (String) z7bVar.m.a(z7b.k0[11]);
        PeerConnection.VpnPreference vpnPreference = (PeerConnection.VpnPreference) z7bVar.n.a(z7b.k0[12]);
        wbb wbbVar = (wbb) z7bVar.o.a(z7b.k0[13]);
        boolean zBooleanValue8 = ((Boolean) z7bVar.p.a(z7b.k0[14])).booleanValue();
        boolean zBooleanValue9 = ((Boolean) z7bVar.q.a(z7b.k0[15])).booleanValue();
        u5g u5gVar = (u5g) z7bVar.r.a(z7b.k0[16]);
        boolean zK = z7bVar.k();
        z7bVar.g();
        int i = 1;
        v88 v88Var = new v88(zBooleanValue, iIntValue, wt1Var, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, d, d2, str, vpnPreference, wbbVar, zBooleanValue8, zBooleanValue9, u5gVar, zK, ((Boolean) z7bVar.u.a(z7b.k0[19])).booleanValue(), ((Boolean) z7bVar.v.a(z7b.k0[20])).booleanValue(), ((Boolean) z7bVar.w.a(z7b.k0[21])).booleanValue(), z7bVar.m(), z7bVar.a(), ((Boolean) z7bVar.z.a(z7b.k0[24])).booleanValue(), ((Boolean) z7bVar.A.a(z7b.k0[25])).booleanValue(), ((Boolean) z7bVar.B.a(z7b.k0[26])).booleanValue(), ((Boolean) z7bVar.C.a(z7b.k0[27])).booleanValue(), ((Boolean) z7bVar.D.a(z7b.k0[28])).booleanValue(), ((Boolean) z7bVar.E.a(z7b.k0[29])).booleanValue(), z7bVar.i(), (fh6) z7bVar.G.a(z7b.k0[31]), (eh6) z7bVar.H.a(z7b.k0[32]), z7bVar.f(), ((Boolean) z7bVar.J.a(z7b.k0[34])).booleanValue(), ((Boolean) z7bVar.K.a(z7b.k0[35])).booleanValue(), z7bVar.d(), z7bVar.l(), ((Boolean) z7bVar.N.a(z7b.k0[38])).booleanValue(), (ch6) z7bVar.O.a(z7b.k0[39]), ((Boolean) z7bVar.P.a(z7b.k0[40])).booleanValue(), ((Boolean) z7bVar.Q.a(z7b.k0[41])).booleanValue(), ((Boolean) z7bVar.R.a(z7b.k0[42])).booleanValue(), (Integer) z7bVar.S.a(z7b.k0[43]), ((Boolean) z7bVar.T.a(z7b.k0[44])).booleanValue(), ((Boolean) z7bVar.U.a(z7b.k0[45])).booleanValue(), z7bVar.h(), z7bVar.c(), (Float) z7bVar.Y.a(z7b.k0[49]), (x80) z7bVar.Z.a(z7b.k0[50]), ((Boolean) z7bVar.a0.a(zv8VarArr[51])).booleanValue(), (x5g) z7bVar.b0.a(z7b.k0[52]), ((Boolean) z7bVar.c0.a(z7b.k0[53])).booleanValue() || z7bVar.n(), z7bVar.j(), z7bVar.b(), ((Boolean) z7bVar.f0.a(z7b.k0[56])).booleanValue(), ((Boolean) z7bVar.g0.a(z7b.k0[57])).booleanValue(), z7bVar.n(), ((Boolean) z7bVar.i0.a(z7b.k0[59])).booleanValue(), z7bVar.e(), (woc) z7bVar.W.a(zv8VarArr[47]));
        if (wt1Var == null) {
            wt1Var = new wt1(builder.mediaReceivingTimeoutMs);
        }
        ih ihVar = new ih(new n11(builder.isMediaAdaptationFeatureEnabledForP2PCall, builder.ptpCallMediaAdaptationConfig, i), new n11(builder.isMediaAdaptationFeatureEnabledForGroupCall, builder.groupCallMediaAdaptationConfig, i));
        boolean z = builder.dnsResolverEnabled;
        boolean z2 = builder.isConsumerUpdateEnabled;
        wt1 wt1Var2 = wt1Var;
        boolean z3 = builder.isOnDemandTracksEnabled;
        boolean z4 = builder.enableLossRttBadConnectionHandling;
        List list = builder.additionalWhitelistedCodecPrefixes;
        if (list == null) {
            list = r66.a;
        }
        List list2 = list;
        boolean z5 = builder.isDataChannelScreenshareRecvEnabled;
        boolean z6 = builder.isDataChannelScreenshareSendEnabled;
        int i2 = builder.videoTracksCount;
        boolean z7 = builder.fastRecoverEnabled;
        boolean z8 = builder.isWebRTCCodecFilteringEnabled;
        String[] strArr = builder.audioCodecs;
        String[] strArr2 = builder.videoCodecs;
        boolean z9 = builder.showLocalVideoInOriginalQuality;
        boolean z10 = builder.isAsrOnlineEnabled;
        boolean z11 = builder.isFastScreenCaptureEnabled;
        boolean z12 = builder.isDeviceAudioShareEnabled;
        co0 co0Var = builder.badNetworkIndicatorConfig;
        if (co0Var == null) {
            co0Var = co0.e;
        }
        return new xt1(vt1Var, wt1Var2, z, z2, z3, z4, list2, z5, z6, i2, z7, z8, strArr, strArr2, z9, ihVar, z10, v88Var, z11, z12, co0Var);
    }
}
