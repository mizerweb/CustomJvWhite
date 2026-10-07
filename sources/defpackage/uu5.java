package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class uu5 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string;
        switch (this.a) {
            case 0:
                return new vu5(parcel);
            case 1:
                return new y26(parcel);
            case 2:
                if (parcel != null) {
                    String string2 = parcel.readString();
                    if (string2 != null && (string = parcel.readString()) != null) {
                        return new it6(string2, string, parcel.readBoolean());
                    }
                    ore.p("Required value was null.");
                }
                return null;
            case 3:
                db7 db7Var = new db7();
                db7Var.a = parcel.readString();
                db7Var.b = parcel.readInt();
                return db7Var;
            case 4:
                return new ib7(parcel);
            case 5:
                return new kb7(parcel);
            case 6:
                return new bh7(parcel.readString());
            case 7:
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ph7.class.getClassLoader()));
                }
                return new ph7(z, z2, z3, z4, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 8:
                return new ju7(parcel.readFloat());
            case 9:
                return new id8(parcel.readInt(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readLong());
            case 10:
                return new jd8(parcel.readInt());
            case 11:
                return new kd8(parcel.readInt());
            case 12:
                return new rj8(parcel);
            case 13:
                return new pk8(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ok8.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : m6i.CREATOR.createFromParcel(parcel));
            case 14:
                return new ok8(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
            case 15:
                return new jy8(parcel);
            case 16:
                x19 x19Var = new x19();
                x19Var.a = parcel.readInt();
                x19Var.b = parcel.readInt();
                x19Var.c = parcel.readInt() == 1;
                return x19Var;
            case 17:
                return new i39(parcel.readLong(), parcel.readString());
            case 18:
                parcel.readInt();
                return j39.a;
            case 19:
                parcel.readInt();
                return k39.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                parcel.readInt();
                return l39.a;
            case 21:
                parcel.readInt();
                return m39.a;
            case 22:
                parcel.readInt();
                return n39.a;
            case 23:
                parcel.readInt();
                return o39.a;
            case 24:
                parcel.readInt();
                return p39.a;
            case 25:
                parcel.readInt();
                return q39.a;
            case 26:
                parcel.readInt();
                return r39.a;
            case 27:
                return new s39(((v65) parcel.readParcelable(s39.class.getClassLoader())).a, parcel.readString());
            case 28:
                parcel.readInt();
                return t39.a;
            default:
                return new u39((Uri) parcel.readParcelable(u39.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vu5[i];
            case 1:
                return new y26[i];
            case 2:
                return new it6[i];
            case 3:
                return new db7[i];
            case 4:
                return new ib7[i];
            case 5:
                return new kb7[i];
            case 6:
                return new bh7[i];
            case 7:
                return new ph7[i];
            case 8:
                return new ju7[i];
            case 9:
                return new id8[i];
            case 10:
                return new jd8[i];
            case 11:
                return new kd8[i];
            case 12:
                return new rj8[i];
            case 13:
                return new pk8[i];
            case 14:
                return new ok8[i];
            case 15:
                return new jy8[i];
            case 16:
                return new x19[i];
            case 17:
                return new i39[i];
            case 18:
                return new j39[i];
            case 19:
                return new k39[i];
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new l39[i];
            case 21:
                return new m39[i];
            case 22:
                return new n39[i];
            case 23:
                return new o39[i];
            case 24:
                return new p39[i];
            case 25:
                return new q39[i];
            case 26:
                return new r39[i];
            case 27:
                return new s39[i];
            case 28:
                return new t39[i];
            default:
                return new u39[i];
        }
    }
}
