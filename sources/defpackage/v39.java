package defpackage;

import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class v39 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ v39(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new w39((Uri) parcel.readParcelable(w39.class.getClassLoader()));
            case 1:
                return new x39(parcel.readString());
            case 2:
                return new y39(parcel.readString());
            case 3:
                parcel.readInt();
                return z39.a;
            case 4:
                return new a49(parcel.readLong(), parcel.readString());
            case 5:
                parcel.readInt();
                return b49.a;
            case 6:
                Long lValueOf = null;
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new c49(j, j2, z, lValueOf, parcel.readInt() != 0, parcel.readString());
            case 7:
                return new d49((q24) parcel.readParcelable(d49.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readString());
            case 8:
                return new e49(parcel.readLong(), parcel.readString());
            case 9:
                return new f49(parcel.readLong(), parcel.readString(), parcel.readString());
            case 10:
                parcel.readInt();
                return g49.a;
            case 11:
                return new h49(parcel.readString());
            case 12:
                return new i49(parcel.readLong());
            case 13:
                parcel.readInt();
                return k49.a;
            case 14:
                return new u69(parcel);
            case 15:
                return new hb9(parcel);
            case 16:
                long j3 = parcel.readLong();
                Uri uri = (Uri) parcel.readParcelable(kb9.class.getClassLoader());
                String string = parcel.readString();
                int i = parcel.readInt();
                Long lValueOf2 = null;
                long j4 = parcel.readLong();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    lValueOf2 = Long.valueOf(parcel.readLong());
                }
                return new kb9(j3, uri, string, i, j4, numValueOf, lValueOf2, parcel.readInt(), parcel.readInt(), parcel.readLong(), (Uri) parcel.readParcelable(kb9.class.getClassLoader()));
            case 17:
                eo9 eo9Var = new eo9(parcel);
                eo9Var.a = ((Integer) parcel.readValue(eo9.class.getClassLoader())).intValue();
                return eo9Var;
            case 18:
                return new js9(parcel);
            case 19:
                return uv9.a((MediaDescription) MediaDescription.CREATOR.createFromParcel(parcel));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new d0a(parcel);
            case 21:
                return new t2a(parcel);
            case 22:
                MediaSession.Token token = (MediaSession.Token) parcel.readParcelable(null);
                token.getClass();
                return new u2a(token, null);
            case 23:
                return new e8a(parcel.readInt(), (ynh) parcel.readParcelable(e8a.class.getClassLoader()), osf.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (msf) parcel.readParcelable(e8a.class.getClassLoader()));
            case 24:
                return new c9a(parcel.readLong(), p63.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 25:
                ccb ccbVar = new ccb(parcel);
                ccbVar.a = parcel.readInt();
                return ccbVar;
            case 26:
                long j5 = parcel.readLong();
                String string2 = parcel.readString();
                boolean z2 = false;
                int i2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new udb(i2, j5, string2, z2);
            case 27:
                return new n8c(parcel.readInt());
            case 28:
                return new o8c(n8c.CREATOR.createFromParcel(parcel).a, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            default:
                a9c a9cVar = (a9c) parcel.readParcelable(h9c.class.getClassLoader());
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new h9c(a9cVar, (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (f9c) parcel.readParcelable(h9c.class.getClassLoader()), o8c.CREATOR.createFromParcel(parcel), (u8c) parcel.readParcelable(h9c.class.getClassLoader()), g9c.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new w39[i];
            case 1:
                return new x39[i];
            case 2:
                return new y39[i];
            case 3:
                return new z39[i];
            case 4:
                return new a49[i];
            case 5:
                return new b49[i];
            case 6:
                return new c49[i];
            case 7:
                return new d49[i];
            case 8:
                return new e49[i];
            case 9:
                return new f49[i];
            case 10:
                return new g49[i];
            case 11:
                return new h49[i];
            case 12:
                return new i49[i];
            case 13:
                return new k49[i];
            case 14:
                return new u69[i];
            case 15:
                return new hb9[i];
            case 16:
                return new kb9[i];
            case 17:
                return new eo9[i];
            case 18:
                return new js9[i];
            case 19:
                return new uv9[i];
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new d0a[i];
            case 21:
                return new t2a[i];
            case 22:
                return new u2a[i];
            case 23:
                return new e8a[i];
            case 24:
                return new c9a[i];
            case 25:
                return new ccb[i];
            case 26:
                return new udb[i];
            case 27:
                return new n8c[i];
            case 28:
                return new o8c[i];
            default:
                return new h9c[i];
        }
    }
}
