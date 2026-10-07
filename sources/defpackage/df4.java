package defpackage;

import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class df4 {
    public static boolean a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }

    public static ff4 b() {
        if (ff4.d) {
            return new ff4();
        }
        return null;
    }

    public static boolean c() {
        return ff4.d;
    }
}
