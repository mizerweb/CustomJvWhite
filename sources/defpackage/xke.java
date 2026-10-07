package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xke implements yve {
    public final Integer a;

    public xke(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xke.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((xke) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "ReportPerfStatResponse{estimatedPerformanceIndex=" + this.a + '}';
    }
}
