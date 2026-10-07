package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iol {
    public static Bundle a(int i, Parcel parcel) {
        int iR = r(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iR);
        return bundle;
    }

    public static byte[] b(int i, Parcel parcel) {
        int iR = r(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iR);
        return bArrCreateByteArray;
    }

    public static Parcelable c(Parcel parcel, int i, Parcelable.Creator creator) {
        int iR = r(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iR);
        return parcelable;
    }

    public static String d(int i, Parcel parcel) {
        int iR = r(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iR);
        return string;
    }

    public static String[] e(int i, Parcel parcel) {
        int iR = r(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iR);
        return strArrCreateStringArray;
    }

    public static Object[] f(Parcel parcel, int i, Parcelable.Creator creator) {
        int iR = r(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iR);
        return objArrCreateTypedArray;
    }

    public static ArrayList g(Parcel parcel, int i, Parcelable.Creator creator) {
        int iR = r(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iR);
        return arrayListCreateTypedArrayList;
    }

    public static void h(int i, Parcel parcel) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(zo5.v(new StringBuilder(String.valueOf(i).length() + 26), "Overread allowed size end=", i), parcel);
        }
    }

    public static int i(int i) {
        return (char) i;
    }

    public static boolean j(int i, Parcel parcel) {
        v(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static double k(int i, Parcel parcel) {
        v(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float l(int i, Parcel parcel) {
        v(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int m(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder n(int i, Parcel parcel) {
        int iR = r(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iR);
        return strongBinder;
    }

    public static int o(int i, Parcel parcel) {
        v(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer p(int i, Parcel parcel) {
        int iR = r(i, parcel);
        if (iR == 0) {
            return null;
        }
        if (iR == 4) {
            return Integer.valueOf(parcel.readInt());
        }
        String hexString = Integer.toHexString(iR);
        int length = String.valueOf(4).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iR).length() + 4 + 1);
        zo5.C(4, iR, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(qt4.q(sb, " (0x", hexString, ")"), parcel);
    }

    public static long q(int i, Parcel parcel) {
        v(parcel, i, 8);
        return parcel.readLong();
    }

    public static int r(int i, Parcel parcel) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void s(Configuration configuration, mc9 mc9Var) {
        configuration.setLocales(mc9Var.a.a);
    }

    public static void t(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + r(i, parcel));
    }

    public static int u(Parcel parcel) {
        int i = parcel.readInt();
        int iR = r(i, parcel);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iR + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static void v(Parcel parcel, int i, int i2) {
        int iR = r(i, parcel);
        if (iR == i2) {
            return;
        }
        String hexString = Integer.toHexString(iR);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iR).length() + 4 + 1);
        zo5.C(i2, iR, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(qt4.q(sb, " (0x", hexString, ")"), parcel);
    }
}
