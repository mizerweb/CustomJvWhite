package one.me.sdk.gl.effects;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import defpackage.bgc;
import defpackage.ifh;
import defpackage.ore;
import defpackage.xhk;
import one.me.sdk.gl.effects.loader.GlEffectsLibraryLoadException;

/* JADX INFO: loaded from: classes3.dex */
public class VideoMessageStencilHolder {
    private boolean isRecording;
    private final long nativeInstance;

    static {
        Throwable th = ((xhk) xhk.c.getValue()).b;
    }

    public VideoMessageStencilHolder(int i, int i2) {
        ifh ifhVar = xhk.c;
        if (((xhk) ifhVar.getValue()).b != null) {
            throw new GlEffectsLibraryLoadException("VideoMessageStencilHolder failed to init", ((xhk) ifhVar.getValue()).b);
        }
        long jCreateNativeInstance = createNativeInstance(i, i2);
        this.nativeInstance = jCreateNativeInstance;
        updateTextures(jCreateNativeInstance);
    }

    private static native long createNativeInstance(int i, int i2);

    private static native void handleTextureId(long j, int i, int i2, int i3);

    private static native void onStartRecording(long j);

    private static native void onStopRecording(long j);

    private static native void release(long j);

    private static native void render(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    private static native void updateTextures(long j);

    public boolean notifyRecording(boolean z) {
        if (this.isRecording == z) {
            return false;
        }
        this.isRecording = z;
        long j = this.nativeInstance;
        if (z) {
            onStartRecording(j);
            return true;
        }
        onStopRecording(j);
        return true;
    }

    public void release() {
        release(this.nativeInstance);
    }

    public void render(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        render(this.nativeInstance, i, i2, i3, i4, i5, z, z2);
    }

    public void setStencilBitmap(Bitmap bitmap, boolean z) {
        if (bitmap.isRecycled()) {
            ore.p("Tried to push recycled bitmap to video messages stencil effect");
            return;
        }
        if (bitmap.isRecycled()) {
            ore.p("The specified bitmap is recycled");
            return;
        }
        int[] iArr = {0};
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        if (i == 0) {
            i = 0;
        } else {
            new BitmapFactory.Options().inScaled = false;
            GLES20.glBindTexture(3553, i);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, GLUtils.getInternalFormat(bitmap), bitmap, 0);
        }
        handleTextureId(this.nativeInstance, i, bitmap.getWidth(), bitmap.getHeight());
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        bgc.c("glDeleteTextures");
    }
}
