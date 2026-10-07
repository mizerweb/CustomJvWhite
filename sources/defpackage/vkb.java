package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vkb {
    public final long a;
    public final long b;
    public final long c;
    public final int d;

    public vkb(int i, long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkb)) {
            return false;
        }
        vkb vkbVar = (vkb) obj;
        return this.a == vkbVar.a && this.b == vkbVar.b && this.c == vkbVar.c && this.d == vkbVar.d;
    }

    public final int hashCode() {
        return qt4.D(this.d) + qt4.g(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String str;
        StringBuilder sbS = qt4.s(this.a, "NotifTranscriptionEvent(messageId=", ", messageServerId=");
        sbS.append(this.b);
        qt4.z(this.c, ", chatId=", ", type=", sbS);
        int i = this.d;
        if (i != 1) {
            str = i != 2 ? "null" : "ERROR";
        } else {
            str = "SUCCESS";
        }
        sbS.append(str);
        sbS.append(")");
        return sbS.toString();
    }
}
