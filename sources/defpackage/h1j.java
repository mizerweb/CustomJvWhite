package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;
import one.me.sdk.gl.effects.objects.OesToImage2dRenderer;
import one.me.sdk.gl.effects.objects.TrivialFragmentShader;

/* JADX INFO: loaded from: classes3.dex */
public final class h1j extends pp5 {
    public final Size n;
    public final String o;
    public xkg p;
    public OesToImage2dRenderer q;
    public TrivialFragmentShader r;
    public final float[] s;
    public long t;
    public int u;
    public pni v;

    public h1j(Size size, fx5 fx5Var) {
        this.n = size;
        String name = h1j.class.getName();
        this.o = name;
        this.s = new float[16];
        this.u = -1;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "init, previewSize=" + size + ", dynamicRange=" + fx5Var, null);
            }
        }
        Map map = Collections.EMPTY_MAP;
        n(fx5Var);
    }

    @Override // defpackage.pp5
    public final void q() {
        gm0.Y(this.o, "release");
        TrivialFragmentShader trivialFragmentShader = this.r;
        if (trivialFragmentShader != null) {
            trivialFragmentShader.release();
        }
        this.r = null;
        OesToImage2dRenderer oesToImage2dRenderer = this.q;
        if (oesToImage2dRenderer != null) {
            oesToImage2dRenderer.release();
        }
        this.q = null;
        xkg xkgVar = this.p;
        if (xkgVar != null) {
            gm0.Y((String) xkgVar.d, "release");
            ((VideoMessageStencilHolder) xkgVar.e).release();
            ((FrameBuffer) xkgVar.f).release();
        }
        this.p = null;
        this.v = null;
        super.q();
    }

    public final void v(SurfaceTexture surfaceTexture, Surface surface, float[] fArr, boolean z) throws IOException {
        TrivialFragmentShader trivialFragmentShader;
        pni pniVar;
        gi0 gi0VarL = l(surface);
        if (gi0VarL.equals(xg7.j)) {
            gi0VarL = h(surface);
            if (gi0VarL == null) {
                gm0.Y(h1j.class.getName(), "Early return in render cuz of createOutputSurfaceInternal(outputSurface) is null");
                return;
            }
            ((HashMap) this.c).put(surface, gi0VarL);
        }
        xg7.d((AtomicBoolean) this.b, true);
        xg7.c((Thread) this.d);
        int i = this.a;
        int i2 = gi0VarL.b;
        int i3 = gi0VarL.c;
        EGLSurface eGLSurface = gi0VarL.a;
        long timestamp = surfaceTexture.getTimestamp();
        xkg xkgVar = this.p;
        if (xkgVar == null) {
            xkgVar = new xkg(this.n);
            this.p = xkgVar;
        }
        xkg xkgVar2 = xkgVar;
        OesToImage2dRenderer oesToImage2dRenderer = this.q;
        if (oesToImage2dRenderer == null) {
            oesToImage2dRenderer = new OesToImage2dRenderer();
            this.q = oesToImage2dRenderer;
        }
        TrivialFragmentShader trivialFragmentShader2 = this.r;
        if (trivialFragmentShader2 == null) {
            trivialFragmentShader2 = new TrivialFragmentShader(0, false);
            this.r = trivialFragmentShader2;
        }
        if (timestamp == this.t && i == this.u && Arrays.equals(fArr, this.s)) {
            trivialFragmentShader = trivialFragmentShader2;
        } else {
            ((FrameBuffer) xkgVar2.f).bind();
            GLES20.glViewport(0, 0, xkgVar2.a, xkgVar2.b);
            trivialFragmentShader = trivialFragmentShader2;
            OesToImage2dRenderer.render$default(oesToImage2dRenderer, i, fArr, null, 4, null);
            ((FrameBuffer) xkgVar2.f).unbind();
            System.arraycopy(fArr, 0, this.s, 0, fArr.length);
            this.t = timestamp;
            this.u = i;
        }
        VideoMessageStencilHolder videoMessageStencilHolder = (VideoMessageStencilHolder) xkgVar2.e;
        int textureId = ((FrameBuffer) xkgVar2.f).getTextureId();
        Size size = (Size) xkgVar2.c;
        videoMessageStencilHolder.render(textureId, size.getWidth(), size.getHeight(), i2, i3, !z, false);
        if (!cqk.d((Surface) this.j, surface)) {
            o(eGLSurface);
            this.j = surface;
        }
        GLES20.glViewport(0, 0, i2, i3);
        trivialFragmentShader.setTextureId(((FrameBuffer) xkgVar2.f).getTextureId());
        trivialFragmentShader.render();
        if (this.v != null) {
            int textureId2 = ((FrameBuffer) xkgVar2.f).getTextureId();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
            GLES20.glViewport(0, 0, i2, i3);
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
            FrameBuffer frameBuffer = new FrameBuffer(i2, i3);
            TrivialFragmentShader trivialFragmentShader3 = new TrivialFragmentShader(0, false);
            trivialFragmentShader3.setTextureId(textureId2);
            trivialFragmentShader3.setMVPMat(fArr2);
            frameBuffer.bind();
            trivialFragmentShader3.render();
            GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, byteBufferAllocateDirect);
            frameBuffer.unbind();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            ImageProcessingUtil.f(bitmapCreateBitmap, byteBufferAllocateDirect, i2 * 4);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bitmapCreateBitmap.recycle();
                byteArrayOutputStream.close();
                frameBuffer.release();
                trivialFragmentShader3.release();
                if (byteArray != null && (pniVar = this.v) != null) {
                    pniVar.invoke(byteArray);
                }
                this.v = null;
            } catch (Throwable th) {
                bitmapCreateBitmap.recycle();
                byteArrayOutputStream.close();
                frameBuffer.release();
                trivialFragmentShader3.release();
                throw th;
            }
        }
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.e, eGLSurface, timestamp);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.e, eGLSurface)) {
            return;
        }
        String str = this.o;
        int iEglGetError = EGL14.eglGetError();
        tre.M(16);
        String strConcat = "failed to swap buffers, error=0x".concat(p0m.c(16, ((long) iEglGetError) & 4294967295L));
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, str, strConcat, null, null, 8);
        }
        s(surface, false);
    }
}
