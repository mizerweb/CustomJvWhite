package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class p55 extends sg5 {
    public final es0 c;
    public final pjd d;
    public final d68 e;
    public boolean f;
    public final jp8 g;
    public int h;
    public final /* synthetic */ q55 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p55(q55 q55Var, lq0 lq0Var, es0 es0Var, int i) {
        super(lq0Var);
        this.i = q55Var;
        this.c = es0Var;
        this.d = es0Var.c;
        this.e = es0Var.a.g;
        this.g = new jp8(q55Var.b, new n55(this, q55Var, i));
        es0Var.a(new o55(0, this));
    }

    @Override // defpackage.sg5, defpackage.lq0
    public final void d() {
        q(true);
        this.b.c();
    }

    @Override // defpackage.sg5, defpackage.lq0
    public final void f(Throwable th) {
        p(th);
    }

    @Override // defpackage.lq0
    public final void h(int i, Object obj) {
        p76 p76Var = (p76) obj;
        qe7.v();
        boolean zA = lq0.a(i);
        es0 es0Var = this.c;
        if (zA) {
            if (p76Var == null) {
                cqk.d(es0Var.f.get("cached_value_found"), Boolean.TRUE);
                es0Var.l.w.getClass();
                p(new ExceptionWithNoStacktrace("Encoded image is null."));
                return;
            } else if (!p76Var.K()) {
                p(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                return;
            }
        }
        if (s(p76Var, i)) {
            boolean zL = lq0.l(i, 4);
            if (zA || zL || es0Var.f()) {
                this.g.b();
            }
        }
    }

    @Override // defpackage.sg5, defpackage.lq0
    public final void j(float f) {
        super.j(f * 0.99f);
    }

    public final h98 m(xt3 xt3Var, long j, i1e i1eVar, boolean z, String str, String str2, String str3, String str4) {
        Map extras;
        Object obj;
        String string = null;
        if (!this.d.c(this.c, "DecodeProducer")) {
            return null;
        }
        String strValueOf = String.valueOf(j);
        String strValueOf2 = String.valueOf(((s98) i1eVar).b);
        String strValueOf3 = String.valueOf(z);
        if (xt3Var != null && (extras = xt3Var.getExtras()) != null && (obj = extras.get(HasExtraData.KEY_NON_FATAL_DECODE_ERROR)) != null) {
            string = obj.toString();
        }
        if (!(xt3Var instanceof CloseableStaticBitmap)) {
            String str5 = string;
            HashMap map = new HashMap(7);
            map.put("queueTime", strValueOf);
            map.put("hasGoodQuality", strValueOf2);
            map.put("isFinal", strValueOf3);
            map.put("encodedImageSize", str2);
            map.put("imageFormat", str);
            map.put("requestedImageSize", str3);
            map.put("sampleSize", str4);
            if (str5 != null) {
                map.put(HasExtraData.KEY_NON_FATAL_DECODE_ERROR, str5);
            }
            return new h98(map);
        }
        Bitmap underlyingBitmap = ((CloseableStaticBitmap) xt3Var).getUnderlyingBitmap();
        String str6 = string;
        String str7 = underlyingBitmap.getWidth() + "x" + underlyingBitmap.getHeight();
        HashMap map2 = new HashMap(8);
        map2.put("bitmapSize", str7);
        map2.put("queueTime", strValueOf);
        map2.put("hasGoodQuality", strValueOf2);
        map2.put("isFinal", strValueOf3);
        map2.put("encodedImageSize", str2);
        map2.put("imageFormat", str);
        map2.put("requestedImageSize", str3);
        map2.put("sampleSize", str4);
        int byteCount = underlyingBitmap.getByteCount();
        StringBuilder sb = new StringBuilder();
        sb.append(byteCount);
        map2.put("byteCount", sb.toString());
        if (str6 != null) {
            map2.put(HasExtraData.KEY_NON_FATAL_DECODE_ERROR, str6);
        }
        return new h98(map2);
    }

    public abstract int n(p76 p76Var);

    public abstract s98 o();

    public final void p(Throwable th) {
        q(true);
        this.b.e(th);
    }

    public final void q(boolean z) {
        p76 p76Var;
        synchronized (this) {
            if (z) {
                if (!this.f) {
                    this.b.i(1.0f);
                    this.f = true;
                    jp8 jp8Var = this.g;
                    synchronized (jp8Var) {
                        p76Var = jp8Var.e;
                        jp8Var.e = null;
                        jp8Var.f = 0;
                    }
                    p76.g(p76Var);
                }
            }
        }
    }

    public final void r(p76 p76Var, xt3 xt3Var, int i) {
        p76Var.Y();
        Integer numValueOf = Integer.valueOf(p76Var.e);
        es0 es0Var = this.c;
        es0Var.putExtra(HasExtraData.KEY_ENCODED_WIDTH, numValueOf);
        p76Var.Y();
        es0Var.putExtra(HasExtraData.KEY_ENCODED_HEIGHT, Integer.valueOf(p76Var.f));
        es0Var.putExtra(HasExtraData.KEY_ENCODED_SIZE, Integer.valueOf(p76Var.E()));
        p76Var.Y();
        es0Var.putExtra(HasExtraData.KEY_COLOR_SPACE, p76Var.i);
        if (xt3Var instanceof CloseableStaticBitmap) {
            es0Var.putExtra(HasExtraData.KEY_BITMAP_CONFIG, String.valueOf(((CloseableStaticBitmap) xt3Var).getUnderlyingBitmap().getConfig()));
        }
        if (xt3Var != null) {
            xt3Var.putExtras(es0Var.f);
        }
        es0Var.putExtra(HasExtraData.KEY_LAST_SCAN_NUMBER, Integer.valueOf(i));
    }

    public abstract boolean s(p76 p76Var, int i);
}
