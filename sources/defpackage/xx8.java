package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class xx8 extends z3 {
    public static final Parcelable.Creator<xx8> CREATOR = new pkk(13);
    public final long a;
    public final int b;
    public final boolean c;
    public final s1l d;

    public xx8(long j, int i, boolean z, s1l s1lVar) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = s1lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xx8)) {
            return false;
        }
        xx8 xx8Var = (xx8) obj;
        return this.a == xx8Var.a && this.b == xx8Var.b && this.c == xx8Var.c && f55.h(this.d, xx8Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder sbC = nbh.C("LastLocationRequest[");
        long j = this.a;
        if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
            sbC.append("maxAge=");
            int i = q3l.a;
            if (j == 0) {
                sbC.append("0s");
            } else {
                sbC.ensureCapacity(sbC.length() + 27);
                boolean z = false;
                if (j < 0) {
                    sbC.append("-");
                    if (j != Long.MIN_VALUE) {
                        j = -j;
                    } else {
                        j = Long.MAX_VALUE;
                        z = true;
                    }
                }
                if (j >= 86400000) {
                    sbC.append(j / 86400000);
                    sbC.append("d");
                    j %= 86400000;
                }
                if (true == z) {
                    j = 25975808;
                }
                if (j >= 3600000) {
                    sbC.append(j / 3600000);
                    sbC.append("h");
                    j %= 3600000;
                }
                if (j >= 60000) {
                    sbC.append(j / 60000);
                    sbC.append("m");
                    j %= 60000;
                }
                if (j >= 1000) {
                    sbC.append(j / 1000);
                    sbC.append("s");
                    j %= 1000;
                }
                if (j > 0) {
                    sbC.append(j);
                    sbC.append("ms");
                }
            }
        }
        int i2 = this.b;
        if (i2 != 0) {
            sbC.append(", ");
            if (i2 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i2 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i2 != 2) {
                    ore.a();
                    return null;
                }
                str = "GRANULARITY_FINE";
            }
            sbC.append(str);
        }
        if (this.c) {
            sbC.append(", bypass");
        }
        s1l s1lVar = this.d;
        if (s1lVar != null) {
            sbC.append(", impersonation=");
            sbC.append(s1lVar);
        }
        sbC.append(']');
        return sbC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        jol.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        jol.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jol.n(parcel, 5, this.d, i);
        jol.u(iT, parcel);
    }
}
