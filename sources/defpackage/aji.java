package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aji {
    public final int a;

    public aji(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aji) && this.a == ((aji) obj).a;
    }

    public final int hashCode() {
        return qt4.D(this.a);
    }

    public final String toString() {
        return "UploadServerFlags(desiredUploader=" + v0h.p(this.a) + ")";
    }
}
