package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tw7 extends xw7 {
    public final CharSequence a;

    public tw7(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw7) && this.a.equals(((tw7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Description(description=" + ((Object) this.a) + ")";
    }
}
