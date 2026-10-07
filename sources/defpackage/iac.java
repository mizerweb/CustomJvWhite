package defpackage;

import android.text.InputFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class iac extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ jac d;

    /* JADX WARN: Illegal instructions before constructor call */
    public iac(jac jacVar, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 4:
                Boolean bool = Boolean.FALSE;
                this.d = jacVar;
                super(i2, bool);
                break;
            case 5:
            case 8:
            default:
                Boolean bool2 = Boolean.FALSE;
                this.d = jacVar;
                super(i2, bool2);
                break;
            case 6:
                this.d = jacVar;
                super(i2, 0);
                break;
            case 7:
                this.d = jacVar;
                super(i2, hac.a);
                break;
            case 9:
                this.d = jacVar;
                super(i2, "");
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        jac jacVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    jacVar.onThemeChanged(jacVar.getCurrentTheme());
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    jacVar.onThemeChanged(jacVar.getCurrentTheme());
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    gac gacVar = (gac) obj2;
                    if (gacVar != null) {
                        jacVar.n(jacVar.getCurrentTheme(), gacVar);
                    }
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    kbc kbcVarH = (kbc) obj2;
                    if (kbcVarH == null) {
                        kbcVarH = pq3.j.h(jacVar);
                    }
                    jacVar.onThemeChanged(kbcVarH);
                }
                break;
            case 4:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    p1c p1cVar = jacVar.b;
                    if (!zBooleanValue) {
                        p1cVar.setOnFocusChangeListener(null);
                    } else {
                        p1cVar.setOnFocusChangeListener(new xga(1, new ol0(21, jacVar)));
                    }
                }
                break;
            case 5:
                if (!cqk.d(obj, obj2)) {
                    jac.g(jacVar, (ny8) obj2);
                }
                break;
            case 6:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    jac.h(jacVar, iIntValue, jacVar.getText().length());
                }
                break;
            case 7:
                if (!cqk.d(obj, obj2)) {
                    jac.i(jacVar, (hac) obj2);
                }
                break;
            case 8:
                if (!cqk.d(obj, obj2)) {
                    jacVar.onThemeChanged(jacVar.getCurrentTheme());
                }
                break;
            case 9:
                if (!cqk.d(obj, obj2)) {
                    jacVar.b.setHint((String) obj2);
                }
                break;
            case 10:
                if (!cqk.d(obj, obj2)) {
                    jacVar.b.setFilters((InputFilter[]) obj2);
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    jacVar.onThemeChanged(jacVar.getCurrentTheme());
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iac(Object obj, jac jacVar, int i) {
        super(4, obj);
        this.c = i;
        this.d = jacVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iac(jac jacVar, int i, boolean z) {
        super(4, null);
        this.c = i;
        this.d = jacVar;
    }
}
