package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CropAndScaleParamsProvider;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j42 implements y91, w52, o8b, zp9 {
    public boolean b;
    public Runnable c;
    public final xt1 d;
    public final y3e e;
    public final bw6 f;
    public final szf g;
    public final p8b i;
    public final ru1 j;
    public final xq1 k;
    public final gq9 l;
    public o91 m;
    public final esh n;
    public boolean p;
    public vpc q;
    public final a4f r;
    public long s;
    public long t;
    public final t32 u;
    public final CropAndScaleParamsProvider v;
    public final q4g w;
    public final sah x;
    public final Handler a = new Handler(Looper.getMainLooper());
    public ArrayList h = null;
    public int o = 0;

    public j42(ru1 ru1Var, p8b p8bVar, xt1 xt1Var, y3e y3eVar, bw6 bw6Var, szf szfVar, xq1 xq1Var, gq9 gq9Var, a4f a4fVar, esh eshVar, t32 t32Var, CropAndScaleParamsProvider cropAndScaleParamsProvider, q4g q4gVar, sah sahVar) {
        uza.d();
        this.u = t32Var;
        this.v = cropAndScaleParamsProvider;
        this.d = xt1Var;
        this.e = y3eVar;
        this.f = bw6Var;
        this.j = ru1Var;
        this.i = p8bVar;
        this.k = xq1Var;
        xq1Var.getClass();
        k9 k9Var = xq1Var.a;
        k9Var.getClass();
        k9Var.a.add(this);
        k3j k3jVar = xq1Var.l;
        k3jVar.getClass();
        k3jVar.a.add(this);
        p8bVar.a.add(this);
        this.g = szfVar;
        this.l = gq9Var;
        this.r = a4fVar;
        this.n = eshVar;
        this.w = q4gVar;
        this.x = sahVar;
    }

    public static String z(int i) {
        if (i != 0) {
            return i != 2 ? "ACTIVE" : "HOLD";
        }
        return "PASSIVE";
    }

    public void A(wig wigVar) {
    }

    public abstract String B();

    public void C(yt1 yt1Var, List list, boolean z, u81 u81Var) {
    }

    public void D() {
    }

    public void E(du1 du1Var) {
    }

    public void F(du1 du1Var) {
    }

    public void G(int i) {
    }

    public void H(c91 c91Var, w81 w81Var) {
    }

    public final boolean I(zvh zvhVar) {
        return w().equals(zvhVar);
    }

    public final boolean J() {
        return this.o == 1;
    }

    public boolean K() {
        return false;
    }

    public final void L() {
        if (this.b) {
            return;
        }
        wt1 wt1Var = this.d.b;
        if (this.c == null) {
            this.c = u();
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.postDelayed(runnable, 10000L);
            ((gsh) this.n).getClass();
            this.t = SystemClock.elapsedRealtime();
        }
    }

    public void M(yt1 yt1Var, dnf dnfVar, boolean z, v81 v81Var) {
    }

    public void N() {
    }

    public void O() {
        uza.d();
        gq9 gq9Var = this.l;
        if (gq9Var != null) {
            gq9Var.c.log("MediaAdaptation", "Releasing media adaptation controller");
            rig rigVar = gq9Var.a;
            rigVar.getClass();
            rigVar.j.remove(gq9Var);
        }
        this.i.a.remove(this);
        xq1 xq1Var = this.k;
        xq1Var.getClass();
        k9 k9Var = xq1Var.a;
        k9Var.getClass();
        k9Var.a.remove(this);
        this.m = null;
        Runnable runnable = this.c;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
        }
    }

    public void P(long j, long j2) {
    }

    public void Q(a4e a4eVar) {
    }

    public void R(boolean z) {
    }

    public void S(jkg jkgVar) {
    }

    public final void T(boolean z, tif tifVar, final sg4 sg4Var, final sg4 sg4Var2) throws JSONException {
        if (((Boolean) this.x.get()).booleanValue()) {
            sg4Var.accept(null);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "hold");
        jSONObject.put("hold", z);
        if (tifVar != null) {
            jSONObject.put(ApiProtocol.PARAM_CAPABILITIES, kql.c(tifVar));
        }
        final int i = 0;
        final int i2 = 1;
        this.w.d(new vj7(jSONObject, 0), false, new n4g() { // from class: i42
            @Override // defpackage.n4g
            public final void onResponse(JSONObject jSONObject2) {
                int i3 = i;
                sg4 sg4Var3 = sg4Var;
                switch (i3) {
                    case 0:
                        sg4Var3.accept(null);
                        break;
                    default:
                        sg4Var3.accept(new ky7("error".equals(jSONObject2.optString("type")) ? jSONObject2.optString("message") : jSONObject2.toString()));
                        break;
                }
            }
        }, new n4g() { // from class: i42
            @Override // defpackage.n4g
            public final void onResponse(JSONObject jSONObject2) {
                int i3 = i2;
                sg4 sg4Var3 = sg4Var2;
                switch (i3) {
                    case 0:
                        sg4Var3.accept(null);
                        break;
                    default:
                        sg4Var3.accept(new ky7("error".equals(jSONObject2.optString("type")) ? jSONObject2.optString("message") : jSONObject2.toString()));
                        break;
                }
            }
        });
    }

    public boolean U(List list) {
        uza.d();
        ArrayList arrayList = this.h;
        if (arrayList != null && arrayList.equals(list)) {
            return false;
        }
        ArrayList arrayList2 = this.h;
        if (arrayList2 == null) {
            this.h = new ArrayList(list != null ? list.size() : 0);
        } else {
            arrayList2.clear();
        }
        if (list == null) {
            return true;
        }
        this.h.addAll(list);
        return true;
    }

    public void V(x52 x52Var, List list) {
    }

    public final void W(int i) {
        uza.d();
        if (i != this.o) {
            this.o = i;
            G(i);
        }
    }

    public void X(boolean z) {
    }

    public final void Y(String str) {
        this.e.log(B(), str);
    }

    public void Z(c91 c91Var, w81 w81Var) {
    }

    public void a0(List list) {
    }

    public abstract void b0(vpc vpcVar);

    public final void c0(String str) {
        this.e.log(B(), str);
    }

    @Override // defpackage.zp9
    public final void f(aq9 aq9Var) {
        if (J()) {
            vpc vpcVar = aq9Var.c;
            if (vpcVar == null) {
                vpcVar = this.q;
            }
            b0(vpcVar);
        }
    }

    @Override // defpackage.w52
    public void j(uik uikVar) {
    }

    @Override // defpackage.o8b
    public void l(p8b p8bVar) {
    }

    @Override // defpackage.y91
    public void onActiveParticipantUpdated(x91 x91Var) {
    }

    @Override // defpackage.y91
    public void onActiveParticipantsAdded(t91 t91Var) {
    }

    @Override // defpackage.y91
    public void onActiveParticipantsChanged(u91 u91Var) {
    }

    @Override // defpackage.y91
    public void onActiveParticipantsDeAnonimized(v91 v91Var) {
    }

    @Override // defpackage.y91
    public void onActiveParticipantsRemoved(w91 w91Var) {
    }

    public void p() {
    }

    public void q(yt1 yt1Var, SessionDescription sessionDescription) {
    }

    public void r(du1 du1Var, boolean z) {
    }

    public void s(boolean z) {
    }

    public final void t(String str) {
        this.e.log(B(), str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('@');
        boolean z = uza.a;
        sb.append(Integer.toString(System.identityHashCode(this)));
        sb.append('{');
        sb.append(z(this.o));
        sb.append('}');
        return sb.toString();
    }

    public abstract Runnable u();

    public final List v() {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Object obj : arrayList) {
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public abstract zvh w();

    public final du1 x(yt1 yt1Var) {
        if (yt1Var != null) {
            return this.j.l(yt1Var);
        }
        return null;
    }

    public Map y() {
        return null;
    }
}
