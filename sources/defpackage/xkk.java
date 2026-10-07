package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class xkk implements plk {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ d0c b;

    public xkk(d0c d0cVar, Bundle bundle) {
        this.b = d0cVar;
        this.a = bundle;
    }

    @Override // defpackage.plk
    public final int a() {
        return 1;
    }

    @Override // defpackage.plk
    public final void b() {
        r6a r6aVar = (r6a) this.b.a;
        Bundle bundle = this.a;
        r6aVar.getClass();
        try {
            Bundle bundle2 = new Bundle();
            kuk.d(bundle, bundle2);
            bpl bplVar = (bpl) r6aVar.b;
            Parcel parcelL0 = bplVar.l0();
            duk.c(parcelL0, bundle2);
            bplVar.m0(2, parcelL0);
            kuk.d(bundle2, bundle);
            Parcel parcelK0 = bplVar.k0(8, bplVar.l0());
            m38 m38VarN0 = dqb.n0(parcelK0.readStrongBinder());
            parcelK0.recycle();
            r6aVar.c = (View) dqb.o0(m38VarN0);
            ViewGroup viewGroup = (ViewGroup) r6aVar.a;
            viewGroup.removeAllViews();
            viewGroup.addView((View) r6aVar.c);
        } catch (RemoteException e) {
            f4a.d(e);
        }
    }
}
