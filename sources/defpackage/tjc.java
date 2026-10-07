package defpackage;

import org.apache.http.util.VersionInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class tjc {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof tjc) {
            return this.a == ((tjc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "PENDING";
        }
        if (i == 1) {
            return "AVAILABLE";
        }
        if (i == 2) {
            return VersionInfo.UNAVAILABLE;
        }
        switch (i) {
            case 10:
                return "ERROR_OUTPUT_FAILED";
            case 11:
                return "ERROR_OUTPUT_ABORTED";
            case 12:
                return "ERROR_OUTPUT_MISSING";
            case 13:
                return "ERROR_OUTPUT_DROPPED";
            default:
                return nbh.t("OutputStatus(value=", i, ')');
        }
    }
}
