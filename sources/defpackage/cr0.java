package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cr0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d = getClass().getName();

    public cr0(ny8 ny8Var, ny8 ny8Var2, ed6 ed6Var) {
        this.a = ed6Var;
        this.b = ny8Var2;
        this.c = ny8Var;
    }

    public static int a(hfk hfkVar) {
        int i = sx5.a[hfkVar.ordinal()];
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 48;
        }
        if (i == 3 || i == 4 || i == 5) {
            return 32;
        }
        hs4.b();
        return 0;
    }

    public static void d() {
        throw new RuntimeException(System.getProperty("java.vendor") != null && System.getProperty("java.vendor").contains("Android") ? "Missing RSASSA-PSS support. Did you set PlatformMapping.usePlatformMapping(PlatformMapping.Platform.Android)?" : "Missing RSASSA-PSS support");
    }

    public static o67 e(r17 r17Var, String str, m8b m8bVar, LinkedHashSet linkedHashSet, Set set) {
        String str2 = r17Var.a;
        if (str == null) {
            str = r17Var.b.toString();
        }
        String str3 = str;
        if (linkedHashSet == null) {
            linkedHashSet = r17Var.j;
        }
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if (m8bVar == null) {
            m8bVar = rx8.j0(r17Var.e);
        }
        m8b m8bVar2 = m8bVar;
        if (set == null) {
            set = r17Var.d;
        }
        return new o67(str2, str3, m8bVar2, linkedHashSet2, set, r17Var.i, 4);
    }

    public static /* synthetic */ o67 f(cr0 cr0Var, r17 r17Var, m8b m8bVar, LinkedHashSet linkedHashSet, int i) {
        if ((i & 2) != 0) {
            m8bVar = null;
        }
        if ((i & 4) != 0) {
            linkedHashSet = null;
        }
        cr0Var.getClass();
        return e(r17Var, null, m8bVar, linkedHashSet, null);
    }

    public Signature b(mfk mfkVar) throws m {
        cs7 cs7Var = (cs7) this.d;
        if (mfkVar.equals(mfk.rsa_pss_rsae_sha256)) {
            try {
                Signature signature = Signature.getInstance(cs7Var.c(np0.n));
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), 32, 1));
                return signature;
            } catch (InvalidAlgorithmParameterException e) {
                qr7.o(e);
                return null;
            } catch (NoSuchAlgorithmException unused) {
                d();
                throw null;
            }
        }
        if (mfkVar.equals(mfk.rsa_pss_rsae_sha384)) {
            try {
                Signature signature2 = Signature.getInstance(cs7Var.c(384));
                signature2.setParameter(new PSSParameterSpec("SHA-384", "MGF1", new MGF1ParameterSpec("SHA-384"), 48, 1));
                return signature2;
            } catch (InvalidAlgorithmParameterException e2) {
                qr7.o(e2);
                return null;
            } catch (NoSuchAlgorithmException unused2) {
                d();
                throw null;
            }
        }
        if (mfkVar.equals(mfk.rsa_pss_rsae_sha512)) {
            try {
                Signature signature3 = Signature.getInstance(cs7Var.c(np0.o));
                signature3.setParameter(new PSSParameterSpec("SHA-512", "MGF1", new MGF1ParameterSpec("SHA-512"), 64, 1));
                return signature3;
            } catch (InvalidAlgorithmParameterException e3) {
                qr7.o(e3);
                return null;
            } catch (NoSuchAlgorithmException unused3) {
                d();
                throw null;
            }
        }
        if (mfkVar.equals(mfk.ecdsa_secp256r1_sha256)) {
            try {
                return Signature.getInstance("SHA256withECDSA");
            } catch (NoSuchAlgorithmException unused4) {
                ore.q("Missing SHA256withECDSA support");
                return null;
            }
        }
        if (mfkVar.equals(mfk.ecdsa_secp384r1_sha384)) {
            try {
                return Signature.getInstance("SHA384withECDSA");
            } catch (NoSuchAlgorithmException unused5) {
                ore.q("Missing SHA384withECDSA support");
                return null;
            }
        }
        if (mfkVar.equals(mfk.ecdsa_secp521r1_sha512)) {
            try {
                return Signature.getInstance("SHA512withECDSA");
            } catch (NoSuchAlgorithmException unused6) {
                ore.q("Missing SHA512withECDSA support");
                return null;
            }
        }
        throw new m("Signature algorithm not supported " + mfkVar);
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        oj6 oj6Var = (oj6) this.c;
        short s = oj6Var.e;
        oj6Var.getClass();
        byte[] bArrA = oj6Var.a(bArr2, "finished", "".getBytes(oj6.u), s);
        String strH = zo5.h(s << 3, "HmacSHA");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrA, strH);
        try {
            Mac mac = Mac.getInstance(strH);
            mac.init(secretKeySpec);
            mac.update(bArr);
            return mac.doFinal();
        } catch (InvalidKeyException unused) {
            hs4.b();
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            ore.q(c0a.o("Missing ", strH, " support"));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r10 == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r8.p(r6, r9, r1) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(defpackage.o67 r9, defpackage.nq4 r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r10 instanceof defpackage.br0
            if (r1 == 0) goto L17
            r1 = r10
            br0 r1 = (defpackage.br0) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f = r2
            goto L1c
        L17:
            br0 r1 = new br0
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.d
            int r2 = r1.f
            r3 = 2
            r4 = 1
            hu4 r5 = defpackage.hu4.a
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            defpackage.ch3.d0(r10)
            goto L83
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            r8 = 0
            return r8
        L35:
            defpackage.ch3.d0(r10)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.CancellationException -> L55
            goto L5c
        L39:
            r9 = move-exception
            goto L57
        L3b:
            defpackage.ch3.d0(r10)
            java.lang.Object r10 = r8.b     // Catch: java.lang.Throwable -> L39 java.util.concurrent.CancellationException -> L55
            ny8 r10 = (defpackage.ny8) r10     // Catch: java.lang.Throwable -> L39 java.util.concurrent.CancellationException -> L55
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.CancellationException -> L55
            pvb r10 = (defpackage.pvb) r10     // Catch: java.lang.Throwable -> L39 java.util.concurrent.CancellationException -> L55
            java.lang.Object r2 = r8.a     // Catch: java.lang.Throwable -> L39 java.util.concurrent.CancellationException -> L55
            ed6 r2 = (defpackage.ed6) r2     // Catch: java.lang.Throwable -> L39 java.util.concurrent.CancellationException -> L55
            r1.f = r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.CancellationException -> L55
            java.lang.Object r10 = defpackage.cqk.H(r10, r9, r0, r2, r1)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.CancellationException -> L55
            if (r10 != r5) goto L5c
            goto L82
        L55:
            r8 = move-exception
            goto L86
        L57:
            poe r10 = new poe
            r10.<init>(r9)
        L5c:
            java.lang.Throwable r9 = defpackage.roe.a(r10)
            if (r9 == 0) goto L67
            java.lang.String r2 = "Not updated folder due to error"
            defpackage.gm0.V(r0, r2, r9)
        L67:
            defpackage.ch3.d0(r10)
            p67 r10 = (defpackage.p67) r10
            java.lang.Object r8 = r8.c
            ny8 r8 = (defpackage.ny8) r8
            java.lang.Object r8 = r8.getValue()
            sy4 r8 = (defpackage.sy4) r8
            long r6 = r10.d
            vy2 r9 = r10.c
            r1.f = r3
            java.lang.Object r8 = r8.p(r6, r9, r1)
            if (r8 != r5) goto L83
        L82:
            return r5
        L83:
            sbi r8 = defpackage.sbi.a
            return r8
        L86:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr0.g(o67, nq4):java.lang.Object");
    }
}
