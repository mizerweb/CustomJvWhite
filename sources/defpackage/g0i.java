package defpackage;

import one.video.transloader.task.TranscodeTask;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0i implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TranscodeTask b;

    public /* synthetic */ g0i(TranscodeTask transcodeTask, int i) {
        this.a = i;
        this.b = transcodeTask;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        TranscodeTask transcodeTask = this.b;
        switch (i) {
            case 0:
                return "Transcode finished with error when transcode task is already in terminal state: " + transcodeTask.j;
            default:
                transcodeTask.verifyThread("one.video.transloader.task.TranscodeTask.cancel");
                if (!transcodeTask.b()) {
                    transcodeTask.c(zzh.a);
                    c5f c5fVar = transcodeTask.i;
                    if (c5fVar != null) {
                        c5fVar.d();
                        transcodeTask.i = null;
                    }
                }
                return sbi.a;
        }
    }
}
