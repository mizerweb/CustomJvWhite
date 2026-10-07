package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class z18 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public z18(dq4 dq4Var, xhh xhhVar, gjg gjgVar, ny8 ny8Var, ny8 ny8Var2) {
        this.a = dq4Var;
        this.b = xhhVar;
        this.c = gjgVar;
        this.d = ny8Var2;
        this.e = ny8Var;
        mjg mjgVarA = p90.a(new qke(false));
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.h = pzfVarB;
        this.i = new q8e(pzfVarB);
        yab.i0(dq4Var, null, 0, new nke(this, null, 0), 3);
    }

    public fsb a() {
        ta4 ta4Var = (ta4) this.a;
        wuh wuhVar = (wuh) this.b;
        yp ypVar = (yp) this.g;
        dq dqVar = (dq) this.f;
        r6a r6aVar = (r6a) this.e;
        if (ypVar != null && dqVar != null && r6aVar != null) {
            return new uc5(this, ypVar, dqVar, r6aVar, (List) this.h);
        }
        if (ta4Var != null && wuhVar != null) {
            return new vh5(this, ta4Var, wuhVar, (List) this.h);
        }
        ore.p("You must either provide configurationStore and tokenProvider, either sessionStore, tokenInfoProvider and appKeyProvider");
        return null;
    }

    public ur0 b() {
        return e((m4j) this.b);
    }

    public String c(long j, long j2) {
        long j3 = ((mt6) this.b).e;
        if (j2 <= 0) {
            StringBuilder sbS = qt4.s(j, "Content-Range: bytes ", "-/");
            sbS.append(j3);
            sbS.append("\n");
            return sbS.toString().concat("\n");
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sbS2 = qt4.s(j, "Content-Range: bytes ", "-");
        sbS2.append((j + j2) - 1);
        sb.append(zo5.k(j3, "/", "\n", sbS2));
        sb.append("Content-Length: " + j2 + "\n");
        sb.append('\n');
        return sb.toString();
    }

    public j71 d(m4j m4jVar, s25 s25Var) {
        dfd dfdVar;
        dfd dfdVar2 = (dfd) this.i;
        if (dfdVar2 == null || !(m4jVar instanceof ym5) || !dfdVar2.d || (dfdVar = (dfd) this.i) == null) {
            return null;
        }
        ym5 ym5Var = (ym5) m4jVar;
        tw5 tw5Var = dfdVar.h;
        if (!dfdVar.d || tw5Var == null) {
            return null;
        }
        return tw5Var.r(s25Var, true, ym5Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ur0 e(m4j m4jVar) {
        xvd xvdVar;
        w4a xvdVar2;
        tw5 tw5Var;
        j6g j6gVar;
        d15 y71Var;
        dfd dfdVar;
        w4a x6gVar;
        p51 p51Var = w71.O;
        int i = 0;
        if (m4jVar instanceof ot3) {
            ot3 ot3Var = (ot3) m4jVar;
            lt3 lt3Var = new lt3(e(ot3Var.d));
            lt3Var.g(ot3Var.e);
            lt3Var.e(ot3Var.f);
            lt3Var.d(ot3Var.g);
            nt3 nt3VarA = lt3Var.a();
            switch (d5a.$EnumSwitchMapping$0[m4jVar.a.ordinal()]) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 7:
                    i = 4;
                    x6gVar = new x6g(nt3VarA, i);
                    break;
                case 2:
                    i = 2;
                    x6gVar = new x6g(nt3VarA, i);
                    break;
                case 3:
                    x6gVar = new x6g(nt3VarA, i);
                    break;
                default:
                    ore.o();
                    return null;
            }
        } else {
            boolean z = true;
            switch (m4jVar.a.ordinal()) {
                case 0:
                    m4j m4jVar2 = (m4j) this.b;
                    s25 s25Var = (fz4) this.c;
                    j71 j71VarD = d(m4jVar2, s25Var);
                    if (j71VarD != null) {
                        s25Var = j71VarD;
                    }
                    xvdVar = new xvd(s25Var);
                    xvdVar2 = xvdVar;
                    xvdVar2.d(false);
                    x6gVar = xvdVar2;
                    break;
                case 1:
                    m4j m4jVar3 = (m4j) this.b;
                    s25 s25Var2 = (fz4) this.c;
                    j71 j71VarD2 = d(m4jVar3, s25Var2);
                    if (j71VarD2 != null) {
                        s25Var2 = j71VarD2;
                    }
                    HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(s25Var2);
                    hlsMediaSource$Factory.e = new xtj((gve) this.d, (u97) this.e);
                    xvdVar2 = hlsMediaSource$Factory;
                    xvdVar2.d(false);
                    x6gVar = xvdVar2;
                    break;
                case 2:
                    if (((dfd) this.i) == null || !(m4jVar instanceof ym5)) {
                        s25 s25Var3 = (fz4) this.c;
                        j71 j71VarD3 = d(m4jVar, s25Var3);
                        if (j71VarD3 != null) {
                            s25Var3 = j71VarD3;
                        }
                        boolean z2 = nec.a;
                        DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(new ih(s25Var3, (pgg) this.f), s25Var3);
                        dashMediaSource$Factory.h = (n15) this.g;
                        l6m l6mVar = (l6m) this.h;
                        lvb.W(l6mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                        dashMediaSource$Factory.e = l6mVar;
                        xvdVar2 = dashMediaSource$Factory;
                    } else {
                        s25 s25VarD = d((ym5) m4jVar, (fz4) this.c);
                        if (s25VarD == null) {
                            s25VarD = (fz4) this.c;
                        }
                        s25 s25Var4 = s25VarD;
                        dfd dfdVar2 = (dfd) this.i;
                        if (dfdVar2 == null || !dfdVar2.d || (dfdVar = (dfd) this.i) == null) {
                            tw5Var = null;
                        } else {
                            tw5Var = dfdVar.h;
                            if (!dfdVar.d || tw5Var == null) {
                                ore.k("PreloadDiskCacheManager must be initialized first, call init() method");
                                return null;
                            }
                        }
                        j6g j6gVar2 = tw5Var != null ? (j6g) tw5Var.d : null;
                        boolean z3 = j6gVar2 != null;
                        o75 o75Var = tw5Var != null ? (o75) tw5Var.f : null;
                        if (!z3) {
                            j6gVar2 = null;
                        }
                        boolean z4 = nec.a;
                        if (j6gVar2 != null) {
                            j6gVar = j6gVar2;
                        } else {
                            z = false;
                            j6gVar = null;
                        }
                        w71 w71Var = o75Var != null ? o75Var : p51Var;
                        pgg pggVar = (pgg) this.f;
                        if (j6gVar == null || !z) {
                            y71Var = j6gVar != null ? new y71(j6gVar, w71Var, s25Var4, pggVar, 0) : new ih(s25Var4, pggVar);
                        } else {
                            y71Var = new y71(j6gVar, w71Var, s25Var4, pggVar, 1);
                        }
                        DashMediaSource$Factory dashMediaSource$Factory2 = new DashMediaSource$Factory(y71Var, s25Var4);
                        dashMediaSource$Factory2.h = (n15) this.g;
                        l6m l6mVar2 = (l6m) this.h;
                        lvb.W(l6mVar2, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
                        dashMediaSource$Factory2.e = l6mVar2;
                        xvdVar2 = dashMediaSource$Factory2;
                    }
                    xvdVar2.d(false);
                    x6gVar = xvdVar2;
                    break;
                case 3:
                    xvdVar = new xvd(new kq6(1));
                    xvdVar2 = xvdVar;
                    xvdVar2.d(false);
                    x6gVar = xvdVar2;
                    break;
                case 4:
                    ore.m();
                    return null;
                case 5:
                    xvdVar2 = new xvd(new p95((Context) this.a));
                    xvdVar2.d(false);
                    x6gVar = xvdVar2;
                    break;
                case 6:
                    ore.p("FrameVideoSource is not supported in OneVideoExoPlayer");
                    return null;
                default:
                    ore.o();
                    return null;
            }
        }
        return x6gVar.a(ry9.c(m4jVar.b));
    }

    public uvc f() {
        return (uvc) this.i;
    }

    public dc9 g() {
        return (dc9) this.g;
    }

    public q8e h() {
        return (q8e) this.i;
    }

    public ljf i() {
        return (ljf) this.d;
    }

    public y4e j() {
        return (y4e) this.f;
    }

    public r8e k() {
        return (r8e) this.g;
    }

    public h6f l() {
        return (h6f) this.h;
    }

    public ewe m() {
        return (ewe) this.e;
    }

    public boolean n(int i) {
        if (i == R.id.pinbars_report_and_leave_dialog_confirm) {
            rt2 rt2Var = (rt2) ((gjg) this.c).getValue();
            if (rt2Var != null) {
                yab.i0((gu4) this.a, null, 0, new oke(this, rt2Var.a, null, 1), 3);
                return true;
            }
        } else if (i != R.id.pinbars_report_and_leave_dialog_cancel) {
            return false;
        }
        return true;
    }

    public void o(ij0 ij0Var, int i) {
        byte[] bArr;
        long j;
        ug0 ug0Var;
        String str;
        ug0 ug0Var2;
        int i2;
        zg2 zg2VarD;
        String str2;
        Integer numValueOf;
        tw5 tw5Var;
        final z18 z18Var = this;
        final ij0 ij0Var2 = ij0Var;
        byte[] bArr2 = ij0Var2.b;
        uxe uxeVar = (uxe) z18Var.f;
        c4i c4iVarA = ((nwa) z18Var.b).a(ij0Var2.a);
        long jMax = 0;
        while (((Boolean) uxeVar.K(new hfh(z18Var) { // from class: zji
            public final /* synthetic */ z18 b;

            {
                this.b = z18Var;
            }

            @Override // defpackage.hfh
            public final Object a() {
                Boolean bool;
                int i3 = i;
                ij0 ij0Var3 = ij0Var2;
                z18 z18Var2 = this.b;
                switch (i3) {
                    case 0:
                        uxe uxeVar2 = (uxe) z18Var2.c;
                        SQLiteDatabase sQLiteDatabaseL = uxeVar2.l();
                        sQLiteDatabaseL.beginTransaction();
                        try {
                            Long lY = uxe.y(sQLiteDatabaseL, ij0Var3);
                            if (lY == null) {
                                bool = Boolean.FALSE;
                            } else {
                                Cursor cursorRawQuery = uxeVar2.l().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lY.toString()});
                                try {
                                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                    cursorRawQuery.close();
                                    bool = boolValueOf;
                                } catch (Throwable th) {
                                    cursorRawQuery.close();
                                    throw th;
                                }
                            }
                            sQLiteDatabaseL.setTransactionSuccessful();
                            sQLiteDatabaseL.endTransaction();
                            return bool;
                        } catch (Throwable th2) {
                            sQLiteDatabaseL.endTransaction();
                            throw th2;
                        }
                    default:
                        uxe uxeVar3 = (uxe) z18Var2.c;
                        uxeVar3.getClass();
                        return (Iterable) uxeVar3.A(new fv9(uxeVar3, 28, ij0Var3));
                }
            }
        })).booleanValue()) {
            final int i3 = 1;
            Iterable iterable = (Iterable) uxeVar.K(new hfh(z18Var) { // from class: zji
                public final /* synthetic */ z18 b;

                {
                    this.b = z18Var;
                }

                @Override // defpackage.hfh
                public final Object a() {
                    Boolean bool;
                    int i4 = i3;
                    ij0 ij0Var3 = ij0Var2;
                    z18 z18Var2 = this.b;
                    switch (i4) {
                        case 0:
                            uxe uxeVar2 = (uxe) z18Var2.c;
                            SQLiteDatabase sQLiteDatabaseL = uxeVar2.l();
                            sQLiteDatabaseL.beginTransaction();
                            try {
                                Long lY = uxe.y(sQLiteDatabaseL, ij0Var3);
                                if (lY == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = uxeVar2.l().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lY.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseL.setTransactionSuccessful();
                                sQLiteDatabaseL.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseL.endTransaction();
                                throw th2;
                            }
                        default:
                            uxe uxeVar3 = (uxe) z18Var2.c;
                            uxeVar3.getClass();
                            return (Iterable) uxeVar3.A(new fv9(uxeVar3, 28, ij0Var3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (c4iVarA == null) {
                e2k.a("Uploader", "Unknown backend for %s, deleting event batch for it...", ij0Var2);
                ug0Var2 = new ug0(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList<kh0> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ii0) it.next()).c);
                }
                if (bArr2 != null) {
                    uxe uxeVar2 = (uxe) z18Var.i;
                    Objects.requireNonNull(uxeVar2);
                    dt3 dt3Var = (dt3) uxeVar.K(new yji(uxeVar2, 0));
                    js8 js8Var = new js8();
                    js8Var.f = new HashMap();
                    js8Var.d = Long.valueOf(((pt3) z18Var.g).i());
                    js8Var.e = Long.valueOf(((pt3) z18Var.h).i());
                    js8Var.a = "GDT_CLIENT_METRICS";
                    z86 z86Var = new z86("proto");
                    dt3Var.getClass();
                    dc9 dc9Var = iwd.a;
                    dc9Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        dc9Var.G(dt3Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    js8Var.c = new r76(z86Var, byteArrayOutputStream.toByteArray());
                    arrayList.add(((go2) c4iVarA).a(js8Var.j()));
                }
                go2 go2Var = (go2) c4iVarA;
                HashMap map = new HashMap();
                for (kh0 kh0Var : arrayList) {
                    String str3 = kh0Var.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(kh0Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(kh0Var);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    kh0 kh0Var2 = (kh0) ((List) entry.getValue()).get(0);
                    rzd rzdVar = rzd.a;
                    long jI = go2Var.f.i();
                    long jI2 = go2Var.e.i();
                    ah0 ah0Var = new ah0(new ng0(Integer.valueOf(kh0Var2.b("sdk-version")), kh0Var2.a("model"), kh0Var2.a("hardware"), kh0Var2.a("device"), kh0Var2.a("product"), kh0Var2.a("os-uild"), kh0Var2.a(AnalyticsBaseParamsConstantsKt.MANUFACTURER), kh0Var2.a("fingerprint"), kh0Var2.a("locale"), kh0Var2.a("country"), kh0Var2.a("mcc_mnc"), kh0Var2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (kh0 kh0Var3 : (List) entry.getValue()) {
                        r76 r76Var = kh0Var3.c;
                        byte[] bArr3 = bArr2;
                        z86 z86Var2 = r76Var.a;
                        byte[] bArr4 = r76Var.b;
                        long j2 = jMax;
                        if (z86Var2.equals(new z86("proto"))) {
                            tw5Var = new tw5();
                            tw5Var.d = bArr4;
                        } else {
                            if (z86Var2.equals(new z86("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                tw5 tw5Var2 = new tw5();
                                tw5Var2.e = str4;
                                tw5Var = tw5Var2;
                            } else {
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    Log.w(strConcat, "Received event of unsupported encoding " + z86Var2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        tw5Var.a = Long.valueOf(kh0Var3.d);
                        tw5Var.c = Long.valueOf(kh0Var3.e);
                        String str5 = (String) kh0Var3.f.get("tz-offset");
                        tw5Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        tw5Var.g = new di0((scb) scb.a.get(kh0Var3.b("net-type")), (rcb) rcb.a.get(kh0Var3.b("mobile-subtype")));
                        Integer num = kh0Var3.b;
                        if (num != null) {
                            tw5Var.b = num;
                        }
                        String strConcat2 = ((Long) tw5Var.a) == null ? " eventTimeMs" : "";
                        if (((Long) tw5Var.c) == null) {
                            strConcat2 = strConcat2.concat(" eventUptimeMs");
                        }
                        if (((Long) tw5Var.f) == null) {
                            strConcat2 = strConcat2.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat2.isEmpty()) {
                            ore.k("Missing required properties:".concat(strConcat2));
                            return;
                        } else {
                            arrayList4.add(new yh0(((Long) tw5Var.a).longValue(), (Integer) tw5Var.b, ((Long) tw5Var.c).longValue(), (byte[]) tw5Var.d, (String) tw5Var.e, ((Long) tw5Var.f).longValue(), (di0) tw5Var.g));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new zh0(jI, jI2, ah0Var, numValueOf, str2, arrayList4));
                }
                bArr = bArr2;
                j = jMax;
                vg0 vg0Var = new vg0(arrayList3);
                URL urlB = go2Var.d;
                if (bArr != null) {
                    try {
                        g71 g71VarA = g71.a(bArr);
                        str = g71VarA.b;
                        if (str == null) {
                            str = null;
                        }
                        urlB = go2.b(g71VarA.a);
                    } catch (IllegalArgumentException unused3) {
                        ug0Var = new ug0(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    r6a r6aVar = new r6a(urlB, vg0Var, str);
                    ot4 ot4Var = new ot4(22, go2Var);
                    int i4 = 5;
                    do {
                        zg2VarD = ot4Var.d(r6aVar);
                        URL url = (URL) zg2VarD.c;
                        if (url != null) {
                            e2k.a("CctTransportBackend", "Following redirect to: %s", url);
                            r6aVar = new r6a(url, (vg0) r6aVar.c, (String) r6aVar.b);
                        } else {
                            r6aVar = null;
                        }
                        if (r6aVar == null) {
                            break;
                        } else {
                            i4--;
                        }
                    } while (i4 >= 1);
                    int i5 = zg2VarD.a;
                    if (i5 == 200) {
                        ug0Var2 = new ug0(1, zg2VarD.b);
                    } else {
                        if (i5 >= 500 || i5 == 404) {
                            ug0Var = new ug0(2, -1L);
                        } else if (i5 == 400) {
                            try {
                                ug0Var = new ug0(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                e2k.b("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                ug0Var2 = new ug0(2, -1L);
                            }
                        } else {
                            ug0Var = new ug0(3, -1L);
                        }
                        ug0Var2 = ug0Var;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i6 = ug0Var2.a;
            if (i6 == i2) {
                uxeVar.K(new wg5(this, iterable, ij0Var, j));
                ((kr6) this.d).N(ij0Var, i + 1, true);
                return;
            }
            z18Var = this;
            ij0Var2 = ij0Var;
            jMax = j;
            uxeVar.K(new c5f(z18Var, 11, iterable));
            if (i6 == 1) {
                jMax = Math.max(jMax, ug0Var2.b);
                if (bArr != null) {
                    uxeVar.K(new vuf(22, z18Var));
                }
            } else if (i6 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str6 = ((ii0) it2.next()).c.a;
                    if (map2.containsKey(str6)) {
                        map2.put(str6, Integer.valueOf(((Integer) map2.get(str6)).intValue() + 1));
                    } else {
                        map2.put(str6, 1);
                    }
                }
                uxeVar.K(new c5f(z18Var, 12, map2));
            }
            bArr2 = bArr;
        }
        uxeVar.K(new jw2(z18Var, ij0Var2, jMax, 8));
    }

    public void p(n15 n15Var) {
        this.g = n15Var;
    }

    public void q(gve gveVar) {
        this.d = gveVar;
    }

    public void r(u97 u97Var) {
        this.e = u97Var;
    }

    public void s(pgg pggVar) {
        this.f = pggVar;
    }

    public void t(dfd dfdVar) {
        this.i = dfdVar;
    }

    public z18() {
        this.b = new f4a(28);
        this.d = qp.a;
        this.h = r66.a;
    }

    public z18(Context context, m4j m4jVar, fz4 fz4Var) {
        this.a = context;
        this.b = m4jVar;
        this.c = fz4Var;
        boolean z = nec.a;
        this.f = new pgg(10);
        this.h = new l6m(22);
    }
}
