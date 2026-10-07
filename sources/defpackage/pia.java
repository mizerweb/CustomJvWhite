package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pia {
    public final long a;
    public final long b;
    public final String c;

    public pia(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pia.class == obj.getClass()) {
            pia piaVar = (pia) obj;
            if (this.a != piaVar.a || this.b != piaVar.b) {
                return false;
            }
            String str = piaVar.c;
            String str2 = this.c;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageMediaUploadKey{messageId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", attachLocalId='");
        return zo5.w(sb, this.c, "'}");
    }
}
