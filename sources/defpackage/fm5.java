package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.IceCandidate;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes3.dex */
public final class fm5 extends j42 implements n4g, ppc, NetworkMonitor.NetworkObserver, n91 {
    public final oki A;
    public final zzf B;
    public final ExecutorService C;
    public final HashMap D;
    public final HashMap E;
    public final HashMap F;
    public final ch G;
    public final HashMap H;
    public final HashMap I;
    public final vn7 J;
    public final cmf K;
    public final wve L;
    public final ykc M;
    public boolean N;
    public final n91 O;
    public boolean P;
    public final boolean Q;
    public final boolean R;
    public boolean S;
    public final cmf T;
    public final xoc U;
    public final cm5 V;
    public final cm5 W;
    public final boolean X;
    public boolean Y;
    public final nl y;
    public final Context z;

    /* JADX WARN: Multi-variable type inference failed */
    public fm5(em5 em5Var) {
        String str;
        super(em5Var.h, em5Var.g, em5Var.j, em5Var.k, em5Var.l, em5Var.b, em5Var.p, em5Var.q, null, em5Var.s, em5Var.x, em5Var.y, em5Var.i, em5Var.z);
        this.D = new HashMap();
        this.E = new HashMap();
        this.F = new HashMap();
        this.H = new HashMap();
        this.I = new HashMap();
        this.N = true;
        this.V = new cm5(this, 1);
        this.W = new cm5(this, 2);
        Y(this + " ctor");
        this.T = em5Var.w;
        this.J = em5Var.n;
        this.m = em5Var.t;
        this.U = em5Var.A;
        o91 o91Var = em5Var.u;
        this.Y = em5Var.B;
        this.K = new cmf(o91Var);
        this.O = em5Var.v;
        this.G = new ch(em5Var.k);
        this.z = em5Var.e;
        this.B = em5Var.a;
        this.C = em5Var.d;
        this.A = em5Var.c;
        this.X = em5Var.m;
        this.y = em5Var.o;
        this.w.k.add(this);
        this.L = em5Var.r;
        v88 v88Var = this.d.r;
        boolean z = v88Var.P;
        this.R = z;
        this.Q = z || v88Var.N;
        for (du1 du1Var : this.j.j()) {
            if (!du1Var.t) {
                this.D.put(du1Var.a, e0());
            }
        }
        co0 co0Var = this.d.u;
        ao0 ao0Var = co0Var.d;
        ykc ykcVar = this.M;
        ykc ykcVar2 = null;
        if (ykcVar != null) {
            ykcVar.f.invoke("stop reporter");
            vx8 vx8Var = ykcVar.g;
            if (vx8Var != null) {
                oo5.a(vx8Var);
            }
            ykcVar.g = null;
            ykcVar.h = null;
        }
        y3e y3eVar = this.e;
        nv4 nv4Var = new nv4(5, this);
        w14 w14Var = new w14(this, 14, ao0Var);
        y3eVar.getClass();
        vke vkeVar = co0Var.b;
        if (vkeVar != null) {
            iaa iaaVar = new iaa(co0Var, 23, y3eVar);
            n81 n81Var = co0Var.a;
            ykcVar2 = new ykc(vkeVar, n81Var != null ? new uii(n81Var, iaaVar) : new px8(), y3eVar, nv4Var, w14Var, iaaVar);
        }
        this.M = ykcVar2;
        if (ykcVar2 != null) {
            z2f z2fVarA = th.a();
            ykcVar2.f.invoke("start reporter");
            vx8 vx8Var2 = ykcVar2.g;
            if (vx8Var2 != null) {
                oo5.a(vx8Var2);
            }
            ykcVar2.h = z2fVarA;
            long j = ykcVar2.a.b;
            vqb vqbVarE = fqb.a(j, j, TimeUnit.MILLISECONDS, i3f.a()).e(z2fVarA);
            fpi fpiVar = new fpi(5, ykcVar2);
            c4h c4hVar = new c4h(8, ykcVar2);
            vx8 vx8Var3 = new vx8(new eth(ykcVar2), new oki(ykcVar2));
            try {
                try {
                    try {
                        try {
                            vqbVarE.f(new wqb(new rqb(vx8Var3, c4hVar, 1), fpiVar));
                            ykcVar2.g = vx8Var3;
                        } catch (NullPointerException e) {
                            throw e;
                        } catch (Throwable th) {
                            iwl.a(th);
                            tre.s0(th);
                            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                            nullPointerException.initCause(th);
                            throw nullPointerException;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = vqbVarE;
                        iwl.a(th);
                        tre.s0(th);
                        NullPointerException nullPointerException2 = new NullPointerException(str);
                        nullPointerException2.initCause(th);
                        throw nullPointerException2;
                    }
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } catch (Throwable th3) {
                th = th3;
                str = "Actually not, but can't throw other exceptions due to RS";
                iwl.a(th);
                tre.s0(th);
                NullPointerException nullPointerException3 = new NullPointerException(str);
                nullPointerException3.initCause(th);
                throw nullPointerException3;
            }
        }
        NetworkMonitor.getInstance().addObserver(this);
    }

    public static yt1 d0(qpc qpcVar, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == qpcVar) {
                return (yt1) entry.getKey();
            }
        }
        return null;
    }

    @Override // defpackage.j42
    public final void A(wig wigVar) {
        uza.d();
        for (Map.Entry entry : this.E.entrySet()) {
            yt1 yt1Var = (yt1) entry.getKey();
            qpc qpcVar = (qpc) entry.getValue();
            oo ooVar = new oo(this, yt1Var, wigVar, 5);
            qpcVar.getClass();
            qpcVar.j(new bjk(qpcVar, new bm5(qpcVar, 3, ooVar), 1));
        }
    }

    @Override // defpackage.j42
    public final String B() {
        return "DirectCallTopology";
    }

    @Override // defpackage.j42
    public final void C(yt1 yt1Var, List list, boolean z, u81 u81Var) {
        try {
            this.w.j(kql.q(yt1Var, list, z), u81Var);
        } catch (JSONException unused) {
            this.e.logException("DirectCallTopology", "direct.topology.send.grantRoles", new Exception("direct.topology.send.grantRoles"));
        }
    }

    @Override // defpackage.j42
    public final void D() {
        t("handleIceApplyPermissionChanged, " + this + ", isPermitted=true");
        this.G.b = true;
        i0();
    }

    @Override // defpackage.j42
    public final void E(du1 du1Var) {
        W(2);
        yt1 yt1Var = du1Var.a;
        HashMap map = this.D;
        qpc qpcVar = (qpc) map.get(yt1Var);
        if (qpcVar != null) {
            qpcVar.r(true);
        }
        yt1 yt1Var2 = du1Var.a;
        HashMap map2 = this.E;
        qpc qpcVar2 = (qpc) map2.get(yt1Var2);
        if (qpcVar2 != null) {
            qpcVar2.r(true);
        }
        map.remove(du1Var.a);
        map2.remove(du1Var.a);
    }

    @Override // defpackage.j42
    public final void F(du1 du1Var) {
        this.D.put(du1Var.a, e0());
        List listV = v();
        for (qpc qpcVar : this.D.values()) {
            if (!qpcVar.F() && !qpcVar.V) {
                qpcVar.A(listV);
            }
        }
        if (this.Y) {
            s(true);
        }
        W(1);
    }

    @Override // defpackage.j42
    public final void G(int i) {
        Y("handleStateChanged, " + this + ", state=" + j42.z(i));
        boolean zJ = J();
        q4g q4gVar = this.w;
        if (zJ) {
            this.e.log("DirectCallTopology", "enable processing signaling replies in " + j42.z(i) + " state");
            q4gVar.k.add(this);
            b0(this.q);
        } else {
            c0("disable processing signaling replies in " + j42.z(i) + " state");
            q4gVar.i(this);
        }
        h0();
        if (this.Q) {
            i0();
        }
    }

    @Override // defpackage.j42
    public final void H(c91 c91Var, w81 w81Var) throws JSONException {
        HashMap map = this.D;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((qpc) it.next()).r(true);
        }
        HashMap map2 = this.E;
        Iterator it2 = map2.values().iterator();
        while (it2.hasNext()) {
            ((qpc) it2.next()).r(true);
        }
        map.clear();
        map2.clear();
        T(true, null, c91Var, w81Var);
    }

    @Override // defpackage.j42
    public final boolean K() {
        return this.P;
    }

    @Override // defpackage.j42
    public final void M(yt1 yt1Var, dnf dnfVar, boolean z, v81 v81Var) {
        try {
            this.w.j(kql.r(yt1Var, dnfVar, z), v81Var);
        } catch (JSONException unused) {
            this.e.logException("DirectCallTopology", "direct.topology.send.pinParticipant", new Exception("direct.topology.send.pinParticipant"));
        }
    }

    @Override // defpackage.j42
    public final void N() {
        if (this.R) {
            this.S = true;
        }
    }

    @Override // defpackage.j42
    public final void O() {
        HashMap map = this.E;
        c0(this + " release");
        NetworkMonitor.getInstance().removeObserver(this);
        this.a.removeCallbacksAndMessages(null);
        this.w.i(this);
        HashMap map2 = this.D;
        for (qpc qpcVar : map2.values()) {
            qpcVar.J = null;
            qpcVar.r(true);
        }
        for (qpc qpcVar2 : map.values()) {
            qpcVar2.J = null;
            qpcVar2.r(true);
        }
        map2.clear();
        map.clear();
        this.F.clear();
        ((HashMap) this.G.c).clear();
        this.H.clear();
        this.I.clear();
        ykc ykcVar = this.M;
        if (ykcVar != null) {
            ykcVar.f.invoke("stop reporter");
            vx8 vx8Var = ykcVar.g;
            if (vx8Var != null) {
                oo5.a(vx8Var);
            }
            ykcVar.g = null;
            ykcVar.h = null;
        }
        super.O();
    }

    @Override // defpackage.j42
    public final void S(final jkg jkgVar) {
        uza.d();
        for (Map.Entry entry : this.E.entrySet()) {
            qpc qpcVar = (qpc) entry.getValue();
            final yt1 yt1Var = (yt1) entry.getKey();
            if (jkgVar instanceof vig) {
                jkg jkgVar2 = new jkg() { // from class: dm5
                    @Override // defpackage.jkg
                    public final void a(b1k b1kVar) {
                        fm5 fm5Var = this.a;
                        fm5Var.a.post(new h82(fm5Var, b1kVar, fm5Var.T.m(b1kVar), yt1Var, jkgVar, 3));
                    }
                };
                qpcVar.getClass();
                qpcVar.j(new bjk(qpcVar, new pg4(3, jkgVar2), 1));
            } else {
                qpcVar.getClass();
                qpcVar.j(new bjk(qpcVar, new pg4(3, jkgVar), 1));
            }
        }
    }

    @Override // defpackage.j42
    public final boolean U(List list) {
        Y("setIceServers, " + this);
        if (!super.U(list)) {
            return false;
        }
        this.u.f("dct.setIceServers");
        List listV = v();
        if (this.R) {
            for (qpc qpcVar : this.D.values()) {
                if (!qpcVar.F() && !qpcVar.V) {
                    this.u.f("dct.pc.requested");
                    qpcVar.A(listV);
                }
            }
        } else {
            for (qpc qpcVar2 : this.E.values()) {
                qpcVar2.w.log("PeerConnectionClient", "setConfig, servers=" + listV + ", " + qpcVar2);
                qpcVar2.j(new bjk(qpcVar2, new bm5(qpcVar2, 5, listV), 1));
            }
        }
        return true;
    }

    @Override // defpackage.j42
    public final void V(x52 x52Var, List list) {
        Y("setRemoteVideoRenderers, " + this + ", " + x52Var);
        uza.d();
        qpc qpcVar = (qpc) this.E.get(x52Var.b);
        if (qpcVar == null) {
            c0("peer connection not found for " + x52Var);
            return;
        }
        String str = (String) this.F.get(x52Var.b);
        if (!TextUtils.isEmpty(str)) {
            qpcVar.b0.n(str, x52Var, list);
            return;
        }
        c0(this + ": video track not found for " + x52Var);
    }

    @Override // defpackage.j42
    public final void X(boolean z) {
        this.P = z;
        Iterator it = this.D.values().iterator();
        while (it.hasNext()) {
            ((qpc) it.next()).getClass();
        }
        Iterator it2 = this.E.values().iterator();
        while (it2.hasNext()) {
            ((qpc) it2.next()).getClass();
        }
    }

    @Override // defpackage.j42
    public final void Z(c91 c91Var, w81 w81Var) throws JSONException {
        T(false, null, new bm5(this, 0, c91Var), w81Var);
    }

    @Override // defpackage.ppc
    public final void a(qpc qpcVar) {
        Y("onPeerConnectionRenegotiationNeeded, " + this + ", " + qpcVar);
    }

    @Override // defpackage.ppc
    public final void b(String str) {
    }

    @Override // defpackage.j42
    public final void b0(vpc vpcVar) {
        Iterator it = this.E.entrySet().iterator();
        while (it.hasNext()) {
            qpc qpcVar = (qpc) ((Map.Entry) it.next()).getValue();
            if (qpcVar != null) {
                qpcVar.L(vpcVar);
                return;
            }
        }
    }

    @Override // defpackage.ppc
    public final void c(qpc qpcVar, String str) {
        yt1 yt1Var;
        Y("onPeerConnectionRemoteVideoTrackAdded, " + this + ", track=" + str + ", " + qpcVar);
        du1 du1VarX = x(d0(qpcVar, this.E));
        if (du1VarX == null || (yt1Var = du1VarX.a) == null) {
            c0(this + ": participant not found for " + uza.b(qpcVar));
            return;
        }
        this.F.put(yt1Var, str);
        yt1 yt1Var2 = du1VarX.a;
        oki okiVar = this.A;
        if (okiVar.g()) {
            Map remoteVideoRenderers = okiVar.getRemoteVideoRenderers(yt1Var2);
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
        Y("onPeerConnectionSignalingState, " + this + " state=" + signalingState + ", " + qpcVar);
        du1 du1VarX = x(d0(qpcVar, this.E));
        if (du1VarX != null) {
            this.G.b(du1VarX, qpcVar);
        }
    }

    @Override // defpackage.ppc
    public final void e(qpc qpcVar, long j) {
        yt1 yt1VarD0 = d0(qpcVar, this.D);
        if (yt1VarD0 == null) {
            yt1VarD0 = d0(qpcVar, this.E);
        }
        if (yt1VarD0 != null) {
            du1 du1VarX = x(yt1VarD0);
            o91 o91Var = this.m;
            if (o91Var == null || du1VarX == null) {
                return;
            }
            o91Var.Q0.b.onCallParticipantFingerprint(du1VarX, j);
        }
    }

    public final qpc e0() {
        t("> createPeerConnectionClient, " + this);
        opc opcVar = new opc();
        opcVar.a = this.B;
        opcVar.b = this.g;
        opcVar.c = this.C;
        opcVar.e = this.z;
        opcVar.f = this.e;
        xt1 xt1Var = this.d;
        opcVar.d = xt1Var;
        opcVar.p = this.X;
        opcVar.u = this.J;
        opcVar.m = xt1Var.l;
        opcVar.n = xt1Var.m;
        opcVar.o = xt1Var.n;
        v88 v88Var = xt1Var.r;
        opcVar.r = v88Var.x;
        opcVar.s = v88Var.d;
        nl nlVar = this.y;
        opcVar.w = new hm(nlVar, nlVar.e);
        opcVar.v = new an(nlVar, nlVar.e, null);
        nlVar.c.getClass();
        opcVar.G = 4;
        opcVar.y = this.n;
        opcVar.A = PeerConnection.IceTransportsType.NOHOST;
        v88 v88Var2 = xt1Var.r;
        Integer numM = v88Var2.m();
        if (numM == null) {
            numM = 1;
            if (!v88Var2.n()) {
                numM = null;
            }
        }
        opcVar.F = numM;
        opcVar.B = xt1Var.r.m;
        opcVar.z = this.r;
        opcVar.C = this;
        opcVar.t = false;
        opcVar.D = this.u;
        opcVar.E = this.v;
        qpc qpcVarA = opcVar.a();
        qpcVarA.J = this;
        qpcVarA.H = null;
        qpcVarA.I = false;
        qpcVarA.L = null;
        qpcVarA.M = null;
        qpcVarA.N = null;
        qpcVarA.P = null;
        qpcVarA.j(new dpc(qpcVarA, 3));
        t("< createPeerConnectionClient, " + this);
        return qpcVarA;
    }

    public final void f0(du1 du1Var) {
        SessionDescription sessionDescription;
        Y("maybeProcessRemoteAnswers, for " + du1Var);
        if (!du1Var.c()) {
            c0(du1Var + " still not accepted call");
            return;
        }
        v3k v3kVar = (v3k) this.I.get(du1Var.a);
        if (v3kVar != null) {
            HashMap map = v3kVar.a;
            if (!v3kVar.e || (sessionDescription = (SessionDescription) map.get(du1Var.k)) == null) {
                return;
            }
            StringBuilder sb = new StringBuilder("Found answer for ");
            sb.append(du1Var);
            sb.append(", peerid=");
            this.e.log("DirectCallTopology", zo5.w(sb, du1Var.k.a, ", apply it"));
            v3kVar.c = sessionDescription;
            map.clear();
            ((qpc) this.E.get(du1Var.a)).M(sessionDescription);
        }
    }

    @Override // defpackage.ppc
    public final void g() {
        bw6 bw6Var = this.f;
        if (bw6Var != null && !bw6Var.b()) {
            bw6Var.c();
        }
        this.K.l(new bwh(this.s, 2));
        this.a.removeCallbacks(this.W);
    }

    public final void g0(qpc qpcVar, PeerConnection.IceConnectionState iceConnectionState) {
        Y("maybeRestart, " + this);
        if (!J()) {
            c0(this + ": is not active yet");
            return;
        }
        if (!NetworkMonitor.isOnline()) {
            c0("No net connectivity");
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            t(qpcVar + " has " + iceConnectionState + " state");
            if (!qpcVar.F() || !qpcVar.Y) {
                c0(qpcVar + " not ready or not stable");
                return;
            }
            v3k v3kVar = (v3k) this.I.get(d0(qpcVar, this.E));
            if (v3kVar == null || v3kVar.d) {
                return;
            }
            v88 v88Var = this.d.r;
            if (v88Var.R && !this.P) {
                c0("Ice failed, wait until recover");
                return;
            }
            if (!v88Var.L || this.P) {
                c0("Ice failed, restart with offer" + qpcVar);
                v3kVar.d = true;
                v3kVar.e = false;
                v3kVar.c = null;
                v3kVar.a.clear();
                qpcVar.z(true);
                return;
            }
            c0("Ice failed, restart " + qpcVar);
            qpcVar.w.log("PeerConnectionClient", "restartIce, " + qpcVar);
            qpcVar.r.post(new dpc(qpcVar, 2));
            qpcVar.j(new bjk(qpcVar, new rs4(1), 1));
        }
    }

    @Override // defpackage.ppc
    public final void h(qpc qpcVar, SessionDescription sessionDescription) {
        Y("onPeerConnectionRemoteDescription, " + this + ", type=" + sessionDescription.type + ", " + qpcVar);
        yt1 yt1VarD0 = d0(qpcVar, this.E);
        if (sessionDescription.type != SessionDescription.Type.OFFER || this.H.get(yt1VarD0) == null) {
            return;
        }
        qpcVar.y();
    }

    public final void h0() {
        Y("maybeCreateConnection, " + this);
        if (!J() && !this.Q) {
            this.e.log("DirectCallTopology", this + ": is not active yet");
            return;
        }
        List listV = v();
        for (qpc qpcVar : this.D.values()) {
            if (!qpcVar.F() && !qpcVar.V) {
                qpcVar.A(listV);
            }
        }
        k0();
        j0();
    }

    @Override // defpackage.ppc
    public final void i(qpc qpcVar) {
        o91 o91Var;
        Y("onPeerConnectionCreated, " + this + ", " + qpcVar);
        HashMap map = this.D;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == qpcVar) {
                map.remove(entry.getKey());
                if (this.q != null) {
                    ((qpc) entry.getValue()).L(this.q);
                }
                this.E.put((yt1) entry.getKey(), (qpc) entry.getValue());
                if (!this.S) {
                    break;
                }
                Object key = entry.getKey();
                HashMap map2 = this.I;
                if (!map2.containsKey(key)) {
                    map2.put((yt1) entry.getKey(), new v3k(null, true));
                    k0();
                    break;
                }
                break;
            }
        }
        h0();
        if (map.size() != 0 || (o91Var = this.m) == null) {
            return;
        }
        o91Var.D(this);
    }

    public final void i0() {
        ch chVar = this.G;
        if (chVar.b && J()) {
            for (Map.Entry entry : this.E.entrySet()) {
                du1 du1VarX = x((yt1) entry.getKey());
                if (du1VarX != null) {
                    chVar.b(du1VarX, (qpc) entry.getValue());
                }
            }
        }
    }

    public final void j0() {
        qpc qpcVar;
        Y("maybeProcessSelfAnswers");
        if (!J() && !this.Q) {
            c0(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.H.entrySet()) {
            yt1 yt1Var = (yt1) entry.getKey();
            v3k v3kVar = (v3k) entry.getValue();
            if (v3kVar.b == null) {
                c.q(yt1Var, "Offer not found for participant=");
                return;
            }
            if (!v3kVar.d && !v3kVar.e && (qpcVar = (qpc) this.E.get(yt1Var)) != null) {
                this.e.log("DirectCallTopology", this + ": start processing scheduled answer for participant=" + yt1Var);
                v3kVar.d = true;
                qpcVar.M(v3kVar.b);
            }
        }
    }

    @Override // defpackage.ppc
    public final void k(qpc qpcVar, IceCandidate[] iceCandidateArr) {
        Y("onPeerConnectionIceCandidatesRemoved, " + this + ", " + qpcVar);
        yt1 yt1VarD0 = d0(qpcVar, this.E);
        StringBuilder sb = new StringBuilder("sendRemovedIceCandidatesRequest, participant=");
        sb.append(yt1VarD0);
        Y(sb.toString());
        try {
            this.w.k(kql.t(yt1VarD0, iceCandidateArr));
        } catch (JSONException unused) {
            this.e.logException("DirectCallTopology", "direct.topology.send.remove.ice", new Exception("direct.topology.create.remove.ice.request"));
        }
    }

    public final void k0() {
        qpc qpcVar;
        Y("maybeProcessSelfOffers");
        if (!J() && !this.R) {
            c0(this + ": is not active yet");
            return;
        }
        for (Map.Entry entry : this.I.entrySet()) {
            yt1 yt1Var = (yt1) entry.getKey();
            v3k v3kVar = (v3k) entry.getValue();
            if (!v3kVar.d && !v3kVar.e && (qpcVar = (qpc) this.E.get(yt1Var)) != null) {
                this.e.log("DirectCallTopology", this + ": start processing scheduled offer for participant=" + yt1Var);
                v3kVar.d = true;
                v3kVar.a.clear();
                v3kVar.c = null;
                qpcVar.z(false);
            }
        }
    }

    @Override // defpackage.ppc
    public final void m(qpc qpcVar, IceCandidate iceCandidate) {
        if (this.P) {
            return;
        }
        Y("onPeerConnectionIceCandidate, " + this + ", " + qpcVar);
        yt1 yt1VarD0 = d0(qpcVar, this.E);
        Y("sendIceCandidateRequest, participant=" + yt1VarD0 + ", candidate=" + iceCandidate);
        try {
            this.w.k(kql.s(yt1VarD0, iceCandidate));
        } catch (JSONException unused) {
            this.e.logException("DirectCallTopology", "direct.topology.send.add.ice", new Exception("direct.topology.create.add.ice.request"));
        }
    }

    @Override // defpackage.ppc
    public final void n(qpc qpcVar, SessionDescription sessionDescription) {
        o91 o91Var;
        Y("onPeerConnectionLocalDescription, " + this + ", type=" + sessionDescription.type + ", " + qpcVar);
        yt1 yt1VarD0 = d0(qpcVar, this.E);
        du1 du1VarX = x(yt1VarD0);
        if (du1VarX == null) {
            this.e.logException("DirectCallTopology", "local.sdp.npe", new Exception("set.local.sdp.for.died.participant"));
            return;
        }
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type == type2) {
            v3k v3kVar = (v3k) this.I.get(yt1VarD0);
            if (v3kVar == null) {
                c.t();
                return;
            } else {
                v3kVar.d = false;
                v3kVar.e = true;
            }
        } else {
            v3k v3kVar2 = (v3k) this.H.get(yt1VarD0);
            if (v3kVar2 == null) {
                c.t();
                return;
            } else {
                v3kVar2.d = false;
                v3kVar2.e = true;
            }
        }
        Y("sendOfferAnswerRequest, participant=" + yt1VarD0 + ", sdp type=" + sessionDescription.type.canonicalForm());
        boolean z = this.d.r.x;
        woc wocVarL = ((ae7) this.U).l();
        try {
            this.w.k(kql.b(kql.j(yt1VarD0, sessionDescription, this.P, wocVarL == null ? null : wocVarL.a, z ? 1 : 0), "transmit-data"));
            if (sessionDescription.type != type2 || (o91Var = this.m) == null) {
                return;
            }
            o91Var.N.log("OKRTCCall", "handleTopologyOfferCreated, " + this + ", " + du1VarX + ", sdp=" + sessionDescription.type);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("sdp ");
            sb.append(sessionDescription.type);
            String str = sessionDescription.description;
            sb.append(" ");
            sb.append(str);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // defpackage.ppc
    public final void o(qpc qpcVar, PeerConnection.IceConnectionState iceConnectionState) {
        Y("onPeerConnectionIceConnectionChange, " + this + ", state=" + iceConnectionState + ", " + qpcVar);
        g0(qpcVar, iceConnectionState);
        o91 o91Var = this.m;
        if (o91Var != null) {
            o91Var.E(this, iceConnectionState);
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED) {
            Runnable runnable = this.c;
            Handler handler = this.a;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            cm5 cm5Var = this.W;
            handler.removeCallbacks(cm5Var);
            if (this.N) {
                this.K.l(new bwh(this.t, 3));
                wt1 wt1Var = this.d.b;
                handler.postDelayed(cm5Var, 12000L);
            }
            ((gsh) this.n).getClass();
            this.s = SystemClock.elapsedRealtime();
            this.N = false;
        }
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantUpdated(x91 x91Var) {
        Collection collection = x91Var.a;
        List list = Collections.EMPTY_LIST;
        du1 du1Var = x91Var.e;
        onActiveParticipantsRemoved(new w91(collection, list, du1Var));
        Collection collection2 = x91Var.b;
        onActiveParticipantsAdded(new t91(collection2, collection2, du1Var));
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantsAdded(t91 t91Var) {
        StringBuilder sb = new StringBuilder("onCallParticipantsAdded, ");
        sb.append(this);
        sb.append(", ");
        Collection<du1> collection = t91Var.a;
        sb.append(collection.size());
        Y(sb.toString());
        for (du1 du1Var : collection) {
            yt1 yt1Var = du1Var.a;
            HashMap map = this.D;
            if (map.get(yt1Var) != null || this.E.get(du1Var.a) != null) {
                c.q(du1Var, "Peer connection is already created for ");
                return;
            }
            map.put(du1Var.a, e0());
        }
        h0();
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantsChanged(u91 u91Var) {
        StringBuilder sb = new StringBuilder("onCallParticipantsChanged, ");
        List<du1> list = u91Var.a;
        sb.append(list.size());
        Y(sb.toString());
        for (du1 du1Var : list) {
            qpc qpcVar = (qpc) this.E.get(du1Var.a);
            if (qpcVar != null) {
                f0(du1Var);
                this.G.b(du1Var, qpcVar);
            }
        }
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantsDeAnonimized(v91 v91Var) {
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantsRemoved(w91 w91Var) {
        StringBuilder sb = new StringBuilder("onCallParticipantsRemoved, ");
        sb.append(this);
        sb.append(", ");
        Collection<du1> collection = w91Var.a;
        sb.append(collection.size());
        Y(sb.toString());
        for (du1 du1Var : collection) {
            qpc qpcVar = (qpc) this.D.remove(du1Var.a);
            if (qpcVar == null) {
                qpcVar = (qpc) this.E.remove(du1Var.a);
            }
            if (qpcVar != null) {
                qpcVar.J = null;
                qpcVar.r(true);
            }
            this.F.remove(du1Var.a);
            this.H.remove(du1Var.a);
            this.I.remove(du1Var.a);
            ((HashMap) this.G.c).remove(du1Var);
        }
    }

    @Override // org.webrtc.NetworkMonitor.NetworkObserver
    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        Y("onConnectionTypeChanged, " + this + ", type=" + connectionType);
        if (connectionType != NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
            this.a.post(new cm5(this, 0));
        } else {
            this.e.log("DirectCallTopology", "Don't even try to restart ICE when connection type is " + connectionType);
        }
    }

    @Override // defpackage.n91
    public final void onIceCandidateAddFailed(n38 n38Var) {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onIceCandidateAddFailed(n38Var);
        }
    }

    @Override // defpackage.n91
    public final void onIceCandidateGatheringFailed(o38 o38Var) {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onIceCandidateGatheringFailed(o38Var);
        }
    }

    @Override // defpackage.n91
    public final void onIceRestart() {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onIceRestart();
        }
    }

    @Override // defpackage.n91
    public final void onLocalCandidateCreated(String str) {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onLocalCandidateCreated(str);
        }
    }

    @Override // defpackage.n91
    public final void onLocalSdpCreated(SessionDescription.Type type) {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onLocalSdpCreated(type);
        }
    }

    @Override // defpackage.n91
    public final void onNegotiationError(xbb xbbVar) {
        wbb wbbVar = xbbVar.a;
        String str = (wbbVar == wbb.b || wbbVar == wbb.a) ? "direct.topology.create.sdp.failed" : "direct.topology.set.sdp.failed";
        StringBuilder sbZ = zo5.z(str, ", ");
        sbZ.append(xbbVar.b);
        this.e.reportException("DirectCallTopology", str, new Exception(sbZ.toString()));
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onNegotiationError(xbbVar);
        }
    }

    @Override // defpackage.n91
    public final void onPeerConnectionIceGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState) {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onPeerConnectionIceGatheringStateChanged(iceGatheringState);
        }
    }

    @Override // defpackage.n91
    public final void onPeerConnectionSignalingStateChanged(PeerConnection.SignalingState signalingState) {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onPeerConnectionSignalingStateChanged(signalingState);
        }
    }

    @Override // defpackage.n91
    public final void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState, j42 j42Var) {
        o91 o91Var = this.m;
        if (o91Var != null) {
            o91Var.F(peerConnectionState);
        }
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onPeerConnectionStateChanged(peerConnectionState, this);
        }
    }

    @Override // defpackage.n91
    public final void onRemoteCandidateReceived(String str) {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onRemoteCandidateReceived(str);
        }
    }

    @Override // defpackage.n91
    public final void onRemoteSdpReceived(SessionDescription.Type type) {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onRemoteSdpReceived(type);
        }
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) throws JSONException {
        String string;
        ArrayList arrayList;
        String str;
        String string2 = jSONObject.getString("notification");
        string2.getClass();
        int i = 0;
        switch (string2) {
            case "custom-data":
                co0 co0Var = this.d.u;
                ao0 ao0Var = co0Var.d;
                boolean z = co0Var.c.a;
                final ykc ykcVar = this.M;
                if (!z || ykcVar == null) {
                    StringBuilder sb = new StringBuilder("enabled && reporter != null = ");
                    sb.append(z);
                    sb.append(" && ");
                    sb.append(ykcVar != null);
                    string = sb.toString();
                } else {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject != null) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sdk");
                        if (jSONObjectOptJSONObject2 == null) {
                            string = "no sdk";
                        } else if (jSONObjectOptJSONObject2.optString("type").equals("bad-net")) {
                            final double dOptDouble = jSONObjectOptJSONObject2.optDouble("bitrate");
                            ykcVar.f.invoke("submit bitrate: " + dOptDouble);
                            z2f z2fVar = ykcVar.h;
                            if (z2fVar != null) {
                                z2fVar.b(new Runnable() { // from class: ukc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ykcVar.b.d(dOptDouble);
                                    }
                                });
                            }
                            string = "received bad-net: " + jSONObjectOptJSONObject2;
                        } else {
                            string = "type != bad-net";
                        }
                    } else {
                        string = "no data";
                    }
                }
                ao0Var.b(this.e, "DirectCallTopology", "handleCustomDataNotification: ".concat(string));
                break;
            case "transmitted-data":
                y3e y3eVar = this.e;
                yt1 yt1VarW = kql.w(jSONObject);
                du1 du1VarX = x(yt1VarW);
                if (du1VarX == null) {
                    y3eVar.reportException("DirectCallTopology", "transmitted.data.npe", new Exception("td.unknown.participant.in.p2p"));
                    break;
                } else {
                    JSONObject jSONObjectOptJSONObject3 = jSONObject.getJSONObject("data").optJSONObject("sdp");
                    SessionDescription sessionDescription = jSONObjectOptJSONObject3 != null ? new SessionDescription(SessionDescription.Type.fromCanonicalForm(jSONObjectOptJSONObject3.getString("type")), jSONObjectOptJSONObject3.getString("sdp")) : null;
                    if (sessionDescription == null) {
                        ch chVar = this.G;
                        qpc qpcVar = (qpc) this.E.get(yt1VarW);
                        y3e y3eVar2 = (y3e) chVar.d;
                        HashMap map = (HashMap) chVar.c;
                        y3eVar2.log("IceCandidatesHandler", "handleTransmittedData, " + du1VarX);
                        bpc bpcVarO = kql.o(jSONObject);
                        if (bpcVarO != null) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("candidate");
                            IceCandidate iceCandidate = jSONObjectOptJSONObject4 != null ? new IceCandidate(jSONObjectOptJSONObject4.getString("sdpMid"), jSONObjectOptJSONObject4.getInt("sdpMLineIndex"), jSONObjectOptJSONObject4.getString("candidate")) : null;
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("candidates-removed");
                            if (jSONArrayOptJSONArray == null) {
                                arrayList = null;
                            } else {
                                ArrayList arrayList2 = new ArrayList(jSONArrayOptJSONArray.length());
                                while (i < jSONArrayOptJSONArray.length()) {
                                    JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                                    arrayList2.add(jSONObject3 != null ? new IceCandidate(jSONObject3.getString("sdpMid"), jSONObject3.getInt("sdpMLineIndex"), jSONObject3.getString("candidate")) : null);
                                    i++;
                                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                                }
                                arrayList = arrayList2;
                            }
                            if (iceCandidate != null || arrayList != null) {
                                if (iceCandidate != null && (str = iceCandidate.sdp) != null) {
                                    onRemoteCandidateReceived(str);
                                }
                                Map map2 = (Map) map.get(du1VarX);
                                if (map2 == null) {
                                    map2 = new HashMap();
                                    map.put(du1VarX, map2);
                                }
                                ylc ylcVar = (ylc) map2.get(bpcVarO);
                                if (ylcVar == null) {
                                    ylcVar = new ylc(new ArrayList(), new ArrayList());
                                    map2.put(bpcVarO, ylcVar);
                                }
                                if (iceCandidate != null) {
                                    ((List) ylcVar.a).add(iceCandidate);
                                }
                                if (arrayList != null) {
                                    ((List) ylcVar.b).addAll(arrayList);
                                }
                                chVar.b(du1VarX, qpcVar);
                            }
                        } else {
                            ((y3e) chVar.d).log("IceCandidatesHandler", "No peer specified for " + du1VarX);
                        }
                    } else {
                        onRemoteSdpReceived(sessionDescription.type);
                        if (sessionDescription.type == SessionDescription.Type.ANSWER) {
                            v3k v3kVar = (v3k) this.I.get(yt1VarW);
                            if (v3kVar == null) {
                                StringBuilder sb2 = new StringBuilder("no.scheduled.offer.found");
                                if (this.H.get(yt1VarW) != null) {
                                    sb2.append(".but.answer.found");
                                }
                                y3eVar.logException("DirectCallTopology", "answer.invariant", new Exception(sb2.toString()));
                            } else if (!v3kVar.e) {
                                y3eVar.logException("DirectCallTopology", "direct.topology.no.offer.for.answer", new Exception("offer.is.not.ready.yet"));
                            } else if (v3kVar.c != null) {
                                this.e.log("DirectCallTopology", "Answer was already applied from " + du1VarX);
                            } else {
                                bpc bpcVarO2 = kql.o(jSONObject);
                                if (bpcVarO2 == null) {
                                    this.e.log("DirectCallTopology", "sdp=" + jSONObject);
                                    y3eVar.logException("DirectCallTopology", "direct.topology.bad.sdp", new Exception("bad.sdp.answer.from.participant"));
                                } else {
                                    v3kVar.a.put(bpcVarO2, sessionDescription);
                                    f0(du1VarX);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case "participant-joined":
                this.Y = true;
                break;
        }
    }

    @Override // defpackage.n91
    public final void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
        n91 n91Var = this.O;
        if (n91Var != null) {
            n91Var.onSelectedCandidatePairChanged(candidatePairChangeEvent);
        }
    }

    @Override // defpackage.j42
    public final void p() {
        Y("clearRemoteVideoRenderers");
        uza.d();
        Iterator it = this.E.values().iterator();
        while (it.hasNext()) {
            ((qpc) it.next()).b0.d();
        }
    }

    @Override // defpackage.j42
    public final void q(yt1 yt1Var, SessionDescription sessionDescription) {
        t("createAnswerFor, " + this + ", participant=" + yt1Var + ", " + sessionDescription.type);
        uza.d();
        SessionDescription.Type type = sessionDescription.type;
        SessionDescription.Type type2 = SessionDescription.Type.OFFER;
        if (type != type2) {
            StringBuilder sb = new StringBuilder();
            sb.append(type2);
            SessionDescription.Type type3 = sessionDescription.type;
            sb.append(" expected, but ");
            sb.append(type3);
            sb.append(" specified");
            throw new IllegalArgumentException(sb.toString());
        }
        du1 du1VarX = x(yt1Var);
        if (du1VarX == null) {
            c.u(yt1Var, ") not found", "Participant(");
            return;
        }
        HashMap map = this.I;
        v3k v3kVar = (v3k) map.get(yt1Var);
        y3e y3eVar = this.e;
        if (v3kVar != null) {
            if (!v3kVar.e) {
                y3eVar.log("DirectCallTopology", this + ": unexpected offer (is concurrent call?) from " + du1VarX);
                return;
            }
            y3eVar.log("DirectCallTopology", "Opponent " + yt1Var + " is requesting for renegotiation, let us accept the request, ");
            map.remove(yt1Var);
        }
        HashMap map2 = this.H;
        v3k v3kVar2 = (v3k) map2.get(yt1Var);
        if (v3kVar2 != null) {
            SessionDescription sessionDescription2 = v3kVar2.b;
            if (TextUtils.equals(sessionDescription2 != null ? sessionDescription2.description : "", sessionDescription.description)) {
                y3eVar.reportException("DirectCallTopology", "answer.scheduled", new Exception("answer.creation.already.scheduled"));
                return;
            }
            if (v3kVar2.d) {
                y3eVar.reportException("DirectCallTopology", "repeated.answer", new Exception("repeated.answer.creation"));
                return;
            }
            c0(this + ": re-schedule answer creation for " + du1VarX);
            map2.remove(yt1Var);
        }
        map2.put(yt1Var, new v3k(sessionDescription, false));
        if (this.Q) {
            h0();
        } else {
            j0();
        }
    }

    @Override // defpackage.j42
    public final void r(du1 du1Var, boolean z) {
        Y("createOfferFor, " + this + ", " + du1Var);
        uza.d();
        if (!this.j.m(du1Var)) {
            ore.k("Participant not found");
            return;
        }
        yt1 yt1Var = du1Var.a;
        HashMap map = this.I;
        v3k v3kVar = (v3k) map.get(yt1Var);
        if (v3kVar == null) {
            map.put(du1Var.a, new v3k(null, false));
        } else if (v3kVar.d) {
            if (!v3kVar.f) {
                this.e.reportException("DirectCallTopology", "offer.scheduled", new Exception("offer.creation.already.scheduled"));
            }
        } else if (z) {
            c0(this + ": re-schedule offer creation for " + du1Var);
            v3kVar.e = false;
        } else {
            c0(this + ": offer already created for " + du1Var);
        }
        k0();
    }

    @Override // defpackage.j42
    public final void s(boolean z) {
        Iterator it = this.j.j().iterator();
        while (it.hasNext()) {
            r((du1) it.next(), z);
        }
    }

    @Override // defpackage.j42
    public final String toString() {
        return super.toString() + ", p2p_relay=" + this.P;
    }

    @Override // defpackage.j42
    public final Runnable u() {
        return this.V;
    }

    @Override // defpackage.j42
    public final zvh w() {
        return zvh.b;
    }
}
