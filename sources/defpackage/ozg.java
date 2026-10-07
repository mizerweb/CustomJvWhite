package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ozg {
    public final vg4 a;
    public final azg b;
    public final short c;
    public final short d;
    public final long e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public ozg(vg4 vg4Var, azg azgVar, short s, short s2, long j, int i) {
        this.a = vg4Var;
        this.b = azgVar;
        this.c = s;
        this.d = s2;
        this.e = j;
        this.f = i;
        boolean z = s > 0;
        this.g = z;
        this.h = z || i != 2;
    }

    public static ozg a(ozg ozgVar, short s, short s2, int i, int i2) {
        vg4 vg4Var = ozgVar.a;
        azg azgVar = ozgVar.b;
        if ((i2 & 4) != 0) {
            s = ozgVar.c;
        }
        short s3 = s;
        if ((i2 & 8) != 0) {
            s2 = ozgVar.d;
        }
        short s4 = s2;
        long j = ozgVar.e;
        if ((i2 & 32) != 0) {
            i = ozgVar.f;
        }
        ozgVar.getClass();
        return new ozg(vg4Var, azgVar, s3, s4, j, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozg)) {
            return false;
        }
        ozg ozgVar = (ozg) obj;
        return cqk.d(this.a, ozgVar.a) && this.b.equals(ozgVar.b) && this.c == ozgVar.c && this.d == ozgVar.d && this.e == ozgVar.e && this.f == ozgVar.f;
    }

    public final int hashCode() {
        return qt4.D(this.f) + qt4.g((Short.hashCode(this.d) + ((Short.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryPreviewModel(contact=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", totalCount=");
        qt4.x(this.c, this.d, ", readCount=", ", lastStoryExpirationTime=", sb);
        sb.append(this.e);
        sb.append(", type=");
        sb.append(pye.o(this.f));
        sb.append(")");
        return sb.toString();
    }
}
