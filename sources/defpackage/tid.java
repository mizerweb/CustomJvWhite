package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tid {
    public final long a;

    public static final boolean a(long j, long j2) {
        return (j & j2) != 0;
    }

    public static String b(long j) {
        StringBuilder sb = new StringBuilder("ProcessMask(raw=");
        sb.append(Long.toBinaryString(j));
        if (a(j, 1L)) {
            sb.append(",upload");
        }
        if (a(j, 8L)) {
            sb.append(",convert");
        }
        if (a(j, 2L)) {
            sb.append(",download");
        }
        if (a(j, 4L)) {
            sb.append(",video_play");
        }
        if (a(j, 16L)) {
            sb.append(",call_p2p");
        }
        if (a(j, 32L)) {
            sb.append(",call_p2g");
        }
        if (a(j, 64L)) {
            sb.append(",carpet_service");
        }
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tid) {
            return this.a == ((tid) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
