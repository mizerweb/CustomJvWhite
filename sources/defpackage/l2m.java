package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l2m {
    public static Object a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static String b(Object obj) {
        return "'" + String.valueOf(obj) + "'";
    }

    public static boolean c(String str) {
        return str != null && str.trim().length() > 0;
    }
}
