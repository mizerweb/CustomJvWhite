package defpackage;

import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImplKt;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class xek {
    public static final xek a;
    public static final /* synthetic */ zv8[] b;
    public static final j8e c;
    public static final j8e d;
    public static final eoc e;
    public static final j8e f;
    public static final j8e g;
    public static final eoc h;
    public static final j8e i;
    public static final j8e j;

    static {
        ewd ewdVar = new ewd(xek.class, "modeDataStore", "getModeDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;");
        zfe.a.getClass();
        b = new zv8[]{ewdVar, new ewd(xek.class, "notificationIdFileDataStore", "getNotificationIdFileDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new ewd(xek.class, "pushTokenPrefsDataStore", "getPushTokenPrefsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"), new ewd(xek.class, "pushTokenDataStore", "getPushTokenDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new ewd(xek.class, "pushTokenDeliveryDataStore", "getPushTokenDeliveryDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new ewd(xek.class, "arbiterDataStoreForMigration", "getArbiterDataStoreForMigration(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"), new ewd(xek.class, "arbiterDataStore", "getArbiterDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;"), new ewd(xek.class, "defaultMasterHostStore", "getDefaultMasterHostStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;")};
        a = new xek();
        ifh ifhVar = qgk.u;
        c = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_sdk_mode", agk.b, new PreferenceDataStoreMigration(null, "vkpns_client_sdk_mode", rl0.C, 1, null), (CrashReporterRepository) ifhVar.getValue(), false, false, null, 112, null);
        d = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_notification_id", kik.b, new PreferenceDataStoreMigration(null, "vkpns_notification_id", rl0.D, 1, null), (CrashReporterRepository) ifhVar.getValue(), false, false, null, 112, null);
        e = ikl.c("vkpns_client_sdk", new ex8(26, tek.e));
        f = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_token", i6k.b, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk", Collections.singletonList(new vdd("push_token")), rl0.E, tek.b), (CrashReporterRepository) ifhVar.getValue(), false, false, null, 112, null);
        g = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_token_delivery", q6k.c, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk", xw3.P0(new vdd("push_token_delivered_to_client_app"), new vdd("last_delivered_push_token")), tek.c, tek.d), (CrashReporterRepository) ifhVar.getValue(), false, false, null, 112, null);
        h = ikl.c("vkpns_client_sdk_arbiter", new ex8(26, rl0.z));
        i = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_sdk_arbiter", a9k.c, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk_arbiter", xw3.P0(new vdd("master_host_pub"), new vdd("master_host_package")), rl0.x, rl0.y), (CrashReporterRepository) ifhVar.getValue(), true, false, null, 96, null);
        j = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_default_master_host", e9k.b, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk_arbiter", Collections.singletonList(new vdd("master_default_host")), rl0.A, rl0.B), (CrashReporterRepository) ifhVar.getValue(), false, false, null, 112, null);
    }
}
