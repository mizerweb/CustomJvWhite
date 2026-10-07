package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pc2 {
    public final String a;

    public /* synthetic */ pc2(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return qv1.g(')', "CameraBackendId(value=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pc2) {
            return cqk.d(this.a, ((pc2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
