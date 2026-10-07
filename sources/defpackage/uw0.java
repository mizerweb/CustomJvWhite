package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uw0 {
    public static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    public static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
