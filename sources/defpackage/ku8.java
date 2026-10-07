package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.core.filedatastore.JsonDeserializer;
import java.io.File;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandExecutionException;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException;

/* JADX INFO: loaded from: classes2.dex */
public class ku8 implements hu8, ze9, ux0, o1d, aie, uve, y99, hgg, jt9, zt3, c4b, iee, HostInfoProvider, w5k, JsonDeserializer, f2i {
    public /* synthetic */ ku8() {
    }

    public static yve B(JSONObject jSONObject) throws JSONException {
        byte b;
        String string = jSONObject.getString("response");
        string.getClass();
        switch (string) {
            case "report-perf-stat":
                b = 0;
                break;
            case "change-simulcast":
                b = 1;
                break;
            case "update-display-layout":
                b = 2;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return new xke(jSONObject.has("estimatedPerformanceIndex") ? Integer.valueOf(jSONObject.getInt("estimatedPerformanceIndex")) : null);
            case 1:
                return new fr2(jSONObject.getInt("errorCode"));
            case 2:
                if (!jSONObject.has("errorCodeByParticipantId")) {
                    return new zei(Collections.EMPTY_MAP);
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("errorCodeByParticipantId");
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(kql.M(next), jSONObject2.getInt(next) == -1 ? yei.b : yei.a);
                }
                return new zei(map);
            default:
                return null;
        }
    }

    public static JSONObject C(long j, pve pveVar) throws JSONException {
        if (pveVar instanceof wke) {
            wke wkeVar = (wke) pveVar;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("framesReceived", wkeVar.a);
            jSONObject.put("framesDecoded", wkeVar.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sequence", j);
            jSONObject2.put("command", "report-perf-stat");
            jSONObject2.put("report", jSONObject);
            return jSONObject2;
        }
        if (pveVar instanceof xei) {
            xei xeiVar = (xei) pveVar;
            JSONObject jSONObject3 = new JSONObject();
            for (ajf ajfVar : xeiVar.a) {
                zif zifVar = ajfVar.b;
                jSONObject3.put(kql.K(ajfVar), zifVar.a ? "ss" : "sz=" + zifVar.b + "x" + zifVar.c + ":fit=" + pye.c(zifVar.d));
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sequence", j);
            jSONObject4.put("command", "update-display-layout");
            jSONObject4.put("layouts", jSONObject3);
            if (xeiVar.b) {
                jSONObject4.put("snapshot", true);
            }
            return jSONObject4;
        }
        if (pveVar instanceof gle) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("sequence", j);
            jSONObject5.put("command", "request-asr");
            jSONObject5.put("start", ((gle) pveVar).a);
            return jSONObject5;
        }
        if (pveVar instanceof uke) {
            uke ukeVar = (uke) pveVar;
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("sequence", j);
            jSONObject6.put("command", "report-network-stat");
            jSONObject6.put("timestamp", ukeVar.a);
            jSONObject6.put("bitrate", ukeVar.b);
            return jSONObject6;
        }
        if (!(pveVar instanceof er2)) {
            return null;
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("sequence", j);
        jSONObject7.put("command", "change-simulcast");
        jSONObject7.put("mediaSource", "CAMERA");
        JSONArray jSONArray = new JSONArray();
        for (u7g u7gVar : ((er2) pveVar).a) {
            if (u7gVar.c) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("rid", u7gVar.a);
                jSONObject8.put("width", u7gVar.i);
                jSONObject8.put("height", u7gVar.j);
                jSONObject8.put("fps", u7gVar.g);
                jSONObject8.put("bitrateKbps", u7gVar.e / 1000);
                jSONArray.put(jSONObject8);
            }
        }
        jSONObject7.put("layers", jSONArray);
        return jSONObject7;
    }

    public static MediaCodec D(yfj yfjVar) throws IOException {
        String str = ((nt9) yfjVar.a).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    @Override // defpackage.uve
    public gj2 A(int i, byte[] bArr) throws RtcCommandSerializeException, RtcCommandExecutionException {
        if (i == 0) {
            throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Illegal 'format' value: null"));
        }
        if (i != 1) {
            throw new RtcCommandSerializeException(null, false, new UnsupportedOperationException("Only text format is supported"));
        }
        try {
            String str = new String(bArr);
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    Long lValueOf = jSONObject.has("sequence") ? Long.valueOf(jSONObject.getLong("sequence")) : null;
                    String string = jSONObject.has("type") ? jSONObject.getString("type") : null;
                    if ("response".equals(string)) {
                        if (lValueOf == null) {
                            throw new RtcCommandSerializeException(lValueOf, false, new IllegalArgumentException("Unable to decode response id: ".concat(str)));
                        }
                        try {
                            yve yveVarB = B(jSONObject);
                            if (yveVarB != null) {
                                return new gj2(lValueOf.longValue(), yveVarB, 8);
                            }
                        } catch (Throwable th) {
                            throw new RtcCommandSerializeException(lValueOf, false, new IllegalArgumentException("Unable to decode response body: ".concat(str), th));
                        }
                    } else if ("error".equals(string)) {
                        jSONObject.optString("error", "");
                        boolean zOptBoolean = jSONObject.optBoolean("recoverable", false);
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String strOptString = jSONObject.optString(next);
                            if (strOptString != null) {
                                map.put(next, strOptString);
                            }
                        }
                        throw new RtcCommandExecutionException(lValueOf, zOptBoolean, null);
                    }
                    return null;
                } catch (Throwable th2) {
                    throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response id/type: ".concat(str), th2));
                }
            } catch (Throwable th3) {
                throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response as json: ".concat(str), th3));
            }
        } catch (Throwable th4) {
            throw new RtcCommandSerializeException(null, false, new IllegalArgumentException("Unable to decode response as string", th4));
        }
    }

    public boolean E(CharSequence charSequence) {
        return charSequence instanceof cdd;
    }

    @Override // defpackage.aie
    public IceCandidate a(IceCandidate iceCandidate) {
        iceCandidate.getClass();
        return new IceCandidate("fake remote sdpMid", Integer.MIN_VALUE, "fake remote sdp");
    }

    @Override // defpackage.f2i
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.ze9
    public void b(String str, af7 af7Var) {
        Log.d(str, (String) af7Var.invoke());
    }

    @Override // defpackage.hgg
    public long c(long j) {
        return j;
    }

    @Override // defpackage.ux0
    public void clear() {
    }

    @Override // defpackage.w5k
    public DatagramSocket createSocket() {
        return new DatagramSocket(new InetSocketAddress((InetAddress) null, 0));
    }

    @Override // defpackage.ux0
    public au3 d() {
        return null;
    }

    @Override // defpackage.ux0
    public void e(int i, au3 au3Var) {
    }

    @Override // defpackage.ze9
    public void f(String str, af7 af7Var) {
        Log.w(str, (String) af7Var.invoke());
    }

    @Override // com.vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) {
        return new kik(jSONObject.optInt("notification_id_key"));
    }

    @Override // defpackage.ux0
    public void g(int i, au3 au3Var) {
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getHost() {
        return "vkpns-topics.rustore.ru";
    }

    @Override // com.vk.push.common.HostInfoProvider
    public Integer getPort() {
        return HostInfoProvider.DefaultImpls.getPort(this);
    }

    @Override // com.vk.push.common.HostInfoProvider
    public String getScheme() {
        return "https";
    }

    @Override // defpackage.c4b
    public Object h(fka fkaVar) {
        int iU;
        String strX;
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD != 0) {
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        Long lValueOf = null;
        String strX2 = null;
        for (int i = 0; i < iU; i++) {
            try {
                strX = ch3.X(fkaVar, null);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(null, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    if (strX.equals("id")) {
                        long jT = 0;
                        try {
                            jT = ch3.T(fkaVar, 0L);
                        } catch (Throwable th5) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                            Iterator it3 = fjf.a.iterator();
                            while (it3.hasNext()) {
                                AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th5);
                                    accountInitializer3.d().i().g().a(null, th5);
                                } catch (Throwable th6) {
                                    gm0.V("Payload", "failed to collect exception", th6);
                                }
                            }
                            int iD3 = qt4.D(pye.a);
                            if (iD3 != 0) {
                                if (iD3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th5;
                            }
                        }
                        lValueOf = Long.valueOf(jT);
                    } else if (strX.equals("errorCode")) {
                        try {
                            strX2 = ch3.X(fkaVar, null);
                        } catch (Throwable th7) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                            Iterator it4 = fjf.a.iterator();
                            while (it4.hasNext()) {
                                AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th7);
                                    accountInitializer4.d().i().g().a(null, th7);
                                } catch (Throwable th8) {
                                    gm0.V("Payload", "failed to collect exception", th8);
                                }
                            }
                            int iD4 = qt4.D(pye.a);
                            if (iD4 != 0) {
                                if (iD4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th7;
                            }
                            strX2 = null;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable th9) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                        Iterator it5 = fjf.a.iterator();
                        while (it5.hasNext()) {
                            AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th9);
                                accountInitializer5.d().i().g().a(null, th9);
                            } catch (Throwable th10) {
                                gm0.V("Payload", "failed to collect exception", th10);
                            }
                        }
                        int iD5 = qt4.D(pye.a);
                        if (iD5 != 0) {
                            if (iD5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th9;
                        }
                    } catch (Throwable th11) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th11);
                        Iterator it6 = fjf.a.iterator();
                        while (it6.hasNext()) {
                            AccountInitializer accountInitializer6 = ((n6) it6.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th11);
                                accountInitializer6.d().i().g().a(null, th11);
                            } catch (Throwable th12) {
                                gm0.V("Payload", "failed to collect exception", th12);
                            }
                        }
                        int iD6 = qt4.D(pye.a);
                        if (iD6 != 0) {
                            if (iD6 == 1) {
                                throw th11;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        return new iui(strX2, lValueOf);
    }

    @Override // defpackage.ux0
    public au3 i() {
        return null;
    }

    @Override // defpackage.ze9
    public void j(String str, af7 af7Var) {
        Log.v(str, (String) af7Var.invoke());
    }

    @Override // defpackage.ze9
    public void k(String str, af7 af7Var) {
        Log.e(str, (String) af7Var.invoke());
    }

    @Override // defpackage.o1d
    public void l(float f, float f2, int i, int i2, d1d d1dVar) {
    }

    @Override // defpackage.y99
    public void load() {
        synchronized (gpk.a) {
            Object obj = gpk.b;
            synchronized (obj) {
                if (gpk.c) {
                    return;
                }
                long jA = gpk.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    gpk.d = jA;
                    gpk.c = true;
                }
            }
        }
    }

    @Override // defpackage.ze9
    public void m(String str, af7 af7Var) {
        Log.i(str, (String) af7Var.invoke());
    }

    @Override // defpackage.o1d
    public boolean n(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.ux0
    public boolean o(int i) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    @Override // defpackage.jt9
    public kt9 p(yfj yfjVar) throws Throwable {
        MediaCodec mediaCodecD = null;
        try {
            mediaCodecD = D(yfjVar);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) yfjVar.d;
            mediaCodecD.configure((MediaFormat) yfjVar.b, surface, (MediaCrypto) yfjVar.e, (surface == null && ((nt9) yfjVar.a).k && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecD.start();
            Trace.endSection();
            return new phf(mediaCodecD, (euc) yfjVar.f);
        } catch (IOException e) {
            e = e;
            if (mediaCodecD != null) {
                mediaCodecD.release();
            }
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            if (mediaCodecD != null) {
                mediaCodecD.release();
            }
            throw e;
        }
    }

    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) {
        vu8Var.x();
        return null;
    }

    @Override // defpackage.o1d
    public void q(float f, float f2) {
    }

    @Override // defpackage.ze9
    public void r(String str, af7 af7Var, af7 af7Var2) {
        Log.e(str, (String) af7Var.invoke(), (Throwable) af7Var2.invoke());
    }

    @Override // defpackage.ze9
    public void s(String str, af7 af7Var, af7 af7Var2) {
        Log.w(str, (String) af7Var.invoke(), (Throwable) af7Var2.invoke());
    }

    @Override // defpackage.uve
    public qp5 t(long j, pve pveVar) throws RtcCommandSerializeException {
        try {
            JSONObject jSONObjectC = C(j, pveVar);
            if (jSONObjectC != null) {
                return new qp5(1, jSONObjectC.toString().getBytes());
            }
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalStateException("No serializer for command: " + pveVar.getClass()));
        } catch (JSONException e) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, new IllegalArgumentException("Unable to serialize command: " + pveVar.getClass(), e));
        }
    }

    @Override // defpackage.iee
    public boolean u(UnsatisfiedLinkError unsatisfiedLinkError, rcg[] rcgVarArr) {
        String str = unsatisfiedLinkError instanceof qcg ? ((qcg) unsatisfiedLinkError).a : null;
        StringBuilder sb = new StringBuilder("Waiting on SoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(str == null ? "" : ", retrying for specific library ".concat(str));
        Log.e("SoLoader", sb.toString());
        for (rcg rcgVar : rcgVarArr) {
            if (rcgVar instanceof wci) {
                wci wciVar = (wci) rcgVar;
                Log.e("SoLoader", "Waiting on SoSource " + rcgVar.b());
                File file = wciVar.a;
                try {
                    kfh.d(file, new File(file, "dso_lock")).close();
                } catch (Exception e) {
                    Log.e("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + wciVar.getClass().getName() + " (" + file + "): ", e);
                }
            }
        }
        return true;
    }

    @Override // defpackage.zt3
    public void v() {
    }

    @Override // defpackage.zt3
    public void w(f0g f0gVar, Throwable th) {
    }

    @Override // defpackage.ux0
    public au3 x(int i) {
        return null;
    }

    @Override // defpackage.ze9
    public void y(af7 af7Var, af7 af7Var2) {
        Log.i("UploadTask", (String) af7Var.invoke(), (Throwable) af7Var2.invoke());
    }

    @Override // defpackage.y99
    public void z() {
    }

    public /* synthetic */ ku8(Object obj) {
    }
}
