package defpackage;

import android.R;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class fyb extends FrameLayout implements eph {
    public static final /* synthetic */ zv8[] h;
    public static final float[] i;
    public final zb a;
    public final ShapeDrawable b;
    public final ShapeDrawable c;
    public final ShapeDrawable d;
    public final Matrix e;
    public final ny8 f;
    public final ny8 g;

    static {
        z8b z8bVar = new z8b(fyb.class, "state", "getState()Lone/me/sdk/uikit/common/buttonold/OneMeButtonTextPromo$State;");
        zfe.a.getClass();
        h = new zv8[]{z8bVar};
        i = new float[]{0.0f, 0.33f, 0.66f, 1.0f};
    }

    public fyb(Context context) {
        super(context, null);
        this.a = new zb(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.b = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        this.c = shapeDrawable2;
        ShapeDrawable shapeDrawable3 = new ShapeDrawable();
        this.d = shapeDrawable3;
        this.e = new Matrix();
        this.f = rx8.P(3, new n52(context, 24));
        this.g = rx8.P(3, new vx9(context, 16, this));
        setClipToOutline(true);
        setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 16.0f));
        setMinimumWidth(gm0.K(yl5.d().getDisplayMetrics().density * 52.0f));
        setMinimumHeight(gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable2);
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, shapeDrawable);
        stateListDrawable.addState(new int[]{-16842910}, shapeDrawable3);
        setBackground(stateListDrawable);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), 0, gm0.K(20.0f * yl5.d().getDisplayMetrics().density), 0);
        a(getState());
        onThemeChanged(pq3.j.h(this));
    }

    public final void a(eyb eybVar) {
        int iOrdinal = eybVar.ordinal();
        ny8 ny8Var = this.g;
        ny8 ny8Var2 = this.f;
        if (iOrdinal == 0) {
            ((View) ny8Var2.getValue()).setVisibility(0);
            if (ny8Var.d()) {
                ((r6c) ny8Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            ore.o();
        } else {
            ((View) ny8Var2.getValue()).setVisibility(8);
            ((View) ny8Var.getValue()).setVisibility(0);
        }
    }

    public final eyb getState() {
        zv8 zv8Var = h[0];
        return (eyb) this.a.b;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        Matrix matrix = this.e;
        matrix.reset();
        matrix.setScale(i2, i3);
        matrix.postTranslate(0.0f, 0.0f);
        ((LinearGradient) this.b.getPaint().getShader()).setLocalMatrix(matrix);
        ((LinearGradient) this.c.getPaint().getShader()).setLocalMatrix(matrix);
        ((LinearGradient) this.d.getPaint().getShader()).setLocalMatrix(matrix);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Paint paint = this.b.getPaint();
        int[] iArr = ((nac) kbcVar.x().e).a;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        float[] fArr = i;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.3f, 1.0f, 0.7f, iArr, fArr, tileMode);
        Matrix matrix = this.e;
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        Paint paint2 = this.c.getPaint();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.3f, 1.0f, 0.7f, ((pac) ((ki3) kbcVar.u().k.a).b).a, fArr, tileMode);
        linearGradient2.setLocalMatrix(matrix);
        paint2.setShader(linearGradient2);
        Paint paint3 = this.d.getPaint();
        LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.3f, 1.0f, 0.7f, ((nac) ((ki3) kbcVar.u().k.a).c).a, fArr, tileMode);
        linearGradient3.setLocalMatrix(matrix);
        paint3.setShader(linearGradient3);
        ny8 ny8Var = this.f;
        if (ny8Var.d()) {
            ((TextView) ny8Var.getValue()).setTextColor(-1);
        }
    }

    public final void setState(eyb eybVar) {
        this.a.B(this, h[0], eybVar);
    }

    public final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.f.getValue();
        textView.setId(ru.oneme.app.R.id.oneme_button_text_promo_textview_id);
        textView.setText(charSequence);
        n7j.a(this, textView, -1);
    }

    public final void setText(int i2) {
        TextView textView = (TextView) this.f.getValue();
        textView.setText(i2);
        n7j.a(this, textView, -1);
    }
}
