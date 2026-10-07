package defpackage;

import com.google.android.gms.maps.model.LatLng;
import one.me.location.map.show.ShowLocationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p2g implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShowLocationScreen b;

    public /* synthetic */ p2g(ShowLocationScreen showLocationScreen, int i) {
        this.a = i;
        this.b = showLocationScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ShowLocationScreen showLocationScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ShowLocationScreen.v;
                return new svj(showLocationScreen, 1);
            default:
                z2g z2gVar = (z2g) showLocationScreen.k.getAccessor().c(762);
                vv vvVar = showLocationScreen.b;
                zv8[] zv8VarArr2 = ShowLocationScreen.v;
                zv8 zv8Var = zv8VarArr2[0];
                double dDoubleValue = ((Number) vvVar.a(showLocationScreen)).doubleValue();
                vv vvVar2 = showLocationScreen.c;
                zv8 zv8Var2 = zv8VarArr2[1];
                LatLng latLng = new LatLng(dDoubleValue, ((Number) vvVar2.a(showLocationScreen)).doubleValue());
                vv vvVar3 = showLocationScreen.d;
                zv8 zv8Var3 = zv8VarArr2[2];
                float fFloatValue = ((Number) vvVar3.a(showLocationScreen)).floatValue();
                vv vvVar4 = showLocationScreen.e;
                zv8 zv8Var4 = zv8VarArr2[3];
                Long l = (Long) vvVar4.a(showLocationScreen);
                vv vvVar5 = showLocationScreen.f;
                zv8 zv8Var5 = zv8VarArr2[4];
                Long l2 = (Long) vvVar5.a(showLocationScreen);
                vv vvVar6 = showLocationScreen.g;
                zv8 zv8Var6 = zv8VarArr2[5];
                return new y2g(latLng, fFloatValue, l, l2, (Long) vvVar6.a(showLocationScreen), z2gVar.a, z2gVar.b, z2gVar.c, z2gVar.d, z2gVar.e, z2gVar.f, z2gVar.g, z2gVar.h, z2gVar.i, z2gVar.j);
        }
    }
}
