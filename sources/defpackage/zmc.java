package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* JADX INFO: loaded from: classes3.dex */
public final class zmc implements VideoSink {
    public final Map a;
    public final vn7 b;

    public zmc(ConcurrentHashMap concurrentHashMap, vn7 vn7Var) {
        this.a = concurrentHashMap;
        this.b = vn7Var;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId;
        List list;
        if ((videoFrame.getRotatedWidth() > 16 || videoFrame.getRotatedHeight() > 16) && (compactParticipantId = videoFrame.getCompactParticipantId()) != null) {
            x52 x52Var = (x52) ((ConcurrentHashMap) this.b.b).get(Integer.valueOf((int) compactParticipantId.longValue()));
            if (x52Var == null || (list = (List) this.a.get(x52Var)) == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((VideoSink) it.next()).onFrame(videoFrame);
            }
        }
    }
}
