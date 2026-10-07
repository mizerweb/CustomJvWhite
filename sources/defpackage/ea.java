package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ea {
    public static final String d;
    public static final String e;
    public static final String f;
    public final long a;
    public final long b;
    public final String c;

    static {
        String str = vqi.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public ea(long j, long j2, String str) {
        lvb.R((j == -9223372036854775807L && j2 == -9223372036854775807L && str == null) ? false : true);
        this.a = j == -9223372036854775807L ? 0L : j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ea.class == obj.getClass()) {
            ea eaVar = (ea) obj;
            if (this.a == eaVar.a && this.b == eaVar.b && Objects.equals(this.c, eaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), this.c);
    }
}
