package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class uo5 extends tee {
    public static final int[] e = {R.attr.listDivider};
    public final /* synthetic */ int a;
    public final int b;
    public Object c;
    public final Object d;

    public uo5(Context context) {
        this.a = 0;
        this.d = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(e);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.c = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.b = 1;
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        GridLayoutManager gridLayoutManagerC0;
        sr srVar;
        int iP;
        int i = this.a;
        Object obj = this.d;
        int i2 = this.b;
        switch (i) {
            case 0:
                Drawable drawable = (Drawable) this.c;
                if (drawable == null) {
                    rect.set(0, 0, 0, 0);
                } else if (i2 != 1) {
                    rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
                } else {
                    rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                }
                break;
            case 1:
                s57 s57Var = (s57) this.c;
                nee adapter = recyclerView.getAdapter();
                if (adapter != null && (gridLayoutManagerC0 = tre.c0(recyclerView)) != null && (srVar = gridLayoutManagerC0.K) != null && (iP = RecyclerView.P(view)) >= 0 && iP < adapter.l()) {
                    int iO = srVar.O(iP, ((Number) s57Var.invoke()).intValue());
                    int iN = srVar.N(iP, ((Number) s57Var.invoke()).intValue());
                    int iN2 = srVar.N(adapter.l() - 1, ((Number) s57Var.invoke()).intValue());
                    int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density) / 2;
                    if (((Boolean) ((kd9) obj).get()).booleanValue()) {
                        if (iN == 0) {
                            rect.bottom = iK;
                        } else if (iN == iN2) {
                            rect.top = iK;
                        } else {
                            rect.bottom = iK;
                            rect.top = iK;
                        }
                    }
                    rect.left = (iO * i2) / ((Number) s57Var.invoke()).intValue();
                    rect.right = i2 - (((iO + 1) * i2) / ((Number) s57Var.invoke()).intValue());
                }
                break;
            default:
                f8b f8bVar = (f8b) obj;
                int iP2 = RecyclerView.P(view);
                if (iP2 != -1) {
                    int iE = ((qbf) this.c).e(iP2);
                    int i3 = iE != 0 ? tbf.$EnumSwitchMapping$0[qt4.D(iE)] : -1;
                    if (i3 == 1) {
                        if (iP2 != 0) {
                            rect.top = gm0.K(i2 * yl5.d().getDisplayMetrics().density);
                        }
                        f8bVar.a(iP2);
                    } else if (i3 == 2) {
                        if (iP2 != 0) {
                            rect.top = gm0.K(i2 * yl5.d().getDisplayMetrics().density);
                        }
                        f8bVar.a(iP2);
                    } else {
                        f8bVar.i(iP2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tee
    public void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        switch (this.a) {
            case 0:
                if (recyclerView.getLayoutManager() != null && ((Drawable) this.c) != null) {
                    Rect rect = (Rect) this.d;
                    int i = 0;
                    if (this.b != 1) {
                        canvas.save();
                        if (recyclerView.getClipToPadding()) {
                            paddingTop = recyclerView.getPaddingTop();
                            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
                        } else {
                            height = recyclerView.getHeight();
                            paddingTop = 0;
                        }
                        int childCount = recyclerView.getChildCount();
                        while (i < childCount) {
                            View childAt = recyclerView.getChildAt(i);
                            recyclerView.getLayoutManager().A(rect, childAt);
                            int iRound = Math.round(childAt.getTranslationX()) + rect.right;
                            ((Drawable) this.c).setBounds(iRound - ((Drawable) this.c).getIntrinsicWidth(), paddingTop, iRound, height);
                            ((Drawable) this.c).draw(canvas);
                            i++;
                        }
                        canvas.restore();
                    } else {
                        canvas.save();
                        if (recyclerView.getClipToPadding()) {
                            paddingLeft = recyclerView.getPaddingLeft();
                            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                        } else {
                            width = recyclerView.getWidth();
                            paddingLeft = 0;
                        }
                        int childCount2 = recyclerView.getChildCount();
                        while (i < childCount2) {
                            View childAt2 = recyclerView.getChildAt(i);
                            RecyclerView.U(rect, childAt2);
                            int iRound2 = Math.round(childAt2.getTranslationY()) + rect.bottom;
                            ((Drawable) this.c).setBounds(paddingLeft, iRound2 - ((Drawable) this.c).getIntrinsicHeight(), width, iRound2);
                            ((Drawable) this.c).draw(canvas);
                            i++;
                        }
                        canvas.restore();
                    }
                    break;
                }
                break;
        }
    }

    public uo5(s57 s57Var, int i, kd9 kd9Var) {
        this.a = 1;
        this.c = s57Var;
        this.b = i;
        this.d = kd9Var;
    }

    public uo5(rj5 rj5Var, int i) {
        this.a = 2;
        this.c = rj5Var;
        this.b = i;
        f8b f8bVar = jj8.a;
        this.d = new f8b();
    }
}
