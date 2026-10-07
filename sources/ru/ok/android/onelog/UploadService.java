package ru.ok.android.onelog;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import defpackage.fp8;
import defpackage.jye;
import defpackage.yab;
import java.io.IOException;
import ru.ok.android.commons.app.ApplicationProvider;

/* JADX INFO: loaded from: classes3.dex */
public class UploadService extends jye {
    public static final String ACTION_UPLOAD = "ru.ok.android.onelog.action.UPLOAD";
    public static final String EXTRA_TRIGGER = "trigger";
    public static final String SCHEME = "one-log";

    private void onHandleUpload(String str, OneLogTrigger oneLogTrigger) {
        try {
            OneLogImpl.upload(str, oneLogTrigger);
        } catch (IOException unused) {
        }
    }

    public static void startUpload(String str, OneLogTrigger oneLogTrigger) {
        Application application = ApplicationProvider.a;
        Application applicationF = yab.F();
        fp8.enqueueWork(applicationF, (Class<?>) UploadService.class, OneLogImpl.getInstance().getUploadJobId(), new Intent().setAction(ACTION_UPLOAD).setData(Uri.fromParts(SCHEME, str, null)).putExtra(EXTRA_TRIGGER, oneLogTrigger).setClass(applicationF, UploadService.class));
    }

    @Override // defpackage.fp8
    public void onHandleWork(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null || !action.equals(ACTION_UPLOAD)) {
            return;
        }
        onHandleUpload(intent.getData().getSchemeSpecificPart(), (OneLogTrigger) intent.getParcelableExtra(EXTRA_TRIGGER));
    }

    @Deprecated
    public static void startUpload(String str) {
        startUpload(str, null);
    }
}
