package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.core.data.imageloader.ImageDownloader;
import com.vk.push.core.data.imageloader.ImageDownloaderImplKt;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.domain.repository.CallingAppRepository;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.network.PusherHostProvider;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.retry.RequestRetryComponent;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class gg5 extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public static final gg5 b = new gg5(0, 0);
    public static final gg5 c = new gg5(0, 1);
    public static final gg5 d = new gg5(0, 2);
    public static final gg5 e = new gg5(0, 3);
    public static final gg5 f = new gg5(0, 4);
    public static final gg5 g = new gg5(0, 5);
    public static final gg5 h = new gg5(0, 6);
    public static final gg5 i = new gg5(0, 7);
    public static final gg5 j = new gg5(0, 8);
    public static final gg5 k = new gg5(0, 9);
    public static final gg5 l = new gg5(0, 10);
    public static final gg5 m = new gg5(0, 11);
    public static final gg5 n = new gg5(0, 12);
    public static final gg5 o = new gg5(0, 13);
    public static final gg5 p = new gg5(0, 14);
    public static final gg5 q = new gg5(0, 15);
    public static final gg5 r = new gg5(0, 16);
    public static final gg5 s = new gg5(0, 17);
    public static final gg5 t = new gg5(0, 18);
    public static final gg5 u = new gg5(0, 19);
    public static final gg5 v = new gg5(0, 20);
    public static final gg5 w = new gg5(0, 21);
    public static final gg5 x = new gg5(0, 22);
    public static final gg5 y = new gg5(0, 23);
    public static final gg5 z = new gg5(0, 24);
    public static final gg5 A = new gg5(0, 25);
    public static final gg5 B = new gg5(0, 26);
    public static final gg5 C = new gg5(0, 27);
    public static final gg5 D = new gg5(0, 28);
    public static final gg5 E = new gg5(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gg5(int i2, int i3) {
        super(i2);
        this.a = i3;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                cy5 cy5Var = np4.k;
                if (cy5Var != null) {
                    return new c54(cy5Var);
                }
                return null;
            case 1:
                Logger logger = xik.a;
                return new w9k(qgk.c(), (PackagesRepository) qgk.h.getValue(), qgk.b());
            case 2:
                gik gikVar = dul.o;
                return (gikVar != null ? gikVar.c : new DefaultLogger("VkpnsClientSdk")).createLogger("DeleteTokenWorker");
            case 3:
                swh swhVar = swh.a;
                Object obj = swh.c().get(ch3.b);
                in5 in5Var = obj instanceof in5 ? (in5) obj : null;
                return in5Var == null ? new in5(new dv4()) : in5Var;
            case 4:
                return new yn5();
            case 5:
                return new ThreadPoolExecutor(3, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
            case 6:
                return qgk.b();
            case 7:
                return (l4k) qgk.f.getValue();
            case 8:
                gik gikVar2 = dul.o;
                return (gikVar2 != null ? gikVar2.c : new DefaultLogger("VkpnsClientSdk")).createLogger("VkpnsMessagingService");
            case 9:
                Logger logger2 = qfk.a;
                l4k l4kVar = (l4k) qgk.f.getValue();
                PackagesRepository packagesRepository = (PackagesRepository) qgk.h.getValue();
                Logger logger3 = xik.a;
                euc eucVar = new euc(new GetCallingAppInfoUseCase((CallingAppRepository) qgk.q.getValue()), packagesRepository, (n7k) qgk.e.getValue(), 21);
                dul dulVar = dul.n;
                Context applicationContext = dul.w().a.getApplicationContext();
                gik gikVar3 = dul.o;
                if (gikVar3 != null) {
                    zfh zfhVar = new zfh(gikVar3.a.getApplicationContext());
                    umb umbVar = (umb) qgk.g.getValue();
                    gik gikVar4 = dul.o;
                    if (gikVar4 != null) {
                        phf phfVar = new phf(gikVar4.a.getApplicationContext(), 13);
                        ImageDownloader ImageDownloader = ImageDownloaderImplKt.ImageDownloader(dulVar);
                        js8 js8Var = new js8();
                        js8Var.a = applicationContext;
                        js8Var.b = zfhVar;
                        js8Var.c = umbVar;
                        js8Var.d = phfVar;
                        js8Var.e = ImageDownloader;
                        js8Var.f = logger2.createLogger("NotificationController");
                        return new hgk(l4kVar, eucVar, js8Var, (g7k) qgk.c.getValue(), qgk.b(), (CrashReporterRepository) qgk.u.getValue(), logger2);
                    }
                    ore.k("ConfigModule.init() must be called before accessing its members");
                } else {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                }
                return null;
            case 10:
                return (g7k) qgk.c.getValue();
            case 11:
                return Executors.newFixedThreadPool(1);
            case 12:
                return new Handler(Looper.getMainLooper());
            case 13:
                xde xdeVarC = qgk.c();
                Logger logger4 = xik.a;
                Logger logger5 = t9k.a;
                ewe eweVar = new ewe(xdeVarC, logger5);
                rai raiVar = new rai((idk) qgk.k.getValue());
                eth ethVar = new eth(new zfh(new p25(1, null, 6)));
                pfk pfkVar = (pfk) qgk.r.getValue();
                Logger logger6 = xik.a;
                return new y3k(new p25(1, null, 2), xdeVarC, eweVar, raiVar, new xde(ethVar, new p9k(logger6, RequestRetryComponent.INSTANCE.createDefaultBackOffForRequest()), pfkVar, logger6), new xtj((l4k) qgk.f.getValue(), (g7k) qgk.c.getValue(), logger6), qgk.b(), (AnalyticsTimingsStore) qgk.o.getValue(), (n7k) qgk.e.getValue(), logger5);
            case 14:
                gik gikVar5 = dul.o;
                return (gikVar5 != null ? gikVar5.c : new DefaultLogger("VkpnsClientSdk")).createLogger("DeletePushTokenIfNoHostsUseCase");
            case 15:
                return sbi.a;
            case 16:
                return qgk.b();
            case 17:
                return (n7k) qgk.e.getValue();
            case 18:
                return (l4k) qgk.f.getValue();
            case 19:
                Logger logger7 = xik.a;
                return new x9k((k4k) qgk.v.getValue(), (PackagesRepository) qgk.h.getValue(), qgk.b());
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return xik.a();
            case 21:
                Logger logger8 = qfk.a;
                Logger logger9 = xik.a;
                return new v9k(new w9k(qgk.c(), (PackagesRepository) qgk.h.getValue(), qgk.b()), qgk.c(), (FeatureManager) qgk.t.getValue(), qfk.a);
            case 22:
                return (nhk) qgk.l.getValue();
            case 23:
                return (y3k) t9k.b.getValue();
            case 24:
                BaseHttpHeadersHolder baseHttpHeadersHolder = (BaseHttpHeadersHolder) fgk.a.getValue();
                gik gikVar6 = dul.o;
                return new HttpClient(0, 0, baseHttpHeadersHolder, null, null, gikVar6 != null ? gikVar6.c : new DefaultLogger("VkpnsClientSdk"), 27, null);
            case 25:
                gik gikVar7 = dul.o;
                if (gikVar7 != null) {
                    return new BaseHttpHeadersHolder("client_sdk/7.2.0", gikVar7.a.getApplicationContext().getPackageName(), null, 4, null);
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 26:
                gik gikVar8 = dul.o;
                if (gikVar8 == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                BaseHttpHeadersHolder baseHttpHeadersHolder2 = new BaseHttpHeadersHolder("client_sdk/7.2.0", gikVar8.a.getApplicationContext().getPackageName(), BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
                gik gikVar9 = dul.o;
                return new HttpClient(0, 0, baseHttpHeadersHolder2, null, null, gikVar9 != null ? gikVar9.c : new DefaultLogger("VkpnsClientSdk"), 27, null);
            case 27:
                gik gikVar10 = dul.o;
                if (gikVar10 != null) {
                    return new d4k(y0k.c.g(gikVar10.a.getApplicationContext()).b, (q9k) qgk.n.getValue(), (AnalyticsTimingsStore) qgk.o.getValue(), (FeatureManager) qgk.t.getValue(), qgk.a);
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 28:
                Logger logger10 = qgk.a;
                gik gikVar11 = dul.o;
                if (gikVar11 != null) {
                    return new g4k(new c4h(5, gikVar11.a));
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            default:
                Logger logger11 = qgk.a;
                gik gikVar12 = dul.o;
                if (gikVar12 == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                PackageManagerDataSource packageManagerDataSource = new PackageManagerDataSource(gikVar12.a.getApplicationContext().getPackageManager());
                xr8 xr8Var = new xr8();
                xek xekVar = xek.a;
                gik gikVar13 = dul.o;
                if (gikVar13 != null) {
                    Context applicationContext2 = gikVar13.a.getApplicationContext();
                    xekVar.getClass();
                    j8e j8eVar = xek.i;
                    zv8[] zv8VarArr = xek.b;
                    FileDataStore fileDataStore = (FileDataStore) j8eVar.m(applicationContext2, zv8VarArr[6]);
                    gik gikVar14 = dul.o;
                    if (gikVar14 != null) {
                        r9k r9kVar = new r9k(fileDataStore, (FileDataStore) xek.j.m(gikVar14.a.getApplicationContext(), zv8VarArr[7]));
                        HttpClient httpClient = (HttpClient) fgk.b.getValue();
                        gik gikVar15 = dul.o;
                        if (gikVar15 == null) {
                            ore.k("ConfigModule.init() must be called before accessing its members");
                            return null;
                        }
                        HostInfoProvider pusherHostProvider = gikVar15.d;
                        if (pusherHostProvider == null) {
                            pusherHostProvider = new PusherHostProvider();
                        }
                        MasterHostApi masterHostApi = new MasterHostApi(httpClient, pusherHostProvider, null, 4, null);
                        gik gikVar16 = dul.o;
                        if (gikVar16 == null) {
                            ore.k("ConfigModule.init() must be called before accessing its members");
                            return null;
                        }
                        Context applicationContext3 = gikVar16.a.getApplicationContext();
                        Logger logger12 = qgk.a;
                        return new n7k(packageManagerDataSource, xr8Var, r9kVar, masterHostApi, new g9i(new phf(applicationContext3, logger12, false, 12)), new p25(1, null, 3), qgk.b(), logger12);
                    }
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
        }
    }
}
