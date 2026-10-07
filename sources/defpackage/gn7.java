package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.TextureView;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class gn7 extends TextureView implements TextureView.SurfaceTextureListener {
    public final ks9 a;
    public EGLDisplay b;
    public EGLContext c;
    public EGLSurface d;
    public EGLConfig e;
    public int f;
    public FloatBuffer g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final LinkedHashMap o;
    public final we p;

    public gn7(Context context, ks9 ks9Var) {
        super(context);
        this.a = ks9Var;
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.d = EGL14.EGL_NO_SURFACE;
        this.o = new LinkedHashMap();
        this.p = new we(1, this);
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.j && this.i) {
            EGLDisplay eGLDisplay = this.b;
            EGLSurface eGLSurface = this.d;
            if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.c)) {
                int i = this.k;
                float f = i;
                int i2 = this.l;
                float f2 = i2;
                if (f <= 0.0f || f2 <= 0.0f) {
                    return;
                }
                GLES20.glViewport(0, 0, i, i2);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                GLES20.glUseProgram(this.f);
                we weVar = this.p;
                weVar.d("resolution", f, f2);
                ((ns0) this.a.b).a(weVar, f, f2);
                GLES20.glEnableVertexAttribArray(this.h);
                GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 0, (Buffer) this.g);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glDisableVertexAttribArray(this.h);
                EGL14.eglSwapBuffers(this.b, this.d);
            }
        }
    }

    public final boolean getStarted() {
        return this.i;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.m;
        if (i4 <= 0 || (i3 = this.n) <= 0) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(i4, i3);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String str;
        this.k = i;
        this.l = i2;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.b = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(this.b, iArr, 0, iArr, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(this.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.e = eGLConfig;
                this.c = EGL14.eglCreateContext(this.b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.b, this.e, surfaceTexture, new int[]{12344}, 0);
                this.d = eGLSurfaceEglCreateWindowSurface;
                if (EGL14.eglMakeCurrent(this.b, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.c)) {
                    FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
                    this.g = floatBufferPut;
                    if (floatBufferPut != null) {
                        floatBufferPut.position(0);
                    }
                    ny8 ny8Var = rwf.a;
                    qbi spec = ((ns0) this.a.b).getSpec();
                    StringBuilder sb = new StringBuilder("precision highp float;\n\nvarying vec2 vUv;\n\nuniform vec2 uResolution;\n\n");
                    zpe zpeVar = (zpe) spec;
                    for (rbi rbiVar : zpeVar.x()) {
                        int iD = qt4.D(rbiVar.b);
                        if (iD == 0) {
                            str = "float";
                        } else if (iD == 1) {
                            str = "vec2";
                        } else {
                            if (iD != 2) {
                                ore.o();
                                return;
                            }
                            str = "vec4";
                        }
                        String str2 = rbiVar.a;
                        if (str2.length() > 0) {
                            str2 = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
                        }
                        sb.append(nbh.w("uniform ", str, " ", "u".concat(str2), ";"));
                        sb.append('\n');
                    }
                    sb.append("\n#define resolution uResolution\n");
                    for (rbi rbiVar2 : zpeVar.x()) {
                        String str3 = rbiVar2.a;
                        if (str3.length() > 0) {
                            str3 = Character.toUpperCase(str3.charAt(0)) + str3.substring(1);
                        }
                        String strConcat = "u".concat(str3);
                        sb.append("#define " + rbiVar2.a + " " + strConcat);
                        sb.append('\n');
                    }
                    sb.append("\n\n        float dither(vec2 p) {\n            return fract(sin(dot(p, vec2(12.9898, 78.233))) * 43758.5453);\n        }\n\n        float getCircle(vec2 p, vec2 center, float radius, float blur) {\n            float d = length(p - center);\n            return smoothstep(radius + blur, radius - blur, d);\n        }\n\n        vec2 getOffset(float angle, float radius) {\n            return vec2(cos(angle), sin(angle)) * radius;\n        }\n    \n\nvoid main() {\n    vec2 uv = vUv;\n\n    vec2 fragCoord = uv * resolution;\n    vec2 pixelPos = vec2(\n        fragCoord.x - resolution.x * 0.5,\n        resolution.y * 0.5 - fragCoord.y\n    );\n\n\n        // Layer 3 (Universe) - large background circle\n        float m3 = getCircle(pixelPos, vec2(0.0), circle3Radius, blur3);\n\n        // Layer 2 (Planets) - 4 orbiting circles\n        // Single trig call per layer: derive 4 positions via component swap/negate\n        vec2 offset2 = getOffset(-centers2Angle, centers2Radius);\n\n        float m2_c2 = getCircle(pixelPos, vec2(-offset2.y, offset2.x), circle2Radius, blur2);\n        float m2_c3 = getCircle(pixelPos, offset2, circle2Radius, blur2);\n        float m2_c4 = getCircle(pixelPos, vec2(offset2.y, -offset2.x), circle2Radius, blur2);\n        float m2_c5 = getCircle(pixelPos, -offset2, circle2Radius, blur2);\n\n        // Render planets (bottom to top) with pure colors\n        vec4 layer2Final = c5;\n        layer2Final = mix(layer2Final, c4, m2_c4);\n        layer2Final = mix(layer2Final, c3, m2_c3);\n        layer2Final = mix(layer2Final, c2, m2_c2);\n        float mask2 = clamp(m2_c2 + m2_c3 + m2_c4 + m2_c5, 0.0, 1.0) * alpha2;\n\n        // Layer 1 (Sputniks) - 2 inner circles\n        vec2 offset1 = getOffset(-centers1Angle, centers1Radius);\n\n        float m1_sput1 = getCircle(pixelPos, -offset1, circle1Radius, blur1);\n        float m1_sput2 = getCircle(pixelPos, offset1, circle1Radius, blur1);\n\n        vec4 layer1Final = mix(c7, c6, m1_sput1);\n        float mask1 = clamp(m1_sput1 + m1_sput2, 0.0, 1.0) * alpha1;\n\n        // Compose all layers\n        // Alpha is multiplied into mask — controls transparency, not color darkness\n        vec4 scene = bgColor;\n        scene = mix(scene, c1, m3 * alpha3);\n        scene = mix(scene, layer2Final, mask2);\n        scene = mix(scene, layer1Final, mask1);\n\n        // Global vignette (softened)\n        // vignetteScale corrects aspect ratio: (1,1) = UV-based ellipse, (1, h/w) = circular\n        float dist = length((uv - 0.5) * vignetteScale) * 1.2;\n        float vignette = pow(clamp(1.0 - dist, 0.0, 1.0), falloff * 0.3);\n\n        vec4 finalColor = mix(bgColor, scene, vignette);\n\n        // Dithering to reduce banding\n        finalColor.rgb += (dither(uv) - 0.5) * (2.0 / 255.0);\n    \n\n    gl_FragColor = finalColor;\n}\n");
                    String string = sb.toString();
                    int iGlCreateShader = GLES20.glCreateShader(35633);
                    GLES20.glShaderSource(iGlCreateShader, "\n        precision highp float;\n        attribute vec2 aPosition;\n        varying vec2 vUv;\n\n        void main() {\n            gl_Position = vec4(aPosition, 0.0, 1.0);\n            vUv = aPosition * 0.5 + 0.5;\n        }\n    ");
                    GLES20.glCompileShader(iGlCreateShader);
                    int[] iArr2 = new int[1];
                    GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr2, 0);
                    if (iArr2[0] == 0) {
                        GLES20.glDeleteShader(iGlCreateShader);
                        iGlCreateShader = 0;
                    }
                    int iGlCreateShader2 = GLES20.glCreateShader(35632);
                    GLES20.glShaderSource(iGlCreateShader2, string);
                    GLES20.glCompileShader(iGlCreateShader2);
                    int[] iArr3 = new int[1];
                    GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr3, 0);
                    if (iArr3[0] == 0) {
                        GLES20.glDeleteShader(iGlCreateShader2);
                        iGlCreateShader2 = 0;
                    }
                    int iGlCreateProgram = GLES20.glCreateProgram();
                    this.f = iGlCreateProgram;
                    GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
                    GLES20.glAttachShader(this.f, iGlCreateShader2);
                    GLES20.glLinkProgram(this.f);
                    int[] iArr4 = new int[1];
                    GLES20.glGetProgramiv(this.f, 35714, iArr4, 0);
                    int i3 = iArr4[0];
                    int i4 = this.f;
                    if (i3 == 0) {
                        GLES20.glDeleteProgram(i4);
                    } else {
                        this.h = GLES20.glGetAttribLocation(i4, "aPosition");
                        this.o.put("resolution", Integer.valueOf(GLES20.glGetUniformLocation(this.f, "uResolution")));
                        GLES20.glDeleteShader(iGlCreateShader);
                        GLES20.glDeleteShader(iGlCreateShader2);
                    }
                    this.j = true;
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.j = false;
        this.o.clear();
        int i = this.f;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f = 0;
        }
        if (!cqk.d(this.d, EGL14.EGL_NO_SURFACE)) {
            EGL14.eglDestroySurface(this.b, this.d);
            this.d = EGL14.EGL_NO_SURFACE;
        }
        if (!cqk.d(this.c, EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(this.b, this.c);
            this.c = EGL14.EGL_NO_CONTEXT;
        }
        if (!cqk.d(this.b, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglTerminate(this.b);
            this.b = EGL14.EGL_NO_DISPLAY;
        }
        this.g = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.k = i;
        this.l = i2;
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void setStarted(boolean z) {
        this.i = z;
    }
}
