package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import defpackage.do7;
import defpackage.le4;
import defpackage.mlh;
import defpackage.nlh;
import defpackage.olh;
import defpackage.oxa;
import defpackage.ttb;
import defpackage.wlk;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);
    private final nlh zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    private zzd(Context context, String str) {
        this.zzd = new wlk(context, wlk.k, new olh("ads_identifier:api"), do7.c);
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zza;
    }

    public static void zzb(zzd zzdVar, long j, Exception exc) {
        le4 le4Var;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof ApiException) && (le4Var = ((ApiException) exc).a.d) != null && le4Var.b == 24) {
            zzdVar.zze.set(j);
        }
    }

    public final synchronized void zzc(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.zze;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.zze.get() == -1 || jElapsedRealtime - this.zze.get() > zzc.toMillis()) {
            nlh nlhVar = this.zzd;
            if (nlhVar != null) {
                ((wlk) nlhVar).c(new mlh(0, Arrays.asList(new oxa(35401, i2, 0, j, j2, null, null, 0, i3)))).k(new ttb() { // from class: com.google.android.gms.ads.identifier.zzc
                    @Override // defpackage.ttb
                    public final void onFailure(Exception exc) {
                        zzd.zzb(this.zza, jElapsedRealtime, exc);
                    }
                });
            }
        }
    }
}
