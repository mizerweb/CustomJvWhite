package defpackage;

import one.me.statistics.androidperf.battery.BatteryRegistrarException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iwl {
    public static void a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static final BatteryRegistrarException b(Throwable th) {
        return new BatteryRegistrarException(th);
    }
}
