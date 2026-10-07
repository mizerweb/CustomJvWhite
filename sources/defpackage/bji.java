package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bji {
    public final int a;

    public bji(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bji) && this.a == ((bji) obj).a;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            return 0;
        }
        return qt4.D(i);
    }

    public final String toString() {
        return "UploadServerFlagsDb(desiredUploader=" + v0h.p(this.a) + ")";
    }
}
