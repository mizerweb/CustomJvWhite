package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class p8c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ p8c(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return q8c.b;
            case 1:
                return new r8c(parcel.readLong());
            case 2:
                parcel.readInt();
                return s8c.b;
            case 3:
                parcel.readInt();
                return t8c.b;
            case 4:
                return new v8c(parcel.readInt(), parcel.readInt());
            case 5:
                return new w8c(parcel.readInt());
            case 6:
                parcel.readInt();
                return x8c.a;
            case 7:
                return new y8c(parcel.readInt());
            case 8:
                parcel.readInt();
                return z8c.a;
            case 9:
                parcel.readInt();
                return b9c.a;
            case 10:
                parcel.readInt();
                return c9c.a;
            case 11:
                parcel.readInt();
                return d9c.a;
            case 12:
                return new e9c((ynh) parcel.readParcelable(e9c.class.getClassLoader()));
            case 13:
                return new pkc(parcel.readLong(), czg.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                return new eqc(parcel.readString(), parcel.createStringArray(), parcel.readInt());
            case 16:
                return new isc(parcel.readInt(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readLong());
            case 17:
                return new jsc(parcel.readInt());
            case 18:
                return new ksc(parcel.readInt());
            case 19:
                return new rvc((Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (vx4) parcel.readParcelable(vx4.class.getClassLoader()), (y26) parcel.readParcelable(y26.class.getClassLoader()), (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                boolean z = true;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new tvc(z2, z, z, z, z, z, z, parcel.readInt() != 0);
            case 21:
                return new x2d(parcel);
            case 22:
                return new w2d(parcel);
            case 23:
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
                }
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(udb.CREATOR.createFromParcel(parcel));
                }
                return new fgd(linkedHashMap, arrayList, parcel.readInt() == 0 ? null : udb.CREATOR.createFromParcel(parcel));
            case 24:
                return kmd.valueOf(parcel.readString());
            case 25:
                return zmd.valueOf(parcel.readString());
            case 26:
                return mnd.valueOf(parcel.readString());
            case 27:
                return nnd.valueOf(parcel.readString());
            case 28:
                return new vyd(parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readLong(), parcel.readString(), parcel.readLong(), e83.CREATOR.createFromParcel(parcel), parcel.readString());
            default:
                return k0e.valueOf(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new q8c[i];
            case 1:
                return new r8c[i];
            case 2:
                return new s8c[i];
            case 3:
                return new t8c[i];
            case 4:
                return new v8c[i];
            case 5:
                return new w8c[i];
            case 6:
                return new x8c[i];
            case 7:
                return new y8c[i];
            case 8:
                return new z8c[i];
            case 9:
                return new b9c[i];
            case 10:
                return new c9c[i];
            case 11:
                return new d9c[i];
            case 12:
                return new e9c[i];
            case 13:
                return new pkc[i];
            case 14:
                return new ParcelImpl[i];
            case 15:
                return new eqc[i];
            case 16:
                return new isc[i];
            case 17:
                return new jsc[i];
            case 18:
                return new ksc[i];
            case 19:
                return new rvc[i];
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new tvc[i];
            case 21:
                return new x2d[i];
            case 22:
                return new w2d[i];
            case 23:
                return new fgd[i];
            case 24:
                return new kmd[i];
            case 25:
                return new zmd[i];
            case 26:
                return new mnd[i];
            case 27:
                return new nnd[i];
            case 28:
                return new vyd[i];
            default:
                return new k0e[i];
        }
    }
}
