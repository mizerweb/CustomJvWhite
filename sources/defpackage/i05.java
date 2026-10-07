package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import one.video.calls.sdk_private.h;
import one.video.calls.sdk_private.i;
import one.video.calls.sdk_private.k;
import one.video.calls.sdk_private.n;
import one.video.calls.sdk_private.q;

/* JADX INFO: loaded from: classes3.dex */
public final class i05 extends cr0 {
    public static final List A;
    public static final Charset B;
    public final oki e;
    public final z7k f;
    public String g;
    public final ArrayList h;
    public kfk i;
    public hfk j;
    public final ArrayList k;
    public ArrayList l;
    public int m;
    public o5k n;
    public kr6 o;
    public List p;
    public X509Certificate q;
    public List r;
    public X509TrustManager s;
    public zjk t;
    public final ArrayList u;
    public boolean v;
    public boolean w;
    public List x;
    public final Function y;
    public List z;

    static {
        Object[] objArr = {mfk.rsa_pss_rsae_sha256, mfk.rsa_pss_rsae_sha384, mfk.rsa_pss_rsae_sha512, mfk.ecdsa_secp256r1_sha256, mfk.ecdsa_secp384r1_sha384, mfk.ecdsa_secp521r1_sha512};
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        A = Collections.unmodifiableList(arrayList);
        B = Charset.forName("ISO-8859-1");
    }

    public i05(oki okiVar, z7k z7kVar) {
        int i = 28;
        this.d = g2m.a == 2 ? new ldf(i) : new dul(i);
        this.m = 1;
        this.r = Collections.EMPTY_LIST;
        this.v = false;
        this.e = okiVar;
        this.f = z7kVar;
        this.h = new ArrayList();
        this.k = new ArrayList();
        this.t = new px8();
        this.u = new ArrayList();
        this.y = new f05(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(l1k l1kVar, int i) {
        w4k w4kVar;
        if (i != 2) {
            throw new q("incorrect protection level");
        }
        if (this.m != 7) {
            throw new q("unexpected finished message");
        }
        this.o.y(l1kVar);
        kr6 kr6Var = this.o;
        jfk jfkVar = jfk.certificate_verify;
        kr6Var.getClass();
        if (!Arrays.equals(l1kVar.b, c(kr6Var.r(kr6.f(jfkVar, false)), ((oj6) this.c).m))) {
            throw new k("incorrect finished message");
        }
        if (this.w) {
            f1k f1kVar = new f1k();
            f1kVar.c = new ArrayList();
            f1kVar.a = new byte[0];
            f1kVar.b = null;
            f1kVar.c = Collections.EMPTY_LIST;
            int size = f1kVar.c.size();
            List list = (List) f1kVar.c.stream().map(new f05(13, f1kVar)).collect(Collectors.toList());
            int iSum = list.stream().mapToInt(new ao8(5)).sum() + (size * 5) + 8;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iSum);
            byteBufferAllocate.putInt((jfk.certificate.a << 24) | (iSum - 4));
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.put((byte) 0);
            byteBufferAllocate.putShort((short) (iSum - 8));
            list.forEach(new bo8(byteBufferAllocate, 2));
            f1kVar.d = byteBufferAllocate.array();
            d5k d5kVarA = ((z7k) this.e.a).a(w4k.c);
            d5kVarA.c(f1kVar);
            d5kVarA.a(d5kVarA.h);
            this.o.x(f1kVar);
        }
        kr6 kr6Var2 = this.o;
        kr6Var2.getClass();
        byte[] bArrC = c(kr6Var2.r(kr6.f(jfkVar, true)), ((oj6) this.c).n);
        l1k l1kVar2 = new l1k(2);
        l1kVar2.b = bArrC;
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrC.length + 4);
        jfk jfkVar2 = jfk.finished;
        byteBufferAllocate2.putInt((jfkVar2.a << 24) | l1kVar2.b.length);
        byteBufferAllocate2.put(l1kVar2.b);
        l1kVar2.c = byteBufferAllocate2.array();
        d5k d5kVarA2 = ((z7k) this.e.a).a(w4k.c);
        d5kVarA2.c(l1kVar2);
        d5kVarA2.a(d5kVarA2.h);
        this.o.x(l1kVar2);
        oj6 oj6Var = (oj6) this.c;
        byte[] bArr = oj6Var.o;
        kr6 kr6Var3 = oj6Var.r;
        kr6Var3.getClass();
        byte[] bArrR = kr6Var3.r(kr6.f(jfkVar2, false));
        byte[] bArr2 = oj6Var.c;
        int i2 = oj6Var.e;
        byte[] bArrA = oj6Var.a(bArr, "derived", bArr2, i2);
        t5k.a(bArrA);
        byte[] bArrC2 = oj6Var.b.c(bArrA, new byte[i2]);
        oj6Var.t = bArrC2;
        t5k.a(bArrC2);
        byte[] bArrA2 = oj6Var.a(oj6Var.t, "c ap traffic", bArrR, i2);
        oj6Var.p = bArrA2;
        t5k.a(bArrA2);
        byte[] bArrA3 = oj6Var.a(oj6Var.t, "s ap traffic", bArrR, i2);
        oj6Var.q = bArrA3;
        t5k.a(bArrA3);
        byte[] bArr3 = oj6Var.p;
        short s = oj6Var.d;
        Charset charset = oj6.u;
        t5k.a(oj6Var.a(bArr3, "key", "".getBytes(charset), s));
        t5k.a(oj6Var.a(oj6Var.q, "key", "".getBytes(charset), s));
        t5k.a(oj6Var.a(oj6Var.p, "iv", "".getBytes(charset), (short) 12));
        t5k.a(oj6Var.a(oj6Var.q, "iv", "".getBytes(charset), (short) 12));
        oj6 oj6Var2 = (oj6) this.c;
        kr6 kr6Var4 = oj6Var2.r;
        kr6Var4.getClass();
        byte[] bArrA4 = oj6Var2.a(oj6Var2.t, "res master", kr6Var4.r(kr6.f(jfkVar2, true)), oj6Var2.e);
        oj6Var2.l = bArrA4;
        t5k.a(bArrA4);
        this.m = 8;
        z7k z7kVar = this.f;
        b5k b5kVar = z7kVar.e;
        i05 i05Var = z7kVar.y;
        synchronized (b5kVar) {
            w4kVar = w4k.d;
            b5kVar.b(w4kVar, b5kVar.a, b5kVar.b.a);
            oj6 oj6Var3 = (oj6) i05Var.c;
            if (oj6Var3 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            b5kVar.f[3].b(oj6Var3.p);
            oj6 oj6Var4 = (oj6) i05Var.c;
            if (oj6Var4 == null) {
                throw new IllegalStateException("Traffic secret not yet available");
            }
            b5kVar.g[3].b(oj6Var4.q);
            if (b5kVar.h) {
                b5kVar.c("TRAFFIC_SECRET_0", w4kVar);
            }
        }
        z7kVar.i = w4kVar;
        synchronized (z7kVar.g) {
            try {
                if (qt4.D(z7kVar.f) < qt4.D(3)) {
                    z7kVar.f = 3;
                    z7kVar.h.forEach(new w7k(z7kVar, 2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z7kVar.p = 3;
        z7kVar.L.countDown();
    }

    public final void i(m5k m5kVar, int i) {
        boolean zVerify;
        if (i != 2) {
            throw new q("incorrect protection level");
        }
        if (this.m != 6) {
            throw new q("unexpected certificate verify message");
        }
        mfk mfkVar = m5kVar.a;
        if (mfkVar == null || !this.p.contains(mfkVar)) {
            throw new n("signature scheme does not match");
        }
        byte[] bArr = m5kVar.b;
        X509Certificate x509Certificate = this.q;
        kr6 kr6Var = this.o;
        jfk jfkVar = jfk.certificate;
        kr6Var.getClass();
        byte[] bArrR = kr6Var.r(kr6.f(jfkVar, false));
        Charset charset = B;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate("TLS 1.3, server CertificateVerify".getBytes(charset).length + 65 + bArrR.length);
        for (int i2 = 0; i2 < 64; i2++) {
            byteBufferAllocate.put((byte) 32);
        }
        byteBufferAllocate.put("TLS 1.3, server CertificateVerify".getBytes(charset));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put(bArrR);
        try {
            Signature signatureB = b(mfkVar);
            signatureB.initVerify(x509Certificate);
            signatureB.update(byteBufferAllocate.array());
            zVerify = signatureB.verify(bArr);
        } catch (InvalidKeyException | SignatureException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new k("signature verification fails");
        }
        List list = this.r;
        try {
            X509TrustManager x509TrustManager = this.s;
            if (x509TrustManager != null) {
                x509TrustManager.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA");
            } else {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX");
                trustManagerFactory.init((KeyStore) null);
                ((X509TrustManager) trustManagerFactory.getTrustManagers()[0]).checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "UNKNOWN");
            }
            if (!this.t.verify(this.g, this.q)) {
                throw new i("servername does not match", gfk.certificate_unknown);
            }
            this.o.y(m5kVar);
            this.m = 7;
        } catch (KeyStoreException unused2) {
            ore.q("keystore exception");
        } catch (NoSuchAlgorithmException unused3) {
            ore.q("unsupported trust manager algorithm");
        } catch (CertificateException e) {
            Throwable cause = e.getCause();
            throw new h((String) (cause instanceof CertPathValidatorException ? Optional.of(cause.getMessage() + ": " + ((CertPathValidatorException) cause).getReason()) : cause instanceof CertPathBuilderException ? Optional.of(cause.getMessage()) : Optional.empty()).orElse("certificate validation failed"));
        }
    }

    public final void j(kfk kfkVar, List list) {
        KeyPairGenerator keyPairGenerator;
        if (this.m != 1) {
            ore.k("Handshake already started");
            return;
        }
        if (!zkc.d.contains(kfkVar)) {
            qr7.i(kfkVar, " not supported", "Named group ");
            return;
        }
        if (list.stream().anyMatch(new e05(7))) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.removeAll(A);
            qr7.y(arrayList, "Unsupported signature scheme(s): ");
            return;
        }
        this.p = list;
        this.i = kfkVar;
        try {
            if (kfkVar == kfk.secp256r1 || kfkVar == kfk.secp384r1 || kfkVar == kfk.secp521r1) {
                keyPairGenerator = KeyPairGenerator.getInstance("EC");
                keyPairGenerator.initialize(new ECGenParameterSpec(kfkVar.toString()));
            } else {
                if (kfkVar != kfk.x25519 && kfkVar != kfk.x448) {
                    throw new RuntimeException("unsupported group " + kfkVar);
                }
                keyPairGenerator = KeyPairGenerator.getInstance("XDH");
                jx5.t();
                keyPairGenerator.initialize(jx5.q(kfkVar.toString().toUpperCase()));
            }
            KeyPair keyPairGenKeyPair = keyPairGenerator.genKeyPair();
            this.b = keyPairGenKeyPair.getPrivate();
            this.a = keyPairGenKeyPair.getPublic();
            if (this.g == null || this.h.isEmpty()) {
                ore.k("not all mandatory properties are set");
                return;
            }
            o5k o5kVar = new o5k(this.g, (PublicKey) this.a, this.h, this.p, kfkVar, this.k, (oj6) this.c);
            this.n = o5kVar;
            this.l = o5kVar.d;
            if (((oj6) this.c) != null) {
                this.o.p(o5kVar);
                oj6 oj6Var = (oj6) this.c;
                kr6 kr6Var = oj6Var.r;
                jfk jfkVar = jfk.client_hello;
                kr6Var.getClass();
                oj6Var.a(oj6Var.j, "c e traffic", kr6Var.r(kr6.B(jfkVar)), oj6Var.e);
                this.f.getClass();
            }
            oki okiVar = this.e;
            o5k o5kVar2 = this.n;
            d5k d5kVarA = ((z7k) okiVar.a).a(w4k.a);
            d5kVarA.c(o5kVar2);
            ((z7k) okiVar.a).p = 2;
            ((z7k) okiVar.a).e.e = o5kVar2.b;
            d5kVarA.a(d5kVarA.h);
            ((z7k) okiVar.a).U = o5kVar2;
            this.m = 2;
        } catch (InvalidAlgorithmParameterException unused) {
            hs4.b();
        } catch (NoSuchAlgorithmException unused2) {
            ore.q("missing key pair generator algorithm EC");
        }
    }
}
