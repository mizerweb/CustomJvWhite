package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class wx6 extends tee {
    public final Context a;
    public final lsa b;
    public boolean h;
    public k96 i;
    public final l8b c = new l8b(3);
    public final Rect d = new Rect();
    public final int e = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
    public final int f = gm0.K(yl5.d().getDisplayMetrics().density * 6.0f);
    public final int g = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
    public final ny8 j = rx8.P(3, new mp5(10, this));

    public wx6(Application application, lsa lsaVar) {
        this.a = application;
        this.b = lsaVar;
    }

    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        l8b l8bVar = this.c;
        if (l8bVar.h()) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt.getAlpha() != 0.0f) {
                lfe lfeVarS = recyclerView.S(childAt);
                tea teaVar = lfeVarS instanceof tea ? (tea) lfeVarS : null;
                if (teaVar == null) {
                    continue;
                } else {
                    View view = teaVar.a;
                    int i2 = teaVar.f;
                    iea ieaVar = view instanceof iea ? (iea) view : null;
                    if (ieaVar == null) {
                        continue;
                    } else {
                        RectF rectF = ieaVar.k;
                        if ((67108864 & i2) == 0 || i2 == 0 || vka.e(i2)) {
                            rectF.setEmpty();
                            ieaVar.setOnAvatarClickListener$message_list(null);
                        } else {
                            tvb tvbVar = (tvb) l8bVar.f(ieaVar.getAvatarId());
                            if (tvbVar == null) {
                                continue;
                            } else {
                                Rect rect = this.d;
                                ieaVar.getDrawingRect(rect);
                                recyclerView.offsetDescendantRectToMyCoords(ieaVar, rect);
                                tvbVar.setAlpha(gm0.K(childAt.getAlpha() * 255.0f));
                                float translationX = view.getTranslationX() + this.g;
                                float contentViewTopMargin = ieaVar.getContentViewTopMargin() + this.f;
                                float f = rect.left + translationX;
                                float f2 = rect.top + contentViewTopMargin;
                                int iSave = canvas.save();
                                canvas.translate(f, f2);
                                try {
                                    tvbVar.draw(canvas);
                                    rectF.left = translationX;
                                    rectF.top = contentViewTopMargin;
                                    float f3 = ieaVar.b;
                                    rectF.right = translationX + f3;
                                    rectF.bottom = contentViewTopMargin + f3;
                                    ieaVar.setOnAvatarClickListener$message_list(this.b);
                                    canvas.restoreToCount(iSave);
                                } catch (Throwable th) {
                                    canvas.restoreToCount(iSave);
                                    throw th;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
