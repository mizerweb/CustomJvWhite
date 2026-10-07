package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q6c extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ r6c d;

    /* JADX WARN: Illegal instructions before constructor call */
    public q6c(r6c r6cVar, int i) {
        this.c = i;
        int i2 = 4;
        this.d = r6cVar;
        switch (i) {
            case 1:
                super(i2, o6c.a);
                break;
            default:
                super(i2, i6c.a);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        r6c r6cVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    r6cVar.setIndicatorColor(r6c.e((k6c) obj2, r6cVar.getCurrentTheme()));
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    p6c p6cVar = (p6c) obj2;
                    if (cqk.d(p6cVar, l6c.a)) {
                        r6cVar.setIndicatorSize(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
                        r6cVar.setTrackThickness(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                    } else if (cqk.d(p6cVar, m6c.a)) {
                        r6cVar.setIndicatorSize(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                        r6cVar.setTrackThickness(gm0.K(2.0f * yl5.d().getDisplayMetrics().density));
                    } else if (cqk.d(p6cVar, n6c.a)) {
                        r6cVar.setIndicatorSize(gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                        r6cVar.setTrackThickness(gm0.K(1.0f * yl5.d().getDisplayMetrics().density));
                    } else if (!cqk.d(p6cVar, o6c.a)) {
                        ore.o();
                    }
                    r6cVar.requestLayout();
                    r6cVar.invalidate();
                }
                break;
        }
    }
}
