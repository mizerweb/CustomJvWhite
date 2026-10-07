package defpackage;

import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cph implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextureViewRenderer b;

    public /* synthetic */ cph(TextureViewRenderer textureViewRenderer, int i) {
        this.a = i;
        this.b = textureViewRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TextureViewRenderer textureViewRenderer = this.b;
        switch (i) {
            case 0:
                TextureViewRenderer.notifyTextureSizeChanged$lambda$0(textureViewRenderer);
                break;
            case 1:
                textureViewRenderer.dropPostponedFrameIfExists();
                break;
            default:
                textureViewRenderer.deliverPostponedFrame();
                break;
        }
    }
}
