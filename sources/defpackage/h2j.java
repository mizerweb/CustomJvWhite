package defpackage;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h2j implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ h2j(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        VideoMessageWidget videoMessageWidget = this.b;
        MotionEvent motionEvent = (MotionEvent) obj;
        switch (i) {
            case 0:
                ScaleGestureDetector scaleGestureDetector = videoMessageWidget.y;
                if (scaleGestureDetector != null) {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                }
                break;
            default:
                ScaleGestureDetector scaleGestureDetector2 = videoMessageWidget.y;
                if (scaleGestureDetector2 != null) {
                    scaleGestureDetector2.onTouchEvent(motionEvent);
                }
                break;
        }
        return sbiVar;
    }
}
