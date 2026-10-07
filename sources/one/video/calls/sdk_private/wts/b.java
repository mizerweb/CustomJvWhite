package one.video.calls.sdk_private.wts;

import defpackage.y3e;
import one.video.calls.sdk.net.signaling.wt.nal.NALLog;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements NALLog {
    public final /* synthetic */ y3e a;

    public b(y3e y3eVar) {
        this.a = y3eVar;
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALLog
    public final void log(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a.log(str, str2);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALLog
    public final void logException(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        th.getClass();
        this.a.logException(str, str2, th);
    }

    @Override // one.video.calls.sdk.net.signaling.wt.nal.NALLog
    public final void reportException(String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        th.getClass();
        this.a.reportException(str, str2, th);
    }
}
