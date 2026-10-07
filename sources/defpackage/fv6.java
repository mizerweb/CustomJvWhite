package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fv6 {
    public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, ev6 ev6Var) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, 0, ev6Var, null);
    }

    public static FingerprintManager.CryptoObject b(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    public static FingerprintManager c(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static boolean d(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean e(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static xtj f(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new xtj(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new xtj(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new xtj(cryptoObject.getMac());
        }
        return null;
    }

    public static FingerprintManager.CryptoObject g(xtj xtjVar) {
        if (xtjVar == null) {
            return null;
        }
        Mac mac = (Mac) xtjVar.d;
        Signature signature = (Signature) xtjVar.b;
        Cipher cipher = (Cipher) xtjVar.c;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }
}
