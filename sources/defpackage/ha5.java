package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes2.dex */
public final class ha5 extends ldf {
    @Override // defpackage.ldf
    public final Signature[] o(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
