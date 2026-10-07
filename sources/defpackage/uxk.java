package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes4.dex */
public final class uxk extends qkk {
    public a d;
    public final int e;

    public uxk(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 3);
        this.d = aVar;
        this.e = i;
    }

    @Override // defpackage.qkk
    public final boolean l0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) buk.a(parcel, Bundle.CREATOR);
            buk.c(parcel);
            yab.t(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar = this.d;
            int i3 = this.e;
            aVar.getClass();
            m5l m5lVar = new m5l(aVar, i2, strongBinder, bundle);
            mqk mqkVar = aVar.e;
            mqkVar.sendMessage(mqkVar.obtainMessage(1, i3, -1, m5lVar));
            this.d = null;
        } else if (i == 2) {
            parcel.readInt();
            buk.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            qil qilVar = (qil) buk.a(parcel, qil.CREATOR);
            buk.c(parcel);
            a aVar2 = this.d;
            yab.t(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            yab.s(qilVar);
            aVar2.u = qilVar;
            if (aVar2.u()) {
                te4 te4Var = qilVar.d;
                due dueVarX = due.x();
                eue eueVar = te4Var == null ? null : te4Var.a;
                synchronized (dueVarX) {
                    try {
                        if (eueVar == null) {
                            eueVar = due.c;
                        } else {
                            eue eueVar2 = (eue) dueVarX.a;
                            if (eueVar2 == null || eueVar2.a < eueVar.a) {
                            }
                        }
                        dueVarX.a = eueVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = qilVar.a;
            yab.t(this.d, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.d;
            int i5 = this.e;
            aVar3.getClass();
            m5l m5lVar2 = new m5l(aVar3, i4, strongBinder2, bundle2);
            mqk mqkVar2 = aVar3.e;
            mqkVar2.sendMessage(mqkVar2.obtainMessage(1, i5, -1, m5lVar2));
            this.d = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
