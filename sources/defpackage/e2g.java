package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e2g extends rbb {
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final long g;
    public final String h;

    public e2g(long j, long j2, String str, long j3, String str2, long j4, String str3) {
        super(sbi.a);
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = j3;
        this.f = str2;
        this.g = j4;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2g)) {
            return false;
        }
        e2g e2gVar = (e2g) obj;
        return this.b == e2gVar.b && this.c == e2gVar.c && cqk.d(this.d, e2gVar.d) && this.e == e2gVar.e && cqk.d(this.f, e2gVar.f) && this.g == e2gVar.g && cqk.d(this.h, e2gVar.h);
    }

    public final int hashCode() {
        int iG = qt4.g(Long.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        return this.h.hashCode() + qt4.g(zo5.d(qt4.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "ShowFileDownloadWarningBottomSheet(chatId=", ", messageId=");
        qv1.s(this.c, ", attachLocalId=", this.d, sbS);
        qt4.z(this.e, ", fileId=", ", fileName=", sbS);
        sbS.append(this.f);
        sbS.append(", fileSize=");
        sbS.append(this.g);
        return qt4.q(sbS, ", fileUrl=", this.h, ")");
    }
}
