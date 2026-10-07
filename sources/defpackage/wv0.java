package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wv0 {
    public static final String b;
    public static final String c;
    public static final wv0 d;
    public static final wv0 e;
    public final boolean a;

    static {
        cmh cmhVar = emh.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new wv0(false);
        e = new wv0(true);
    }

    public wv0(boolean z) {
        cmh cmhVar = emh.a;
        this.a = z;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        vv0 vv0Var = new vv0(charSequence);
        vv0Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = vv0Var.c;
            if (i4 < vv0Var.b && i == 0) {
                CharSequence charSequence2 = vv0Var.a;
                char cCharAt = charSequence2.charAt(i4);
                vv0Var.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = vv0Var.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    vv0Var.c = Character.charCount(iCodePointAt) + vv0Var.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    vv0Var.c = i5 + 1;
                    char c2 = vv0Var.d;
                    directionality = c2 < 1792 ? vv0.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (vv0Var.c > 0) {
                    switch (vv0Var.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        vv0 vv0Var = new vv0(charSequence);
        vv0Var.c = vv0Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (vv0Var.c > 0) {
                byte bA = vv0Var.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }
}
