package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cq9 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cq9) && Double.compare(120.0d, 120.0d) == 0 && Double.compare(0.04d, 0.04d) == 0 && Double.compare(0.04d, 0.04d) == 0 && Double.compare(1000.0d, 1000.0d) == 0 && Double.compare(700.0d, 700.0d) == 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + pwe.b(pwe.b(pwe.b(spc.a(300, spc.a(500, tfb.a(tfb.a(tfb.a(tfb.a(Double.hashCode(120.0d) * 31, 0.04d), 0.04d), 1000.0d), 700.0d))), true), false), false);
    }

    public final String toString() {
        return "BadNetworkCondition(rttThreshold=120.0, lostPacketsLimitForRttBelowLowBound=0.04, lostPacketsLimitForRttAboveLowBound=0.04, rttEnterLevel2Mode=1000.0, rttLeaveLevel2Mode=700.0, videoBitrateLevel1K=500, videoBitrateLevel2K=300, preferHardwareVPXEncoder=true, limitFrameSize=false, limitBitrate=false, setTemporalLayers=true)";
    }
}
