package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.vk.push.core.base.AidlException;

/* JADX INFO: loaded from: classes2.dex */
public final class csl extends qkk implements IInterface {
    public final /* synthetic */ int d;
    public final /* synthetic */ til e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csl(til tilVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 5);
        this.d = i;
        this.e = tilVar;
    }

    @Override // defpackage.qkk
    public final boolean m0(int i, Parcel parcel, Parcel parcel2) {
        til tilVar = this.e;
        int i2 = this.d;
        switch (i) {
            case 101:
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) o5l.a(parcel, Status.CREATOR);
                switch (i2) {
                    case 0:
                        tilVar.e(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case AidlException.HOST_IS_NOT_MASTER /* 103 */:
                Status status2 = (Status) o5l.a(parcel, Status.CREATOR);
                switch (i2) {
                    case 1:
                        tilVar.e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
