package one.me.sdk.messagewrite.recordcontrols.delegates;

import defpackage.c0a;
import defpackage.ew5;
import defpackage.ghb;
import defpackage.lw5;
import defpackage.qe7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"one/me/sdk/messagewrite/recordcontrols/delegates/VideoMessageRecordDelegate$PreviewRenderException", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message-write-widget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoMessageRecordDelegate$PreviewRenderException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMessageRecordDelegate$PreviewRenderException() {
        super(c0a.o("Preview wasn't rendered for ", ew5.t(qe7.P(8000L, lw5.MILLISECONDS)), " seconds"));
        ghb ghbVar = ew5.b;
    }
}
