package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class ihi extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ UploadFileAttachWorker f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ihi(UploadFileAttachWorker uploadFileAttachWorker, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = uploadFileAttachWorker;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        UploadFileAttachWorker uploadFileAttachWorker = this.f;
        switch (i) {
            case 0:
                return new ihi(uploadFileAttachWorker, lq4Var, 0);
            default:
                return new ihi(uploadFileAttachWorker, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((ihi) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((ihi) create((kka) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        long length;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                try {
                    length = new File(this.f.p().b).length() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
                    break;
                } catch (Throwable th) {
                    gm0.V("UploadFileAttachWorker", "fileSize fail!", th);
                    length = 0;
                }
                return new Long(length);
            default:
                ch3.d0(obj);
                return Boolean.valueOf(!(this.f.F instanceof i89));
        }
    }
}
