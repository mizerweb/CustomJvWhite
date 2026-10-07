package defpackage;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zsf extends TextView {
    public final /* synthetic */ atf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsf(Context context, atf atfVar) {
        super(context);
        this.a = atfVar;
        setId(R.id.oneme_section_title);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        q9i.a(q9i.f, this);
        setPadding(0, 0, 0, 0);
        setMaxLines(2);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        atf atfVar = this.a;
        if (atfVar.y != osf.f) {
            getPaint().setShader(null);
            return;
        }
        Matrix titleGradientMatrix = atfVar.getTitleGradientMatrix();
        titleGradientMatrix.reset();
        titleGradientMatrix.setScale(i, i2);
        titleGradientMatrix.postTranslate(0.0f, 0.0f);
        Shader shader = getPaint().getShader();
        LinearGradient linearGradient = shader instanceof LinearGradient ? (LinearGradient) shader : null;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(atfVar.getTitleGradientMatrix());
        }
    }
}
