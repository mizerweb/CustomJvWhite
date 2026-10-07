package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qn8 {
    public static final on8 e = new on8(0);
    public static final on8 f = new on8(1);
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;

    public qn8(int i, int i2) {
        this.a = 0;
        this.b = -1;
        this.c = i2;
        this.d = i;
    }

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int d(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public boolean a(lfe lfeVar) {
        return true;
    }

    public void b(RecyclerView recyclerView, lfe lfeVar) {
        View view = lfeVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = i7j.a;
            y6j.k(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public abstract String e();

    public float f(float f2) {
        return f2;
    }

    public float g() {
        return 0.5f;
    }

    public boolean h() {
        return this.b == 1;
    }

    public boolean i() {
        return this.b == 2;
    }

    public boolean j() {
        return this.b == 0;
    }

    public int k(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.b == -1) {
            this.b = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (e.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.b)));
        if (interpolation == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    public boolean l() {
        return true;
    }

    public void m(Canvas canvas, RecyclerView recyclerView, lfe lfeVar, float f2, float f3, int i, boolean z) {
        View view = lfeVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = i7j.a;
            Float fValueOf = Float.valueOf(y6j.e(view));
            int childCount = recyclerView.getChildCount();
            float f4 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = i7j.a;
                    float fE = y6j.e(childAt);
                    if (fE > f4) {
                        f4 = fE;
                    }
                }
            }
            y6j.k(view, f4 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    public abstract boolean n(lfe lfeVar, lfe lfeVar2);

    public void o(lfe lfeVar, int i) {
    }

    public String p() {
        int i = this.b;
        if (i == 0) {
            return "root";
        }
        if (i != 1) {
            return i != 2 ? "?" : "Object";
        }
        return "Array";
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder(64);
                int i = this.b;
                if (i != 0) {
                    if (i != 1) {
                        sb.append('{');
                        String strE = e();
                        if (strE != null) {
                            sb.append('\"');
                            int[] iArr = lt2.j;
                            int length = iArr.length;
                            int length2 = strE.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                char cCharAt = strE.charAt(i2);
                                if (cCharAt >= length || iArr[cCharAt] == 0) {
                                    sb.append(cCharAt);
                                } else {
                                    sb.append('\\');
                                    int i3 = iArr[cCharAt];
                                    if (i3 < 0) {
                                        sb.append("u00");
                                        char[] cArr = lt2.a;
                                        sb.append(cArr[cCharAt >> 4]);
                                        sb.append(cArr[cCharAt & 15]);
                                    } else {
                                        sb.append((char) i3);
                                    }
                                }
                            }
                            sb.append('\"');
                        } else {
                            sb.append('?');
                        }
                        sb.append('}');
                    } else {
                        sb.append('[');
                        int i4 = this.c;
                        sb.append(i4 >= 0 ? i4 : 0);
                        sb.append(']');
                    }
                } else {
                    sb.append("/");
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qn8() {
        this.a = 1;
    }
}
