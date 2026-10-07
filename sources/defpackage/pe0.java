package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class pe0 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ se0 a;

    public pe0(se0 se0Var) {
        this.a = se0Var;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((fx0) this.a).a;
        if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).k) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
        if (biometricViewModel.r == null) {
            biometricViewModel.r = new g8b();
        }
        BiometricViewModel.h(biometricViewModel.r, Boolean.TRUE);
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential identityCredentialB;
        cx0 cx0Var = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher cipherD = vy4.d(cryptoObject);
            if (cipherD != null) {
                cx0Var = new cx0(cipherD);
            } else {
                Signature signatureF = vy4.f(cryptoObject);
                if (signatureF != null) {
                    cx0Var = new cx0(signatureF);
                } else {
                    Mac macE = vy4.e(cryptoObject);
                    if (macE != null) {
                        cx0Var = new cx0(macE);
                    } else if (Build.VERSION.SDK_INT >= 30 && (identityCredentialB = wy4.b(cryptoObject)) != null) {
                        cx0Var = new cx0(identityCredentialB);
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int iA = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                iA = re0.a(authenticationResult);
            }
        } else if (i != 29) {
            iA = 2;
        }
        this.a.b(new bx0(cx0Var, iA));
    }
}
