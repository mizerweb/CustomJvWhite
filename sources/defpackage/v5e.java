package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v5e extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ w5e d;

    /* JADX WARN: Illegal instructions before constructor call */
    public v5e(w5e w5eVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 2:
                this.d = w5eVar;
                super(i2, 0);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.d = w5eVar;
                super(i2, bool);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        w5e w5eVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    if (!zBooleanValue && zBooleanValue2) {
                        w5eVar.a(true);
                    } else {
                        w5eVar.invalidate();
                    }
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    w5eVar.i.setText(((s5e) obj2).a);
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    pu4.c(w5eVar.j, Integer.valueOf(iIntValue), false, 6);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5e(s5e s5eVar, w5e w5eVar) {
        super(4, s5eVar);
        this.c = 1;
        this.d = w5eVar;
    }
}
