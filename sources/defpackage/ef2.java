package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ef2 {
    public final String a;

    public /* synthetic */ ef2(String str) {
        this.a = str;
    }

    public static void a(String str) {
        if (r5h.X0(str)) {
            ore.p("CameraId cannot be null or blank!");
        }
    }

    public static String b(String str) {
        return qv1.k("CameraId-", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ef2) {
            return cqk.d(this.a, ((ef2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
