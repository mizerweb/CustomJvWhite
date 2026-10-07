package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class le4 extends z3 {
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String d;
    public final Integer e;
    public static final le4 f = new le4(0, null, null);
    public static final Parcelable.Creator<le4> CREATOR = new eu1(8);

    public le4(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
        this.e = num;
    }

    public static String b(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return qv1.o(new StringBuilder(String.valueOf(i).length() + 20), "UNKNOWN_ERROR_CODE(", i, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof le4)) {
            return false;
        }
        le4 le4Var = (le4) obj;
        return this.b == le4Var.b && f55.h(this.c, le4Var.c) && f55.h(this.d, le4Var.d) && f55.h(this.e, le4Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    public final String toString() {
        qg7 qg7Var = new qg7(this);
        qg7Var.e(b(this.b), "statusCode");
        qg7Var.e(this.c, "resolution");
        qg7Var.e(this.d, "message");
        qg7Var.e(this.e, "clientMethodKey");
        return qg7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iB = jol.b(parcel);
        jol.k(parcel, 1, this.a);
        jol.k(parcel, 2, this.b);
        jol.n(parcel, 3, this.c, i);
        jol.o(parcel, 4, this.d);
        jol.l(parcel, 5, this.e);
        jol.c(iB, parcel);
    }

    public le4(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
