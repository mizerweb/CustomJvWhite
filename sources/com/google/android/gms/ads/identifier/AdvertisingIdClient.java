package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import defpackage.go7;
import defpackage.n5l;
import defpackage.oz0;
import defpackage.r1l;
import defpackage.ue4;
import defpackage.wxk;
import defpackage.yab;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;
    oz0 zza;
    n5l zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzi;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        this.zzd = new Object();
        yab.s(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    public static Info getAdvertisingIdInfo(Context context) throws Throwable {
        Context context2;
        AdvertisingIdClient advertisingIdClient;
        zzd zzdVar;
        Throwable th;
        AdvertisingIdClient advertisingIdClient2 = zzh;
        if (advertisingIdClient2 == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient2 = zzh;
                    if (advertisingIdClient2 == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        context2 = context;
                        advertisingIdClient2 = new AdvertisingIdClient(context2);
                        zzh = advertisingIdClient2;
                    } else {
                        context2 = context;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            context2 = context;
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        zzd zzdVarZza = zzd.zza(context2);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = -1;
        try {
            Info infoZzf = advertisingIdClient2.zzf(-1);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            advertisingIdClient = advertisingIdClient2;
            try {
                advertisingIdClient.zze(infoZzf, true, 0.0f, jElapsedRealtime2, "", null);
                try {
                    try {
                        zzdVarZza.zzc(35401, 0, jElapsedRealtime, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
                        zzdVar = zzdVarZza;
                        jElapsedRealtime = jElapsedRealtime;
                        try {
                            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + jElapsedRealtime2 + "ms");
                            return infoZzf;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            advertisingIdClient.zze(null, true, 0.0f, -1L, "", th);
                            if (th instanceof IOException) {
                                i = 1;
                            } else if (th instanceof GooglePlayServicesNotAvailableException) {
                                i = 9;
                            } else if (th instanceof GooglePlayServicesRepairableException) {
                                i = 16;
                            } else if (th instanceof IllegalStateException) {
                                i = 8;
                            }
                            long j = jElapsedRealtime;
                            zzdVar.zzc(35401, i, j, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - j));
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        zzdVar = zzdVarZza;
                        jElapsedRealtime = jElapsedRealtime;
                        th = th;
                        advertisingIdClient.zze(null, true, 0.0f, -1L, "", th);
                        if (th instanceof IOException) {
                            i = 1;
                        } else if (th instanceof GooglePlayServicesNotAvailableException) {
                            i = 9;
                        } else if (th instanceof GooglePlayServicesRepairableException) {
                            i = 16;
                        } else if (th instanceof IllegalStateException) {
                            i = 8;
                        }
                        long j2 = jElapsedRealtime;
                        zzdVar.zzc(35401, i, j2, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - j2));
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    zzdVar = zzdVarZza;
                }
            } catch (Throwable th6) {
                th = th6;
                zzdVar = zzdVarZza;
                th = th;
                advertisingIdClient.zze(null, true, 0.0f, -1L, "", th);
                if (th instanceof IOException) {
                    i = 1;
                } else if (th instanceof GooglePlayServicesNotAvailableException) {
                    i = 9;
                } else if (th instanceof GooglePlayServicesRepairableException) {
                    i = 16;
                } else if (th instanceof IllegalStateException) {
                    i = 8;
                }
                long j3 = jElapsedRealtime;
                zzdVar.zzc(35401, i, j3, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - j3));
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            advertisingIdClient = advertisingIdClient2;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean zK0;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            yab.r("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                yab.s(advertisingIdClient.zza);
                yab.s(advertisingIdClient.zzb);
                try {
                    zK0 = ((wxk) advertisingIdClient.zzb).k0();
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception", e);
                }
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return zK0;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzf(int i) throws IOException {
        Info info;
        yab.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            yab.s(this.zza);
            yab.s(this.zzb);
            try {
                info = new Info(((wxk) this.zzb).V(), ((wxk) this.zzb).l0());
            } catch (RemoteException e) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                throw new IOException("Remote exception", e);
            }
        }
        zzb();
        return info;
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzc(true);
    }

    public final void zza() {
        yab.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        ue4.a().b(this.zzi, this.zza);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    public final void zzc(boolean z) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        yab.r("Calling this from your main thread can lead to deadlock");
        if (z) {
            zzb();
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = go7.b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    oz0 oz0Var = new oz0();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ue4.a().c(context, context.getClass().getName(), intent, oz0Var, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = oz0Var;
                        try {
                            this.zzb = r1l.G(oz0Var.a());
                            this.zzc = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    zzc(false);
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean zze(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new zza(this, map).start();
        return true;
    }

    public AdvertisingIdClient(Context context) {
        this(context, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, false, false);
    }
}
