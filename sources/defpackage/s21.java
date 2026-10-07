package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s21 {
    public final String a;

    public s21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s21) {
            return this.a.equals(((s21) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
