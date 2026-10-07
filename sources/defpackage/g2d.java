package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* JADX INFO: loaded from: classes3.dex */
public final class g2d extends u1 {
    public final wj a;
    public final ut8 b;
    public int c;

    public g2d(String str) {
        StringReader stringReader = new StringReader(str);
        new HashMap();
        wj wjVar = new wj(1);
        this.a = wjVar;
        this.c = -1;
        this.b = new ut8(stringReader);
        wjVar.d(0);
    }

    public static long y(String str) {
        if (str.indexOf(46) >= 0 || str.indexOf(101) >= 0 || str.indexOf(69) >= 0) {
            return (long) Double.parseDouble(str);
        }
        int length = str.length();
        long j = 0;
        if (str.charAt(0) != '-') {
            if (length < 19) {
                return Long.parseLong(str);
            }
            if (length == 19 && str.compareTo("9223372036854775807") <= 0) {
                return Long.parseLong(str);
            }
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt < '0' || cCharAt > '9') {
                    throw new NumberFormatException("Cannot parse long from ".concat(str));
                }
                j = (j * 10) + ((long) (cCharAt - '0'));
            }
            return j;
        }
        if (length < 20) {
            return Long.parseLong(str);
        }
        if (length == 20 && str.compareTo("-9223372036854775808") <= 0) {
            return Long.parseLong(str);
        }
        for (int i2 = 1; i2 < length; i2++) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                throw new NumberFormatException("Cannot parse long from ".concat(str));
            }
            j = (j * 10) + ((long) (cCharAt2 - '0'));
        }
        return -j;
    }

    public final String A() throws IOException {
        l();
        ut8 ut8Var = this.b;
        int iY = ut8Var.Y();
        if (iY == -1) {
            ore.k("EOF");
            return null;
        }
        if (iY == 34) {
            StringBuilder sb = new StringBuilder();
            ut8Var.g(sb);
            return sb.toString();
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
                        throw JsonSyntaxException.a(ut8Var.d, ut8Var.I(), ut8Var.b);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            ut8Var.b(sb2);
            return sb2.toString();
        }
        return ut8Var.K();
    }

    public final String E() throws JsonSyntaxException {
        l();
        StringBuilder sb = new StringBuilder();
        b05.c(this.b, sb);
        return sb.toString();
    }

    @Override // defpackage.vu8
    public final String E0() throws JsonSyntaxException {
        int iPeek = peek();
        if (iPeek == 0) {
            return "";
        }
        if (iPeek != 34 && iPeek != 49) {
            if (iPeek != 91) {
                if (iPeek != 98 && iPeek != 110) {
                    if (iPeek != 123) {
                        throw JsonStateException.d(iPeek);
                    }
                }
            }
            return E();
        }
        return A();
    }

    @Override // defpackage.vu8
    public final String F() throws JsonSyntaxException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            return this.b.P();
        }
        if (iPeek != 49) {
            if (iPeek != 91) {
                if (iPeek != 98 && iPeek != 110) {
                    if (iPeek != 123) {
                        throw JsonStateException.d(iPeek);
                    }
                }
            }
            return E();
        }
        return A();
    }

    public final JsonTypeMismatchException I(int i) throws JsonSyntaxException {
        int iPeek = peek();
        if (iPeek == 34 || iPeek == 49 || iPeek == 91 || iPeek == 98 || iPeek == 110 || iPeek == 123) {
            return new JsonTypeMismatchException(i, iPeek);
        }
        throw JsonStateException.d(iPeek);
    }

    @Override // defpackage.vu8
    public final boolean V() throws JsonTypeMismatchException, IOException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            String strP = this.b.P();
            String strTrim = strP.trim();
            strTrim.getClass();
            if (strTrim.equals("true")) {
                return true;
            }
            if (!strTrim.equals("false")) {
                throw new JsonTypeMismatchException("Cannot parse boolean from string ".concat(strP));
            }
        } else {
            if (iPeek != 49) {
                if (iPeek != 91) {
                    if (iPeek == 98) {
                        return A().equals("true");
                    }
                    if (iPeek == 110) {
                        A();
                        return false;
                    }
                    if (iPeek != 123) {
                        throw JsonStateException.d(iPeek);
                    }
                }
                throw I(98);
            }
            if (Double.parseDouble(A()) != 0.0d) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vu8
    public final String Z() throws IOException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            return this.b.P();
        }
        if (iPeek != 49) {
            if (iPeek != 91) {
                if (iPeek != 98) {
                    if (iPeek == 110) {
                        A();
                        return null;
                    }
                    if (iPeek != 123) {
                        throw JsonStateException.d(iPeek);
                    }
                }
            }
            return E();
        }
        return A();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // defpackage.vu8
    public final boolean hasNext() throws JsonSyntaxException {
        int iPeek = peek();
        if (iPeek == 0) {
            return false;
        }
        if (iPeek == 34 || iPeek == 39 || iPeek == 49 || iPeek == 91) {
            return true;
        }
        if (iPeek == 93) {
            return false;
        }
        if (iPeek == 98 || iPeek == 110 || iPeek == 123) {
            return true;
        }
        if (iPeek == 125) {
            return false;
        }
        throw new AssertionError();
    }

    public final void l() {
        wj wjVar = this.a;
        int iA = wjVar.a();
        if (iA == 0) {
            wjVar.c(1);
        } else if (iA != 1) {
            if (iA == 2) {
                wjVar.c(3);
            } else if (iA != 3) {
                if (iA != 5) {
                    throw new AssertionError();
                }
                wjVar.c(6);
            }
        }
        this.c = -1;
    }

    @Override // defpackage.vu8
    public final String name() throws JsonSyntaxException {
        int iPeek = peek();
        if (iPeek != 39) {
            throw JsonStateException.c(iPeek);
        }
        this.a.c(5);
        this.c = -1;
        return this.b.P();
    }

    @Override // defpackage.vu8
    public final void p() throws JsonSyntaxException, JsonTypeMismatchException {
        int iPeek = peek();
        if (iPeek != 0) {
            if (iPeek != 34) {
                if (iPeek != 39) {
                    if (iPeek != 49 && iPeek != 91) {
                        if (iPeek != 93) {
                            if (iPeek != 98 && iPeek != 110) {
                                if (iPeek == 123) {
                                    this.a.d(4);
                                    this.c = -1;
                                    this.b.W();
                                    return;
                                } else if (iPeek != 125) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            throw I(123);
        }
        throw JsonStateException.d(iPeek);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // defpackage.vu8
    public final int peek() throws JsonSyntaxException {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int iA = this.a.a();
        ut8 ut8Var = this.b;
        int iK0 = ut8Var.k0();
        int iK1 = 93;
        switch (iA) {
            case 0:
                if (iK0 == 0) {
                    throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), iK0);
                }
                iK1 = ut8Var.k0();
                if (iK1 != 34) {
                    if (iK1 != 49 && iK1 != 91 && iK1 != 98 && iK1 != 110 && iK1 != 123) {
                        throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), iK1);
                    }
                } else if (iA != 4 || iA == 6) {
                    iK1 = 39;
                } else {
                    iK1 = 34;
                }
                this.c = iK1;
                return iK1;
            case 1:
                if (iK0 == 0) {
                    iK1 = 0;
                } else {
                    iK1 = ut8Var.k0();
                    if (iK1 != 34) {
                        if (iK1 != 49) {
                            throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), iK1);
                        }
                    } else if (iA != 4) {
                        iK1 = 39;
                    } else {
                        iK1 = 39;
                    }
                }
                this.c = iK1;
                return iK1;
            case 2:
                if (iK0 != 93) {
                    iK1 = ut8Var.k0();
                    if (iK1 != 34) {
                        if (iK1 != 49) {
                            throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), iK1);
                        }
                    } else if (iA != 4) {
                        iK1 = 39;
                    } else {
                        iK1 = 39;
                    }
                }
                this.c = iK1;
                return iK1;
            case 3:
                if (iK0 != 93) {
                    ut8Var.A(44);
                    ut8Var.W();
                    iK1 = ut8Var.k0();
                    if (iK1 != 34) {
                        if (iK1 != 49) {
                            throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), iK1);
                        }
                    } else if (iA != 4) {
                        iK1 = 39;
                    } else {
                        iK1 = 39;
                    }
                }
                this.c = iK1;
                return iK1;
            case 4:
                if (iK0 == 125) {
                    iK1 = 125;
                } else {
                    ut8Var.A(34);
                    iK1 = ut8Var.k0();
                    if (iK1 != 34) {
                        if (iK1 != 49) {
                            throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), iK1);
                        }
                    } else if (iA != 4) {
                        iK1 = 39;
                    } else {
                        iK1 = 39;
                    }
                }
                this.c = iK1;
                return iK1;
            case 5:
                ut8Var.A(58);
                ut8Var.W();
                iK1 = ut8Var.k0();
                if (iK1 != 34) {
                    if (iK1 != 49) {
                        throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), iK1);
                    }
                } else if (iA != 4) {
                    iK1 = 39;
                } else {
                    iK1 = 39;
                }
                this.c = iK1;
                return iK1;
            case 6:
                if (iK0 == 125) {
                    iK1 = 125;
                } else {
                    ut8Var.A(44);
                    ut8Var.W();
                    ut8Var.A(34);
                    iK1 = ut8Var.k0();
                    if (iK1 != 34) {
                        if (iK1 != 49) {
                            throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), iK1);
                        }
                    } else if (iA != 4) {
                        iK1 = 39;
                    } else {
                        iK1 = 39;
                    }
                }
                this.c = iK1;
                return iK1;
            default:
                iK1 = ut8Var.k0();
                if (iK1 != 34) {
                    if (iK1 != 49) {
                        throw JsonSyntaxException.b(ut8Var.d, ut8Var.I(), iK1);
                    }
                } else if (iA != 4) {
                    iK1 = 39;
                } else {
                    iK1 = 39;
                }
                this.c = iK1;
                return iK1;
        }
    }

    @Override // defpackage.vu8
    public final void q() throws JsonSyntaxException {
        int iPeek = peek();
        if (iPeek != 93) {
            throw JsonStateException.a(iPeek);
        }
        this.a.b();
        l();
        this.b.W();
    }

    @Override // defpackage.vu8
    public final void r() throws JsonSyntaxException, JsonTypeMismatchException {
        int iPeek = peek();
        if (iPeek != 0) {
            if (iPeek != 34) {
                if (iPeek != 39) {
                    if (iPeek != 49) {
                        if (iPeek == 91) {
                            this.a.d(2);
                            this.c = -1;
                            this.b.W();
                            return;
                        } else if (iPeek != 93) {
                            if (iPeek != 98 && iPeek != 110 && iPeek != 123) {
                                if (iPeek != 125) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            throw I(91);
        }
        throw JsonStateException.d(iPeek);
    }

    @Override // defpackage.vu8
    public final void t() throws JsonSyntaxException {
        int iPeek = peek();
        if (iPeek != 125) {
            throw JsonStateException.b(iPeek);
        }
        this.a.b();
        l();
        this.b.W();
    }

    @Override // defpackage.vu8
    public final long v() throws JsonTypeMismatchException, IOException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            String strP = this.b.P();
            try {
                return y(strP.trim());
            } catch (NumberFormatException unused) {
                throw new JsonTypeMismatchException("Cannot parse long from string ".concat(strP));
            }
        }
        if (iPeek == 49) {
            return y(A());
        }
        if (iPeek != 91) {
            if (iPeek == 98) {
                return A().equals("true") ? 1L : 0L;
            }
            if (iPeek == 110) {
                A();
                return 0L;
            }
            if (iPeek != 123) {
                throw JsonStateException.d(iPeek);
            }
        }
        throw I(49);
    }

    @Override // defpackage.vu8
    public final void x() throws JsonSyntaxException {
        int iPeek = peek();
        if (iPeek != 34 && iPeek != 49 && iPeek != 91 && iPeek != 98 && iPeek != 110 && iPeek != 123) {
            throw JsonStateException.d(iPeek);
        }
        l();
        b05.b(this.b);
    }

    @Override // defpackage.vu8
    public final int z() throws JsonTypeMismatchException, IOException {
        int iPeek = peek();
        if (iPeek == 34) {
            l();
            String strP = this.b.P();
            try {
                return (int) y(strP.trim());
            } catch (NumberFormatException unused) {
                throw new JsonTypeMismatchException("Cannot parse int from string ".concat(strP));
            }
        }
        if (iPeek == 49) {
            return (int) y(A());
        }
        if (iPeek != 91) {
            if (iPeek == 98) {
                return A().equals("true") ? 1 : 0;
            }
            if (iPeek == 110) {
                A();
                return 0;
            }
            if (iPeek != 123) {
                throw JsonStateException.d(iPeek);
            }
        }
        throw I(49);
    }
}
