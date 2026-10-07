package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import one.me.login.restrict.RestrictLoginScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class doe implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RestrictLoginScreen b;

    public /* synthetic */ doe(RestrictLoginScreen restrictLoginScreen, int i) {
        this.a = i;
        this.b = restrictLoginScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        RestrictLoginScreen restrictLoginScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = RestrictLoginScreen.m;
                return new bk8(restrictLoginScreen.getRouter(), restrictLoginScreen.getB());
            case 1:
                zv8[] zv8VarArr2 = RestrictLoginScreen.m;
                return restrictLoginScreen.getContext().getDrawable(R.drawable.icon_user_defence);
            case 2:
                zv8[] zv8VarArr3 = RestrictLoginScreen.m;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                int iK = gm0.K(80.0f * yl5.d().getDisplayMetrics().density);
                gradientDrawable.setSize(iK, iK);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
                gradientDrawable.setColors(new int[]{Integer.MAX_VALUE, 16777215});
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, (Drawable) restrictLoginScreen.e.getValue()});
                int iK2 = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
                layerDrawable.setLayerSize(1, iK2, iK2);
                layerDrawable.setLayerInset(1, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 0, 0);
                return layerDrawable;
            case 3:
                zv8[] zv8VarArr4 = RestrictLoginScreen.m;
                return new a1g(restrictLoginScreen.getContext());
            default:
                foe foeVar = (foe) restrictLoginScreen.b.getAccessor().c(814);
                return new eoe(foeVar.a, foeVar.b, foeVar.c);
        }
    }
}
