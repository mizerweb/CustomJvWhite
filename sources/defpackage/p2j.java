package defpackage;

import android.hardware.camera2.CameraManager;
import android.widget.ImageView;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class p2j implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VideoMessageWidget b;

    public /* synthetic */ p2j(VideoMessageWidget videoMessageWidget, int i) {
        this.a = i;
        this.b = videoMessageWidget;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        VideoMessageWidget videoMessageWidget = this.b;
        switch (i) {
            case 0:
                ImageView imageView = (ImageView) obj;
                imageView.setId(R.id.chat_screen__video_msg_switch_camera_btn);
                imageView.setImageResource(R.drawable.icon_change_camera);
                zv8[] zv8VarArr = VideoMessageWidget.B;
                imageView.setEnabled(((CameraManager) videoMessageWidget.getContext().getSystemService("camera")).getCameraIdList().length > 1);
                qe7.H(imageView, 300L, new o2j(videoMessageWidget, 0));
                imageView.setVisibility(8);
                break;
            default:
                ImageView imageView2 = (ImageView) obj;
                imageView2.setId(R.id.chat_screen__video_msg_torch_btn);
                imageView2.setAlpha(0.0f);
                qe7.H(imageView2, 300L, new o2j(videoMessageWidget, 1));
                imageView2.setVisibility(8);
                break;
        }
        return sbiVar;
    }
}
