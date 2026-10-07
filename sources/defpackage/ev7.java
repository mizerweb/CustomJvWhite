package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ev7 extends dc6 {
    public final int a;

    public ev7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev7) && this.a == ((ev7) obj).a;
    }

    public final int hashCode() {
        return qt4.D(this.a);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HideErrorInputEvent(typeInput=");
        int i = this.a;
        if (i == 1) {
            str = "NAME";
        } else if (i != 2) {
            str = i != 3 ? "null" : "TITLE";
        } else {
            str = "SURNAME";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
