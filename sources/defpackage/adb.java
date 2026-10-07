package defpackage;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes.dex */
public final class adb {
    public static final String b = n1g.Z("NetworkRequestCompat");
    public final Object a;

    public adb(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adb) && cqk.d(this.a, ((adb) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }
}
