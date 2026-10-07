package defpackage;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class glc {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
