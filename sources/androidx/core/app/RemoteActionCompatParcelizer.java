package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.wsi;
import defpackage.xsi;
import defpackage.ysi;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(wsi wsiVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        ysi ysiVarH = remoteActionCompat.a;
        boolean z = true;
        if (wsiVar.e(1)) {
            ysiVarH = wsiVar.h();
        }
        remoteActionCompat.a = (IconCompat) ysiVarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (wsiVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((xsi) wsiVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (wsiVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((xsi) wsiVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) wsiVar.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (wsiVar.e(5)) {
            z2 = ((xsi) wsiVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!wsiVar.e(6)) {
            z = z3;
        } else if (((xsi) wsiVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, wsi wsiVar) {
        wsiVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        wsiVar.i(1);
        wsiVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        wsiVar.i(2);
        Parcel parcel = ((xsi) wsiVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        wsiVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        wsiVar.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        wsiVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        wsiVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
