package defpackage;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class dek {
    public final Duration a;
    public final boolean b;
    public final X509TrustManager d;
    public final x5k e;
    public final ku8 f;
    public final phf g = new phf(this);
    public final ku8 c = new ku8();
    public final ExecutorService h = Executors.newCachedThreadPool(new aid("http3", 1));

    public dek(Duration duration, boolean z, X509TrustManager x509TrustManager, x5k x5kVar, ku8 ku8Var) {
        this.a = duration;
        this.b = z;
        this.d = x509TrustManager;
        this.e = x5kVar;
        this.f = ku8Var;
    }
}
