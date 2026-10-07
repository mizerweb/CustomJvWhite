package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g7d extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ h7d d;

    /* JADX WARN: Illegal instructions before constructor call */
    public g7d(h7d h7dVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.d = h7dVar;
                super(i2, bool);
                break;
            case 2:
                this.d = h7dVar;
                super(i2, null);
                break;
            default:
                this.d = h7dVar;
                super(i2, 0);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        h7d h7dVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    pu4.c(h7dVar.e, Integer.valueOf(iIntValue), false, 6);
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (zBooleanValue) {
                        h7dVar.getIconView().setVisibility(0);
                    } else if (n7j.o(h7dVar.d)) {
                        h7dVar.getIconView().setVisibility(8);
                    }
                    xac bubbleColors = h7dVar.getBubbleColors();
                    if (bubbleColors != null) {
                        h7d.b(h7dVar, bubbleColors);
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    xac xacVar = (xac) obj2;
                    if (xacVar != null) {
                        h7d.b(h7dVar, xacVar);
                    }
                }
                break;
        }
    }
}
