package defpackage;

import java.net.Socket;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.security.auth.x500.X500Principal;
import kotlin.collections.a;
import one.me.sdk.net.ssl.tm.ApiTrustManager$CertPathCertificateException;
import one.me.sdk.net.ssl.tm.ApiTrustManager$NotInHandshakeCertificateException;
import one.me.sdk.net.ssl.tm.ApiTrustManager$UnacceptableAuthTypeCertificateException;
import one.me.sdk.net.ssl.tm.ApiTrustManager$UnacceptableCertificatesException;
import one.me.sdk.net.ssl.tm.ApiTrustManager$UnacceptableHostnameCertificateException;
import one.me.sdk.net.ssl.tm.internal.HostnameVerifier$NoSubjectAltNamesCertificateException;

/* JADX INFO: loaded from: classes3.dex */
public final class eq extends X509ExtendedTrustManager {
    public final CertPathValidator e;
    public final phf h;
    public final Exception i;
    public final CertificateFactory j;
    public final X509Certificate[] k;
    public final p51 a = new p51(7);
    public final Set b = a.p1(new PKIXRevocationChecker.Option[]{PKIXRevocationChecker.Option.ONLY_END_ENTITY, PKIXRevocationChecker.Option.NO_FALLBACK});
    public final due c = new due(15);
    public final rj5 d = new rj5(8);
    public final mu1 f = new mu1(11);
    public final phf g = new phf((Set) null);

    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v3, types: [c76] */
    public eq(KeyStore keyStore) {
        X509Certificate[] x509CertificateArr;
        CertPathValidator certPathValidator;
        CertificateFactory certificateFactory;
        X509Certificate[] x509CertificateArr2;
        CertPathValidator certPathValidator2;
        CertificateFactory certificateFactory2;
        phf phfVar;
        ?? hashSet;
        Exception exc = null;
        try {
            certPathValidator2 = CertPathValidator.getInstance("PKIX");
            try {
                certificateFactory2 = CertificateFactory.getInstance("X509");
                try {
                    try {
                        Enumeration<String> enumerationAliases = keyStore.aliases();
                        ArrayList arrayList = null;
                        while (enumerationAliases.hasMoreElements()) {
                            Certificate certificate = keyStore.getCertificate(enumerationAliases.nextElement());
                            if (certificate instanceof X509Certificate) {
                                if (arrayList != null) {
                                    arrayList.add(certificate);
                                } else {
                                    arrayList = new ArrayList(1);
                                    arrayList.add(certificate);
                                }
                            }
                        }
                        x509CertificateArr2 = arrayList != null ? (X509Certificate[]) arrayList.toArray(new X509Certificate[0]) : null;
                    } catch (KeyStoreException unused) {
                    }
                    x509CertificateArr2 = x509CertificateArr2 == null ? new X509Certificate[0] : x509CertificateArr2;
                    try {
                        if (x509CertificateArr2.length == 0) {
                            hashSet = c76.a;
                        } else {
                            hashSet = new HashSet(x509CertificateArr2.length);
                            for (X509Certificate x509Certificate : x509CertificateArr2) {
                                hashSet.add(new TrustAnchor(x509Certificate, null));
                            }
                        }
                        phfVar = new phf((Set) hashSet);
                    } catch (Exception e) {
                        x509CertificateArr = x509CertificateArr2;
                        e = e;
                        certificateFactory = certificateFactory2;
                        certPathValidator = certPathValidator2;
                        exc = e;
                        x509CertificateArr2 = x509CertificateArr;
                        certPathValidator2 = certPathValidator;
                        certificateFactory2 = certificateFactory;
                        phfVar = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    certificateFactory = certificateFactory2;
                    certPathValidator = certPathValidator2;
                    x509CertificateArr = null;
                    exc = e;
                    x509CertificateArr2 = x509CertificateArr;
                    certPathValidator2 = certPathValidator;
                    certificateFactory2 = certificateFactory;
                    phfVar = null;
                    this.i = exc;
                    this.e = certPathValidator2;
                    this.j = certificateFactory2;
                    this.h = phfVar;
                    this.k = x509CertificateArr2 == null ? new X509Certificate[0] : x509CertificateArr2;
                }
            } catch (Exception e3) {
                e = e3;
                certificateFactory = null;
                certPathValidator = certPathValidator2;
                x509CertificateArr = null;
            }
        } catch (Exception e4) {
            e = e4;
            x509CertificateArr = null;
            certPathValidator = null;
            certificateFactory = null;
        }
        this.i = exc;
        this.e = certPathValidator2;
        this.j = certificateFactory2;
        this.h = phfVar;
        this.k = x509CertificateArr2 == null ? new X509Certificate[0] : x509CertificateArr2;
    }

    public final List a(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession, SSLParameters sSLParameters, boolean z) throws HostnameVerifier$NoSubjectAltNamesCertificateException {
        boolean zF;
        String peerHost = sSLSession != null ? sSLSession.getPeerHost() : null;
        if (sSLSession != null && sSLParameters != null && "HTTPS".equalsIgnoreCase(sSLParameters.getEndpointIdentificationAlgorithm())) {
            due dueVar = this.c;
            dueVar.getClass();
            boolean zF2 = false;
            if (x509CertificateArr == null || x509CertificateArr.length == 0) {
                try {
                    zF2 = dueVar.F(peerHost, (X509Certificate) sSLSession.getPeerCertificates()[0]);
                } catch (SSLException unused) {
                }
                zF = zF2;
            } else {
                zF = dueVar.F(peerHost, x509CertificateArr[0]);
            }
            if (!zF) {
                throw new HostnameVerifier$NoSubjectAltNamesCertificateException(peerHost);
            }
        }
        return b(x509CertificateArr, null, str, z);
    }

    public final List b(X509Certificate[] x509CertificateArr, byte[] bArr, String str, boolean z) throws CertificateException {
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new ApiTrustManager$UnacceptableCertificatesException();
        }
        if (str == null || str.length() == 0) {
            throw new ApiTrustManager$UnacceptableAuthTypeCertificateException("Unacceptable authtype specified", new IllegalArgumentException(qv1.k("Authtype is illegal: ", str)));
        }
        Exception exc = this.i;
        if (exc != null) {
            throw new CertificateException("Unacceptable state", exc);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        X509Certificate x509Certificate = x509CertificateArr[0];
        TrustAnchor trustAnchor = null;
        phf phfVar = this.h;
        if (phfVar != null) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) phfVar.b).readLock();
            lock.lock();
            try {
                ArrayList arrayList3 = (ArrayList) ((HashMap) phfVar.c).get(subjectX500Principal);
                if (arrayList3 != null) {
                    PublicKey publicKey = x509Certificate.getPublicKey();
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        TrustAnchor trustAnchor2 = (TrustAnchor) arrayList3.get(i);
                        try {
                            X509Certificate trustedCert = trustAnchor2.getTrustedCert();
                            PublicKey publicKey2 = trustedCert != null ? trustedCert.getPublicKey() : trustAnchor2.getCAPublicKey();
                            if (!publicKey2.equals(publicKey)) {
                                if ("X509".equals(publicKey2.getFormat()) && "X509".equals(publicKey.getFormat())) {
                                    byte[] encoded = publicKey.getEncoded();
                                    byte[] encoded2 = publicKey2.getEncoded();
                                    if (encoded == null || encoded2 == null || !Arrays.equals(encoded, encoded2)) {
                                    }
                                }
                            }
                            trustAnchor = trustAnchor2;
                            break;
                        } catch (Exception unused) {
                        }
                    }
                }
                lock.unlock();
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
        if (trustAnchor != null) {
            arrayList2.add(trustAnchor);
            hashSet.add(trustAnchor.getTrustedCert());
        } else {
            arrayList.add(x509Certificate);
        }
        hashSet.add(x509Certificate);
        return c(x509CertificateArr, bArr, z, arrayList, arrayList2, hashSet);
    }

    public final List c(X509Certificate[] x509CertificateArr, byte[] bArr, boolean z, ArrayList arrayList, ArrayList arrayList2, HashSet hashSet) throws CertificateException {
        List list;
        X509Certificate[] x509CertificateArr2 = x509CertificateArr;
        X509Certificate trustedCert = arrayList2.isEmpty() ? (X509Certificate) ww3.B1(arrayList) : ((TrustAnchor) ww3.B1(arrayList2)).getTrustedCert();
        if (trustedCert.getIssuerDN().equals(trustedCert.getSubjectDN())) {
            return e(arrayList, arrayList2, z, bArr);
        }
        phf phfVar = this.h;
        Set setN = phfVar != null ? phfVar.n(trustedCert) : c76.a;
        int size = setN.size();
        mu1 mu1Var = this.f;
        Collection<TrustAnchor> collection = setN;
        if (size > 1) {
            ArrayList arrayList3 = new ArrayList(setN);
            bx3.Y0(arrayList3, mu1Var);
            collection = arrayList3;
        }
        List list2 = null;
        CertificateException certificateException = null;
        boolean z2 = false;
        for (TrustAnchor trustAnchor : collection) {
            X509Certificate trustedCert2 = trustAnchor.getTrustedCert();
            if (!hashSet.contains(trustedCert2)) {
                hashSet.add(trustedCert2);
                arrayList2.add(trustAnchor);
                try {
                    return c(x509CertificateArr, bArr, z, arrayList, arrayList2, hashSet);
                } catch (CertificateException e) {
                    certificateException = e;
                    arrayList2.remove(xw3.O0(arrayList2));
                    hashSet.remove(trustedCert2);
                    z2 = true;
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            if (!z2) {
                return e(arrayList, arrayList2, z, bArr);
            }
            if (certificateException != null) {
                throw certificateException;
            }
            ore.p("Required value was null.");
            return null;
        }
        int length = x509CertificateArr2.length;
        CertificateException e2 = certificateException;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = x509CertificateArr2[i];
            if (hashSet.contains(x509Certificate)) {
                list = list2;
            } else {
                list = list2;
                if (trustedCert.getIssuerDN().equals(x509Certificate.getSubjectDN())) {
                    try {
                        x509Certificate.checkValidity();
                        this.d.N(x509Certificate);
                        hashSet.add(x509Certificate);
                        arrayList.add(x509Certificate);
                        try {
                            return c(x509CertificateArr, bArr, z, arrayList, arrayList2, hashSet);
                        } catch (CertificateException e3) {
                            e2 = e3;
                            hashSet.remove(x509Certificate);
                            arrayList.remove(xw3.O0(arrayList));
                        }
                    } catch (CertificateException e4) {
                        e2 = new CertificateException("Unacceptable certificate: " + x509Certificate.getSubjectX500Principal(), e4);
                    }
                } else {
                    continue;
                }
            }
            i++;
            x509CertificateArr2 = x509CertificateArr;
            list2 = list;
        }
        List list3 = list2;
        Set setN2 = this.g.n(trustedCert);
        int size2 = setN2.size();
        Collection collection2 = setN2;
        if (size2 > 1) {
            ArrayList arrayList4 = new ArrayList(setN2);
            bx3.Y0(arrayList4, mu1Var);
            collection2 = arrayList4;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            X509Certificate trustedCert3 = ((TrustAnchor) it.next()).getTrustedCert();
            if (!hashSet.contains(trustedCert3)) {
                hashSet.add(trustedCert3);
                arrayList.add(trustedCert3);
                try {
                    return c(x509CertificateArr, bArr, z, arrayList, arrayList2, hashSet);
                } catch (CertificateException e5) {
                    e2 = e5;
                    arrayList.remove(xw3.O0(arrayList));
                    hashSet.remove(trustedCert3);
                }
            }
        }
        if (e2 != null) {
            throw e2;
        }
        CertificateFactory certificateFactory = this.j;
        if (certificateFactory != null) {
            throw new ApiTrustManager$CertPathCertificateException(certificateFactory.generateCertPath(arrayList));
        }
        ore.p("Required value was null.");
        return list3;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws ApiTrustManager$NotInHandshakeCertificateException, HostnameVerifier$NoSubjectAltNamesCertificateException {
        SSLSession sSLSession;
        SSLParameters sSLParameters;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSession = sSLSocket.getHandshakeSession();
            if (handshakeSession == null) {
                throw new ApiTrustManager$NotInHandshakeCertificateException();
            }
            sSLParameters = sSLSocket.getSSLParameters();
            sSLSession = handshakeSession;
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        a(x509CertificateArr, str, sSLSession, sSLParameters, true);
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        if (str2 == null || str2.length() == 0) {
            throw new ApiTrustManager$UnacceptableHostnameCertificateException(str2);
        }
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new ApiTrustManager$UnacceptableCertificatesException();
        }
        if (this.c.F(str2, x509CertificateArr[0])) {
            return b(x509CertificateArr, null, str, false);
        }
        throw new HostnameVerifier$NoSubjectAltNamesCertificateException(str2);
    }

    public final void d(PKIXParameters pKIXParameters, X509Certificate x509Certificate, byte[] bArr) {
        PKIXRevocationChecker pKIXRevocationChecker;
        PKIXRevocationChecker pKIXRevocationChecker2;
        PKIXRevocationChecker pKIXRevocationChecker3;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(pKIXParameters.getCertPathCheckers());
            int size = arrayList.size();
            int i = 0;
            while (true) {
                pKIXRevocationChecker = null;
                if (i >= size) {
                    pKIXRevocationChecker2 = null;
                    break;
                }
                PKIXCertPathChecker pKIXCertPathChecker = (PKIXCertPathChecker) arrayList.get(i);
                if (pKIXCertPathChecker instanceof PKIXRevocationChecker) {
                    pKIXRevocationChecker2 = (PKIXRevocationChecker) pKIXCertPathChecker;
                    break;
                }
                i++;
            }
            if (pKIXRevocationChecker2 == null) {
                try {
                    CertPathValidator certPathValidator = this.e;
                    if (certPathValidator == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    pKIXRevocationChecker3 = (PKIXRevocationChecker) certPathValidator.getRevocationChecker();
                    if (pKIXRevocationChecker3 != null) {
                        arrayList.add(pKIXRevocationChecker3);
                        pKIXRevocationChecker3.setOptions(this.b);
                        pKIXRevocationChecker = pKIXRevocationChecker3;
                    }
                    pKIXRevocationChecker2 = pKIXRevocationChecker;
                } catch (ClassCastException | UnsupportedOperationException unused) {
                    pKIXRevocationChecker3 = null;
                }
            }
            if (pKIXRevocationChecker2 != null) {
                pKIXRevocationChecker2.setOcspResponses(Collections.singletonMap(x509Certificate, bArr));
                pKIXParameters.setCertPathCheckers(arrayList);
            }
        }
    }

    public final ArrayList e(ArrayList arrayList, ArrayList arrayList2, boolean z, byte[] bArr) throws CertificateException {
        CertificateFactory certificateFactory = this.j;
        if (certificateFactory == null) {
            ore.p("Required value was null.");
            return null;
        }
        CertPath certPathGenerateCertPath = certificateFactory.generateCertPath(arrayList);
        if (arrayList2.isEmpty()) {
            throw new ApiTrustManager$CertPathCertificateException(certPathGenerateCertPath);
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList3.add(((TrustAnchor) arrayList2.get(i)).getTrustedCert());
        }
        this.a.getClass();
        if (arrayList.isEmpty()) {
            return arrayList3;
        }
        rj5 rj5Var = this.d;
        rj5Var.getClass();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(i2);
            try {
                rj5Var.N(x509Certificate);
            } catch (CertificateException e) {
                throw new CertificateException("Unacceptable certificate: " + x509Certificate.getSubjectX500Principal(), e);
            }
        }
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(arrayList2.get(0));
            PKIXParameters pKIXParameters = new PKIXParameters(hashSet);
            pKIXParameters.setRevocationEnabled(false);
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(0);
            d(pKIXParameters, x509Certificate2, bArr);
            pKIXParameters.addCertPathChecker(new to2(z, x509Certificate2));
            CertPathValidator certPathValidator = this.e;
            if (certPathValidator == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            certPathValidator.validate(certPathGenerateCertPath, pKIXParameters);
            phf phfVar = this.g;
            ReentrantReadWriteLock.WriteLock writeLock = ((ReentrantReadWriteLock) phfVar.b).writeLock();
            writeLock.lock();
            try {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    phfVar.g(new TrustAnchor((X509Certificate) arrayList.get(i3), null));
                }
                writeLock.unlock();
                return arrayList3;
            } catch (Throwable th) {
                writeLock.unlock();
                throw th;
            }
        } catch (InvalidAlgorithmParameterException e2) {
            throw new CertificateException(e2) { // from class: one.me.sdk.net.ssl.tm.ApiTrustManager$InvalidChainCertificateException
            };
        } catch (CertPathValidatorException e3) {
            throw new CertificateException(e3) { // from class: one.me.sdk.net.ssl.tm.ApiTrustManager$InvalidChainCertificateException
            };
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.k;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws ApiTrustManager$NotInHandshakeCertificateException, HostnameVerifier$NoSubjectAltNamesCertificateException {
        SSLSession handshakeSession = sSLEngine.getHandshakeSession();
        if (handshakeSession != null) {
            a(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), true);
            return;
        }
        throw new ApiTrustManager$NotInHandshakeCertificateException();
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        b(x509CertificateArr, null, str, true);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws ApiTrustManager$NotInHandshakeCertificateException, HostnameVerifier$NoSubjectAltNamesCertificateException {
        SSLSession handshakeSession;
        if (sSLEngine != null && (handshakeSession = sSLEngine.getHandshakeSession()) != null) {
            a(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), false);
            return;
        }
        throw new ApiTrustManager$NotInHandshakeCertificateException();
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws ApiTrustManager$NotInHandshakeCertificateException, HostnameVerifier$NoSubjectAltNamesCertificateException {
        SSLSession sSLSession;
        SSLParameters sSLParameters;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSession = sSLSocket.getHandshakeSession();
            if (handshakeSession != null) {
                sSLParameters = sSLSocket.getSSLParameters();
                sSLSession = handshakeSession;
            } else {
                throw new ApiTrustManager$NotInHandshakeCertificateException();
            }
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        a(x509CertificateArr, str, sSLSession, sSLParameters, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        b(x509CertificateArr, null, str, false);
    }
}
