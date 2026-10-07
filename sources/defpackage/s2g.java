package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import one.me.location.map.show.ShowLocationScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class s2g implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShowLocationScreen b;

    public /* synthetic */ s2g(ShowLocationScreen showLocationScreen, int i) {
        this.a = i;
        this.b = showLocationScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ShowLocationScreen showLocationScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ShowLocationScreen.v;
                y2g y2gVarP1 = showLocationScreen.p1();
                ic6 ic6Var = y2gVarP1.r;
                LatLng latLng = y2gVarP1.c;
                a8j.x(ic6Var, new l2g(latLng.a, latLng.b, Float.valueOf(y2gVarP1.d)));
                break;
            default:
                zv8[] zv8VarArr2 = ShowLocationScreen.v;
                y2g y2gVarP2 = showLocationScreen.p1();
                Context context = (Context) y2gVarP2.e.getValue();
                LatLng latLng2 = y2gVarP2.c;
                double d = latLng2.a;
                double d2 = latLng2.b;
                String str = sj8.a;
                List<lm5> listP0 = xw3.P0(new lm5(sj8.l(context, Uri.parse("yandexmaps://maps.yandex.ru/?rtext=~" + d + "," + d2)), "yandex_maps", "ru.yandex.yandexmaps", 8), new lm5(sj8.l(context, Uri.parse("yandexnavi://build_route_on_map/?lat_to=" + d + "&lon_to=" + d2)), "yandex_navigator", "ru.yandex.yandexnavi", 8), new lm5(Uri.parse("dgis://2gis.ru/routeSearch/rsType/ctx/to/" + d2 + "," + d), "2gis", null, 12), new lm5(Uri.parse("https://www.google.com/maps/dir/?api=1&destination=" + d + "," + d2), "google_maps", null, 12), new lm5(Uri.parse("petalmaps://route?daddr=" + d + "," + d2 + "&type=walk"), "huawei_maps", null, 12));
                ArrayList arrayList = new ArrayList();
                for (lm5 lm5Var : listP0) {
                    Intent intent = new Intent("android.intent.action.VIEW", lm5Var.a);
                    intent.setPackage(lm5Var.c);
                    km5 km5Var = intent.resolveActivity(context.getPackageManager()) != null ? new km5(intent, lm5Var.b) : null;
                    if (km5Var != null) {
                        arrayList.add(km5Var);
                    }
                }
                a8j.x(y2gVarP2.q, new o2g(arrayList));
                break;
        }
    }
}
