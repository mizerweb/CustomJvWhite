package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class g57 extends tee implements eph {
    public final /* synthetic */ int a;
    public final Parcelable b;
    public final v56 c;
    public final Object d;
    public final Object e;

    public g57(ol0 ol0Var, Context context) {
        this.a = 2;
        this.e = ol0Var;
        this.c = new v56(9, (byte) 0);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 3.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.d = paint;
        this.b = new RectF();
        onThemeChanged(pq3.j.e(context).m());
    }

    public static boolean i(RecyclerView recyclerView, int i) {
        nee adapter = recyclerView.getAdapter();
        return (adapter == null || i == -1 || i == 0 || adapter.n(i) != R.id.oneme_folders_list_recommended_folder_view_type || adapter.n(i - 1) == R.id.oneme_folders_list_recommended_folder_view_type) ? false : true;
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP;
        int i = this.a;
        v56 v56Var = this.c;
        switch (i) {
            case 0:
                super.f(rect, view, recyclerView, hfeVar);
                nee adapter = recyclerView.getAdapter();
                if (adapter != null && (iP = RecyclerView.P(view)) > 0 && adapter.n(iP) == R.id.oneme_folders_list_create_folder_view_type) {
                    rect.top = (int) (c0a.d(6.0f, yl5.d().getDisplayMetrics().density, 2) + 0.5f);
                }
                v56Var.J(rect, view, recyclerView);
                break;
            case 1:
                super.f(rect, view, recyclerView, hfeVar);
                if (i(recyclerView, RecyclerView.P(view))) {
                    rect.top = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
                }
                v56Var.J(rect, view, recyclerView);
                break;
            case 2:
                int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                rect.set(iK, iK, iK, iK);
                v56Var.J(rect, view, recyclerView);
                break;
            default:
                super.f(rect, view, recyclerView, hfeVar);
                if (j(recyclerView, view)) {
                    rect.top = (int) (c0a.d(10.0f, yl5.d().getDisplayMetrics().density, 2) + 0.5f);
                }
                v56Var.J(rect, view, recyclerView);
                break;
        }
    }

    @Override // defpackage.tee
    public void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        int iP;
        int i = this.a;
        Object obj = this.e;
        v56 v56Var = this.c;
        Object obj2 = this.d;
        Parcelable parcelable = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) parcelable;
                int i2 = 0;
                while (true) {
                    if (i2 < recyclerView.getChildCount()) {
                        int i3 = i2 + 1;
                        View childAt = recyclerView.getChildAt(i2);
                        if (childAt == null) {
                            ore.i();
                        } else {
                            nee adapter = recyclerView.getAdapter();
                            if (adapter != null && (iP = RecyclerView.P(childAt)) > 0 && adapter.n(iP) == R.id.oneme_folders_list_create_folder_view_type) {
                                v56Var.E(rect, childAt, RecyclerView.P(childAt));
                                canvas.drawRect(zo5.b(12.0f, yl5.d().getDisplayMetrics().density, rect.left), rect.top, zo5.D(12.0f, yl5.d().getDisplayMetrics().density, rect.right), rect.bottom, (Paint) obj);
                                canvas.drawLine(zo5.b(24.0f, yl5.d().getDisplayMetrics().density, rect.left), rect.centerY(), zo5.D(24.0f, yl5.d().getDisplayMetrics().density, rect.right), rect.centerY(), (Paint) obj2);
                            }
                            i2 = i3;
                        }
                    }
                    break;
                }
                break;
            case 1:
                Rect rect2 = (Rect) parcelable;
                int i4 = 0;
                while (true) {
                    if (i4 < recyclerView.getChildCount()) {
                        int i5 = i4 + 1;
                        View childAt2 = recyclerView.getChildAt(i4);
                        if (childAt2 == null) {
                            ore.i();
                        } else {
                            int iP2 = RecyclerView.P(childAt2);
                            if (i(recyclerView, iP2)) {
                                String upperCase = ((Context) obj2).getString(R.string.oneme_folder_list_recommended_folders_section_title).toUpperCase(Locale.ROOT);
                                v56Var.E(rect2, childAt2, iP2);
                                canvas.drawText(upperCase, rect2.left + gm0.K(28.0f * yl5.d().getDisplayMetrics().density), rect2.bottom - gm0.K(10.0f * yl5.d().getDisplayMetrics().density), (TextPaint) obj);
                            }
                            i4 = i5;
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tee
    public void h(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i = this.a;
        Object obj = this.d;
        Parcelable parcelable = this.b;
        switch (i) {
            case 2:
                RectF rectF = (RectF) parcelable;
                int childCount = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    int iP = RecyclerView.P(childAt);
                    if (iP != -1 && ((Boolean) ((ol0) this.e).invoke(Integer.valueOf(iP))).booleanValue()) {
                        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                        rectF.set(childAt.getLeft() - iK, childAt.getTop() - iK, childAt.getRight() + iK, childAt.getBottom() + iK);
                        canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.width() / 2.0f, (Paint) obj);
                    }
                }
                break;
            case 3:
                Rect rect = (Rect) parcelable;
                int i3 = 0;
                while (true) {
                    if (i3 < recyclerView.getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = recyclerView.getChildAt(i3);
                        if (childAt2 == null) {
                            ore.i();
                        } else {
                            if (j(recyclerView, childAt2)) {
                                int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                                int iK3 = gm0.K(18.0f * yl5.d().getDisplayMetrics().density);
                                this.c.E(rect, childAt2, RecyclerView.P(childAt2));
                                canvas2 = canvas;
                                canvas2.drawLine(rect.left + iK2, rect.centerY(), rect.right - iK3, rect.centerY(), (Paint) obj);
                            } else {
                                canvas2 = canvas;
                            }
                            i3 = i4;
                            canvas = canvas2;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public boolean j(RecyclerView recyclerView, View view) {
        int iP;
        nee adapter = recyclerView.getAdapter();
        return (adapter == null || (iP = RecyclerView.P(view)) <= 0 || ((phg) this.e).f(iP) || adapter.n(iP) != R.id.oneme_contactlist_phonebook_contact_view_type || adapter.n(iP - 1) == R.id.oneme_contactlist_phonebook_contact_view_type) ? false : true;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((Paint) obj2).setColor(kbcVar.B().b);
                ((Paint) obj).setColor(kbcVar.b().f);
                break;
            case 1:
                TextPaint textPaint = (TextPaint) obj;
                noh.d(q9i.i.g(), (Context) obj2, textPaint, null, null, 12);
                textPaint.setColor(kbcVar.getText().d);
                break;
            case 2:
                ((Paint) obj2).setColor(kbcVar.h().a);
                break;
            default:
                ((Paint) obj2).setColor(kbcVar.B().b);
                break;
        }
    }

    public g57(kbc kbcVar) {
        this.a = 0;
        Paint paint = new Paint();
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 0.5f);
        this.d = paint;
        this.e = new Paint();
        this.b = new Rect();
        this.c = new v56(9, (byte) 0);
        onThemeChanged(kbcVar);
    }

    public g57(kbc kbcVar, phg phgVar) {
        this.a = 3;
        this.e = phgVar;
        Paint paint = new Paint();
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 0.5f);
        this.d = paint;
        this.b = new Rect();
        this.c = new v56(9, (byte) 0);
        onThemeChanged(kbcVar);
    }

    public g57(Context context) {
        this.a = 1;
        this.d = context;
        this.b = new Rect();
        this.e = new TextPaint();
        onThemeChanged(pq3.j.e(context).m());
        this.c = new v56(9, (byte) 0);
    }
}
