package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class vqg {
    public static final uqg Companion = new uqg();
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final int f;
    public final int g;
    public final int h;

    public /* synthetic */ vqg(int i, int i2, int i3, int i4, Integer num, Integer num2, int i5, int i6, int i7) {
        this.a = (i & 1) == 0 ? 180 : i2;
        if ((i & 2) == 0) {
            this.b = 900;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = 8;
        } else {
            this.c = i4;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = 300;
        } else {
            this.f = i5;
        }
        if ((i & 64) == 0) {
            this.g = 300;
        } else {
            this.g = i6;
        }
        if ((i & np0.m) == 0) {
            this.h = 30;
        } else {
            this.h = i7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqg)) {
            return false;
        }
        vqg vqgVar = (vqg) obj;
        return this.a == vqgVar.a && this.b == vqgVar.b && this.c == vqgVar.c && cqk.d(this.d, vqgVar.d) && cqk.d(this.e, vqgVar.e) && this.f == vqgVar.f && this.g == vqgVar.g && this.h == vqgVar.h;
    }

    public final int hashCode() {
        int iC = zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Integer num = this.d;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return Integer.hashCode(this.h) + zo5.c(this.g, zo5.c(this.f, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("StoriesConfig(trimLimitSeconds=", this.a, ", pickDurationSeconds=", this.b, ", photoStorySeconds=");
        sbP.append(this.c);
        sbP.append(", storyPollingPreviewsSeconds=");
        sbP.append(this.d);
        sbP.append(", chatPollingPreviewsSeconds=");
        sbP.append(this.e);
        sbP.append(", statsRefreshSeconds=");
        sbP.append(this.f);
        sbP.append(", contentRefreshSeconds=");
        sbP.append(this.g);
        sbP.append(", maxStories=");
        sbP.append(this.h);
        sbP.append(")");
        return sbP.toString();
    }

    public vqg() {
        this.a = 180;
        this.b = 900;
        this.c = 8;
        this.d = null;
        this.e = null;
        this.f = 300;
        this.g = 300;
        this.h = 30;
    }
}
