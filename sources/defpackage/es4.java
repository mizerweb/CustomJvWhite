package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class es4 implements as4 {
    public AnimatorSet b;
    public tp2 c;
    public tp2 d;
    public final ny8 e;
    public final ny8 f;
    public cf7 h;
    public cf7 i;
    public yr4 j;
    public yr4 k;
    public final LinkedHashSet a = new LinkedHashSet();
    public boolean g = true;

    public es4() {
        final int i = 0;
        this.e = rx8.P(3, new af7(this) { // from class: bs4
            public final /* synthetic */ es4 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                final es4 es4Var = this.b;
                switch (i2) {
                    case 0:
                        final int i3 = 1;
                        return new View.OnLayoutChangeListener() { // from class: cs4
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                                int i12 = i3;
                                es4 es4Var2 = es4Var;
                                switch (i12) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        Integer numH = n7j.h(view);
                                        int iIntValue = numH != null ? numH.intValue() : 0;
                                        yr4 yr4Var = es4Var2.k;
                                        if (measuredHeight != yr4Var.a || iIntValue != yr4Var.b) {
                                            es4Var2.k = yr4.a(yr4Var, measuredHeight, iIntValue, false, 4);
                                            Iterator it = es4Var2.a.iterator();
                                            while (it.hasNext()) {
                                                ((zr4) it.next()).A(es4Var2.k);
                                            }
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        Integer numL = n7j.l(view);
                                        int iIntValue2 = numL != null ? numL.intValue() : 0;
                                        yr4 yr4Var2 = es4Var2.j;
                                        if (measuredHeight2 != yr4Var2.a || iIntValue2 != yr4Var2.b) {
                                            es4Var2.j = yr4.a(yr4Var2, measuredHeight2, iIntValue2, false, 4);
                                            Iterator it2 = es4Var2.a.iterator();
                                            while (it2.hasNext()) {
                                                ((zr4) it2.next()).G(es4Var2.j);
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                    default:
                        final int i4 = 0;
                        return new View.OnLayoutChangeListener() { // from class: cs4
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                                int i13 = i4;
                                es4 es4Var2 = es4Var;
                                switch (i13) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        Integer numH = n7j.h(view);
                                        int iIntValue = numH != null ? numH.intValue() : 0;
                                        yr4 yr4Var = es4Var2.k;
                                        if (measuredHeight != yr4Var.a || iIntValue != yr4Var.b) {
                                            es4Var2.k = yr4.a(yr4Var, measuredHeight, iIntValue, false, 4);
                                            Iterator it = es4Var2.a.iterator();
                                            while (it.hasNext()) {
                                                ((zr4) it.next()).A(es4Var2.k);
                                            }
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        Integer numL = n7j.l(view);
                                        int iIntValue2 = numL != null ? numL.intValue() : 0;
                                        yr4 yr4Var2 = es4Var2.j;
                                        if (measuredHeight2 != yr4Var2.a || iIntValue2 != yr4Var2.b) {
                                            es4Var2.j = yr4.a(yr4Var2, measuredHeight2, iIntValue2, false, 4);
                                            Iterator it2 = es4Var2.a.iterator();
                                            while (it2.hasNext()) {
                                                ((zr4) it2.next()).G(es4Var2.j);
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                }
            }
        });
        final int i2 = 1;
        this.f = rx8.P(3, new af7(this) { // from class: bs4
            public final /* synthetic */ es4 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                final es4 es4Var = this.b;
                switch (i3) {
                    case 0:
                        final int i4 = 1;
                        return new View.OnLayoutChangeListener() { // from class: cs4
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                                int i13 = i4;
                                es4 es4Var2 = es4Var;
                                switch (i13) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        Integer numH = n7j.h(view);
                                        int iIntValue = numH != null ? numH.intValue() : 0;
                                        yr4 yr4Var = es4Var2.k;
                                        if (measuredHeight != yr4Var.a || iIntValue != yr4Var.b) {
                                            es4Var2.k = yr4.a(yr4Var, measuredHeight, iIntValue, false, 4);
                                            Iterator it = es4Var2.a.iterator();
                                            while (it.hasNext()) {
                                                ((zr4) it.next()).A(es4Var2.k);
                                            }
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        Integer numL = n7j.l(view);
                                        int iIntValue2 = numL != null ? numL.intValue() : 0;
                                        yr4 yr4Var2 = es4Var2.j;
                                        if (measuredHeight2 != yr4Var2.a || iIntValue2 != yr4Var2.b) {
                                            es4Var2.j = yr4.a(yr4Var2, measuredHeight2, iIntValue2, false, 4);
                                            Iterator it2 = es4Var2.a.iterator();
                                            while (it2.hasNext()) {
                                                ((zr4) it2.next()).G(es4Var2.j);
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                    default:
                        final int i5 = 0;
                        return new View.OnLayoutChangeListener() { // from class: cs4
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                                int i14 = i5;
                                es4 es4Var2 = es4Var;
                                switch (i14) {
                                    case 0:
                                        int measuredHeight = view.getMeasuredHeight();
                                        Integer numH = n7j.h(view);
                                        int iIntValue = numH != null ? numH.intValue() : 0;
                                        yr4 yr4Var = es4Var2.k;
                                        if (measuredHeight != yr4Var.a || iIntValue != yr4Var.b) {
                                            es4Var2.k = yr4.a(yr4Var, measuredHeight, iIntValue, false, 4);
                                            Iterator it = es4Var2.a.iterator();
                                            while (it.hasNext()) {
                                                ((zr4) it.next()).A(es4Var2.k);
                                            }
                                        }
                                        break;
                                    default:
                                        int measuredHeight2 = view.getMeasuredHeight();
                                        Integer numL = n7j.l(view);
                                        int iIntValue2 = numL != null ? numL.intValue() : 0;
                                        yr4 yr4Var2 = es4Var2.j;
                                        if (measuredHeight2 != yr4Var2.a || iIntValue2 != yr4Var2.b) {
                                            es4Var2.j = yr4.a(yr4Var2, measuredHeight2, iIntValue2, false, 4);
                                            Iterator it2 = es4Var2.a.iterator();
                                            while (it2.hasNext()) {
                                                ((zr4) it2.next()).G(es4Var2.j);
                                            }
                                        }
                                        break;
                                }
                            }
                        };
                }
            }
        });
        int i3 = 2;
        ik4 ik4Var = new ik4(i3);
        this.h = ik4Var;
        this.i = new ik4(i3);
        this.j = new yr4();
        this.k = new yr4();
        ik4Var.invoke(true);
    }

    public static final void a(es4 es4Var, boolean z) {
        es4Var.b = null;
        tp2 tp2Var = es4Var.c;
        if (tp2Var != null) {
            tp2Var.setTag(R.id.call_animation_fade, null);
        }
        tp2 tp2Var2 = es4Var.d;
        if (tp2Var2 != null) {
            tp2Var2.setTag(R.id.call_animation_fade, null);
        }
        es4Var.h.invoke(Boolean.valueOf(z));
        Iterator it = es4Var.a.iterator();
        while (it.hasNext()) {
            ((zr4) it.next()).M();
        }
    }

    public static int c(int i, boolean z) {
        if (i == 48 && z) {
            return 1;
        }
        return ((i != 48 || z) && i == 80 && !z) ? 1 : -1;
    }

    public static ylc d(boolean z, yr4 yr4Var, int i) {
        float fB = yr4Var.b();
        float fC = c(i, !z) * fB;
        float f = (i == 48 ? 1.0f : -1.0f) * (z ? 1.0f : -1.0f) * fB;
        return new ylc(Float.valueOf(f), Float.valueOf(f + fC));
    }

    public final void b(zr4 zr4Var) {
        this.a.add(zr4Var);
    }

    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 ??, new type: tp2
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v1 ??, new type: tp2
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void e(boolean r22) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es4.e(boolean):void");
    }
}
