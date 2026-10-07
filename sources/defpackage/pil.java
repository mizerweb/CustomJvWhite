package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pil extends qkk implements IInterface {
    public final int d;

    public pil(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 3);
        if (bArr.length == 25) {
            this.d = Arrays.hashCode(bArr);
        } else {
            ore.a();
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pil) {
            try {
                pil pilVar = (pil) obj;
                if (pilVar.d == this.d) {
                    return Arrays.equals(n0(), (byte[]) dqb.o0(new dqb(pilVar.n0())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    @Override // defpackage.qkk
    public final boolean l0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            dqb dqbVar = new dqb(n0());
            parcel2.writeNoException();
            buk.b(parcel2, dqbVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.d);
        return true;
    }

    public abstract byte[] n0();
}
