package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hoh {
    public final ulh a;
    public final int b;
    public final int c;
    public final int d;
    public final CharSequence e;
    public final int f;
    public final boolean g;
    public final int h;

    public /* synthetic */ hoh(ulh ulhVar, int i, int i2, int i3, CharSequence charSequence, int i4, int i5, int i6) {
        this((i6 & 1) != 0 ? ulh.d : ulhVar, (i6 & 2) != 0 ? -16777216 : i, (i6 & 4) != 0 ? -1 : i2, (i6 & 8) != 0 ? -1 : i3, (i6 & 16) != 0 ? "" : charSequence, (i6 & 32) != 0 ? 2 : i4, false, (i6 & np0.m) != 0 ? R.drawable.icon_text_bg : i5);
    }

    public static hoh a(hoh hohVar, ulh ulhVar, int i, int i2, int i3, String str, int i4, boolean z, int i5, int i6) {
        if ((i6 & 1) != 0) {
            ulhVar = hohVar.a;
        }
        ulh ulhVar2 = ulhVar;
        if ((i6 & 2) != 0) {
            i = hohVar.b;
        }
        int i7 = i;
        if ((i6 & 4) != 0) {
            i2 = hohVar.c;
        }
        int i8 = i2;
        if ((i6 & 8) != 0) {
            i3 = hohVar.d;
        }
        int i9 = i3;
        CharSequence charSequence = str;
        if ((i6 & 16) != 0) {
            charSequence = hohVar.e;
        }
        CharSequence charSequence2 = charSequence;
        if ((i6 & 32) != 0) {
            i4 = hohVar.f;
        }
        int i10 = i4;
        boolean z2 = (i6 & 64) != 0 ? hohVar.g : z;
        int i11 = (i6 & np0.m) != 0 ? hohVar.h : i5;
        hohVar.getClass();
        return new hoh(ulhVar2, i7, i8, i9, charSequence2, i10, z2, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoh)) {
            return false;
        }
        hoh hohVar = (hoh) obj;
        return this.a == hohVar.a && this.b == hohVar.b && this.c == hohVar.c && this.d == hohVar.d && cqk.d(this.e, hohVar.e) && this.f == hohVar.f && this.g == hohVar.g && this.h == hohVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + nbh.n(c0a.f(this.f, mw7.f(zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStoryUiState(alignMode=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", textBackgroundColor=");
        qt4.x(this.c, this.d, ", toolColor=", ", text=", sb);
        sb.append((Object) this.e);
        sb.append(", textStyle=");
        sb.append(v0h.t(this.f));
        sb.append(", isColorPaletteVisible=");
        sb.append(this.g);
        sb.append(", backgroundColorToolIcon=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public hoh(ulh ulhVar, int i, int i2, int i3, CharSequence charSequence, int i4, boolean z, int i5) {
        this.a = ulhVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = charSequence;
        this.f = i4;
        this.g = z;
        this.h = i5;
    }
}
