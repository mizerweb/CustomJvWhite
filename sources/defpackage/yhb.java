package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class yhb {
    public static final xhb Companion = new xhb();
    public final Boolean a;
    public final Integer b;
    public final String c;

    public /* synthetic */ yhb(int i, Boolean bool, Integer num, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhb)) {
            return false;
        }
        yhb yhbVar = (yhb) obj;
        return cqk.d(this.a, yhbVar.a) && cqk.d(this.b, yhbVar.b) && cqk.d(this.c, yhbVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NoiseSuppressorConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", label=");
        return zo5.w(sb, this.c, ")");
    }

    public yhb() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
