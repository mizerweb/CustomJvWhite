package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes3.dex */
public final class uzh {
    public static final Range g = new Range(Float.valueOf(0.0f), Float.valueOf(1.0f));
    public final szh a;
    public final int b;
    public final Range c;
    public final boolean d;
    public final nu3 e;
    public final Integer f;

    public uzh(szh szhVar, int i, Range range, boolean z, nu3 nu3Var, Integer num) {
        this.a = szhVar;
        this.b = i;
        this.c = range;
        this.d = z;
        this.e = nu3Var;
        this.f = num;
        if (i <= 0) {
            c.o(zo5.h(i, "Bitrate must be positive, current: "));
            throw null;
        }
        if (((Number) range.getLower()).floatValue() < 0.0f || ((Number) range.getUpper()).floatValue() > 1.0f || ((Number) range.getLower()).floatValue() >= ((Number) range.getUpper()).floatValue()) {
            ore.e(range, "Trim range must be ascending and within its bounds: [0, 1], current: ");
            throw null;
        }
        if (num == null || num.intValue() > 0) {
            return;
        }
        c.o(qv1.j("Max encoder frames must be positive or null, current: ", num));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzh)) {
            return false;
        }
        uzh uzhVar = (uzh) obj;
        return this.a.equals(uzhVar.a) && this.b == uzhVar.b && this.c.equals(uzhVar.c) && this.d == uzhVar.d && this.e.equals(uzhVar.e) && cqk.d(this.f, uzhVar.f);
    }

    public final int hashCode() {
        int iN = nbh.n(c0a.f(3, (this.e.hashCode() + nbh.n((this.c.hashCode() + zo5.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d)) * 31, 31), 31, true);
        Integer num = this.f;
        return iN + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TranscodeConfig(frameDimensions=" + this.a + ", bitrate=" + this.b + ", trimRange=" + this.c + ", mute=" + this.d + ", codecConfig=" + this.e + ", containerType=FRAGMENTED_MP4, isPortraitEncodingEnabled=true, maxEncoderFrames=" + this.f + ")";
    }
}
