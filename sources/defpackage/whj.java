package defpackage;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class whj {
    public static final /* synthetic */ zv8[] f;
    public final String a;
    public final boolean b;
    public final String c = whj.class.getName();
    public final ifh d = new ifh(new o0j(10));
    public final fbc e = new fbc(19, new o0j(11));

    static {
        dwd dwdVar = new dwd(whj.class, "cipher", "getCipher()Ljavax/crypto/Cipher;", 0);
        zfe.a.getClass();
        f = new zv8[]{dwdVar};
    }

    public whj(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean a(boolean z, String str, Cipher cipher) {
        String str2 = this.c;
        if (str != null) {
            try {
                if (str.length() == 0) {
                    f().init(1, g());
                } else {
                    d(str, cipher);
                }
            } catch (UserNotAuthenticatedException e) {
                if (z) {
                    gm0.V(str2, "Failure check key. Need auth but we already authenticated, clear key.", e);
                    c();
                } else {
                    gm0.Y(str2, "Failure check key. Need auth.");
                }
                return !z;
            } catch (Exception e2) {
                gm0.V(str2, "Failure check key. Maybe biometry changed, should clear", e2);
                c();
                return false;
            }
        } else {
            f().init(1, g());
        }
        gm0.n(str2, "Success check key.");
        return true;
    }

    public final void c() {
        Object poeVar;
        try {
            ((KeyStore) this.d.getValue()).deleteEntry(this.a);
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            gm0.Y(this.c, "Can't remove secret key");
        }
    }

    public final String d(String str, Cipher cipher) throws InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipherF = cipher == null ? f() : cipher;
        byte[] bArrDecode = Base64.decode(str, 0);
        if (cipher == null) {
            cipherF.init(2, g(), new IvParameterSpec(a.T0(0, bArrDecode, cipherF.getBlockSize())));
        } else {
            gm0.n(this.c, "Decrypt with external cipher");
        }
        return new String(cipherF.doFinal(a.T0(cipherF.getBlockSize(), bArrDecode, bArrDecode.length)), pt2.a);
    }

    public final String e(String str, Cipher cipher) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
        Cipher cipherF = cipher == null ? f() : cipher;
        if (cipher == null) {
            cipherF.init(1, g());
        } else {
            gm0.n(this.c, "Encrypt with external cipher");
        }
        byte[] bArrDoFinal = cipherF.doFinal(str.getBytes(pt2.a));
        byte[] iv = cipherF.getIV();
        byte[] bArr = new byte[iv.length + bArrDoFinal.length];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(bArrDoFinal, 0, bArr, iv.length, bArrDoFinal.length);
        return Base64.encodeToString(bArr, 0);
    }

    public final Cipher f() {
        zv8 zv8Var = f[0];
        return (Cipher) ((oqh) this.e.c).get();
    }

    public final SecretKey g() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        SecretKey secretKey;
        KeyStore keyStore = (KeyStore) this.d.getValue();
        String str = this.a;
        KeyStore.Entry entry = keyStore.getEntry(str, null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null && (secretKey = secretKeyEntry.getSecretKey()) != null) {
            return secretKey;
        }
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding");
        if (this.b) {
            encryptionPaddings.setUserAuthenticationRequired(true);
            if (Build.VERSION.SDK_INT >= 30) {
                encryptionPaddings.setUserAuthenticationParameters(120, 2);
            }
        } else {
            encryptionPaddings.setUserAuthenticationRequired(false);
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = encryptionPaddings.setRandomizedEncryptionRequired(true).build();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpecBuild);
        return keyGenerator.generateKey();
    }

    public final cx0 h(String str, boolean z) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (z) {
            f().init(1, g());
        } else {
            f().init(2, g(), new IvParameterSpec(a.T0(0, Base64.decode(str, 0), f().getBlockSize())));
        }
        return new cx0(f());
    }
}
