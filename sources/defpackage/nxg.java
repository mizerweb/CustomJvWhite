package defpackage;

import android.graphics.CornerPathEffect;

/* JADX INFO: loaded from: classes2.dex */
public final class nxg extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ oxg d;

    /* JADX WARN: Illegal instructions before constructor call */
    public nxg(oxg oxgVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 3:
                Float fValueOf = Float.valueOf(0.0f);
                this.d = oxgVar;
                super(i2, fValueOf);
                break;
            default:
                this.d = oxgVar;
                super(i2, -1);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        oxg oxgVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    oxgVar.invalidate();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    CornerPathEffect cornerPathEffect = fFloatValue > 0.0f ? new CornerPathEffect(fFloatValue) : null;
                    oxgVar.c = cornerPathEffect;
                    oxgVar.b.setPathEffect(cornerPathEffect);
                    oxgVar.b();
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    float fFloatValue2 = ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    oxgVar.n.a = fFloatValue2;
                    oxgVar.b();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    float fFloatValue3 = ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    oxgVar.n.b = fFloatValue3;
                    oxgVar.b();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxg(Float f, oxg oxgVar, int i) {
        super(4, f);
        this.c = i;
        this.d = oxgVar;
    }
}
