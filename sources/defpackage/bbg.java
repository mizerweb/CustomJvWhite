package defpackage;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class bbg {
    public final long a;
    public final long b;
    public final int c;

    public bbg(int i, long j, long j2) {
        lvb.R(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bbg.class == obj.getClass()) {
            bbg bbgVar = (bbg) obj;
            if (this.a == bbgVar.a && this.b == bbgVar.b && this.c == bbgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = vqi.a;
        Locale locale = Locale.US;
        StringBuilder sbS = qt4.s(this.a, "Segment: startTimeMs=", ", endTimeMs=");
        sbS.append(this.b);
        sbS.append(", speedDivisor=");
        sbS.append(this.c);
        return sbS.toString();
    }
}
