package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m6h {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m6h);
    }

    public final int hashCode() {
        return Integer.hashCode(600000) + (Integer.hashCode(600000) * 31);
    }

    public final String toString() {
        return "StuckConfig(bufferingDetectionTimeoutMs=600000, suppressedDetectionTimeoutMs=600000)";
    }
}
