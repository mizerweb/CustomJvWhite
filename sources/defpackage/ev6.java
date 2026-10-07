package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class ev6 extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ vn7 a;

    public ev6(vn7 vn7Var) {
        this.a = vn7Var;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((fx0) ((r6a) this.a.b).c).a(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference weakReference = ((fx0) ((r6a) this.a.b).c).a;
        if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).k) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
        if (biometricViewModel.r == null) {
            biometricViewModel.r = new g8b();
        }
        BiometricViewModel.h(biometricViewModel.r, Boolean.TRUE);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((fx0) ((r6a) this.a.b).c).a;
        if (weakReference.get() != null) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
            if (biometricViewModel.q == null) {
                biometricViewModel.q = new g8b();
            }
            BiometricViewModel.h(biometricViewModel.q, charSequence);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        vn7 vn7Var = this.a;
        xtj xtjVarF = fv6.f(fv6.b(authenticationResult));
        vn7Var.getClass();
        cx0 cx0Var = null;
        if (xtjVarF != null) {
            Cipher cipher = (Cipher) xtjVarF.c;
            if (cipher != null) {
                cx0Var = new cx0(cipher);
            } else {
                Signature signature = (Signature) xtjVarF.b;
                if (signature != null) {
                    cx0Var = new cx0(signature);
                } else {
                    Mac mac = (Mac) xtjVarF.d;
                    if (mac != null) {
                        cx0Var = new cx0(mac);
                    }
                }
            }
        }
        ((fx0) ((r6a) vn7Var.b).c).b(new bx0(cx0Var, 2));
    }
}
