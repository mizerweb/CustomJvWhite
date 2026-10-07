package one.video.calls.sdk.net.signaling.wt.nal;

import defpackage.dek;
import defpackage.g2m;
import defpackage.ifh;
import defpackage.ku8;
import defpackage.ny8;
import defpackage.ore;
import defpackage.wre;
import defpackage.x5k;
import java.security.cert.X509Certificate;
import java.time.Duration;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportCompressorDecompressor;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/NAL;", "", "Lone/video/calls/sdk/net/signaling/wt/nal/NALHostnameVerifier;", "hostnameVerifier", "", "connectTimeout", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lone/video/calls/sdk/net/signaling/wt/nal/NALLog;", "log", "<init>", "(Lone/video/calls/sdk/net/signaling/wt/nal/NALHostnameVerifier;Ljava/lang/Long;Ljavax/net/ssl/X509TrustManager;Lone/video/calls/sdk/net/signaling/wt/nal/NALLog;)V", "", ApiProtocol.KEY_ENDPOINT, "hostname", "Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;", "listener", "Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket;", "createSocket", "(Ljava/lang/String;Ljava/lang/String;Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket$Listener;)Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket;", "Lone/video/calls/sdk/net/signaling/wt/nal/NALLog;", "Ltech/kwik/flupke/Http3Client;", "client$delegate", "Lny8;", "getClient", "()Ltech/kwik/flupke/Http3Client;", "client", "DelegatingHostnameVerifier", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NAL {

    /* JADX INFO: renamed from: client$delegate, reason: from kotlin metadata */
    private final ny8 client;
    private final NALLog log;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/NAL$DelegatingHostnameVerifier;", "Ltech/kwik/core/QuicClientConnection$HostnameVerifier;", "delegate", "Lone/video/calls/sdk/net/signaling/wt/nal/NALHostnameVerifier;", "<init>", "(Lone/video/calls/sdk/net/signaling/wt/nal/NALHostnameVerifier;)V", "verify", "", "hostname", "", "certificate", "Ljava/security/cert/X509Certificate;", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DelegatingHostnameVerifier implements x5k {
        private final NALHostnameVerifier delegate;

        public DelegatingHostnameVerifier(NALHostnameVerifier nALHostnameVerifier) {
            this.delegate = nALHostnameVerifier;
        }

        @Override // defpackage.x5k
        public final boolean verify(String hostname, X509Certificate certificate) {
            return this.delegate.verify(hostname, certificate);
        }
    }

    public NAL(NALHostnameVerifier nALHostnameVerifier, Long l, X509TrustManager x509TrustManager, NALLog nALLog) {
        this.log = nALLog;
        this.client = new ifh(new wre(nALHostnameVerifier, l, x509TrustManager, 24));
        int i = g2m.a;
        if (i == 0) {
            g2m.a = 2;
        } else {
            if (2 == i) {
                return;
            }
            ore.p("Once set, platform cannot be changed");
            throw null;
        }
    }

    public static final dek client_delegate$lambda$0(NALHostnameVerifier nALHostnameVerifier, Long l, X509TrustManager x509TrustManager) {
        boolean z;
        ku8 ku8Var = new ku8();
        if (x509TrustManager != null) {
            z = false;
        } else {
            x509TrustManager = null;
            z = true;
        }
        return new dek(Duration.ofMillis(l != null ? l.longValue() : 5000L), z, x509TrustManager, new DelegatingHostnameVerifier(nALHostnameVerifier), ku8Var);
    }

    private final dek getClient() {
        return (dek) this.client.getValue();
    }

    public final NALSocket createSocket(String str, String hostname, NALSocket.Listener listener) {
        return new WebTransportSocket(str, hostname, this.log, getClient(), new WebTransportCompressorDecompressor(this.log), listener);
    }
}
