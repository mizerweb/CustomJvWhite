package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public final class fx3 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gx3 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public fx3(gx3 gx3Var, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 1:
                Boolean bool = Boolean.TRUE;
                this.d = gx3Var;
                super(i2, bool);
                break;
            case 2:
            case 3:
            default:
                Boolean bool2 = Boolean.FALSE;
                this.d = gx3Var;
                super(i2, bool2);
                break;
            case 4:
                this.d = gx3Var;
                super(i2, -1);
                break;
            case 5:
                this.d = gx3Var;
                super(i2, null);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        gx3 gx3Var = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    gx3Var.invalidate();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    gx3Var.invalidate();
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    gx3Var.h.setStrokeWidth(fFloatValue);
                    gx3Var.g.setStrokeWidth(fFloatValue);
                    gx3Var.i.setStrokeWidth(fFloatValue);
                    gx3Var.invalidate();
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    gx3Var.invalidate();
                }
                break;
            case 4:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    gx3Var.j.setColor(iIntValue);
                    gx3Var.h.setColor(iIntValue);
                    gx3Var.i.setColor(tre.I0(iIntValue, 0.3f));
                    gx3Var.invalidate();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    int[] iArr = (int[]) obj2;
                    gx3Var.j.setShader(iArr != null ? new LinearGradient(gx3Var.getWidth(), gx3Var.getHeight(), 0.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP) : null);
                    gx3Var.invalidate();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx3(Float f, gx3 gx3Var, int i) {
        super(4, f);
        this.c = i;
        this.d = gx3Var;
    }
}
