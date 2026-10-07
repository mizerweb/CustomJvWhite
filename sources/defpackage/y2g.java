package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class y2g extends a8j {
    public final LatLng c;
    public final float d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final mjg o;
    public final r8e p;
    public final ic6 q;
    public final ic6 r;

    public y2g(LatLng latLng, float f, Long l, Long l2, Long l3, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10) {
        this.c = latLng;
        this.d = f;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        this.l = ny8Var8;
        this.m = ny8Var9;
        this.n = ny8Var10;
        mjg mjgVarA = p90.a(new v2g(null, null, null, null, null, null));
        this.o = mjgVarA;
        this.p = new r8e(mjgVarA);
        this.q = new ic6(null);
        this.r = new ic6(null);
        yab.i0(this.b, null, 0, new x2g(this, latLng, f, l2, l, l3, null), 3);
    }

    public static final void B(y2g y2gVar, vc9 vc9Var) {
        fih fihVar = (fih) y2gVar.h.getValue();
        LatLng latLng = y2gVar.c;
        float fA = fihVar.a(latLng.a, latLng.b, vc9Var.a, vc9Var.b);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        String str = fA < 1000.0f ? new DecimalFormat("0", decimalFormatSymbols).format(fA) : new DecimalFormat("0.#", decimalFormatSymbols).format(fA / 1000.0f);
        tnh tnhVar = fA < 1000.0f ? new tnh(R.string.meters) : new tnh(R.string.kilometers);
        mjg mjgVar = y2gVar.o;
        mjgVar.j(null, v2g.a((v2g) mjgVar.getValue(), null, null, null, tnhVar, str, null, 39));
    }

    public final void C() {
        if (!((wsc) this.i.getValue()).c(wsc.l)) {
            a8j.x(this.r, m2g.a);
        } else {
            yab.i0(this.b, null, 0, new fpf(this, null, 3), 3);
        }
    }
}
