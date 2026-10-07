package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xwg {
    public final long a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public xwg(long j, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
    }

    public final long a() {
        return this.a;
    }

    public final float b() {
        return this.f;
    }

    public final float c() {
        return this.g;
    }

    public final float d() {
        return this.e;
    }

    public final float e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwg)) {
            return false;
        }
        xwg xwgVar = (xwg) obj;
        return this.a == xwgVar.a && Float.compare(this.b, xwgVar.b) == 0 && Float.compare(this.c, xwgVar.c) == 0 && Float.compare(this.d, xwgVar.d) == 0 && Float.compare(this.e, xwgVar.e) == 0 && Float.compare(this.f, xwgVar.f) == 0 && Float.compare(this.g, xwgVar.g) == 0;
    }

    public final float f() {
        return this.b;
    }

    public final float g() {
        return this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + nbh.m(nbh.m(nbh.m(nbh.m(nbh.m(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        return "StoryDraftMediaTransformEntity(draftId=" + this.a + ", translationX=" + this.b + ", translationY=" + this.c + ", scale=" + this.d + ", rotation=" + this.e + ", pivotX=" + this.f + ", pivotY=" + this.g + ")";
    }
}
