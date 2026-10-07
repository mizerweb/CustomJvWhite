package defpackage;

import android.graphics.RuntimeShader;
import android.opengl.GLES20;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class we {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ we(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public int a(String str) {
        String str2;
        gn7 gn7Var = (gn7) this.b;
        LinkedHashMap linkedHashMap = gn7Var.o;
        Object objValueOf = linkedHashMap.get(str);
        if (objValueOf == null) {
            if (str.length() > 0) {
                str2 = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            } else {
                str2 = str;
            }
            objValueOf = Integer.valueOf(GLES20.glGetUniformLocation(gn7Var.f, "u".concat(str2)));
            linkedHashMap.put(str, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }

    public final void b(int i, String str) {
        switch (this.a) {
            case 0:
                xe xeVar = (xe) this.b;
                float[] fArr = xeVar.d;
                fArr[0] = ((i >> 16) & 255) / 255.0f;
                fArr[1] = ((i >> 8) & 255) / 255.0f;
                fArr[2] = (i & 255) / 255.0f;
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                RuntimeShader runtimeShader = xeVar.b;
                if (runtimeShader != null) {
                    runtimeShader.setFloatUniform(str, fArr);
                }
                break;
            default:
                float f = ((i >> 16) & 255) / 255.0f;
                float f2 = ((i >> 8) & 255) / 255.0f;
                float f3 = (i & 255) / 255.0f;
                float f4 = ((i >> 24) & 255) / 255.0f;
                int iA = a(str);
                if (iA >= 0) {
                    GLES20.glUniform4f(iA, f, f2, f3, f4);
                }
                break;
        }
    }

    public final void c(String str, float f) {
        switch (this.a) {
            case 0:
                RuntimeShader runtimeShader = ((xe) this.b).b;
                if (runtimeShader != null) {
                    runtimeShader.setFloatUniform(str, f);
                }
                break;
            default:
                int iA = a(str);
                if (iA >= 0) {
                    GLES20.glUniform1f(iA, f);
                }
                break;
        }
    }

    public final void d(String str, float f, float f2) {
        switch (this.a) {
            case 0:
                xe xeVar = (xe) this.b;
                float[] fArr = xeVar.e;
                fArr[0] = 1.0f;
                fArr[1] = f2;
                RuntimeShader runtimeShader = xeVar.b;
                if (runtimeShader != null) {
                    runtimeShader.setFloatUniform("vignetteScale", fArr);
                }
                break;
            default:
                int iA = a(str);
                if (iA >= 0) {
                    GLES20.glUniform2f(iA, f, f2);
                }
                break;
        }
    }
}
