package ru.ok.android.externcalls.sdk.ui;

import defpackage.dc7;
import defpackage.h57;
import defpackage.ifh;
import defpackage.ny8;
import kotlin.Metadata;
import org.webrtc.VideoFrame;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "", "apply", "Lorg/webrtc/VideoFrame;", "frame", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface FrameDecorator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/FrameDecorator$Companion;", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "EMPTY$delegate", "Lny8;", "getEMPTY", "()Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "EMPTY", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: renamed from: EMPTY$delegate, reason: from kotlin metadata */
        private static final ny8 EMPTY = new ifh(new h57(3));

        private Companion() {
        }

        public static final FrameDecorator EMPTY_delegate$lambda$0() {
            return new dc7(0);
        }

        public static final VideoFrame EMPTY_delegate$lambda$0$0(VideoFrame videoFrame) {
            return videoFrame;
        }

        public final FrameDecorator getEMPTY() {
            return (FrameDecorator) EMPTY.getValue();
        }
    }

    VideoFrame apply(VideoFrame frame);
}
