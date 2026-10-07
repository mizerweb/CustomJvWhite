package defpackage;

import android.net.Uri;
import one.video.transloader.task.TranscodeTask;
import one.video.transloader.task.UploadTask;

/* JADX INFO: loaded from: classes3.dex */
public final class l3i {
    public final ewe a;
    public final TranscodeTask b;
    public final UploadTask c;

    public l3i(ewe eweVar, TranscodeTask transcodeTask, UploadTask uploadTask) {
        this.a = eweVar;
        this.b = transcodeTask;
        this.c = uploadTask;
    }

    public final void a() {
        c5f c5fVarS;
        ewe eweVar = this.a;
        TranscodeTask transcodeTask = this.b;
        transcodeTask.verifyThread("one.video.transloader.task.TranscodeTask.startTranscode");
        transcodeTask.c(d0i.a);
        try {
            c5fVarS = eweVar.s(Uri.fromFile(transcodeTask.c), transcodeTask.d, syl.a(transcodeTask.f), new rj5(28, transcodeTask));
        } catch (Throwable th) {
            transcodeTask.a.r("TranscodeTask", new yvg(17), new bpg(19, th));
            transcodeTask.c(new b0i(th));
            c5fVarS = null;
        }
        transcodeTask.i = c5fVarS;
        this.c.f();
    }
}
