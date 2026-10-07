package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class hzb extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ izb d;

    /* JADX WARN: Illegal instructions before constructor call */
    public hzb(izb izbVar, int i) {
        this.c = i;
        ezb ezbVar = ezb.a;
        int i2 = 4;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.d = izbVar;
                super(i2, bool);
                break;
            case 2:
                Boolean bool2 = Boolean.FALSE;
                this.d = izbVar;
                super(i2, bool2);
                break;
            case 3:
                Boolean bool3 = Boolean.FALSE;
                this.d = izbVar;
                super(i2, bool3);
                break;
            case 4:
                this.d = izbVar;
                super(i2, null);
                break;
            case 5:
                this.d = izbVar;
                super(i2, dzb.a);
                break;
            case 6:
                this.d = izbVar;
                super(i2, czb.b);
                break;
            case 7:
                this.d = izbVar;
                super(i2, ezbVar);
                break;
            case 8:
                this.d = izbVar;
                super(i2, ezbVar);
                break;
            default:
                Boolean bool4 = Boolean.FALSE;
                this.d = izbVar;
                super(i2, bool4);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        View view = null;
        izb izbVar = this.d;
        switch (i) {
            case 0:
                wme wmeVar = izbVar.q;
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (wmeVar.d() || zBooleanValue) {
                        View view2 = izbVar.D;
                        if (view2 != null) {
                            izbVar.removeView(view2);
                        }
                        if (zBooleanValue) {
                            view = (View) wmeVar.getValue();
                        } else {
                            wmeVar.a();
                        }
                        if (view != null) {
                            izbVar.addView(view);
                            izbVar.requestLayout();
                        }
                        izbVar.D = view;
                    }
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    View view3 = izbVar.D;
                    if (view3 != null) {
                        izbVar.removeView(view3);
                    }
                    wme wmeVar2 = izbVar.r;
                    if (zBooleanValue2) {
                        view = (View) wmeVar2.getValue();
                    } else {
                        wmeVar2.a();
                    }
                    if (view != null) {
                        izbVar.addView(view);
                        izbVar.requestLayout();
                    }
                    izbVar.D = view;
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    wme wmeVar3 = izbVar.q;
                    if (wmeVar3.d()) {
                        ((er) wmeVar3.getValue()).setChecked(zBooleanValue3);
                    }
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    wme wmeVar4 = izbVar.r;
                    if (wmeVar4.d()) {
                        ((s6c) wmeVar4.getValue()).setChecked(zBooleanValue4);
                    }
                }
                break;
            case 4:
                if (!cqk.d(obj, obj2)) {
                    kbc kbcVarH = (kbc) obj2;
                    if (kbcVarH == null) {
                        kbcVarH = pq3.j.h(izbVar);
                    }
                    izbVar.onThemeChanged(kbcVarH);
                }
                break;
            case 5:
                if (!cqk.d(obj, obj2)) {
                    izbVar.r();
                }
                break;
            case 6:
                if (!cqk.d(obj, obj2)) {
                    izb.d(izbVar);
                }
                break;
            case 7:
                if (!cqk.d(obj, obj2)) {
                    izbVar.requestLayout();
                    izbVar.invalidate();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    izbVar.requestLayout();
                    izbVar.invalidate();
                }
                break;
        }
    }
}
