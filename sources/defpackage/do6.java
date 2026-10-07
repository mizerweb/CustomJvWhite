package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class do6 extends z3 {
    public static final Parcelable.Creator<do6> CREATOR = new eu1(9);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public do6(int i, long j, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final long b() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof do6) {
            do6 do6Var = (do6) obj;
            if (f55.h(this.a, do6Var.a) && b() == do6Var.b() && this.d == do6Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        qg7 qg7Var = new qg7(this);
        qg7Var.e(this.a, SdkMetricStatEvent.NAME_KEY);
        qg7Var.e(Long.valueOf(b()), "version");
        qg7Var.e(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return qg7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = jol.b(parcel);
        jol.o(parcel, 1, this.a);
        jol.k(parcel, 2, this.b);
        jol.m(parcel, 3, b());
        jol.g(parcel, this.d);
        jol.c(iB, parcel);
    }

    public do6(String str, long j) {
        this(-1, j, str, false);
    }
}
