package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d8c extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ e8c d;

    /* JADX WARN: Illegal instructions before constructor call */
    public d8c(e8c e8cVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 2:
                this.d = e8cVar;
                super(i2, 0);
                break;
            case 3:
                Float fValueOf = Float.valueOf(0.0f);
                this.d = e8cVar;
                super(i2, fValueOf);
                break;
            case 4:
                Float fValueOf2 = Float.valueOf(0.0f);
                this.d = e8cVar;
                super(i2, fValueOf2);
                break;
            case 5:
                Float fValueOf3 = Float.valueOf(0.0f);
                this.d = e8cVar;
                super(i2, fValueOf3);
                break;
            case 6:
                Float fValueOf4 = Float.valueOf(0.0f);
                this.d = e8cVar;
                super(i2, fValueOf4);
                break;
            case 7:
                this.d = e8cVar;
                super(i2, null);
                break;
            default:
                this.d = e8cVar;
                super(i2, 0);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        e8c e8cVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    e8cVar.onThemeChanged(e8cVar.getCurrentTheme());
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    e8cVar.onThemeChanged(e8cVar.getCurrentTheme());
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    e8cVar.onThemeChanged(e8cVar.getCurrentTheme());
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    e8cVar.requestLayout();
                }
                break;
            case 4:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    e8cVar.requestLayout();
                }
                break;
            case 5:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    e8cVar.requestLayout();
                }
                break;
            case 6:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).floatValue();
                    ((Number) obj).floatValue();
                    e8cVar.requestLayout();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    kbc kbcVarH = (kbc) obj2;
                    if (kbcVarH == null) {
                        kbcVarH = pq3.j.h(e8cVar);
                    }
                    e8cVar.onThemeChanged(kbcVarH);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8c(Integer num, e8c e8cVar) {
        super(4, num);
        this.c = 0;
        this.d = e8cVar;
    }
}
