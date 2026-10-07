package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xpl {
    public static cx0 a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = uy4.b("androidxBiometric", 3);
            uy4.d(builderB);
            uy4.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            uy4.c(keyGenerator, uy4.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new cx0(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static boolean b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static iof c(Set set, ddd dddVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof iof)) {
                return new jof(set2, dddVar);
            }
            iof iofVar = (iof) set2;
            ddd dddVar2 = iofVar.b;
            dddVar2.getClass();
            return new jof((SortedSet) iofVar.a, new hdd(Arrays.asList(dddVar2, dddVar)));
        }
        if (!(set instanceof iof)) {
            set.getClass();
            return new iof(set, dddVar);
        }
        iof iofVar2 = (iof) set;
        ddd dddVar3 = iofVar2.b;
        dddVar3.getClass();
        return new iof(iofVar2.a, new hdd(Arrays.asList(dddVar3, dddVar)));
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static hof e(Set set, u98 u98Var) {
        lvb.W(set, "set1");
        lvb.W(u98Var, "set2");
        return new hof(set, u98Var, 0);
    }

    public static BiometricPrompt.CryptoObject f(cx0 cx0Var) {
        IdentityCredential identityCredential;
        if (cx0Var == null) {
            return null;
        }
        Cipher cipher = cx0Var.b;
        if (cipher != null) {
            return vy4.b(cipher);
        }
        Signature signature = cx0Var.a;
        if (signature != null) {
            return vy4.a(signature);
        }
        Mac mac = cx0Var.c;
        if (mac != null) {
            return vy4.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = cx0Var.d) == null) {
            return null;
        }
        return wy4.a(identityCredential);
    }
}
