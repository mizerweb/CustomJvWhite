package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kg4 {
    public static final kg4 j = new kg4();
    public final int a;
    public final adb b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public kg4(kg4 kg4Var) {
        this.c = kg4Var.c;
        this.d = kg4Var.d;
        this.b = kg4Var.b;
        this.a = kg4Var.a;
        this.e = kg4Var.e;
        this.f = kg4Var.f;
        this.i = kg4Var.i;
        this.g = kg4Var.g;
        this.h = kg4Var.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kg4.class.equals(obj.getClass())) {
            return false;
        }
        kg4 kg4Var = (kg4) obj;
        if (this.c == kg4Var.c && this.d == kg4Var.d && this.e == kg4Var.e && this.f == kg4Var.f && this.g == kg4Var.g && this.h == kg4Var.h && cqk.d(a(), kg4Var.a()) && this.a == kg4Var.a) {
            return cqk.d(this.i, kg4Var.i);
        }
        return false;
    }

    public final int hashCode() {
        int iD = ((((((((qt4.D(this.a) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iD + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iO = nbh.o(this.i, (i + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31);
        NetworkRequest networkRequestA = a();
        return iO + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + c0a.x(this.a) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public kg4(adb adbVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = adbVar;
        this.a = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public kg4() {
        this.b = new adb(null);
        this.a = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = c76.a;
    }
}
