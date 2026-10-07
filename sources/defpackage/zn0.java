package defpackage;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class zn0 {
    public final boolean d;
    public final boolean l;
    public boolean m;
    public boolean n;
    public double o;
    public double p;
    public final x3k a = new x3k();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final x36 b = new x36();
    public final x36 c = new x36();
    public final yi9 g = new yi9();
    public final yi9 h = new yi9();
    public final uw e = new uw(7);
    public final uw f = new uw(7);
    public final dak i = new dak();
    public final dak j = new dak();

    public zn0(boolean z, boolean z2) {
        this.l = z2;
        this.d = z;
    }

    public static boolean b(x3k x3kVar, double d, double d2, double d3, xn0 xn0Var) {
        if (d > d3 && d3 > 0.0d) {
            return x3kVar.a(xn0Var, true);
        }
        if (d >= d2 || d2 <= 0.0d) {
            return false;
        }
        return x3kVar.a(xn0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [int] */
    public final void a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean zA;
        yt1 yt1VarV;
        xn0 xn0Var = xn0.e;
        xn0 xn0Var2 = xn0.d;
        xn0 xn0Var3 = xn0.a;
        xn0 xn0Var4 = xn0.c;
        xn0 xn0Var5 = xn0.b;
        boolean z4 = this.a.b == 0;
        boolean zB = b(this.a, this.b.b, this.i.a, this.j.a, xn0Var5) | b(this.a, this.c.b, this.i.b, this.j.b, xn0Var4);
        boolean z5 = this.n;
        x3k x3kVar = this.a;
        boolean zA2 = (z5 ? x3kVar.a(xn0Var3, this.m) : x3kVar.a(xn0Var3, false)) | zB;
        if (!this.l || Double.isNaN(this.o) || Double.isNaN(this.p)) {
            z = z4;
            z2 = true;
            z3 = false;
            zA = zA2 | this.a.a(xn0Var, false) | this.a.a(xn0Var2, false);
        } else {
            z = z4;
            z3 = false;
            z2 = true;
            zA = b(this.a, this.p, this.i.b, this.j.b, xn0Var) | zA2 | b(this.a, this.o, this.i.a, this.j.a, xn0Var2);
        }
        if (zA) {
            x3k x3kVar2 = this.a;
            boolean z6 = x3kVar2.b == 0 ? z2 : z3;
            HashSet hashSet = new HashSet();
            xn0[] xn0VarArrValues = xn0.values();
            ?? r5 = z3;
            while (true) {
                boolean[] zArr = x3kVar2.a;
                if (r5 >= zArr.length) {
                    break;
                }
                if (zArr[r5]) {
                    hashSet.add(xn0VarArrValues[r5]);
                }
                r5++;
            }
            for (yn0 yn0Var : this.k) {
                if (z6 != z) {
                    if (z6) {
                        yn0Var.getClass();
                    } else {
                        yn0Var.getClass();
                    }
                }
                mik mikVar = (mik) yn0Var;
                o91 o91Var = mikVar.b;
                boolean z7 = o91Var.n.u.c.a;
                if (!o91Var.u && o91Var.n0.I(zvh.b) && !z7 && (yt1VarV = o91Var.v()) != null) {
                    if (!mikVar.a && (hashSet.contains(xn0Var5) || hashSet.contains(xn0Var4))) {
                        mikVar.a = z2;
                        o91Var.k.k(qdl.a(yt1VarV, z2));
                    } else if (mikVar.a && !hashSet.contains(xn0Var5) && !hashSet.contains(xn0Var4)) {
                        mikVar.a = z3;
                        o91Var.k.k(qdl.a(yt1VarV, z3));
                    }
                }
            }
        }
    }

    public final void c(p5a p5aVar, boolean z, long j) {
        double d;
        double dA;
        double dA2;
        double d2;
        long jMax = Math.max(p5aVar.i, p5aVar.h);
        if (jMax > 0) {
            this.b.a(jMax);
        }
        if (this.d) {
            dA = this.g.a(p5aVar.e, p5aVar.g);
            dA2 = this.h.a(p5aVar.d, p5aVar.f);
            d = 0.0d;
        } else {
            uw uwVar = this.e;
            long j2 = p5aVar.e;
            long j3 = p5aVar.g;
            long j4 = j2 - uwVar.b;
            long j5 = j3 - uwVar.c;
            double d3 = j5 != 0 ? j4 / (j5 + j4) : 0.0d;
            uwVar.b = j2;
            uwVar.c = j3;
            uw uwVar2 = this.f;
            long j6 = p5aVar.d;
            long j7 = p5aVar.f;
            long j8 = j6 - uwVar2.b;
            long j9 = j7 - uwVar2.c;
            d = 0.0d;
            double d4 = j9 != 0 ? j8 / (j9 + j8) : 0.0d;
            uwVar2.b = j6;
            uwVar2.c = j7;
            dA = d3;
            dA2 = d4;
        }
        double dMax = Math.max(dA, dA2);
        if (dMax >= d) {
            this.c.a(dMax);
        }
        a();
        if (this.l) {
            if (z) {
                c9h c9hVar = p5aVar.b;
                d2 = ((y36) ((q36) c9hVar.c).b).d + ((y36) ((q36) c9hVar.b).b).d;
            } else {
                d2 = Double.NaN;
            }
            for (yn0 yn0Var : this.k) {
                double d5 = this.b.b;
                double d6 = this.c.b;
                o91 o91Var = ((mik) yn0Var).b;
                co0 co0Var = o91Var.n.u;
                boolean z2 = co0Var.c.a;
                ao0 ao0Var = co0Var.d;
                if (!z2 || o91Var.u) {
                    ao0Var.b(o91Var.N, "OKRTCCall", "ignore Call::onConnectionStats: newBadNetVersion && !destroy = " + z2 + " && !" + o91Var.u);
                } else if (o91Var.n0.I(zvh.b)) {
                    yt1 yt1VarV = o91Var.v();
                    if (yt1VarV != null) {
                        try {
                            JSONObject jSONObjectPut = new JSONObject().put("type", "bad-net").put("loss", d6).put(RttRateHintConfig.RTT, d5);
                            if (Math.abs(d2) <= Double.MAX_VALUE) {
                                jSONObjectPut.put("bitrate", d2);
                            }
                            vj7 vj7VarH = kql.h(yt1VarV, new JSONObject().put("sdk", jSONObjectPut));
                            ao0Var.b(o91Var.N, "OKRTCCall", "send bad-net message with bitrate: " + vj7VarH);
                            o91Var.k.k(vj7VarH);
                        } catch (JSONException e) {
                            qr7.o(e);
                            return;
                        }
                    }
                } else if (!o91Var.n0.I(zvh.c) || Double.isNaN(d2)) {
                    ao0Var.c(o91Var.N, "OKRTCCall", "no messages on Call::onConnectionsStats: topology: " + o91Var.n0.w() + ", bitrate: " + d2);
                } else {
                    ao0Var.b(o91Var.N, "OKRTCCall", "send report-network-stat...");
                    o91Var.n0.P(j, (long) d2);
                }
            }
        }
    }
}
