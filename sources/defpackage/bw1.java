package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bw1 {
    public final Integer a;
    public final f8b b;

    public bw1(Integer num, f8b f8bVar) {
        this.a = num;
        this.b = f8bVar;
    }

    public static bw1 a(bw1 bw1Var, Integer num, f8b f8bVar, int i) {
        if ((i & 1) != 0) {
            num = bw1Var.a;
        }
        if ((i & 2) != 0) {
            f8bVar = bw1Var.b;
        }
        bw1Var.getClass();
        bw1Var.getClass();
        return new bw1(num, f8bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw1)) {
            return false;
        }
        bw1 bw1Var = (bw1) obj;
        return cqk.d(this.a, bw1Var.a) && cqk.d(this.b, bw1Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
    }

    public final String toString() {
        return "State(selectedEmoji=" + this.a + ", selectedReasons=" + this.b + ", otherReasonText=null)";
    }
}
