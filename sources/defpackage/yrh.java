package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public final class yrh {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public float f = 1.0f;
    public Paint g;
    public final ifh h;
    public final Shader.TileMode i;
    public boolean j;

    public yrh(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i;
        this.e = i2;
        Paint paint = new Paint(2);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.g = paint;
        this.h = new ifh(new bpg(4, this));
        this.i = Shader.TileMode.REPEAT;
    }
}
