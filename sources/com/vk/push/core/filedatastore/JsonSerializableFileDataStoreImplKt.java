package com.vk.push.core.filedatastore;

import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.filedatastore.migration.Migration;
import defpackage.ao5;
import defpackage.cqk;
import defpackage.gu4;
import defpackage.hv4;
import defpackage.j8e;
import defpackage.lb5;
import defpackage.oq6;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aw\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vk/push/core/filedatastore/JsonSerializer;", "T", "", SdkMetricStatEvent.NAME_KEY, "Lcom/vk/push/core/filedatastore/JsonDeserializer;", "deserializer", "Lcom/vk/push/core/filedatastore/migration/Migration;", "migration", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashReporterRepository", "", "cacheOnError", "clearOnCorruption", "Lgu4;", "scope", "Lj8e;", "Landroid/content/Context;", "Lcom/vk/push/core/filedatastore/FileDataStore;", "fileDataStore", "(Ljava/lang/String;Lcom/vk/push/core/filedatastore/JsonDeserializer;Lcom/vk/push/core/filedatastore/migration/Migration;Lcom/vk/push/core/data/repository/CrashReporterRepository;ZZLgu4;)Lj8e;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class JsonSerializableFileDataStoreImplKt {
    public static final <T extends JsonSerializer> j8e fileDataStore(String str, JsonDeserializer<T> jsonDeserializer, Migration<T> migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, gu4 gu4Var) {
        return new oq6(str, jsonDeserializer, migration, crashReporterRepository, z, z2, gu4Var);
    }

    public static j8e fileDataStore$default(String str, JsonDeserializer jsonDeserializer, Migration migration, CrashReporterRepository crashReporterRepository, boolean z, boolean z2, gu4 gu4Var, int i, Object obj) {
        if ((i & 4) != 0) {
            migration = Migration.INSTANCE.noMigration$core_release();
        }
        Migration migration2 = migration;
        if ((i & 8) != 0) {
            crashReporterRepository = new hv4();
        }
        CrashReporterRepository crashReporterRepository2 = crashReporterRepository;
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 64) != 0) {
            ao5 ao5Var = ao5.a;
            gu4Var = cqk.a(lb5.c);
        }
        return fileDataStore(str, jsonDeserializer, migration2, crashReporterRepository2, z3, z4, gu4Var);
    }
}
