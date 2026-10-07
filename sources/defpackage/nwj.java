package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nwj implements View.OnApplyWindowInsetsListener {
    public final tu3 a;
    public ixj b;

    public nwj(View view, tu3 tu3Var) {
        ixj ixjVarB;
        this.a = tu3Var;
        WeakHashMap weakHashMap = i7j.a;
        ixj ixjVarA = z6j.a(view);
        if (ixjVarA != null) {
            int i = Build.VERSION.SDK_INT;
            ixjVarB = (i >= 34 ? new wwj(ixjVarA) : i >= 30 ? new vwj(ixjVarA) : i >= 29 ? new uwj(ixjVarA) : new twj(ixjVarA)).b();
        } else {
            ixjVarB = null;
        }
        this.b = ixjVarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = ixj.g(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        ixj ixjVarG = ixj.g(windowInsets, view);
        exj exjVar = ixjVarG.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = i7j.a;
            this.b = z6j.a(view);
        }
        if (this.b == null) {
            this.b = ixjVarG;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            tu3 tu3VarI = owj.i(view);
            if (tu3VarI == null || !Objects.equals((ixj) tu3VarI.b, ixjVarG)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                ixj ixjVar = this.b;
                int i = 1;
                while (i <= 512) {
                    mi8 mi8VarF = exjVar.f(i);
                    mi8 mi8VarF2 = ixjVar.a.f(i);
                    int i2 = mi8VarF.a;
                    int i3 = mi8VarF.d;
                    int i4 = mi8VarF.c;
                    int i5 = mi8VarF.b;
                    int i6 = mi8VarF2.a;
                    int i7 = mi8VarF2.d;
                    int[] iArr3 = iArr;
                    int i8 = mi8VarF2.c;
                    int i9 = mi8VarF2.b;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = ixjVarG;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    ixj ixjVar2 = this.b;
                    if ((i10 & 8) != 0) {
                        interpolator = owj.e;
                    } else if ((i11 & 8) != 0) {
                        interpolator = owj.f;
                    } else if ((i10 & 519) != 0) {
                        interpolator = owj.g;
                    } else {
                        interpolator = (i11 & 519) != 0 ? owj.h : null;
                    }
                    swj swjVar = new swj(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    swjVar.a.d(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(swjVar.a.a());
                    mi8 mi8VarF3 = exjVar.f(i12);
                    mi8 mi8VarF4 = ixjVar2.a.f(i12);
                    int iMin = Math.min(mi8VarF3.a, mi8VarF4.a);
                    int i13 = mi8VarF3.b;
                    int i14 = mi8VarF4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = mi8VarF3.c;
                    int i16 = mi8VarF4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = mi8VarF3.d;
                    int i18 = mi8VarF4.d;
                    wze wzeVar = new wze(mi8.b(iMin, iMin2, iMin3, Math.min(i17, i18)), 12, mi8.b(Math.max(mi8VarF3.a, mi8VarF4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                    owj.f(view, swjVar, ixjVarG, false);
                    duration.addUpdateListener(new mwj(swjVar, ixjVarG, ixjVar2, i12, view));
                    duration.addListener(new al(swjVar, 5, view));
                    bdc.a(view, new wn2(view, swjVar, wzeVar, duration, 3, false));
                    this.b = ixjVarG;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
