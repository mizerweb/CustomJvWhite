package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class la {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof la)) {
                return false;
            }
            la laVar = (la) obj;
            int i = this.a;
            if (i != laVar.a) {
                return false;
            }
            if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != laVar.b || this.b != laVar.d) {
                if (this.d != laVar.d || this.b != laVar.b) {
                    return false;
                }
                Object obj2 = this.c;
                Object obj3 = laVar.c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
