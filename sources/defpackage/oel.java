package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oel {
    public static yll a;

    public static void a() {
        throw new jib("An operation is not implemented: ONEME-18754 Добавить поддержку кастомных тем");
    }

    public static rj5 b(Bitmap bitmap) {
        yab.t(bitmap, "image must not be null");
        try {
            yll yllVar = a;
            yab.t(yllVar, "IBitmapDescriptorFactory is not initialized");
            kfl kflVar = (kfl) yllVar;
            Parcel parcelL0 = kflVar.l0();
            duk.c(parcelL0, bitmap);
            Parcel parcelK0 = kflVar.k0(6, parcelL0);
            m38 m38VarN0 = dqb.n0(parcelK0.readStrongBinder());
            parcelK0.recycle();
            return new rj5(m38VarN0);
        } catch (RemoteException e) {
            f4a.d(e);
            return null;
        }
    }

    public static void c() {
        throw new jib("An operation is not implemented: ONEME-18754 Добавить поддержку кастомных тем");
    }
}
