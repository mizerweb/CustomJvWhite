package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wjl {
    public static aqk a;

    public static final void a(f3 f3Var, v74 v74Var, String str) {
        v74Var.b().getClass();
        e9i.g0(1, null);
        hrk.b(str, ((uad) f3Var).a);
        throw null;
    }

    public static final void b(f3 f3Var, u76 u76Var, Object obj) {
        khb khbVarB = u76Var.b();
        rv8 rv8Var = ((uad) f3Var).a;
        khbVarB.getClass();
        if (((sr3) rv8Var).i(obj)) {
            e9i.g0(1, null);
        }
        sr3 sr3VarA = zfe.a(obj.getClass());
        String strH = sr3VarA.h();
        if (strH == null) {
            strH = String.valueOf(sr3VarA);
        }
        hrk.b(strH, rv8Var);
        throw null;
    }

    public static ex8 c(LatLng latLng) {
        try {
            aqk aqkVar = a;
            yab.t(aqkVar, "CameraUpdateFactory is not initialized");
            Parcel parcelL0 = aqkVar.l0();
            duk.c(parcelL0, latLng);
            Parcel parcelK0 = aqkVar.k0(8, parcelL0);
            m38 m38VarN0 = dqb.n0(parcelK0.readStrongBinder());
            parcelK0.recycle();
            return new ex8(m38VarN0);
        } catch (RemoteException e) {
            f4a.d(e);
            return null;
        }
    }

    public static ex8 d(LatLng latLng, float f) {
        try {
            aqk aqkVar = a;
            yab.t(aqkVar, "CameraUpdateFactory is not initialized");
            Parcel parcelL0 = aqkVar.l0();
            duk.c(parcelL0, latLng);
            parcelL0.writeFloat(f);
            Parcel parcelK0 = aqkVar.k0(9, parcelL0);
            m38 m38VarN0 = dqb.n0(parcelK0.readStrongBinder());
            parcelK0.recycle();
            return new ex8(m38VarN0);
        } catch (RemoteException e) {
            f4a.d(e);
            return null;
        }
    }
}
