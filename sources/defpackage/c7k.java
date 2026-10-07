package defpackage;

import android.content.SharedPreferences;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Log;
import android.util.Rational;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import one.me.android.MainActivity;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import org.json.JSONObject;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class c7k implements sf7, rg4, cv1, s00, xhe, go9, w99, qsf, Loggable, hgd, kg7, nsi, kn8, l18, zvc {
    public static final Object c = new Object();
    public final /* synthetic */ int a;
    public Object b;

    public c7k(wxe wxeVar) {
        this.a = 27;
        SSLContext sSLContext = null;
        if (wxeVar != null) {
            try {
                SSLContext sSLContext2 = (SSLContext) ((xd5) ((ex8) wxeVar).b).h.getValue();
                sSLContext2.init(null, new X509TrustManager[]{((xd5) ((ex8) wxeVar).b).b()}, null);
                sSLContext = sSLContext2;
            } catch (Throwable unused) {
            }
        }
        this.b = sSLContext;
    }

    public static void f(HttpsURLConnection httpsURLConnection) throws UnknownHostException {
        try {
            httpsURLConnection.setConnectTimeout(5000);
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.connect();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (SecurityException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                throw e3;
            }
            String name = cause.getClass().getName();
            if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                throw e3;
            }
            throw new UnknownHostException();
        }
    }

    @Override // defpackage.kn8
    public void C0(lfe lfeVar) {
        StickersSettingsScreen stickersSettingsScreen = (StickersSettingsScreen) this.b;
        zv8[] zv8VarArr = StickersSettingsScreen.g;
        rog rogVarO1 = stickersSettingsScreen.o1();
        int iK = lfeVar.k();
        String name = rog.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            rogVarO1.getClass();
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Move finish. moved:" + rogVarO1.l + ", target:" + rogVarO1.n, null);
            }
        }
        Long l = rogVarO1.l;
        Long l2 = rogVarO1.n;
        if (l == null || l2 == null || rogVarO1.m == -1 || rogVarO1.m == iK) {
            rogVarO1.m = -1;
            rogVarO1.l = null;
            rogVarO1.n = null;
            return;
        }
        rogVarO1.m = -1;
        rogVarO1.l = null;
        rogVarO1.n = null;
        rogVarO1.o.B(rogVarO1, rog.t[0], yab.h0(rogVarO1.b, ((n0c) rogVarO1.d).b(), 2, new p7g(rogVarO1, l, l2, null, 5)));
    }

    @Override // defpackage.kn8
    public void S0(int i, int i2) {
        StickersSettingsScreen stickersSettingsScreen = (StickersSettingsScreen) this.b;
        zv8[] zv8VarArr = StickersSettingsScreen.g;
        rog rogVarO1 = stickersSettingsScreen.o1();
        ArrayList arrayList = new ArrayList((Collection) rogVarO1.h.getValue());
        if (i2 < 0 || i2 > xw3.O0(arrayList)) {
            return;
        }
        vaf vafVar = (vaf) arrayList.get(i2);
        if (!(vafVar instanceof taf)) {
            gm0.Y(rog.class.getName(), "Early return in onItemMove cuz of toSection !is SectionItem.WithSet");
            return;
        }
        rogVarO1.n = Long.valueOf(((taf) vafVar).a);
        if (rogVarO1.l == null) {
            rogVarO1.m = i;
            Object obj = arrayList.get(i);
            taf tafVar = obj instanceof taf ? (taf) obj : null;
            rogVarO1.l = tafVar != null ? Long.valueOf(tafVar.a) : null;
        }
        p90.H(i, i2, arrayList);
        mjg mjgVar = rogVarO1.h;
        mjgVar.getClass();
        mjgVar.j(null, arrayList);
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        tvj.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(((wb0) this.b).hashCode())));
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        js6 js6Var = (js6) this.b;
        js6Var.getClass();
        wxl.b(js6Var.a, null);
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 3:
                return (File) this.b;
            default:
                Object objMo41apply = ((sf7) ((pp9) this.b).c).mo41apply(new Object[]{obj});
                Objects.requireNonNull(objMo41apply, "The zipper returned a null value");
                return objMo41apply;
        }
    }

    @Override // defpackage.hgd
    public void b(ich ichVar) {
        hhd ochVar;
        if (!wxl.c()) {
            np4.o(((ghd) this.b).getContext()).execute(new i7b(this, 19, ichVar));
            return;
        }
        tvj.a("PreviewView", "Surface requested by Preview.");
        pf2 pf2Var = ichVar.e;
        ((ghd) this.b).k = pf2Var.j();
        ihd ihdVar = ((ghd) this.b).i;
        Rect rectH = pf2Var.j().h();
        ihdVar.getClass();
        ihdVar.a = new Rational(rectH.width(), rectH.height());
        synchronized (ihdVar) {
            ihdVar.c = rectH;
        }
        ichVar.c(np4.o(((ghd) this.b).getContext()), new oo(this, pf2Var, ichVar, 21));
        ghd ghdVar = (ghd) this.b;
        hhd hhdVar = ghdVar.b;
        dhd dhdVar = ghdVar.a;
        if (!(hhdVar instanceof och) || ghd.c(ichVar, dhdVar)) {
            ghd ghdVar2 = (ghd) this.b;
            boolean zC = ghd.c(ichVar, ghdVar2.a);
            ghd ghdVar3 = (ghd) this.b;
            bhd bhdVar = ghdVar3.d;
            if (zC) {
                bph bphVar = new bph(ghdVar3, bhdVar);
                bphVar.i = false;
                bphVar.k = new AtomicReference();
                ochVar = bphVar;
            } else {
                ochVar = new och(ghdVar3, bhdVar);
            }
            ghdVar2.b = ochVar;
        }
        nf2 nf2VarJ = pf2Var.j();
        ghd ghdVar4 = (ghd) this.b;
        zgd zgdVar = new zgd(nf2VarJ, ghdVar4.f, ghdVar4.b);
        ((ghd) this.b).g.set(zgdVar);
        pf2Var.b().n(np4.o(((ghd) this.b).getContext()), zgdVar);
        ((ghd) this.b).b.e(ichVar, new oo(this, zgdVar, pf2Var, 22));
        ghd ghdVar5 = (ghd) this.b;
        if (ghdVar5.indexOfChild(ghdVar5.c) == -1) {
            ghd ghdVar6 = (ghd) this.b;
            ghdVar6.addView(ghdVar6.c);
        }
    }

    @Override // defpackage.qsf
    public void c(long j) {
        switch (this.a) {
            case 12:
                DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen = (DialogNotificationsSettingsScreen) this.b;
                zv8[] zv8VarArr = DialogNotificationsSettingsScreen.g;
                ((fl5) dialogNotificationsSettingsScreen.c.getValue()).C(j);
                break;
            default:
                MessagesSettingsScreen messagesSettingsScreen = (MessagesSettingsScreen) this.b;
                zv8[] zv8VarArr2 = MessagesSettingsScreen.p;
                bwa bwaVarQ1 = messagesSettingsScreen.q1();
                ic6 ic6Var = bwaVarQ1.n;
                nni nniVar = bwaVarQ1.c;
                if (j == R.id.oneme_messages_settings_send_by_enter) {
                    nniVar.c("app.messages.send.by.enter", !nniVar.d.getBoolean("app.messages.send.by.enter", false));
                    bwaVarQ1.C();
                } else if (j == R.id.oneme_messages_settings_stickers) {
                    sva.b.getClass();
                    a8j.x(ic6Var, new i65(":stickers/settings"));
                } else if (j == R.id.oneme_messages_settings_fast_reaction_enable) {
                    bwaVarQ1.D(!nniVar.d.getBoolean("app.messages.enable.double.tap.reactions", true));
                } else if (j == R.id.oneme_messages_settings_fast_reaction_choose) {
                    a8j.x(ic6Var, vva.b);
                }
                break;
        }
    }

    @Override // defpackage.w99
    public void d(y99 y99Var, long j, long j2, boolean z) {
        ((w15) this.b).y((rmc) y99Var, j, j2);
    }

    @Override // defpackage.zvc
    public void e() throws IllegalAccessException, InvocationTargetException {
        UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.b;
        zv8[] zv8VarArr = UserStoriesScreen.x1;
        gpi gpiVarH1 = userStoriesScreen.H1();
        String str = gpiVarH1.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onPhotoReady", null);
            }
        }
        t3h t3hVar = gpiVarH1.l;
        lsg lsgVar = (lsg) gpiVarH1.F.a.getValue();
        Long lValueOf = lsgVar != null ? Long.valueOf(lsgVar.c()) : null;
        if (lValueOf != null) {
            azg azgVar = gpiVarH1.c;
            long jLongValue = lValueOf.longValue();
            t3hVar.getClass();
            t3h.z(t3hVar, azgVar, jLongValue, "story_shown", 4, null, 32);
        }
        sgg sggVar = (sgg) gpiVarH1.q1.f;
        if (sggVar == null || !sggVar.isActive()) {
            l95 l95Var = gpiVarH1.q1;
            sgg sggVar2 = (sgg) l95Var.f;
            if (sggVar2 != null) {
                sggVar2.b(null);
            }
            l95Var.f = null;
            l95Var.b = 0L;
            l95Var.f = yab.i0((gu4) l95Var.c, null, 0, new i20(l95Var, null, 29), 3);
        }
        gpiVarH1.O(6);
        if (((toc) gpiVarH1.y.getValue()).a != 0) {
            gpiVarH1.q1.g();
        }
        ((UserStoriesScreen) this.b).H1().G();
    }

    @Override // defpackage.cv1
    public PointF g() {
        return ((ev1) this.b).e;
    }

    @Override // defpackage.w99
    public void h(y99 y99Var, long j, long j2) {
        rmc rmcVar = (rmc) y99Var;
        w15 w15Var = (w15) this.b;
        long j3 = rmcVar.a;
        a35 a35Var = rmcVar.b;
        lkg lkgVar = rmcVar.d;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        w15Var.m.getClass();
        w15Var.q.O(t99Var, rmcVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        k15 k15Var = (k15) rmcVar.f;
        k15 k15Var2 = w15Var.G;
        int size = k15Var2 == null ? 0 : k15Var2.m.size();
        long j4 = k15Var.b(0).b;
        int i = 0;
        while (i < size && w15Var.G.b(i).b < j4) {
            i++;
        }
        if (k15Var.d) {
            if (size - i > k15Var.m.size()) {
                lvb.G0("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = w15Var.M;
                if (j5 == -9223372036854775807L || k15Var.h * 1000 > j5) {
                    w15Var.L = 0;
                } else {
                    lvb.G0("DashMediaSource", "Loaded stale dynamic manifest: " + k15Var.h + ", " + w15Var.M);
                }
            }
            int i2 = w15Var.L;
            w15Var.L = i2 + 1;
            if (i2 < w15Var.m.o(rmcVar.c)) {
                w15Var.D.postDelayed(w15Var.v, Math.min((w15Var.L - 1) * 1000, 5000));
                return;
            } else {
                w15Var.C = new DashManifestStaleException();
                return;
            }
        }
        w15Var.G = k15Var;
        w15Var.H = k15Var.d & w15Var.H;
        w15Var.I = j - j2;
        w15Var.J = j;
        w15Var.N += i;
        synchronized (w15Var.t) {
            try {
                if (rmcVar.b.a.equals(w15Var.E)) {
                    Uri uriC = w15Var.G.k;
                    if (uriC == null) {
                        uriC = uml.c(rmcVar.d.c);
                    }
                    w15Var.E = uriC;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        k15 k15Var3 = w15Var.G;
        if (!k15Var3.d || w15Var.K != -9223372036854775807L) {
            w15Var.A(true);
            return;
        }
        ewe eweVar = k15Var3.i;
        if (eweVar == null) {
            w15Var.x();
            return;
        }
        String str = (String) eweVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                w15Var.K = vqi.a0((String) eweVar.c) - w15Var.J;
                w15Var.A(true);
                return;
            } catch (ParserException e) {
                w15Var.z(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            w15Var.B(eweVar, new u15());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            w15Var.B(eweVar, new dul(21));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            w15Var.x();
        } else {
            w15Var.z(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // defpackage.zvc
    public void i(Throwable th) {
        UserStoriesScreen userStoriesScreen = (UserStoriesScreen) this.b;
        zv8[] zv8VarArr = UserStoriesScreen.x1;
        gpi gpiVarH1 = userStoriesScreen.H1();
        gpiVarH1.l.A(gpiVarH1.c, m3h.PHOTO_LOAD_ERROR, th);
        lsg lsgVar = (lsg) gpiVarH1.F.a.getValue();
        Long lValueOf = lsgVar != null ? Long.valueOf(lsgVar.c()) : null;
        String str = gpiVarH1.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onPhotoLoadError: waiting for connection restore for story=" + lValueOf, null);
            }
        }
        gpiVarH1.Z.B(gpiVarH1, gpi.C1[1], yab.h0(gpiVarH1.b, ((n0c) gpiVarH1.f).a(), 2, new soi(gpiVarH1, lValueOf, null, 0)));
    }

    @Override // defpackage.s00
    public Object j(Collection collection, nq4 nq4Var) {
        return ((f33) this.b).j(collection, nq4Var);
    }

    @Override // defpackage.qsf
    public void l(long j, boolean z) {
        DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen = (DialogNotificationsSettingsScreen) this.b;
        zv8[] zv8VarArr = DialogNotificationsSettingsScreen.g;
        ((fl5) dialogNotificationsSettingsScreen.c.getValue()).C(j);
    }

    @Override // defpackage.s00
    public Object m(long j, int i, long j2, nq4 nq4Var) {
        return ((f33) this.b).m(j, i, j2, nq4Var);
    }

    @Override // defpackage.zvc
    public boolean n() {
        return false;
    }

    @Override // defpackage.cv1
    public void o(float f, float f2) {
        ev1 ev1Var = (ev1) this.b;
        zv8[] zv8VarArr = ev1.k;
        PointF pointF = ev1Var.e;
        pointF.x = f;
        pointF.y = f2;
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        tvj.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(((wb0) this.b).hashCode())));
    }

    @Override // org.webrtc.Loggable
    public void onLogMessage(String str, Logging.Severity severity, String str2) {
        y3e y3eVar;
        WeakReference weakReference = (WeakReference) this.b;
        if (weakReference == null || str == null || str2 == null || (y3eVar = (y3e) weakReference.get()) == null) {
            return;
        }
        y3eVar.log(str2, str);
    }

    @Override // defpackage.w99
    public void p(y99 y99Var, long j, long j2, int i) {
        t99 t99Var;
        rmc rmcVar = (rmc) y99Var;
        w15 w15Var = (w15) this.b;
        if (i == 0) {
            long j3 = rmcVar.a;
            t99Var = new t99(j, rmcVar.b);
        } else {
            long j4 = rmcVar.a;
            a35 a35Var = rmcVar.b;
            lkg lkgVar = rmcVar.d;
            t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        }
        w15Var.q.R(t99Var, rmcVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.s00
    public Object q(long j, int i, long j2, nq4 nq4Var) {
        return ((f33) this.b).q(j, i, j2, nq4Var);
    }

    @Override // defpackage.l18
    public a28 r(ljf ljfVar) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL((String) ljfVar.c).openConnection();
        SSLContext sSLContext = (SSLContext) this.b;
        if (sSLContext != null) {
            try {
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (Exception unused) {
            }
        }
        Iterator it = ((s18) ljfVar.d).iterator();
        while (true) {
            y1 y1Var = (y1) it;
            if (!y1Var.hasNext()) {
                break;
            }
            r18 r18Var = (r18) y1Var.next();
            httpsURLConnection.setRequestProperty(r18Var.a, r18Var.b);
        }
        t80 t80Var = (t80) ljfVar.e;
        try {
            httpsURLConnection.setRequestMethod((String) ljfVar.b);
            if (t80Var != null) {
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setChunkedStreamingMode(0);
            }
            f(httpsURLConnection);
            if (t80Var != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpsURLConnection.getOutputStream());
                try {
                    t80Var.e(bufferedOutputStream);
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(bufferedOutputStream, th);
                        throw th2;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            try {
                int responseCode = httpsURLConnection.getResponseCode();
                for (String str : httpsURLConnection.getHeaderFields().keySet()) {
                    if (str != null) {
                        arrayList.add(new r18(str, httpsURLConnection.getHeaderField(str)));
                    }
                }
                return new a28(responseCode, new s18(0, (r18[]) arrayList.toArray(new r18[0])), new flh(httpsURLConnection, 1), 1);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException(e);
            }
        } catch (IOException e2) {
            httpsURLConnection.disconnect();
            throw e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (r13 > r17) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        if (r0 == r12) goto L32;
     */
    @Override // defpackage.xhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s(long r22, int r24, int r25, long r26, long r28, defpackage.nq4 r30) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c7k.s(long, int, int, long, long, nq4):java.lang.Object");
    }

    public n1i t(long j) {
        return (n1i) ((ConcurrentHashMap) this.b).get(Long.valueOf(j));
    }

    public void u(String str, String str2) {
        boolean z;
        if (str2 == null || r5h.X0(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            oxh oxhVar = (oxh) this.b;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("commands");
            if (jSONObjectOptJSONObject == null || oxhVar == null) {
                return;
            }
            long jOptLong = jSONObjectOptJSONObject.optLong("globalShutdownMs");
            Long lValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong("featureShutdownMs"));
            jSONObjectOptJSONObject.optLong("tagShutdownMs");
            SharedPreferences.Editor editorEdit = oxhVar.a().edit();
            boolean z2 = true;
            if (jOptLong > 0) {
                editorEdit.putLong("system.shutdown.until.ts", System.currentTimeMillis() + jOptLong);
                z = true;
            } else {
                z = false;
            }
            if (lValueOf.longValue() > 0) {
                editorEdit.putLong("system.CRASH_REPORT.shutdown.until.ts", lValueOf.longValue() + System.currentTimeMillis());
            } else {
                z2 = z;
            }
            if (z2) {
                editorEdit.apply();
            }
        } catch (Exception unused) {
            Log.w("Tracer", "Cannot parse content with Content-Type: " + str);
        }
    }

    @Override // defpackage.nsi
    public long v(kbc kbcVar) {
        return rx8.q(0, isk.i(kbcVar, (Long) this.b, ((xac) kbcVar.f().a).b.f));
    }

    public void w(v71 v71Var, boolean z) {
        ljf ljfVar = (ljf) this.b;
        synchronized (ljfVar) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) ljfVar.e;
            try {
                if (z) {
                    linkedHashSet.add(v71Var);
                } else {
                    linkedHashSet.remove(v71Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w99
    public dc1 x(y99 y99Var, long j, long j2, IOException iOException, int i) {
        rmc rmcVar = (rmc) y99Var;
        w15 w15Var = (w15) this.b;
        long j3 = rmcVar.a;
        a35 a35Var = rmcVar.b;
        lkg lkgVar = rmcVar.d;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        int i2 = rmcVar.c;
        long jQ = w15Var.m.q(new mf(iOException, i, 7));
        dc1 dc1Var = jQ == -9223372036854775807L ? dc9.g : new dc1(0, jQ, false);
        w15Var.q.Q(t99Var, i2, iOException, !dc1Var.f());
        return dc1Var;
    }

    public void y() {
        ia8 ia8VarE = ((MainActivity) this.b).z.e();
        if (ia8VarE != null) {
            ia8VarE.b(1);
        }
    }

    public boolean z(long j) {
        return ((ConcurrentHashMap) this.b).remove(Long.valueOf(j)) != null;
    }

    public /* synthetic */ c7k(int i, boolean z) {
        this.a = i;
    }

    public c7k(int i) {
        this.a = i;
        switch (i) {
            case 28:
                this.b = new ConcurrentHashMap();
                break;
            default:
                this.b = new yki(0);
                break;
        }
    }

    public c7k(n3j n3jVar, px8 px8Var) {
        this.a = 0;
        this.b = n3jVar;
    }

    public c7k(rj5 rj5Var) {
        this.a = 10;
        this.b = (oxh) rj5Var.b;
    }

    public /* synthetic */ c7k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
