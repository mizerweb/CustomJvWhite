package defpackage;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class u6g {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public float[] f;
    public float[] g;
    public final int h;
    public int i;

    public u6g() {
        int iZ = oc9.z(35633, "precision mediump float;\nuniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute vec4 aVertexCoord;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = mvpMatrix * aVertexCoord;\n    vTextureCoord = (texMatrix * aTextureCoord).xy;\n}\n");
        int iZ2 = oc9.z(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        int iGlCreateProgram = GLES20.glCreateProgram();
        oc9.o("glCreateProgram", new int[0]);
        this.a = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, iZ);
        oc9.o("glAttachShader", new int[0]);
        GLES20.glDeleteShader(iZ);
        oc9.o("glDeleteShader", new int[0]);
        GLES20.glAttachShader(iGlCreateProgram, iZ2);
        oc9.o("glAttachShader", new int[0]);
        GLES20.glDeleteShader(iZ2);
        oc9.o("glDeleteShader", new int[0]);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String str = "Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram);
            Log.e("GLESUtils", str);
            ore.q(str);
            throw null;
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(iGlCreateProgram, ugk.VERTEX_SHADER_ATTR_VERTEXT_COORDINATES);
        if (iGlGetAttribLocation < 0) {
            Log.e("GLESUtils", "Unable to locate 'aVertexCoord' in program");
            ore.q("Unable to locate 'aVertexCoord' in program");
            throw null;
        }
        this.b = iGlGetAttribLocation;
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(iGlCreateProgram, ugk.VERTEX_SHADER_ATTR_TEXTURE_COORDINATES);
        if (iGlGetAttribLocation2 < 0) {
            Log.e("GLESUtils", "Unable to locate 'aTextureCoord' in program");
            ore.q("Unable to locate 'aTextureCoord' in program");
            throw null;
        }
        this.c = iGlGetAttribLocation2;
        this.d = a(ugk.VERTEX_SHADER_UNI_MVP_MATRIX);
        this.e = a(ugk.VERTEX_SHADER_UNI_TEXTURE_MATRIX);
        this.h = a(ugk.FRAGMENT_SHADER_UNI_TEXTURE_SAMPLER);
    }

    public final int a(String str) {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.a, str);
        if (iGlGetUniformLocation >= 0) {
            return iGlGetUniformLocation;
        }
        String str2 = "Unable to locate '" + str + "' in program";
        Log.e("GLESUtils", str2);
        ore.q(str2);
        return 0;
    }
}
