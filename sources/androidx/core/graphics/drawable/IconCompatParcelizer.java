package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ore;
import defpackage.wsi;
import defpackage.xsi;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(wsi wsiVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = wsiVar.f(-1, 1);
        byte[] bArr = iconCompat.c;
        if (wsiVar.e(2)) {
            Parcel parcel = ((xsi) wsiVar).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = wsiVar.g(iconCompat.d, 3);
        iconCompat.e = wsiVar.f(iconCompat.e, 4);
        iconCompat.f = wsiVar.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) wsiVar.g(iconCompat.g, 6);
        String string = iconCompat.i;
        if (wsiVar.e(7)) {
            string = ((xsi) wsiVar).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (wsiVar.e(8)) {
            string2 = ((xsi) wsiVar).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                ore.p("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName(HTTP.UTF_16));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, wsi wsiVar) {
        wsiVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName(HTTP.UTF_16));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName(HTTP.UTF_16));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            wsiVar.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            wsiVar.i(2);
            Parcel parcel = ((xsi) wsiVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            wsiVar.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            wsiVar.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            wsiVar.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            wsiVar.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            wsiVar.i(7);
            ((xsi) wsiVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            wsiVar.i(8);
            ((xsi) wsiVar).e.writeString(str2);
        }
    }
}
