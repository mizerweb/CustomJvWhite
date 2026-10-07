package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class o6j extends WebChromeClient {
    public final /* synthetic */ ycc a;

    public o6j(ycc yccVar) {
        this.a = yccVar;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
        bitmapCreateBitmap.eraseColor(0);
        return bitmapCreateBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        r6c r6cVar = new r6c(this.a.getContext());
        r6cVar.setId(R.id.video_progressbar_buffering);
        r6cVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        r6cVar.setAppearance(e6c.a);
        r6cVar.setSize(l6c.a);
        r6cVar.setBackgroundColor(-16777216);
        return r6cVar;
    }
}
