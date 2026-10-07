package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class pbi implements n91, ppc {
    public static final Pattern x = Pattern.compile("a=ssrc:(\\d+)");
    public final xt1 a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final CidLogger e;
    public final q4g f;
    public final zzf g;
    public final HashSet h = new HashSet();
    public final wif i;
    public vpc j;
    public final boolean k;
    public final tif l;
    public final boolean m;
    public final opc n;
    public volatile qpc o;
    public SessionDescription p;
    public boolean q;
    public String r;
    public final CopyOnWriteArraySet s;
    public p8b t;
    public final boolean u;
    public final n91 v;
    public boolean w;

    public pbi(vif vifVar, wif wifVar, tif tifVar) {
        xt1 xt1Var = vifVar.m;
        this.a = xt1Var;
        this.b = vifVar.j;
        this.c = vifVar.k;
        this.d = vifVar.l;
        this.i = wifVar;
        CidLogger cidLogger = vifVar.o;
        this.e = cidLogger;
        this.f = vifVar.i;
        zzf zzfVar = vifVar.a;
        this.g = zzfVar;
        this.k = vifVar.B;
        this.l = tifVar;
        this.s = new CopyOnWriteArraySet();
        this.m = vifVar.r;
        this.u = vifVar.B;
        this.v = vifVar.A;
        opc opcVar = new opc();
        opcVar.a = zzfVar;
        opcVar.b = vifVar.b;
        opcVar.c = vifVar.d;
        opcVar.e = vifVar.e;
        opcVar.f = cidLogger;
        opcVar.g = true;
        opcVar.h = true;
        opcVar.d = xt1Var;
        opcVar.i = xt1Var.h;
        opcVar.l = xt1Var.i;
        opcVar.q = xt1Var.j > 0;
        opcVar.u = vifVar.s;
        xt1 xt1Var2 = vifVar.m;
        opcVar.m = xt1Var2.l;
        opcVar.n = xt1Var2.m;
        opcVar.o = xt1Var2.n;
        nl nlVar = vifVar.t;
        opcVar.v = new an(nlVar, nlVar.e, 2);
        nl nlVar2 = vifVar.t;
        opcVar.w = new hm(nlVar2, nlVar2.e);
        opcVar.G = 1;
        v88 v88Var = xt1Var.r;
        opcVar.s = v88Var.d;
        xt1 xt1Var3 = vifVar.m;
        opcVar.r = xt1Var3.r.x;
        opcVar.x = vifVar.w;
        opcVar.j = xt1Var3.q;
        opcVar.y = vifVar.x;
        Integer numM = v88Var.m();
        if (numM == null) {
            numM = 1;
            if (!v88Var.n()) {
                numM = null;
            }
        }
        opcVar.F = numM;
        opcVar.z = vifVar.y;
        opcVar.D = vifVar.C;
        opcVar.C = this;
        opcVar.t = vifVar.m.r.E.a();
        opcVar.E = vifVar.E;
        this.n = opcVar;
        f();
        if (this.o != null) {
            this.o.L(this.j);
        }
    }

    @Override // defpackage.ppc
    public final void a(qpc qpcVar) {
        this.e.log("UnifiedPeerConnection", "onPeerConnectionRenegotiationNeeded, " + qpcVar);
    }

    @Override // defpackage.ppc
    public final void b(String str) {
        l("audio-mix enabled");
        wif wifVar = this.i;
        wifVar.getClass();
        if (str == null || !str.endsWith("audio-mix") || wifVar.m == null) {
            return;
        }
        wifVar.t("audio-mix enabled");
    }

    @Override // defpackage.ppc
    public final void c(qpc qpcVar, String str) {
        yt1 yt1Var;
        wif wifVar = this.i;
        oki okiVar = wifVar.z;
        wifVar.Y("onPeerConnectionRemoteVideoTrackAdded, " + wifVar + ", client=" + qpcVar + ", track=" + str);
        yt1 yt1VarO = kql.O(str);
        du1 du1VarX = yt1VarO != null ? wifVar.x(yt1VarO) : null;
        if (du1VarX == null || (yt1Var = du1VarX.a) == null) {
            wifVar.e.log("ServerCallTopology", "Cant find participant  for " + str + " video track, " + qpcVar);
            return;
        }
        if (okiVar.g()) {
            Map remoteVideoRenderers = okiVar.getRemoteVideoRenderers(yt1Var);
            for (x52 x52Var : remoteVideoRenderers.keySet()) {
                List list = (List) remoteVideoRenderers.get(x52Var);
                if (list != null) {
                    qpcVar.b0.n(str, x52Var, list);
                }
            }
        }
    }

    @Override // defpackage.ppc
    public final void d(qpc qpcVar, PeerConnection.SignalingState signalingState) {
        PeerConnection.SignalingState signalingState2 = PeerConnection.SignalingState.STABLE;
        if (signalingState == signalingState2 && this.p != null && this.o.F()) {
            if (!this.u) {
                l("apply postponed remote sdp=" + this.p.type.canonicalForm() + " to " + qpcVar);
                this.o.M(this.p);
                this.p = null;
                return;
            }
            qpc qpcVar2 = this.o;
            if (qpcVar2.H != null && qpcVar2.H.signalingState() == signalingState2 && qpcVar2.H.getRemoteDescription() == null) {
                l("apply postponed remote sdp=" + this.p.type.canonicalForm() + " to " + qpcVar);
                this.o.M(this.p);
            }
        }
    }

    public final void f() {
        opc opcVar = this.n;
        opcVar.k = this.q;
        this.o = opcVar.a();
        this.o.J = this;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sve sveVar = (sve) obj;
            dc9 dc9Var = this.o.C().n;
            if (sveVar == null) {
                dc9Var.getClass();
                ore.p("Illegal 'listener' value: null");
                return;
            }
            ((CopyOnWriteArrayList) dc9Var.c).add(sveVar);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            wve wveVar = (wve) obj2;
            z18 z18Var = this.o.C;
            if (z18Var == null) {
                ore.k("Notifications receiver is not enabled");
                return;
            } else {
                if (wveVar == null) {
                    ore.p("Illegal 'listener' value: null");
                    return;
                }
                ((CopyOnWriteArrayList) z18Var.c).add(wveVar);
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            r81 r81Var = (r81) obj3;
            if (this.o.e != null) {
                ((CopyOnWriteArrayList) this.o.e.e).add(r81Var);
            }
        }
        qpc qpcVar = this.o;
        qpcVar.H = null;
        qpcVar.I = false;
        qpcVar.L = null;
        qpcVar.M = null;
        qpcVar.N = null;
        qpcVar.P = null;
        qpcVar.j(new dpc(qpcVar, 3));
    }

    @Override // defpackage.ppc
    public final void g() {
        bw6 bw6Var = this.i.f;
        if (bw6Var == null || bw6Var.b()) {
            return;
        }
        bw6Var.c();
    }

    @Override // defpackage.ppc
    public final void h(qpc qpcVar, SessionDescription sessionDescription) {
        if (sessionDescription.type == SessionDescription.Type.OFFER) {
            if (qpcVar.Y) {
                c.t();
            } else {
                this.o.y();
            }
        }
    }

    @Override // defpackage.ppc
    public final void i(qpc qpcVar) {
        if (this.o.F()) {
            wif wifVar = this.i;
            wifVar.getClass();
            wifVar.Y("resendDisplayLayouts, " + wifVar);
            List list = wifVar.E.c;
            wifVar.D.getClass();
            wifVar.C.q(yr8.n(list));
            kl5 kl5Var = wifVar.E;
            kl5Var.e = true;
            kl5Var.a(kl5Var.c);
            o91 o91Var = wifVar.m;
            if (o91Var != null) {
                o91Var.D(wifVar);
            }
        }
        if (this.o.Y && this.p != null) {
            if (this.u) {
                qpc qpcVar2 = this.o;
                if (qpcVar2.H != null && qpcVar2.H.signalingState() == PeerConnection.SignalingState.STABLE && qpcVar2.H.getRemoteDescription() == null) {
                    l("apply postponed remote sdp=" + this.p.type.canonicalForm() + " to just created " + qpcVar);
                    this.o.M(this.p);
                }
            } else {
                l("apply postponed remote sdp=" + this.p.type.canonicalForm() + " to just created " + qpcVar);
                this.o.M(this.p);
                this.p = null;
            }
        }
        this.o.u(this.t);
    }

    public final void j() {
        this.o.J = null;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sve sveVar = (sve) obj;
            dc9 dc9Var = this.o.C().n;
            if (sveVar == null) {
                dc9Var.getClass();
                ore.p("Illegal 'listener' value: null");
                return;
            }
            ((CopyOnWriteArrayList) dc9Var.c).remove(sveVar);
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            wve wveVar = (wve) obj2;
            z18 z18Var = this.o.C;
            if (z18Var == null) {
                ore.k("Notifications receiver is not enabled");
                return;
            } else {
                if (wveVar == null) {
                    ore.p("Illegal 'listener' value: null");
                    return;
                }
                ((CopyOnWriteArrayList) z18Var.c).remove(wveVar);
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            r81 r81Var = (r81) obj3;
            if (this.o.e != null) {
                ((CopyOnWriteArrayList) this.o.e.e).remove(r81Var);
            }
        }
        this.o.r(false);
    }

    @Override // defpackage.ppc
    public final void k(qpc qpcVar, IceCandidate[] iceCandidateArr) {
    }

    public final void l(String str) {
        this.e.log("UnifiedPeerConnection", str);
    }

    @Override // defpackage.ppc
    public final void m(qpc qpcVar, IceCandidate iceCandidate) {
    }

    @Override // defpackage.ppc
    public final void n(qpc qpcVar, SessionDescription sessionDescription) {
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.ANSWER;
        CidLogger cidLogger = this.e;
        if (type != type2) {
            cidLogger.reportException("UnifiedPeerConnection", "server.topology.producer.create.local.sdp", new Exception("answer.expected"));
            return;
        }
        String str = this.r;
        cidLogger.log("UnifiedPeerConnection", "sendRequestAcceptProducer," + this + ", sdp=" + sessionDescription.type.canonicalForm());
        try {
            q4g q4gVar = this.f;
            HashSet hashSet = this.h;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", sessionDescription.description);
            if (!hashSet.isEmpty()) {
                jSONObject.put("ssrcs", new JSONArray((Collection) hashSet));
            }
            if (str != null) {
                int length = str.length();
                int iCharCount = 0;
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (!Character.isWhitespace(iCodePointAt)) {
                        jSONObject.put("sessionId", str);
                        break;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            q4gVar.k(kql.b(jSONObject, "accept-producer"));
        } catch (JSONException unused) {
            cidLogger.reportException("PeerConnectionWrapperBase", "server.topology.send.accept.producer", new Exception("server.topology.send.accept.producer"));
        }
    }

    @Override // defpackage.ppc
    public final void o(qpc qpcVar, PeerConnection.IceConnectionState iceConnectionState) {
        this.e.log("UnifiedPeerConnection", "onPeerConnectionIceConnectionChange, " + qpcVar + " state=" + iceConnectionState);
        wif wifVar = this.i;
        if (wifVar.J()) {
            if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
                this.s.add(this.r);
                if (!this.k) {
                    this.f.k(kql.b(null, "request-realloc"));
                }
            }
            o91 o91Var = wifVar.m;
            if (o91Var != null) {
                o91Var.E(wifVar, iceConnectionState);
            }
        }
    }

    @Override // defpackage.n91
    public final void onIceCandidateAddFailed(n38 n38Var) {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onIceCandidateAddFailed(n38Var);
        }
    }

    @Override // defpackage.n91
    public final void onIceCandidateGatheringFailed(o38 o38Var) {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onIceCandidateGatheringFailed(o38Var);
        }
    }

    @Override // defpackage.n91
    public final void onIceRestart() {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onIceRestart();
        }
    }

    @Override // defpackage.n91
    public final void onLocalCandidateCreated(String str) {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onLocalCandidateCreated(str);
        }
    }

    @Override // defpackage.n91
    public final void onLocalSdpCreated(SessionDescription.Type type) {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onLocalSdpCreated(type);
        }
    }

    @Override // defpackage.n91
    public final void onNegotiationError(xbb xbbVar) {
        wbb wbbVar = xbbVar.a;
        String str = (wbbVar == wbb.b || wbbVar == wbb.a) ? "server.topology.create.sdp.failed" : "server.topology.set.sdp.failed";
        this.e.reportException("UnifiedPeerConnection", str, new Exception(str));
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onNegotiationError(xbbVar);
        }
    }

    @Override // defpackage.n91
    public final void onPeerConnectionIceGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState) {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onPeerConnectionIceGatheringStateChanged(iceGatheringState);
        }
    }

    @Override // defpackage.n91
    public final void onPeerConnectionSignalingStateChanged(PeerConnection.SignalingState signalingState) {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onPeerConnectionSignalingStateChanged(signalingState);
        }
    }

    @Override // defpackage.n91
    public final void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState, j42 j42Var) {
        wif wifVar = this.i;
        o91 o91Var = wifVar.m;
        if (o91Var != null) {
            o91Var.F(peerConnectionState);
        }
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onPeerConnectionStateChanged(peerConnectionState, wifVar);
        }
    }

    @Override // defpackage.n91
    public final void onRemoteCandidateReceived(String str) {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onRemoteCandidateReceived(str);
        }
    }

    @Override // defpackage.n91
    public final void onRemoteSdpReceived(SessionDescription.Type type) {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onRemoteSdpReceived(type);
        }
    }

    @Override // defpackage.n91
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        n91 n91Var = this.v;
        if (n91Var != null) {
            n91Var.onSelectedCandidatePairChanged(candidatePairChangeEvent);
        }
    }

    public final void p(int i) {
        if (i == 0) {
            return;
        }
        if (i == 2) {
            this.w = true;
            return;
        }
        if (this.m) {
            if (!this.k) {
                this.f.k(kql.b(null, "request-realloc"));
            }
        } else if (i == 1 && this.w) {
            this.w = false;
        } else {
            this.e.log("UnifiedPeerConnection", "sendRequestAllocConsumer," + this + ", sdp=null");
            try {
                q4g q4gVar = this.f;
                tif tifVar = this.l;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiProtocol.PARAM_CAPABILITIES, kql.c(tifVar));
                q4gVar.k(kql.b(jSONObject, "allocate-consumer"));
            } catch (JSONException unused) {
                this.e.reportException("PeerConnectionWrapperBase", "server.topology.send.alloc.consumer", new Exception("server.topology.send.alloc.consumer"));
            }
        }
        qpc qpcVar = this.o;
        if (qpcVar.V || qpcVar.U || qpcVar.H != null) {
            return;
        }
        this.g.h.f = false;
        if (this.o.F()) {
            return;
        }
        this.o.A(this.a.c ? this.i.v() : Collections.EMPTY_LIST);
    }

    public final void q(g9i g9iVar) {
        d5f d5fVar = this.o.d;
        if (d5fVar == null || d5fVar.g) {
            return;
        }
        d5fVar.i = Collections.unmodifiableSet((HashSet) g9iVar.a);
        Iterator it = d5fVar.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!d5fVar.i.contains(entry.getKey())) {
                bak bakVar = (bak) entry.getValue();
                if (bakVar != null) {
                    bakVar.a();
                }
                it.remove();
            }
        }
    }
}
