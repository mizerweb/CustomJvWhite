package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.vk.push.common.Logger;
import java.io.EOFException;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import org.apache.http.HttpHost;
import org.apache.http.HttpVersion;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public class xtj implements wtj, zx7, kg7, qeh {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public xtj(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new fi9();
                this.c = new fi9();
                this.d = c76.a;
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                this.c = new h6f();
                this.b = new cek();
                this.d = new ArrayList();
                break;
            default:
                this.c = v4j.a;
                break;
        }
    }

    public static long i(int i, PushbackInputStream pushbackInputStream) throws IOException {
        byte bM;
        int iPow = (int) (Math.pow(2.0d, i) - 1.0d);
        int iM = m(pushbackInputStream) & iPow;
        if (iM < iPow) {
            return iM;
        }
        long j = iM;
        int i2 = 0;
        do {
            bM = m(pushbackInputStream);
            j += (long) ((bM & 127) << i2);
            i2 += 7;
        } while ((bM & 128) == 128);
        return j;
    }

    public static void l(PushbackInputStream pushbackInputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            ore.i();
            return;
        }
        int i = 0;
        while (i < length) {
            int i2 = pushbackInputStream.read(bArr, i, length - i);
            if (i2 < 0) {
                break;
            } else {
                i += i2;
            }
        }
        if (i == bArr.length) {
            return;
        }
        c.n();
    }

    public static byte m(PushbackInputStream pushbackInputStream) throws IOException {
        int i = pushbackInputStream.read();
        if (i != -1) {
            return (byte) i;
        }
        c.n();
        return (byte) 0;
    }

    public static pcf t(Class cls, j71 j71Var) {
        try {
            return (pcf) cls.getConstructor(j71.class).newInstance(j71Var);
        } catch (Exception e) {
            ore.l("Downloader factory missing", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public void A(u25 u25Var, Uri uri, Map map, long j, long j2, vvd vvdVar) throws UnrecognizedInputFormatException {
        qa5 qa5Var = new qa5(u25Var, j, j2);
        this.d = qa5Var;
        if (((jj6) this.c) != null) {
            return;
        }
        jj6[] jj6VarArrD = ((nj6) this.b).d(uri, map);
        int length = jj6VarArrD.length;
        a98 a98Var = c98.b;
        oc9.p(length, "expectedSize");
        z88 z88Var = new z88(length);
        boolean z = true;
        if (jj6VarArrD.length == 1) {
            this.c = jj6VarArrD[0];
        } else {
            for (jj6 jj6Var : jj6VarArrD) {
                try {
                    if (jj6Var.b(qa5Var)) {
                        this.c = jj6Var;
                        qa5Var.f = 0;
                        break;
                    }
                    z88Var.f(jj6Var.y());
                    boolean z2 = ((jj6) this.c) != null || qa5Var.d == j;
                    lvb.b0(z2);
                    qa5Var.f = 0;
                } catch (EOFException unused) {
                    if (((jj6) this.c) != null || qa5Var.d == j) {
                    }
                } catch (Throwable th) {
                    if (((jj6) this.c) == null && qa5Var.d != j) {
                        z = false;
                    }
                    lvb.b0(z);
                    qa5Var.f = 0;
                    throw th;
                }
                lvb.b0(z2);
                qa5Var.f = 0;
            }
            if (((jj6) this.c) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                ste steVar = new ste(", ", 1);
                Iterator it = j8f.f(new p51(17), c98.o(jj6VarArrD)).iterator();
                StringBuilder sb2 = new StringBuilder();
                steVar.a(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                throw new UnrecognizedInputFormatException(string, z88Var.h());
            }
        }
        ((jj6) this.c).A(vvdVar);
    }

    public pcf B(int i, j71 j71Var) {
        pcf pcfVarT;
        if (i == 0) {
            pcfVarT = t(h15.class.asSubclass(pcf.class), j71Var);
        } else if (i == 1) {
            pcfVarT = t(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(pcf.class), j71Var);
        } else {
            if (i != 2) {
                ore.p(zo5.h(i, "Unsupported type: "));
                return null;
            }
            pcfVarT = t(fx7.class.asSubclass(pcf.class), j71Var);
        }
        ((SparseArray) this.d).put(i, pcfVarT);
        return pcfVarT;
    }

    @Override // defpackage.qeh
    public int C() {
        return ((reh) this.c).getMeasuredHeight();
    }

    public void D(String str) {
        if (str != null) {
            this.b = str;
        } else {
            ore.n("Null backendName");
        }
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        switch (this.a) {
            case 13:
                ((zgd) this.d).e = null;
                break;
            default:
                o9b.h((e89) this.b, (r72) this.c);
                break;
        }
    }

    @Override // defpackage.wtj
    public void b(int i, int i2, CharSequence charSequence) {
        String str;
        psj psjVar;
        je9 je9Var = je9.f;
        qsj qsjVar = (qsj) this.d;
        String str2 = qsjVar.g;
        owh owhVar = str2 != null ? new owh(str2) : null;
        String str3 = owhVar != null ? owhVar.a : null;
        if (str3 == null || str3.length() == 0) {
            String str4 = qsjVar.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str4, "Invoked 'web_app_error', but traceId is null or empty!", null);
            }
        } else {
            int iD = qt4.D(i);
            if (iD == 0) {
                psjVar = psj.SSL_ERROR;
            } else if (iD == 1) {
                psjVar = psj.HTTP_ERROR;
            } else {
                if (iD != 2) {
                    ore.o();
                    return;
                }
                psjVar = psj.WEBVIEW_ERROR;
            }
            qrc.o(qsjVar, psjVar, str3, p90.O(Integer.valueOf(i2), "error_code"), null, 24);
        }
        String name = xtj.class.getName();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            StringBuilder sb = new StringBuilder("onPageLoadingError. Type=");
            if (i == 1) {
                str = "SSL";
            } else if (i != 2) {
                str = i != 3 ? "null" : "NATIVE";
            } else {
                str = HttpVersion.HTTP;
            }
            sb.append(str);
            sb.append(", code=");
            sb.append(i2);
            sb.append(", message=");
            sb.append((Object) charSequence);
            a4cVar2.c(je9Var, name, sb.toString(), null);
        }
        ((ioj) this.b).K();
    }

    @Override // defpackage.qeh
    public void c() {
        ((hbj) ((VpnPanelWidget) this.b).c.getValue()).c.m(vmi.c);
    }

    @Override // defpackage.wtj
    public void d() {
        Object value;
        ioj iojVar = (ioj) this.b;
        String str = iojVar.C;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.n(iojVar.I.getValue(), "onPageFinishLoading: pageState = "), null);
            }
        }
        if (!(iojVar.I.getValue() instanceof llc)) {
            qsj qsjVar = iojVar.i;
            String str2 = qsjVar.g;
            owh owhVar = str2 != null ? new owh(str2) : null;
            String str3 = owhVar != null ? owhVar.a : null;
            if (str3 == null || str3.length() == 0) {
                String str4 = qsjVar.b;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.f;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str4, "Invoked 'webapp_loaded', but traceId is null or empty!", null);
                    }
                }
            } else {
                long[] jArr = q1f.a;
                b9b b9bVar = new b9b();
                if (!qsjVar.h) {
                    b9bVar.k("first_paint_skipped", 1);
                }
                qrc.k(qsjVar, "page_loaded", 3, str3, true, null, b9bVar, 80);
            }
        }
        if (iojVar.H.getAndSet(false)) {
            String str5 = iojVar.C;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var3 = je9.e;
                if (a4cVar3.b(je9Var3)) {
                    a4cVar3.c(je9Var3, str5, "onPageFinishLoading: force reload", null);
                }
            }
            iojVar.G(knj.a);
        }
        mjg mjgVar = iojVar.I;
        do {
            value = mjgVar.getValue();
            plc plcVar = (plc) value;
            if (!(plcVar instanceof nlc) && !(plcVar instanceof mlc) && plcVar != null) {
                return;
            }
        } while (!mjgVar.h(value, new nlc()));
    }

    @Override // defpackage.wtj
    public void e(String str) {
        qsj qsjVar = (qsj) this.d;
        String str2 = qsjVar.g;
        owh owhVar = str2 != null ? new owh(str2) : null;
        String str3 = owhVar != null ? owhVar.a : null;
        if (str3 == null || str3.length() == 0) {
            String str4 = qsjVar.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str4, "Invoked 'webapp_nav_start', but traceId is null or empty!", null);
                }
            }
        } else {
            qrc.k(qsjVar, "nav_start", 2, str3, false, null, null, 120);
        }
        ((ioj) this.b).L(str, false);
    }

    @Override // defpackage.wtj
    public boolean f() {
        return ((xb9) ((ioj) this.b).j).e0();
    }

    @Override // defpackage.zx7
    public qmc g(wx7 wx7Var, sx7 sx7Var) {
        return new mdc(wx7Var, sx7Var, (gve) this.b, (u97) this.c, (Set) this.d);
    }

    @Override // defpackage.wtj
    public boolean h(Uri uri) {
        e71 e71Var = (e71) this.c;
        if (cqk.d(uri.getScheme(), HttpHost.DEFAULT_SCHEME_NAME) || cqk.d(uri.getScheme(), "https")) {
            return false;
        }
        try {
            e71Var.a.startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (ActivityNotFoundException unused) {
            return true;
        } catch (Exception e) {
            gm0.V("WebAppUrlInterceptor", "Unexpected exception when try to open activity by link", e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, nq4 nq4Var) {
        yhk yhkVar;
        if (nq4Var instanceof yhk) {
            yhkVar = (yhk) nq4Var;
            int i = yhkVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                yhkVar.h = i - Integer.MIN_VALUE;
            } else {
                yhkVar = new yhk(this, nq4Var);
            }
        } else {
            yhkVar = new yhk(this, nq4Var);
        }
        Object objG = yhkVar.f;
        int i2 = yhkVar.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objG);
            g7k g7kVar = (g7k) this.c;
            yhkVar.d = this;
            yhkVar.e = str;
            yhkVar.h = 1;
            objG = g7kVar.g(yhkVar);
            if (objG != hu4Var) {
            }
        }
        if (i2 == 1) {
            str = yhkVar.e;
            this = yhkVar.d;
            ch3.d0(objG);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(objG);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = yhkVar.d;
            ch3.d0(objG);
        }
        g7k g7kVar2 = (g7k) this.c;
        yhkVar.d = null;
        yhkVar.h = 3;
        return g7kVar2.b(yhkVar) == hu4Var ? hu4Var : sbiVar;
        if (!((Boolean) objG).booleanValue()) {
            Logger.DefaultImpls.info$default((Logger) this.d, "Sending new push token to the client app", null, 2, null);
            l4k l4kVar = (l4k) this.b;
            yhkVar.d = this;
            yhkVar.e = null;
            yhkVar.h = 2;
            if (l4kVar.c(str, yhkVar) != hu4Var) {
                g7k g7kVar3 = (g7k) this.c;
                yhkVar.d = null;
                yhkVar.h = 3;
                if (g7kVar3.b(yhkVar) == hu4Var) {
                }
            }
        }
    }

    public String k(PushbackInputStream pushbackInputStream) throws IOException {
        byte bM = m(pushbackInputStream);
        pushbackInputStream.unread(bM);
        boolean z = (bM & 128) == 128;
        byte[] bArr = new byte[(int) i(7, pushbackInputStream)];
        l(pushbackInputStream, bArr);
        if (!z) {
            return new String(bArr, StandardCharsets.ISO_8859_1);
        }
        ((cek) this.b).getClass();
        return cek.a(bArr);
    }

    public ij0 n() {
        String strConcat = ((String) this.b) == null ? " backendName" : "";
        if (((vhd) this.d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new ij0((String) this.b, (byte[]) this.c, (vhd) this.d);
        }
        ore.k("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.zx7
    public qmc o() {
        return new mdc(wx7.l, null, (gve) this.b, (u97) this.c, (Set) this.d);
    }

    @Override // defpackage.qeh
    public void onDismiss() {
        ((hbj) ((VpnPanelWidget) this.b).c.getValue()).c.m(vmi.c);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 13:
                ((zgd) this.d).e = null;
                ArrayList arrayList = (ArrayList) this.b;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((nf2) this.c).s((zc2) it.next());
                    }
                    arrayList.clear();
                }
                break;
            default:
                boolean z = th instanceof CancellationException;
                r72 r72Var = (r72) this.c;
                if (!z) {
                    r72Var.b(null);
                } else {
                    qyj.l(null, r72Var.d(new gch(((String) this.d).concat(" cancelled."), th)));
                }
                break;
        }
    }

    public x52 p() {
        Objects.requireNonNull((yt1) this.b);
        Objects.requireNonNull((v4j) this.c);
        return new x52(this);
    }

    public String q(int i, long j, long j2, String str) {
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.c;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int size = arrayList2.size();
            ArrayList arrayList3 = (ArrayList) this.b;
            if (i2 >= size) {
                sb.append((String) arrayList3.get(arrayList2.size()));
                return sb.toString();
            }
            sb.append((String) arrayList3.get(i2));
            if (((Integer) arrayList2.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) arrayList2.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j)));
            } else if (((Integer) arrayList2.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Integer.valueOf(i)));
            } else if (((Integer) arrayList2.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) arrayList.get(i2), Long.valueOf(j2)));
            }
            i2++;
        }
    }

    public ys5 r(ss5 ss5Var) {
        pcf pcfVarB;
        jy9 jy9Var;
        Uri uri = ss5Var.b;
        int iN = vqi.N(uri, ss5Var.c);
        if (iN != 0) {
            boolean z = true;
            if (iN != 1 && iN != 2) {
                if (iN != 4) {
                    ore.p(zo5.h(iN, "Unsupported type: "));
                    return null;
                }
                qs5 qs5Var = ss5Var.h;
                by9 by9Var = new by9();
                fy9 fy9Var = new fy9();
                List list = Collections.EMPTY_LIST;
                ghe gheVar = ghe.e;
                hy9 hy9Var = new hy9();
                ly9 ly9Var = ly9.d;
                String str = ss5Var.f;
                if (fy9Var.b != null && fy9Var.a == null) {
                    z = false;
                }
                lvb.b0(z);
                if (uri != null) {
                    jy9Var = new jy9(uri, null, fy9Var.a != null ? new gy9(fy9Var) : null, null, list, str, gheVar, -9223372036854775807L);
                } else {
                    jy9Var = null;
                }
                return new mvd(new ry9("", new dy9(by9Var), jy9Var, new iy9(hy9Var), b0a.K, ly9Var), (j71) this.b, (Executor) this.c, qs5Var != null ? qs5Var.a : 0L, qs5Var != null ? qs5Var.b : -1L);
            }
        }
        j71 j71Var = (j71) this.b;
        SparseArray sparseArray = (SparseArray) this.d;
        if (vqi.l(sparseArray, iN)) {
            pcfVarB = (pcf) sparseArray.get(iN);
        } else {
            try {
                pcfVarB = B(iN, j71Var);
            } catch (ClassNotFoundException e) {
                ore.l(zo5.h(iN, "Module missing for content type "), e);
                return null;
            }
        }
        ay9 ay9Var = new ay9();
        rs5 rs5Var = ss5Var.i;
        ay9Var.b = uri;
        ay9Var.b(ss5Var.d);
        ay9Var.g = ss5Var.f;
        ry9 ry9VarA = ay9Var.a();
        if (rs5Var != null) {
            pcfVarB.d(rs5Var.a).b(rs5Var.b);
        }
        return pcfVarB.c((Executor) this.c).a(ry9VarA);
    }

    @Override // defpackage.qeh
    public int s() {
        return zo5.D(12.0f, yl5.d().getDisplayMetrics().density, ((reh) this.c).getMeasuredHeight() - ((dm8) this.d).getMeasuredHeight());
    }

    public void u(lj6 lj6Var, m5i m5iVar) {
        kyh[] kyhVarArr = (kyh[]) this.c;
        for (int i = 0; i < kyhVarArr.length; i++) {
            m5iVar.a();
            m5iVar.b();
            kyh kyhVarG = lj6Var.G(m5iVar.d, 3);
            b87 b87Var = (b87) ((List) this.b).get(i);
            String str = b87Var.n;
            lvb.S("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            String str2 = b87Var.a;
            if (str2 == null) {
                m5iVar.b();
                str2 = m5iVar.e;
            }
            a87 a87Var = new a87();
            a87Var.a = str2;
            a87Var.l = uya.n("video/mp2t");
            a87Var.m = uya.n(str);
            a87Var.e = b87Var.e;
            a87Var.d = b87Var.d;
            a87Var.J = b87Var.K;
            a87Var.p = b87Var.q;
            ewi.n(a87Var, kyhVarG);
            kyhVarArr[i] = kyhVarG;
        }
    }

    @Override // defpackage.qeh
    public int v() {
        return ((dm8) this.d).getTop();
    }

    public long w() {
        qa5 qa5Var = (qa5) this.d;
        if (qa5Var != null) {
            return qa5Var.d;
        }
        return -1L;
    }

    public void x(JSONObject jSONObject) {
        b2b b2bVarA;
        yt1 yt1Var;
        du1 du1VarL;
        ru1 ru1Var = (ru1) this.b;
        CidLogger cidLogger = ((tx) this.c).a;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("movieShareInfo");
            Integer numB = f6m.b(jSONObject, "roomId");
            dnf cnfVar = numB != null ? new cnf(numB.intValue()) : bnf.a;
            jSONObject2.getClass();
            try {
                b2bVarA = tx.a(jSONObject2, cnfVar);
            } catch (Throwable th) {
                cidLogger.logException("VideoStreamsParser", "Can't parse movie", th);
                b2bVarA = null;
                if (b2bVarA == null) {
                    return;
                }
                List list = du1VarL.r;
                list.getClass();
                ru1Var.g(new smc(yt1Var, new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new due(ww3.H1(b2bVarA.c, list)), new xr8(), new xr8()), null);
                ((s81) this.d).invoke(oh1.E, b2bVarA);
            }
        } catch (Throwable th2) {
            cidLogger.logException("VideoStreamsParser", "Can't parse movie", th2);
            b2bVarA = null;
        }
        if (b2bVarA == null && (du1VarL = ru1Var.l((yt1Var = b2bVarA.a))) != null) {
            List list2 = du1VarL.r;
            list2.getClass();
            ru1Var.g(new smc(yt1Var, new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new due(ww3.H1(b2bVarA.c, list2)), new xr8(), new xr8()), null);
            ((s81) this.d).invoke(oh1.E, b2bVarA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0243  */
    /* JADX WARN: Code duplicated, block: B:105:0x026e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX WARN: Code duplicated, block: B:110:0x0283  */
    /* JADX WARN: Code duplicated, block: B:111:0x0291  */
    /* JADX WARN: Code duplicated, block: B:113:0x029d  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:135:0x030a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0318  */
    /* JADX WARN: Code duplicated, block: B:143:0x0331  */
    /* JADX WARN: Code duplicated, block: B:144:0x0333  */
    /* JADX WARN: Code duplicated, block: B:146:0x0361  */
    /* JADX WARN: Code duplicated, block: B:152:0x0390  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:159:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:162:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:165:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:166:0x03df  */
    /* JADX WARN: Code duplicated, block: B:172:0x0405  */
    /* JADX WARN: Code duplicated, block: B:175:0x0415  */
    /* JADX WARN: Code duplicated, block: B:176:0x0417  */
    /* JADX WARN: Code duplicated, block: B:182:0x043f  */
    /* JADX WARN: Code duplicated, block: B:185:0x044d  */
    /* JADX WARN: Code duplicated, block: B:186:0x044f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0455  */
    /* JADX WARN: Code duplicated, block: B:190:0x046e  */
    /* JADX WARN: Code duplicated, block: B:196:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:198:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:201:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:204:0x04ca A[Catch: NumberFormatException | JSONException -> 0x04e4, TryCatch #1 {NumberFormatException | JSONException -> 0x04e4, blocks: (B:202:0x04c3, B:204:0x04ca, B:206:0x04d3, B:207:0x04dc, B:208:0x04e3), top: B:265:0x04c3 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x04d3 A[Catch: NumberFormatException | JSONException -> 0x04e4, LOOP:1: B:205:0x04d1->B:206:0x04d3, LOOP_END, TryCatch #1 {NumberFormatException | JSONException -> 0x04e4, blocks: (B:202:0x04c3, B:204:0x04ca, B:206:0x04d3, B:207:0x04dc, B:208:0x04e3), top: B:265:0x04c3 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x04dc A[Catch: NumberFormatException | JSONException -> 0x04e4, TryCatch #1 {NumberFormatException | JSONException -> 0x04e4, blocks: (B:202:0x04c3, B:204:0x04ca, B:206:0x04d3, B:207:0x04dc, B:208:0x04e3), top: B:265:0x04c3 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:214:0x050d  */
    /* JADX WARN: Code duplicated, block: B:215:0x050f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0518 A[Catch: IllegalArgumentException -> 0x0535, JSONException -> 0x0566, TryCatch #12 {IllegalArgumentException -> 0x0535, JSONException -> 0x0566, blocks: (B:216:0x0512, B:218:0x0518, B:220:0x0524, B:223:0x0537, B:224:0x053e, B:225:0x053f, B:226:0x0546), top: B:280:0x0512 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x0524 A[Catch: IllegalArgumentException -> 0x0535, JSONException -> 0x0566, TryCatch #12 {IllegalArgumentException -> 0x0535, JSONException -> 0x0566, blocks: (B:216:0x0512, B:218:0x0518, B:220:0x0524, B:223:0x0537, B:224:0x053e, B:225:0x053f, B:226:0x0546), top: B:280:0x0512 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0537 A[Catch: IllegalArgumentException -> 0x0535, JSONException -> 0x0566, TryCatch #12 {IllegalArgumentException -> 0x0535, JSONException -> 0x0566, blocks: (B:216:0x0512, B:218:0x0518, B:220:0x0524, B:223:0x0537, B:224:0x053e, B:225:0x053f, B:226:0x0546), top: B:280:0x0512 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x053f A[Catch: IllegalArgumentException -> 0x0535, JSONException -> 0x0566, TryCatch #12 {IllegalArgumentException -> 0x0535, JSONException -> 0x0566, blocks: (B:216:0x0512, B:218:0x0518, B:220:0x0524, B:223:0x0537, B:224:0x053e, B:225:0x053f, B:226:0x0546), top: B:280:0x0512 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x057b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0593  */
    /* JADX WARN: Code duplicated, block: B:238:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:241:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:245:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:250:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:251:0x05f4 A[Catch: ExecutionException -> 0x0605, TimeoutException -> 0x0607, InterruptedException -> 0x0610, TryCatch #11 {InterruptedException -> 0x0610, ExecutionException -> 0x0605, TimeoutException -> 0x0607, blocks: (B:248:0x05db, B:252:0x05f8, B:251:0x05f4), top: B:281:0x05db }] */
    /* JADX WARN: Code duplicated, block: B:261:0x063c  */
    /* JADX WARN: Code duplicated, block: B:265:0x04c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0371 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0480 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0398 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x05db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    /* JADX WARN: Code duplicated, block: B:51:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:58:0x015b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0234  */
    /* JADX WARN: Code duplicated, block: B:99:0x0241  */
    /* JADX WARN: Instruction removed from duplicated block: B:188:0x0455, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:245:0x05c5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v188 */
    /* JADX WARN: Type inference failed for: r0v189 */
    public boolean y() {
        g68 g68Var;
        Bundle bundle;
        int identifier;
        String strZ;
        Uri defaultUri;
        String strZ2;
        String strZ3;
        Uri uri;
        Intent launchIntentForPackage;
        Bundle bundle2;
        PendingIntent activity;
        PendingIntent broadcast;
        String strZ4;
        Integer numValueOf;
        String strZ5;
        Integer numW;
        Integer numW2;
        Integer numW3;
        String strZ6;
        Long lValueOf;
        JSONArray jSONArrayX;
        int length;
        long[] jArr;
        int i;
        JSONArray jSONArrayX2;
        int[] iArr;
        int color;
        boolean zV;
        ?? r0;
        int i2;
        String strZ7;
        Bitmap bitmap;
        IconCompat iconCompatB;
        int i3;
        int i4;
        int i5;
        int identifier2;
        String string;
        int i6 = 1;
        if (((up4) this.d).v("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strZ8 = ((up4) this.d).z("gcm.n.image");
        if (TextUtils.isEmpty(strZ8)) {
            g68Var = null;
        } else {
            try {
                g68Var = new g68(new URL(strZ8));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strZ8);
                g68Var = null;
            }
        }
        if (g68Var != null) {
            ExecutorService executorService = (ExecutorService) this.b;
            qjh qjhVar = new qjh();
            g68Var.b = executorService.submit(new su6(g68Var, 5, qjhVar));
            g68Var.c = qjhVar.a;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.c;
        up4 up4Var = (up4) this.d;
        AtomicInteger atomicInteger = m44.a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), np0.m);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle3 = bundle;
        String strZ9 = up4Var.z("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strZ9 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strZ9)) {
                    strZ9 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strZ9)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strZ9) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strZ9 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                } else if (notificationManager.getNotificationChannel(strZ9) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + strZ9 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strZ9 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strZ9)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strZ9) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strZ9 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = m44.a;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        qlb qlbVar = new qlb(firebaseMessagingService2, strZ9);
        String strY = up4Var.y(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strY)) {
            qlbVar.e = qlb.c(strY);
        }
        CharSequence charSequenceY = up4Var.y(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(charSequenceY)) {
            qlbVar.d(charSequenceY);
            olb olbVar = new olb();
            olbVar.e = qlb.c(charSequenceY);
            qlbVar.i(olbVar);
        }
        String strZ10 = up4Var.z("gcm.n.icon");
        if (!TextUtils.isEmpty(strZ10)) {
            identifier = resources.getIdentifier(strZ10, "drawable", packageName);
            if ((identifier == 0 || !m44.a(resources, identifier)) && ((identifier = resources.getIdentifier(strZ10, "mipmap", packageName)) == 0 || !m44.a(resources, identifier))) {
                Log.w("FirebaseMessaging", "Icon resource " + strZ10 + " not found. Notification will use default icon.");
            } else {
                i6 = 1;
            }
            qlbVar.G.icon = identifier;
            strZ = up4Var.z("gcm.n.sound2");
            if (TextUtils.isEmpty(strZ)) {
                strZ = up4Var.z("gcm.n.sound");
            }
            if (TextUtils.isEmpty(strZ)) {
                defaultUri = null;
            } else if (!"default".equals(strZ) || resources.getIdentifier(strZ, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strZ);
            }
            if (defaultUri != null) {
                qlbVar.h(defaultUri);
            }
            strZ2 = up4Var.z("gcm.n.click_action");
            if (TextUtils.isEmpty(strZ2)) {
                strZ3 = up4Var.z("gcm.n.link_android");
                if (TextUtils.isEmpty(strZ3)) {
                    strZ3 = up4Var.z("gcm.n.link");
                }
                if (TextUtils.isEmpty(strZ3)) {
                    uri = null;
                } else {
                    uri = Uri.parse(strZ3);
                }
                if (uri != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setData(uri);
                } else {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    if (launchIntentForPackage == null) {
                        Log.w("FirebaseMessaging", "No activity found to launch app");
                    }
                }
            } else {
                launchIntentForPackage = new Intent(strZ2);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setFlags(268435456);
            }
            if (launchIntentForPackage == null) {
                activity = null;
            } else {
                launchIntentForPackage.addFlags(67108864);
                Bundle bundle4 = up4Var.a;
                bundle2 = new Bundle(bundle4);
                for (String str : bundle4.keySet()) {
                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                        bundle2.remove(str);
                    }
                }
                launchIntentForPackage.putExtras(bundle2);
                if (up4Var.v("google.c.a.e")) {
                    launchIntentForPackage.putExtra("gcm.n.analytics_data", up4Var.B());
                }
                activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
            }
            qlbVar.g = activity;
            if (up4Var.v("google.c.a.e")) {
                broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(up4Var.B())), 1140850688);
            } else {
                broadcast = null;
            }
            if (broadcast != null) {
                qlbVar.G.deleteIntent = broadcast;
            }
            strZ4 = up4Var.z("gcm.n.color");
            if (TextUtils.isEmpty(strZ4)) {
                i5 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i5 != 0) {
                    numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i5));
                } else {
                    numValueOf = null;
                }
            } else {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strZ4));
                } catch (IllegalArgumentException unused3) {
                    Log.w("FirebaseMessaging", "Color is invalid: " + strZ4 + ". Notification will use default color.");
                    i5 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i5 != 0) {
                        try {
                            numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i5));
                        } catch (Resources.NotFoundException unused4) {
                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                qlbVar.y = numValueOf.intValue();
            }
            qlbVar.f(16, !up4Var.v("gcm.n.sticky"));
            qlbVar.v = up4Var.v("gcm.n.local_only");
            strZ5 = up4Var.z("gcm.n.ticker");
            if (strZ5 != null) {
                qlbVar.G.tickerText = qlb.c(strZ5);
            }
            numW = up4Var.w("gcm.n.notification_priority");
            if (numW == null) {
                numW = null;
            } else if (numW.intValue() >= -2 || numW.intValue() > 2) {
                Log.w("FirebaseMessaging", "notificationPriority is invalid " + numW + ". Skipping setting notificationPriority.");
                numW = null;
            }
            if (numW != null) {
                qlbVar.k = numW.intValue();
            }
            numW2 = up4Var.w("gcm.n.visibility");
            if (numW2 == null) {
                numW2 = null;
            } else if (numW2.intValue() >= -1 || numW2.intValue() > i6) {
                Log.w("NotificationParams", "visibility is invalid: " + numW2 + ". Skipping setting visibility.");
                numW2 = null;
            }
            if (numW2 != null) {
                qlbVar.z = numW2.intValue();
            }
            numW3 = up4Var.w("gcm.n.notification_count");
            if (numW3 != null) {
                numW3 = null;
            } else if (numW3.intValue() < 0) {
                Log.w("FirebaseMessaging", "notificationCount is invalid: " + numW3 + ". Skipping setting notificationCount.");
                numW3 = null;
            }
            if (numW3 != null) {
                qlbVar.j = numW3.intValue();
            }
            strZ6 = up4Var.z("gcm.n.event_time");
            if (TextUtils.isEmpty(strZ6)) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(Long.parseLong(strZ6));
                } catch (NumberFormatException unused5) {
                    Log.w("NotificationParams", "Couldn't parse value of " + up4.C("gcm.n.event_time") + "(" + strZ6 + ") into a long");
                    lValueOf = null;
                }
            }
            if (lValueOf != null) {
                qlbVar.l = true;
                qlbVar.G.when = lValueOf.longValue();
            }
            jSONArrayX = up4Var.x("gcm.n.vibrate_timings");
            if (jSONArrayX == null) {
                jArr = null;
            } else {
                try {
                    if (jSONArrayX.length() > 1) {
                        throw new JSONException("vibrateTimings have invalid length");
                    }
                    length = jSONArrayX.length();
                    jArr = new long[length];
                    for (i = 0; i < length; i++) {
                        jArr[i] = jSONArrayX.optLong(i);
                    }
                } catch (NumberFormatException | JSONException unused6) {
                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayX + ". Skipping setting vibrateTimings.");
                    jArr = null;
                }
            }
            if (jArr != null) {
                qlbVar.G.vibrate = jArr;
            }
            jSONArrayX2 = up4Var.x("gcm.n.light_settings");
            if (jSONArrayX2 == null) {
                iArr = null;
            } else {
                iArr = new int[3];
                try {
                    if (jSONArrayX2.length() == 3) {
                        throw new JSONException("lightSettings don't have all three fields");
                    }
                    color = Color.parseColor(jSONArrayX2.optString(0));
                    if (color != -16777216) {
                        throw new IllegalArgumentException("Transparent color is invalid");
                    }
                    iArr[0] = color;
                    iArr[1] = jSONArrayX2.optInt(1);
                    iArr[2] = jSONArrayX2.optInt(2);
                } catch (IllegalArgumentException e2) {
                    Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayX2 + ". " + e2.getMessage() + ". Skipping setting LightSettings");
                    iArr = null;
                } catch (JSONException unused7) {
                    Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayX2 + ". Skipping setting LightSettings");
                    iArr = null;
                }
            }
            if (iArr != null) {
                int i7 = iArr[0];
                i3 = iArr[1];
                int i8 = iArr[2];
                Notification notification = qlbVar.G;
                notification.ledARGB = i7;
                notification.ledOnMS = i3;
                notification.ledOffMS = i8;
                if (i3 != 0 || i8 == 0) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                notification.flags = i4 | ((-2) & notification.flags);
            }
            zV = up4Var.v("gcm.n.default_sound");
            r0 = zV;
            if (up4Var.v("gcm.n.default_vibrate_timings")) {
                r0 = (zV ? 1 : 0) | 2;
            }
            i2 = r0;
            if (up4Var.v("gcm.n.default_light_settings")) {
                i2 = (r0 == true ? 1 : 0) | 4;
            }
            qlbVar.e(i2);
            strZ7 = up4Var.z("gcm.n.tag");
            if (TextUtils.isEmpty(strZ7)) {
                strZ7 = "FCM-Notification:" + SystemClock.uptimeMillis();
            }
            String str2 = strZ7;
            if (g68Var != null) {
                try {
                    kam kamVar = g68Var.c;
                    yab.s(kamVar);
                    bitmap = (Bitmap) gwl.b(kamVar, 5L);
                    qlbVar.g(bitmap);
                    nlb nlbVar = new nlb();
                    if (bitmap == null) {
                        iconCompatB = null;
                    } else {
                        iconCompatB = IconCompat.b(bitmap);
                    }
                    nlbVar.e = iconCompatB;
                    nlbVar.f = null;
                    nlbVar.g = true;
                    qlbVar.i(nlbVar);
                } catch (InterruptedException unused8) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    g68Var.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e3) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e3.getCause());
                } catch (TimeoutException unused9) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    g68Var.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify(str2, 0, qlbVar.a());
            return true;
        }
        int i9 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i9 == 0 || !m44.a(resources, i9)) {
            try {
                i9 = packageManager.getApplicationInfo(packageName, 0).icon;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e4);
            }
        }
        identifier = (i9 == 0 || !m44.a(resources, i9)) ? 17301651 : i9;
        qlbVar.G.icon = identifier;
        strZ = up4Var.z("gcm.n.sound2");
        if (TextUtils.isEmpty(strZ)) {
            strZ = up4Var.z("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strZ)) {
            defaultUri = null;
        } else if ("default".equals(strZ)) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (defaultUri != null) {
            qlbVar.h(defaultUri);
        }
        strZ2 = up4Var.z("gcm.n.click_action");
        if (TextUtils.isEmpty(strZ2)) {
            launchIntentForPackage = new Intent(strZ2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            strZ3 = up4Var.z("gcm.n.link_android");
            if (TextUtils.isEmpty(strZ3)) {
                strZ3 = up4Var.z("gcm.n.link");
            }
            if (TextUtils.isEmpty(strZ3)) {
                uri = Uri.parse(strZ3);
            } else {
                uri = null;
            }
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle5 = up4Var.a;
            bundle2 = new Bundle(bundle5);
            while (r13.hasNext()) {
                if (str.startsWith("google.c.")) {
                    bundle2.remove(str);
                } else {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (up4Var.v("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", up4Var.B());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        qlbVar.g = activity;
        if (up4Var.v("google.c.a.e")) {
            broadcast = null;
        } else {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(up4Var.B())), 1140850688);
        }
        if (broadcast != null) {
            qlbVar.G.deleteIntent = broadcast;
        }
        strZ4 = up4Var.z("gcm.n.color");
        if (TextUtils.isEmpty(strZ4)) {
            numValueOf = Integer.valueOf(Color.parseColor(strZ4));
        } else {
            i5 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i5 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i5));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            qlbVar.y = numValueOf.intValue();
        }
        qlbVar.f(16, !up4Var.v("gcm.n.sticky"));
        qlbVar.v = up4Var.v("gcm.n.local_only");
        strZ5 = up4Var.z("gcm.n.ticker");
        if (strZ5 != null) {
            qlbVar.G.tickerText = qlb.c(strZ5);
        }
        numW = up4Var.w("gcm.n.notification_priority");
        if (numW == null) {
            if (numW.intValue() >= -2) {
            }
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numW + ". Skipping setting notificationPriority.");
            numW = null;
        } else {
            numW = null;
        }
        if (numW != null) {
            qlbVar.k = numW.intValue();
        }
        numW2 = up4Var.w("gcm.n.visibility");
        if (numW2 == null) {
            if (numW2.intValue() >= -1) {
            }
            Log.w("NotificationParams", "visibility is invalid: " + numW2 + ". Skipping setting visibility.");
            numW2 = null;
        } else {
            numW2 = null;
        }
        if (numW2 != null) {
            qlbVar.z = numW2.intValue();
        }
        numW3 = up4Var.w("gcm.n.notification_count");
        if (numW3 != null) {
            numW3 = null;
        } else if (numW3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numW3 + ". Skipping setting notificationCount.");
            numW3 = null;
        }
        if (numW3 != null) {
            qlbVar.j = numW3.intValue();
        }
        strZ6 = up4Var.z("gcm.n.event_time");
        if (TextUtils.isEmpty(strZ6)) {
            lValueOf = Long.valueOf(Long.parseLong(strZ6));
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            qlbVar.l = true;
            qlbVar.G.when = lValueOf.longValue();
        }
        jSONArrayX = up4Var.x("gcm.n.vibrate_timings");
        if (jSONArrayX == null) {
            jArr = null;
        } else {
            if (jSONArrayX.length() > 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            length = jSONArrayX.length();
            jArr = new long[length];
            while (i < length) {
                jArr[i] = jSONArrayX.optLong(i);
            }
        }
        if (jArr != null) {
            qlbVar.G.vibrate = jArr;
        }
        jSONArrayX2 = up4Var.x("gcm.n.light_settings");
        if (jSONArrayX2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            if (jSONArrayX2.length() == 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            color = Color.parseColor(jSONArrayX2.optString(0));
            if (color != -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayX2.optInt(1);
            iArr[2] = jSONArrayX2.optInt(2);
        }
        if (iArr != null) {
            int i10 = iArr[0];
            i3 = iArr[1];
            int i11 = iArr[2];
            Notification notification2 = qlbVar.G;
            notification2.ledARGB = i10;
            notification2.ledOnMS = i3;
            notification2.ledOffMS = i11;
            if (i3 != 0) {
                i4 = 0;
            } else {
                i4 = 0;
            }
            notification2.flags = i4 | ((-2) & notification2.flags);
        }
        zV = up4Var.v("gcm.n.default_sound");
        r0 = zV;
        if (up4Var.v("gcm.n.default_vibrate_timings")) {
            r0 = (zV ? 1 : 0) | 2;
        }
        i2 = r0;
        if (up4Var.v("gcm.n.default_light_settings")) {
            i2 = (r0 == true ? 1 : 0) | 4;
        }
        qlbVar.e(i2);
        strZ7 = up4Var.z("gcm.n.tag");
        if (TextUtils.isEmpty(strZ7)) {
            strZ7 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str3 = strZ7;
        if (g68Var != null) {
            kam kamVar2 = g68Var.c;
            yab.s(kamVar2);
            bitmap = (Bitmap) gwl.b(kamVar2, 5L);
            qlbVar.g(bitmap);
            nlb nlbVar2 = new nlb();
            if (bitmap == null) {
                iconCompatB = null;
            } else {
                iconCompatB = IconCompat.b(bitmap);
            }
            nlbVar2.e = iconCompatB;
            nlbVar2.f = null;
            nlbVar2.g = true;
            qlbVar.i(nlbVar2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify(str3, 0, qlbVar.a());
        return true;
    }

    @Override // defpackage.qeh
    public View z() {
        return (dm8) this.d;
    }

    public /* synthetic */ xtj(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ xtj(int i, boolean z) {
        this.a = i;
    }

    public xtj(ru1 ru1Var, tx txVar, s81 s81Var) {
        this.a = 11;
        ru1Var.getClass();
        txVar.getClass();
        this.b = ru1Var;
        this.c = txVar;
        this.d = s81Var;
    }

    public xtj(l4k l4kVar, g7k g7kVar, Logger logger) {
        this.a = 21;
        this.b = l4kVar;
        this.c = g7kVar;
        this.d = logger.createLogger("SendPushTokenToClientIfNeedUseCase");
    }

    public xtj(sp spVar, Object obj) {
        this.a = 1;
        this.b = obj;
        this.c = spVar.a;
        this.d = spVar.b;
    }

    public xtj(gve gveVar, u97 u97Var) {
        this.a = 12;
        this.b = gveVar;
        this.c = u97Var;
        this.d = Collections.singleton(new er3());
    }

    public xtj(pjc pjcVar) {
        this.a = 16;
        du3 du3Var = du3.b;
        this.b = pjcVar;
        this.c = gvk.b(1);
        this.d = gvk.c(du3Var);
    }

    public xtj(List list) {
        this.a = 15;
        this.b = list;
        this.c = new kyh[list.size()];
        this.d = new ake(new qyb(20, this));
    }

    public xtj(FirebaseMessagingService firebaseMessagingService, up4 up4Var, ExecutorService executorService) {
        this.a = 7;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = up4Var;
    }

    public xtj(nj6 nj6Var) {
        this.a = 3;
        this.b = nj6Var;
    }

    public xtj(j71 j71Var, Executor executor) {
        this.a = 6;
        j71Var.getClass();
        this.b = j71Var;
        executor.getClass();
        this.c = executor;
        this.d = new SparseArray();
    }

    public xtj(Context context) {
        this.a = 14;
        this.b = new Object();
        this.d = new HashMap();
        this.c = new jue(this, context);
    }

    public xtj(zgd zgdVar, ArrayList arrayList, nf2 nf2Var) {
        this.a = 13;
        this.d = zgdVar;
        this.b = arrayList;
        this.c = nf2Var;
    }

    public xtj(Signature signature) {
        this.a = 8;
        this.b = signature;
        this.c = null;
        this.d = null;
    }

    public xtj(Cipher cipher) {
        this.a = 8;
        this.c = cipher;
        this.b = null;
        this.d = null;
    }

    public xtj(Mac mac) {
        this.a = 8;
        this.d = mac;
        this.c = null;
        this.b = null;
    }
}
