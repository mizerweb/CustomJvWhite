package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import ru.ok.android.api.json.JsonSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public final class ut8 implements Closeable {
    public final Reader a;
    public int b = Integer.MIN_VALUE;
    public final char[] c = new char[32];
    public int d;

    public ut8(Reader reader) {
        this.a = reader;
    }

    public final void A(int i) {
        int iK0 = k0();
        if (iK0 != i) {
            throw JsonSyntaxException.b(this.d, I(), iK0);
        }
    }

    public final void E(int i) throws IOException {
        int i2 = read();
        if (i2 != i) {
            throw JsonSyntaxException.a(this.d, I(), i2);
        }
    }

    public final String I() {
        StringBuilder sb = new StringBuilder(32);
        int i = this.d;
        char[] cArr = this.c;
        if (i < 32) {
            sb.append(cArr, 0, i);
        } else {
            int i2 = i % 32;
            sb.append(cArr, i2, 32 - i2);
            sb.append(cArr, 0, i2);
        }
        return sb.toString();
    }

    public final String K() throws IOException {
        String str;
        int i = this.b;
        if (i == 44) {
            str = ",";
        } else if (i == 58) {
            str = ":";
        } else if (i == 91) {
            str = "[";
        } else if (i == 93) {
            str = "]";
        } else if (i == 102) {
            E(97);
            E(108);
            E(115);
            E(101);
            str = "false";
        } else if (i == 110) {
            E(117);
            E(108);
            E(108);
            str = "null";
        } else if (i == 116) {
            E(114);
            E(117);
            E(101);
            str = "true";
        } else if (i == 123) {
            str = "{";
        } else {
            if (i != 125) {
                throw new AssertionError();
            }
            str = "}";
        }
        this.b = Integer.MIN_VALUE;
        return str;
    }

    public final String P() throws IOException {
        StringBuilder sb = new StringBuilder();
        if (Y() != 34) {
            ore.k("Not at string");
            return null;
        }
        while (true) {
            int i = read();
            if (i == 34) {
                this.b = Integer.MIN_VALUE;
                return sb.toString();
            }
            if (i <= 31) {
                throw JsonSyntaxException.a(this.d, I(), i);
            }
            if (i != 92) {
                sb.append((char) i);
            } else {
                int i2 = read();
                if (i2 == 34 || i2 == 47 || i2 == 92) {
                    sb.append((char) i2);
                } else if (i2 == 98) {
                    sb.append('\b');
                } else if (i2 == 102) {
                    sb.append('\f');
                } else if (i2 == 110) {
                    sb.append('\n');
                } else if (i2 == 114) {
                    sb.append('\r');
                } else if (i2 == 116) {
                    sb.append('\t');
                } else {
                    if (i2 != 117) {
                        throw JsonSyntaxException.a(this.d, I(), i2);
                    }
                    sb.append((char) ((k1m.b((char) y()) << 12) | ((char) ((k1m.b((char) y()) << 8) | ((char) ((k1m.b((char) y()) << 4) | ((char) k1m.b((char) y()))))))));
                }
            }
        }
    }

    public final void W() {
        int iY = Y();
        if (iY == -1) {
            ore.k("EOF");
            return;
        }
        if (iY == 34) {
            g(mib.a);
            return;
        }
        if (iY != 91 && iY != 93) {
            if (iY == 102 || iY == 110 || iY == 116) {
                K();
                return;
            }
            if (iY != 123 && iY != 125 && iY != 44) {
                if (iY != 45) {
                    switch (iY) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            break;
                        case 58:
                            break;
                        default:
                            throw JsonSyntaxException.a(this.d, I(), this.b);
                    }
                }
                b(mib.a);
                return;
            }
        }
        this.b = Integer.MIN_VALUE;
    }

    public final int Y() throws IOException {
        int i;
        int i2 = this.b;
        if (i2 >= -1) {
            return i2;
        }
        while (true) {
            i = read();
            if (i != 9 && i != 10 && i != 13 && i != 32 && (i != 65279 || this.d != 1)) {
                break;
            }
        }
        this.b = i;
        return i;
    }

    public final void b(Appendable appendable) throws IOException {
        int i;
        int i2 = this.b;
        if (i2 == 45) {
            appendable.append((char) i2);
            i2 = read();
        }
        if (i2 == 48) {
            appendable.append((char) i2);
            i = read();
        } else {
            if (i2 < 49 || i2 > 57) {
                throw JsonSyntaxException.a(this.d, I(), i2);
            }
            appendable.append((char) i2);
            i = read();
            while (i >= 48 && i <= 57) {
                appendable.append((char) i);
                i = read();
            }
        }
        if (i == 46) {
            appendable.append((char) i);
            int i3 = read();
            if (i3 < 48 || i3 > 57) {
                throw JsonSyntaxException.a(this.d, I(), i3);
            }
            appendable.append((char) i3);
            i = read();
            while (i >= 48 && i <= 57) {
                appendable.append((char) i);
                i = read();
            }
        }
        if (i == 101 || i == 69) {
            appendable.append((char) i);
            int i4 = read();
            if (i4 == 43 || i4 == 45) {
                appendable.append((char) i4);
                i4 = read();
            }
            if (i4 < 48 || i4 > 57) {
                throw JsonSyntaxException.a(this.d, I(), i4);
            }
            appendable.append((char) i4);
            i = read();
            while (i >= 48 && i <= 57) {
                appendable.append((char) i);
                i = read();
            }
        }
        if (i == 9 || i == 10 || i == 13 || i == 32) {
            this.b = Integer.MIN_VALUE;
        } else {
            this.b = i;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b = Integer.MIN_VALUE;
        this.a.close();
    }

    public final void g(Appendable appendable) throws IOException {
        appendable.append((char) this.b);
        while (true) {
            int i = read();
            if (i <= 31) {
                throw JsonSyntaxException.a(this.d, I(), i);
            }
            appendable.append((char) i);
            if (i == 34) {
                this.b = Integer.MIN_VALUE;
                return;
            }
            if (i == 92) {
                int i2 = read();
                if (i2 == 34 || i2 == 47 || i2 == 92 || i2 == 98 || i2 == 102 || i2 == 110 || i2 == 114 || i2 == 116) {
                    appendable.append((char) i2);
                } else {
                    if (i2 != 117) {
                        throw JsonSyntaxException.a(this.d, I(), i2);
                    }
                    appendable.append((char) i2);
                    for (int i3 = 0; i3 < 4; i3++) {
                        int i4 = read();
                        if ((i4 < 48 || i4 > 57) && ((i4 < 97 || i4 > 102) && (i4 < 65 || i4 > 70))) {
                            throw JsonSyntaxException.a(this.d, I(), i4);
                        }
                        appendable.append((char) i4);
                    }
                }
            }
        }
    }

    public final int k0() {
        int iY = Y();
        if (iY == -1) {
            return 0;
        }
        int i = 34;
        if (iY != 34) {
            i = 91;
            if (iY != 91) {
                i = 93;
                if (iY != 93) {
                    if (iY == 102) {
                        return 98;
                    }
                    int i2 = 110;
                    if (iY != 110) {
                        if (iY == 116) {
                            return 98;
                        }
                        i2 = 123;
                        if (iY != 123) {
                            i2 = 125;
                            if (iY != 125) {
                                i2 = 44;
                                if (iY != 44) {
                                    if (iY == 45) {
                                        return 49;
                                    }
                                    switch (iY) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            return 49;
                                        case 58:
                                            return 58;
                                        default:
                                            throw JsonSyntaxException.a(this.d, I(), this.b);
                                    }
                                }
                            }
                        }
                    }
                    return i2;
                }
            }
        }
        return i;
    }

    public final void l(Appendable appendable) {
        int iY = Y();
        if (iY == -1) {
            ore.k("EOF");
            return;
        }
        if (iY == 34) {
            g(appendable);
            return;
        }
        if (iY != 91 && iY != 93 && iY != 102 && iY != 110 && iY != 116 && iY != 123 && iY != 125 && iY != 44) {
            if (iY != 45) {
                switch (iY) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        break;
                    case 58:
                        break;
                    default:
                        throw JsonSyntaxException.a(this.d, I(), this.b);
                }
            }
            b(appendable);
            return;
        }
        appendable.append(K());
    }

    public final int read() throws IOException {
        try {
            int i = this.a.read();
            if (i == -1) {
                return i;
            }
            char[] cArr = this.c;
            int i2 = this.d;
            cArr[i2 % 32] = (char) i;
            this.d = i2 + 1;
            return i;
        } catch (IOException e) {
            this.b = Integer.MIN_VALUE;
            throw e;
        }
    }

    public final int y() throws IOException {
        int i = read();
        if ((i < 48 || i > 57) && ((i < 97 || i > 102) && (i < 65 || i > 70))) {
            throw JsonSyntaxException.a(this.d, I(), i);
        }
        return i;
    }
}
