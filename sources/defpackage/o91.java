package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.AndroidVideoDecoder;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.EglBase;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkIntervalStatEvent;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.a;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.CallApiServiceImpl;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.externcalls.sdk.exception.SubDomain;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.j;
import ru.ok.android.externcalls.sdk.l;
import ru.ok.android.externcalls.sdk.p;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class o91 implements tb9, NetworkMonitor.NetworkObserver, fwh {
    public long A;
    public final a4f A0;
    public long B;
    public int B0;
    public boolean C;
    public yt1 C0;
    public boolean D;
    public List D0;
    public List E;
    public volatile boolean E0;
    public final ArrayList F;
    public final zq1 F0;
    public boolean G;
    public final ifh G0;
    public final int H;
    public final b72 H0;
    public boolean I;
    public final gj2 I0;
    public it7 J;
    public final kr6 J0;
    public boolean K;
    public final xr8 K0;
    public final wwf L;
    public final yig L0;
    public final wwf M;
    public final h32 M0;
    public final CidLogger N;
    public final k5g N0;
    public final zn0 O;
    public final z18 O0;
    public final boolean P;
    public final due P0;
    public boolean Q;
    public final xq1 Q0;
    public boolean R;
    public final fik R0;
    public boolean S;
    public final i12 S0;
    public j T;
    public final ifh T0;
    public final wpc U;
    public final ifh U0;
    public n91 V;
    public final ifh V0;
    public boolean W;
    public final bw6 W0;
    public a X;
    public final boolean X0;
    public final ifh Y;
    public final ug5 Y0;
    public long Z;
    public rig Z0;
    public boolean a;
    public final aak a0;
    public final ih a1;
    public vhb b;
    public final mdk b0;
    public final mkc b1;
    public final ExecutorService c;
    public final oki c0;
    public volatile boolean c1;
    public final ExecutorService d;
    public final skg d0;
    public final xp9 d1;
    public final zzf e0;
    public final fik e1;
    public final szf f0;
    public volatile boolean f1;
    public final f91 g;
    public final fwg g0;
    public final CallApiServiceImpl g1;
    public final bj1 h;
    public final lb9 h0;
    public CallTerminatingException h1;
    public final xdd i0;
    public final px8 i1;
    public final ru1 j0;
    public final cmf j1;
    public q4g k;
    public final CopyOnWriteArraySet k0;
    public final CropAndScaleParamsProvider k1;
    public final jf l;
    public final CopyOnWriteArraySet l0;
    public final xoc l1;
    public final Context m;
    public boolean m0;
    public boolean m1;
    public final xt1 n;
    public j42 n0;
    public vpc n1;
    public final v88 o;
    public final due o0;
    public vpc o1;
    public String p;
    public j42 p0;
    public final lu8 p1;
    public boolean q;
    public pg5 q0;
    public final EglBase r;
    public volatile k91 r0;
    public final qs1 s;
    public boolean s0;
    public final EnumSet t;
    public final p8b t0;
    public boolean u;
    public final h0a u0;
    public boolean v;
    public boolean v0;
    public final boolean w;
    public final vn7 w0;
    public final qs4 x;
    public final nl x0;
    public final boolean y;
    public final wl y0;
    public String z;
    public final esh z0;
    public final q81 e = new q81(this, 0);
    public final q81 f = new q81(this, 1);
    public final s7k i = new s7k(this);
    public final r81 j = new r81(this);

    public o91(Context context, esh eshVar, xq1 xq1Var, fik fikVar, ru1 ru1Var, xt1 xt1Var, ifh ifhVar, boolean z, boolean z2, p8b p8bVar, h0a h0aVar, qs4 qs4Var, CidLogger cidLogger, xdd xddVar, boolean z3, vn7 vn7Var, b72 b72Var, zn0 zn0Var, gj2 gj2Var, ch chVar, h32 h32Var, cw5 cw5Var, due dueVar, skg skgVar, xp9 xp9Var, EglBase eglBase, qs1 qs1Var, ExecutorService executorService, ExecutorService executorService2, wwf wwfVar, wwf wwfVar2, ug5 ug5Var, zzf zzfVar, lb9 lb9Var, fwg fwgVar, rzf rzfVar, boolean z4, ifh ifhVar2, xr8 xr8Var, yfj yfjVar, wl wlVar, zq1 zq1Var, k5g k5gVar, yfj yfjVar2, xde xdeVar, due dueVar2, ifh ifhVar3, ifh ifhVar4, ifh ifhVar5, bw6 bw6Var, cw6 cw6Var, a4f a4fVar, mkc mkcVar, fik fikVar2, int i, bj1 bj1Var, CallApiServiceImpl callApiServiceImpl, px8 px8Var, cmf cmfVar, wpc wpcVar, ou7 ou7Var, xoc xocVar, long j) {
        jf jfVar = new jf(this);
        this.l = jfVar;
        this.t = EnumSet.noneOf(m91.class);
        this.C = false;
        this.D = false;
        this.F = new ArrayList();
        this.Q = true;
        this.R = true;
        this.a0 = new aak(this);
        this.b0 = new mdk(this);
        this.c0 = new oki(this);
        this.k0 = new CopyOnWriteArraySet();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.l0 = copyOnWriteArraySet;
        this.B0 = 0;
        this.f1 = false;
        this.m1 = false;
        this.p1 = new lu8();
        this.j1 = cmfVar;
        this.i1 = px8Var;
        this.m = context;
        this.z0 = eshVar;
        this.Q0 = xq1Var;
        this.R0 = fikVar;
        this.j0 = ru1Var;
        this.n = xt1Var;
        v88 v88Var = xt1Var.r;
        this.o = v88Var;
        this.Y = ifhVar;
        this.v = z;
        this.w = z2;
        this.t0 = p8bVar;
        this.u0 = h0aVar;
        this.x = qs4Var;
        this.y = bj1Var.b;
        this.N = cidLogger;
        this.i0 = xddVar;
        this.X0 = z3;
        this.w0 = vn7Var;
        this.H0 = b72Var;
        this.O = zn0Var;
        this.I0 = gj2Var;
        this.L0 = new yig((CidLogger) chVar.c, new e91(this, 0), new e91(this, 1), new o3j(this), (esh) chVar.d, chVar.b);
        this.M0 = h32Var;
        this.n0 = cw5Var;
        this.o0 = dueVar;
        this.d0 = skgVar;
        this.d1 = xp9Var;
        this.r = eglBase;
        this.s = qs1Var;
        this.c = executorService;
        this.d = executorService2;
        this.L = wwfVar;
        this.M = wwfVar2;
        this.Y0 = ug5Var;
        this.e0 = zzfVar;
        this.h0 = lb9Var;
        this.g0 = fwgVar;
        rzfVar.h = new ufk(this);
        if (rzfVar.a == null) {
            ore.k("sharedPeerConnectionFactory is null");
            throw null;
        }
        if (rzfVar.b == null) {
            ore.k("videoCaptureFactory is null");
            throw null;
        }
        if (rzfVar.l == null) {
            ore.k("mediaPermissionProvider is null");
            throw null;
        }
        if (rzfVar.d == null) {
            ore.k("context is null");
            throw null;
        }
        if (rzfVar.c == null) {
            ore.k("mediaSettings is null");
            throw null;
        }
        if (rzfVar.e == null) {
            ore.k("log is null");
            throw null;
        }
        if (rzfVar.f == null) {
            ore.k("params is null");
            throw null;
        }
        if (rzfVar.g == null) {
            ore.k("screenshareChecker is null");
            throw null;
        }
        if (rzfVar.n == null) {
            ore.k("rotationProvider is null");
            throw null;
        }
        szf szfVar = new szf(rzfVar);
        this.f0 = szfVar;
        this.P = z4;
        this.G0 = ifhVar2;
        ll5 ll5Var = new ll5(new rai(this), new fpi(4, this), cidLogger, xt1Var);
        kr6 kr6Var = new kr6();
        kr6Var.a = ll5Var;
        qyd qydVar = new qyd();
        kr6Var.b = qydVar;
        z2f z2fVarA = i3f.a();
        Objects.requireNonNull(TimeUnit.MILLISECONDS, "unit is null");
        Objects.requireNonNull(z2fVarA, "scheduler is null");
        vqb vqbVarE = new jqb(qydVar, z2fVarA, 1).e(th.a());
        vx8 vx8Var = new vx8(new vuf(14, ll5Var), vm9.f);
        vqbVarE.f(vx8Var);
        kr6Var.c = vx8Var;
        this.J0 = kr6Var;
        this.K0 = xr8Var;
        this.x0 = new nl(this, (zzf) yfjVar.a, (CidLogger) yfjVar.b, (vn7) yfjVar.c, (wl) yfjVar.d, (p8b) yfjVar.e, (EglBase) yfjVar.f);
        this.y0 = wlVar;
        this.F0 = zq1Var;
        s81 s81Var = new s81(0, this);
        zq1Var.getClass();
        zq1Var.c = s81Var;
        this.N0 = k5gVar;
        fik fikVar3 = new fik(k5gVar.g, new p81(this, 1));
        ewe eweVar = k5gVar.o;
        p81 p81Var = new p81(this, 2);
        eweVar.getClass();
        ih ihVar = new ih();
        ihVar.a = eweVar;
        ihVar.b = p81Var;
        i12 i12Var = new i12((CidLogger) yfjVar2.a, (ru1) yfjVar2.b, (fik) yfjVar2.c, (zq1) yfjVar2.d, (xq1) yfjVar2.e, fikVar3, ihVar, (esh) yfjVar2.f);
        this.S0 = i12Var;
        s81 s81Var2 = new s81(0, this);
        ru1 ru1Var2 = (ru1) xdeVar.b;
        k5g k5gVar2 = (k5g) xdeVar.c;
        xq1 xq1Var2 = (xq1) xdeVar.d;
        CidLogger cidLogger2 = (CidLogger) xdeVar.e;
        ru1Var2.getClass();
        k5gVar2.getClass();
        xq1Var2.getClass();
        z18 z18Var = new z18();
        z18Var.a = new xtj(ru1Var2, k5gVar2.a, s81Var2);
        z18Var.b = new ljf(s81Var2, cidLogger2, k5gVar2.b, k5gVar2.d);
        z18Var.c = new xde(k5gVar2.m, k5gVar2.n, k5gVar2.o, i12Var);
        z18Var.d = new ljf(cidLogger2, k5gVar2.c, k5gVar2.h, xq1Var2.j);
        z18Var.e = new ewe(k5gVar2.p, xq1Var2.d);
        z18Var.f = xq1Var2.p;
        z18Var.g = new dc9(ru1Var2, k5gVar2.q, xq1Var2.k);
        z18Var.h = new h6f(xq1Var2.q, k5gVar2.k);
        z18Var.i = new uvc(xq1Var2.r, k5gVar2.l);
        this.O0 = z18Var;
        this.P0 = dueVar2;
        this.T0 = ifhVar3;
        this.U0 = ifhVar4;
        this.V0 = ifhVar5;
        this.W0 = bw6Var;
        xq1Var.getClass();
        cw6Var.getClass();
        bnc bncVar = xq1Var.c;
        bncVar.getClass();
        ((CopyOnWriteArraySet) bncVar.b).add(cw6Var);
        this.a1 = new ih(this);
        this.A0 = a4fVar;
        this.b1 = mkcVar;
        this.e1 = fikVar2;
        this.H = i;
        this.h = bj1Var;
        this.g1 = callApiServiceImpl;
        this.U = wpcVar;
        this.k1 = ou7Var;
        this.l1 = xocVar;
        NetworkMonitor.init(context);
        Objects.requireNonNull(h32Var);
        this.g = new f91(h32Var);
        copyOnWriteArraySet.add(h32Var);
        h32Var.m.c.getClass();
        cidLogger.log("OKRTCCall", "Call<init> caller = " + this.v + " " + Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE);
        o64 o64VarC = new k64(1, new mz0(2, xp9Var)).c(i3f.a());
        j66 j66Var = new j66(0);
        o64VarC.a(j66Var);
        ((w74) xp9Var.c).a(j66Var);
        cidLogger.log("OKRTCCall", uza.b(eglBase).concat(" was created"));
        StringBuilder sb = new StringBuilder("number of cameras: ");
        sb.append(i);
        cidLogger.log("OKRTCCall", sb.toString());
        szfVar.n.add(this);
        ufk ufkVar = new ufk(this);
        szfVar.w = ufkVar;
        if (szfVar.o != null) {
            szfVar.o.x = ufkVar;
        }
        if (v88Var.g0) {
            l();
            p8b p8bVar2 = szfVar.e;
            p8bVar2.a.add(szfVar);
            szfVar.l(p8bVar2);
        }
        p8bVar.a.add(new o8b() { // from class: g91
            @Override // defpackage.o8b
            public final void l(p8b p8bVar3) {
                h9 h9Var = this.a.M0.m;
                boolean z5 = p8bVar3.f;
                m9 m9Var = h9Var.b;
                if (!z5) {
                    m9Var.b();
                } else {
                    if (m9Var.b) {
                        return;
                    }
                    m9Var.b = true;
                    ((gsh) ((esh) m9Var.c)).getClass();
                    m9Var.a = SystemClock.elapsedRealtime();
                }
            }
        });
        Objects.requireNonNull(ru1Var);
        p8bVar.a.add(new ez4(new h91(ru1Var)));
        AndroidVideoDecoder.errorCallback = new i91(this);
        NetworkMonitor.getInstance().addObserver(this);
        wlVar.a(new p81(this, 3));
        mkcVar.f = new h91(ru1Var);
        zzfVar.a.execute(new xc2(zzfVar, new vaj((short) 500, new Handler(Looper.getMainLooper()), new f4g(26, new ot4(8, mkcVar))), 200L, 6));
        if (j > 0) {
            jfVar.sendMessageDelayed(Message.obtain(jfVar, 132), j);
        }
    }

    public static boolean y(du1 du1Var) {
        for (bu1 bu1Var : du1Var.e) {
            if (bu1Var == bu1.b || bu1Var == bu1.a) {
                return true;
            }
        }
        return false;
    }

    public final void A() {
        vpc vpcVar;
        if (this.n0 == null) {
            return;
        }
        if (!this.t0.b || this.X0) {
            vpcVar = this.o1;
            wpc wpcVar = this.U;
            wpcVar.getClass();
            vpcVar.getClass();
            if (wpcVar.a) {
                vpcVar = new vpc(wpcVar.b, vpcVar.b, vpcVar.c, vpcVar.d, vpcVar.e, vpcVar.f, vpcVar.g, vpcVar.h, vpcVar.i);
            }
        } else {
            vpcVar = this.n1;
        }
        if (vpcVar == null) {
            return;
        }
        boolean zJ = this.n0.J();
        j42 j42Var = this.n0;
        if (zJ) {
            j42Var.q = vpcVar;
            gq9 gq9Var = j42Var.l;
            if (gq9Var != null) {
                gq9Var.f = vpcVar;
                gq9Var.c();
                return;
            }
            return;
        }
        j42Var.q = vpcVar;
        gq9 gq9Var2 = j42Var.l;
        if (gq9Var2 == null) {
            j42Var.b0(vpcVar);
        } else {
            gq9Var2.f = vpcVar;
            gq9Var2.c();
        }
    }

    public final void B() {
        this.K0.getClass();
        i5g i5gVarI = xr8.i(this.t0);
        ((ll5) this.J0.a).h = i5gVarI;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", "accept-call");
            jSONObject.put("mediaSettings", kql.n(i5gVarI, false, false));
            this.k.j(new vj7(jSONObject, 0), new q81(this, 2));
        } catch (JSONException e) {
            qr7.o(e);
        }
    }

    public final int C(yt1 yt1Var, JSONObject jSONObject) {
        du1 du1VarG;
        bnf bnfVar = bnf.a;
        ru1 ru1Var = this.j0;
        if (jSONObject == null) {
            yt1Var.getClass();
            du1VarG = ru1Var.g(new smc(yt1Var, new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8()), bnfVar);
        } else {
            if ("ACCEPTED".equals(jSONObject.optString("state"))) {
                return 2;
            }
            zq1 zq1Var = this.F0;
            n8b n8bVarF = zq1Var.f(jSONObject, yt1Var, "onParticipantAddedToCall", zq1Var.h(bnfVar).a(), true);
            yt1Var.getClass();
            imc xr8Var = new xr8();
            xr8 xr8Var2 = new xr8();
            xr8 xr8Var3 = new xr8();
            xr8 xr8Var4 = new xr8();
            due dueVar = new due(kql.o(jSONObject));
            due dueVar2 = new due(n8bVarF);
            p8b p8bVarM = kql.m(jSONObject);
            if (p8bVarM != null) {
                xr8Var = new due(p8bVarM);
            }
            imc dueVar3 = xr8Var2;
            due dueVar4 = new due(kql.u(jSONObject));
            hi1 hi1VarI = kql.i(jSONObject);
            if (hi1VarI != null) {
                dueVar3 = new due(hi1VarI);
            }
            due dueVar5 = new due(this.N0.a.d(jSONObject, bnfVar));
            cu1 cu1VarJ = kql.J(jSONObject);
            du1VarG = ru1Var.g(new smc(yt1Var, dueVar, dueVar2, xr8Var, dueVar4, dueVar3, dueVar5, xr8Var3, cu1VarJ != null ? new due(cu1VarJ) : xr8Var4), bnfVar);
        }
        this.n0.r(du1VarG, true);
        return 1;
    }

    public final void D(j42 j42Var) {
        this.N.log("OKRTCCall", "handleTopologyCreated, " + j42Var);
        wwf wwfVar = this.L;
        if (wwfVar.b) {
            return;
        }
        wwfVar.b();
    }

    public final void E(j42 j42Var, PeerConnection.IceConnectionState iceConnectionState) {
        int i;
        this.N.log("OKRTCCall", "handleTopologyIceConnectionChange, " + j42Var + ", state=" + iceConnectionState);
        j42 j42Var2 = this.n0;
        if (j42Var != j42Var2) {
            if (j42Var != this.p0) {
                this.N.reportException("OKRTCCall", "topology.ice.conn.change", new Exception("unexpected.topology"));
                return;
            }
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED) {
            this.D = true;
            this.Q = false;
            this.B = SystemClock.elapsedRealtime();
            n(oh1.a, null);
            this.l.removeMessages(131);
            if (this.P) {
                zn0 zn0Var = this.O;
                zn0Var.c.b = 0.0d;
                zn0Var.b.b = 0.0d;
                zn0Var.m = false;
                zn0Var.p = Double.NaN;
                zn0Var.o = Double.NaN;
                zn0Var.a();
            }
            this.B0 = 0;
            j42 j42Var3 = this.p0;
            if (j42Var3 != null) {
                j42Var3.O();
                this.p0 = null;
                return;
            }
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.DISCONNECTED) {
            if (this.D) {
                this.A = (SystemClock.elapsedRealtime() - this.B) + this.A;
            }
            this.D = false;
            n(oh1.b, null);
            return;
        }
        if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            zvh zvhVar = zvh.c;
            if (j42Var2.I(zvhVar) && NetworkMonitor.isOnline() && (i = this.B0) < 3) {
                this.B0 = i + 1;
                f(zvhVar, true);
                d(this.n0, 1);
            }
            this.l.removeMessages(131);
            boolean zI = j42Var.I(zvh.b);
            if (!(this.z == null && this.Z == 0 && this.h.a) && zI) {
                return;
            }
            z();
        }
    }

    public final void F(PeerConnection.PeerConnectionState peerConnectionState) {
        boolean z = peerConnectionState == PeerConnection.PeerConnectionState.CONNECTED;
        cf4 cf4Var = this.M0.j;
        if (cf4Var.j != z) {
            cf4Var.j = z;
            if (z) {
                cf4Var.a();
            } else {
                cf4Var.d.c();
                yi9 yi9Var = cf4Var.f;
                yi9Var.a = 0L;
                yi9Var.b = 0L;
                cf4Var.g = 1.0d;
                cf4Var.e = 0.0d;
            }
        }
        if (z) {
            d32 d32Var = this.M0.g;
            d32Var.i.c();
            d32Var.j.b();
            d32Var.l.R();
            d32Var.k.h();
            xtj xtjVar = d32Var.m;
            ((fi9) xtjVar.b).a = null;
            ((fi9) xtjVar.c).a = null;
        }
    }

    public final void G(j42 j42Var) {
        if (j42Var.I(zvh.b)) {
            this.N.log("OKRTCCall", "onTopologyUpgradeProposed");
            q4g q4gVar = this.k;
            vj7 vj7VarB = kql.b(null, "switch-topology");
            JSONObject jSONObject = vj7VarB.a;
            try {
                jSONObject.put("topology", "SERVER");
                jSONObject.put("force", false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            q4gVar.k(vj7VarB);
            z();
        }
    }

    public final void H() {
        this.N.log("OKRTCCall", "onUserAnswered");
        if (this.E0) {
            if (!((o91) this.a1.a).t.contains(m91.e)) {
                return;
            }
            ih ihVar = this.a1;
            o91 o91Var = (o91) ihVar.a;
            Collection collectionJ = o91Var.j0.j();
            collectionJ.getClass();
            if (collectionJ.isEmpty()) {
                if (((bnc) ihVar.b) == null) {
                    bnc bncVar = new bnc(ihVar);
                    xq1 xq1Var = o91Var.Q0;
                    xq1Var.getClass();
                    bnc bncVar2 = xq1Var.c;
                    bncVar2.getClass();
                    ((CopyOnWriteArraySet) bncVar2.b).add(bncVar);
                    ihVar.b = bncVar;
                    return;
                }
                return;
            }
        }
        ih ihVar2 = this.a1;
        bnc bncVar3 = (bnc) ihVar2.b;
        if (bncVar3 != null) {
            xq1 xq1Var2 = ((o91) ihVar2.a).Q0;
            xq1Var2.getClass();
            bnc bncVar4 = xq1Var2.c;
            bncVar4.getClass();
            ((CopyOnWriteArraySet) bncVar4.b).remove(bncVar3);
            ihVar2.b = null;
        }
        boolean z = this.v0;
        this.v0 = true;
        if (q()) {
            this.m0 = true;
            du1 du1Var = this.j0.a;
            boolean z2 = !z && du1Var.c();
            if (du1Var.c()) {
                I();
            } else {
                du1Var.f(du1.u);
                ru1 ru1Var = this.j0;
                du1 du1Var2 = ru1Var.a;
                yt1 yt1Var = du1Var2.a;
                if (yt1Var != null) {
                    ru1Var.f(ru1Var.c(yt1Var), Collections.singletonList(du1Var2));
                }
                B();
            }
            if (z2) {
                d(this.n0, 1);
                n(oh1.j, du1Var);
            }
        }
    }

    public final void I() {
        this.N.log("OKRTCCall", "sendMediaSettingsChange");
        this.K0.getClass();
        ((qyd) this.J0.b).d(xr8.i(this.t0));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    public final void J(boolean z) {
        MediaProjection mediaProjection;
        oh1 oh1Var = oh1.e;
        if (q() && this.n0.I(zvh.c)) {
            if (z) {
                szf szfVar = this.f0;
                boolean z2 = this.t0.c;
                sb9 sb9Var = szfVar.o;
                if (sb9Var == null) {
                    mediaProjection = null;
                } else if (z2) {
                    b4f b4fVar = sb9Var.t;
                    if (b4fVar != null) {
                        mediaProjection = b4fVar.a.getMediaProjection();
                    } else {
                        mediaProjection = null;
                    }
                } else {
                    g5f g5fVar = sb9Var.u;
                    if (g5fVar == null) {
                        mediaProjection = null;
                    } else {
                        mediaProjection = g5fVar.d.f.getMediaProjection();
                    }
                }
            } else {
                mediaProjection = null;
            }
            zzf zzfVar = this.e0;
            szf szfVar2 = this.f0;
            if (mediaProjection != null) {
                zzfVar.a.execute(new d86(zzfVar, szfVar2, mediaProjection, 27));
                p8b p8bVar = this.t0;
                if (p8bVar.b) {
                    p8bVar.d = true;
                    p8bVar.a();
                    I();
                    n(oh1Var, null);
                    return;
                }
                return;
            }
            zzfVar.a.execute(new yde(zzfVar, 22, szfVar2));
            p8b p8bVar2 = this.t0;
            if (p8bVar2.b) {
                p8bVar2.d = false;
                p8bVar2.a();
                I();
                n(oh1Var, null);
            }
        }
    }

    public final void K(k91 k91Var) {
        this.r0 = k91Var;
        this.i1.getClass();
    }

    public final void L(boolean z) {
        if (q()) {
            if (!z) {
                if (!this.h0.c && this.h0.a() && this.h0.c) {
                    zzf zzfVar = this.e0;
                    zzfVar.a.execute(new xzf(zzfVar, 2));
                } else if (qpc.E()) {
                    zzf zzfVar2 = this.e0;
                    zzfVar2.a.execute(new xzf(zzfVar2, 2));
                }
            }
            zq1 zq1Var = this.F0;
            if (z) {
                zq1Var.getClass();
            } else if (!zq1Var.e.c || !zq1.d(new jc1(0, 11, n8b.class, zq1Var.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                return;
            }
            zzf zzfVar3 = this.e0;
            zzfVar3.a.execute(new wzf(zzfVar3, z, 1));
            p8b p8bVar = this.t0;
            boolean z2 = !z;
            if (p8bVar.e != z2) {
                p8bVar.e = z2;
                p8bVar.a();
            }
            I();
        }
    }

    public final void M(vhb vhbVar) {
        final o91 o91Var;
        final vhb vhbVar2;
        boolean z = vhbVar.c;
        boolean z2 = vhbVar.d;
        boolean z3 = vhbVar.b;
        if (this.S) {
            z |= z2;
            z3 |= z2;
            z2 = false;
        }
        final boolean z4 = z;
        this.b = vhbVar;
        this.N.log("OKRTCCall", "new debug params " + vhbVar);
        final zzf zzfVar = this.e0;
        if (zzfVar == null) {
            o91Var = this;
            vhbVar2 = vhbVar;
        } else {
            final String str = vhbVar.f;
            final boolean z5 = (this.S || !z2 || str == null) ? false : true;
            o91Var = this;
            vhbVar2 = vhbVar;
            zzfVar.a(new Consumer() { // from class: b91
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PeerConnectionFactory peerConnectionFactory = (PeerConnectionFactory) obj;
                    vhb vhbVar3 = vhbVar2;
                    Runnable runnable = vhbVar3.m;
                    zzf zzfVar2 = zzfVar;
                    zzfVar2.a.execute(new wzf(zzfVar2, z4, 0));
                    PeerConnectionFactory.EnhancerKind enhancerKind = vhbVar3.e;
                    int i = vhbVar3.g;
                    int i2 = vhbVar3.h;
                    int i3 = vhbVar3.i;
                    int i4 = vhbVar3.j;
                    int i5 = vhbVar3.k;
                    boolean z6 = vhbVar3.l;
                    boolean z7 = z5;
                    peerConnectionFactory.setPreprocessorParams(z7, enhancerKind, str, i, i2, i3, i4, i5, z6, z7 ? new d91(this.a, runnable, 0) : new ce5());
                }
            }, new t81(0));
        }
        boolean z6 = vhbVar2.a;
        h0a h0aVar = o91Var.u0;
        h0aVar.a = z6;
        h0aVar.b = z3;
        o91Var.k.k(new v4g(h0aVar));
    }

    public final void N(yt1 yt1Var) {
        yt1Var.getClass();
        this.j0.g(new smc(yt1Var, new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8()), bnf.a);
    }

    @Override // defpackage.fwh
    public final void a(bwh bwhVar) {
        this.Q0.v.a(bwhVar);
    }

    @Override // defpackage.tb9
    public final void b(sb9 sb9Var) {
        this.N.log("OKRTCCall", "onLocalMediaStreamChanged, ".concat(uza.b(sb9Var)));
        this.l.post(new j91(this, 2));
    }

    public final void c(m91 m91Var) {
        ut1 ut1Var = this.Q0.w;
        int iOrdinal = m91Var.ordinal();
        if (iOrdinal == 0) {
            ut1Var.onAnonJoinForbiddenChanged();
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ut1Var.onRecurringChanged();
                return;
            }
            if (iOrdinal == 3) {
                ut1Var.onFeedbackEnabledChanged();
                return;
            }
            if (iOrdinal == 5) {
                ut1Var.onAsrOnlineAvailableChanged();
                return;
            }
            if (iOrdinal != 6) {
                if (iOrdinal != 7) {
                    return;
                }
            }
            ut1Var.onAdminInCallChanged();
        }
        ut1Var.onWaitingHallEnabledChanged();
        ut1Var.onWaitForAdminChanged();
        ut1Var.onAdminInCallChanged();
    }

    public final void d(j42 j42Var, int i) {
        String str = "maybeSetTopologyState, " + j42Var + ", state=" + j42.z(i);
        CidLogger cidLogger = this.N;
        cidLogger.log("OKRTCCall", str);
        if (i == 0) {
            j42Var.W(i);
            return;
        }
        if (!this.W) {
            cidLogger.log("OKRTCCall", "cant set " + j42Var + " to active state, conversation is not ready yet");
            return;
        }
        if (!this.v) {
            if (!this.m0) {
                cidLogger.log("OKRTCCall", "cant set " + j42Var + " to active state, conversation is not started yet");
                return;
            }
            if (!this.v0) {
                cidLogger.log("OKRTCCall", "cant set " + j42Var + " to active state, user is not accepted call yet");
                return;
            }
        }
        j42Var.U(this.E);
        uza.d();
        if (true != j42Var.p) {
            j42Var.p = true;
            j42Var.D();
        }
        j42Var.W(i);
        this.t0.a();
    }

    public final void e(it7 it7Var) {
        this.N.log("OKRTCCall", "hangup, " + uza.b(it7Var) + ", unknown");
        uza.d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", it7Var.toString());
            q4g q4gVar = this.k;
            if (q4gVar == null || !q4gVar.s) {
                this.g1.hangupConversation(it7Var);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("command", "hangup");
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.get(next));
                    }
                    q4gVar.q = false;
                    uza.d();
                    f4g f4gVar = new f4g(1, q4gVar);
                    q4gVar.c.postDelayed(f4gVar, 8000L);
                    q4gVar.d(new vj7(jSONObject2), true, new u7k(q4gVar, f4gVar), null);
                    this.R = false;
                } catch (JSONException e) {
                    qr7.o(e);
                    return;
                }
            }
            t("hangup." + it7Var + ".unknown", it7Var);
        } catch (JSONException e2) {
            qr7.o(e2);
        }
    }

    public final void f(zvh zvhVar, boolean z) {
        gq9 gq9Var;
        j42 wifVar;
        boolean z2;
        gq9 gq9Var2;
        zvh zvhVar2 = zvh.c;
        zvh zvhVarW = this.n0.w();
        this.Y0.b(this.n0);
        j42 j42Var = this.p0;
        if (j42Var != null) {
            j42Var.O();
            this.p0 = null;
        }
        boolean zI = this.n0.I(zvhVar);
        j42 j42Var2 = this.n0;
        if (zI) {
            j42Var2.O();
        } else {
            this.p0 = j42Var2;
        }
        zvh zvhVar3 = zvh.b;
        if (zvhVar == zvhVar3) {
            em5 em5Var = new em5();
            em5Var.m = false;
            em5Var.e = this.m;
            em5Var.h = this.j0;
            em5Var.g = this.t0;
            em5Var.i = this.k;
            em5Var.r = this.i;
            CidLogger cidLogger = this.N;
            em5Var.k = cidLogger;
            em5Var.l = this.W0;
            xt1 xt1Var = this.n;
            em5Var.j = xt1Var;
            em5Var.a = this.e0;
            em5Var.d = this.c;
            em5Var.f = this.r;
            em5Var.c = this.c0;
            em5Var.b = this.f0;
            em5Var.m = this.h.c;
            em5Var.n = this.w0;
            em5Var.o = this.x0;
            em5Var.p = this.Q0;
            em5Var.s = this.z0;
            if (((n11) xt1Var.p.a).b) {
                if (this.Z0 == null) {
                    this.Z0 = new rig(this.L0, cidLogger, xt1Var.u.a != null);
                }
                gq9Var2 = new gq9(this.Z0, (eq9) ((n11) this.n.p.a).c, this.z0, this.N);
            } else {
                gq9Var2 = null;
            }
            em5Var.q = gq9Var2;
            em5Var.t = this;
            em5Var.u = this;
            em5Var.v = this.V;
            px8 px8Var = this.i1;
            em5Var.x = px8Var;
            cmf cmfVar = this.j1;
            em5Var.w = cmfVar;
            em5Var.y = this.k1;
            em5Var.z = new i91(this);
            em5Var.A = this.l1;
            em5Var.B = this.v;
            if (em5Var.a == null || em5Var.e == null || em5Var.h == null || em5Var.g == null || em5Var.i == null || em5Var.j == null || em5Var.k == null || em5Var.f == null || em5Var.c == null || em5Var.b == null || em5Var.n == null || em5Var.p == null || em5Var.s == null || px8Var == null || cmfVar == null) {
                c.t();
                return;
            } else {
                wifVar = new fm5(em5Var);
                wifVar.X(this.f1);
            }
        } else {
            if (zvhVar != zvhVar2) {
                qr7.y(zvhVar, "Unsupported topology: ");
                return;
            }
            vif vifVar = new vif();
            vifVar.e = this.m;
            vifVar.h = this.j0;
            vifVar.g = this.t0;
            vifVar.i = this.k;
            vifVar.j.add(new sve(this.N));
            vifVar.k.add(this.i);
            vifVar.k.add(new xve(this.N));
            vifVar.p = this.W0;
            vifVar.o = this.N;
            vifVar.m = this.n;
            vifVar.n = (ou3) this.Y.getValue();
            vifVar.a = this.e0;
            vifVar.d = this.c;
            vifVar.f = this.r;
            vifVar.c = this.c0;
            vifVar.b = this.f0;
            vifVar.q = this.i0;
            vifVar.r = z;
            vifVar.s = this.w0;
            vifVar.t = this.x0;
            vifVar.u = this.Q0;
            vifVar.w = (a5f) this.V0.getValue();
            vifVar.l.add(this.j);
            vifVar.B = this.o.o;
            xt1 xt1Var2 = this.n;
            if (((n11) xt1Var2.p.b).b) {
                if (this.Z0 == null) {
                    this.Z0 = new rig(this.L0, this.N, xt1Var2.u.a != null);
                }
                gq9Var = new gq9(this.Z0, (eq9) ((n11) this.n.p.b).c, this.z0, this.N);
            } else {
                gq9Var = null;
            }
            vifVar.v = gq9Var;
            esh eshVar = this.z0;
            vifVar.x = eshVar;
            vifVar.y = this.A0;
            vifVar.z = this;
            vifVar.A = this.V;
            px8 px8Var2 = this.i1;
            vifVar.C = px8Var2;
            cmf cmfVar2 = this.j1;
            vifVar.D = cmfVar2;
            vifVar.E = this.k1;
            vifVar.F = new i91(this);
            if (vifVar.e == null || vifVar.h == null || vifVar.g == null || vifVar.i == null || vifVar.m == null || vifVar.o == null || vifVar.f == null || vifVar.c == null || vifVar.b == null || vifVar.s == null || vifVar.u == null || eshVar == null || px8Var2 == null || cmfVar2 == null) {
                c.t();
                return;
            }
            wifVar = new wif(vifVar);
        }
        due dueVar = this.o0;
        p81 p81Var = new p81(this, 0);
        dueVar.getClass();
        dueVar.a = p81Var;
        wifVar.U(this.E);
        this.n0 = wifVar;
        ug5 ug5Var = this.Y0;
        gq9 gq9Var3 = wifVar.l;
        ((CidLogger) ug5Var.a).log("MediaAdaptation", "Set new condition provider source. Is null = " + (gq9Var3 == null));
        gq9 gq9Var4 = (gq9) ug5Var.c;
        if (gq9Var4 != null) {
            tg5 tg5Var = (tg5) ug5Var.e;
            tg5Var.getClass();
            gq9Var4.i.remove(tg5Var);
        }
        ug5Var.c = gq9Var3;
        if (gq9Var3 == null) {
            aq9 aq9Var = new aq9(1, new bq9(0.0d, 0.0d), null, true);
            ((CidLogger) ug5Var.a).log("MediaAdaptation", "Since there are no new provider, trigger state change to " + aq9Var);
            ((tg5) ug5Var.e).f(aq9Var);
        } else {
            tg5 tg5Var2 = (tg5) ug5Var.e;
            tg5Var2.getClass();
            gq9Var3.i.add(tg5Var2);
            int i = gq9Var3.g;
            bq9 bq9Var = gq9Var3.h;
            vpc vpcVarA = gq9Var3.a(i);
            if (gq9Var3.g != 1) {
                cq9 cq9Var = gq9Var3.e.a;
                z2 = true;
            } else {
                z2 = false;
            }
            aq9 aq9Var2 = new aq9(i, bq9Var, vpcVarA, z2);
            gq9Var3.c.log("MediaAdaptation", "Got new subscriber, trigger my state event: " + aq9Var2);
            tg5Var2.f(aq9Var2);
        }
        this.Y0.a(this.n0);
        boolean z3 = zvhVarW == zvhVar3;
        boolean z4 = zvhVar == zvhVar2;
        if (z3 && z4) {
            n(oh1.C, null);
        }
        zvh zvhVarW2 = this.n0.w();
        Iterator it = this.l0.iterator();
        while (it.hasNext()) {
            ((dwh) it.next()).onTopologyUpdated(zvhVarW, zvhVarW2);
        }
    }

    public final void g(String str, gt7 gt7Var, it7 it7Var, String str2) {
        SubDomain subDomain;
        ConversationEndReason conversationEndReasonB = n0m.b(it7Var, gt7Var);
        fik fikVar = this.e1;
        fikVar.E(conversationEndReasonB);
        ConversationEndReason conversationEndReasonP = fikVar.p();
        if (conversationEndReasonP instanceof ConversationEndReason.Error) {
            CallTerminatingException.Builder builder = new CallTerminatingException.Builder(Domain.SERVER, ((ConversationEndReason.Error) conversationEndReasonP).getThrowable(), str2);
            j4i j4iVar = this.k.a;
            if (cqk.d(j4iVar, i4i.a)) {
                subDomain = SubDomain.WT;
            } else {
                subDomain = cqk.d(j4iVar, h4i.a) ? SubDomain.WS : null;
            }
            this.h1 = builder.setSubDomain(subDomain).build();
        }
        n(oh1.c, gt7Var);
        q4g q4gVar = this.k;
        if (q4gVar != null) {
            q4gVar.g();
        }
        t("conversation_ended.".concat(str), it7Var);
    }

    public final void h(Map map, zvh zvhVar) {
        int i = 1;
        boolean z = !this.Q;
        if (!zvhVar.equals(zvh.b)) {
            i = this.o.e0 ? 3 : 2;
        }
        int i2 = i;
        this.d0.b(this.j0, z, i2, this.D0, this.h.d);
        ru1 ru1Var = this.j0;
        skg skgVar = this.d0;
        skgVar.g(ru1Var, map);
        Long lD = skgVar.d(i2);
        if (lD != null) {
            this.Q0.t.onMediaDataReceived(lD.longValue());
        }
    }

    public final void i(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = 0;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            try {
                arrayList.add(m91.valueOf(string));
            } catch (IllegalArgumentException unused) {
                this.N.log("OKRTCCall", c0a.o("got unknown conversation option '", string, "'"));
            }
        }
        EnumSet enumSet = this.t;
        ArrayList arrayList2 = new ArrayList(enumSet);
        arrayList2.removeAll(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.removeAll(enumSet);
        enumSet.clear();
        enumSet.addAll(arrayList);
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            c((m91) obj);
        }
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            c((m91) obj2);
        }
    }

    public final void j(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("features");
        z18 z18Var = this.O0;
        ((ljf) z18Var.b).Q(jSONObject);
        ((ljf) z18Var.b).R(jSONObject);
        boolean z = false;
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if ("ADD_PARTICIPANT".equalsIgnoreCase(jSONArrayOptJSONArray.optString(i))) {
                    z = true;
                    break;
                }
            }
        }
        boolean z2 = uza.a;
        this.N.log("OKRTCCall", "setFeatureAddParticipantEnabled, ".concat(z ? "yes" : "no"));
        if (this.s0 != z) {
            this.s0 = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r41v0, types: [o91] */
    public final void k(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        String str;
        du1 du1Var;
        String str2;
        String str3;
        zvh zvhVar;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        jb1 jb1Var;
        int i;
        String str9;
        JSONArray jSONArray;
        String str10;
        boolean z3;
        String str11;
        String str12;
        m5g m5gVarA;
        ob1 ob1VarC;
        use useVar;
        du1 du1VarL;
        String str13;
        smc smcVar;
        du1 du1Var2;
        ?? r12;
        int iOptInt;
        boolean zEquals;
        String str14 = "RecordInfoParser";
        String str15 = "Can't parse record info from parent";
        zvh zvhVar2 = zvh.b;
        oh1 oh1Var = oh1.c;
        oh1 oh1Var2 = oh1.d;
        bnf bnfVar = bnf.a;
        j(jSONObject);
        du1 du1Var3 = this.j0.a;
        String str16 = "participants";
        JSONArray jSONArray2 = jSONObject.getJSONArray("participants");
        du1 du1Var4 = this.j0.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        boolean zOptBoolean = false;
        ArrayList arrayList3 = null;
        boolean z4 = false;
        while (true) {
            str = str16;
            du1Var = du1Var3;
            str2 = str15;
            str3 = str14;
            zvhVar = zvhVar2;
            str4 = "CALLED";
            str5 = "state";
            String str17 = "id";
            String str18 = "OKRTCCall";
            if (i2 >= jSONArray2.length()) {
                JSONArray jSONArray3 = jSONArray2;
                ArrayList arrayList4 = arrayList;
                ArrayList arrayList5 = arrayList2;
                str = str;
                str6 = "hangup.in.connection.notification";
                HashSet hashSet = new HashSet();
                int size = arrayList5.size();
                for (int i3 = 0; i3 < size; i3++) {
                    hashSet.add(((smc) arrayList5.get(i3)).a);
                }
                ru1 ru1Var = this.j0;
                for (yt1 yt1Var : ru1Var.d(ru1Var.k).keySet()) {
                    if (!hashSet.contains(yt1Var)) {
                        arrayList4.add(yt1Var);
                    }
                }
                ru1 ru1Var2 = this.j0;
                ru1Var2.getClass();
                ru1Var2.o(null, arrayList4);
                ru1 ru1Var3 = this.j0;
                ru1Var3.getClass();
                ru1Var3.h(null, arrayList5);
                xr8 xr8Var = this.K0;
                p8b p8bVar = this.t0;
                xr8Var.getClass();
                ((ll5) this.J0.a).h = xr8.i(p8bVar);
                int i4 = 0;
                while (i4 < jSONArray3.length()) {
                    JSONObject jSONObject2 = jSONArray3.getJSONObject(i4);
                    boolean zOptBoolean2 = jSONObject2.optBoolean("onHold");
                    String str19 = str17;
                    yt1 yt1VarA = yt1.a(jSONObject2.optString(str19));
                    du1 du1VarL2 = this.j0.l(yt1VarA);
                    if (du1VarL2 == null) {
                        CidLogger cidLogger = this.N;
                        i = i4;
                        StringBuilder sb = new StringBuilder("unknown participant id ");
                        str9 = str19;
                        jSONArray = jSONArray3;
                        sb.append(yt1VarA.a);
                        str10 = str18;
                        cidLogger.log(str10, sb.toString());
                    } else {
                        i = i4;
                        str9 = str19;
                        jSONArray = jSONArray3;
                        str10 = str18;
                        if (du1VarL2.t != zOptBoolean2) {
                            CidLogger cidLogger2 = this.N;
                            if (zOptBoolean2) {
                                cidLogger2.log(str10, "got remote hold from participant " + du1VarL2);
                                this.l.removeMessages(131);
                                du1VarL2.t = true;
                                this.n0.E(du1VarL2);
                            } else {
                                cidLogger2.log(str10, "got remote unhold from participant " + du1VarL2);
                                du1VarL2.t = false;
                                if (!this.m1) {
                                    this.n0.F(du1VarL2);
                                }
                            }
                        }
                    }
                    int i5 = i + 1;
                    str17 = str9;
                    i4 = i5;
                    str18 = str10;
                    jSONArray3 = jSONArray;
                }
                str7 = str17;
                str8 = str18;
                jb1Var = new jb1(zOptBoolean, arrayList3, z4);
                break;
            }
            JSONArray jSONArray4 = jSONArray2;
            JSONObject jSONObject3 = jSONArray4.getJSONObject(i2);
            String string = jSONObject3.getString("state");
            yt1 yt1VarX = kql.x(jSONObject3);
            int i6 = i2;
            if (i2 == 0 || yt1VarX.equals(du1Var4.a)) {
                if (du1Var4.q == null) {
                    du1Var4.q = kql.i(jSONObject3);
                }
                if (du1Var4.a == null) {
                    du1Var4.a = yt1VarX;
                    smcVar = new smc(yt1VarX, new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new xr8());
                } else {
                    smcVar = null;
                }
                if (smcVar != null) {
                    arrayList2.add(smcVar);
                }
                int i7 = 0;
                zOptBoolean = jSONObject3.optBoolean("restricted", false);
                if (!du1Var4.c()) {
                    if ("ACCEPTED".equals(string)) {
                        n(oh1Var2, null);
                        t("accepted.on.other.device.con", null);
                        jb1Var = null;
                        str6 = "hangup.in.connection.notification";
                    } else if ("HUNGUP".equals(string)) {
                        n(oh1Var, null);
                        str6 = "hangup.in.connection.notification";
                        t(str6, null);
                        jb1Var = null;
                    }
                    str8 = str18;
                    str7 = str17;
                    break;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("permissions");
                du1Var4.r = this.N0.a.d(jSONObject3, bnfVar);
                Integer numC = kql.C(jSONObject3);
                if (numC != null) {
                    du1Var4.s = numC.intValue();
                }
                if (jSONArrayOptJSONArray != null) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                        if ("MUTE_PARTICIPANTS".equals(jSONArrayOptJSONArray.optString(i8))) {
                            this.a = true;
                            break;
                        }
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("offerTo");
                JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray("offerToTypes");
                JSONArray jSONArrayOptJSONArray4 = jSONObject3.optJSONArray("offerToDeviceIdxs");
                if (jSONArrayOptJSONArray2 != null) {
                    int i9 = 0;
                    while (i9 < jSONArrayOptJSONArray2.length()) {
                        if (jSONArrayOptJSONArray3 == null || i9 >= jSONArrayOptJSONArray3.length()) {
                            r12 = i7;
                        } else {
                            zEquals = "GROUP".equals(jSONArrayOptJSONArray3.optString(i9));
                        }
                        if (jSONArrayOptJSONArray4 == null || i9 >= jSONArrayOptJSONArray4.length()) {
                            r12 = zEquals;
                            r12 = zEquals;
                            iOptInt = i7;
                        } else {
                            r12 = zEquals;
                            iOptInt = jSONArrayOptJSONArray4.optInt(i9);
                        }
                        JSONArray jSONArray5 = jSONArrayOptJSONArray2;
                        JSONArray jSONArray6 = jSONArrayOptJSONArray3;
                        arrayList6.add(new yt1(r12 != 0 ? 2 : 1, iOptInt, Long.parseLong(jSONArrayOptJSONArray2.optString(i9))));
                        i9++;
                        jSONArrayOptJSONArray2 = jSONArray5;
                        jSONArrayOptJSONArray3 = jSONArray6;
                        i7 = 0;
                    }
                }
                ArrayList arrayListU = kql.u(jSONObject3);
                ArrayList arrayList7 = du1Var4.d;
                arrayList7.clear();
                arrayList7.addAll(arrayListU);
                n(oh1.w, du1Var4);
                zq1 zq1Var = this.F0;
                arrayList2 = arrayList2;
                arrayList = arrayList;
                du1Var2 = du1Var4;
                str = str;
                zq1Var.o(jSONObject3, "handleConversationParticipants", zq1Var.g(bnfVar, 2), true, false, bnfVar, bnfVar);
                arrayList3 = arrayList6;
            } else {
                if ("ACCEPTED".equals(string)) {
                    arrayList2.add(this.N0.f.w(yt1VarX, jSONObject3, bnfVar));
                } else if ("CALLED".equals(string)) {
                    arrayList2.add(this.N0.f.x(yt1VarX, jSONObject3, bnfVar));
                    if (qt4.e(yt1VarX.b, 2)) {
                        z4 = true;
                    }
                    du1Var2 = du1Var4;
                } else {
                    arrayList.add(yt1VarX);
                }
                du1Var2 = du1Var4;
            }
            au1 au1VarD = this.N0.e.d(jSONObject3);
            if (au1VarD != null) {
                this.Q0.n.onStateChanged(au1VarD.b, au1VarD);
            }
            i2 = i6 + 1;
            arrayList = arrayList;
            arrayList2 = arrayList2;
            str16 = str;
            du1Var4 = du1Var2;
            du1Var3 = du1Var;
            str15 = str2;
            str14 = str3;
            zvhVar2 = zvhVar;
            jSONArray2 = jSONArray4;
        }
        if (this.q && !z2) {
            this.N.log(str8, "connection already handled");
            du1 du1Var5 = this.j0.a;
            HashSet hashSet2 = new HashSet();
            JSONArray jSONArray7 = jSONObject.getJSONArray(str);
            ArrayList arrayList8 = new ArrayList();
            int i10 = 0;
            boolean z5 = false;
            while (i10 < jSONArray7.length()) {
                JSONObject jSONObject4 = jSONArray7.getJSONObject(i10);
                int i11 = i10;
                yt1 yt1VarX2 = kql.x(jSONObject4);
                JSONArray jSONArray8 = jSONArray7;
                String string2 = jSONObject4.getString(str5);
                String str20 = str5;
                if (yt1VarX2.equals(du1Var5.a)) {
                    if (du1Var5.c()) {
                        str13 = str4;
                        z5 = true;
                    } else if ("ACCEPTED".equals(string2)) {
                        n(oh1Var2, null);
                        t("accepted.on.other.device.con", null);
                        return;
                    } else {
                        if ("HUNGUP".equals(string2)) {
                            n(oh1Var, null);
                            t(str6, null);
                            return;
                        }
                        str13 = str4;
                    }
                } else if ("ACCEPTED".equals(string2)) {
                    hashSet2.add(yt1VarX2);
                    arrayList8.add(this.N0.f.w(yt1VarX2, jSONObject4, bnfVar));
                    str13 = str4;
                } else {
                    str13 = str4;
                    if (str13.equals(string2)) {
                        hashSet2.add(yt1VarX2);
                        arrayList8.add(this.N0.f.x(yt1VarX2, jSONObject4, bnfVar));
                    }
                }
                i10 = i11 + 1;
                jSONArray7 = jSONArray8;
                str4 = str13;
                str5 = str20;
            }
            ru1 ru1Var4 = this.j0;
            ru1Var4.getClass();
            ru1Var4.h(null, arrayList8);
            if (hashSet2.isEmpty() && !z5) {
                this.N.log(str8, "Conversation has no participants");
                this.e1.E(new ConversationEndReason.Error(new CallTerminatingException.Builder(Domain.INTERNAL, new IllegalStateException("Conversation without participants and current user")).build()));
                n(oh1.l, null);
                t("conversation.without.participants", null);
                return;
            }
            ru1 ru1Var5 = this.j0;
            Set<yt1> setKeySet = ru1Var5.d(ru1Var5.k).keySet();
            ArrayList arrayList9 = new ArrayList();
            for (yt1 yt1Var2 : setKeySet) {
                if (!hashSet2.contains(yt1Var2)) {
                    arrayList9.add(yt1Var2);
                }
            }
            ru1 ru1Var6 = this.j0;
            ru1Var6.getClass();
            ru1Var6.o(null, arrayList9);
            xr8 xr8Var2 = this.K0;
            p8b p8bVar2 = this.t0;
            xr8Var2.getClass();
            ((ll5) this.J0.a).h = xr8.i(p8bVar2);
            this.N.log(str8, "handleNewTopology");
            zvh zvhVarA = zvh.a(jSONObject.getString("topology"));
            if (!this.n0.I(zvhVarA)) {
                f(zvhVarA, false);
            }
            d(this.n0, 1);
            return;
        }
        this.q = true;
        this.N.log(str8, "connected");
        lml.c(this.x, jSONObject.getString(str7));
        if (jSONObject.has(ApiProtocol.PARAM_JOIN_LINK)) {
            this.z = jSONObject.getString(ApiProtocol.PARAM_JOIN_LINK);
        }
        if (z) {
            this.K = true;
        } else if (this.K) {
            this.N.log(str8, "onConnected isConcurrent from api");
        }
        if (jb1Var == null) {
            return;
        }
        zvh zvhVarA2 = zvh.a(jSONObject.optString("topology"));
        if (zvhVarA2 == zvh.a) {
            this.N.logException(str8, "conn.notify.topology", new Exception("invalid.topology.identity." + zvhVarA2));
            zvh zvhVar3 = this.j0.u() > 1 ? zvh.c : zvhVar;
            this.N.log(str8, "Unknown topology specified (" + zvhVarA2 + ") , use " + zvhVar3);
            zvhVarA2 = zvhVar3;
        }
        if (this.K) {
            this.N.log(str8, "   isConcurrent");
            z3 = false;
            if (this.v) {
                f(zvhVarA2, false);
            }
            this.v = false;
        } else {
            z3 = false;
        }
        if (!this.n0.I(zvhVarA2) || z2) {
            f(zvhVarA2, z3);
        }
        List list = (List) jb1Var.d;
        if (list != null && this.n0.I(zvhVar)) {
            this.i1.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    du1VarL = this.j0.l((yt1) it.next());
                } catch (NumberFormatException unused) {
                    this.N.log(str8, "Cant get participant id from responders");
                    du1VarL = null;
                }
                if (du1VarL != null) {
                    this.n0.r(du1VarL, false);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("options");
        if (jSONArrayOptJSONArray5 != null) {
            i(jSONArrayOptJSONArray5);
        }
        if (this.v || this.w) {
            this.E0 = jb1Var.b;
            boolean z6 = jb1Var.b;
            xq1 xq1Var = this.Q0;
            if (z6) {
                xq1Var.d.onMeInWaitingRoomChanged(true);
            } else {
                xq1Var.d.onMeInWaitingRoomChanged(false);
                d(this.n0, 1);
                if (this.t.contains(m91.b)) {
                    this.Q0.w.onWaitingHallEnabledChanged();
                }
            }
        } else {
            d(this.n0, 1);
        }
        if (this.K && !jb1Var.b) {
            boolean zC = du1Var.c();
            H();
            if (zC) {
                B();
            }
        }
        yig yigVar = this.L0;
        aak aakVar = this.a0;
        yigVar.getClass();
        aakVar.getClass();
        Handler handler = yigVar.g;
        if (cqk.d(handler.getLooper().getThread(), Thread.currentThread())) {
            yigVar.h.remove(aakVar);
        } else {
            handler.post(new uig(yigVar, aakVar, 1));
        }
        this.L0.b(this.a0);
        yig yigVar2 = this.L0;
        mdk mdkVar = this.b0;
        yigVar2.getClass();
        mdkVar.getClass();
        yigVar2.i.remove(mdkVar);
        yig yigVar3 = this.L0;
        mdk mdkVar2 = this.b0;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        yigVar3.a(mdkVar2, 5L, timeUnit);
        yig yigVar4 = this.L0;
        xig xigVar = yigVar4.l;
        Handler handler2 = yigVar4.g;
        if (!yigVar4.f) {
            handler2.removeCallbacks(xigVar);
            handler2.postDelayed(xigVar, 1000L);
        }
        vx8 vx8Var = yigVar4.j;
        if (vx8Var != null) {
            oo5.a(vx8Var);
        }
        yigVar4.j = null;
        vqb vqbVarE = new xqb(fqb.a(1L, 1L, timeUnit, i3f.a()).e(th.a()), new c4h(9, yigVar4), 0).e(i3f.a()).e(th.a());
        vx8 vx8Var2 = new vx8(new fpi(2, yigVar4), vm9.f);
        vqbVarE.f(vx8Var2);
        yigVar4.j = vx8Var2;
        if (jb1Var.c) {
            n(oh1.k, null);
        }
        long j = -jSONObject.optLong("tamtamMultichatId");
        this.Z = j;
        if (j != 0) {
            n(oh1.p, Long.valueOf(j));
        }
        kw1 kw1Var = (kw1) this.T0.getValue();
        kw1Var.getClass();
        cnc cncVar = kw1Var.a;
        cncVar.getClass();
        try {
            if (jSONObject.has("recordInfo")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("recordInfo");
                jSONObject5.getClass();
                try {
                    m5gVarA = cnc.a(jSONObject5);
                } catch (JSONException e) {
                    str11 = str3;
                    try {
                        cncVar.a.logException(str11, "Can't parse record info", e);
                        m5gVarA = null;
                    } catch (JSONException e2) {
                        e = e2;
                        str12 = str2;
                        cncVar.a.logException(str11, str12, e);
                        m5gVarA = null;
                    }
                }
                str12 = str2;
            } else {
                str12 = str2;
                m5gVarA = null;
            }
        } catch (JSONException e3) {
            e = e3;
            str11 = str3;
            str12 = str2;
            cncVar.a.logException(str11, str12, e);
            m5gVarA = null;
        }
        if (m5gVarA != null) {
            kw1Var.b.i.onRecordStarted(new hw1(bnfVar, tgl.b(m5gVarA)));
        }
        boolean zIsNull = jSONObject.isNull("pinnedParticipantId");
        String strOptString = jSONObject.optString("pinnedParticipantId", null);
        if (zIsNull || strOptString == null) {
            this.C0 = null;
        } else {
            this.C0 = yt1.a(strOptString);
        }
        ((ljf) this.O0.d).J(jSONObject);
        tb1 tb1Var = (tb1) this.U0.getValue();
        tb1Var.getClass();
        tx txVar = tb1Var.a;
        txVar.getClass();
        try {
            if (jSONObject.has("asrInfo")) {
                JSONObject jSONObject6 = jSONObject.getJSONObject("asrInfo");
                jSONObject6.getClass();
                ob1VarC = tx.c(jSONObject6);
            } else {
                ob1VarC = null;
            }
        } catch (JSONException e4) {
            txVar.a.logException("AsrParser", str12, e4);
        }
        if (ob1VarC != null) {
            tb1Var.b.m.onAsrRecordStarted(new pb1(bnfVar, ob1VarC));
        }
        h6f h6fVar = (h6f) this.O0.h;
        h6fVar.getClass();
        wmc wmcVar = (wmc) h6fVar.c;
        wmcVar.getClass();
        try {
            if (jSONObject.has("urlSharingInfo")) {
                JSONObject jSONObject7 = jSONObject.getJSONObject("urlSharingInfo");
                jSONObject7.getClass();
                useVar = new use(yt1.a(jSONObject7.getString("initiatorId")), f6m.d(jSONObject7, "sharedUrl"), iw8.k(jSONObject7));
            } else {
                useVar = null;
            }
        } catch (JSONException e5) {
            wmcVar.a.logException("UrlSharingParser", "Can't parse url sharing", e5);
        }
        if (useVar == null) {
            return;
        }
        zki zkiVar = (zki) h6fVar.b;
        dnf dnfVar = useVar.c;
        String str21 = useVar.b;
        zkiVar.onUrlSharingInfoUpdated(new o42(dnfVar, str21 != null ? new c6g(useVar.a, str21) : null));
    }

    public final void l() {
        boolean z = false;
        if (!this.h0.c) {
            p8b p8bVar = this.t0;
            if (p8bVar.e) {
                p8bVar.e = false;
                p8bVar.a();
            }
        }
        if (this.h0.d) {
            if (this.y) {
                zq1 zq1Var = this.F0;
                o0a o0aVar = zq1Var.i.b;
                o0a o0aVar2 = o0a.a;
                if ((o0aVar == o0aVar2 && zq1Var.h(this.j0.k).b == o0aVar2) || y(this.j0.a)) {
                    z = true;
                }
            }
            if (z) {
                p(true);
            }
        } else {
            p8b p8bVar2 = this.t0;
            if (p8bVar2.f) {
                p8bVar2.f = false;
                p8bVar2.a();
            }
        }
        this.N.log("OKRTCCall", "Apply permissions to media settings. Call type: ".concat(z ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND));
    }

    public final void m(yt1 yt1Var, Boolean bool, Boolean bool2, n4g n4gVar) {
        CidLogger cidLogger = this.N;
        cidLogger.log("OKRTCCall", "addParticipant, participant=" + yt1Var);
        if (q()) {
            try {
                q4g q4gVar = this.k;
                boolean zBooleanValue = bool2.booleanValue();
                JSONObject jSONObject = new JSONObject();
                kql.d(yt1Var, jSONObject, false);
                q4gVar.d(kql.a(jSONObject, bool, zBooleanValue), false, new x81(this, yt1Var, n4gVar, 0), n4gVar);
            } catch (JSONException e) {
                cidLogger.reportException("OKRTCCall", "add.participant", e);
            }
        }
    }

    public final void n(oh1 oh1Var, Object obj) {
        CidLogger cidLogger = this.N;
        cidLogger.log("OKRTCCall", "dispatch [ " + oh1Var + " ]");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.l.post(new i0(this, oh1Var, obj, 7));
            return;
        }
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            try {
                ((l91) obj2).onEvent(this, oh1Var, obj);
            } catch (Throwable th) {
                cidLogger.logException("OKRTCCall", "Error on dispatch event " + oh1Var, th);
            }
        }
    }

    public final void o(JSONObject jSONObject) {
        try {
            if (jSONObject.has("rooms")) {
                xde xdeVar = (xde) this.O0.c;
                JSONObject jSONObject2 = jSONObject.getJSONObject("rooms");
                xdeVar.getClass();
                jSONObject2.getClass();
                o5g o5gVarR = ((ewe) xdeVar.d).r(jSONObject2);
                if (o5gVarR == null) {
                    return;
                }
                ((i12) xdeVar.e).f(o5gVarR);
            }
        } catch (JSONException e) {
            this.N.logException("OKRTCCall", "Can't parse rooms from connection", e);
        }
    }

    @Override // org.webrtc.NetworkMonitor.NetworkObserver
    public final void onConnectionTypeChanged(NetworkChangeDetector.ConnectionType connectionType) {
        this.l.post(new j91(this, connectionType != NetworkChangeDetector.ConnectionType.CONNECTION_NONE));
    }

    public final void p(boolean z) {
        if (q()) {
            if (z) {
                this.h0.a();
            }
            zq1 zq1Var = this.F0;
            if (!z) {
                zq1Var.getClass();
            } else if (!zq1Var.e.d || !zq1.d(new jc1(0, 13, n8b.class, zq1Var.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                return;
            }
            if (z && this.t0.g) {
                nl nlVar = this.x0;
                if (nlVar.i) {
                    nlVar.f.t();
                }
            }
            this.N.log("OKRTCCall", "Update my settings with video enabled=" + z);
            p8b p8bVar = this.t0;
            if (p8bVar.f != z) {
                p8bVar.f = z;
                p8bVar.a();
            }
            n(oh1.e, null);
        }
    }

    public final boolean q() {
        if (!this.u) {
            return true;
        }
        this.N.log("OKRTCCall", "Call is already destroyed, reason=" + this.p);
        return false;
    }

    public final void r(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            if (jSONObjectOptJSONObject.opt("sdk") == null) {
                this.l.post(new i0(this, kql.w(jSONObject), jSONObjectOptJSONObject, 8));
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("sdk");
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optString("type").equals("bad-net") && this.P) {
                zn0 zn0Var = this.O;
                zn0Var.getClass();
                if ("bad-net".equals(jSONObjectOptJSONObject2.optString("type"))) {
                    zn0Var.m = jSONObjectOptJSONObject2.optBoolean(SdkMetricStatEvent.VALUE_KEY);
                    zn0Var.n = jSONObjectOptJSONObject2.has(SdkMetricStatEvent.VALUE_KEY);
                    zn0Var.o = jSONObjectOptJSONObject2.optDouble(RttRateHintConfig.RTT);
                    zn0Var.p = jSONObjectOptJSONObject2.optDouble("loss");
                    zn0Var.a();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [w81] */
    /* JADX WARN: Type inference failed for: r6v1, types: [w81] */
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
    public final void s(boolean z, p pVar, final l lVar) {
        CidLogger cidLogger = this.N;
        final int i = 1;
        final int i2 = 0;
        if (!z) {
            cidLogger.log("OKRTCCall", "self initiated unhold");
            this.m1 = false;
            this.n0.Z(new c91(this, pVar, 0), new sg4(this) { // from class: w81
                public final /* synthetic */ o91 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i;
                    l lVar2 = lVar;
                    o91 o91Var = this.b;
                    ky7 ky7Var = (ky7) obj;
                    switch (i3) {
                        case 0:
                            o91Var.m1 = false;
                            lVar2.accept(ky7Var);
                            break;
                        default:
                            o91Var.m1 = true;
                            lVar2.accept(ky7Var);
                            break;
                    }
                }
            });
            return;
        }
        cidLogger.log("OKRTCCall", "self initiated hold");
        this.m1 = true;
        if (this.E0) {
            e(it7.c);
            pVar.accept(null);
        } else {
            ?? r5 = new sg4(this) { // from class: w81
                public final /* synthetic */ o91 b;

                {
                    this.b = this;
                }

                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i2;
                    l lVar2 = lVar;
                    o91 o91Var = this.b;
                    ky7 ky7Var = (ky7) obj;
                    switch (i3) {
                        case 0:
                            o91Var.m1 = false;
                            lVar2.accept(ky7Var);
                            break;
                        default:
                            o91Var.m1 = true;
                            lVar2.accept(ky7Var);
                            break;
                    }
                }
            };
            this.n0.H(new c91(this, pVar, 1), r5);
        }
    }

    public final void t(String str, it7 it7Var) {
        long jElapsedRealtime;
        int i;
        Long lA;
        this.N.log("OKRTCCall", "destroy.reason=".concat(str));
        uza.d();
        if (this.u) {
            this.N.log("OKRTCCall", "   already destroyed, reason=" + this.p);
            return;
        }
        this.u = true;
        this.e1.E(n0m.b(it7Var, null));
        ec1 ec1Var = this.M0.k;
        esh eshVar = (esh) ec1Var.e;
        g85 g85Var = (g85) ec1Var.d;
        g85Var.d = null;
        try {
            ((Context) g85Var.a).unregisterReceiver((cg) g85Var.e);
        } catch (Exception e) {
            ((CidLogger) g85Var.b).log("CallBatteryRetriever", "Can't unregister BroadcastReceiver: " + e.getMessage());
        }
        dc1 dc1Var = (dc1) ec1Var.f;
        if (dc1Var != null && ec1Var.b) {
            dc1 dc1Var2 = (dc1) ec1Var.g;
            dc1 dc1Var3 = (dc1) ec1Var.h;
            if (dc1Var2 == null || dc1Var3 == null) {
                ((gsh) eshVar).getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime() - dc1Var.b;
                i = 0;
            } else {
                i = dc1Var3.a - dc1Var2.a;
                jElapsedRealtime = dc1Var3.b - dc1Var2.b;
            }
            if (jElapsedRealtime != 0 && (lA = ((gsh) eshVar).a()) != null) {
                Map mapQ0 = wm9.Q0(new ylc("battery_level_change", EventItemValueKt.toEventItemValue(Math.abs(i))), new ylc("stat_time_delta", EventItemValueKt.toEventItemValue(jElapsedRealtime)), new ylc("timestamp", EventItemValueKt.toEventItemValue(lA.longValue())));
                EventItemsMap eventItemsMap = (EventItemsMap) ec1Var.j;
                if (eventItemsMap != null) {
                    ((CallAnalyticsSender) ec1Var.c).send(new SdkIntervalStatEvent.Builder().addAll(new EventItemsMap(wm9.T0(eventItemsMap.getItems(), mapQ0))).build());
                }
            }
        }
        h9 h9Var = this.M0.m;
        h9Var.b.b();
        h9Var.c.b = null;
        this.l0.remove(this.M0);
        qs1 qs1Var = this.s;
        if (qs1Var != null) {
            qs1Var.b();
        }
        nl nlVar = this.x0;
        nlVar.f.t();
        km kmVar = nlVar.h;
        if (!kmVar.p) {
            kmVar.p = true;
            kmVar.g.removeCallbacksAndMessages(null);
            kmVar.g.postAtFrontOfQueue(new c3(4, kmVar));
            kmVar.o.b();
            kmVar.f.quitSafely();
            kmVar.j.clear();
            kmVar.h.quitSafely();
            kmVar.c.getClass();
        }
        NetworkMonitor.getInstance().removeObserver(this);
        this.k0.clear();
        this.l0.clear();
        yig yigVar = this.L0;
        yigVar.k = true;
        yigVar.g.removeCallbacks(yigVar.l);
        yigVar.h.clear();
        vx8 vx8Var = yigVar.j;
        if (vx8Var != null) {
            oo5.a(vx8Var);
        }
        yigVar.j = null;
        this.l.removeMessages(131);
        this.l.removeMessages(132);
        this.n0.O();
        ug5 ug5Var = this.Y0;
        if (ug5Var != null) {
            ug5Var.b(this.n0);
        }
        this.n0 = new cw5(this.j0, this.n, this.N, this.Q0, this.z0, this.i1, this.k1);
        due dueVar = this.o0;
        p81 p81Var = new p81(this, 4);
        dueVar.getClass();
        dueVar.a = p81Var;
        j42 j42Var = this.p0;
        if (j42Var != null) {
            j42Var.O();
            this.p0 = null;
        }
        rig rigVar = this.Z0;
        if (rigVar != null) {
            yig yigVar2 = rigVar.a;
            yigVar2.getClass();
            yigVar2.i.remove(rigVar);
        }
        this.p = str;
        if (this.D) {
            this.A = (SystemClock.elapsedRealtime() - this.B) + this.A;
            this.D = false;
        }
        long j = this.A;
        if (j == 0) {
            this.i1.getClass();
        } else {
            long j2 = j / 60000;
            this.A = j2;
            this.A = Math.min(j2, 10L);
            this.i1.getClass();
        }
        q4g q4gVar = this.k;
        if (q4gVar != null && this.R) {
            q4gVar.i(this.e);
            this.k.l.remove(this.f);
            this.k.m.remove(this.g);
            this.k.g();
            this.k = null;
        }
        this.j0.i();
        ru1 ru1Var = this.j0;
        ru1Var.e.b = c76.a;
        ru1Var.i = null;
        ru1Var.f.clear();
        ru1Var.g.clear();
        ru1Var.h.clear();
        ru1Var.c.f();
        szf szfVar = this.f0;
        szfVar.p = null;
        sb9 sb9Var = szfVar.o;
        if (sb9Var != null) {
            sb9Var.j(null);
        }
        szf szfVar2 = this.f0;
        szfVar2.k.log("SlmsSource", "release");
        szfVar2.n.clear();
        szfVar2.e.a.remove(szfVar2);
        szfVar2.c.a.execute(new h7b(28, szfVar2));
        this.g0.i = null;
        zzf zzfVar = this.e0;
        zzfVar.b.log("SharedPeerConnectionFac", "release");
        zzfVar.a.execute(new xzf(zzfVar, 1));
        this.c.execute(new j91(this, 3));
        n(oh1.h, null);
        this.C0 = null;
        this.F0.getClass();
        vx8 vx8Var2 = (vx8) this.J0.c;
        vx8Var2.getClass();
        oo5.a(vx8Var2);
        h32 h32Var = this.M0;
        jb1 jb1Var = h32Var.a;
        jb1Var.b = true;
        ((CallAnalyticsSender) jb1Var.d).setIdle(true, false);
        g85 g85Var2 = h32Var.h;
        ((w74) g85Var2.e).dispose();
        g85Var2.e = new w74();
        gi1 gi1Var = h32Var.i;
        gi1Var.getClass();
        EventItemsMap eventItemsMap2 = new EventItemsMap();
        gi1Var.c.b(eventItemsMap2);
        gi1Var.d.h(eventItemsMap2);
        gi1Var.e.q(eventItemsMap2);
        gi1Var.c(eventItemsMap2);
        vx8 vx8Var3 = (vx8) this.b1.e;
        vx8Var3.getClass();
        oo5.a(vx8Var3);
        AndroidVideoDecoder.errorCallback = null;
        ((w74) this.d1.c).dispose();
    }

    public final du1 u() {
        ru1 ru1Var = this.j0;
        int iU = ru1Var.u();
        if (iU == 0) {
            return null;
        }
        if (iU == 1) {
            return (du1) ru1Var.j().iterator().next();
        }
        ore.q("group call");
        return null;
    }

    public final yt1 v() {
        ru1 ru1Var = this.j0;
        ru1Var.getClass();
        ArrayList arrayList = new ArrayList(ru1Var.d(ru1Var.k).keySet());
        if (arrayList.size() == 1) {
            return (yt1) arrayList.get(0);
        }
        return null;
    }

    public final void w(p4g p4gVar, List list) {
        Intent intentRegisterReceiver;
        this.i1.getClass();
        CidLogger cidLogger = this.N;
        cidLogger.log("OKRTCCall", "init");
        uza.d();
        if (this.G) {
            ore.k("Is already initialized");
            return;
        }
        boolean z = true;
        this.G = true;
        p4gVar.getClass();
        qs4 qs4Var = this.x;
        qs4Var.getClass();
        xt1 xt1Var = this.n;
        wt1 wt1Var = xt1Var.b;
        boolean z2 = xt1Var.k;
        v88 v88Var = this.o;
        boolean z3 = v88Var.e;
        eh6 eh6Var = v88Var.F;
        dc1 dc1Var = null;
        q4g q4gVar = new q4g(p4gVar, qs4Var, cidLogger, z2, z3, v88Var.b0, eh6Var == eh6.a ? null : new s63(28, eh6Var), v88Var.d0 ? new lcb(this.m, cidLogger) : null);
        this.k = q4gVar;
        q4gVar.l.add(this.f);
        this.k.m.add(this.g);
        this.E = list;
        StringBuilder sb = new StringBuilder();
        ru1 ru1Var = this.j0;
        sb.append(ru1Var.u());
        sb.append(" participants");
        cidLogger.log("OKRTCCall", sb.toString());
        if (ru1Var.u() > 1) {
            f(zvh.c, false);
        } else if (ru1Var.u() == 1) {
            f(zvh.b, false);
            if (this.v && !this.K) {
                this.n0.N();
            }
        }
        this.k.k.add(this.e);
        if (this.P) {
            this.O.k.add(new mik(this));
        }
        ec1 ec1Var = this.M0.k;
        g85 g85Var = (g85) ec1Var.d;
        g85Var.d = (ft0) ec1Var.i;
        try {
            intentRegisterReceiver = ((Context) g85Var.a).registerReceiver((cg) g85Var.e, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception e) {
            ((CidLogger) g85Var.b).log("CallBatteryRetriever", "Can't register BroadcastReceiver: " + e.getMessage());
            intentRegisterReceiver = null;
        }
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("level", 0);
            ((gsh) ((esh) g85Var.c)).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int intExtra2 = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra2 != 2 && intExtra2 != 5) {
                z = false;
            }
            dc1Var = new dc1(z, jElapsedRealtime, intExtra);
        }
        ec1Var.f = dc1Var;
    }

    public final boolean x() {
        return this.v ? this.M.b : this.v0;
    }

    public final void z() {
        jf jfVar = this.l;
        jfVar.removeMessages(131);
        Message messageObtain = Message.obtain(jfVar, 131);
        wt1 wt1Var = this.n.b;
        jfVar.sendMessageDelayed(messageObtain, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}
