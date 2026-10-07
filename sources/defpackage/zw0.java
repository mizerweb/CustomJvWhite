package defpackage;

import android.hardware.biometrics.BiometricManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zw0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
