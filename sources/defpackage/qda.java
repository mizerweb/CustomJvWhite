package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qda extends FrameLayout implements eph {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ ImageView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qda(ImageView imageView, TextView textView, ImageView imageView2, Context context) {
        super(context);
        this.a = imageView;
        this.b = textView;
        this.c = imageView2;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackground(col.c(((fn8) kbcVar.u().c.b).c, new ColorDrawable(kbcVar.b().f), null, 4));
        this.a.setImageTintList(ColorStateList.valueOf(oc9.Z(R.attr.icon_primary, kbcVar)));
        this.b.setTextColor(kbcVar.getText().b);
        this.c.setImageTintList(ColorStateList.valueOf(oc9.Z(R.attr.icon_secondary, kbcVar)));
    }
}
