package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.webrtc.AudioTrack;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLibraryLoader;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpParameters;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.SessionDescription;
import org.webrtc.Size;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoFrame;
import org.webrtc.VideoTrack;
import ru.ok.android.webrtc.v;

/* JADX INFO: loaded from: classes3.dex */
public final class qpc implements tb9, umc {
    public static final Pattern h0;
    public static volatile kzi i0;
    public static final c7k j0;
    public final p38 A;
    public final rve B;
    public final z18 C;
    public final gv6 D;
    public final boolean E;
    public final String[] F;
    public final String[] G;
    public volatile PeerConnection H;
    public boolean I;
    public ppc J;
    public final WeakReference K;
    public RtpSender L;
    public RtpSender M;
    public RtpSender N;
    public List O;
    public RtpSender P;
    public sb9 R;
    public final boolean S;
    public volatile boolean U;
    public volatile boolean V;
    public boolean W;
    public volatile boolean X;
    public vpc Z;
    public final boolean a;
    public final f4j a0;
    public final PeerConnection.IceTransportsType b;
    public final d2a b0;
    public final PeerConnection.VpnPreference c;
    public final a4f c0;
    public final d5f d;
    public final boolean d0;
    public final ljf e;
    public final aie e0;
    public final boolean f;
    public final t32 f0;
    public final boolean g;
    public final int g0;
    public final an h;
    public boolean i;
    public final hm j;
    public final ewe o;
    public final Integer q;
    public final zzf s;
    public final szf t;
    public final ExecutorService u;
    public final alc v;
    public final y3e w;
    public final xt1 x;
    public final v88 y;
    public final a5f z;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public final c7k p = new c7k(15);
    public final Handler r = new Handler(Looper.getMainLooper());
    public final ArrayList Q = new ArrayList();
    public t7g T = null;
    public volatile boolean Y = true;

    static {
        Pattern.compile("^a=rtpmap:(\\d+) H264(/\\d+)+[\r]?$", 8);
        h0 = Pattern.compile("^a=animoji:(\\d+)", 8);
        i0 = null;
        j0 = new c7k(20, false);
    }

    public qpc(opc opcVar) {
        qpc qpcVar;
        ioc iocVar;
        Object ku8Var;
        Context applicationContext = opcVar.e.getApplicationContext();
        y3e y3eVar = opcVar.f;
        this.w = y3eVar;
        this.f0 = opcVar.D;
        xt1 xt1Var = opcVar.d;
        this.x = xt1Var;
        v88 v88Var = xt1Var.r;
        this.y = v88Var;
        this.o = new ewe(opcVar.E, y3eVar);
        this.S = opcVar.t;
        zzf zzfVar = opcVar.a;
        this.s = zzfVar;
        ExecutorService executorService = zzfVar != null ? zzfVar.a : opcVar.c;
        this.u = executorService;
        this.E = opcVar.m;
        this.F = opcVar.n;
        this.G = opcVar.o;
        this.v = executorService == null ? new alc() : null;
        this.e0 = v88Var.G == dh6.b ? new ku8() : new lu8();
        this.t = opcVar.b;
        this.A = new p38(y3eVar);
        this.q = opcVar.F;
        vn7 vn7Var = opcVar.u;
        if (opcVar.C != null) {
            this.K = new WeakReference(opcVar.C);
        }
        if (opcVar.g) {
            if (xt1Var.u.c.b) {
                vn7Var.getClass();
                i1m i1mVar = new i1m();
                i1mVar.a = vn7Var;
                ku8Var = i1mVar;
            } else {
                ku8Var = new ku8();
            }
            kzi kziVar = new kzi();
            kziVar.b = ku8Var;
            kziVar.a = y3eVar;
            this.B = new rve(kziVar);
        } else {
            this.B = null;
        }
        if (opcVar.h) {
            fik fikVar = new fik(29, false);
            fikVar.b = null;
            fikVar.c = null;
            r6a r6aVar = new r6a();
            r6aVar.a = vn7Var;
            r6aVar.b = new h6f(vn7Var, y3eVar);
            r6aVar.c = new n3j(y3eVar);
            fikVar.b = r6aVar;
            fikVar.c = y3eVar;
            z18 z18Var = new z18();
            z18Var.c = new CopyOnWriteArrayList();
            z18Var.f = new Handler(Looper.getMainLooper());
            z18Var.g = new AtomicBoolean(false);
            z18Var.h = new AtomicReference(null);
            z18Var.i = new p3k(0, z18Var);
            r6a r6aVar2 = (r6a) fikVar.b;
            if (r6aVar2 == null) {
                ore.p("Illegal 'serializer' value: null");
                throw null;
            }
            y3e y3eVar2 = (y3e) fikVar.c;
            if (y3eVar2 == null) {
                ore.p("Illegal 'log' value: null");
                throw null;
            }
            z18Var.a = r6aVar2;
            z18Var.b = y3eVar2;
            HandlerThread handlerThread = new HandlerThread("RtcNotifRecv");
            z18Var.d = handlerThread;
            handlerThread.start();
            z18Var.e = new Handler(handlerThread.getLooper());
            this.C = z18Var;
        } else {
            this.C = null;
        }
        Future futureSubmit = (executorService == null || zzfVar == null) ? null : executorService.submit(new mz0(4, zzfVar));
        if (!opcVar.i || futureSubmit == null) {
            qpcVar = this;
            qpcVar.d = null;
        } else {
            qpcVar = this;
            qpcVar.d = new d5f(opcVar.f, vn7Var, futureSubmit, qpcVar, opcVar.y);
        }
        if (opcVar.j) {
            qpcVar.e = new ljf(vn7Var);
        } else {
            qpcVar.e = null;
        }
        qpcVar.i = opcVar.k;
        qpcVar.D = new gv6(qpcVar);
        qpcVar.b = opcVar.A;
        qpcVar.c = opcVar.B;
        qpcVar.a = opcVar.p;
        qpcVar.g = opcVar.r;
        qpcVar.f = opcVar.s;
        if (opcVar.q) {
            qpcVar.b0 = new ymc(new vog(qpcVar), y3eVar, new ipc(qpcVar), vn7Var);
        } else {
            qpcVar.b0 = new ed5(new vog(qpcVar), y3eVar, new ipc(qpcVar), vn7Var);
        }
        qpcVar.h = opcVar.v;
        qpcVar.j = opcVar.w;
        qpcVar.g0 = opcVar.G;
        qpcVar.z = opcVar.x;
        if (zzfVar != null && (iocVar = zzfVar.n) != null) {
            iocVar.f.add(qpcVar);
        }
        CropAndScaleParamsProvider cropAndScaleParamsProvider = opcVar.E;
        cropAndScaleParamsProvider.getClass();
        due dueVar = new due();
        dueVar.a = cropAndScaleParamsProvider;
        qpcVar.a0 = new f4j(zzfVar, applicationContext, xt1Var, y3eVar, dueVar);
        qpcVar.c0 = opcVar.z;
        qpcVar.d0 = opcVar.l;
        y3eVar.log("PeerConnectionClient", "client created");
    }

    public static void D(Context context, kzi kziVar, NativeLibraryLoader nativeLibraryLoader) {
        if (i0 == null) {
            y3e y3eVar = (y3e) kziVar.b;
            if (y3eVar != null) {
                c7k c7kVar = j0;
                c7kVar.getClass();
                c7kVar.b = new WeakReference(y3eVar);
            }
            try {
                try {
                    try {
                        qpc.class.getClassLoader().loadClass("org.jni_zero.JniInit").getDeclaredMethod("init", null);
                    } catch (NoSuchMethodException e) {
                        i(y3eVar, "Missing init() method", e);
                    }
                } catch (ClassNotFoundException e2) {
                    i(y3eVar, "Missing JniInit class", e2);
                }
            } catch (Throwable th) {
                i(y3eVar, "Unclassified error", th);
            }
            PeerConnectionFactory.InitializationOptions.Builder injectableLogger = PeerConnectionFactory.InitializationOptions.builder(context.getApplicationContext()).setInjectableLogger(j0, Logging.Severity.LS_VERBOSE);
            if (nativeLibraryLoader != null) {
                injectableLogger.setNativeLibraryLoader(nativeLibraryLoader);
            }
            PeerConnectionFactory.initialize(injectableLogger.createInitializationOptions());
            i0 = kziVar;
        }
    }

    public static boolean E() {
        return (i0 == null ? new rpc(null, null, null, false, false, false, false, null) : (rpc) i0.a).e;
    }

    public static LinkedList e(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                int length = str.length();
                int iCharCount = 0;
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (!Character.isWhitespace(iCodePointAt)) {
                        linkedList.add(str);
                        break;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public static void i(y3e y3eVar, String str, Throwable th) {
        if (y3eVar != null) {
            try {
                y3eVar.reportException("PeerConnectionClient", str, new v(str, th));
            } catch (Throwable unused) {
            }
        }
    }

    public final void A(List list) {
        if (i0 == null) {
            this.w.log("PeerConnectionClient", "Creating peer connection without initializing factory.");
            return;
        }
        if (!this.V) {
            this.f0.f("pc.request.confirmed");
            this.V = true;
            this.s.a(new y81(this, 2, list), new o01(10, this));
        } else {
            this.w.log("PeerConnectionClient", this + ": creation of a peer connection is already scheduled");
        }
    }

    public final n91 B() {
        WeakReference weakReference = this.K;
        if (weakReference == null) {
            return null;
        }
        return (n91) weakReference.get();
    }

    public final rve C() {
        rve rveVar = this.B;
        if (rveVar != null) {
            return rveVar;
        }
        ore.k("Command executor is not enabled");
        return null;
    }

    public final boolean F() {
        return (this.U || this.V || this.H == null) ? false : true;
    }

    public final void G() {
        sb9 sb9Var = this.R;
        if (sb9Var != null) {
            this.w.log("PeerConnectionClient", "maybeUpdateSenders, " + this + ", " + uza.b(sb9Var));
            if (I() != null) {
                RtpSender rtpSender = this.M;
                RtpSender rtpSender2 = this.L;
                sb9Var.n.log("OKRTCLmsAdapter", "bindTracksWith, " + sb9Var + ", audio sender=" + uza.b(rtpSender) + " & video sender= " + uza.b(rtpSender2));
                sb9Var.i.o(rtpSender);
                if (sb9Var.f.d) {
                    sb9Var.y.o(rtpSender2);
                }
            }
        }
    }

    public final void H() {
        int i;
        RtpSender rtpSender = this.L;
        int i2 = this.m;
        er2 er2Var = new er2(this.o.o(rtpSender, (i2 == 0 || (i = this.n) == 0) ? new Size(960, 544) : new Size(i2, i)));
        rve rveVarC = C();
        ipc ipcVar = new ipc(this);
        kr6 kr6Var = new kr6(er2Var);
        kr6Var.b = ipcVar;
        rveVarC.d(new dc9(kr6Var));
    }

    public final PeerConnection I() {
        if (this.H != null && !this.U && !this.I) {
            return this.H;
        }
        StringBuilder sb = new StringBuilder();
        if (this.H == null) {
            sb.append("No web-rtc peer connection");
        }
        if (this.I) {
            if (sb.length() > 0) {
                sb.append(", fatal error occurred");
            } else {
                sb.append("Fatal error occurred");
            }
        }
        boolean z = this.U;
        y3e y3eVar = this.w;
        if (z) {
            y3eVar.log("PeerConnectionClient", this + ": (closed) " + ((Object) sb));
            return null;
        }
        y3eVar.log("PeerConnectionClient", this + ": (unclosed null peer connection) " + ((Object) sb));
        return null;
    }

    public final void J(long j) {
        ppc ppcVar = this.J;
        if (ppcVar != null) {
            ppcVar.e(this, j);
        }
    }

    public final void K(IceCandidate[] iceCandidateArr) {
        this.w.log("PeerConnectionClient", "removeRemoteIceCandidates, " + this);
        j(new bjk(this, new pg4(2, iceCandidateArr), 1));
    }

    public final void L(vpc vpcVar) {
        if (vpcVar == null || vpcVar.equals(this.Z)) {
            return;
        }
        vpc vpcVar2 = this.Z;
        boolean z = (vpcVar2 == null || Objects.equals(vpcVar2.i, vpcVar.i)) ? false : true;
        this.Z = vpcVar;
        this.a0.g = vpcVar;
        this.w.log("PeerConnectionClient", "setPeerVideoSettings, " + this + " settings=" + vpcVar.toString());
        j(new bjk(this, new cpc(this, z, 1), 1));
    }

    public final void M(SessionDescription sessionDescription) {
        this.w.log("PeerConnectionClient", "setRemoteDescription, " + this + ", sdp=" + sessionDescription.type);
        this.Y = false;
        this.X = false;
        p38 p38Var = this.A;
        if (p38Var.c == 0) {
            p38Var.c = SystemClock.elapsedRealtime();
        }
        j(new bjk(this, new hpc(this, sessionDescription, 1), 1));
    }

    @Override // defpackage.umc
    public final void a(yt1 yt1Var, VideoFrame videoFrame) {
        yt1 yt1Var2;
        a5f a5fVar = this.z;
        if (a5fVar != null) {
            videoFrame.getClass();
            ((gsh) a5fVar.b).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            yt1Var2 = yt1Var;
            i3f.a().b(new xx3(a5fVar, yt1Var2, new android.util.Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight()), jElapsedRealtime));
        } else {
            yt1Var2 = yt1Var;
        }
        this.b0.a(yt1Var2, videoFrame);
    }

    @Override // defpackage.tb9
    public final void b(sb9 sb9Var) {
        this.w.log("PeerConnectionClient", "onLocalMediaStreamChanged, " + this + " ms=" + uza.b(sb9Var));
        final Size sizeH = sb9Var.h();
        b4f b4fVar = sb9Var.t;
        final int i = b4fVar != null ? b4fVar.g : 0;
        b4f b4fVar2 = sb9Var.t;
        final int i2 = b4fVar2 != null ? b4fVar2.f : 0;
        j(new bjk(this, new sg4() { // from class: epc
            @Override // defpackage.sg4
            public final void accept(Object obj) {
                PeerConnection peerConnection = (PeerConnection) obj;
                qpc qpcVar = this.a;
                f4j f4jVar = qpcVar.a0;
                qpcVar.G();
                Size size = sizeH;
                int i3 = size.width;
                int i4 = size.height;
                if (qpcVar.m != i3 || qpcVar.n != i4) {
                    f4jVar.i = i4;
                    f4jVar.h = i3;
                    y3e y3eVar = qpcVar.w;
                    StringBuilder sb = new StringBuilder("Camera video size changed: ");
                    sb.append(qpcVar.m);
                    sb.append("x");
                    qt4.x(qpcVar.n, i3, " -> ", "x", sb);
                    sb.append(i4);
                    y3eVar.log("PeerConnectionClient", sb.toString());
                    qpcVar.m = i3;
                    qpcVar.n = i4;
                    qpcVar.w(peerConnection, false);
                }
                int i5 = qpcVar.k;
                int i6 = i;
                int i7 = i2;
                if (i5 == i6 && qpcVar.l == i7) {
                    return;
                }
                f4jVar.j = i6;
                f4jVar.k = i7;
                qpcVar.k = i6;
                qpcVar.l = i7;
                qpcVar.m(peerConnection, false);
            }
        }, 1));
    }

    public final f25 c(String str, DataChannel.Init init) {
        init.ordered = true;
        init.maxRetransmitTimeMs = 10000000;
        DataChannel dataChannelCreateDataChannel = this.H.createDataChannel(str, init);
        y3e y3eVar = this.w;
        StringBuilder sbV = qt4.v("DATACH create data channel: name: ", str, ", id: ");
        sbV.append(dataChannelCreateDataChannel.id());
        y3eVar.log("PeerConnectionClient", sbV.toString());
        return new f25(dataChannelCreateDataChannel, this.w);
    }

    public final String d(String str, boolean z) {
        String string;
        LinkedList<String> linkedListE = e(this.F);
        fh6 fh6Var = fh6.b;
        xt1 xt1Var = this.x;
        boolean z2 = this.S;
        LinkedList<String> linkedListE2 = (z2 && xt1Var.r.E == fh6Var) ? e(new String[]{"VP8"}) : e(this.G);
        boolean z3 = this.E || (z2 && xt1Var.r.E == fh6Var);
        StringBuilder sbB = zo5.B("applyPreferCodec, local=", z, ", filter=", z3, ", video=[");
        String string2 = "null";
        if (linkedListE2 == null) {
            string = "null";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str2 : linkedListE2) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(str2);
            }
            string = sb.toString();
        }
        sbB.append(string);
        sbB.append("], audio=[");
        if (linkedListE != null) {
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : linkedListE) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(str3);
            }
            string2 = sb2.toString();
        }
        sbB.append(string2);
        sbB.append("]");
        String string3 = sbB.toString();
        y3e y3eVar = this.w;
        y3eVar.log("PeerConnectionClient", string3);
        String strF = xml.f(str, z3, linkedListE, linkedListE2, y3eVar);
        if (!str.equals(strF)) {
            try {
                y3eVar.log("PeerConnectionClient", "applyPreferCodec, local=" + z + ", description before=[" + str.replace("\r\n", "\\r\\n") + "]");
                y3eVar.log("PeerConnectionClient", "applyPreferCodec, local=" + z + ", description after=[" + strF.replace("\r\n", "\\r\\n") + "]");
                return strF;
            } catch (Throwable th) {
                y3eVar.reportException("PeerConnectionClient", "applyPreferCodec, failed to log sdp difference", th);
            }
        }
        return strF;
    }

    public final PeerConnection.RTCConfiguration f(List list) {
        PeerConnection.IceTransportsType iceTransportsType;
        ArrayList arrayList = new ArrayList();
        this.x.getClass();
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (it.hasNext()) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) it.next();
            String str = iceServer.uri;
            if (str == null || iceServer.password == null || iceServer.username == null) {
                throw new NullPointerException(iceServer.toString());
            }
            if (str.startsWith("turn")) {
                if (!iceServer.username.isEmpty() && !iceServer.password.isEmpty()) {
                    arrayList.add(iceServer);
                    if (i > 0) {
                        arrayList.add(PeerConnection.IceServer.builder(iceServer.uri.concat("?transport=tcp")).setUsername(iceServer.username).setPassword(iceServer.password).setTlsCertPolicy(iceServer.tlsCertPolicy).setHostname(iceServer.hostname).createIceServer());
                        i--;
                    }
                    z = true;
                }
            } else if (iceServer.uri.startsWith("stun")) {
                arrayList.add(iceServer);
                z2 = true;
            }
        }
        y3e y3eVar = this.w;
        if (!z || !z2) {
            y3eVar.log("PeerConnectionClient", this + ": stun or turn servers are absent");
        }
        y3eVar.log("PeerConnectionClient", this + ": iceServers=" + arrayList);
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(arrayList);
        rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
        if (this.a) {
            iceTransportsType = PeerConnection.IceTransportsType.RELAY;
        } else {
            iceTransportsType = this.b;
            if (iceTransportsType == null) {
                iceTransportsType = PeerConnection.IceTransportsType.ALL;
            }
        }
        rTCConfiguration.iceTransportsType = iceTransportsType;
        y3eVar.log("PeerConnectionClient", "iceTransportType was set to " + rTCConfiguration.iceTransportsType);
        Integer num = this.q;
        if (num != null) {
            rTCConfiguration.iceCandidatePoolSize = num.intValue();
            y3eVar.log("PeerConnectionClient", "iceCandidatesPoolSize was set to " + rTCConfiguration.iceCandidatePoolSize);
        }
        PeerConnection.VpnPreference vpnPreference = this.c;
        if (vpnPreference != null) {
            rTCConfiguration.vpnPreference = vpnPreference;
        }
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        rTCConfiguration.audioJitterBufferMaxPackets = 200;
        y3eVar.log("PeerConnectionClient", "Jitter buffer size set to " + rTCConfiguration.audioJitterBufferMaxPackets);
        return rTCConfiguration;
    }

    public final void g(xbb xbbVar) {
        this.w.log("PeerConnectionClient", "handleSdpCreateFailure, " + this + ", error=" + xbbVar.b);
        j(new fpc(this, xbbVar, 0));
    }

    public final void h(xbb xbbVar, boolean z, SessionDescription sessionDescription) {
        String str = "handleSdpSetFailure " + sessionDescription.type + " " + z + " " + sessionDescription.description;
        y3e y3eVar = this.w;
        y3eVar.log("PeerConnectionClient", str);
        y3eVar.reportException("PeerConnectionClient", zo5.w(new StringBuilder("set."), z ? "local" : "remote", ".sdp.failed"), new Exception(xbbVar.b));
        j(new fpc(this, xbbVar, 1));
    }

    public final void j(Runnable runnable) {
        ExecutorService executorService = this.u;
        if (executorService != null) {
            executorService.execute(runnable);
            return;
        }
        alc alcVar = this.v;
        alcVar.getClass();
        alcVar.a.execute(new chk(runnable));
    }

    public final void k(String str, String str2) {
        this.w.reportException("PeerConnectionClient", qv1.l("reportError, ", str, " ", str2), new Exception("peer.connection.error.".concat(str)));
        j(new dpc(this, 6));
    }

    public final void l(PeerConnection peerConnection, sb9 sb9Var) {
        List<String> listSingletonList = Collections.singletonList(sb9Var.m);
        gb0 gb0Var = sb9Var.i;
        AudioTrack audioTrack = gb0Var != null ? (AudioTrack) ((MediaStreamTrack) gb0Var.e) : null;
        if (audioTrack != null) {
            RtpSender rtpSenderAddTrack = peerConnection.addTrack(audioTrack, listSingletonList);
            ewe eweVar = this.o;
            eweVar.getClass();
            rtpSenderAddTrack.getClass();
            ((y3e) eweVar.c).log("RtpSenderHelper", "set audio bitrate range to 6000-48000, priority=1.0");
            eweVar.f(rtpSenderAddTrack, MediaStreamTrack.AUDIO_TRACK_KIND, 6000, 48000, Double.valueOf(1.0d), true);
            this.M = rtpSenderAddTrack;
        }
        x(peerConnection);
        this.w.log("PeerConnectionClient", this + ": " + uza.b(this.M) + "(audio) created");
    }

    public final void m(PeerConnection peerConnection, boolean z) {
        y3e y3eVar = this.w;
        try {
            n(peerConnection, z, true, this.P);
        } catch (IllegalStateException e) {
            y3eVar.log("PeerConnectionClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            y3eVar.log("PeerConnectionClient", "Exception, " + this + " ex=" + e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:223:0x0517  */
    public final void n(PeerConnection peerConnection, boolean z, boolean z2, RtpSender rtpSender) {
        String str;
        f4j f4jVar;
        Integer num;
        l3j l3jVar;
        RtpParameters.DegradationPreference degradationPreference;
        ypc ypcVarA;
        boolean zG;
        int i;
        String str2;
        int i2;
        int iMin;
        Object next;
        Object next2;
        Object objPrevious;
        VideoCodecInfo videoCodecInfo;
        p3j p3jVar;
        Integer numValueOf;
        v4f v4fVar;
        r66 r66Var = r66.a;
        vpc vpcVar = this.Z;
        if (vpcVar == null) {
            this.w.log("PeerConnectionClient", "updatePVS(), no video settings, ignore this update");
            return;
        }
        if (z2) {
            f4j f4jVar2 = this.a0;
            sb9 sb9Var = this.R;
            y3e y3eVar = f4jVar2.d;
            int i3 = vpcVar.d;
            ArrayList arrayListR0 = xw3.R0(Integer.valueOf(vpcVar.a));
            int i4 = f4jVar2.j;
            int i5 = f4jVar2.k;
            int iMax = Math.max(i4, i5);
            int iMin2 = Math.min(i4, i5);
            l3j l3jVar2 = (l3j) ((Map) f4jVar2.f.a).get(1);
            arrayListR0.add(Integer.valueOf(l3jVar2 != null ? l3jVar2.b : 0));
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListR0) {
                if (((Number) obj).intValue() > 0) {
                    arrayList.add(obj);
                }
            }
            Integer num2 = (Integer) ww3.E1(arrayList);
            if (sb9Var != null && (v4fVar = sb9Var.z) != null) {
                if (num2 == null || num2.intValue() >= iMax) {
                    v4fVar.p(iMax, iMin2, i3);
                    y3eVar.log("VideoSettingCalculator", "select screenshare dimension: " + iMax + "x" + iMin2);
                } else {
                    int iRound = Math.round(num2.intValue() * (iMin2 / iMax));
                    v4fVar.p(num2.intValue(), iRound, i3);
                    y3eVar.log("VideoSettingCalculator", "select screenshare dimension compressed: " + num2 + "x" + iRound);
                }
            }
        }
        int i6 = vpcVar.h;
        int i7 = vpcVar.d;
        int i8 = vpcVar.a;
        if (!z2) {
            f4j f4jVar3 = this.a0;
            sb9 sb9Var2 = this.R;
            f4jVar3.getClass();
            ArrayList arrayListR1 = xw3.R0(Integer.valueOf(i8));
            if (sb9Var2 != null && (p3jVar = sb9Var2.y) != null) {
                l3j l3jVar3 = (l3j) ((Map) f4jVar3.f.a).get(0);
                arrayListR1.add(Integer.valueOf(l3jVar3 != null ? l3jVar3.b : 0));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListR1) {
                    if (((Number) obj2).intValue() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                Integer num3 = (Integer) ww3.E1(arrayList2);
                p3jVar.a.log("VideoRecord", "Set restriction to video frame max dimension: " + num3);
                exi exiVar = p3jVar.k;
                exiVar.getClass();
                if (num3 == null || num3.intValue() <= 0 || num3.intValue() >= exiVar.c) {
                    numValueOf = null;
                } else {
                    int iIntValue = num3.intValue();
                    numValueOf = Integer.valueOf(oc9.v(iIntValue - (iIntValue % 16), 320, np0.r));
                }
                exiVar.d = numValueOf;
                p3jVar.p();
            }
        }
        f4j f4jVar4 = this.a0;
        y3e y3eVar2 = f4jVar4.d;
        vpc vpcVar2 = f4jVar4.g;
        Context context = f4jVar4.b;
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        Object systemService2 = context.getSystemService("phone");
        systemService2.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) systemService2;
        vt1 vt1Var = f4jVar4.c.a;
        boolean z3 = uza.a;
        NetworkInfo networkInfo = ((ConnectivityManager) systemService).getNetworkInfo(1);
        int i9 = 65536;
        int i10 = 2048000;
        if ((networkInfo == null || !networkInfo.isConnected()) && context.checkPermission("android.permission.READ_PHONE_STATE", Process.myPid(), Process.myUid()) == 0) {
            switch (telephonyManager.getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    vt1Var.getClass();
                    i10 = 204800;
                    i9 = 16384;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    vt1Var.getClass();
                    i10 = 512000;
                    i9 = PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                    break;
                case 13:
                default:
                    vt1Var.getClass();
                    break;
            }
        } else {
            vt1Var.getClass();
        }
        int i11 = i9;
        int iMin3 = i10;
        String strH = zo5.h(iMin3, "; network maxBitrate=");
        if (vpcVar2 != null) {
            zzf zzfVar = f4jVar4.a;
            String str3 = (zzfVar == null || (videoCodecInfo = zzfVar.n.e) == null) ? null : videoCodecInfo.name;
            if (str3 == null) {
                str3 = "unknown";
            }
            String strO = c0a.o("select bitrate ", z2 ? "for screenshare" : "for camera", " by videoSettings=");
            int i12 = z2 ? f4jVar4.j : f4jVar4.h;
            int i13 = z2 ? f4jVar4.k : f4jVar4.i;
            int iMax2 = Math.max(i12, i13);
            int i14 = vpcVar2.a;
            int i15 = vpcVar2.c;
            int iMin4 = i15 * 1000;
            ypc ypcVar = vpcVar2.f;
            if (ypcVar == null || iMax2 <= 0) {
                str2 = strH;
                str = "generic";
                i2 = 0;
                iMin = 0;
            } else {
                str2 = strH;
                iMin = Math.min(vpcVar2.b / vpcVar2.g, iMax2);
                Map map = ypcVar.a;
                String lowerCase = str3.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                List list = (List) map.get(lowerCase);
                if (list == null && (list = (List) map.get("generic")) == null) {
                    list = r66Var;
                }
                if (list.isEmpty()) {
                    str = "generic";
                } else {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            Iterator it2 = it;
                            if (((xpc) next).a != iMin) {
                                it = it2;
                            }
                        } else {
                            next = null;
                        }
                    }
                    xpc xpcVar = (xpc) next;
                    if (xpcVar != null) {
                        i2 = xpcVar.b;
                        str = "generic";
                    } else {
                        str = "generic";
                        List listM1 = ww3.M1(list, new xa8(16));
                        Iterator it3 = listM1.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                Iterator it4 = it3;
                                if (((xpc) next2).a <= iMin) {
                                    it3 = it4;
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        xpc xpcVar2 = (xpc) next2;
                        ListIterator listIterator = listM1.listIterator(listM1.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                objPrevious = listIterator.previous();
                                ListIterator listIterator2 = listIterator;
                                if (((xpc) objPrevious).a >= iMin) {
                                    listIterator = listIterator2;
                                }
                            } else {
                                objPrevious = null;
                            }
                        }
                        xpc xpcVar3 = (xpc) objPrevious;
                        if (xpcVar3 != null && xpcVar2 != null) {
                            int i16 = xpcVar2.a;
                            int i17 = xpcVar3.a;
                            int i18 = xpcVar2.b;
                            int i19 = xpcVar3.b;
                            i2 = (((iMin - i17) * (i18 - i19)) / (i16 - i17)) + i19;
                        } else if (xpcVar2 != null) {
                            i2 = (xpcVar2.b * iMin) / xpcVar2.a;
                        } else if (xpcVar3 != null) {
                            i2 = xpcVar3.b;
                        }
                    }
                }
                i2 = 0;
            }
            if (i2 > 0) {
                int iMin5 = Math.min(iMin4, i2);
                StringBuilder sb = new StringBuilder();
                sb.append(strO);
                sb.append(iMin5);
                sb.append(" by table; encoder=");
                sb.append(str3);
                sb.append(" maxDimensionForTable=");
                qt4.x(iMin, i2, " tableBitrate=", " maxBitrateSetting=", sb);
                sb.append(iMin4);
                y3eVar2.log("VideoSettingCalculator", sb.toString());
                iMin4 = iMin5;
            } else if (iMax2 <= 0 || iMax2 >= i14) {
                y3eVar2.log("VideoSettingCalculator", strO + iMin4 + " by maxBitrateSetting");
            } else {
                iMin4 = ((int) (Math.min(((i12 * i13) / np0.n) * 533, i15 * 1024) / 1024.0d)) * 1024;
                y3eVar2.log("VideoSettingCalculator", strO + iMin4 + " by videoSize=" + i12 + "x" + i13);
            }
            iMin3 = Math.min(iMin3, iMin4);
            strH = qt4.j(iMin4, str2, "; videoSettings maxBitrate=");
            f4jVar = f4jVar4;
        } else {
            str = "generic";
            f4jVar = f4jVar4;
        }
        o3j o3jVar = f4jVar.f;
        if (z2) {
            l3jVar = (l3j) ((Map) o3jVar.a).get(1);
            num = 0;
        } else {
            num = r5;
            l3jVar = (l3j) ((Map) o3jVar.a).get(num);
        }
        if (l3jVar != null && (i = l3jVar.a) > 0) {
            iMin3 = Math.min(iMin3, i);
            strH = qt4.j(i, strH, "; videoQualityUpdate b=");
        }
        y3eVar2.log("VideoSettingCalculator", nbh.u("getMaxBitrates() AudioBitrate=", i11, " VideoBitrate=", iMin3, strH));
        if (z2 || !this.S || this.T == null) {
            ewe eweVar = this.o;
            Integer numValueOf2 = iMin3 > 0 ? Integer.valueOf(iMin3) : null;
            Integer numValueOf3 = i6 > 0 ? Integer.valueOf(i6) : null;
            Integer numValueOf4 = i7 > 0 ? Integer.valueOf(i7) : null;
            String str4 = vpcVar.e;
            if (z2) {
                degradationPreference = RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE;
            } else if (!TextUtils.isEmpty(str4)) {
                String lowerCase2 = str4.toLowerCase();
                lowerCase2.getClass();
                switch (lowerCase2) {
                    case "disabled":
                        degradationPreference = RtpParameters.DegradationPreference.DISABLED;
                        break;
                    case "maintain-resolution":
                        degradationPreference = RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION;
                        break;
                    case "maintain-framerate":
                        degradationPreference = RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE;
                        break;
                    default:
                        degradationPreference = RtpParameters.DegradationPreference.BALANCED;
                        break;
                }
            } else {
                degradationPreference = RtpParameters.DegradationPreference.BALANCED;
            }
            RtpParameters.DegradationPreference degradationPreference2 = degradationPreference;
            eweVar.getClass();
            degradationPreference2.getClass();
            String str5 = z2 ? "screen-share" : MediaStreamTrack.VIDEO_TRACK_KIND;
            try {
                eweVar.l(rtpSender, str5, z, numValueOf2, numValueOf3, numValueOf4, degradationPreference2);
            } catch (Throwable th) {
                ((y3e) eweVar.c).reportException("RtpSenderHelper", "Error on update of sender ".concat(str5), th);
            }
        } else {
            ewe eweVar2 = this.o;
            f4j f4jVar5 = this.a0;
            Integer numValueOf5 = Integer.valueOf(i8);
            t7g t7gVar = this.T;
            Integer numValueOf6 = i6 > 0 ? Integer.valueOf(i6) : null;
            vpc vpcVar3 = f4jVar5.g;
            if (vpcVar3 == null || (ypcVarA = vpcVar3.f) == null) {
                ypcVarA = kgl.a();
            }
            Size size = new Size(f4jVar5.h, f4jVar5.i);
            Map map2 = ypcVarA.a;
            String lowerCase3 = str.toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            List list2 = (List) map2.get(lowerCase3);
            List list3 = list2 == null ? r66Var : list2;
            l3j l3jVar4 = (l3j) ((Map) f4jVar5.f.a).get(num);
            Integer numValueOf7 = l3jVar4 != null ? Integer.valueOf(l3jVar4.b) : null;
            if (numValueOf7 != null) {
                numValueOf5 = Integer.valueOf(Math.min(i8, numValueOf7.intValue()));
            }
            List listA = f4jVar5.a(size, list3, numValueOf5, t7gVar, i7, numValueOf6);
            eweVar2.getClass();
            rtpSender.getClass();
            try {
                zG = eweVar2.g(rtpSender, z, listA);
            } catch (Throwable th2) {
                ((y3e) eweVar2.c).reportException("RtpSenderHelper", "Error on update of sender video", th2);
                zG = false;
            }
            if (zG) {
                H();
            }
        }
        x(peerConnection);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o(PeerConnectionFactory peerConnectionFactory) {
        this.w.log("PeerConnectionClient", "createPeerConnectionInternal, " + this);
        if (this.I) {
            this.w.log("PeerConnectionClient", this + ": fatal error occurred");
            return;
        }
        PeerConnection.RTCConfiguration rTCConfigurationF = f(this.O);
        if ((this.v == null || alc.c.get() != alc.b) && this.u == null) {
            this.r.post(new h7b(4, new RuntimeException()));
        }
        y3e y3eVar = this.w;
        y3eVar.getClass();
        kzi kziVar = new kzi();
        kziVar.a = y3eVar;
        this.w.log("PeerConnectionClient", "create PC");
        this.H = peerConnectionFactory.createPeerConnection(rTCConfigurationF, new xp9(this, kziVar, false, 26));
        if (this.H == null) {
            ore.k("peerconnection is null");
            return;
        }
        sb9 sb9Var = (sb9) this.t.a(peerConnectionFactory).c;
        this.R = sb9Var;
        if (sb9Var != null) {
            this.w.log("PeerConnectionClient", this + ": has " + uza.b(this.R));
            Size sizeH = this.R.h();
            this.m = sizeH.width;
            this.n = sizeH.height;
            b4f b4fVar = this.R.t;
            this.l = b4fVar != null ? b4fVar.f : 0;
            b4f b4fVar2 = this.R.t;
            this.k = b4fVar2 != null ? b4fVar2.g : 0;
            f4j f4jVar = this.a0;
            f4jVar.i = this.n;
            f4jVar.h = this.m;
            b4f b4fVar3 = this.R.t;
            f4jVar.k = b4fVar3 != null ? b4fVar3.f : 0;
            f4j f4jVar2 = this.a0;
            b4f b4fVar4 = this.R.t;
            f4jVar2.j = b4fVar4 != null ? b4fVar4.g : 0;
            boolean z = this.S;
            PeerConnection peerConnection = this.H;
            sb9 sb9Var2 = this.R;
            if (z) {
                l(peerConnection, sb9Var2);
            } else {
                l(peerConnection, sb9Var2);
                v(this.H, this.R);
            }
            G();
            this.R.c.add(this);
            if (this.d0) {
                sb9 sb9Var3 = this.R;
                f25 f25VarC = c("consumerScreenShare", new DataChannel.Init());
                qpc qpcVar = sb9Var3.v;
                if (qpcVar != null) {
                    qpcVar.w.log("PeerConnectionClient", "Data channel screen capturer unbound from " + qpcVar);
                }
                sb9Var3.v = this;
                this.w.log("PeerConnectionClient", "Data channel screen capturer bound to " + this);
                g5f g5fVar = sb9Var3.u;
                if (g5fVar == null) {
                    g5f g5fVar2 = new g5f(sb9Var3.a, sb9Var3.d.getApplicationContext(), sb9Var3.n, sb9Var3.E, sb9Var3.C);
                    sb9Var3.u = g5fVar2;
                    g5fVar = g5fVar2;
                }
                g5fVar.b.b(new yde(g5fVar, 9, f25VarC));
            }
        }
        if (this.B != null) {
            f25 f25VarC2 = c("producerCommand", new DataChannel.Init());
            rve rveVar = this.B;
            if (rveVar.j.get()) {
                ore.k("Instance is disposed");
                return;
            }
            rveVar.f.post(new yde(rveVar, 3, f25VarC2));
        }
        if (this.C != null) {
            f25 f25VarC3 = c("producerNotification", new DataChannel.Init());
            z18 z18Var = this.C;
            if (((AtomicBoolean) z18Var.g).get()) {
                ore.k("Instance is disposed");
                return;
            }
            ((Handler) z18Var.e).post(new yde(z18Var, 4, f25VarC3));
        }
        d5f d5fVar = this.d;
        if (d5fVar != null) {
            f25 f25VarC4 = c("producerScreenShare", new DataChannel.Init());
            f25 f25Var = d5fVar.d;
            if (f25Var != null) {
                p3k p3kVar = d5fVar.h;
                if (p3kVar != null) {
                    f25Var.c(p3kVar);
                }
                d5fVar.d = null;
                d5fVar.h = null;
            }
            d5fVar.d = f25VarC4;
            p3k p3kVar2 = new p3k(3, d5fVar);
            d5fVar.h = p3kVar2;
            f25VarC4.a(p3kVar2);
        }
        if (this.e != null) {
            f25 f25VarC5 = c("asr", new DataChannel.Init());
            ljf ljfVar = this.e;
            f25 f25Var2 = (f25) ljfVar.b;
            if (f25Var2 != null) {
                p3k p3kVar3 = (p3k) ljfVar.c;
                if (p3kVar3 != null) {
                    f25Var2.c(p3kVar3);
                }
                ljfVar.b = null;
                ljfVar.c = null;
            }
            ljfVar.b = f25VarC5;
            p3k p3kVar4 = new p3k(1, ljfVar);
            ljfVar.c = p3kVar4;
            f25VarC5.a(p3kVar4);
        }
        int i = this.g0;
        if (i == 1 || i == 3) {
            DataChannel.Init init = new DataChannel.Init();
            if (this.g0 == 3) {
                init.id = 1;
                init.negotiated = true;
            }
            f25 f25VarC6 = c("animoji", init);
            an anVar = this.h;
            if (anVar != null) {
                anVar.f(f25VarC6);
            }
            hm hmVar = this.j;
            if (hmVar != null) {
                f25 f25Var3 = hmVar.c;
                if (f25Var3 != null) {
                    f25Var3.c(hmVar);
                }
                hmVar.c = f25VarC6;
                d0c d0cVar = hmVar.b;
                ((AtomicInteger) d0cVar.e).set(0);
                ((AtomicInteger) d0cVar.f).set(0);
                f25VarC6.a(hmVar);
            }
        }
        this.w.log("PeerConnectionClient", this + ": peer connection created");
    }

    public final void p(SessionDescription sessionDescription) {
        this.w.log("PeerConnectionClient", "handleSdpCreateSuccess, " + this + ", sdp=" + sessionDescription.type);
        this.r.post(new gpc(this, sessionDescription, 0));
        j(new bjk(this, new hpc(this, sessionDescription, 0), 1));
    }

    public final void q(final SessionDescription sessionDescription, final boolean z) {
        this.w.log("PeerConnectionClient", "handleSdpSetSuccess, " + this + ", sdp=" + sessionDescription.type + ", local ? " + z);
        j(new bjk(this, new sg4() { // from class: kpc
            @Override // defpackage.sg4
            public final void accept(Object obj) {
                t7g t7gVar;
                u7g u7gVarA;
                qpc qpcVar = this.a;
                boolean z2 = z;
                SessionDescription sessionDescription2 = sessionDescription;
                if (z2) {
                    qpcVar.r.post(new gpc(qpcVar, sessionDescription2, 1));
                    return;
                }
                if (qpcVar.S) {
                    String str = sessionDescription2.description;
                    y3e y3eVar = qpcVar.w;
                    str.getClass();
                    y3eVar.getClass();
                    t7g t7gVar2 = null;
                    try {
                        List listM1 = r5h.m1(r5h.y1(str).toString(), new String[]{"\r\n"}, 6);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listM1.iterator();
                        loop0: while (true) {
                            String string = null;
                            boolean z3 = false;
                            while (true) {
                                if (!it.hasNext()) {
                                    if (!z3 || string == null || arrayList.isEmpty()) {
                                        break loop0;
                                        break loop0;
                                        break loop0;
                                    }
                                    t7gVar = new t7g(string, ww3.T1(arrayList));
                                } else {
                                    String str2 = (String) it.next();
                                    if (z5h.K0(str2, "m=", false)) {
                                        if (!z3 || string == null || arrayList.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            t7gVar = new t7g(string, ww3.T1(arrayList));
                                        }
                                    } else if (z5h.K0(str2, "a=mid:", false)) {
                                        string = r5h.y1(r5h.f1(str2, "a=mid:")).toString();
                                    } else if (z5h.K0(str2, "a=simulcast:", false)) {
                                        z3 = true;
                                    } else if (z5h.K0(str2, "a=rid:", false) && string != null && (u7gVarA = oql.a(str2)) != null) {
                                        arrayList.add(u7gVarA);
                                    }
                                }
                                t7gVar2 = t7gVar;
                                break loop0;
                            }
                        }
                    } catch (Throwable th) {
                        Throwable thA = roe.a(new poe(th));
                        if (thA != null) {
                            String message = thA.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            y3eVar.reportException("SimulcastSdpProcessor", message, thA);
                        }
                    }
                    qpcVar.T = t7gVar2;
                    qpcVar.v(qpcVar.H, qpcVar.R);
                    qpcVar.G();
                    for (RtpTransceiver rtpTransceiver : qpcVar.H.getTransceivers()) {
                        if (rtpTransceiver.getSender() == qpcVar.L) {
                            rtpTransceiver.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                        }
                    }
                }
                qpcVar.r.post(new gpc(qpcVar, sessionDescription2, 2));
            }
        }, 1));
    }

    public final void r(boolean z) {
        ioc iocVar;
        this.U = true;
        this.Y = false;
        this.X = false;
        this.J = null;
        this.b0.f();
        zzf zzfVar = this.s;
        if (zzfVar != null && (iocVar = zzfVar.n) != null) {
            iocVar.f.remove(this);
        }
        this.r.removeCallbacksAndMessages(null);
        if (z) {
            j(new dpc(this, 7));
        } else {
            j(new dpc(this, 0));
        }
    }

    public final void s() {
        f25 f25Var;
        this.w.log("PeerConnectionClient", "closeInternal, " + this);
        this.M = null;
        this.L = null;
        this.N = null;
        this.P = null;
        sb9 sb9Var = this.R;
        if (sb9Var != null) {
            if (sb9Var.v == this) {
                sb9Var.v = null;
                g5f g5fVar = sb9Var.u;
                if (g5fVar != null) {
                    g5fVar.b.b(new yde(g5fVar, 9, null));
                }
            }
            this.R.c.remove(this);
            this.R = null;
        }
        rve rveVar = this.B;
        if (rveVar != null) {
            Handler handler = rveVar.f;
            if (rveVar.j.compareAndSet(false, true)) {
                rveVar.g.removeCallbacksAndMessages(null);
                handler.removeCallbacksAndMessages(null);
                handler.post(new h7b(17, rveVar));
                rveVar.e.quitSafely();
            }
        }
        z18 z18Var = this.C;
        if (z18Var != null) {
            Handler handler2 = (Handler) z18Var.e;
            if (((AtomicBoolean) z18Var.g).compareAndSet(false, true)) {
                handler2.removeCallbacksAndMessages(null);
                handler2.post(new h7b(18, z18Var));
                ((HandlerThread) z18Var.d).quitSafely();
            }
        }
        ljf ljfVar = this.e;
        if (ljfVar != null && (f25Var = (f25) ljfVar.b) != null) {
            p3k p3kVar = (p3k) ljfVar.c;
            if (p3kVar != null) {
                f25Var.c(p3kVar);
            }
            ljfVar.b = null;
            ljfVar.c = null;
        }
        rve rveVar2 = this.B;
        if (rveVar2 != null) {
            try {
                rveVar2.e.join(500L);
            } catch (InterruptedException e) {
                this.w.reportException("PeerConnectionClient", "command.exec.shutdown", e);
            }
        }
        z18 z18Var2 = this.C;
        if (z18Var2 != null) {
            try {
                ((HandlerThread) z18Var2.d).join(500L);
            } catch (InterruptedException e2) {
                this.w.reportException("PeerConnectionClient", "notif.recv.shutdown", e2);
            }
        }
        d5f d5fVar = this.d;
        if (d5fVar != null) {
            d5fVar.g = true;
            for (bak bakVar : d5fVar.a.values()) {
                if (bakVar != null) {
                    bakVar.a();
                }
            }
            f25 f25Var2 = d5fVar.d;
            if (f25Var2 != null) {
                p3k p3kVar2 = d5fVar.h;
                if (p3kVar2 != null) {
                    f25Var2.c(p3kVar2);
                }
                d5fVar.d = null;
                d5fVar.h = null;
            }
        }
        hm hmVar = this.j;
        if (hmVar != null) {
            f25 f25Var3 = hmVar.c;
            if (f25Var3 != null) {
                f25Var3.c(hmVar);
            }
            hmVar.c = null;
        }
        an anVar = this.h;
        if (anVar != null) {
            anVar.d();
        }
        an anVar2 = this.h;
        if (anVar2 != null) {
            anVar2.d();
        }
        hm hmVar2 = this.j;
        if (hmVar2 != null) {
            f25 f25Var4 = hmVar2.c;
            if (f25Var4 != null) {
                f25Var4.c(hmVar2);
            }
            hmVar2.c = null;
        }
        if (this.H != null) {
            this.H.dispose();
            this.w.log("PeerConnectionClient", this + ": " + uza.b(this.H) + " was disposed");
            this.H = null;
        }
        this.w.log("PeerConnectionClient", this + ": " + uza.b(this) + " was closed");
    }

    public final void t(IceCandidate iceCandidate) {
        IceCandidate iceCandidateA = this.e0.a(iceCandidate);
        this.w.log("PeerConnectionClient", "addRemoteIceCandidate, " + this);
        j(new bjk(this, new jpc(this, iceCandidateA, 0), 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        boolean z = uza.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append("@PeerConnection@");
        PeerConnection peerConnection = this.H;
        sb.append(peerConnection != null ? Integer.toString(System.identityHashCode(peerConnection)) : "Ø");
        return sb.toString();
    }

    public final void u(p8b p8bVar) {
        boolean z = p8bVar.b;
        if (z != this.W) {
            a4f a4fVar = this.c0;
            if (a4fVar == null) {
                this.w.reportException("PeerConnectionClient", "No permission provider passed", new IllegalStateException("No permission provider passed"));
            } else {
                this.W = z;
                j(new d86(this, p8bVar, a4fVar, 20));
            }
        }
    }

    public final void v(PeerConnection peerConnection, sb9 sb9Var) {
        ypc ypcVarA;
        int i;
        List<String> listSingletonList = Collections.singletonList(sb9Var.m);
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) sb9Var.y.e);
        y3e y3eVar = this.w;
        if (videoTrack == null) {
            x(peerConnection);
            y3eVar.log("PeerConnectionClient", this + ": no camera track, skip video sender creation");
            return;
        }
        RtpSender rtpSender = this.L;
        if (rtpSender != null && rtpSender.track() == videoTrack) {
            x(peerConnection);
            y3eVar.log("PeerConnectionClient", this + ": " + uza.b(this.L) + "(video) already exists, skip addTrack");
            return;
        }
        RtpSender rtpSender2 = this.L;
        if (rtpSender2 != null) {
            rtpSender2.setTrack(videoTrack, false);
            x(peerConnection);
            y3eVar.log("PeerConnectionClient", this + ": " + uza.b(this.L) + "(video) track replaced");
            return;
        }
        RtpSender rtpSenderAddTrack = peerConnection.addTrack(videoTrack, listSingletonList);
        boolean z = this.S;
        ewe eweVar = this.o;
        if (z) {
            t7g t7gVar = this.T;
            int i2 = this.m;
            Size size = (i2 == 0 || (i = this.n) == 0) ? new Size(960, 544) : new Size(i2, i);
            f4j f4jVar = this.a0;
            f4jVar.getClass();
            t7gVar.getClass();
            vpc vpcVar = f4jVar.g;
            if (vpcVar == null || (ypcVarA = vpcVar.f) == null) {
                ypcVarA = kgl.a();
            }
            Map map = ypcVarA.a;
            String lowerCase = "generic".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            List list = (List) map.get(lowerCase);
            if (list == null) {
                list = r66.a;
            }
            List listA = f4jVar.a(size, list, null, t7gVar, 30, null);
            eweVar.getClass();
            rtpSenderAddTrack.getClass();
            try {
                eweVar.g(rtpSenderAddTrack, true, listA);
            } catch (Throwable th) {
                ((y3e) eweVar.c).reportException("RtpSenderHelper", "Error on update of sender video", th);
            }
            this.L = rtpSenderAddTrack;
        } else {
            eweVar.getClass();
            rtpSenderAddTrack.getClass();
            eweVar.f(rtpSenderAddTrack, MediaStreamTrack.VIDEO_TRACK_KIND, 30000, 2048000, null, false);
            this.L = rtpSenderAddTrack;
        }
        x(peerConnection);
        y3eVar.log("PeerConnectionClient", this + ": " + uza.b(this.L) + "(video) created");
    }

    public final void w(PeerConnection peerConnection, boolean z) {
        y3e y3eVar = this.w;
        try {
            n(peerConnection, z, false, this.L);
        } catch (IllegalStateException e) {
            y3eVar.log("PeerConnectionClient", "IllegalStateException, " + this + " ex=" + e);
        } catch (Exception e2) {
            y3eVar.log("PeerConnectionClient", "Exception, " + this + " ex=" + e2);
        }
    }

    public final void x(PeerConnection peerConnection) {
        ewe eweVar = this.o;
        eweVar.getClass();
        int iN = eweVar.n(this.P) + eweVar.n(this.L) + eweVar.n(this.N) + eweVar.n(this.M);
        peerConnection.setBitrate(6000, null, Integer.valueOf(iN));
        this.w.log("PeerConnectionClient", "Bitrate constraints were set to [6000:" + iN + "]");
    }

    public final void y() {
        this.w.log("PeerConnectionClient", "createAnswer, " + this);
        this.f0.f("pc.answer.requested");
        this.Y = false;
        j(new bjk(this, new lpc(this, 1), 1));
    }

    public final void z(boolean z) {
        this.w.log("PeerConnectionClient", "createOffer, " + this + " iceRestart=" + z);
        if (z) {
            this.r.post(new dpc(this, 2));
        }
        this.Y = false;
        this.f0.f("pc.offer.requested");
        j(new bjk(this, new cpc(this, z, 0), 1));
    }
}
