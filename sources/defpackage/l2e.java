package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l2e {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public l2e(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public static l2e a(l2e l2eVar, int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i = l2eVar.a;
        }
        if ((i3 & 2) != 0) {
            i2 = l2eVar.b;
        }
        if ((i3 & 4) != 0) {
            z = l2eVar.c;
        }
        if ((i3 & 8) != 0) {
            z2 = l2eVar.d;
        }
        l2eVar.getClass();
        return new l2e(i, i2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2e)) {
            return false;
        }
        l2e l2eVar = (l2e) obj;
        return this.a == l2eVar.a && this.b == l2eVar.b && this.c == l2eVar.c && this.d == l2eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + nbh.n(c0a.f(this.b, qt4.D(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlashState(photoFlash=");
        sb.append(bc1.w(this.a));
        sb.append(", videoFlash=");
        sb.append(bc1.w(this.b));
        sb.append(", isSupported=");
        return bc1.m(", isVideoMode=", ")", sb, this.c, this.d);
    }
}
