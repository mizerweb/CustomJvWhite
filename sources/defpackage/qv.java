package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.logger.LoggerProvider;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.data.source.ManifestDataSource;
import com.vk.push.core.filedatastore.FileDataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import one.me.settings.devices.hintdialog.QrAuthHintBottomSheet;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;
import ru.rustore.sdk.pushclient.internal.arbiter.ArbiterBroadcastReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class qv extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv(int i, Object obj) {
        super(0);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        boolean z;
        Object poeVar;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                ArbiterBroadcastReceiver arbiterBroadcastReceiver = (ArbiterBroadcastReceiver) this.b;
                gik gikVar = dul.o;
                return (gikVar != null ? gikVar.c : new DefaultLogger("VkpnsClientSdk")).createLogger(arbiterBroadcastReceiver);
            case 1:
                SQLiteDatabase writableDatabase = ((r28) this.b).a.getWritableDatabase();
                writableDatabase.enableWriteAheadLogging();
                return writableDatabase;
            case 2:
                return FileDataSource.access$getOrCreateFile((FileDataSource) this.b);
            case 3:
                return ((LoggerProvider) this.b).provideLogger().createLogger("ImageDownloader");
            case 4:
                return ManifestDataSource.access$getMetaDataBundle((ManifestDataSource) this.b);
            case 5:
                File file = (File) ((kr0) this.b).invoke();
                if (lu6.m0(file).equals("preferences_pb")) {
                    return file;
                }
                c.p(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                return null;
            case 6:
                QrAuthHintBottomSheet.o1((QrAuthHintBottomSheet) this.b);
                return sbi.a;
            case 7:
                Iterable iterable = r66.a;
                RemoteMessage remoteMessage = (RemoteMessage) this.b;
                Iterable stringArrayList = remoteMessage.a.getStringArrayList("vk.data_key");
                if (stringArrayList == null) {
                    stringArrayList = iterable;
                }
                ArrayList<String> stringArrayList2 = remoteMessage.a.getStringArrayList("vk.data_value");
                if (stringArrayList2 != null) {
                    iterable = stringArrayList2;
                }
                return wm9.W0(ww3.Z1(stringArrayList, iterable));
            case 8:
                File file2 = (File) ((m9g) this.b).a.invoke();
                String absolutePath = file2.getAbsolutePath();
                synchronized (m9g.j) {
                    LinkedHashSet linkedHashSet = m9g.i;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file2 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(absolutePath);
                }
                return file2;
            case 9:
                ((TracerCrashReportLite) this.b).configuration.getClass();
                try {
                    String str = "ru.ok.tracer.lite.crash.report" + ((char) ((i4e.b.c() * Integer.parseInt("0")) + 46)) + "SeemsUnused";
                    z = !Class.forName(str).getName().equals(str);
                } catch (Throwable unused) {
                    z = true;
                }
                if (z) {
                    try {
                        swh swhVar = swh.a;
                        break;
                    } catch (Throwable unused2) {
                    }
                }
                z2 = true;
                return Boolean.valueOf(z2);
            case 10:
                nxh nxhVar = (nxh) this.b;
                Context context = nxhVar.a;
                StringBuilder sbQ = qv1.q("TracerSDK/1.4.0 Lib/", nxhVar.b, " App/", context.getPackageName(), " ");
                String property = System.getProperty("http.agent");
                if (property == null) {
                    property = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)";
                }
                sbQ.append(property);
                return new l28(-1, context, sbQ.toString());
            case 11:
                return ((q9k) this.b).b.getCountryId();
            case 12:
                Context context2 = (Context) ((phf) this.b).b;
                Bundle bundle = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), np0.m).metaData;
                return new c9k((bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_icon")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_icon")) : null, (bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_color")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_color")) : null, bundle != null ? bundle.getString("ru.rustore.sdk.pushclient.default_notification_channel_id") : null);
            case 13:
                Context context3 = (Context) ((cmf) this.b).b;
                try {
                    PackageManager packageManager = context3.getPackageManager();
                    String packageName = context3.getPackageName();
                    String str2 = (Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0)).versionName;
                    if (str2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    poeVar = new cdk(str2);
                    if (poeVar instanceof poe) {
                        poeVar = null;
                    }
                    cdk cdkVar = (cdk) poeVar;
                    String str3 = cdkVar != null ? cdkVar.a : null;
                    if (str3 != null) {
                        return new cdk(str3);
                    }
                    return null;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                break;
            case 14:
                return ((Logger) this.b).createLogger("MessagesIPC");
            case 15:
                ((uvc) ((ri) this.b).b).b();
                return sbi.a;
            default:
                tgk tgkVar = (tgk) this.b;
                yab.i0(tgkVar.d, null, 0, new ohk(tgkVar, null, 0), 3);
                return sbi.a;
        }
    }
}
