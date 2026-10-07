package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class odb extends tee implements eph {
    public final /* synthetic */ int a;
    public final Rect b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;

    public odb(int i, kbc kbcVar) {
        this.a = i;
        switch (i) {
            case 3:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                this.d = paint;
                this.e = new RectF();
                this.b = new Rect();
                this.f = new float[8];
                this.g = new Path();
                this.c = new v56(9, (byte) 0);
                onThemeChanged(kbcVar);
                break;
            default:
                ifh ifhVar = new ifh(new gvc(10));
                this.d = new ifh(new gvc(11));
                this.e = new ifh(new gvc(12));
                Paint paint2 = new Paint();
                paint2.setStrokeWidth(((Number) ifhVar.getValue()).floatValue());
                this.f = paint2;
                this.g = new Paint();
                this.b = new Rect();
                this.c = new v56(9, (byte) 0);
                onThemeChanged(kbcVar);
                break;
        }
    }

    public static boolean j(int i, Integer num, Integer num2) {
        if (i != R.id.oneme_stickers_settings_set_view_type) {
            return false;
        }
        if (num != null && num.intValue() == R.id.oneme_stickers_settings_set_view_type) {
            return false;
        }
        return num2 == null || num2.intValue() != R.id.oneme_stickers_settings_set_view_type;
    }

    public static final void k(odb odbVar, Canvas canvas) {
        Path path = (Path) odbVar.g;
        RectF rectF = (RectF) odbVar.e;
        float[] fArr = (float[]) odbVar.f;
        path.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(path, (Paint) odbVar.d);
        path.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        a.V0(fArr, 0.0f);
    }

    public static final void l(odb odbVar) {
        RectF rectF = (RectF) odbVar.e;
        float f = rectF.left;
        Rect rect = odbVar.b;
        rectF.left = Math.min(f, rect.left);
        rectF.top = Math.min(rectF.top, rect.top);
        rectF.right = Math.max(rectF.right, rect.right);
        rectF.bottom = Math.max(rectF.bottom, rect.bottom);
    }

    public static boolean m(RecyclerView recyclerView, View view) {
        int iP;
        nee adapter = recyclerView.getAdapter();
        if (adapter != null && (iP = RecyclerView.P(view)) > 0 && iP < adapter.l() - 1) {
            boolean z = adapter.n(iP) == R.id.oneme_poll_create__answer_item_viewtype;
            int iN = adapter.n(iP + 1);
            boolean z2 = iN == R.id.oneme_poll_create__answer_item_viewtype || iN == R.id.oneme_poll_create__add_answer_item_viewtype;
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x012c  */
    @Override // defpackage.tee
    public void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int i;
        int i2 = this.a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                TextPaint textPaint = (TextPaint) this.g;
                super.f(rect, view, recyclerView, hfeVar);
                int iP = RecyclerView.P(view);
                if (i(iP)) {
                    rect.top = gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + ((int) (textPaint.descent() - textPaint.ascent())) + rect.top;
                } else {
                    zsj zsjVar = (zsj) this.e;
                    GridLayoutManager gridLayoutManagerC0 = tre.c0((RecyclerView) this.d);
                    boolean z = false;
                    int i3 = gridLayoutManagerC0 != null ? gridLayoutManagerC0.F : 0;
                    if (iP > 0 && (i = iP - i3) >= 0 && zsjVar.l() > 0) {
                        udb udbVarN = zsjVar.N(i);
                        Integer numValueOf = udbVarN != null ? Integer.valueOf(udbVarN.c) : null;
                        udb udbVarN2 = zsjVar.N(iP);
                        z = !cqk.d(numValueOf, udbVarN2 != null ? Integer.valueOf(udbVarN2.c) : null);
                    }
                    if (z) {
                        rect.top = gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + ((int) (textPaint.descent() - textPaint.ascent())) + rect.top;
                    }
                }
                ((v56) obj).J(rect, view, recyclerView);
                break;
            case 1:
                super.f(rect, view, recyclerView, hfeVar);
                if (m(recyclerView, view)) {
                    rect.bottom = (int) (yl5.d().getDisplayMetrics().density * 0.5f);
                }
                ((v56) obj).J(rect, view, recyclerView);
                break;
            case 2:
                super.f(rect, view, recyclerView, hfeVar);
                ((v56) obj).J(rect, view, recyclerView);
                break;
            case 3:
                int iP2 = RecyclerView.P(view);
                nee adapter = recyclerView.getAdapter();
                g6g g6gVar = adapter instanceof g6g ? (g6g) adapter : null;
                if (iP2 != -1 && g6gVar != null) {
                    d20 d20Var = g6gVar.d;
                    k79 k79Var = (k79) ww3.u1(iP2 - 1, d20Var.f);
                    Integer numValueOf2 = k79Var != null ? Integer.valueOf(k79Var.getF()) : null;
                    int iN = g6gVar.n(iP2);
                    k79 k79Var2 = (k79) ww3.u1(iP2 + 1, d20Var.f);
                    Integer numValueOf3 = k79Var2 != null ? Integer.valueOf(k79Var2.getF()) : null;
                    int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                    if (iN == R.id.oneme_stickers_settings_set_view_type && ((numValueOf2 == null || numValueOf2.intValue() != R.id.oneme_stickers_settings_set_view_type) && numValueOf3 != null && numValueOf3.intValue() == R.id.oneme_stickers_settings_set_view_type)) {
                        rect.top += iK;
                    } else if (iN == R.id.oneme_stickers_settings_set_view_type && numValueOf2 != null && numValueOf2.intValue() == R.id.oneme_stickers_settings_set_view_type && (numValueOf3 == null || numValueOf3.intValue() != R.id.oneme_stickers_settings_set_view_type)) {
                        rect.bottom += iK;
                    } else if (j(iN, numValueOf2, numValueOf3)) {
                        rect.top += iK;
                        rect.bottom += iK;
                    }
                    ((v56) obj).J(rect, view, recyclerView);
                    break;
                }
                break;
            default:
                super.f(rect, view, recyclerView, hfeVar);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0194  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e4  */
    @Override // defpackage.tee
    public void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        Integer numValueOf;
        nee adapter;
        i7d i7dVar;
        int i;
        int i2;
        Context context;
        String quantityString;
        int i3;
        int i4 = this.a;
        Object obj = this.g;
        Object obj2 = this.d;
        int i5 = -1;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Rect rect = this.b;
        switch (i4) {
            case 1:
                ifh ifhVar = (ifh) obj4;
                ifh ifhVar2 = (ifh) obj2;
                int i6 = 0;
                while (true) {
                    if (i6 < recyclerView.getChildCount()) {
                        int i7 = i6 + 1;
                        View childAt = recyclerView.getChildAt(i6);
                        if (childAt == null) {
                            ore.i();
                        } else {
                            if (m(recyclerView, childAt)) {
                                ((v56) obj3).A(rect, childAt, RecyclerView.P(childAt));
                                canvas.drawRect(((Number) ifhVar2.getValue()).intValue() + rect.left, rect.top, rect.right - ((Number) ifhVar2.getValue()).intValue(), rect.bottom, (Paint) obj);
                                canvas.drawLine(((Number) ifhVar.getValue()).intValue() + rect.left, rect.centerY(), rect.right - ((Number) ifhVar.getValue()).intValue(), rect.centerY(), (Paint) this.f);
                            }
                            i6 = i7;
                        }
                    }
                    break;
                }
                break;
            case 2:
                int i8 = 0;
                while (true) {
                    if (i8 < recyclerView.getChildCount()) {
                        int i9 = i8 + 1;
                        View childAt2 = recyclerView.getChildAt(i8);
                        if (childAt2 == null) {
                            ore.i();
                        } else {
                            int iP = RecyclerView.P(childAt2);
                            nee adapter2 = recyclerView.getAdapter();
                            Integer numValueOf2 = (adapter2 == null || iP == 0 || iP == -1 || iP >= adapter2.l()) ? null : Integer.valueOf(adapter2.n(iP));
                            if (numValueOf2 != null) {
                                int iIntValue = numValueOf2.intValue();
                                int i10 = iP + 1;
                                nee adapter3 = recyclerView.getAdapter();
                                if (adapter3 != null && i10 != 0) {
                                    if (i10 != -1 && i10 < adapter3.l()) {
                                        numValueOf = Integer.valueOf(adapter3.n(i10));
                                    }
                                    if (numValueOf != null) {
                                        int iIntValue2 = numValueOf.intValue();
                                        if (iIntValue != R.id.oneme_poll_create__add_answer_item_viewtype || (iIntValue == R.id.oneme_poll_create__answer_item_viewtype && iIntValue2 != R.id.oneme_poll_create__add_answer_item_viewtype && iIntValue2 != R.id.oneme_poll_create__answer_item_viewtype)) {
                                            adapter = recyclerView.getAdapter();
                                            if (adapter instanceof i7d) {
                                                i7dVar = (i7d) adapter;
                                            } else {
                                                i7dVar = null;
                                            }
                                            if (i7dVar != null) {
                                                i = i7dVar.h;
                                            } else {
                                                i = 0;
                                            }
                                            i2 = 12 - i;
                                            if (i2 < 0) {
                                                i2 = 0;
                                            }
                                            context = (Context) obj2;
                                            if (i2 <= 0) {
                                                quantityString = context.getString(R.string.oneme_poll_create__answer_limit_reached_hint);
                                            } else {
                                                quantityString = context.getResources().getQuantityString(R.plurals.oneme_poll_create__answer_limit_hint, i2, Integer.valueOf(i2));
                                            }
                                            if (quantityString != null) {
                                                ((v56) obj3).A(rect, childAt2, iP);
                                                canvas.drawText(quantityString, rect.left + ((Number) ((ifh) obj4).getValue()).intValue(), rect.bottom + ((Number) ((ifh) this.f).getValue()).intValue(), (TextPaint) obj);
                                            }
                                        }
                                    }
                                }
                                numValueOf = null;
                                if (numValueOf != null) {
                                    int iIntValue3 = numValueOf.intValue();
                                    if (iIntValue != R.id.oneme_poll_create__add_answer_item_viewtype) {
                                        adapter = recyclerView.getAdapter();
                                        if (adapter instanceof i7d) {
                                            i7dVar = (i7d) adapter;
                                        } else {
                                            i7dVar = null;
                                        }
                                        if (i7dVar != null) {
                                            i = i7dVar.h;
                                        } else {
                                            i = 0;
                                        }
                                        i2 = 12 - i;
                                        if (i2 < 0) {
                                            i2 = 0;
                                        }
                                        context = (Context) obj2;
                                        if (i2 <= 0) {
                                            quantityString = context.getString(R.string.oneme_poll_create__answer_limit_reached_hint);
                                        } else {
                                            quantityString = context.getResources().getQuantityString(R.plurals.oneme_poll_create__answer_limit_hint, i2, Integer.valueOf(i2));
                                        }
                                        if (quantityString != null) {
                                            ((v56) obj3).A(rect, childAt2, iP);
                                            canvas.drawText(quantityString, rect.left + ((Number) ((ifh) obj4).getValue()).intValue(), rect.bottom + ((Number) ((ifh) this.f).getValue()).intValue(), (TextPaint) obj);
                                        }
                                    } else {
                                        adapter = recyclerView.getAdapter();
                                        if (adapter instanceof i7d) {
                                            i7dVar = (i7d) adapter;
                                        } else {
                                            i7dVar = null;
                                        }
                                        if (i7dVar != null) {
                                            i = i7dVar.h;
                                        } else {
                                            i = 0;
                                        }
                                        i2 = 12 - i;
                                        if (i2 < 0) {
                                            i2 = 0;
                                        }
                                        context = (Context) obj2;
                                        if (i2 <= 0) {
                                            quantityString = context.getString(R.string.oneme_poll_create__answer_limit_reached_hint);
                                        } else {
                                            quantityString = context.getResources().getQuantityString(R.plurals.oneme_poll_create__answer_limit_hint, i2, Integer.valueOf(i2));
                                        }
                                        if (quantityString != null) {
                                            ((v56) obj3).A(rect, childAt2, iP);
                                            canvas.drawText(quantityString, rect.left + ((Number) ((ifh) obj4).getValue()).intValue(), rect.bottom + ((Number) ((ifh) this.f).getValue()).intValue(), (TextPaint) obj);
                                        }
                                    }
                                }
                            }
                            i8 = i9;
                        }
                    }
                    break;
                }
                break;
            case 3:
                float[] fArr = (float[]) this.f;
                RectF rectF = (RectF) obj4;
                rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
                float f = yl5.d().getDisplayMetrics().density * 16.0f;
                nee adapter4 = recyclerView.getAdapter();
                g6g g6gVar = adapter4 instanceof g6g ? (g6g) adapter4 : null;
                if (g6gVar != null) {
                    d20 d20Var = g6gVar.d;
                    int childCount = recyclerView.getChildCount();
                    int i11 = 0;
                    while (i11 < childCount) {
                        View childAt3 = recyclerView.getChildAt(i11);
                        int iP2 = RecyclerView.P(childAt3);
                        if (iP2 != i5) {
                            ((v56) obj3).C(rect, childAt3, iP2);
                            k79 k79Var = (k79) ww3.u1(iP2 - 1, d20Var.f);
                            Integer numValueOf3 = k79Var != null ? Integer.valueOf(k79Var.getF()) : null;
                            int iN = g6gVar.n(iP2);
                            k79 k79Var2 = (k79) ww3.u1(iP2 + 1, d20Var.f);
                            Integer numValueOf4 = k79Var2 != null ? Integer.valueOf(k79Var2.getF()) : null;
                            if ((iN != R.id.oneme_stickers_settings_set_view_type || ((numValueOf3 != null && numValueOf3.intValue() == R.id.oneme_stickers_settings_set_view_type) || numValueOf4 == null || numValueOf4.intValue() != R.id.oneme_stickers_settings_set_view_type)) && !j(iN, numValueOf3, numValueOf4)) {
                                i3 = R.id.oneme_stickers_settings_set_view_type;
                            } else {
                                fArr[0] = f;
                                fArr[1] = f;
                                fArr[2] = f;
                                fArr[3] = f;
                                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                                i3 = R.id.oneme_stickers_settings_set_view_type;
                            }
                            if ((iN == i3 && numValueOf3 != null && numValueOf3.intValue() == i3 && (numValueOf4 == null || numValueOf4.intValue() != i3)) || j(iN, numValueOf3, numValueOf4)) {
                                l(this);
                                fArr[4] = f;
                                fArr[5] = f;
                                fArr[6] = f;
                                fArr[7] = f;
                                k(this, canvas);
                            } else if (iN == R.id.oneme_stickers_settings_set_view_type && numValueOf3 != null && numValueOf3.intValue() == R.id.oneme_stickers_settings_set_view_type && numValueOf4 != null && numValueOf4.intValue() == R.id.oneme_stickers_settings_set_view_type) {
                                l(this);
                            }
                            i11++;
                            fArr = fArr;
                            f = f;
                            i5 = -1;
                        }
                        break;
                    }
                    if (rectF.height() > 0.0f) {
                        k(this, canvas);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tee
    public void h(Canvas canvas, RecyclerView recyclerView) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.g;
        Rect rect = this.b;
        switch (i) {
            case 0:
                TextPaint textPaint = (TextPaint) obj2;
                int i2 = 0;
                while (true) {
                    if (i2 < recyclerView.getChildCount()) {
                        int i3 = i2 + 1;
                        View childAt = recyclerView.getChildAt(i2);
                        if (childAt == null) {
                            ore.i();
                        } else {
                            int iP = RecyclerView.P(childAt);
                            if (iP != -1 && i(iP)) {
                                String str = (String) ((cf7) this.f).invoke(Integer.valueOf(iP));
                                ((v56) obj).E(rect, childAt, iP);
                                canvas.drawText(str, rect.left, textPaint.descent() + zo5.b(10.0f, yl5.d().getDisplayMetrics().density, rect.top), textPaint);
                            }
                            i2 = i3;
                        }
                    }
                    break;
                }
                break;
            case 4:
                int iK = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                int iK2 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
                canvas.save();
                recyclerView.getDrawingRect(rect);
                canvas.clipRect(rect);
                int i4 = 0;
                while (true) {
                    if (!(i4 < recyclerView.getChildCount())) {
                        canvas.restore();
                    } else {
                        int i5 = i4 + 1;
                        View childAt2 = recyclerView.getChildAt(i4);
                        if (childAt2 == null) {
                            ore.i();
                        } else {
                            int iP2 = RecyclerView.P(childAt2);
                            RecyclerView.U(rect, childAt2);
                            boolean zBooleanValue = ((Boolean) ((a6b) this.e).invoke(Integer.valueOf(iP2))).booleanValue();
                            Drawable drawable = (Drawable) this.f;
                            if (zBooleanValue) {
                                drawable.setState((int[]) obj2);
                            } else {
                                drawable.setState((int[]) obj);
                            }
                            Drawable drawable2 = (Drawable) this.f;
                            drawable2.setAlpha(gm0.K(childAt2.getAlpha() * 255.0f));
                            int i6 = rect.right - iK;
                            int i7 = rect.top;
                            drawable2.setBounds(i6 - iK2, i7 + iK, i6, i7 + iK2 + iK);
                            drawable2.draw(canvas);
                            i4 = i5;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public boolean i(int i) {
        zsj zsjVar = (zsj) this.e;
        if (i <= 0 || zsjVar.l() <= 0) {
            return false;
        }
        udb udbVarN = zsjVar.N(i - 1);
        Integer numValueOf = udbVarN != null ? Integer.valueOf(udbVarN.c) : null;
        udb udbVarN2 = zsjVar.N(i);
        return !cqk.d(numValueOf, udbVarN2 != null ? Integer.valueOf(udbVarN2.c) : null);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = this.a;
        Object obj = this.g;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                TextPaint textPaint = (TextPaint) obj;
                RecyclerView recyclerView = (RecyclerView) obj2;
                noh.d(q9i.i, recyclerView.getContext(), textPaint, null, null, 12);
                textPaint.setColor(pq3.j.h(recyclerView).getText().e);
                break;
            case 1:
                ((Paint) this.f).setColor(kbcVar.B().b);
                ((Paint) obj).setColor(kbcVar.b().f);
                break;
            case 2:
                TextPaint textPaint2 = (TextPaint) obj;
                noh.d(q9i.i, (Context) obj2, textPaint2, null, null, 12);
                textPaint2.setColor(kbcVar.getText().c);
                break;
            case 3:
                ((Paint) obj2).setColor(kbcVar.b().f);
                break;
            default:
                this.f = (Drawable) ((z5b) obj2).invoke();
                break;
        }
    }

    public odb(z5b z5bVar, a6b a6bVar) {
        this.a = 4;
        this.d = z5bVar;
        this.e = a6bVar;
        this.f = (Drawable) z5bVar.invoke();
        this.b = new Rect();
        this.g = new int[]{android.R.attr.state_checked};
        this.c = new int[]{-16842912};
    }

    public odb(Context context) {
        this.a = 2;
        this.d = context;
        this.b = new Rect();
        this.g = new TextPaint();
        this.e = new ifh(new gvc(14));
        this.f = new ifh(new gvc(15));
        onThemeChanged(pq3.j.e(context).m());
        this.c = new v56(9, (byte) 0);
    }

    public odb(RecyclerView recyclerView, zsj zsjVar, cf7 cf7Var) {
        this.a = 0;
        this.d = recyclerView;
        this.e = zsjVar;
        this.f = cf7Var;
        this.b = new Rect();
        this.g = new TextPaint();
        onThemeChanged(pq3.j.h(recyclerView));
        this.c = new v56(9, (byte) 0);
    }
}
