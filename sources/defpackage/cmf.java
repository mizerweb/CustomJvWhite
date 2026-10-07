package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.RTCStats;
import org.webrtc.RTCStatsReport;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.api.UnknownOpcodeException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.rustore.sdk.metrics.MetricsException;

/* JADX INFO: loaded from: classes3.dex */
public final class cmf implements rhh, s8g, fbf, i8c, btb, rg4, otb {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public cmf(Context context) {
        this.a = 14;
        this.b = context;
        this.c = new ifh(new qv(13, this));
    }

    public static dc9 i(RTCStats rTCStats, RTCStatsReport rTCStatsReport) {
        String strSubstring;
        String str;
        zv8[] zv8VarArr = b4e.a;
        rTCStatsReport.getClass();
        Map<String, RTCStats> statsMap = rTCStatsReport.getStatsMap();
        statsMap.getClass();
        RTCStats rTCStats2 = statsMap.get(rTCStats.getMembers().get("codecId"));
        String str2 = "";
        if (rTCStats2 == null || (strSubstring = (String) b4e.b.m(rTCStats2, b4e.a[0])) == null) {
            strSubstring = "";
        } else {
            for (int iQ0 = r5h.Q0(strSubstring); -1 < iQ0; iQ0--) {
                if (strSubstring.charAt(iQ0) == '/') {
                    strSubstring = strSubstring.substring(iQ0 + 1);
                    break;
                }
            }
        }
        bw2 bw2Var = b4e.d;
        zv8[] zv8VarArr2 = b4e.a;
        String str3 = (String) bw2Var.m(rTCStats, zv8VarArr2[2]);
        if (str3 == null && (str3 = (String) b4e.c.m(rTCStats, zv8VarArr2[1])) == null) {
            str3 = "";
        }
        if (rTCStats2 != null && (str = (String) b4e.e.m(rTCStats2, zv8VarArr2[3])) != null) {
            str2 = str;
        }
        if (rTCStats2 != null) {
        }
        return new dc9(17, strSubstring, str3, str2);
    }

    @Override // defpackage.s8g
    public void a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ((s8g) obj2).a(obj);
                break;
            default:
                try {
                    Object objMo41apply = ((sf7) this.c).mo41apply(obj);
                    Objects.requireNonNull(objMo41apply, "The mapper function returned a null value.");
                    ((s8g) obj2).a(objMo41apply);
                } catch (Throwable th) {
                    iwl.a(th);
                    onError(th);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        ((ko5) obj).getClass();
        wfe wfeVar = (wfe) this.b;
        ((gsh) ((esh) this.c)).getClass();
        wfeVar.a = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.rhh
    public void b(kih kihVar) {
        yae yaeVar;
        short s = ((hlc) this.b).d;
        lhb lhbVar = kfc.c;
        if (s == 1) {
            rc5 rc5Var = ((zfb) this.c).b.t;
            rc5Var.getClass();
            gm0.n("NotifListenerImpl", "onPing");
            dme dmeVar = rc5Var.n;
            if (dmeVar != null) {
                dmeVar.j().g();
            }
            agb agbVar = ((zfb) this.c).b;
            hlc hlcVar = (hlc) this.b;
            agb.d(agbVar, new hlc((byte) 1, hlcVar.c, hlcVar.d, hlc.h, 0));
            return;
        }
        kfc kfcVar = kfc.g;
        if (s == 2) {
            rc5 rc5Var2 = ((zfb) this.c).b.t;
            rc5Var2.getClass();
            rc5Var2.c(kfcVar, new qh4(rc5Var2, (x45) kihVar, null, 13));
            return;
        }
        if (s == 20) {
            rc5 rc5Var3 = ((zfb) this.c).b.t;
            rc5Var3.getClass();
            gm0.n("NotifListenerImpl", "onLogout");
            dme dmeVar2 = rc5Var3.n;
            if (dmeVar2 != null) {
                yab.i0(dmeVar2.k(), null, 0, new jhc(rc5Var3, null, 22), 3);
                return;
            }
            return;
        }
        if (s == 3) {
            boolean z = kihVar == kih.b;
            rc5 rc5Var4 = ((zfb) this.c).b.t;
            if (z) {
                yaeVar = new yae();
                yaeVar.d = true;
            } else {
                yaeVar = (yae) kihVar;
            }
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                rc5Var4.getClass();
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "NotifListenerImpl", qv1.l("onReconnect: host=", yaeVar.h(), " port=", yaeVar.i()), null);
                }
            }
            if (yaeVar.c.length() > 0) {
                xb9 xb9Var = ((zed) rc5Var4.b.getValue()).a;
                String strH = yaeVar.h();
                gvb gvbVar = xb9Var.o0;
                zv8[] zv8VarArr = xb9.g1;
                gvbVar.B(xb9Var, zv8VarArr[3], strH);
                ((zed) rc5Var4.b.getValue()).a.m0(yaeVar.i());
                xb9 xb9Var2 = ((zed) rc5Var4.b.getValue()).a;
                xb9Var2.q0.B(xb9Var2, zv8VarArr[5], Boolean.valueOf(yaeVar.d));
            }
            dme dmeVar3 = rc5Var4.n;
            if (dmeVar3 != null) {
                gm0.x(dmeVar3.s, "restart", null);
                ((agb) dmeVar3.j().i.get()).w(false);
                yab.i0(dmeVar3.k(), (xt4) dmeVar3.j.getValue(), 0, new c37(dmeVar3, null, 27), 2);
                return;
            }
            return;
        }
        kfc kfcVar2 = kfc.X2;
        if (s == kfcVar2.a) {
            k7f k7fVar = ((zfb) this.c).b.q;
            k7fVar.getClass();
            if (((xb9) ((et3) k7fVar.a.c(85))).f0()) {
                return;
            }
            akb akbVar = (akb) kihVar;
            agb agbVar2 = ((zfb) this.c).b;
            h3b h3bVar = new h3b(kfcVar2, 14);
            h3bVar.f(akbVar.c, ApiProtocol.PARAM_CHAT_ID);
            gda gdaVar = akbVar.f;
            h3bVar.f(gdaVar.a, "messageId");
            long j = akbVar.e;
            if (j != 0) {
                h3bVar.f(j, "postId");
            }
            if (gdaVar.j == eka.GROUP) {
                h3bVar.h("chatType", "GROUP_CHAT");
            }
            agb.d(agbVar2, hlc.a(h3bVar, (byte) 1, ((hlc) this.b).c));
            rc5 rc5Var5 = ((zfb) this.c).b.t;
            if (((yr2) rc5Var5.o.getValue()).a(Long.valueOf(akbVar.c), akbVar)) {
                return;
            }
            rc5Var5.c(kfcVar2, new qh4(rc5Var5, akbVar, null, 24));
            return;
        }
        kfc kfcVar3 = kfc.Z2;
        if (s == kfcVar3.a) {
            rc5 rc5Var6 = ((zfb) this.c).b.t;
            xjb xjbVar = (xjb) kihVar;
            if (((yr2) rc5Var6.o.getValue()).a(Long.valueOf(xjbVar.c), xjbVar)) {
                return;
            }
            rc5Var6.c(kfcVar3, new qh4(rc5Var6, xjbVar, null, 23));
            dme dmeVar4 = rc5Var6.n;
            if (dmeVar4 != null) {
                dmeVar4.j().g();
                return;
            }
            return;
        }
        kfc kfcVar4 = kfc.Y2;
        if (s == kfcVar4.a) {
            rc5 rc5Var7 = ((zfb) this.c).b.t;
            rc5Var7.getClass();
            rc5Var7.c(kfcVar4, new ke3(rc5Var7, (zkb) kihVar, null, 21));
            return;
        }
        if (s == kfc.b3.a) {
            okb okbVar = (okb) kihVar;
            yfd yfdVar = (yfd) ((zfb) this.c).b.t.j.getValue();
            String str = yfdVar.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.e;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str, "onNotifPresence " + okbVar, null);
                }
            }
            yab.i0(yfdVar.m, null, 0, new l0d(yfdVar, okbVar, null, 7), 3);
            return;
        }
        kfc kfcVar5 = kfc.a3;
        if (s == kfcVar5.a) {
            rc5 rc5Var8 = ((zfb) this.c).b.t;
            qjb qjbVar = (qjb) kihVar;
            rc5Var8.getClass();
            if (qjbVar.c != null) {
                rc5Var8.c(kfcVar5, new ke3(rc5Var8, qjbVar, null, 19));
                return;
            }
            return;
        }
        kfc kfcVar6 = kfc.c3;
        if (s == kfcVar6.a) {
            rc5 rc5Var9 = ((zfb) this.c).b.t;
            rc5Var9.getClass();
            rc5Var9.c(kfcVar6, new qh4(rc5Var9, (njb) kihVar, null, 20));
            return;
        }
        kfc kfcVar7 = kfc.d3;
        if (s == kfcVar7.a) {
            rc5 rc5Var10 = ((zfb) this.c).b.t;
            rc5Var10.getClass();
            rc5Var10.c(kfcVar7, new qh4(rc5Var10, (bjb) kihVar, null, 19));
            return;
        }
        kfc kfcVar8 = kfc.e3;
        if (s == kfcVar8.a) {
            rc5 rc5Var11 = ((zfb) this.c).b.t;
            rc5Var11.getClass();
            rc5Var11.c(kfcVar8, new qh4(rc5Var11, (qib) kihVar, null, 15));
            return;
        }
        kfc kfcVar9 = kfc.f3;
        if (s == kfcVar9.a) {
            rc5 rc5Var12 = ((zfb) this.c).b.t;
            yib yibVar = (yib) kihVar;
            if (((cxb) rc5Var12.d.getValue()).a()) {
                gm0.Y("NotifListenerImpl", "Early return in onNotifCallStart cuz of forceUpdateLogic.isNeedForceUpdate()");
                return;
            } else {
                rc5Var12.c(kfcVar9, new ke3(rc5Var12, yibVar, null, 18));
                return;
            }
        }
        kfc kfcVar10 = kfc.g3;
        if (s == kfcVar10.a) {
            rc5 rc5Var13 = ((zfb) this.c).b.t;
            rc5Var13.getClass();
            rc5Var13.c(kfcVar10, new ke3(rc5Var13, (sjb) kihVar, null, 20));
            return;
        }
        kfc kfcVar11 = kfc.h3;
        if (s == kfcVar11.a) {
            rc5 rc5Var14 = ((zfb) this.c).b.t;
            rc5Var14.getClass();
            rc5Var14.c(kfcVar11, new qh4(rc5Var14, (jkb) kihVar, null, 27));
            return;
        }
        kfc kfcVar12 = kfc.i3;
        if (s == kfcVar12.a) {
            rc5 rc5Var15 = ((zfb) this.c).b.t;
            rc5Var15.getClass();
            rc5Var15.c(kfcVar12, new qh4(rc5Var15, (hkb) kihVar, null, 26));
            return;
        }
        kfc kfcVar13 = kfc.j3;
        if (s == kfcVar13.a) {
            rc5 rc5Var16 = ((zfb) this.c).b.t;
            rc5Var16.getClass();
            rc5Var16.c(kfcVar13, new qh4(rc5Var16, (lkb) kihVar, null, 28));
            return;
        }
        kfc kfcVar14 = kfc.k3;
        if (s == kfcVar14.a) {
            rc5 rc5Var17 = ((zfb) this.c).b.t;
            rc5Var17.getClass();
            rc5Var17.c(kfcVar14, new qh4(rc5Var17, (nkb) kihVar, null, 29));
            return;
        }
        kfc kfcVar15 = kfc.l3;
        if (s == kfcVar15.a) {
            rc5 rc5Var18 = ((zfb) this.c).b.t;
            rc5Var18.getClass();
            rc5Var18.c(kfcVar15, new qh4(rc5Var18, (zib) kihVar, null, 18));
            return;
        }
        kfc kfcVar16 = kfc.p3;
        if (s == kfcVar16.a) {
            rc5 rc5Var19 = ((zfb) this.c).b.t;
            rc5Var19.getClass();
            rc5Var19.c(kfcVar16, new qy3(rc5Var19, null, 8));
            return;
        }
        kfc kfcVar17 = kfc.o3;
        if (s == kfcVar17.a) {
            rc5 rc5Var20 = ((zfb) this.c).b.t;
            rc5Var20.getClass();
            rc5Var20.c(kfcVar17, new qh4(rc5Var20, (wjb) kihVar, null, 22));
            return;
        }
        kfc kfcVar18 = kfc.q3;
        if (s == kfcVar18.a) {
            rc5 rc5Var21 = ((zfb) this.c).b.t;
            rc5Var21.getClass();
            rc5Var21.c(kfcVar18, new qh4(rc5Var21, (pib) kihVar, null, 14));
            return;
        }
        kfc kfcVar19 = kfc.t3;
        if (s == kfcVar19.a) {
            rc5 rc5Var22 = ((zfb) this.c).b.t;
            rc5Var22.getClass();
            rc5Var22.c(kfcVar19, new qh4(rc5Var22, (dkb) kihVar, null, 25));
            return;
        }
        kfc kfcVar20 = kfc.u3;
        if (s == kfcVar20.a) {
            rc5 rc5Var23 = ((zfb) this.c).b.t;
            rc5Var23.getClass();
            rc5Var23.c(kfcVar20, new qc5(rc5Var23, (pkb) kihVar, (lq4) null, 0));
            return;
        }
        kfc kfcVar21 = kfc.I3;
        if (s == kfcVar21.a) {
            rc5 rc5Var24 = ((zfb) this.c).b.t;
            rc5Var24.getClass();
            rc5Var24.c(kfcVar21, new qh4(rc5Var24, (ujb) kihVar, null, 21));
            return;
        }
        kfc kfcVar22 = kfc.K3;
        if (s == kfcVar22.a) {
            rc5 rc5Var25 = ((zfb) this.c).b.t;
            rc5Var25.getClass();
            rc5Var25.c(kfcVar22, new qh4(rc5Var25, (tib) kihVar, null, 16));
            return;
        }
        kfc kfcVar23 = kfc.T3;
        if (s == kfcVar23.a) {
            rc5 rc5Var26 = ((zfb) this.c).b.t;
            rc5Var26.getClass();
            rc5Var26.c(kfcVar23, new qc5(rc5Var26, (tkb) kihVar, (lq4) null, 1));
            return;
        }
        kfc kfcVar24 = kfc.C3;
        if (s == kfcVar24.a) {
            rc5 rc5Var27 = ((zfb) this.c).b.t;
            rc5Var27.getClass();
            rc5Var27.c(kfcVar24, new qh4(rc5Var27, (xib) kihVar, null, 17));
        } else {
            UnknownOpcodeException unknownOpcodeException = new UnknownOpcodeException(s);
            gm0.V(((zfb) this.c).b.a, "unknown.opcode", unknownOpcodeException);
            ((zfb) this.c).b.t(unknownOpcodeException, false);
        }
    }

    @Override // defpackage.s8g
    public void c(ko5 ko5Var) {
        switch (this.a) {
            case 1:
                ((s8g) this.b).c(ko5Var);
                break;
            default:
                ((s8g) this.b).c(ko5Var);
                break;
        }
    }

    @Override // defpackage.fbf
    public void d(nmc nmcVar) {
        k5i k5iVar = (k5i) this.c;
        SparseArray sparseArray = k5iVar.h;
        mo2 mo2Var = (mo2) this.b;
        if (nmcVar.A() == 0 && (nmcVar.A() & np0.m) != 0) {
            nmcVar.O(6);
            int iA = nmcVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                nmcVar.k(0, mo2Var.b, 4);
                mo2Var.q(0);
                int i2 = mo2Var.i(16);
                mo2Var.t(3);
                if (i2 == 0) {
                    mo2Var.t(13);
                } else {
                    int i3 = mo2Var.i(13);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new gbf(new j28(k5iVar, i3)));
                        k5iVar.n++;
                    }
                }
            }
            if (k5iVar.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // defpackage.fbf
    public void e(dth dthVar, lj6 lj6Var, m5i m5iVar) {
    }

    @Override // defpackage.rhh
    public void f(yhh yhhVar) {
        TamErrorException tamErrorException = new TamErrorException(yhhVar);
        agb agbVar = ((zfb) this.c).b;
        gm0.V(agbVar.a, "illegal state in handleNotif, onFail", tamErrorException);
        agbVar.t(tamErrorException, p90.C(yhhVar.b));
    }

    public h21 h() throws JSONException, IOException {
        String str;
        String string;
        r28 r28Var = (r28) ((rj5) this.b).b;
        String strX0 = s5h.x0("\n            SELECT * FROM metrics_event_table\n            LIMIT 10\n        ");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = ((SQLiteDatabase) r28Var.b.getValue()).rawQuery(strX0, new String[0]);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("uuid");
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(new co8(cursorRawQuery.getBlob(columnIndexOrThrow2), cursorRawQuery.getString(columnIndexOrThrow)));
            }
            cursorRawQuery.close();
            List<co8> listT1 = ww3.T1(arrayList);
            ArrayList<h05> arrayList2 = new ArrayList(yw3.W0(listT1, 10));
            for (co8 co8Var : listT1) {
                String str2 = co8Var.a;
                JSONObject jSONObject = new JSONObject(z5h.F0(co8Var.b));
                String string2 = jSONObject.getString(SdkMetricStatEvent.NAME_KEY);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    x05.m(next, jSONObject2.get(next).toString(), arrayList3);
                }
                arrayList2.add(new h05(str2, new uxa(string2, jSONObject.getLong("time"), wm9.W0(arrayList3))));
            }
            if (arrayList2.isEmpty()) {
                return nbj.b;
            }
            xde xdeVar = (xde) this.c;
            String packageName = ((e71) xdeVar.c).a.getPackageName();
            c7k c7kVar = (c7k) xdeVar.b;
            HttpsURLConnection httpsURLConnection = null;
            String string3 = ((SharedPreferences) ((n3j) c7kVar.b).a).getString("USER_ID_KEY", null);
            if (string3 == null) {
                string3 = null;
            }
            if (string3 == null) {
                synchronized (c7k.c) {
                    string = ((SharedPreferences) ((n3j) c7kVar.b).a).getString("USER_ID_KEY", null);
                    if (string == null) {
                        string = null;
                    }
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((n3j) c7kVar.b).a).edit();
                        editorEdit.putString("USER_ID_KEY", string);
                        editorEdit.apply();
                    }
                }
                str = string;
            } else {
                str = string3;
            }
            cdk cdkVar = (cdk) ((ifh) ((cmf) xdeVar.e).c).getValue();
            String str3 = cdkVar != null ? cdkVar.a : null;
            ArrayList arrayList4 = new ArrayList(yw3.W0(arrayList2, 10));
            for (h05 h05Var : arrayList2) {
                arrayList4.add(new tkc(packageName, h05Var.a, str, str3, h05Var.b));
            }
            ojk ojkVar = (ojk) ((zo7) xdeVar.d).b;
            try {
                String strA = ojkVar.a(arrayList4);
                try {
                    HttpsURLConnection httpsURLConnectionB = ojkVar.b();
                    OutputStream outputStream = httpsURLConnectionB.getOutputStream();
                    try {
                        outputStream.write(strA.getBytes(pt2.a));
                        outputStream.flush();
                        outputStream.close();
                        try {
                            httpsURLConnectionB.getURL();
                            httpsURLConnectionB.getResponseCode();
                            httpsURLConnectionB.getRequestProperty("X-Metrics-Request-Time");
                            httpsURLConnectionB.disconnect();
                            return new obj(arrayList2);
                        } catch (Throwable th) {
                            th = th;
                            httpsURLConnection = httpsURLConnectionB;
                            try {
                                throw new MetricsException.NetworkError("Http request was failed", th);
                            } catch (Throwable th2) {
                                if (httpsURLConnection == null) {
                                    throw th2;
                                }
                                httpsURLConnection.disconnect();
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            rx8.n(outputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                rx8.n(cursorRawQuery, th7);
                throw th8;
            }
        }
    }

    @Override // defpackage.otb
    public void j(Task task) {
        sbm sbmVar = (sbm) this.b;
        qjh qjhVar = (qjh) this.c;
        synchronized (sbmVar.f) {
            sbmVar.e.remove(qjhVar);
        }
    }

    public p8h k(long j, ArrayList arrayList, String str, String str2, String str3) {
        String str4;
        String str5;
        daf dafVar = (daf) this.b;
        if (arrayList.size() == 0) {
            return new p8h(j, 1, "", "", "", str3, str2);
        }
        String str6 = (String) arrayList.get(0);
        Object obj = null;
        if (ch3.r(str) || !dafVar.g(str, str2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str4 = null;
                    break;
                }
                str4 = (String) it.next();
                if (!ch3.a(str4, str6) && dafVar.g(str4, str2)) {
                    break;
                }
            }
        } else {
            str4 = str;
        }
        if (!ch3.r(str4)) {
            str5 = str4;
        } else if (ch3.r(str)) {
            for (Object obj2 : arrayList) {
                try {
                    if (!ch3.a((String) obj2, str6)) {
                        obj = obj2;
                        break;
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                    return null;
                }
            }
            str4 = (String) obj;
            str5 = str4;
        } else {
            str5 = str;
        }
        String strTrim = !ch3.r(str) ? str.trim() : ((String) arrayList.get(0)).trim();
        cga cgaVar = new cga(j, null, bga.a, 0, strTrim.length(), null);
        CharSequence charSequenceC = strTrim;
        if (ch3.r(str)) {
            charSequenceC = !ch3.r(strTrim) ? ((p4c) this.c).c(strTrim, cgaVar, true, true) : "";
        }
        return new p8h(j, 1, str6, str5, charSequenceC, str3, str2);
    }

    public void l(bwh bwhVar) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        awh awhVar = bwhVar.a;
        if (awhVar != awh.SUCCESS_CONNECTION || linkedHashSet.contains(awh.NO_CONNECTION_TIMEOUT)) {
            if (awhVar != awh.SUCCESS_AUDIO || linkedHashSet.contains(awh.NO_DATA_TIMEOUT)) {
                ((fwh) this.b).a(bwhVar);
                linkedHashSet.add(awhVar);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public defpackage.a4e m(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r73v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    @Override // defpackage.s8g
    public void onError(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                try {
                    ((e8g) this.c).c.accept(th);
                } catch (Throwable th2) {
                    iwl.a(th2);
                    th = new CompositeException(th, th2);
                }
                ((s8g) obj).onError(th);
                break;
            default:
                ((s8g) obj).onError(th);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    @Override // defpackage.btb
    public ixj s(View view, ixj ixjVar) {
        boolean z;
        n11 n11Var = (n11) this.b;
        td0 td0Var = (td0) this.c;
        int i = td0Var.b;
        int i2 = td0Var.c;
        int i3 = td0Var.d;
        exj exjVar = ixjVar.a;
        mi8 mi8VarF = exjVar.f(519);
        mi8 mi8VarF2 = exjVar.f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) n11Var.c;
        int i4 = mi8VarF.b;
        int i5 = mi8VarF.c;
        int i6 = mi8VarF.a;
        bottomSheetBehavior.w = i4;
        boolean zH0 = e9i.h0(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.o;
        if (z2) {
            int iA = ixjVar.a();
            bottomSheetBehavior.v = iA;
            paddingBottom = iA + i3;
        }
        if (bottomSheetBehavior.p) {
            paddingLeft = (zH0 ? i2 : i) + i6;
        }
        if (bottomSheetBehavior.q) {
            if (!zH0) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z3 = true;
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.u) {
            int i7 = marginLayoutParams.topMargin;
            int i8 = mi8VarF.b;
            if (i7 != i8) {
                marginLayoutParams.topMargin = i8;
            } else {
                z3 = z;
            }
        } else {
            z3 = z;
        }
        if (z3) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z4 = n11Var.b;
        if (z4) {
            bottomSheetBehavior.m = mi8VarF2.d;
        }
        if (!z2 && !z4) {
            return ixjVar;
        }
        bottomSheetBehavior.J();
        return ixjVar;
    }

    public String toString() {
        switch (this.a) {
            case 13:
                return ((Instant) this.c).toString() + " (in " + ((y4k) this.b) + ")";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        int iOrdinal = j8cVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return;
        }
        if (iOrdinal != 4) {
            ore.o();
            return;
        }
        UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.b;
        zv8[] zv8VarArr = UserStoriesScreen.x1;
        gpi gpiVarH1 = userStoriesScreen.H1();
        long j = ((qvg) ((rvg) this.c)).a;
        String str = gpiVarH1.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "openChat: "), null);
            }
        }
        a8j.x(gpiVarH1.s1, new wug(j));
    }

    public /* synthetic */ cmf(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public cmf(o91 o91Var) {
        this.a = 7;
        o91Var.getClass();
        this.b = o91Var;
        this.c = new LinkedHashSet();
    }

    public cmf(y3e y3eVar) {
        this.a = 11;
        y3eVar.getClass();
        this.b = y3eVar;
    }

    public /* synthetic */ cmf(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public cmf(gfl gflVar) {
        this.a = 15;
        this.c = new Handler(Looper.getMainLooper());
        this.b = gflVar;
    }

    public cmf(k5i k5iVar) {
        this.a = 8;
        this.c = k5iVar;
        this.b = new mo2(4, new byte[4]);
    }
}
