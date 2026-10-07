package defpackage;

import android.app.Notification;
import android.app.Service;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j2m {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void c(Service service, Notification notification) {
        try {
            service.startForeground(1001, notification, 2);
        } catch (RuntimeException e) {
            lvb.k0("Util", "The service must be declared with a foregroundServiceType that includes mediaPlayback");
            throw e;
        }
    }
}
