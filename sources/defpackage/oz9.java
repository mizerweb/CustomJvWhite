package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import one.me.keyboardmedia.MediaKeyboardWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oz9 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ ImageView f;
    public final /* synthetic */ MediaKeyboardWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oz9(MediaKeyboardWidget mediaKeyboardWidget, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = mediaKeyboardWidget;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        MediaKeyboardWidget mediaKeyboardWidget = this.g;
        ImageView imageView = (ImageView) obj;
        lq4 lq4Var = (lq4) obj3;
        switch (i) {
            case 0:
                oz9 oz9Var = new oz9(mediaKeyboardWidget, lq4Var, 0);
                oz9Var.f = imageView;
                oz9Var.invokeSuspend(sbiVar);
                break;
            case 1:
                oz9 oz9Var2 = new oz9(mediaKeyboardWidget, lq4Var, 1);
                oz9Var2.f = imageView;
                oz9Var2.invokeSuspend(sbiVar);
                break;
            case 2:
                oz9 oz9Var3 = new oz9(mediaKeyboardWidget, lq4Var, 2);
                oz9Var3.f = imageView;
                oz9Var3.invokeSuspend(sbiVar);
                break;
            default:
                oz9 oz9Var4 = new oz9(mediaKeyboardWidget, lq4Var, 3);
                oz9Var4.f = imageView;
                oz9Var4.invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        MediaKeyboardWidget mediaKeyboardWidget = this.g;
        ImageView imageView = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                imageView.setImageTintList(ColorStateList.valueOf(MediaKeyboardWidget.o1(mediaKeyboardWidget).getIcon().c));
                imageView.setImageResource(R.drawable.icon_erase);
                int i2 = ((bs0) MediaKeyboardWidget.o1(mediaKeyboardWidget).u().c.g).c;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                imageView.setBackground(col.b(i2, null, shapeDrawable));
                break;
            case 1:
                ch3.d0(obj);
                imageView.setImageTintList(ColorStateList.valueOf(MediaKeyboardWidget.o1(mediaKeyboardWidget).getIcon().c));
                imageView.setImageResource(R.drawable.icon_settings);
                break;
            case 2:
                ch3.d0(obj);
                imageView.setImageTintList(ColorStateList.valueOf(MediaKeyboardWidget.o1(mediaKeyboardWidget).getIcon().c));
                imageView.setImageResource(R.drawable.icon_plus);
                int i3 = ((bs0) MediaKeyboardWidget.o1(mediaKeyboardWidget).u().c.g).c;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                imageView.setBackground(col.b(i3, null, shapeDrawable2));
                break;
            default:
                ch3.d0(obj);
                imageView.setImageTintList(ColorStateList.valueOf(MediaKeyboardWidget.o1(mediaKeyboardWidget).getIcon().h));
                imageView.setImageResource(R.drawable.icon_check);
                int i4 = ((bs0) MediaKeyboardWidget.o1(mediaKeyboardWidget).u().c.g).c;
                ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
                shapeDrawable3.getPaint().setColor(-1);
                imageView.setBackground(col.b(i4, null, shapeDrawable3));
                break;
        }
        return sbiVar;
    }
}
