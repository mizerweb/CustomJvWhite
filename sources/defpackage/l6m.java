package defpackage;

import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiCaptchaException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiInvocationParamException;
import ru.ok.android.api.core.ApiLoginException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.session.ApiRecreateSessionException;
import ru.ok.android.api.session.ApiSessionChangedException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.tamtam.android.prefs.FilePrefsException;

/* JADX INFO: loaded from: classes2.dex */
public class l6m implements hu8, df0, nsi, k74, kxa, kq4, b71, n74, an7, ds6, w76, v7, s38 {
    public static l6m b;
    public final /* synthetic */ int a;
    public static final l6m c = new l6m(1);
    public static final l6m d = new l6m(2);
    public static final l6m e = new l6m(3);
    public static final l6m f = new l6m(4);
    public static final l6m g = new l6m(5);
    public static final l6m h = new l6m(6);
    public static final l6m i = new l6m(8);
    public static final l6m j = new l6m(9);
    public static final l6m k = new l6m(10);
    public static final l6m l = new l6m(10);
    public static final l6m m = new l6m(10);
    public static final l6m n = new l6m(10);
    public static final l6m o = new l6m(10);
    public static final l6m p = new l6m(10);
    public static final l6m q = new l6m(11);
    public static final l6m r = new l6m(12);
    public static final /* synthetic */ l6m s = new l6m(13);

    public /* synthetic */ l6m(int i2) {
        this.a = i2;
    }

    public static final tq7 g() {
        int i2 = vq7.e;
        tq7 tq7Var = new tq7();
        tq7Var.a = 0;
        tq7Var.b = 0;
        tq7Var.c = 0.0f;
        tq7Var.d = 0;
        tq7Var.e = false;
        tq7Var.f = 1;
        return tq7Var;
    }

    public static double l(wu0 wu0Var, long j2, int i2, double d2) {
        double dG = ew5.g(j2);
        if (dG <= 0.0d) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "su0", "Skip score calculation cuz duration is negative or zero", null);
                }
            }
            return 0.0d;
        }
        long jG = ew5.g(j2);
        long j3 = wu0Var.b;
        if (j3 < 0) {
            j3 = 0;
        }
        double d3 = j3;
        long j4 = wu0Var.g;
        if (j4 < 0) {
            j4 = 0;
        }
        double d4 = j4;
        long j5 = wu0Var.f;
        if (j5 < 0) {
            j5 = 0;
        }
        double d5 = j5;
        long j6 = wu0Var.d;
        if (j6 < 0) {
            j6 = 0;
        }
        double d6 = j6;
        long j7 = wu0Var.c;
        if (j7 < 0) {
            j7 = 0;
        }
        double dX = oc9.x(wu0Var.h, 0L, jG);
        double dX2 = oc9.x(wu0Var.e, 0L, jG);
        return ((((d3 * 1000.0d) / d2) / (((double) i2) * dG)) * 1.0d) + ((dX / dG) * 0.03d) + (((d5 / 4096.0d) / dG) * 0.25d) + (((d4 / 4096.0d) / dG) * 0.35d) + ((dX2 / dG) * 0.08d) + (((j7 / 1024.0d) / dG) * 0.85d) + (((d6 / 512.0d) / dG) * 1.2d);
    }

    public static ti1 s(JSONObject jSONObject) {
        String strOptString;
        yt1 yt1VarA;
        String strOptString2 = jSONObject.optString("key");
        int i2 = 0;
        jSONObject.optInt("totalCount", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(CallAnalyticsApiRequest.KEY_ITEMS);
        if (jSONArrayOptJSONArray == null) {
            strOptString2.getClass();
            return new ti1(strOptString2, r66.a);
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        if (length >= 0) {
            while (true) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("participantId")) != null) {
                    try {
                        yt1VarA = yt1.a(strOptString);
                    } catch (Exception unused) {
                        yt1VarA = null;
                    }
                    if (yt1VarA != null) {
                        arrayList.add(yt1VarA);
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        strOptString2.getClass();
        return new ti1(strOptString2, arrayList);
    }

    public static lo7 t() throws IOException {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("dns.google.com").appendPath("resolve");
        builderAppendPath.appendQueryParameter(SdkMetricStatEvent.NAME_KEY, "api._endpoint.ok.ru.");
        builderAppendPath.appendQueryParameter("type", String.valueOf(16));
        URLConnection uRLConnectionOpenConnection = new URL(builderAppendPath.toString()).openConnection();
        uRLConnectionOpenConnection.setConnectTimeout(3000);
        uRLConnectionOpenConnection.setReadTimeout(3000);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnectionOpenConnection.getInputStream(), pt2.a), 8192);
        try {
            String strI = gm0.I(bufferedReader);
            bufferedReader.close();
            try {
                JSONObject jSONObject = new JSONObject(strI).getJSONArray("Answer").getJSONObject(0);
                jSONObject.getString(SdkMetricStatEvent.NAME_KEY);
                jSONObject.getInt("type");
                return new lo7(jSONObject.getInt("TTL"), jSONObject.getString("data"));
            } catch (JSONException e2) {
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rx8.n(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static synchronized void u() {
        if (b == null) {
            b = new l6m(0);
        }
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        return ch3.m((Executor) ((g85) h74Var).i(new x0e(k19.class, Executor.class)));
    }

    @Override // defpackage.n74
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (v64 v64Var : componentRegistrar.getComponents()) {
            String str = v64Var.a;
            if (str != null) {
                v64Var = new v64(str, v64Var.b, v64Var.c, v64Var.d, v64Var.e, new hu(str, 9, v64Var), v64Var.g);
            }
            arrayList.add(v64Var);
        }
        return arrayList;
    }

    @Override // defpackage.w76
    public void b() {
    }

    @Override // defpackage.w76
    public void c(n76 n76Var) {
    }

    @Override // defpackage.b71
    public byte[] d(int i2, byte[] bArr, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // defpackage.df0
    public int e() {
        return 1;
    }

    @Override // defpackage.ds6
    public void error(String str, Throwable th) {
        if (th != null) {
            gm0.V("dns_store", str, new FilePrefsException(str, th));
        } else {
            gm0.Y("dns_store", str);
        }
    }

    @Override // defpackage.s38
    public List f(List list) {
        list.getClass();
        return list;
    }

    @Override // defpackage.kq4
    public Object h(Task task) throws IOException {
        if (task.j()) {
            return (Bundle) task.h();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.g())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.g());
    }

    @Override // defpackage.w76
    public void i(EncodeException encodeException) {
    }

    @Override // defpackage.kxa
    public PointF j(ixa ixaVar, int i2) {
        return new PointF(ixaVar.a, ixaVar.b);
    }

    @Override // defpackage.ds6
    public void log(String str) {
    }

    @Override // defpackage.w76
    public void m(s63 s63Var) {
    }

    public dc1 n(xu6 xu6Var, mf mfVar) {
        int i2;
        IOException iOException = (IOException) mfVar.c;
        boolean z = false;
        if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).c) == 403 || i2 == 404 || i2 == 410 || i2 == 416 || i2 == 500 || i2 == 503)) {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (xu6Var.a(1)) {
            return new dc1(1, 300000L);
        }
        if (xu6Var.a(2)) {
            return new dc1(2, 60000L);
        }
        return null;
    }

    public int o(int i2) {
        return i2 == 7 ? 6 : 3;
    }

    public long p(long j2) {
        return -9223372036854775807L;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) throws JsonParseException {
        String strF;
        vu8Var.p();
        int iZ = 0;
        String strF2 = null;
        ip ipVar = null;
        String strF3 = null;
        String strF4 = null;
        String strZ = null;
        String strZ2 = null;
        String strName = null;
        String strE0 = null;
        while (vu8Var.hasNext()) {
            String strName2 = vu8Var.name();
            switch (strName2.hashCode()) {
                case -1125973592:
                    if (!strName2.equals("ver_redirect_url")) {
                        vu8Var.x();
                    } else {
                        vu8Var.F();
                    }
                    break;
                case -830722045:
                    if (!strName2.equals("error_field")) {
                        vu8Var.x();
                    } else {
                        strZ = vu8Var.Z();
                    }
                    break;
                case -22145738:
                    if (!strName2.equals("session_key")) {
                        vu8Var.x();
                    } else {
                        strF2 = vu8Var.F();
                    }
                    break;
                case 96784904:
                    if (!strName2.equals("error")) {
                        vu8Var.x();
                    } else {
                        strF4 = vu8Var.F();
                    }
                    break;
                case 329868490:
                    if (!strName2.equals("error_msg")) {
                        vu8Var.x();
                    } else {
                        strF4 = vu8Var.F();
                    }
                    break;
                case 438353305:
                    if (!strName2.equals("session_secret_key")) {
                        vu8Var.x();
                    } else {
                        strF3 = vu8Var.F();
                    }
                    break;
                case 717465530:
                    if (!strName2.equals("custom_error")) {
                        vu8Var.x();
                    } else if (vu8Var.peek() == 110) {
                        vu8Var.x();
                    } else {
                        vu8Var.p();
                        while (vu8Var.hasNext()) {
                            strName = vu8Var.name();
                            strE0 = vu8Var.E0();
                        }
                        vu8Var.t();
                    }
                    break;
                case 1635686852:
                    if (!strName2.equals("error_code")) {
                        vu8Var.x();
                    } else {
                        iZ = vu8Var.z();
                    }
                    break;
                case 1635703681:
                    if (!strName2.equals("error_data")) {
                        vu8Var.x();
                    } else {
                        strZ2 = vu8Var.Z();
                    }
                    break;
                case 1636060774:
                    if (!strName2.equals("error_page")) {
                        vu8Var.x();
                    } else {
                        int iPeek = vu8Var.peek();
                        if (iPeek == 110) {
                            vu8Var.x();
                            strF = null;
                        } else if (iPeek != 123) {
                            strF = vu8Var.F();
                        } else {
                            vu8Var.p();
                            while (true) {
                                strF = null;
                                while (true) {
                                    if (vu8Var.hasNext()) {
                                        String strName3 = vu8Var.name();
                                        if (strName3.hashCode() == 954925063 && strName3.equals("message")) {
                                            int iPeek2 = vu8Var.peek();
                                            if (iPeek2 == 110) {
                                                vu8Var.x();
                                            } else if (iPeek2 != 123) {
                                                strF = vu8Var.F();
                                            } else {
                                                vu8Var.p();
                                                strF = null;
                                                while (vu8Var.hasNext()) {
                                                    String strName4 = vu8Var.name();
                                                    if (strName4.hashCode() == 106748362 && strName4.equals("plain")) {
                                                        strF = vu8Var.F();
                                                    } else {
                                                        vu8Var.x();
                                                    }
                                                }
                                                vu8Var.t();
                                            }
                                        } else {
                                            vu8Var.x();
                                        }
                                    } else {
                                        vu8Var.t();
                                    }
                                }
                            }
                        }
                        ipVar = strF == null ? null : new ip();
                    }
                    break;
                default:
                    vu8Var.x();
                    break;
            }
        }
        vu8Var.t();
        if (iZ == 100) {
            return new ApiInvocationParamException(100, strF4, strZ, strZ2, strName, strE0, null);
        }
        if (iZ == 107) {
            if (strF2 == null) {
                throw new JsonParseException("No sessionKey");
            }
            if (strF3 != null) {
                return new ApiSessionChangedException(strF4, strF2, strF3);
            }
            throw new JsonParseException("No sessionSecretKey");
        }
        if (iZ == 401) {
            return new ApiLoginException(HttpStatus.SC_UNAUTHORIZED, strF4, strZ, strZ2, strName, strE0, null);
        }
        if (iZ == 403) {
            return new ApiCaptchaException(HttpStatus.SC_FORBIDDEN, strF4, strZ, strZ2, strName, strE0, null);
        }
        if (iZ == 102 || iZ == 103) {
            return new ApiRecreateSessionException(iZ, strF4);
        }
        return new ApiInvocationException(iZ, strF4, strZ, strZ2, strName, strE0, ipVar);
    }

    public long q(mf mfVar) {
        for (Throwable cause = (IOException) mfVar.c; cause != null; cause = cause.getCause()) {
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException)) {
                return -9223372036854775807L;
            }
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((mfVar.b - 1) * 1000, 5000);
    }

    public float r(long j2) {
        return 1.0f;
    }

    @Override // defpackage.v7
    public void run() {
    }

    public String toString() {
        switch (this.a) {
            case 26:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nsi
    public long v(kbc kbcVar) {
        switch (this.a) {
            case 3:
                return rx8.q(-1, kbcVar.getIcon().h);
            case 8:
                return rx8.q(0, kbcVar.s().c);
            default:
                return rx8.q(-1, kbcVar.getIcon().h);
        }
    }
}
