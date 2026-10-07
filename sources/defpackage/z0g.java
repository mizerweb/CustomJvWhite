package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;

/* JADX INFO: loaded from: classes.dex */
public final class z0g extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ a1g d;

    /* JADX WARN: Illegal instructions before constructor call */
    public z0g(a1g a1gVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 2:
                this.d = a1gVar;
                super(i2, y0g.a);
                break;
            case 3:
                this.d = a1gVar;
                super(i2, 8000L);
                break;
            case 4:
                this.d = a1gVar;
                super(i2, null);
                break;
            case 5:
                Boolean bool = Boolean.TRUE;
                this.d = a1gVar;
                super(i2, bool);
                break;
            default:
                this.d = a1gVar;
                super(i2, x0g.a);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        a1g a1gVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    ((g51) a1gVar.b.getValue()).a(pq3.j.e(a1gVar.a).m(), a1gVar.a(), a1gVar.b());
                    a1gVar.invalidateSelf();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    a1gVar.invalidateSelf();
                }
                break;
            case 2:
                awd awdVar = a1gVar.d;
                ObjectAnimator objectAnimator = a1gVar.f;
                if (!cqk.d(obj, obj2)) {
                    int iOrdinal = ((y0g) obj2).ordinal();
                    if (iOrdinal == 0) {
                        objectAnimator.setValues(PropertyValuesHolder.ofFloat(awdVar, 0.0f, 359.0f));
                    } else if (iOrdinal != 1) {
                        ore.o();
                    } else {
                        objectAnimator.setValues(PropertyValuesHolder.ofFloat(awdVar, 359.0f, 0.0f));
                    }
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    long jLongValue = ((Number) obj2).longValue();
                    ((Number) obj).longValue();
                    a1gVar.f.setDuration(jLongValue);
                }
                break;
            case 4:
                if (!cqk.d(obj, obj2)) {
                    a1gVar.invalidateSelf();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (zBooleanValue) {
                        a1gVar.d();
                    } else {
                        ObjectAnimator objectAnimator2 = a1gVar.e;
                        if (objectAnimator2.isRunning()) {
                            objectAnimator2.cancel();
                        }
                    }
                    a1gVar.invalidateSelf();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0g(Integer num, a1g a1gVar) {
        super(4, num);
        this.c = 1;
        this.d = a1gVar;
    }
}
