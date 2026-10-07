package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class s5e implements Comparable, CharSequence, Serializable {
    public final CharSequence a;

    public s5e(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.toString().compareTo(((s5e) obj).a.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s5e) {
            return cqk.d(this.a.toString(), ((s5e) obj).a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + s5e.class.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a.toString();
    }
}
