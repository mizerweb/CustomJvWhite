package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i2j implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ i2j(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        VideoMessageWidget videoMessageWidget = this.b;
        switch (i) {
            case 0:
                g2j g2jVar = (g2j) videoMessageWidget.b.getAccessor().c(1055);
                return new f2j(g2jVar.a, g2jVar.b, g2jVar.c);
            case 1:
                zv8[] zv8VarArr = VideoMessageWidget.B;
                e3j e3jVar = ((w8g) videoMessageWidget.f.getValue()).get();
                e3jVar.b(0.0f);
                e3jVar.o0(false);
                e3jVar.q0(videoMessageWidget.g);
                return e3jVar;
            case 2:
                zv8[] zv8VarArr2 = VideoMessageWidget.B;
                zzi zziVar = new zzi(videoMessageWidget.getContext());
                if (videoMessageWidget.q1().getWidth() <= 0 || videoMessageWidget.q1().getHeight() <= 0) {
                    WeakHashMap weakHashMap = i7j.a;
                    if (!zziVar.isLaidOut() || zziVar.isLayoutRequested()) {
                        zziVar.addOnLayoutChangeListener(new b62(videoMessageWidget, 7, zziVar));
                    } else {
                        int iP1 = VideoMessageWidget.p1(videoMessageWidget, (View) videoMessageWidget.s1().getParent());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iP1, iP1);
                        layoutParams.gravity = 17;
                        zziVar.setLayoutParams(layoutParams);
                    }
                } else {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(videoMessageWidget.q1().getWidth(), videoMessageWidget.q1().getHeight());
                    layoutParams2.gravity = 17;
                    zziVar.setLayoutParams(layoutParams2);
                }
                qe7.H(zziVar, 300L, new aah(10, videoMessageWidget));
                return zziVar;
            case 3:
                zv8[] zv8VarArr3 = VideoMessageWidget.B;
                FrameLayout frameLayout = new FrameLayout(videoMessageWidget.getContext());
                frameLayout.setId(R.id.chat_screen__video_msg_trim_slider_view_container);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams3.gravity = 80;
                frameLayout.setLayoutParams(layoutParams3);
                return frameLayout;
            case 4:
                zv8[] zv8VarArr4 = VideoMessageWidget.B;
                return videoMessageWidget.getContext().getDrawable(R.drawable.icon_flash);
            default:
                zv8[] zv8VarArr5 = VideoMessageWidget.B;
                return videoMessageWidget.getContext().getDrawable(R.drawable.icon_flash_crossed);
        }
    }
}
