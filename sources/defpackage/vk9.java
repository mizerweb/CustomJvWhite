package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import one.me.main.MainScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class vk9 extends FrameLayout implements pr3, chd {
    public final /* synthetic */ MainScreen a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk9(MainScreen mainScreen, Context context) {
        super(context);
        this.a = mainScreen;
    }

    @Override // defpackage.pr3
    public final or3 B0(boolean z, boolean z2) {
        View viewFindViewById;
        View viewFindViewById2;
        or3 or3VarB0;
        a8g a8gVar = MainScreen.u;
        MainScreen mainScreen = this.a;
        hve hveVarV1 = mainScreen.v1();
        Object objC = hveVarV1 != null ? rx8.C(hveVarV1) : null;
        pr3 pr3Var = objC instanceof pr3 ? (pr3) objC : null;
        if (pr3Var != null && (or3VarB0 = pr3Var.B0(z, z2)) != null) {
            return or3VarB0;
        }
        if (!z2 || (viewFindViewById = MainScreen.p1(mainScreen).findViewById(R.id.oneme_main_settings_bottom_item)) == null || viewFindViewById.getWidth() == 0 || viewFindViewById.getHeight() == 0 || (viewFindViewById2 = viewFindViewById.findViewById(R.id.oneme_bottom_bar_item_icon)) == null || viewFindViewById2.getWidth() == 0 || viewFindViewById2.getHeight() == 0) {
            return null;
        }
        int[] iArr = new int[2];
        viewFindViewById2.getLocationOnScreen(iArr);
        return new or3((viewFindViewById2.getWidth() / 2) + iArr[0], 0.0f, (viewFindViewById2.getHeight() / 2) + iArr[1]);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009e  */
    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        xwj uwjVar;
        ixj ixjVarG = ixj.g(windowInsets, null);
        exj exjVar = ixjVarG.a;
        mi8 mi8VarF = exjVar.f(519);
        int i = mi8VarF.d;
        View childAt = getChildAt(0);
        FrameLayout frameLayout = childAt instanceof FrameLayout ? (FrameLayout) childAt : null;
        if (frameLayout == null) {
            return super.dispatchApplyWindowInsets(windowInsets);
        }
        MainScreen mainScreen = this.a;
        txb txbVarP1 = MainScreen.p1(mainScreen);
        txb txbVarO1 = MainScreen.o1(mainScreen);
        mi8 mi8VarF2 = exjVar.f(647);
        int i2 = txbVarP1.b;
        txbVarP1.setPadding(mi8VarF2.a + i2, txbVarP1.getPaddingTop(), i2 + mi8VarF2.c, txbVarP1.getPaddingBottom());
        mi8 mi8VarF3 = exjVar.f(647);
        int i3 = txbVarO1.b;
        txbVarO1.setPadding(mi8VarF3.a + i3, txbVarO1.getPaddingTop(), i3 + mi8VarF3.c, txbVarO1.getPaddingBottom());
        if (txbVarP1.getPaddingBottom() != i) {
            txbVarP1.setPadding(txbVarP1.getPaddingLeft(), 0, txbVarP1.getPaddingRight(), i);
        }
        if (txbVarO1.getPaddingBottom() != i) {
            txbVarO1.setPadding(txbVarO1.getPaddingLeft(), 0, txbVarO1.getPaddingRight(), i);
        }
        txbVarP1.dispatchApplyWindowInsets(windowInsets);
        txbVarO1.dispatchApplyWindowInsets(windowInsets);
        txb.h.getClass();
        int iD = nhb.d(this);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29) {
            int i5 = uw8.a;
            if (!uw8.b(uw8.c)) {
                i += iD;
            }
        } else {
            i += iD;
        }
        if (i4 >= 34) {
            uwjVar = new wwj(ixjVarG);
        } else if (i4 >= 30) {
            uwjVar = new vwj(ixjVarG);
        } else {
            uwjVar = i4 >= 29 ? new uwj(ixjVarG) : new twj(ixjVarG);
        }
        uwjVar.c(519, mi8.b(mi8VarF.a, mi8VarF.b, mi8VarF.c, i));
        frameLayout.dispatchApplyWindowInsets(uwjVar.b().f());
        return windowInsets;
    }

    @Override // defpackage.chd
    public final xu2 i0(long j) {
        hve hveVarV1 = this.a.v1();
        Object objC = hveVarV1 != null ? rx8.C(hveVarV1) : null;
        chd chdVar = objC instanceof chd ? (chd) objC : null;
        if (chdVar != null) {
            return chdVar.i0(j);
        }
        return null;
    }
}
