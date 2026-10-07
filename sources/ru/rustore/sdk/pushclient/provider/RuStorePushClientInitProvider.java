package ru.rustore.sdk.pushclient.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.vk.push.common.Logger;
import com.vk.push.core.data.repository.MetadataConsts;
import com.vk.push.core.data.repository.MetadataRepositoryImplKt;
import com.vk.push.core.data.source.ManifestDataSource;
import com.vk.push.core.domain.repository.MetadataRepository;
import defpackage.ac5;
import defpackage.c4h;
import defpackage.er3;
import defpackage.g9i;
import defpackage.n6k;
import defpackage.ore;
import defpackage.r5h;
import defpackage.t9k;
import defpackage.uik;
import defpackage.wze;
import defpackage.zo5;

/* JADX INFO: loaded from: classes2.dex */
public final class RuStorePushClientInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if ("ru.rustore.sdk.pushclient.rustorepushclientinitprovider".equals(providerInfo.authority)) {
            ore.k("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        MetadataRepository MetadataRepository;
        String string;
        Context context = getContext();
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        int i = 0;
        if (applicationContext != null && (string = (MetadataRepository = MetadataRepositoryImplKt.MetadataRepository(new ManifestDataSource(applicationContext.getPackageManager(), applicationContext.getPackageName()))).getString(MetadataConsts.PROJECT_ID_KEY)) != null) {
            boolean z = true;
            if (!r5h.X0(string)) {
                Application application = (Application) applicationContext.getApplicationContext();
                if (application != null) {
                    String str = "RuStorePushClient";
                    ac5 ac5Var = new ac5(str, i);
                    g9i g9iVar = new g9i(application);
                    uik uikVar = new uik(application, ac5Var);
                    c4h c4hVar = new c4h(g9iVar, 7, uikVar);
                    wze wzeVar = new wze(MetadataRepository, c4hVar, ac5Var);
                    Logger logger = t9k.a;
                    n6k n6kVar = new n6k(wzeVar, ac5Var);
                    String string2 = MetadataRepository.getString(MetadataConsts.PROJECT_ID_KEY);
                    if (string2 == null) {
                        Logger.DefaultImpls.info$default((Logger) wzeVar.c, "Auto init RuStorePushClient was skipped", null, 2, null);
                        z = false;
                    } else {
                        String string3 = MetadataRepository.getString(MetadataConsts.PARAMS_CLASS_KEY);
                        if (string3 != null) {
                            try {
                                Class.forName(string3, false, uik.class.getClassLoader()).getDeclaredConstructor(Context.class).newInstance(application);
                            } catch (Throwable th) {
                                if (th instanceof NoSuchMethodException ? true : th instanceof SecurityException) {
                                    ore.l(string3.concat(" class must have a once constructor which accepts Context as the only parameter"), th);
                                    return false;
                                }
                                ((ac5) uikVar.b).warn("Error while trying instantiate class ".concat(string3), th);
                            }
                        }
                        er3.G((Application) ((g9i) c4hVar.b).a, string2, new ac5(str, i));
                    }
                    Logger.DefaultImpls.info$default((Logger) n6kVar.a, zo5.s("Auto init RuStorePushClient is successful = ", z), null, 2, null);
                    return false;
                }
                ore.k("applicationContext must be not null");
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
