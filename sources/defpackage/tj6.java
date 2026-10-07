package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class tj6 extends r2i {
    public static final String[] E = {"android:visibility:visibility", "android:visibility:parent"};
    public final int D;

    public tj6() {
        this.D = 3;
    }

    public static void O(c3i c3iVar) {
        View view = c3iVar.b;
        int visibility = view.getVisibility();
        HashMap map = c3iVar.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float Q(c3i c3iVar, float f) {
        Float f2;
        return (c3iVar == null || (f2 = (Float) c3iVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static laj R(c3i c3iVar, c3i c3iVar2) {
        laj lajVar = new laj();
        lajVar.a = false;
        lajVar.b = false;
        if (c3iVar != null) {
            HashMap map = c3iVar.a;
            if (map.containsKey("android:visibility:visibility")) {
                lajVar.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                lajVar.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                lajVar.c = -1;
                lajVar.e = null;
            }
        } else {
            lajVar.c = -1;
            lajVar.e = null;
        }
        if (c3iVar2 != null) {
            HashMap map2 = c3iVar2.a;
            if (map2.containsKey("android:visibility:visibility")) {
                lajVar.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                lajVar.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                lajVar.d = -1;
                lajVar.f = null;
            }
        } else {
            lajVar.d = -1;
            lajVar.f = null;
        }
        if (c3iVar != null && c3iVar2 != null) {
            int i = lajVar.c;
            int i2 = lajVar.d;
            if (i != i2 || lajVar.e != lajVar.f) {
                if (i != i2) {
                    if (i == 0) {
                        lajVar.b = false;
                        lajVar.a = true;
                        return lajVar;
                    }
                    if (i2 == 0) {
                        lajVar.b = true;
                        lajVar.a = true;
                        return lajVar;
                    }
                } else {
                    if (lajVar.f == null) {
                        lajVar.b = false;
                        lajVar.a = true;
                        return lajVar;
                    }
                    if (lajVar.e == null) {
                        lajVar.b = true;
                        lajVar.a = true;
                        return lajVar;
                    }
                }
            }
        } else {
            if (c3iVar == null && lajVar.d == 0) {
                lajVar.b = true;
                lajVar.a = true;
                return lajVar;
            }
            if (c3iVar2 == null && lajVar.c == 0) {
                lajVar.b = false;
                lajVar.a = true;
            }
        }
        return lajVar;
    }

    public final ObjectAnimator P(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        q9j.d(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, q9j.b, f2);
        sj6 sj6Var = new sj6(view);
        objectAnimatorOfFloat.addListener(sj6Var);
        q().a(sj6Var);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.r2i
    public final void e(c3i c3iVar) {
        O(c3iVar);
    }

    @Override // defpackage.r2i
    public final void h(c3i c3iVar) {
        O(c3iVar);
        View view = c3iVar.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(q9j.a(view)) : Float.valueOf(0.0f);
        }
        c3iVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (R(p(r3, false), t(r3, false)).a != false) goto L9;
     */
    @Override // defpackage.r2i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator l(android.view.ViewGroup r19, defpackage.c3i r20, defpackage.c3i r21) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj6.l(android.view.ViewGroup, c3i, c3i):android.animation.Animator");
    }

    @Override // defpackage.r2i
    public final String[] s() {
        return E;
    }

    @Override // defpackage.r2i
    public final boolean v(c3i c3iVar, c3i c3iVar2) {
        if (c3iVar == null && c3iVar2 == null) {
            return false;
        }
        if (c3iVar != null && c3iVar2 != null && c3iVar2.a.containsKey("android:visibility:visibility") != c3iVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        laj lajVarR = R(c3iVar, c3iVar2);
        if (lajVarR.a) {
            return lajVarR.c == 0 || lajVarR.d == 0;
        }
        return false;
    }

    public tj6(int i) {
        this();
        this.D = i;
    }
}
