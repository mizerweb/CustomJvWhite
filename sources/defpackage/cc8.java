package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cc8 {
    public Float a;
    public Float b;
    public Float c;
    public Long d;
    public Float e;
    public Float f;
    public Long g;
    public Integer h;

    public cc8(Float f, Float f2, Float f3, Long l, Float f4, Float f5, Long l2, Integer num) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = l;
        this.e = f4;
        this.f = f5;
        this.g = l2;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc8)) {
            return false;
        }
        cc8 cc8Var = (cc8) obj;
        return cqk.d(this.a, cc8Var.a) && cqk.d(this.b, cc8Var.b) && cqk.d(this.c, cc8Var.c) && cqk.d(this.d, cc8Var.d) && cqk.d(this.e, cc8Var.e) && cqk.d(this.f, cc8Var.f) && cqk.d(this.g, cc8Var.g) && cqk.d(this.h, cc8Var.h);
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.b;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.c;
        int iHashCode3 = (iHashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Float f4 = this.e;
        int iHashCode5 = (iHashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.f;
        int iHashCode6 = (iHashCode5 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.h;
        return iHashCode7 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "Stats(insertedAudioSamplesForDeceleration=" + this.a + ", removedAudioSamplesForAcceleration=" + this.b + ", concealedAudioSamples=" + this.c + ", jitterAudio=" + this.d + ", concealedSilentAudioSamples=" + this.e + ", concealmentAudioAvgSize=" + this.f + ", totalAudioEnergy=" + this.g + ", packetsLost=" + this.h + ")";
    }
}
