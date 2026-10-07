package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvh extends eyl {
    public final CharSequence a;

    public qvh(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.eyl
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvh) && cqk.d(this.a, ((qvh) obj).a);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "Connected(text=" + ((Object) this.a) + ")";
    }
}
