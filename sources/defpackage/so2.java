package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import com.vk.push.core.network.http.HttpClient;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat;

/* JADX INFO: loaded from: classes.dex */
public final class so2 implements lwi, s70, tu0, um2, k74, w6d, nsi, ua4, qg6, an7, gd2, ob0, rg4 {
    public static final so2 b = new so2(1);
    public static final so2 c = new so2(2);
    public static final so2 d = new so2(3);
    public static final so2 e = new so2(4);
    public static final int[] f = {R.attr.state_checked};
    public static final int[] g = {-16842912};
    public static final so2 h = new so2(6);
    public static final so2 i = new so2(7);
    public static final so2 j = new so2(10);
    public static final so2 k = new so2(11);
    public static final so2 l = new so2(12);
    public static final so2 m = new so2(13);
    public static final so2 n = new so2(14);
    public final /* synthetic */ int a;

    public /* synthetic */ so2(int i2) {
        this.a = i2;
    }

    public static void A(EventItemsMap eventItemsMap, pk2 pk2Var) {
        eventItemsMap.set("local_connection_type", pk2Var.b);
        eventItemsMap.set("remote_connection_type", pk2Var.e);
        eventItemsMap.set("local_address", pk2Var.d);
        eventItemsMap.set("remote_address", pk2Var.g);
        Double d2 = pk2Var.h;
        eventItemsMap.set(RttRateHintConfig.RTT, d2 != null ? Integer.valueOf(oc9.v((int) d2.doubleValue(), 0, HttpClient.DEFAULT_TIMEOUT_IN_MILLIS)) : null);
        eventItemsMap.set(ConversationWebRTCStat.KEY_TRANSPORT, pk2Var.i);
    }

    public static void C(qjg qjgVar, kbc kbcVar) {
        Drawable drawableB = jrl.b(qjgVar, f);
        InsetDrawable insetDrawable = drawableB instanceof InsetDrawable ? (InsetDrawable) drawableB : null;
        Drawable drawable = insetDrawable != null ? insetDrawable.getDrawable() : null;
        EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
        if (enhancedVectorDrawable == null) {
            return;
        }
        Drawable drawableB2 = jrl.b(qjgVar, g);
        InsetDrawable insetDrawable2 = drawableB2 instanceof InsetDrawable ? (InsetDrawable) drawableB2 : null;
        Drawable drawable2 = insetDrawable2 != null ? insetDrawable2.getDrawable() : null;
        GradientDrawable gradientDrawable = drawable2 instanceof GradientDrawable ? (GradientDrawable) drawable2 : null;
        if (gradientDrawable == null) {
            return;
        }
        lvb.A0(enhancedVectorDrawable, "circle_background", kbcVar.h().a);
        gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), kbcVar.B().b);
    }

    public static qjg F(Context context, int i2) {
        int iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        boolean z = (i2 & 4) == 0;
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, ru.oneme.app.R.drawable.ic_check_filled_24);
        a8g a8gVar = pq3.j;
        kbc kbcVarM = a8gVar.e(context).m();
        lvb.A0(enhancedVectorDrawable, "circle_background", z ? kbcVarM.h().a : kbcVarM.h().a);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) enhancedVectorDrawable, gm0.K(yl5.d().getDisplayMetrics().density * 2.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setSize(iK, iK);
        gradientDrawable.setColor(0);
        int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 2.0f);
        kbc kbcVarM2 = a8gVar.e(context).m();
        gradientDrawable.setStroke(iK2, z ? kbcVarM2.l().d : kbcVarM2.B().b);
        InsetDrawable insetDrawable2 = new InsetDrawable((Drawable) gradientDrawable, gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
        qjg qjgVar = new qjg(null, null);
        qjgVar.a(f, insetDrawable);
        qjgVar.a(g, insetDrawable2);
        return qjgVar;
    }

    public static p50 I(e70 e70Var) {
        String str = e70Var.u;
        String str2 = e70Var.t;
        if (!e70Var.e()) {
            if (!e70Var.h()) {
                return null;
            }
            d70 d70Var = e70Var.d;
            p50 p50Var = new p50(d70Var.b == 2 ? 11 : 3, str2.hashCode(), (str == null || str.length() == 0) ? null : Uri.fromFile(new File(str)).toString(), d70Var.e, 0, d70Var.c, "video/mp4", 0L, null);
            p50Var.j = e70Var;
            p50Var.l = null;
            return p50Var;
        }
        o60 o60Var = e70Var.b;
        boolean z = o60Var.e;
        long jHashCode = str2.hashCode();
        us0 us0Var = us0.e;
        String strB = (str == null || str.length() == 0) ? o60Var.b(us0Var) : sb8.L(str);
        String strB2 = o60Var.k;
        if (z) {
            if (strB2 == null) {
                strB2 = o60Var.b(us0Var);
            }
        } else if (str != null && str.length() != 0) {
            strB2 = sb8.L(str);
        } else if (strB2 == null) {
            strB2 = o60Var.b(us0Var);
        }
        p50 p50Var2 = new p50(1, jHashCode, strB, strB2, 0, 0L, z ? "image/gif" : "image/jpeg", 0L, null);
        p50Var2.j = e70Var;
        p50Var2.l = null;
        return p50Var2;
    }

    public static pr6 J(byte[] bArr) {
        return new pr6("application/octet-stream", 1, bArr);
    }

    public static pr6 K(String str, String str2) {
        return new pr6(str, 1, str2.getBytes(pt2.a));
    }

    public static oi1 L(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -2105248304) {
            if (str.equals("MOVIE_SHARE")) {
                return oi1.c;
            }
            return null;
        }
        if (iHashCode == -1881579439) {
            if (str.equals("RECORD")) {
                return oi1.b;
            }
            return null;
        }
        if (iHashCode == -1284823979) {
            if (str.equals("ADD_PARTICIPANT")) {
                return oi1.a;
            }
            return null;
        }
        if (iHashCode == 65120 && str.equals("ASR")) {
            return oi1.d;
        }
        return null;
    }

    public static List M(List list, Collection collection) {
        if (list.isEmpty()) {
            return ww3.M1(collection, lv5.b);
        }
        if (collection.isEmpty()) {
            return list;
        }
        c79 c79VarW = yab.w();
        c79VarW.addAll(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            N(c79VarW, (rv5) it.next());
        }
        if (c79VarW.getSize() > 15) {
            h4e h4eVar = i4e.a;
            lx8 lx8Var = new lx8();
            int i2 = 0;
            while (c79VarW.getSize() > 14) {
                i2 += ((rv5) c79VarW.a(lx8Var.nextInt(c79VarW.getSize()))).c;
            }
            N(c79VarW, new rv5("unknown", "max_size_exceeded", i2));
        }
        return yab.j(c79VarW);
    }

    public static void N(c79 c79Var, rv5 rv5Var) {
        int i2;
        int size = c79Var.getSize();
        xw3.T0(c79Var.getSize(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            rv5 rv5Var2 = (rv5) c79Var.get(i2);
            String str = rv5Var.a;
            String str2 = rv5Var.b;
            int iCompareTo = rv5Var2.a.compareTo(str);
            if (iCompareTo == 0 && (iCompareTo = rv5Var2.b.compareTo(str2)) == 0) {
                iCompareTo = 0;
            }
            if (iCompareTo >= 0) {
                if (iCompareTo <= 0) {
                    break;
                } else {
                    i3 = i2 - 1;
                }
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 < 0) {
            c79Var.add((-i2) - 1, rv5Var);
        } else {
            rv5 rv5Var3 = (rv5) c79Var.get(i2);
            c79Var.set(i2, new rv5(rv5Var3.a, rv5Var3.b, rv5Var3.c + rv5Var.c));
        }
    }

    public static void P(JSONObject jSONObject, String str, String str2) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("commands");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        long jOptLong = jSONObjectOptJSONObject.optLong("tagShutdownMs");
        long jOptLong2 = jSONObjectOptJSONObject.optLong("featureShutdownMs");
        Long lValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong("globalShutdownMs"));
        Long lValueOf2 = Long.valueOf(jOptLong2);
        Long lValueOf3 = Long.valueOf(jOptLong);
        ul9 ul9Var = new ul9();
        gol.b(ul9Var, "system.shutdown.until.ts", lValueOf);
        gol.b(ul9Var, "system." + str + ".shutdown.until.ts", lValueOf2);
        if (str2 != null) {
            gol.b(ul9Var, nbh.w("system.", str, ".", str2, ".shutdown.until.ts"), lValueOf3);
        }
        ul9 ul9VarB = ul9Var.b();
        fbc fbcVar = a8g.g;
        if (fbcVar == null) {
            ore.k("Tracer settings are not initialized.");
            return;
        }
        AtomicReference atomicReference = (AtomicReference) ((ifh) fbcVar.c).getValue();
        loop0: while (true) {
            Map map = (Map) atomicReference.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Object it = ((vl9) ul9VarB.entrySet()).iterator();
            while (((sl9) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((ql9) it).next();
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    linkedHashMap.remove(str3);
                } else {
                    linkedHashMap.put(str3, value);
                }
            }
            do {
                if (atomicReference.compareAndSet(map, linkedHashMap)) {
                    break loop0;
                }
            } while (atomicReference.get() == map);
        }
        fbc fbcVar2 = a8g.g;
        if (fbcVar2 != null) {
            fbcVar2.z();
        } else {
            ore.k("Tracer settings are not initialized.");
        }
    }

    public static void Q(String str, String str2) {
        if (str != null && z5h.K0(str, "{", false)) {
            try {
                P(new JSONObject(str), str2, null);
            } catch (JSONException unused) {
            }
        }
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        return ch3.m((Executor) ((g85) h74Var).i(new x0e(iz0.class, Executor.class)));
    }

    public boolean O() {
        switch (this.a) {
            case 10:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        tre.s0(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // defpackage.tu0
    public void b(String str, af7 af7Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), null);
        }
    }

    @Override // defpackage.gd2
    public int c() {
        return 1;
    }

    @Override // defpackage.gd2
    public ghh d() {
        return ghh.b;
    }

    @Override // defpackage.ua4
    public void e(x76 x76Var) {
        x76Var.h(fil.class, p3l.a);
        x76Var.h(fpl.class, jbl.a);
        x76Var.h(iil.class, s3l.a);
        x76Var.h(bjl.class, z3l.a);
        x76Var.h(vil.class, v3l.a);
        x76Var.h(yil.class, c4l.a);
        x76Var.h(afl.class, xzk.a);
        x76Var.h(xel.class, uzk.a);
        x76Var.h(zgl.class, t2l.a);
        x76Var.h(iol.class, lal.a);
        x76Var.h(uel.class, rzk.a);
        x76Var.h(rel.class, ozk.a);
        x76Var.h(ckl.class, b6l.a);
        x76Var.h(jrl.class, a2l.a);
        x76Var.h(qgl.class, k2l.a);
        x76Var.h(hgl.class, x1l.a);
        x76Var.h(fkl.class, e6l.a);
        x76Var.h(y74.class, cal.a);
        x76Var.h(col.class, fal.a);
        x76Var.h(ynl.class, z9l.a);
        x76Var.h(njl.class, y4l.a);
        x76Var.h(grl.class, bxk.a);
        x76Var.h(qjl.class, c5l.a);
        x76Var.h(dll.class, c7l.a);
        x76Var.h(mll.class, l7l.a);
        x76Var.h(jll.class, i7l.a);
        x76Var.h(gll.class, f7l.a);
        x76Var.h(uml.class, m8l.a);
        x76Var.h(xml.class, p8l.a);
        x76Var.h(dnl.class, e9l.a);
        x76Var.h(anl.class, b9l.a);
        x76Var.h(kjl.class, u4l.a);
        x76Var.h(gnl.class, h9l.a);
        x76Var.h(jnl.class, k9l.a);
        x76Var.h(mnl.class, n9l.a);
        x76Var.h(pnl.class, q9l.a);
        x76Var.h(vnl.class, t9l.a);
        x76Var.h(snl.class, w9l.a);
        x76Var.h(rml.class, a8l.a);
        x76Var.h(shl.class, i3l.a);
        x76Var.h(lml.class, g8l.a);
        x76Var.h(iml.class, d8l.a);
        x76Var.h(oml.class, j8l.a);
        x76Var.h(fol.class, ial.a);
        x76Var.h(xpl.class, icl.a);
        x76Var.h(mu8.class, hyk.a);
        x76Var.h(fdl.class, byk.a);
        x76Var.h(cdl.class, yxk.a);
        x76Var.h(idl.class, eyk.a);
        x76Var.h(qdl.class, nyk.a);
        x76Var.h(ndl.class, kyk.a);
        x76Var.h(tdl.class, qyk.a);
        x76Var.h(wdl.class, tyk.a);
        x76Var.h(zdl.class, wyk.a);
        x76Var.h(cel.class, zyk.a);
        x76Var.h(fel.class, dzk.a);
        x76Var.h(hsk.class, pwk.a);
        x76Var.h(nsk.class, vwk.a);
        x76Var.h(ksk.class, swk.a);
        x76Var.h(mhl.class, c3l.a);
        x76Var.h(dfl.class, a0l.a);
        x76Var.h(yok.class, tsk.a);
        x76Var.h(wok.class, xsk.a);
        x76Var.h(bgl.class, s0l.a);
        x76Var.h(cpk.class, atk.a);
        x76Var.h(bpk.class, dtk.a);
        x76Var.h(wpk.class, nuk.a);
        x76Var.h(tpk.class, quk.a);
        x76Var.h(kpk.class, htk.a);
        x76Var.h(gpk.class, jtk.a);
        x76Var.h(erk.class, fvk.a);
        x76Var.h(brk.class, ivk.a);
        x76Var.h(mrk.class, rvk.a);
        x76Var.h(krk.class, uvk.a);
        x76Var.h(esk.class, jwk.a);
        x76Var.h(bsk.class, mwk.a);
        x76Var.h(srk.class, xvk.a);
        x76Var.h(prk.class, awk.a);
        x76Var.h(yrk.class, dwk.a);
        x76Var.h(vrk.class, gwk.a);
        x76Var.h(rql.class, ual.a);
        x76Var.h(aql.class, d0l.a);
        x76Var.h(kql.class, q4l.a);
        x76Var.h(iql.class, m4l.a);
        x76Var.h(dql.class, e2l.a);
        x76Var.h(oql.class, ral.a);
        x76Var.h(nql.class, oal.a);
        x76Var.h(uql.class, xal.a);
        x76Var.h(fql.class, w2l.a);
        x76Var.h(drl.class, ocl.a);
        x76Var.h(arl.class, rcl.a);
        x76Var.h(xql.class, lcl.a);
        x76Var.h(mol.class, abl.a);
        x76Var.h(jhl.class, z2l.a);
        x76Var.h(vhl.class, l3l.a);
        x76Var.h(zcl.class, exk.a);
        x76Var.h(tgl.class, n2l.a);
        x76Var.h(phl.class, f3l.a);
        x76Var.h(egl.class, g1l.a);
        x76Var.h(sfl.class, j0l.a);
        x76Var.h(vfl.class, m0l.a);
        x76Var.h(pfl.class, g0l.a);
        x76Var.h(yfl.class, p0l.a);
        x76Var.h(hjl.class, i4l.a);
        x76Var.h(ejl.class, f4l.a);
        x76Var.h(tok.class, qsk.a);
        x76Var.h(opl.class, sbl.a);
        x76Var.h(upl.class, ybl.a);
        x76Var.h(rpl.class, vbl.a);
        x76Var.h(wcl.class, ywk.a);
        x76Var.h(oel.class, lzk.a);
        x76Var.h(lel.class, izk.a);
        x76Var.h(iel.class, fzk.a);
        x76Var.h(tjl.class, s5l.a);
        x76Var.h(zjl.class, y5l.a);
        x76Var.h(wjl.class, v5l.a);
        x76Var.h(rpk.class, fuk.a);
        x76Var.h(npk.class, juk.a);
        x76Var.h(ikl.class, h6l.a);
        x76Var.h(rkl.class, q6l.a);
        x76Var.h(lkl.class, k6l.a);
        x76Var.h(okl.class, n6l.a);
        x76Var.h(tqk.class, tuk.a);
        x76Var.h(qqk.class, wuk.a);
        x76Var.h(sol.class, gbl.a);
        x76Var.h(pol.class, dbl.a);
        x76Var.h(ipl.class, mbl.a);
        x76Var.h(lpl.class, pbl.a);
        x76Var.h(pll.class, o7l.a);
        x76Var.h(fml.class, x7l.a);
        x76Var.h(sll.class, r7l.a);
        x76Var.h(cml.class, u7l.a);
        x76Var.h(hrk.class, lvk.a);
        x76Var.h(grk.class, ovk.a);
        x76Var.h(wgl.class, q2l.a);
        x76Var.h(kgl.class, h2l.a);
        x76Var.h(ukl.class, t6l.a);
        x76Var.h(all.class, z6l.a);
        x76Var.h(xkl.class, w6l.a);
        x76Var.h(zqk.class, zuk.a);
        x76Var.h(wqk.class, cvk.a);
    }

    @Override // defpackage.gd2
    public long getTimestamp() {
        return -1L;
    }

    @Override // defpackage.lwi
    public Bitmap i(int i2, int i3, Bitmap bitmap) {
        int height;
        int height2;
        je9 je9Var = je9.f;
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            String name = so2.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, nbh.u("Incorrect size of original bitmap: width=", bitmap.getWidth(), ", height = ", bitmap.getHeight(), ". Returning original bitmap."), null);
            }
        } else {
            if (i2 > 0 && i3 > 0) {
                float f2 = i2 / i3;
                if (bitmap.getWidth() / bitmap.getHeight() > f2) {
                    height2 = bitmap.getHeight();
                    height = (int) (bitmap.getHeight() * f2);
                } else {
                    int width = bitmap.getWidth();
                    int width2 = (int) (bitmap.getWidth() / f2);
                    height = width;
                    height2 = width2;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - height) / 2, (bitmap.getHeight() - height2) / 2, height, height2);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i2, i3, true);
                if (bitmapCreateBitmap != bitmap) {
                    bitmapCreateBitmap.recycle();
                }
                return bitmapCreateScaledBitmap;
            }
            String name2 = so2.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, nbh.u("Incorrect requested bitmap size: width=", i2, ", height = ", i3, ". Returning original bitmap."), null);
                return bitmap;
            }
        }
        return bitmap;
    }

    @Override // defpackage.tu0
    public void j(String str, Throwable th, af7 af7Var) {
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, (String) af7Var.invoke(), th);
        }
    }

    @Override // defpackage.gd2
    public dd2 r() {
        return dd2.a;
    }

    @Override // defpackage.gd2
    public ed2 s() {
        return ed2.a;
    }

    @Override // defpackage.qg6
    public rg6[] u(pg6[] pg6VarArr, ko0 ko0Var) {
        ghe gheVarV = oa.v(pg6VarArr);
        rg6[] rg6VarArr = new rg6[pg6VarArr.length];
        for (int i2 = 0; i2 < pg6VarArr.length; i2++) {
            pg6 pg6Var = pg6VarArr[i2];
            if (pg6Var != null) {
                int[] iArr = pg6Var.b;
                if (iArr.length != 0) {
                    int length = iArr.length;
                    hyh hyhVar = pg6Var.a;
                    rg6VarArr[i2] = length == 1 ? new ds5(hyhVar, iArr[0]) : new oa(hyhVar, iArr, ko0Var, 10000L, 25000L, 25000L, (c98) gheVarV.get(i2));
                }
            }
        }
        return rg6VarArr;
    }

    @Override // defpackage.nsi
    public long v(kbc kbcVar) {
        return rx8.q(-1, kbcVar.getIcon().h);
    }

    @Override // defpackage.gd2
    public cd2 w() {
        return cd2.a;
    }
}
