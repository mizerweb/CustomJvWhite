package defpackage;

import one.video.transloader.task.TranscodeTask;

/* JADX INFO: loaded from: classes3.dex */
public final class kvd implements af7 {
    public final rj5 a;
    public volatile float b;
    public Float c;

    public kvd(rj5 rj5Var) {
        this.a = rj5Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        final float f = this.b;
        if (!cqk.c(this.c, f)) {
            this.c = Float.valueOf(f);
            final TranscodeTask transcodeTask = (TranscodeTask) this.a.b;
            if (transcodeTask.b()) {
                transcodeTask.a.f("TranscodeTask", new af7() { // from class: f0i
                    @Override // defpackage.af7
                    public final Object invoke() {
                        return "New Progress state " + f + " when transcode task is already in terminal state: " + transcodeTask.j;
                    }
                });
            } else {
                Long lA = TranscodeTask.a(transcodeTask);
                if (lA != null) {
                    transcodeTask.c(new c0i(f, lA.longValue()));
                }
            }
        }
        return sbi.a;
    }
}
