package defpackage;

import android.view.View;
import java.util.ArrayList;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatedFileDrawable b;

    public /* synthetic */ yi(AnimatedFileDrawable animatedFileDrawable, int i) {
        this.a = i;
        this.b = animatedFileDrawable;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.a) {
            case 0:
                AnimatedFileDrawable animatedFileDrawable = this.b;
                if (!animatedFileDrawable.Y) {
                    animatedFileDrawable.start();
                }
                animatedFileDrawable.invalidateInternal();
                break;
            case 1:
                AnimatedFileDrawable animatedFileDrawable2 = this.b;
                ArrayList arrayList = animatedFileDrawable2.z1;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((View) arrayList.get(i)).invalidate();
                    }
                }
                if ((arrayList.isEmpty() || animatedFileDrawable2.x) && (view = animatedFileDrawable2.y1) != null) {
                    view.invalidate();
                }
                break;
        }
    }
}
