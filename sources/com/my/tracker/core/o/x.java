package com.my.tracker.core.o;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.core.Tracer;
import com.my.tracker.core.TrackerConfig;
import com.my.tracker.core.net.HttpCore;
import com.my.tracker.core.net.HttpResult;
import com.my.tracker.core.utils.PermissionUtils;
import defpackage.ag5;
import defpackage.dle;
import defpackage.hle;
import defpackage.p3c;
import defpackage.pne;
import defpackage.rne;
import defpackage.rx8;
import defpackage.uqi;
import defpackage.y6a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public final class x implements HttpCore {
    private final TrackerConfig a;
    private final Application b;

    private x(TrackerConfig trackerConfig, Application application) {
        this.a = trackerConfig;
        this.b = application;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0100 A[Catch: all -> 0x00a9, TryCatch #5 {all -> 0x00a9, blocks: (B:5:0x0028, B:19:0x0088, B:24:0x0098, B:50:0x00f7, B:51:0x00fa, B:28:0x00ad, B:54:0x0100, B:55:0x0103), top: B:77:0x0028 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.FilterOutputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.FilterOutputStream] */
    /* JADX WARN: Type inference failed for: r8v18 */
    private HttpResult a(String str, byte[] bArr, boolean z) {
        String string;
        String str2;
        String str3;
        HttpURLConnection httpURLConnection;
        Throwable th;
        BufferedReader bufferedReader;
        boolean z2 = false;
        HttpURLConnection httpURLConnection2 = null;
        String str4 = null;
        try {
            Tracer.d("HttpCoreReal: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                boolean z3 = true;
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
                httpURLConnection.setRequestProperty(HTTP.CONN_DIRECTIVE, "close");
                ?? r3 = HTTP.CONTENT_TYPE;
                httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, "application/octet-stream");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                try {
                    try {
                        if (z) {
                            httpURLConnection.setRequestProperty(HTTP.CONTENT_ENCODING, "gzip");
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                            Tracer.d("HttpCoreReal: populating post request body using gzip");
                            r3 = gZIPOutputStream;
                        } else {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            Tracer.d("HttpCoreReal: populating post request body without using gzip");
                            r3 = bufferedOutputStream;
                        }
                        r3.write(bArr);
                        if (z) {
                            ((GZIPOutputStream) r3).finish();
                        }
                        r3.close();
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode == 200 || responseCode == 204) {
                            Tracer.d("HttpCoreReal: response successfully received");
                        } else {
                            Tracer.d("HttpCoreReal error: response code " + responseCode);
                            z3 = false;
                        }
                        if (responseCode == 200) {
                            try {
                                Tracer.d("HttpCoreReal: processing server response");
                                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        sb.append(line);
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        Tracer.d("HttpCoreReal: response data is empty");
                                        string = null;
                                    }
                                    try {
                                        bufferedReader.close();
                                        z2 = z3;
                                        str3 = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        httpURLConnection2 = httpURLConnection;
                                        try {
                                            str2 = "HttpCoreReal error: error while sending data";
                                            Tracer.d("HttpCoreReal error: error while sending data", th);
                                            if (httpURLConnection2 != null) {
                                                str3 = "HttpCoreReal error: error while sending data";
                                                httpURLConnection = httpURLConnection2;
                                            }
                                            return new HttpResult(z2, string, str2);
                                        } catch (Throwable th3) {
                                            if (httpURLConnection2 != null) {
                                                httpURLConnection2.disconnect();
                                            }
                                            throw th3;
                                        }
                                    }
                                    str4 = string;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (bufferedReader == null) {
                                        throw th;
                                    }
                                    bufferedReader.close();
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedReader = null;
                            }
                        } else {
                            z2 = z3;
                            str3 = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r3 = 0;
                        if (r3 != 0) {
                            r3.close();
                        }
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    if (r3 != 0) {
                        r3.close();
                    }
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                string = null;
            }
        } catch (Throwable th9) {
            th = th9;
            string = null;
        }
        httpURLConnection.disconnect();
        str2 = str3;
        string = str4;
        return new HttpResult(z2, string, str2);
    }

    @Override // com.my.tracker.core.net.HttpCore
    public HttpResult doGet(String str) {
        MyTrackerConfig.OkHttpClientProvider okHttpClientProvider = this.a.getOkHttpClientProvider();
        return okHttpClientProvider == null ? a(str) : a(str, okHttpClientProvider);
    }

    @Override // com.my.tracker.core.net.HttpCore
    public HttpResult doPost(String str, byte[] bArr, boolean z) {
        MyTrackerConfig.OkHttpClientProvider okHttpClientProvider = this.a.getOkHttpClientProvider();
        return okHttpClientProvider == null ? a(str, bArr, z) : a(str, bArr, z, okHttpClientProvider);
    }

    @Override // com.my.tracker.core.net.HttpCore
    public boolean isConnected() {
        NetworkInfo activeNetworkInfo;
        if (!PermissionUtils.checkPermission("android.permission.ACCESS_NETWORK_STATE", this.b)) {
            return true;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Throwable unused) {
            return true;
        }
    }

    private HttpResult a(String str) {
        String string;
        BufferedReader bufferedReader;
        boolean z = false;
        HttpURLConnection httpURLConnection = null;
        String str2 = null;
        try {
            Tracer.d("HttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setConnectTimeout(3000);
                httpURLConnection2.setReadTimeout(3000);
                httpURLConnection2.setRequestMethod(HttpGet.METHOD_NAME);
                int responseCode = httpURLConnection2.getResponseCode();
                Tracer.d("HttpGetRequest: response received with response code: " + responseCode);
                boolean z2 = responseCode == 200;
                try {
                    Tracer.d("HttpGetRequest: processing server response");
                    if (z2) {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    } else {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection2.getErrorStream()));
                    }
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        if (sb.length() > 0) {
                            string = sb.toString();
                        } else {
                            Tracer.d("HttpGetRequest: response data is empty");
                            string = null;
                        }
                        try {
                            bufferedReader.close();
                            httpURLConnection2.disconnect();
                            z = z2;
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            try {
                                Tracer.d("HttpGetRequest: error", th);
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                str2 = "HttpGetRequest: error while sending data";
                            } catch (Throwable th2) {
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th2;
                            }
                        }
                        return new HttpResult(z, string, str2);
                    } catch (Throwable th3) {
                        th = th3;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                }
            } catch (Throwable th5) {
                th = th5;
                string = null;
            }
        } catch (Throwable th6) {
            th = th6;
            string = null;
        }
    }

    private HttpResult a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        String strI;
        boolean z;
        boolean z2 = false;
        String str2 = null;
        try {
            Tracer.d("OkHttpGetRequest: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            ag5 ag5Var = new ag5(3);
            ag5Var.h(str);
            ag5Var.e(HttpGet.METHOD_NAME, null);
            pne pneVarF = okHttpClientProvider.getOkHttpClient().b(ag5Var.a()).f();
            try {
                int i = pneVarF.d;
                if (i == 200) {
                    Tracer.d("OkHttpGetRequest: response successfully received");
                    z = true;
                } else {
                    Tracer.d("OkHttpGetRequest error: response code " + i);
                    z = false;
                }
                if (i == 200) {
                    Tracer.d("OkHttpGetRequest: processing server response");
                    rne rneVar = pneVarF.g;
                    strI = rneVar != null ? rneVar.I() : null;
                    if (TextUtils.isEmpty(strI)) {
                        Tracer.d("OkHttpGetRequest: response data is empty");
                        strI = null;
                    }
                } else {
                    strI = null;
                }
                try {
                    pneVarF.close();
                    z2 = z;
                } catch (Throwable th) {
                    th = th;
                    str2 = strI;
                    Tracer.d("OkHttpGetRequest error: error while sending data", th);
                    strI = str2;
                    str2 = "OkHttpGetRequest error: error while sending data";
                }
            } catch (Throwable th2) {
                try {
                    pneVarF.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
            Tracer.d("OkHttpGetRequest error: error while sending data", th);
            strI = str2;
            str2 = "OkHttpGetRequest error: error while sending data";
            return new HttpResult(z2, strI, str2);
        }
        return new HttpResult(z2, strI, str2);
    }

    public static x a(TrackerConfig trackerConfig, Application application) {
        return new x(trackerConfig, application);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [byte[], java.io.Serializable] */
    private HttpResult a(String str, byte[] bArr, boolean z, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        String strI;
        String str2;
        String str3;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        y6a y6aVarB;
        boolean z2;
        boolean z3 = false;
        z3 = false;
        pne pneVar = null;
        String str4 = null;
        try {
            Tracer.d("HttpCoreReal: send request to " + str);
            TrafficStats.setThreadStatsTag(27498374);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (z) {
                        Tracer.d("HttpCoreReal: populating post request body using gzip");
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream.write(bArr);
                            gZIPOutputStream.finish();
                        } catch (Throwable th) {
                            th = th;
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        Tracer.d("HttpCoreReal: populating post request body without using gzip");
                        byteArrayOutputStream.write(bArr);
                        byteArrayOutputStream.flush();
                        gZIPOutputStream = null;
                    }
                    Pattern pattern = y6a.c;
                    try {
                        y6aVarB = rx8.B("application/octet-stream");
                    } catch (IllegalArgumentException unused) {
                        y6aVarB = null;
                    }
                    ag5 ag5Var = new ag5(3);
                    ag5Var.h(str);
                    ((p3c) ag5Var.c).s(HTTP.CONTENT_ENCODING, "gzip");
                    ?? byteArray = byteArrayOutputStream.toByteArray();
                    int length = byteArray.length;
                    uqi.c(byteArray.length, 0L, length);
                    ag5Var.e(HttpPost.METHOD_NAME, new hle(y6aVarB, length, byteArray, z3 ? 1 : 0));
                    dle dleVarA = ag5Var.a();
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    byteArrayOutputStream.close();
                    pne pneVarF = okHttpClientProvider.getOkHttpClient().b(dleVarA).f();
                    try {
                        int i = pneVarF.d;
                        if (i != 200 && i != 204) {
                            Tracer.d("HttpCoreReal error: response code " + i);
                            z2 = false;
                        } else {
                            Tracer.d("HttpCoreReal: response successfully received");
                            z2 = true;
                        }
                        if (i == 200) {
                            Tracer.d("HttpCoreReal: processing server response");
                            rne rneVar = pneVarF.g;
                            if (rneVar != null) {
                                strI = rneVar.I();
                                try {
                                    if (TextUtils.isEmpty(strI)) {
                                        Tracer.d("HttpCoreReal: response data is empty");
                                    } else {
                                        z3 = z2;
                                        str3 = null;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    pneVar = pneVarF;
                                    try {
                                        str2 = "HttpCoreReal error: error while sending data";
                                        Tracer.d("HttpCoreReal error: error while sending data", th);
                                        if (pneVar != null) {
                                            str3 = "HttpCoreReal error: error while sending data";
                                            pneVarF = pneVar;
                                        }
                                        return new HttpResult(z3, strI, str2);
                                    } catch (Throwable th3) {
                                        if (pneVar != null) {
                                            pneVar.close();
                                        }
                                        throw th3;
                                    }
                                }
                                str4 = strI;
                                pneVarF.close();
                                str2 = str3;
                                strI = str4;
                                return new HttpResult(z3, strI, str2);
                            }
                        }
                        z3 = z2;
                        str3 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        strI = null;
                    }
                    pneVarF.close();
                    str2 = str3;
                    strI = str4;
                    return new HttpResult(z3, strI, str2);
                } catch (Throwable th5) {
                    th = th5;
                    gZIPOutputStream = null;
                }
            } catch (Throwable th6) {
                th = th6;
                byteArrayOutputStream = null;
                gZIPOutputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            strI = null;
        }
    }
}
