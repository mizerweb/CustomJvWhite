package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class o28 extends sb8 {
    public final int l;
    public final ExecutorService m;
    public final RealtimeSinceBootClock n;

    public o28() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.m = Executors.newFixedThreadPool(3);
        this.n = realtimeSinceBootClock;
        this.l = 30000;
    }

    @Override // defpackage.sb8
    public final Map E(ep6 ep6Var, int i) {
        n28 n28Var = (n28) ep6Var;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(n28Var.e - n28Var.d));
        map.put("fetch_time", Long.toString(n28Var.f - n28Var.e));
        map.put("total_time", Long.toString(n28Var.f - n28Var.d));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // defpackage.sb8
    public final void V(ep6 ep6Var, int i) {
        ((n28) ep6Var).f = this.n.now();
    }

    @Override // defpackage.sb8
    public final ep6 m(lq0 lq0Var, es0 es0Var) {
        return new n28(lq0Var, es0Var);
    }

    @Override // defpackage.sb8
    public final void v(ep6 ep6Var, qg7 qg7Var) {
        n28 n28Var = (n28) ep6Var;
        n28Var.d = this.n.now();
        n28Var.b.a(new m28(this.m.submit(new b1j(3, this, n28Var, qg7Var, false)), 0, qg7Var));
    }

    public final HttpURLConnection w0(Uri uri, int i) throws IOException {
        URL url;
        String str;
        Uri uri2 = rki.a;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                qr7.o(e);
                return null;
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.l);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case 300:
                case 301:
                case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                case HttpStatus.SC_SEE_OTHER /* 303 */:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        Uri uri3 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i > 0 && uri3 != null && !qdl.b(uri3.getScheme(), scheme)) {
            return w0(uri3, i - 1);
        }
        if (i == 0) {
            String string = uri.toString();
            Locale.getDefault();
            str = "URL " + string + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        qr7.k(str);
        return null;
    }
}
