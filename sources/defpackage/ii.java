package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ii {
    public static final ViewGroup.MarginLayoutParams b;
    public final LinearLayoutManager a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public ii(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public static boolean a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0 A[LOOP:2: B:44:0x00a3->B:48:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00af A[SYNTHETIC] */
    public final boolean b() {
        int iW;
        int i;
        int top;
        int i2;
        int bottom;
        int i3;
        LinearLayoutManager linearLayoutManager = this.a;
        int iW2 = linearLayoutManager.w();
        if (iW2 != 0) {
            boolean z = linearLayoutManager.p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iW2, 2);
            for (int i4 = 0; i4 < iW2; i4++) {
                View viewV = linearLayoutManager.v(i4);
                if (viewV == null) {
                    ore.k("null view contained in the view hierarchy");
                    return false;
                }
                ViewGroup.LayoutParams layoutParams = viewV.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : b;
                int[] iArr2 = iArr[i4];
                if (z) {
                    top = viewV.getLeft();
                    i2 = marginLayoutParams.leftMargin;
                } else {
                    top = viewV.getTop();
                    i2 = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i2;
                int[] iArr3 = iArr[i4];
                if (z) {
                    bottom = viewV.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    bottom = viewV.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i3;
            }
            Arrays.sort(iArr, new lv5(4));
            int i5 = 1;
            while (true) {
                if (i5 >= iW2) {
                    int[] iArr4 = iArr[0];
                    int i6 = iArr4[1];
                    int i7 = iArr4[0];
                    int i8 = i6 - i7;
                    if (i7 <= 0 && iArr[iW2 - 1][1] >= i8) {
                        if (linearLayoutManager.w() <= 1) {
                        }
                    }
                } else if (iArr[i5 - 1][1] == iArr[i5][0]) {
                    i5++;
                }
                iW = linearLayoutManager.w();
                for (i = 0; i < iW; i++) {
                    if (a(linearLayoutManager.v(i))) {
                        return true;
                    }
                }
            }
        } else if (linearLayoutManager.w() <= 1) {
            iW = linearLayoutManager.w();
            while (i < iW) {
                if (a(linearLayoutManager.v(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
