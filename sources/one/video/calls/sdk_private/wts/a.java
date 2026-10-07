package one.video.calls.sdk_private.wts;

import defpackage.e5g;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.List;
import one.video.calls.sdk.net.signaling.WTSignaling;
import one.video.calls.sdk.net.signaling.wt.nal.NALHostnameVerifier;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements NALHostnameVerifier {
    public final /* synthetic */ WTSignaling a;

    public a(WTSignaling wTSignaling) {
        this.a = wTSignaling;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALHostnameVerifier
    public final boolean verify(String str, X509Certificate x509Certificate) {
        e5g e5gVar = (e5g) this.a.getHostnameVerifier();
        e5gVar.getClass();
        if (str == null || x509Certificate == null) {
            return false;
        }
        String str2 = (String) e5gVar.a.invoke();
        List list = (List) e5gVar.b.invoke();
        try {
            if (str2 == null || (!str.equals(str2) && (list == null || !list.contains(str)))) {
                if (!e5g.c(str, x509Certificate.getSubjectAlternativeNames()) && !e5g.b(str, x509Certificate.getSubjectDN())) {
                    return false;
                }
            } else if (!e5g.c(str2, x509Certificate.getSubjectAlternativeNames()) && !e5g.b(str2, x509Certificate.getSubjectDN())) {
                return false;
            }
            return true;
        } catch (CertificateParsingException unused) {
            return false;
        }
    }
}
