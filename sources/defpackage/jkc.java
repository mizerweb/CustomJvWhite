package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jkc extends er0 {
    public final v30 h;
    public final yye i;
    public final c98 j;
    public final int[] k;
    public final SparseArray l;
    public final SparseIntArray m;

    public jkc(Context context, boolean z, c98 c98Var) throws VideoFrameProcessingException {
        super(z, 1);
        int i = 15;
        if (z) {
            int[] iArr = new int[c98Var.size()];
            for (int i2 = 0; i2 < c98Var.size(); i2++) {
                ey0 ey0Var = (ey0) c98Var.get(i2);
                if (ey0Var == null) {
                    throw new IllegalArgumentException(ey0Var + " is not supported on HDR content.");
                }
                lvb.b0(Build.VERSION.SDK_INT >= 34);
                iArr[i2] = 1;
                i -= 2;
                if (i < 0) {
                    ore.p("Too many HDR overlays in the same OverlayShaderProgram instance.");
                    throw null;
                }
            }
            this.k = iArr;
        } else {
            this.k = null;
            lvb.O("OverlayShaderProgram does not support more than 15 SDR overlays in the same instance.", c98Var.size() <= 15);
        }
        this.j = c98Var;
        this.i = new yye();
        this.l = new SparseArray();
        this.m = new SparseIntArray();
        try {
            v30 v30Var = new v30(k(c98Var.size()), j(context, c98Var.size(), this.k));
            this.h = v30Var;
            v30Var.y(tab.v());
        } catch (GlUtil$GlException | IOException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01ad  */
    public static String j(Context context, int i, int[] iArr) {
        String str;
        StringBuilder sb = new StringBuilder("#version 100\nprecision mediump float;\nuniform sampler2D uVideoTexSampler0;\nvarying vec2 vVideoTexSamplingCoord0;\n\n");
        sb.append(vqi.U(context, "shaders/insert_overlay_fragment_shader_methods.glsl"));
        if (iArr != null) {
            sb.append(vqi.U(context, "shaders/insert_ultra_hdr.glsl"));
        }
        for (int i2 = 1; i2 <= i; i2++) {
            Locale locale = Locale.US;
            sb.append("uniform sampler2D uOverlayTexSampler" + i2 + ";\n");
            sb.append("uniform float uOverlayAlphaScale" + i2 + ";\n");
            sb.append("varying vec2 vOverlayTexSamplingCoord" + i2 + ";\n");
            sb.append("\n");
            if (iArr != null) {
                int i3 = iArr[i2 - 1];
                if (i3 == 1) {
                    sb.append("// Uniforms for applying the gainmap to the base.\n");
                    sb.append("uniform sampler2D uGainmapTexSampler" + i2 + ";\n");
                    sb.append("uniform int uGainmapIsAlpha" + i2 + ";\n");
                    sb.append("uniform int uNoGamma" + i2 + ";\n");
                    sb.append("uniform int uSingleChannel" + i2 + ";\n");
                    sb.append("uniform vec4 uLogRatioMin" + i2 + ";\n");
                    sb.append("uniform vec4 uLogRatioMax" + i2 + ";\n");
                    sb.append("uniform vec4 uEpsilonSdr" + i2 + ";\n");
                    sb.append("uniform vec4 uEpsilonHdr" + i2 + ";\n");
                    sb.append("uniform vec4 uGainmapGamma" + i2 + ";\n");
                    sb.append("uniform float uDisplayRatioHdr" + i2 + ";\n");
                    sb.append("uniform float uDisplayRatioSdr" + i2 + ";\n");
                    sb.append("\n");
                } else if (i3 == 2) {
                    sb.append("uniform mat4 uLuminanceMatrix" + i2 + ";\n");
                }
            }
        }
        sb.append("void main() {\n vec4 videoColor = vec4(texture2D(uVideoTexSampler0, vVideoTexSamplingCoord0));\n vec4 fragColor = videoColor;\n");
        for (int i4 = 1; i4 <= i; i4++) {
            sb.append("        vec4 electricalOverlayColor% = getClampToBorderOverlayColor(\n      uOverlayTexSampler%, vOverlayTexSamplingCoord%, uOverlayAlphaScale%);\n".replace("%", Integer.toString(i4)));
            if (iArr == null) {
                str = "electricalOverlayColor";
            } else {
                int i5 = iArr[i4 - 1];
                if (i5 == 1) {
                    sb.append("        vec4 gainmap% = texture2D(uGainmapTexSampler%, vOverlayTexSamplingCoord%);\n  vec3 opticalBt709Color% = applyGainmap(\n      srgbEotf(electricalOverlayColor%), gainmap%, uGainmapIsAlpha%, uNoGamma%,\n      uSingleChannel%, uLogRatioMin%, uLogRatioMax%, uEpsilonSdr%, uEpsilonHdr%,\n      uGainmapGamma%, uDisplayRatioHdr%, uDisplayRatioSdr%);\n  vec4 opticalBt2020OverlayColor% =\n      vec4(scaleHdrLuminance(bt709ToBt2020(opticalBt709Color%)),           electricalOverlayColor%.a);".replace("%", Integer.toString(i4)));
                    str = "opticalBt2020OverlayColor";
                } else if (i5 == 2) {
                    sb.append("vec4 opticalOverlayColor% = uLuminanceMatrix% * srgbEotf(electricalOverlayColor%);\n".replace("%", Integer.toString(i4)));
                    str = "opticalOverlayColor";
                } else {
                    str = "electricalOverlayColor";
                }
            }
            Locale locale2 = Locale.US;
            sb.append("  fragColor = getMixColor(fragColor, " + str + i4 + ");\n");
        }
        sb.append("  gl_FragColor = fragColor;\n}\n");
        return sb.toString();
    }

    public static String k(int i) {
        StringBuilder sb = new StringBuilder("#version 100\nattribute vec4 aFramePosition;\nvarying vec2 vVideoTexSamplingCoord0;\n");
        for (int i2 = 1; i2 <= i; i2++) {
            String str = vqi.a;
            Locale locale = Locale.US;
            sb.append("uniform mat4 uTransformationMatrix" + i2 + ";\n");
            sb.append("uniform mat4 uVertexTransformationMatrix" + i2 + ";\n");
            sb.append("varying vec2 vOverlayTexSamplingCoord" + i2 + ";\n");
        }
        sb.append("vec2 getTexSamplingCoord(vec2 ndcPosition){\n  return vec2(ndcPosition.x * 0.5 + 0.5, ndcPosition.y * 0.5 + 0.5);\n}\nvoid main() {\n  gl_Position = aFramePosition;\n  vVideoTexSamplingCoord0 = getTexSamplingCoord(aFramePosition.xy);\n");
        for (int i3 = 1; i3 <= i; i3++) {
            sb.append("      vec4 aOverlayPosition% =\n  uVertexTransformationMatrix% * uTransformationMatrix% * aFramePosition;\nvOverlayTexSamplingCoord% = getTexSamplingCoord(aOverlayPosition%.xy);".replace("%", Integer.toString(i3)));
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override // defpackage.er0
    public final lag f(int i, int i2) {
        lag lagVar = new lag(i, i2);
        this.i.j = lagVar;
        a98 a98VarListIterator = this.j.listIterator(0);
        while (a98VarListIterator.hasNext()) {
            ((ey0) a98VarListIterator.next()).getClass();
        }
        return lagVar;
    }

    @Override // defpackage.er0
    public final void h(int i, long j) throws VideoFrameProcessingException {
        SparseIntArray sparseIntArray = this.m;
        SparseArray sparseArray = this.l;
        c98 c98Var = this.j;
        v30 v30Var = this.h;
        try {
            GLES20.glUseProgram(v30Var.b);
            tab.e();
            for (int i2 = 1; i2 <= c98Var.size(); i2++) {
                int i3 = i2 - 1;
                ey0 ey0Var = (ey0) c98Var.get(i3);
                int[] iArr = this.k;
                if (iArr != null) {
                    int i4 = iArr[i3];
                    if (i4 == 1) {
                        lvb.R(Objects.nonNull(ey0Var));
                        Bitmap bitmap = ey0Var.e;
                        lvb.R(bitmap.hasGainmap());
                        Gainmap gainmap = bitmap.getGainmap();
                        gainmap.getClass();
                        Gainmap gainmapF = rh.f(gainmap);
                        Gainmap gainmapD = yg7.d(sparseArray.get(i2));
                        if (gainmapD == null || !rzl.c(gainmapD, gainmapF)) {
                            sparseArray.put(i2, gainmapF);
                            if (sparseIntArray.get(i2, -1) == -1) {
                                Bitmap gainmapContents = gainmapF.getGainmapContents();
                                int iS = tab.s();
                                tab.y(gainmapContents, iS);
                                sparseIntArray.put(i2, iS);
                            } else {
                                tab.y(gainmapF.getGainmapContents(), sparseIntArray.get(i2));
                            }
                            v30Var.C(sparseIntArray.get(i2), c98Var.size() + i2, "uGainmapTexSampler" + i2);
                            rzl.e(v30Var, yg7.d(sparseArray.get(i2)), i2);
                        }
                    } else if (i4 == 2) {
                        float[] fArrJ = tab.j();
                        wjg wjgVar = ey0Var.f;
                        Matrix.scaleM(fArrJ, 0, 1.0f, 1.0f, 1.0f);
                        String str = vqi.a;
                        Locale locale = Locale.US;
                        v30Var.A("uLuminanceMatrix" + i2, fArrJ);
                    }
                }
                String str2 = vqi.a;
                Locale locale2 = Locale.US;
                v30Var.C(ey0Var.a(), i2, "uOverlayTexSampler" + i2);
                v30Var.A("uVertexTransformationMatrix" + i2, ey0Var.a);
                wjg wjgVar2 = ey0Var.f;
                Bitmap bitmap2 = ey0Var.d;
                bitmap2.getClass();
                int width = bitmap2.getWidth();
                Bitmap bitmap3 = ey0Var.d;
                bitmap3.getClass();
                v30Var.A("uTransformationMatrix" + i2, this.i.f(new lag(width, bitmap3.getHeight()), wjgVar2));
                v30Var.z("uOverlayAlphaScale" + i2, 1.0f);
            }
            v30Var.C(i, 0, "uVideoTexSampler0");
            v30Var.g();
            GLES20.glDrawArrays(5, 0, 4);
            tab.e();
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(j, e);
        }
    }

    @Override // defpackage.cn7
    public final void release() throws VideoFrameProcessingException {
        int i;
        c98 c98Var = this.j;
        try {
            this.a.c();
            try {
                GLES20.glDeleteProgram(this.h.b);
                tab.e();
                for (int i2 = 0; i2 < c98Var.size(); i2++) {
                    ey0 ey0Var = (ey0) c98Var.get(i2);
                    ey0Var.d = null;
                    int i3 = ey0Var.b;
                    if (i3 != -1) {
                        try {
                            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
                            tab.e();
                        } catch (GlUtil$GlException e) {
                            throw new VideoFrameProcessingException(e);
                        }
                    }
                    ey0Var.b = -1;
                    int[] iArr = this.k;
                    if (iArr != null && iArr[i2] == 1 && (i = this.m.get(i2, -1)) != -1) {
                        GLES20.glDeleteTextures(1, new int[]{i}, 0);
                        tab.e();
                    }
                }
            } catch (GlUtil$GlException e2) {
                throw new VideoFrameProcessingException(e2);
            }
        } catch (GlUtil$GlException e3) {
            throw new VideoFrameProcessingException(e3);
        }
    }
}
