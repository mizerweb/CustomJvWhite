package defpackage;

import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes2.dex */
public final class ij6 extends sr implements Comparable {
    public final ZipEntry c;
    public final int d;

    public ij6(String str, ZipEntry zipEntry, int i) {
        super(str, String.valueOf(zipEntry.getCrc()));
        this.c = zipEntry;
        this.d = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((String) this.a).compareTo((String) ((ij6) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ij6.class == obj.getClass()) {
            ij6 ij6Var = (ij6) obj;
            if (this.c.equals(ij6Var.c) && this.d == ij6Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.d * 31);
    }
}
