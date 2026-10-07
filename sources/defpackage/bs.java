package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class bs extends ImageButton {
    public final ma a;
    public final hle b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jth.a(context);
        this.c = false;
        dqh.a(this, getContext());
        ma maVar = new ma(this);
        this.a = maVar;
        maVar.t(attributeSet, i);
        hle hleVar = new hle(this);
        this.b = hleVar;
        hleVar.i(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ma maVar = this.a;
        if (maVar != null) {
            maVar.i();
        }
        hle hleVar = this.b;
        if (hleVar != null) {
            hleVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ma maVar = this.a;
        if (maVar != null) {
            return maVar.p();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ma maVar = this.a;
        if (maVar != null) {
            return maVar.q();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        lh6 lh6Var;
        hle hleVar = this.b;
        if (hleVar == null || (lh6Var = (lh6) hleVar.d) == null) {
            return null;
        }
        return (ColorStateList) lh6Var.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        lh6 lh6Var;
        hle hleVar = this.b;
        if (hleVar == null || (lh6Var = (lh6) hleVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) lh6Var.e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ma maVar = this.a;
        if (maVar != null) {
            maVar.w();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ma maVar = this.a;
        if (maVar != null) {
            maVar.x(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        hle hleVar = this.b;
        if (hleVar != null) {
            hleVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        hle hleVar = this.b;
        if (hleVar != null && drawable != null && !this.c) {
            hleVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (hleVar != null) {
            hleVar.b();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) hleVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(hleVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        hle hleVar = this.b;
        ImageView imageView = (ImageView) hleVar.c;
        if (i != 0) {
            Drawable drawableO = wk8.o(imageView.getContext(), i);
            if (drawableO != null) {
                vt5.a(drawableO);
            }
            imageView.setImageDrawable(drawableO);
        } else {
            imageView.setImageDrawable(null);
        }
        hleVar.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        hle hleVar = this.b;
        if (hleVar != null) {
            hleVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ma maVar = this.a;
        if (maVar != null) {
            maVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ma maVar = this.a;
        if (maVar != null) {
            maVar.E(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        hle hleVar = this.b;
        if (hleVar != null) {
            if (((lh6) hleVar.d) == null) {
                hleVar.d = new lh6();
            }
            lh6 lh6Var = (lh6) hleVar.d;
            lh6Var.d = colorStateList;
            lh6Var.c = true;
            hleVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        hle hleVar = this.b;
        if (hleVar != null) {
            if (((lh6) hleVar.d) == null) {
                hleVar.d = new lh6();
            }
            lh6 lh6Var = (lh6) hleVar.d;
            lh6Var.e = mode;
            lh6Var.b = true;
            hleVar.b();
        }
    }

    public bs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }
}
