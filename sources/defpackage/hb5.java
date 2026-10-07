package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public final class hb5 extends pq0 {
    public final int e;
    public final int f;
    public final String g;
    public final qg7 h;
    public final qg7 i;
    public a35 j;
    public HttpURLConnection k;
    public InputStream l;
    public boolean m;
    public int n;
    public long o;
    public long p;

    public hb5(String str, int i, int i2, qg7 qg7Var) {
        super(true);
        this.g = str;
        this.e = i;
        this.f = i2;
        this.h = qg7Var;
        this.i = new qg7(3);
    }

    @Override // defpackage.u25
    public final void close() {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = vqi.a;
                    throw new HttpDataSource$HttpDataSourceException(2000, 3, e);
                }
            }
            this.l = null;
            e();
            if (this.m) {
                this.m = false;
                b();
            }
            this.k = null;
            this.j = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.l = null;
            e();
            if (this.m) {
                this.m = false;
                b();
            }
            this.k = null;
            this.j = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    public final void e() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                lvb.l0("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrB;
        long jMax;
        String str;
        this.j = a35Var;
        this.p = 0L;
        this.o = 0L;
        c(a35Var);
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            HttpURLConnection httpURLConnectionG = g(new URL(a35Var.a.toString()), a35Var.c, a35Var.d, a35Var.f, a35Var.g, a35Var.c(1), true, a35Var.e);
            long j = a35Var.g;
            long j2 = a35Var.f;
            this.k = httpURLConnectionG;
            this.n = httpURLConnectionG.getResponseCode();
            String responseMessage = httpURLConnectionG.getResponseMessage();
            int i = this.n;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionG.getHeaderFields();
                if (this.n == 416 && j2 == p28.b(httpURLConnectionG.getHeaderField("Content-Range"))) {
                    this.m = true;
                    d(a35Var);
                    if (j != -1) {
                        return j;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionG.getErrorStream();
                try {
                    bArrB = errorStream != null ? z61.b(errorStream) : vqi.b;
                } catch (IOException unused) {
                    bArrB = vqi.b;
                }
                byte[] bArr = bArrB;
                e();
                throw new HttpDataSource$InvalidResponseCodeException(this.n, responseMessage, this.n == 416 ? new DataSourceException(2008) : null, headerFields, bArr);
            }
            httpURLConnectionG.getContentType();
            if (this.n != 200 || j2 == 0) {
                j2 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionG.getHeaderField(HTTP.CONTENT_ENCODING));
            if (zEqualsIgnoreCase || j != -1) {
                this.o = j;
            } else {
                String headerField = httpURLConnectionG.getHeaderField(HTTP.CONTENT_LEN);
                String headerField2 = httpURLConnectionG.getHeaderField("Content-Range");
                Pattern pattern = p28.a;
                if (TextUtils.isEmpty(headerField)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField);
                    } catch (NumberFormatException unused2) {
                        lvb.k0("HttpUtil", "Unexpected Content-Length [" + headerField + "]");
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField2)) {
                    Matcher matcher = p28.a.matcher(headerField2);
                    if (matcher.matches()) {
                        try {
                            String strGroup = matcher.group(2);
                            strGroup.getClass();
                            long j3 = Long.parseLong(strGroup);
                            String strGroup2 = matcher.group(1);
                            strGroup2.getClass();
                            str = "]";
                            long j4 = (j3 - Long.parseLong(strGroup2)) + 1;
                            if (jMax < 0) {
                                jMax = j4;
                            } else if (jMax != j4) {
                                try {
                                    lvb.G0("HttpUtil", "Inconsistent headers [" + headerField + "] [" + headerField2 + str);
                                    jMax = Math.max(jMax, j4);
                                } catch (NumberFormatException unused3) {
                                    lvb.k0("HttpUtil", "Unexpected Content-Range [" + headerField2 + str);
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            str = "]";
                        }
                    }
                }
                this.o = jMax != -1 ? jMax - j2 : -1L;
            }
            try {
                this.l = httpURLConnectionG.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.l = new GZIPInputStream(this.l);
                }
                this.m = true;
                d(a35Var);
                try {
                    h(j2);
                    return this.o;
                } catch (IOException e) {
                    e();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(2000, 1, e);
                }
            } catch (IOException e2) {
                e();
                throw new HttpDataSource$HttpDataSourceException(2000, 1, e2);
            }
        } catch (IOException e3) {
            e();
            throw HttpDataSource$HttpDataSourceException.a(1, e3);
        }
    }

    public final HttpURLConnection g(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap map2 = new HashMap();
        qg7 qg7Var = this.h;
        if (qg7Var != null) {
            map2.putAll(qg7Var.l());
        }
        map2.putAll(this.i.l());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = p28.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        String str = this.g;
        if (str != null) {
            httpURLConnection.setRequestProperty(HTTP.USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : HTTP.IDENTITY_CODING);
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(a35.b(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        a35 a35Var = this.j;
        if (a35Var != null) {
            return a35Var.a;
        }
        return null;
    }

    public final void h(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[np0.r];
        while (j > 0) {
            int iMin = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            InputStream inputStream = this.l;
            String str = vqi.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(2000, 1, new InterruptedIOException());
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException(2008);
            }
            j -= (long) i;
            a(i);
        }
    }

    @Override // defpackage.u25
    public final Map p() {
        HttpURLConnection httpURLConnection = this.k;
        return httpURLConnection == null ? lhe.g : new gb5(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.o;
            if (j != -1) {
                long j2 = j - this.p;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.l;
                    String str = vqi.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.p += (long) i3;
                        a(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.l;
                String str2 = vqi.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.p += (long) i3;
                    a(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = vqi.a;
            throw HttpDataSource$HttpDataSourceException.a(2, e);
        }
    }
}
