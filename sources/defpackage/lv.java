package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.messages.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lv extends a8j {
    public static final /* synthetic */ zv8[] w;
    public final o1c c;
    public final ny8 d;
    public final nni e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final pq3 n;
    public final ArrayList o;
    public final mjg p;
    public final r8e q;
    public final su r;
    public final ic6 s;
    public final p3c t;
    public hv u;
    public final int v;

    static {
        z8b z8bVar = new z8b(lv.class, "updateSelectedTheme", "getUpdateSelectedTheme()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        w = new zv8[]{z8bVar};
    }

    public lv(zed zedVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, o1c o1cVar) {
        su suVar;
        tnh tnhVar;
        this.c = o1cVar;
        this.d = ny8Var;
        this.e = zedVar.c;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        this.l = ny8Var8;
        this.m = ny8Var9;
        this.n = pq3.j.e((Context) ny8Var2.getValue());
        ma6 ma6Var = su.f;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        int i = 0;
        y1 y1Var = new y1(i, ma6Var);
        while (true) {
            int i2 = 3;
            lq4 lq4Var = null;
            if (!y1Var.hasNext()) {
                this.o = arrayList;
                hv hvVar = hv.d;
                mjg mjgVarA = p90.a(hvVar);
                this.p = mjgVarA;
                this.q = new r8e(mjgVarA);
                ahb ahbVarA = ((j55) this.n.e).a();
                if ((ahbVarA instanceof ygb) || ahbVarA.equals(zgb.b)) {
                    suVar = su.SYSTEM;
                } else if (ahbVarA.equals(wgb.b)) {
                    suVar = su.LIGHT;
                } else {
                    if (!ahbVarA.equals(xgb.b)) {
                        ore.o();
                        throw null;
                    }
                    suVar = su.DARK;
                }
                this.r = suVar;
                this.s = new ic6(null);
                this.t = qyj.S();
                this.u = hvVar;
                this.v = ((bx5) this.c.a.getValue()).ordinal();
                a8j.t(this, ((n0c) H()).a(), new jv(this, null), 2);
                tre.m0(new fz6(((nm0) ny8Var9.getValue()).g, new gv(i, this, lq4Var), i2), this.b);
                return;
            }
            su suVar2 = (su) y1Var.next();
            Boolean bool = Boolean.FALSE;
            int i3 = iv.$EnumSwitchMapping$0[suVar2.ordinal()];
            if (i3 == 1) {
                tnhVar = new tnh(R.string.oneme_appearance_settings_system_mode);
            } else if (i3 == 2) {
                tnhVar = new tnh(R.string.oneme_appearance_settings_light_mode);
            } else {
                if (i3 != 3) {
                    ore.o();
                    throw null;
                }
                tnhVar = new tnh(R.string.oneme_appearance_settings_dark_mode);
            }
            arrayList.add(new uu(suVar2, bool, tnhVar));
        }
    }

    public static final fda B(lv lvVar, int i, String str, kja kjaVar, boolean z) {
        long j = i;
        ny8 ny8Var = lvVar.d;
        ny8 ny8Var2 = lvVar.d;
        return a.a((a) lvVar.h.getValue(), new sfa(j, 0L, 0L, 0L, ((zed) ny8Var.getValue()).a.f(), z ? 1L : ((zed) ny8Var2.getValue()).a.t(), 0L, str, xfa.READ, wja.ACTIVE, ((zed) ny8Var2.getValue()).a.f(), null, null, null, 0, 0L, null, null, null, null, 0, false, 0, 0, 2, 0L, 0L, null, 0L, 0, 0L, new ArrayList(), kjaVar, null, 0L));
    }

    public static final Drawable C(lv lvVar) {
        nm0 nm0Var = (nm0) lvVar.m.getValue();
        int i = hm0.b;
        pq3 pq3Var = lvVar.n;
        return nm0Var.a(np4.k(pq3Var.j().c, pq3Var.n()));
    }

    public static final ArrayList D(lv lvVar, List list) {
        lvVar.getClass();
        List<aqh> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (aqh aqhVar : list2) {
            nm0 nm0Var = (nm0) lvVar.m.getValue();
            int i = hm0.b;
            Drawable drawableA = nm0Var.a(np4.k(aqhVar.b, lvVar.n.n()));
            oph ophVarA = null;
            oph ophVar = drawableA instanceof oph ? (oph) drawableA : null;
            if (ophVar != null) {
                ophVarA = ophVar.a(0.45f);
            }
            arrayList.add(aqh.i(aqhVar, false, ophVarA, 7));
        }
        return arrayList;
    }

    public static ul9 E(String str, String str2) {
        ul9 ul9Var = new ul9();
        ul9Var.put("settingsType", "Design");
        ul9Var.put("paramValue", str);
        ul9Var.put("paramAdditionally", str2);
        return ul9Var.b();
    }

    public static String I(String str, Integer num, Integer num2, Boolean bool) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            jSONObject.put("background", str);
        }
        if (num != null) {
            jSONObject.put("theme", num.intValue());
        }
        if (num2 != null) {
            jSONObject.put("textSize", num2.intValue());
        }
        jSONObject.put("isFinal", bool.booleanValue() ? 1 : 0);
        return jSONObject.toString();
    }

    public final Object F(nq4 nq4Var) {
        return yab.K0(((n0c) H()).a(), new m5(this, null, 4), nq4Var);
    }

    public final ae9 G() {
        return (ae9) this.l.getValue();
    }

    public final xhh H() {
        return (xhh) this.j.getValue();
    }

    @Override // defpackage.a8j
    public final void y() {
        nm0 nm0Var = (nm0) this.m.getValue();
        nm0Var.e.clear();
        vo8 vo8Var = (vo8) nm0Var.h.m(nm0Var, nm0.i[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }
}
