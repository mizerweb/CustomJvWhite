package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class rr extends sr {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ vr d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(vr vrVar, Context context) {
        super(vrVar);
        this.d = vrVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.sr
    public final void V() {
        int i = this.c;
        vr vrVar = this.d;
        switch (i) {
            case 0:
                vrVar.o(true, true);
                break;
            default:
                vrVar.o(true, true);
                break;
        }
    }

    public final int Z() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                return mr.a((PowerManager) obj) ? 2 : 1;
            default:
                r6a r6aVar = (r6a) obj;
                c8h c8hVar = (c8h) r6aVar.b;
                LocationManager locationManager = (LocationManager) r6aVar.a;
                if (c8hVar.b <= System.currentTimeMillis()) {
                    Context context = (Context) r6aVar.c;
                    Location lastKnownLocation2 = null;
                    if (np4.d(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (np4.d(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (kw0.e == null) {
                            kw0.e = new kw0();
                        }
                        kw0 kw0Var = kw0.e;
                        kw0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        kw0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = kw0Var.c == 1;
                        long j2 = kw0Var.b;
                        long j3 = kw0Var.a;
                        kw0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = kw0Var.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        c8hVar.a = z;
                        c8hVar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = c8hVar.a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // defpackage.sr
    public final IntentFilter u() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(vr vrVar, r6a r6aVar) {
        super(vrVar);
        this.d = vrVar;
        this.e = r6aVar;
    }
}
