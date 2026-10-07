package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class di7 implements fi7 {
    public final float a;

    public di7(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof di7) && Float.compare(this.a, ((di7) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return p.e("UpdateCameraTranslation(translationY=", ")", this.a);
    }
}
