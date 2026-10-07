package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vka {
    public final int a;

    public static final boolean a(int i) {
        return i >= 0 && (i & 16) != 0;
    }

    public static final boolean b(int i) {
        return i >= 0 && (i & 2) != 0;
    }

    public static final boolean c(int i) {
        return i >= 0 && (i & 1) != 0;
    }

    public static final boolean d(int i) {
        return i >= 0 && (i & 4) != 0;
    }

    public static final boolean e(int i) {
        return i == -2147483646;
    }

    public static final boolean f(int i) {
        int i2;
        if (b(i) || d(i) || (i2 = (-2130706433) & i) == -2147483639) {
            return true;
        }
        return (i >= 0 && (i & 8) != 0) || i2 == -2147483642 || a(i);
    }

    public static String g(int i) {
        StringBuilder sb = new StringBuilder("MessageViewType(bubbleType=");
        sb.append(new z21(2080374784 & i));
        if (c(i)) {
            sb.append(',');
            if (((-2080374786) & i) == 0) {
                sb.append("text_only");
            } else {
                sb.append("text");
            }
        }
        if (b(i)) {
            sb.append(",photo");
        }
        if (d(i)) {
            sb.append(",video");
        }
        if (i >= 0 && (i & 8) != 0) {
            sb.append(",voice");
        }
        int i2 = (-2130706433) & i;
        if (i2 == -2147483638) {
            sb.append(",contact");
        }
        if (i2 == -2147483639) {
            sb.append(",file");
        }
        if (i2 == -2147483640) {
            sb.append(",geo");
        }
        if (i2 == -2147483636) {
            sb.append(",new_geo");
        }
        if (i2 == -2147483641) {
            sb.append(",sticker");
        }
        if (i2 == -2147483647) {
            sb.append(",call");
        }
        if (i2 == -2147483637) {
            sb.append(",share");
        }
        if (i2 == -2147483645) {
            sb.append(",big_emoji");
        }
        if (i == 0) {
            sb.append(",control");
        }
        if (e(i)) {
            sb.append(",widget");
        }
        if ((16777216 & i) != 0) {
            sb.append(",reply");
        }
        if ((33554432 & i) != 0) {
            sb.append(",forward");
        }
        if (a(i)) {
            sb.append(",collage");
        }
        if (i2 == -2147483644) {
            sb.append(",lottie_sticker");
        }
        if (i2 == -2147483643) {
            sb.append(",webm_sticker");
        }
        if (i2 == -2147483642) {
            sb.append(",video_message");
        }
        if (i2 == -2147483635) {
            sb.append(",content_level");
        }
        if (i2 == -2147483634) {
            sb.append(",unsupported");
        }
        if (i2 == -2147483633) {
            sb.append(",poll");
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vka) {
            return this.a == ((vka) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g(this.a);
    }
}
