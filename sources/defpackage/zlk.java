package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class zlk extends qkk implements IInterface {
    public final /* synthetic */ int d;
    public final /* synthetic */ qjh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlk(qjh qjhVar, int i) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 0);
        this.d = i;
        this.e = qjhVar;
    }

    @Override // defpackage.qkk
    public final boolean k0(int i, Parcel parcel, Parcel parcel2) {
        qjh qjhVar = this.e;
        int i2 = this.d;
        if (i == 1) {
            Status status = (Status) ykk.a(parcel, Status.CREATOR);
            a1b a1bVar = (a1b) ykk.a(parcel, a1b.CREATOR);
            ykk.b(parcel);
            switch (i2) {
                case 0:
                    ewl.b(status, a1bVar, qjhVar);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 2) {
            Status status2 = (Status) ykk.a(parcel, Status.CREATOR);
            c1b c1bVar = (c1b) ykk.a(parcel, c1b.CREATOR);
            ykk.b(parcel);
            switch (i2) {
                case 1:
                    ewl.b(status2, c1bVar, qjhVar);
                    return true;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        if (i == 3) {
            ykk.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 4) {
            return false;
        }
        ykk.b(parcel);
        throw new UnsupportedOperationException();
    }
}
