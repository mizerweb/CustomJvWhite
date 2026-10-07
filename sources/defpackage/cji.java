package defpackage;

import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.UploadStarter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cji implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventChannel b;

    public /* synthetic */ cji(EventChannel eventChannel, int i) {
        this.a = i;
        this.b = eventChannel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        EventChannel eventChannel = this.b;
        switch (i) {
            case 0:
                UploadStarter.startUpload$lambda$0(eventChannel);
                break;
            default:
                UploadStarter.resumeUpload$lambda$0(eventChannel);
                break;
        }
    }
}
