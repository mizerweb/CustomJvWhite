package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class s1e implements v1e {
    public final File a;

    public s1e(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1e) && this.a.equals(((s1e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartRecordVideo(file=" + this.a + ")";
    }
}
