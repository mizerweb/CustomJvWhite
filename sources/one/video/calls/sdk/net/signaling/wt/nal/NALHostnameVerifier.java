package one.video.calls.sdk.net.signaling.wt.nal;

import java.security.cert.X509Certificate;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lone/video/calls/sdk/net/signaling/wt/nal/NALHostnameVerifier;", "", "verify", "", "hostname", "", "certificate", "Ljava/security/cert/X509Certificate;", "nal"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface NALHostnameVerifier {
    boolean verify(String hostname, X509Certificate certificate);
}
