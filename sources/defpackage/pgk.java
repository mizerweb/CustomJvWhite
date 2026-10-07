package defpackage;

import android.content.Context;
import android.view.MenuItem;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.EmptyAnalyticsSender;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.analytics.AnalyticsTimingsStoreImpl;
import com.vk.push.core.data.repository.CallingAppRepositoryImplKt;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.CrashSenderRepositoryFactory;
import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.vk.push.core.data.repository.PackagesRepositoryImplKt;
import com.vk.push.core.data.source.CallingAppDataSource;
import com.vk.push.core.data.source.ContextDataSource;
import com.vk.push.core.data.source.DeviceInfoDataSource;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.deviceid.DeviceIdRepositoryProvider;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.filedatastore.FileDataSource;
import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.network.http.HttpClient;
import java.net.URI;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class pgk extends ux8 implements af7 {
    public static final pgk b;
    public static final pgk c;
    public static final pgk d;
    public static final pgk e;
    public static final pgk f;
    public static final pgk g;
    public static final pgk h;
    public static final pgk i;
    public static final pgk j;
    public static final pgk k;
    public static final pgk l;
    public static final pgk m;
    public static final pgk n;
    public static final pgk o;
    public static final pgk p;
    public static final pgk q;
    public static final pgk r;
    public static final pgk s;
    public static final pgk t;
    public static final pgk u;
    public static final pgk v;
    public static final pgk w;
    public final /* synthetic */ int a;

    static {
        int i2 = 0;
        b = new pgk(i2, 0);
        c = new pgk(i2, 1);
        d = new pgk(i2, 2);
        e = new pgk(i2, 3);
        f = new pgk(i2, 4);
        g = new pgk(i2, 5);
        h = new pgk(i2, 6);
        i = new pgk(i2, 7);
        j = new pgk(i2, 8);
        k = new pgk(i2, 9);
        l = new pgk(i2, 10);
        m = new pgk(i2, 11);
        n = new pgk(i2, 12);
        o = new pgk(i2, 13);
        p = new pgk(i2, 14);
        q = new pgk(i2, 15);
        r = new pgk(i2, 16);
        s = new pgk(i2, 17);
        t = new pgk(i2, 18);
        u = new pgk(i2, 19);
        v = new pgk(i2, 20);
        w = new pgk(i2, 21);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgk(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, MenuItem menuItem) {
        super(0);
        this.a = 22;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i2 = 1;
        int i3 = 4;
        lq4 lq4Var = null;
        switch (this.a) {
            case 0:
                Logger logger = qgk.a;
                gik gikVar = dul.o;
                if (gikVar == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                qd2 qd2Var = new qd2(gikVar.h, false);
                yki ykiVarA = qgk.a();
                gik gikVar2 = dul.o;
                if (gikVar2 != null) {
                    return new q9k(qd2Var, ykiVarA, new DeviceInfoDataSource(gikVar2.a.getApplicationContext()), (DeviceIdRepository) qgk.m.getValue(), (FeatureManager) qgk.t.getValue());
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 1:
                Logger logger2 = qgk.a;
                gik gikVar3 = dul.o;
                if (gikVar3 != null) {
                    return CallingAppRepositoryImplKt.CallingAppRepository(new CallingAppDataSource(gikVar3.a.getApplicationContext()));
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 2:
                return new idk(qgk.a());
            case 3:
                Logger logger3 = qgk.a;
                xek xekVar = xek.a;
                gik gikVar4 = dul.o;
                if (gikVar4 == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                Context applicationContext = gikVar4.a.getApplicationContext();
                xekVar.getClass();
                return new wek(new vog((FileDataStore) xek.c.m(applicationContext, xek.b[0])));
            case 4:
                Logger logger4 = qgk.a;
                gik gikVar5 = dul.o;
                if (gikVar5 == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                Context applicationContext2 = gikVar5.a.getApplicationContext();
                Logger logger5 = qgk.a;
                return new l4k(new ewe(applicationContext2, logger5), (g7k) qgk.c.getValue(), logger5);
            case 5:
                CrashSenderRepositoryFactory crashSenderRepositoryFactory = new CrashSenderRepositoryFactory();
                gik gikVar6 = dul.o;
                if (gikVar6 == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                return crashSenderRepositoryFactory.createCrashSenderRepository(gikVar6.a.getApplicationContext(), "ru.rustore.sdk.pushclient", (IssueKeyBlackListRepository) qgk.s.getValue(), qgk.a);
            case 6:
                DeviceIdRepositoryProvider deviceIdRepositoryProvider = DeviceIdRepositoryProvider.INSTANCE;
                gik gikVar7 = dul.o;
                if (gikVar7 != null) {
                    return deviceIdRepositoryProvider.initIfRequired(gikVar7.a.getApplicationContext(), qgk.a);
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 7:
                return new EmptyAnalyticsSender();
            case 8:
                FeatureManager featureManager = (FeatureManager) qgk.t.getValue();
                gik gikVar8 = dul.o;
                if (gikVar8 != null) {
                    return new k4k(featureManager, new FileDataSource(gikVar8.a.getApplicationContext(), "vkpns_client_external_apps_config", null, 4, null));
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 9:
                gik gikVar9 = dul.o;
                if (gikVar9 == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                return new FeatureManagerImpl(gikVar9.a.getApplicationContext(), (HttpClient) fgk.c.getValue(), (CrashReporterRepository) qgk.u.getValue(), (IssueKeyBlackListRepository) qgk.s.getValue(), (DeviceIdRepository) qgk.m.getValue(), qgk.a, null, null, 192, null);
            case 10:
                Logger logger6 = qgk.a;
                dul.w();
                return new pfk(new tgk(new euc(dul.w().a.getApplicationContext(), dul.w().b, logger6), new p25(i2, lq4Var, i3), new p25(i2, lq4Var, 5), logger6));
            case 11:
                gik gikVar10 = dul.o;
                if (gikVar10 != null) {
                    return new IssueKeyBlackListRepository(gikVar10.a.getApplicationContext(), null, 2, null);
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 12:
                Logger logger7 = qgk.a;
                xek xekVar2 = xek.a;
                gik gikVar11 = dul.o;
                if (gikVar11 == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                Context applicationContext3 = gikVar11.a.getApplicationContext();
                xekVar2.getClass();
                return new mgk(new nik((FileDataStore) xek.d.m(applicationContext3, xek.b[1])));
            case 13:
                gik gikVar12 = dul.o;
                if (gikVar12 != null) {
                    return new umb(gikVar12.a.getApplicationContext());
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 14:
                Logger logger8 = qgk.a;
                gik gikVar13 = dul.o;
                if (gikVar13 == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                PackageManagerDataSource packageManagerDataSource = new PackageManagerDataSource(gikVar13.a.getApplicationContext().getPackageManager());
                gik gikVar14 = dul.o;
                if (gikVar14 != null) {
                    return PackagesRepositoryImplKt.PackagesRepository(packageManagerDataSource, new ContextDataSource(gikVar14.a.getApplicationContext()));
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 15:
                xek xekVar3 = xek.a;
                gik gikVar15 = dul.o;
                if (gikVar15 != null) {
                    Context applicationContext4 = gikVar15.a.getApplicationContext();
                    xekVar3.getClass();
                    j8e j8eVar = xek.f;
                    zv8[] zv8VarArr = xek.b;
                    FileDataStore fileDataStore = (FileDataStore) j8eVar.m(applicationContext4, zv8VarArr[3]);
                    gik gikVar16 = dul.o;
                    if (gikVar16 != null) {
                        return new g7k(fileDataStore, (FileDataStore) xek.g.m(gikVar16.a.getApplicationContext(), zv8VarArr[4]));
                    }
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 16:
                Logger logger9 = qgk.a;
                gik gikVar17 = dul.o;
                if (gikVar17 != null) {
                    return new nhk(new qd2(gikVar17.h, false));
                }
                ore.k("ConfigModule.init() must be called before accessing its members");
                return null;
            case 17:
                Logger logger10 = qgk.a;
                ao5 ao5Var = ao5.a;
                lb5 lb5Var = lb5.c;
                o3j o3jVar = new o3j();
                o3jVar.a = logger10.createLogger(o3jVar);
                return o3jVar;
            case 18:
                return new AnalyticsTimingsStoreImpl();
            case 19:
                HttpClient httpClient = (HttpClient) fgk.b.getValue();
                gik gikVar18 = dul.o;
                if (gikVar18 == null) {
                    ore.k("ConfigModule.init() must be called before accessing its members");
                    return null;
                }
                Object ku8Var = gikVar18.e;
                if (ku8Var == null) {
                    ku8Var = new ku8();
                }
                ao5 ao5Var2 = ao5.a;
                lb5 lb5Var2 = lb5.c;
                kr6 kr6Var = new kr6();
                kr6Var.a = httpClient;
                kr6Var.b = ku8Var;
                kr6Var.c = lb5Var2;
                return new hik(kr6Var, (g7k) qgk.c.getValue(), qgk.a);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new yek((pfk) qgk.r.getValue());
            case 21:
                return new yek((pfk) qgk.r.getValue());
            case 22:
                return Boolean.FALSE;
            default:
                return new URI("https://stats.rustore.ru").resolve("/v1/send_custom_event_batch").toURL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pgk(int i2, int i3) {
        super(i2);
        this.a = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgk(ojk ojkVar) {
        super(0);
        this.a = 23;
    }
}
