package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yd1 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd1(Context context, int i) {
        super(context, null);
        this.a = i;
        switch (i) {
            case 1:
                super(context);
                break;
            default:
                this.b = vd1.UP;
                ny8 ny8VarP = rx8.P(3, new va(23));
                this.c = new wme(new qo7(27, this));
                Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_arrow_right).mutate();
                a8g a8gVar = pq3.j;
                a8gVar.l(this);
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.d = drawableMutate;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) ny8VarP.getValue(), null, null));
                shapeDrawable.getPaint().setColor(a8gVar.l(this).b.b().c);
                setBackground(shapeDrawable);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.d;
                wme wmeVar = (wme) this.c;
                super.onDraw(canvas);
                int iOrdinal = ((vd1) this.b).ordinal();
                if (iOrdinal == 0) {
                    int paddingTop = getPaddingTop();
                    int height = ((getHeight() - getPaddingTop()) - paddingTop) / 2;
                    int paddingLeft = getPaddingLeft();
                    int width = getWidth() - getPaddingRight();
                    Drawable drawable2 = (Drawable) wmeVar.getValue();
                    drawable2.setBounds(paddingLeft, getPaddingTop(), width, (getHeight() - paddingTop) - height);
                    drawable2.draw(canvas);
                    int paddingTop2 = getPaddingTop() + height + paddingTop;
                    int height2 = getHeight() - getPaddingBottom();
                    drawable.setBounds(paddingLeft, paddingTop2, width, height2);
                    float f = (paddingTop2 + height2) / 2.0f;
                    int iSave = canvas.save();
                    canvas.rotate(90.0f, (paddingLeft + width) / 2.0f, f);
                    try {
                        drawable.draw(canvas);
                        return;
                    } finally {
                        canvas.restoreToCount(iSave);
                    }
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        ore.o();
                        return;
                    }
                    int paddingLeft2 = getPaddingLeft();
                    int width2 = ((getWidth() - getPaddingLeft()) - paddingLeft2) / 2;
                    int paddingTop3 = getPaddingTop();
                    int height3 = getHeight() - getPaddingTop();
                    Drawable drawable3 = (Drawable) wmeVar.getValue();
                    drawable3.setBounds(getPaddingLeft(), paddingTop3, getPaddingLeft() + width2, height3);
                    drawable3.draw(canvas);
                    drawable.setBounds(getPaddingLeft() + width2 + paddingLeft2, paddingTop3, getWidth(), height3);
                    drawable.draw(canvas);
                    return;
                }
                int paddingRight = getPaddingRight();
                int width3 = ((getWidth() - getPaddingRight()) - paddingRight) / 2;
                int paddingTop4 = getPaddingTop();
                int height4 = getHeight() - getPaddingTop();
                int paddingLeft3 = getPaddingLeft();
                int paddingLeft4 = getPaddingLeft() + width3;
                drawable.setBounds(paddingLeft3, paddingTop4, paddingLeft4, height4);
                int iSave2 = canvas.save();
                canvas.rotate(180.0f, (paddingLeft3 + paddingLeft4) / 2.0f, (paddingTop4 + height4) / 2.0f);
                try {
                    drawable.draw(canvas);
                    canvas.restoreToCount(iSave2);
                    Drawable drawable4 = (Drawable) wmeVar.getValue();
                    drawable4.setBounds(getPaddingLeft() + width3 + paddingRight, paddingTop4, getWidth() - getPaddingRight(), height4);
                    drawable4.draw(canvas);
                    return;
                } catch (Throwable th) {
                    canvas.restoreToCount(iSave2);
                    throw th;
                }
            default:
                super.onDraw(canvas);
                return;
        }
    }
}
