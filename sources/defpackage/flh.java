package defpackage;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class flh implements Closeable {
    public final /* synthetic */ int a;
    public final HttpURLConnection b;

    public /* synthetic */ flh(HttpURLConnection httpURLConnection, int i) {
        this.a = i;
        this.b = httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        HttpURLConnection httpURLConnection = this.b;
        switch (i) {
            case 0:
                httpURLConnection.disconnect();
                break;
            default:
                ((HttpsURLConnection) httpURLConnection).disconnect();
                break;
        }
    }

    public final BufferedInputStream l() {
        int i = this.a;
        HttpURLConnection httpURLConnection = this.b;
        switch (i) {
            case 0:
                return new BufferedInputStream(httpURLConnection.getInputStream());
            default:
                return new BufferedInputStream(((HttpsURLConnection) httpURLConnection).getInputStream());
        }
    }
}
