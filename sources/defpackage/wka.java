package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wka extends ala {
    public final boolean a;
    public final int b;

    public wka(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wka)) {
            return false;
        }
        wka wkaVar = (wka) obj;
        return this.a == wkaVar.a && this.b == wkaVar.b;
    }

    public final int hashCode() {
        return qt4.D(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExpandEmoji(expand=");
        sb.append(this.a);
        sb.append(", collapseType=");
        int i = this.b;
        if (i == 1) {
            str = "BY_DEFAULT";
        } else if (i == 2) {
            str = "BY_FOCUS";
        } else if (i != 3) {
            str = i != 4 ? "null" : "BY_MEDIA_KEYBOARD";
        } else {
            str = "BY_EMOJI_STATE";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
