package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class myh {
    public static final myh c = new myh();
    public final xc7 a = xc7.c;
    public final xc7 b = xc7.k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myh)) {
            return false;
        }
        myh myhVar = (myh) obj;
        return this.a == myhVar.a && this.b == myhVar.b && Float.compare(0.7f, 0.7f) == 0 && Float.compare(0.75f, 0.75f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.75f) + nbh.m(zo5.c(719, zo5.c(1279, qt4.g(qt4.g(qt4.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, 10000L), 31, 25000L), 31, 25000L), 31), 31), 0.7f, 31);
    }

    public final String toString() {
        return "TrackSelectionConfig(minFrameSize=" + this.a + ", maxFrameSize=" + this.b + ", minDurationForQualityIncreaseMs=10000, maxDurationForQualityDecreaseMs=25000, minDurationToRetainAfterDiscardMs=25000, maxWidthToDiscard=1279, maxHeightToDiscard=719, bandwidthFraction=0.7, bufferedFractionToLiveEdgeForQualityIncrease=0.75)";
    }
}
