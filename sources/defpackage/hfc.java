package defpackage;

import android.text.Layout;
import android.text.SpannedString;

/* JADX INFO: loaded from: classes3.dex */
public final class hfc {
    public long a = 0;
    public long b = 0;
    public int c = 2;
    public float d = -3.4028235E38f;
    public int e = 1;
    public int f = 0;
    public float g = -3.4028235E38f;
    public int h = Integer.MIN_VALUE;
    public float i = 1.0f;
    public int j = Integer.MIN_VALUE;
    public CharSequence k;

    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    public suj a() {
        Layout.Alignment alignment;
        float f;
        float f2;
        float f3 = this.g;
        if (f3 == -3.4028235E38f) {
            int i = this.c;
            if (i != 4) {
                f3 = i != 5 ? 0.5f : 1.0f;
            } else {
                f3 = 0.0f;
            }
        }
        float f4 = f3;
        int i2 = this.h;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.c;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        int i4 = this.c;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            qt4.y(i4, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        float f5 = this.d;
        int i5 = this.e;
        if (f5 != -3.4028235E38f && i5 == 0 && (f5 < 0.0f || f5 > 1.0f)) {
            f = 1.0f;
        } else if (f5 != -3.4028235E38f) {
            f = f5;
        } else if (i5 == 0) {
            f = 1.0f;
        } else {
            f = -3.4028235E38f;
        }
        int i6 = this.f;
        float f6 = this.i;
        if (i2 == 0) {
            f2 = 1.0f - f4;
        } else if (i2 == 1) {
            f2 = f4 <= 0.5f ? 2.0f * f4 : 2.0f * (1.0f - f4);
        } else {
            if (i2 != 2) {
                ore.k(String.valueOf(i2));
                return null;
            }
            f2 = f4;
        }
        float fMin = Math.min(f6, f2);
        int i7 = this.j;
        SpannedString spannedString = (SpannedString) this.k;
        return new suj(new yy4(spannedString != null ? spannedString : null, alignment, null, null, f, i5, i6, f4, i2, Integer.MIN_VALUE, -3.4028235E38f, fMin, -3.4028235E38f, false, -16777216, i7, 0.0f, 0), this.a, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    public xy4 b() {
        Layout.Alignment alignment;
        float f = this.g;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.c;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.h;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.c;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        xy4 xy4Var = new xy4();
        int i4 = this.c;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            qt4.y(i4, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        xy4Var.c = alignment;
        float f3 = this.d;
        int i5 = this.e;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        xy4Var.e = f2;
        xy4Var.f = i5;
        xy4Var.g = this.f;
        xy4Var.h = f;
        xy4Var.i = i2;
        float f4 = this.i;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 == 1) {
            f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
        } else if (i2 != 2) {
            ore.k(String.valueOf(i2));
            return null;
        }
        xy4Var.l = Math.min(f4, f);
        xy4Var.p = this.j;
        CharSequence charSequence = this.k;
        if (charSequence != null) {
            xy4Var.a = charSequence;
            xy4Var.b = null;
        }
        return xy4Var;
    }
}
