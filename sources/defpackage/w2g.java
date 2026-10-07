package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class w2g extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ y2g f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2g(y2g y2gVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = y2gVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        y2g y2gVar = this.f;
        switch (i) {
            case 0:
                return new w2g(y2gVar, lq4Var, 0);
            default:
                return new w2g(y2gVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((w2g) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        y2g y2gVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                ny8 ny8Var = y2gVar.e;
                Context context = (Context) ny8Var.getValue();
                int i2 = c0a.h(pq3.j, (Context) ny8Var.getValue()).h;
                int i3 = sb8.j;
                Drawable drawable = context.getDrawable(R.drawable.icon_geolocation_fill);
                if (drawable == null) {
                    return null;
                }
                drawable.setTintList(ColorStateList.valueOf(i2));
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            default:
                ch3.d0(obj);
                h8c h8cVar = (h8c) y2gVar.n.getValue();
                h8cVar.m(new tnh(R.string.oneme_location_map_location_error));
                return h8cVar.p();
        }
    }
}
