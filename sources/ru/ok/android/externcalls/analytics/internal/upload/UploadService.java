package ru.ok.android.externcalls.analytics.internal.upload;

import android.app.Application;
import android.content.Intent;
import android.os.Build;
import defpackage.fp8;
import defpackage.jye;
import defpackage.yab;
import java.io.IOException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;

/* JADX INFO: loaded from: classes3.dex */
public class UploadService extends jye {
    public static final String ACTION_UPLOAD_CONTINUE = "ru.ok.android.onelog.action.UPLOAD_CONTINUE";
    public static final String ACTION_UPLOAD_NEW = "ru.ok.android.onelog.action.UPLOAD_NEW";
    private static final String LOG_TAG = "UploadService";

    private void onHandleUploadContinue(EventChannel eventChannel) {
        try {
            UploadStarter.INSTANCE.uploadContinue(eventChannel);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload already grabbed file", e);
        }
    }

    private void onHandleUploadNew(EventChannel eventChannel) {
        try {
            UploadStarter.INSTANCE.uploadNew(eventChannel);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload newly grabbed file", e);
        }
    }

    public static void resumeUpload(EventChannel eventChannel) {
        try {
            Intent intentPutExtra = new Intent().setAction(ACTION_UPLOAD_CONTINUE).putExtra("channel", eventChannel);
            Application application = ApplicationProvider.a;
            startUploadImpl(intentPutExtra.setClass(yab.F(), UploadService.class));
        } catch (Throwable th) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot resume upload", th);
        }
    }

    public static void startUpload(EventChannel eventChannel) {
        try {
            Intent intentPutExtra = new Intent().setAction(ACTION_UPLOAD_NEW).putExtra("channel", eventChannel);
            Application application = ApplicationProvider.a;
            startUploadImpl(intentPutExtra.setClass(yab.F(), UploadService.class));
        } catch (Throwable th) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot start upload", th);
        }
    }

    private static void startUploadImpl(Intent intent) {
        Application application = ApplicationProvider.a;
        try {
            fp8.enqueueWork(yab.F(), (Class<?>) UploadService.class, CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadJobId(), intent);
        } catch (SecurityException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().report(LOG_TAG, "Can't start analytics upload", new StatDeliveryException(e));
        }
    }

    @Override // defpackage.fp8
    public void onHandleWork(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        try {
            EventChannel eventChannel = Build.VERSION.SDK_INT >= 33 ? (EventChannel) intent.getParcelableExtra("channel", EventChannel.class) : (EventChannel) intent.getParcelableExtra("channel");
            if (eventChannel == null) {
                return;
            }
            CallAnalyticsConfigStorage.INSTANCE.getLogger().d(LOG_TAG, "Handle upload work, channel=" + eventChannel.getKey());
            if (action.equals(ACTION_UPLOAD_NEW)) {
                onHandleUploadNew(eventChannel);
            } else if (action.equals(ACTION_UPLOAD_CONTINUE)) {
                onHandleUploadContinue(eventChannel);
            }
        } catch (Throwable th) {
            try {
                CallAnalyticsConfigStorage.INSTANCE.getLogger().report(LOG_TAG, "Can't start upload job", th);
            } catch (Throwable unused) {
            }
        }
    }
}
