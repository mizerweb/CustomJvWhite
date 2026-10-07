package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kza implements lza {
    public final Long a;
    public final Long b;
    public final ynh c;
    public final ynh d;
    public final v2d e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;

    public kza(Long l, Long l2, ynh ynhVar, ynh ynhVar2, v2d v2dVar, boolean z, boolean z2, int i) {
        this.a = l;
        this.b = l2;
        this.c = ynhVar;
        this.d = ynhVar2;
        this.e = v2dVar;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = z || z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kza)) {
            return false;
        }
        kza kzaVar = (kza) obj;
        return cqk.d(this.a, kzaVar.a) && cqk.d(this.b, kzaVar.b) && this.c.equals(kzaVar.c) && this.d.equals(kzaVar.d) && this.e == kzaVar.e && this.f == kzaVar.f && this.g == kzaVar.g && this.h == kzaVar.h;
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return qt4.D(this.h) + nbh.n(nbh.n((this.e.hashCode() + bc1.h(bc1.h((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "State(chatId=" + this.a + ", messageId=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", speed=" + this.e + ", isPlaying=" + this.f + ", isPaused=" + this.g + ", type=" + r5a.o(this.h) + ")";
    }
}
