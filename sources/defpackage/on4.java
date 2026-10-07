package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class on4 {
    public final Integer a;

    public on4(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof on4) && cqk.d(this.a, ((on4) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ButtonTitle(buttonTitleRes=" + this.a + ")";
    }
}
