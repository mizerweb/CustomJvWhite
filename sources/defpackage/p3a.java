package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class p3a {
    public final s3a a;

    public p3a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            ore.n("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(packageName)) {
            ore.p("packageName should be nonempty");
            throw null;
        }
        this.a = new r3a(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3a)) {
            return false;
        }
        return this.a.equals(((p3a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public p3a(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.a = new r3a(str, i, i2);
                    return;
                } else {
                    this.a = new s3a(str, i, i2);
                    return;
                }
            }
            ore.p("packageName should be nonempty");
            throw null;
        }
        ore.n("package shouldn't be null");
        throw null;
    }
}
