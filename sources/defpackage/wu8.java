package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* JADX INFO: loaded from: classes4.dex */
public final class wu8 extends u1 {
    public static final pt8 b = new pt8();
    public final ju8 a;

    public wu8(ju8 ju8Var) throws JsonSyntaxException {
        this.a = ju8Var;
        try {
            ju8Var.P();
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static wu8 b(InputStream inputStream) throws JsonSyntaxException {
        try {
            pt8 pt8Var = b;
            l38 l38VarA = pt8Var.a(new ep4(true, inputStream, pt8Var.h), false);
            try {
                ju8 ju8VarB = new pa0(l38VarA, inputStream).b(pt8Var.d, pt8Var.b, pt8Var.a, pt8Var.c);
                new HashMap();
                return new wu8(ju8VarB);
            } catch (IOException | RuntimeException e) {
                if (l38VarA.d) {
                    try {
                        inputStream.close();
                    } catch (Exception e2) {
                        e.addSuppressed(e2);
                    }
                }
                l38VarA.close();
                throw e;
            }
        } catch (JsonParseException e3) {
            throw new JsonSyntaxException(e3);
        }
    }

    public static wu8 g(String str) throws JsonSyntaxException {
        try {
            p8e p8eVarB = b.b(str);
            new HashMap();
            return new wu8(p8eVarB);
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    public static String l(ju8 ju8Var) throws Throwable {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        pt8 pt8Var = b;
        x0k x0kVar = new x0k(pt8Var.a(new ep4(true, charArrayWriter, pt8Var.h), false), pt8Var.e, charArrayWriter, pt8Var.k);
        oif oifVar = pt8Var.j;
        if (oifVar != pt8.o) {
            x0kVar.i = oifVar;
        }
        cv8 cv8Var = ju8Var.b;
        int i = cv8Var == null ? -1 : cv8Var.d;
        if (i == 5) {
            x0kVar.P(ju8Var.j1());
            cv8 cv8VarP = ju8Var.P();
            i = cv8VarP == null ? -1 : cv8VarP.d;
        }
        if (i == 1) {
            x0kVar.Y();
            x0kVar.b(ju8Var);
        } else if (i != 3) {
            cv8 cv8Var2 = ju8Var.b;
            switch (cv8Var2 != null ? cv8Var2.d : -1) {
                case -1:
                    throw new JsonGenerationException("No current event to copy", null, null);
                case 0:
                default:
                    c.q(cv8Var2, "Internal error: unknown current token, ");
                    return null;
                case 1:
                    x0kVar.Y();
                    break;
                case 2:
                    x0kVar.K();
                    break;
                case 3:
                    x0kVar.W();
                    break;
                case 4:
                    x0kVar.I();
                    break;
                case 5:
                    x0kVar.P(ju8Var.j1());
                    break;
                case 6:
                    x0kVar.y(ju8Var);
                    break;
                case 7:
                    x0kVar.l(ju8Var);
                    break;
                case 8:
                    x0kVar.g(ju8Var);
                    break;
                case 9:
                    x0kVar.E(true);
                    break;
                case 10:
                    x0kVar.E(false);
                    break;
                case 11:
                    x0kVar.D0("write a null");
                    x0kVar.I0();
                    break;
                case 12:
                    x0kVar.D0("write a null");
                    x0kVar.I0();
                    break;
            }
        } else {
            x0kVar.W();
            x0kVar.b(ju8Var);
        }
        x0kVar.close();
        return charArrayWriter.toString();
    }

    @Override // defpackage.vu8
    public final String E0() throws Throwable {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    return "";
                case 1:
                case 3:
                case 6:
                    String strL = l(ju8Var);
                    ju8Var.P();
                    return strL;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    String strY = ju8Var.y();
                    ju8Var.P();
                    return strY;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.vu8
    public final String F() throws Throwable {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    String strL = l(ju8Var);
                    ju8Var.P();
                    return strL;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String strY = ju8Var.y();
                    ju8Var.P();
                    return strY;
                case 11:
                    ju8Var.P();
                    return "null";
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r6.equals("false") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r6.equals("true") != false) goto L30;
     */
    @Override // defpackage.vu8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean V() throws ru.ok.android.api.json.JsonTypeMismatchException, ru.ok.android.api.json.JsonSyntaxException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu8.V():boolean");
    }

    @Override // defpackage.vu8
    public final String Z() throws Throwable {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    String strL = l(ju8Var);
                    ju8Var.P();
                    return strL;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String strY = ju8Var.y();
                    ju8Var.P();
                    return strY;
                case 11:
                    ju8Var.P();
                    return null;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.vu8
    public final boolean hasNext() {
        ju8 ju8Var = this.a;
        switch (ju8Var.I0()) {
            case -1:
                c.i("Non-blocking parsing not supported");
                return false;
            case 0:
            case 2:
            case 4:
                return false;
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
            case 12:
                c.i("Embedded objects not supported");
                return false;
            default:
                throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
        }
    }

    @Override // defpackage.vu8
    public final String name() throws JsonSyntaxException {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.c(0);
                case 1:
                    throw JsonStateException.c(123);
                case 2:
                    throw JsonStateException.c(125);
                case 3:
                    throw JsonStateException.c(91);
                case 4:
                    throw JsonStateException.c(93);
                case 5:
                    String strJ1 = ju8Var.j1();
                    ju8Var.P();
                    return strJ1;
                case 6:
                    throw JsonStateException.c(34);
                case 7:
                case 8:
                    throw JsonStateException.c(49);
                case 9:
                case 10:
                    throw JsonStateException.c(98);
                case 11:
                    throw JsonStateException.c(110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.vu8
    public final void p() throws JsonTypeMismatchException, JsonSyntaxException {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    ju8Var.P();
                    return;
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    throw new JsonTypeMismatchException(123, 91);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    throw new JsonTypeMismatchException(123, 34);
                case 7:
                case 8:
                    throw new JsonTypeMismatchException(123, 49);
                case 9:
                case 10:
                    throw new JsonTypeMismatchException(123, 98);
                case 11:
                    throw new JsonTypeMismatchException(123, 110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.vu8
    public final int peek() {
        ju8 ju8Var = this.a;
        switch (ju8Var.I0()) {
            case -1:
                c.i("Non-blocking parsing not supported");
                return 0;
            case 0:
                return 0;
            case 1:
                return 123;
            case 2:
                return 125;
            case 3:
                return 91;
            case 4:
                return 93;
            case 5:
                return 39;
            case 6:
                return 34;
            case 7:
            case 8:
                return 49;
            case 9:
            case 10:
                return 98;
            case 11:
                return 110;
            case 12:
                c.i("Embedded objects not supported");
                return 0;
            default:
                throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
        }
    }

    @Override // defpackage.vu8
    public final void q() throws JsonSyntaxException {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.a(0);
                case 1:
                    throw JsonStateException.a(123);
                case 2:
                    throw JsonStateException.a(125);
                case 3:
                    throw JsonStateException.a(91);
                case 4:
                    ju8Var.P();
                    return;
                case 5:
                    throw JsonStateException.a(39);
                case 6:
                    throw JsonStateException.a(34);
                case 7:
                case 8:
                    throw JsonStateException.a(49);
                case 9:
                case 10:
                    throw JsonStateException.a(98);
                case 11:
                    throw JsonStateException.a(110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.vu8
    public final void r() throws JsonTypeMismatchException, JsonSyntaxException {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    throw new JsonTypeMismatchException(91, 123);
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    ju8Var.P();
                    return;
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    throw new JsonTypeMismatchException(91, 34);
                case 7:
                case 8:
                    throw new JsonTypeMismatchException(91, 49);
                case 9:
                case 10:
                    throw new JsonTypeMismatchException(91, 98);
                case 11:
                    throw new JsonTypeMismatchException(91, 110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.vu8
    public final void t() throws JsonSyntaxException {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.b(0);
                case 1:
                    throw JsonStateException.b(123);
                case 2:
                    ju8Var.P();
                    return;
                case 3:
                    throw JsonStateException.b(91);
                case 4:
                    throw JsonStateException.b(93);
                case 5:
                    throw JsonStateException.b(39);
                case 6:
                    throw JsonStateException.b(34);
                case 7:
                case 8:
                    throw JsonStateException.b(49);
                case 9:
                case 10:
                    throw JsonStateException.b(98);
                case 11:
                    throw JsonStateException.b(110);
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.vu8
    public final long v() throws JsonTypeMismatchException, JsonSyntaxException {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                    throw new JsonTypeMismatchException(49, 123);
                case 2:
                    throw JsonStateException.d(125);
                case 3:
                    throw new JsonTypeMismatchException(49, 91);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                    String strY = ju8Var.y();
                    ju8Var.P();
                    try {
                        return g2d.y(strY.trim());
                    } catch (NumberFormatException unused) {
                        throw new JsonTypeMismatchException("Cannot parse long from string " + strY);
                    }
                case 7:
                    int iD = qt4.D(ju8Var.m1());
                    long jL1 = (iD == 0 || iD == 1) ? ju8Var.l1() : ju8Var.n1().longValue();
                    ju8Var.P();
                    return jL1;
                case 8:
                    double dK1 = ju8Var.k1();
                    ju8Var.P();
                    return (long) dK1;
                case 9:
                    ju8Var.P();
                    return 1L;
                case 10:
                    ju8Var.P();
                    return 0L;
                case 11:
                    ju8Var.P();
                    return 0L;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
        throw new JsonSyntaxException(e);
    }

    @Override // defpackage.vu8
    public final void x() throws JsonSyntaxException {
        ju8 ju8Var = this.a;
        try {
            switch (ju8Var.I0()) {
                case -1:
                    throw new UnsupportedOperationException("Non-blocking parsing not supported");
                case 0:
                    throw JsonStateException.d(0);
                case 1:
                case 3:
                    cv8 cv8Var = ju8Var.b;
                    if (cv8Var == cv8.START_OBJECT || cv8Var == cv8.START_ARRAY) {
                        int i = 1;
                        while (true) {
                            cv8 cv8VarP = ju8Var.P();
                            if (cv8VarP == null) {
                                ju8Var.k0();
                            } else if (cv8VarP.e) {
                                i++;
                            } else if (cv8VarP.f) {
                                i--;
                                if (i == 0) {
                                }
                            } else if (cv8VarP == cv8.NOT_AVAILABLE) {
                                throw new JsonParseException(ju8Var, "Not enough content available for `skipChildren()`: non-blocking parser? (" + ju8Var.getClass().getName() + ")");
                            }
                        }
                    }
                    ju8Var.P();
                    return;
                case 2:
                    throw JsonStateException.d(125);
                case 4:
                    throw JsonStateException.d(93);
                case 5:
                    throw JsonStateException.d(39);
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    ju8Var.P();
                    return;
                case 12:
                    throw new UnsupportedOperationException("Embedded objects not supported");
                default:
                    throw new AssertionError("Unknown JsonTokenId " + ju8Var.I0());
            }
        } catch (JsonParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // defpackage.vu8
    public final int z() {
        return (int) v();
    }
}
