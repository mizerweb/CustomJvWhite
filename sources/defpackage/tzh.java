package defpackage;

import android.util.Range;

/* JADX INFO: loaded from: classes3.dex */
public final class tzh {
    public final rzh a;
    public final int b;
    public final Range c;
    public final boolean d;
    public final mu3 e;
    public final Integer f;

    static {
        new Range(Float.valueOf(0.0f), Float.valueOf(1.0f));
    }

    public tzh(rzh rzhVar, int i, Range range, boolean z, mu3 mu3Var, Integer num) {
        this.a = rzhVar;
        this.b = i;
        this.c = range;
        this.d = z;
        this.e = mu3Var;
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
        if (!(obj instanceof tzh)) {
            return false;
        }
        tzh tzhVar = (tzh) obj;
        return this.a.equals(tzhVar.a) && this.b == tzhVar.b && this.c.equals(tzhVar.c) && this.d == tzhVar.d && this.e.equals(tzhVar.e) && cqk.d(this.f, tzhVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + nbh.n((this.c.hashCode() + zo5.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d)) * 31;
        Integer num = this.f;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TranscodeConfig(frameDimensions=" + this.a + ", bitrate=" + this.b + ", trimRange=" + this.c + ", mute=" + this.d + ", codecConfig=" + this.e + ", maxEncoderFrames=" + this.f + ")";
    }
}
