package defpackage;

import one.me.statistics.androidperf.battery.BatteryPercentIncreasedException;

/* JADX INFO: loaded from: classes3.dex */
public final class pu0 implements ru0 {
    public final BatteryPercentIncreasedException a;

    public pu0(BatteryPercentIncreasedException batteryPercentIncreasedException) {
        this.a = batteryPercentIncreasedException;
    }

    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pu0) && this.a == ((pu0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InvalidData(reason=" + this.a + ")";
    }
}
