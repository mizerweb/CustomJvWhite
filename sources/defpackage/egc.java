package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class egc extends rbb {
    public final long b;
    public final String c;
    public final String d;

    public egc(long j, String str, String str2) {
        super(sbi.a);
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egc)) {
            return false;
        }
        egc egcVar = (egc) obj;
        return this.b == egcVar.b && this.c.equals(egcVar.c) && cqk.d(this.d, egcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.d(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return qt4.q(qt4.t(this.b, "OpenPhoneBook(contactId=", ", fullName=", this.c), ", phone=", this.d, ")");
    }
}
