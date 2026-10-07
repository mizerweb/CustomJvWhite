package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* JADX INFO: loaded from: classes3.dex */
public final class xmc implements VideoSink {
    public final String a;
    public long b = -1;
    public final /* synthetic */ ymc c;

    public xmc(ymc ymcVar, String str) {
        this.c = ymcVar;
        this.a = str;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId = videoFrame.getCompactParticipantId();
        if (compactParticipantId == null) {
            compactParticipantId = -1L;
        }
        if (compactParticipantId.longValue() != this.b) {
            this.b = compactParticipantId.longValue();
            if (compactParticipantId.longValue() == -1) {
                compactParticipantId = null;
            }
            ymc ymcVar = this.c;
            ConcurrentHashMap concurrentHashMap = ymcVar.k;
            ConcurrentHashMap concurrentHashMap2 = ymcVar.l;
            String str = this.a;
            x52 x52Var = (x52) concurrentHashMap.get(str);
            if (x52Var != null) {
                concurrentHashMap.remove(str, x52Var);
                concurrentHashMap2.remove(x52Var, str);
            }
            if (compactParticipantId != null) {
                x52 x52Var2 = (x52) ((ConcurrentHashMap) ((vn7) ymcVar.e).b).get(Integer.valueOf((int) compactParticipantId.longValue()));
                if (x52Var2 != null) {
                    concurrentHashMap.put(str, x52Var2);
                    concurrentHashMap2.put(x52Var2, str);
                }
            }
        }
    }
}
