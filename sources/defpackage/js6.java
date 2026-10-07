package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class js6 {
    public final File a;

    public js6(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js6) && cqk.d(this.a, ((js6) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((nji.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FileSendEvent(file=" + this.a + ", type=" + nji.a + ", removeAfterUpload=true)";
    }
}
