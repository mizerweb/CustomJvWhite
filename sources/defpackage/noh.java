package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.widget.TextView;
import java.util.EnumMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class noh {
    public final boolean a;
    public final EnumMap b;
    public final EnumMap c;
    public final EnumMap d;
    public final String e;
    public final int f;
    public final boolean g;
    public final ifh h;
    public final ifh i;

    public noh(boolean z, EnumMap enumMap, EnumMap enumMap2, EnumMap enumMap3, String str, int i, boolean z2) {
        this.a = z;
        this.b = enumMap;
        this.c = enumMap2;
        this.d = enumMap3;
        this.e = str;
        this.f = i;
        this.g = z2;
        final int i2 = 0;
        this.h = new ifh(new af7(this) { // from class: moh
            public final /* synthetic */ noh b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                noh nohVar = this.b;
                switch (i3) {
                    case 0:
                        return nohVar.a ? nohVar : noh.f(nohVar, 254);
                    default:
                        return nohVar.g ? nohVar : noh.f(nohVar, 127);
                }
            }
        });
        final int i3 = 1;
        this.i = new ifh(new af7(this) { // from class: moh
            public final /* synthetic */ noh b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                noh nohVar = this.b;
                switch (i4) {
                    case 0:
                        return nohVar.a ? nohVar : noh.f(nohVar, 254);
                    default:
                        return nohVar.g ? nohVar : noh.f(nohVar, 127);
                }
            }
        });
    }

    public static void c(noh nohVar, oxg oxgVar, int i) {
        nohVar.getClass();
        oxgVar.setTag(R.id.dynamic_font_sizes, nohVar);
        bx5 bx5Var = bx5.b;
        long jK = nohVar.k(bx5Var);
        oxgVar.setAllCaps(nohVar.a);
        oxgVar.setTextSize((int) (jK >> 32), vl5.e(jK));
        long j = nohVar.j(bx5Var);
        if (Build.VERSION.SDK_INT >= 28) {
            oxgVar.setLineHeight((int) vl5.d(j, oxgVar.getResources().getDisplayMetrics()));
        }
        oxgVar.setIncludeFontPadding(false);
        oxgVar.setLetterSpacing(vl5.d(nohVar.i(bx5Var), oxgVar.getResources().getDisplayMetrics()));
        oxgVar.setTypeface(h9i.a(oxgVar.getContext(), Typeface.create(nohVar.e, 0), i));
    }

    public static /* synthetic */ void d(noh nohVar, Context context, TextPaint textPaint, DisplayMetrics displayMetrics, bx5 bx5Var, int i) {
        if ((i & 4) != 0) {
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        if ((i & 8) != 0) {
            bx5Var = bx5.b;
        }
        nohVar.a(context, textPaint, displayMetrics, bx5Var);
    }

    public static noh f(noh nohVar, int i) {
        boolean z = (i & 1) != 0 ? nohVar.a : true;
        EnumMap enumMap = nohVar.b;
        EnumMap enumMap2 = nohVar.c;
        nohVar.getClass();
        EnumMap enumMap3 = nohVar.d;
        String str = (i & 32) != 0 ? nohVar.e : "roboto";
        int i2 = (i & 64) != 0 ? nohVar.f : 2;
        boolean z2 = (i & np0.m) != 0 ? nohVar.g : true;
        nohVar.getClass();
        return new noh(z, enumMap, enumMap2, enumMap3, str, i2, z2);
    }

    public final void a(Context context, TextPaint textPaint, DisplayMetrics displayMetrics, bx5 bx5Var) {
        textPaint.setTypeface(h9i.a(context, Typeface.create(this.e, 0), zo5.a(this.f)));
        textPaint.setLetterSpacing(vl5.d(i(bx5Var), displayMetrics));
        textPaint.setTextSize(vl5.d(k(bx5Var), displayMetrics));
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
    }

    public final void b(TextView textView, bx5 bx5Var) {
        textView.setTag(R.id.dynamic_font_sizes, this);
        long jK = k(bx5Var);
        textView.setAllCaps(this.a);
        textView.setTextSize((int) (jK >> 32), vl5.e(jK));
        long j = j(bx5Var);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight((int) vl5.d(j, textView.getResources().getDisplayMetrics()));
        }
        textView.setIncludeFontPadding(false);
        textView.setLetterSpacing(vl5.d(i(bx5Var), textView.getResources().getDisplayMetrics()));
        textView.setTypeface(h9i.a(textView.getContext(), Typeface.create(this.e, 0), zo5.a(this.f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noh)) {
            return false;
        }
        noh nohVar = (noh) obj;
        return this.a == nohVar.a && this.b.equals(nohVar.b) && this.c.equals(nohVar.c) && this.d.equals(nohVar.d) && cqk.d(this.e, nohVar.e) && this.f == nohVar.f && this.g == nohVar.g;
    }

    public final noh g() {
        return (noh) this.h.getValue();
    }

    public final noh h() {
        return (noh) this.i.getValue();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + c0a.f(this.f, zo5.d((this.d.hashCode() + nbh.n((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31, false)) * 31, 31, this.e), 31);
    }

    public final long i(bx5 bx5Var) {
        boolean z = this.g;
        EnumMap enumMap = this.d;
        if (z) {
            vl5 vl5Var = (vl5) enumMap.get(bx5Var);
            if (vl5Var == null) {
                vl5Var = (vl5) ww3.q1(enumMap.values());
            }
            return vl5Var.a;
        }
        vl5 vl5Var2 = (vl5) enumMap.get(bx5.b);
        if (vl5Var2 == null) {
            vl5Var2 = (vl5) ww3.q1(enumMap.values());
        }
        return vl5Var2.a;
    }

    public final long j(bx5 bx5Var) {
        boolean z = this.g;
        EnumMap enumMap = this.c;
        if (z) {
            vl5 vl5Var = (vl5) enumMap.get(bx5Var);
            if (vl5Var == null) {
                vl5Var = (vl5) ww3.q1(enumMap.values());
            }
            return vl5Var.a;
        }
        vl5 vl5Var2 = (vl5) enumMap.get(bx5.b);
        if (vl5Var2 == null) {
            vl5Var2 = (vl5) ww3.q1(enumMap.values());
        }
        return vl5Var2.a;
    }

    public final long k(bx5 bx5Var) {
        boolean z = this.g;
        EnumMap enumMap = this.b;
        if (z) {
            vl5 vl5Var = (vl5) enumMap.get(bx5Var);
            if (vl5Var == null) {
                vl5Var = (vl5) ww3.q1(enumMap.values());
            }
            return vl5Var.a;
        }
        vl5 vl5Var2 = (vl5) enumMap.get(bx5.b);
        if (vl5Var2 == null) {
            vl5Var2 = (vl5) ww3.q1(enumMap.values());
        }
        return vl5Var2.a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextStyle(textAllCaps=");
        sb.append(this.a);
        sb.append(", textSizes=");
        sb.append(this.b);
        sb.append(", lineHeights=");
        sb.append(this.c);
        sb.append(", includeFontPadding=false, letterSpacings=");
        sb.append(this.d);
        sb.append(", fontFamily=");
        sb.append(this.e);
        sb.append(", fontWeight=");
        int i = this.f;
        if (i == 1) {
            str = "Regular";
        } else if (i == 2) {
            str = "Medium";
        } else if (i != 3) {
            str = i != 4 ? "null" : "Bold";
        } else {
            str = "Semibold";
        }
        sb.append(str);
        sb.append(", isDynamic=");
        return qt4.r(sb, this.g, ")");
    }
}
