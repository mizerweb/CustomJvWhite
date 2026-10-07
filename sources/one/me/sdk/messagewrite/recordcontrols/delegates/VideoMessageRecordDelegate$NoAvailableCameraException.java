package one.me.sdk.messagewrite.recordcontrols.delegates;

import defpackage.tnh;
import defpackage.ynh;
import kotlin.Metadata;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"one/me/sdk/messagewrite/recordcontrols/delegates/VideoMessageRecordDelegate$NoAvailableCameraException", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message-write-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoMessageRecordDelegate$NoAvailableCameraException extends IllegalStateException {
    public final ynh a;

    public VideoMessageRecordDelegate$NoAvailableCameraException() {
        tnh tnhVar = new tnh(R.string.video_message_record_error_no_camera);
        super("The phone doesn't have cameras at all");
        this.a = tnhVar;
    }
}
