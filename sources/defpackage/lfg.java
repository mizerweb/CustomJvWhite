package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class lfg extends Drawable.ConstantState {
    public final y46 a;
    public int b;
    public final int c;
    public final int d;
    public final c46 e;

    public lfg(y46 y46Var, int i, int i2, int i3, c46 c46Var) {
        this.a = y46Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = c46Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfg)) {
            return false;
        }
        lfg lfgVar = (lfg) obj;
        return cqk.d(this.a, lfgVar.a) && this.b == lfgVar.b && this.c == lfgVar.c && this.d == lfgVar.d && cqk.d(this.e, lfgVar.e);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public final int hashCode() {
        return this.e.hashCode() + zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new kfg(new lfg(this.a, this.b, this.c, this.d, this.e));
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder("SpriteEmojiDrawableState(location=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(i);
        sb.append(", paddingHorizontal=");
        qt4.x(this.c, this.d, ", paddingVertical=", ", bitmapResolver=", sb);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
