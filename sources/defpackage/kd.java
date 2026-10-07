package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kd implements xd {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kd);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "DisableAllCameraAndMicInCall(isSuccess=true, isEnabled=false)";
    }
}
