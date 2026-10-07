package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes3.dex */
public final class wif extends j42 implements n4g {
    public long A;
    public long B;
    public final pbi C;
    public final yr8 D;
    public final kl5 E;
    public final cmf F;
    public final tif G;
    public final xdd y;
    public final oki z;

    /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb  */
    public wif(vif vifVar) {
        int i;
        Integer numValueOf;
        int i2;
        int i3;
        boolean z;
        super(vifVar.h, vifVar.g, vifVar.m, vifVar.o, vifVar.p, vifVar.b, vifVar.u, vifVar.v, vifVar.y, vifVar.x, vifVar.C, vifVar.E, vifVar.i, vifVar.F);
        Y(this + " ctor");
        this.z = vifVar.c;
        xdd xddVar = vifVar.q;
        this.y = xddVar;
        this.m = vifVar.z;
        this.w.k.add(this);
        this.D = new yr8(15);
        ou3 ou3Var = vifVar.n;
        nl nlVar = vifVar.t;
        int iIntValue = ((Number) ou3Var.a.getValue()).intValue();
        int i4 = this.d.j;
        y3e y3eVar = this.e;
        if (i4 > 0) {
            y3eVar.log("ServerCallTopology", "video tracks count enabled: " + i4);
            i = i4;
        } else {
            y3eVar.log("ServerCallTopology", "video tracks count disabled");
            i = 0;
        }
        this.d.getClass();
        if (xddVar.d != null) {
            Integer num = xddVar.d;
            numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        } else {
            numValueOf = null;
        }
        Integer num2 = numValueOf;
        xt1 xt1Var = this.d;
        if (!xt1Var.u.c.b) {
            if (xt1Var.j > 0) {
                i3 = 2;
            } else {
                i2 = 1;
            }
            boolean z2 = xt1Var.d;
            boolean z3 = xt1Var.e;
            boolean z4 = xt1Var.h;
            boolean z5 = xt1Var.i;
            if (nlVar != null) {
                z = true;
            } else {
                z = false;
            }
            v88 v88Var = xt1Var.r;
            tif tifVar = new tif(iIntValue, num2, i2, z2, z3, z4, z5, z, v88Var.g, i, xt1Var.q, xt1Var.s, xt1Var.t, v88Var.E.a(), this.d.r.e0);
            this.G = tifVar;
            pbi pbiVar = new pbi(vifVar, this, tifVar);
            this.C = pbiVar;
            this.F = vifVar.D;
            this.E = new kl5(vifVar.o, pbiVar);
        }
        i3 = 3;
        i2 = i3;
        boolean z6 = xt1Var.d;
        boolean z7 = xt1Var.e;
        boolean z8 = xt1Var.h;
        boolean z9 = xt1Var.i;
        if (nlVar != null) {
            z = true;
        } else {
            z = false;
        }
        v88 v88Var2 = xt1Var.r;
        tif tifVar2 = new tif(iIntValue, num2, i2, z6, z7, z8, z9, z, v88Var2.g, i, xt1Var.q, xt1Var.s, xt1Var.t, v88Var2.E.a(), this.d.r.e0);
        this.G = tifVar2;
        pbi pbiVar2 = new pbi(vifVar, this, tifVar2);
        this.C = pbiVar2;
        this.F = vifVar.D;
        this.E = new kl5(vifVar.o, pbiVar2);
    }

    @Override // defpackage.j42
    public final void A(wig wigVar) {
        c5f c5fVar = new c5f(this, 1, wigVar);
        pbi pbiVar = this.C;
        if (pbiVar.o != null) {
            qpc qpcVar = pbiVar.o;
            qpcVar.getClass();
            qpcVar.j(new bjk(qpcVar, new bm5(qpcVar, 3, c5fVar), 1));
        }
    }

    @Override // defpackage.j42
    public final String B() {
        return "ServerCallTopology";
    }

    @Override // defpackage.j42
    public final void C(yt1 yt1Var, List list, boolean z, u81 u81Var) {
        try {
            this.w.j(kql.q(yt1Var, list, z), u81Var);
        } catch (JSONException unused) {
            this.e.reportException("ServerCallTopology", "server.topology.send.grantRoles", new Exception("server.topology.send.grantRoles"));
        }
    }

    @Override // defpackage.j42
    public final void G(int i) {
        Y("handleStateChanged, " + this + ", state = " + j42.z(i));
        int i2 = this.o;
        q4g q4gVar = this.w;
        if (i2 == 0) {
            c0("disable processing signaling replies in " + j42.z(i) + " state");
            q4gVar.i(this);
            return;
        }
        pbi pbiVar = this.C;
        if (i2 == 1) {
            t("enable processing signaling replies in " + j42.z(i) + " state");
            q4gVar.k.add(this);
            pbiVar.p(i);
            return;
        }
        if (i2 != 2) {
            return;
        }
        c0("disable processing signaling replies in " + j42.z(i) + " state");
        q4gVar.i(this);
        pbiVar.p(i);
    }

    @Override // defpackage.j42
    public final void H(c91 c91Var, w81 w81Var) throws JSONException {
        this.C.j();
        T(true, null, c91Var, w81Var);
    }

    @Override // defpackage.j42
    public final void M(yt1 yt1Var, dnf dnfVar, boolean z, v81 v81Var) {
        try {
            this.w.j(kql.r(yt1Var, dnfVar, z), v81Var);
        } catch (JSONException unused) {
            this.e.reportException("ServerCallTopology", "server.topology.send.pinParticipant", new Exception("server.topology.send.pinParticipant"));
        }
    }

    @Override // defpackage.j42
    public final void O() {
        c0(this + " release");
        this.a.removeCallbacksAndMessages(null);
        this.w.i(this);
        pbi pbiVar = this.C;
        pbiVar.j();
        pbiVar.o.r(true);
        super.O();
    }

    @Override // defpackage.j42
    public final void P(long j, long j2) {
        uke ukeVar = new uke(j, j2);
        this.d.u.d.b(this.e, "ServerCallTopology", "send report-network-stat: " + ukeVar);
        this.C.o.C().d(new dc9(new kr6(ukeVar)));
    }

    @Override // defpackage.j42
    public final void Q(a4e a4eVar) {
        ArrayList arrayListB = grl.b(a4eVar.b);
        if (arrayListB.isEmpty()) {
            return;
        }
        dgg dggVar = (dgg) arrayListB.get(0);
        pk2 pk2VarC = a4eVar.c();
        if (pk2VarC != null) {
            ArrayList arrayListD = grl.d(arrayListB, pk2VarC);
            if (!arrayListD.isEmpty()) {
                dggVar = (dgg) arrayListD.get(0);
            }
        }
        this.d.getClass();
        long j = dggVar.o;
        if (j == this.A && dggVar.p == this.B) {
            return;
        }
        long j2 = dggVar.p;
        if (j2 <= 0 || j <= 0) {
            return;
        }
        this.A = j;
        this.B = j2;
        wke wkeVar = new wke(j2, j);
        rve rveVarC = this.C.o.C();
        qyb qybVar = new qyb(23, this);
        kr6 kr6Var = new kr6(wkeVar);
        kr6Var.b = qybVar;
        rveVarC.d(new dc9(kr6Var));
    }

    @Override // defpackage.j42
    public final void R(boolean z) {
        this.C.o.C().d(new dc9(new kr6(new gle(z))));
        pbi pbiVar = this.C;
        pbiVar.q = z;
        pbiVar.o.i = pbiVar.q;
    }

    @Override // defpackage.j42
    public final void S(final jkg jkgVar) {
        if (J()) {
            boolean z = jkgVar instanceof vig;
            pbi pbiVar = this.C;
            if (!z) {
                if (pbiVar.o != null) {
                    qpc qpcVar = pbiVar.o;
                    qpcVar.getClass();
                    qpcVar.j(new bjk(qpcVar, new pg4(3, jkgVar), 1));
                    return;
                }
                return;
            }
            jkg jkgVar2 = new jkg() { // from class: uif
                @Override // defpackage.jkg
                public final void a(b1k b1kVar) {
                    wif wifVar = this.a;
                    jkg jkgVar3 = jkgVar;
                    ArrayList arrayList = new ArrayList();
                    a4e a4eVarM = wifVar.F.m(b1kVar);
                    for (fgg fggVar : a4eVarM.b) {
                        boolean z2 = fggVar.a == 1;
                        boolean z3 = fggVar.b == 1;
                        if (z2 && z3) {
                            if (fggVar.e.endsWith("audio-mix")) {
                                arrayList.add(new ylc(fggVar, new w3k(null, true, false, false)));
                            } else if (fggVar.e.matches(".*ta-\\d+$")) {
                                arrayList.add(new ylc(fggVar, new w3k(null, false, true, false)));
                            }
                        }
                        yt1 yt1VarN = kql.N(fggVar.e);
                        if (yt1VarN != null) {
                            arrayList.add(new ylc(fggVar, new w3k(yt1VarN, false, false, false)));
                        } else {
                            szf szfVar = wifVar.g;
                            if (szfVar != null && szfVar.o != null && wifVar.g.o.m != null && fggVar.e.startsWith(wifVar.g.o.m)) {
                                arrayList.add(new ylc(fggVar, new w3k(null, false, false, true)));
                            }
                        }
                    }
                    wifVar.a.post(new h82(wifVar, b1kVar, a4eVarM, arrayList, jkgVar3, 7));
                }
            };
            if (pbiVar.o != null) {
                qpc qpcVar2 = pbiVar.o;
                qpcVar2.getClass();
                qpcVar2.j(new bjk(qpcVar2, new pg4(3, jkgVar2), 1));
            }
        }
    }

    @Override // defpackage.j42
    public final void V(x52 x52Var, List list) {
        pbi pbiVar = this.C;
        if (pbiVar.o.F()) {
            pbiVar.o.b0.n("video-".concat(x52Var.b.b()), x52Var, list);
        }
    }

    @Override // defpackage.j42
    public final void Z(c91 c91Var, w81 w81Var) throws JSONException {
        T(false, this.G, c91Var, w81Var);
    }

    @Override // defpackage.j42
    public final void a0(List list) {
        Y("updateDisplayLayouts, " + this);
        this.E.a(list);
        this.D.getClass();
        this.C.q(yr8.n(list));
    }

    @Override // defpackage.j42
    public final void b0(vpc vpcVar) {
        pbi pbiVar = this.C;
        pbiVar.j = vpcVar;
        if (pbiVar.o != null) {
            pbiVar.o.L(pbiVar.j);
        }
    }

    @Override // defpackage.j42, defpackage.w52
    public final void j(uik uikVar) {
        pbi pbiVar = this.C;
        l3j l3jVar = (l3j) uikVar.b;
        if (pbiVar.o != null) {
            qpc qpcVar = pbiVar.o;
            f4j f4jVar = qpcVar.a0;
            if (l3jVar.equals((l3j) ((Map) f4jVar.f.a).get(Integer.valueOf(l3jVar.c)))) {
                return;
            }
            o3j o3jVar = f4jVar.f;
            o3jVar.getClass();
            ((Map) o3jVar.a).put(Integer.valueOf(l3jVar.c), l3jVar);
            qpcVar.w.log("PeerConnectionClient", "updateVideoQuality, " + qpcVar + " update=" + l3jVar);
            qpcVar.j(new bjk(qpcVar, new bm5(qpcVar, 2, l3jVar), 1));
        }
    }

    @Override // defpackage.j42, defpackage.o8b
    public final void l(p8b p8bVar) {
        pbi pbiVar = this.C;
        pbiVar.o.u(p8bVar);
        pbiVar.t = p8bVar;
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantUpdated(x91 x91Var) {
        onActiveParticipantsRemoved(new w91(x91Var.a, Collections.EMPTY_LIST, x91Var.e));
        x91Var.b.getClass();
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantsAdded(t91 t91Var) {
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantsChanged(u91 u91Var) {
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantsDeAnonimized(v91 v91Var) {
    }

    @Override // defpackage.j42, defpackage.y91
    public final void onActiveParticipantsRemoved(w91 w91Var) {
        Y("onCallParticipantsRemoved, " + w91Var.a.size());
        for (du1 du1Var : w91Var.a) {
            yt1 yt1Var = du1Var.a;
            if (yt1Var != null) {
                pbi pbiVar = this.C;
                if (pbiVar.o.F()) {
                    pbiVar.o.b0.e(yt1Var, "video-".concat(yt1Var.b()));
                }
            }
            yt1 yt1Var2 = du1Var.a;
            if (yt1Var2 != null) {
                kl5 kl5Var = this.E;
                Set hashSet = (Set) kl5Var.d.get(yt1Var2);
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                xtj xtjVar = new xtj(4);
                xtjVar.b = yt1Var2;
                xtjVar.c = v4j.a;
                hashSet.add(xtjVar.p());
                xtj xtjVar2 = new xtj(4);
                xtjVar2.b = yt1Var2;
                xtjVar2.c = v4j.b;
                hashSet.add(xtjVar2.p());
                zif zifVar = new zif();
                zifVar.a = true;
                ArrayList arrayList = new ArrayList();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ajf((x52) it.next(), zifVar));
                }
                xei xeiVar = new xei(arrayList, false);
                rve rveVarC = kl5Var.b.o.C();
                jl5 jl5Var = new jl5(kl5Var, 2);
                jl5 jl5Var2 = new jl5(kl5Var, 3);
                kr6 kr6Var = new kr6(xeiVar);
                kr6Var.b = jl5Var;
                kr6Var.c = jl5Var2;
                rveVarC.d(new dc9(kr6Var));
                List<mg1> list = kl5Var.c;
                ArrayList arrayList2 = new ArrayList();
                for (mg1 mg1Var : list) {
                    if (!mg1Var.a.b.equals(yt1Var2)) {
                        arrayList2.add(mg1Var);
                    }
                }
                kl5Var.c = arrayList2;
                kl5Var.d.remove(yt1Var2);
            }
        }
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("notification");
        if (!"producer-updated".equals(string)) {
            if ("consumer-answered".equals(string)) {
                this.C.getClass();
                return;
            }
            return;
        }
        pbi pbiVar = this.C;
        pbiVar.getClass();
        pbiVar.e.log("UnifiedPeerConnection", "handleProducerUpdatedNotify, " + pbiVar + " " + jSONObject);
        String string2 = jSONObject.getString("sessionId");
        if (pbiVar.s.contains(string2)) {
            pbiVar.e.log("UnifiedPeerConnection", qv1.k("producer-updated contains expired sessionId: ", string2));
        } else {
            String string3 = jSONObject.getString("description");
            SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, string3);
            Matcher matcher = pbi.x.matcher(string3);
            HashSet hashSet = pbiVar.h;
            hashSet.clear();
            while (matcher.find()) {
                hashSet.add(matcher.group(1));
            }
            String str = pbiVar.r;
            pbiVar.r = string2;
            if (str == null || str.equals(string2)) {
                if (pbiVar.o.Y && pbiVar.p != null) {
                    pbiVar.e.log("UnifiedPeerConnection", "producer is stable but offerForProducer exists");
                    pbiVar.p = null;
                }
                if (pbiVar.o.Y) {
                    pbiVar.l("set remote sdp=" + sessionDescription.type.canonicalForm() + " to " + pbiVar.o);
                    pbiVar.o.M(sessionDescription);
                } else {
                    pbiVar.e.log("UnifiedPeerConnection", pbiVar.o + " is NOT STABLE, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                    pbiVar.p = sessionDescription;
                }
            } else {
                pbiVar.s.add(str);
                pbiVar.e.log("UnifiedPeerConnection", pbiVar.o + " is JUST RECREATED, postpone set remote " + sessionDescription.type.canonicalForm() + " to it");
                pbiVar.p = sessionDescription;
                pbiVar.j();
                pbiVar.f();
                if (pbiVar.o != null) {
                    pbiVar.o.L(pbiVar.j);
                }
                pbiVar.g.h.f = false;
                if (!pbiVar.o.F()) {
                    pbiVar.o.A(pbiVar.a.c ? pbiVar.i.v() : Collections.EMPTY_LIST);
                }
            }
        }
        Y("resendDisplayLayouts, " + this);
        List list = this.E.c;
        this.D.getClass();
        this.C.q(yr8.n(list));
        kl5 kl5Var = this.E;
        kl5Var.e = true;
        kl5Var.a(kl5Var.c);
    }

    @Override // defpackage.j42
    public final Runnable u() {
        wt1 wt1Var = this.d.b;
        return new h7b(27, this);
    }

    @Override // defpackage.j42
    public final zvh w() {
        return zvh.c;
    }

    @Override // defpackage.j42
    public final Map y() {
        int i;
        d5f d5fVar = this.C.o.d;
        Throwable th = null;
        if (d5fVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator it = d5fVar.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            bak bakVar = (bak) entry.getValue();
            if (bakVar != null) {
                y55 y55Var = bakVar.g;
                long j = bakVar.l.get();
                long j2 = bakVar.m.get();
                long j3 = bakVar.n.get();
                long j4 = bakVar.o.get();
                Throwable th2 = th;
                HashMap map2 = map;
                long j5 = bakVar.p.get();
                Iterator it2 = it;
                long j6 = bakVar.q.get();
                long j7 = bakVar.r.get();
                long j8 = bakVar.s.get();
                long j9 = bakVar.t.get();
                long j10 = bakVar.y.get();
                long j11 = bakVar.z.get();
                double d = ((long) bakVar.u.b.b) / 1000000;
                double d2 = ((long) bakVar.v.b.b) / 1000000;
                double d3 = ((long) bakVar.w.b.b) / 1000000;
                double d4 = ((long) bakVar.x.b.b) / 1000000;
                if (y55Var != null && (i = y55Var.f) != 1 && i != 2) {
                    throw th2;
                }
                if (y55Var != null) {
                    y55Var.m.get();
                }
                if (y55Var != null) {
                    y55Var.n.get();
                }
                map2.put((yt1) entry.getKey(), new e5f(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, d, d2, d3, d4, (td7) bakVar.A.c));
                map = map2;
                it = it2;
                th = th2;
            }
        }
        return map;
    }
}
