package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.uf4;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public boolean a;

    public Guideline(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        uf4 uf4Var = (uf4) getLayoutParams();
        if (this.a && uf4Var.a == i) {
            return;
        }
        uf4Var.a = i;
        setLayoutParams(uf4Var);
    }

    public void setGuidelineEnd(int i) {
        uf4 uf4Var = (uf4) getLayoutParams();
        if (this.a && uf4Var.b == i) {
            return;
        }
        uf4Var.b = i;
        setLayoutParams(uf4Var);
    }

    public void setGuidelinePercent(float f) {
        uf4 uf4Var = (uf4) getLayoutParams();
        if (this.a && uf4Var.c == f) {
            return;
        }
        uf4Var.c = f;
        setLayoutParams(uf4Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.a = true;
        super.setVisibility(8);
    }
}
