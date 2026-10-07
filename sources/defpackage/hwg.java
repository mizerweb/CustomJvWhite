package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hwg {
    public final Integer a;
    public final Integer b;

    public hwg(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwg)) {
            return false;
        }
        hwg hwgVar = (hwg) obj;
        return cqk.d(this.a, hwgVar.a) && cqk.d(this.b, hwgVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "StoryCountersState(views=" + this.a + ", reactions=" + this.b + ")";
    }
}
