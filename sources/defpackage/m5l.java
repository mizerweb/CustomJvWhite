package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes2.dex */
public final class m5l extends smk {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5l(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.smk
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            yab.s(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (!aVar.q().equals(interfaceDescriptor)) {
                String strQ = aVar.q();
                Log.w("GmsClient", nbh.y(new StringBuilder(strQ.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strQ, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceL = aVar.l(iBinder);
            if (iInterfaceL == null || !(aVar.v(2, 4, iInterfaceL) || aVar.v(3, 4, iInterfaceL))) {
                return false;
            }
            aVar.s = null;
            p3c p3cVar = aVar.n;
            if (p3cVar == null) {
                return true;
            }
            ((ho7) p3cVar.b).onConnected();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // defpackage.smk
    public final void b(le4 le4Var) {
        v56 v56Var = this.h.o;
        if (v56Var != null) {
            ((io7) v56Var.b).G(le4Var);
        }
        System.currentTimeMillis();
    }
}
