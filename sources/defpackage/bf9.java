package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class bf9 implements tj8 {
    public final String a;

    public bf9(String str) {
        this.a = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[LOOP:0: B:21:0x0061->B:27:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[EDGE_INSN: B:31:0x0091->B:28:0x0091 BREAK  A[LOOP:0: B:21:0x0061->B:27:0x008e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public static k28 b(k28 k28Var) {
        String str;
        List list = k28Var.f;
        if (list != null) {
            fj8 fj8VarA0 = oc9.a0(oc9.f0(0, list.size()), 2);
            int i = fj8VarA0.a;
            int i2 = fj8VarA0.b;
            int i3 = fj8VarA0.c;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (true) {
                    if (!"apikey".equals(list.get(i))) {
                        if (i == i2) {
                            str = null;
                            break;
                        }
                        i += i3;
                    } else {
                        str = (String) list.get(i + 1);
                        break;
                    }
                }
            } else {
                str = null;
                break;
            }
        } else {
            str = null;
            break;
        }
        if (str == null) {
            return k28Var;
        }
        t84 t84VarG = k28Var.g();
        if (((ArrayList) t84VarG.d) != null) {
            String strE = ghb.e(0, 0, 219, "apikey", " !\"#$&'(),/:;<=>?@[]\\^`{|}~");
            int size = ((ArrayList) t84VarG.d).size() - 2;
            int iS = wk8.s(size, 0, -2);
            if (iS <= size) {
                while (true) {
                    if (!strE.equals(((ArrayList) t84VarG.d).get(size))) {
                        if (size != iS) {
                            break;
                            break;
                        }
                        size -= 2;
                    } else {
                        ((ArrayList) t84VarG.d).remove(size + 1);
                        ((ArrayList) t84VarG.d).remove(size);
                        if (!((ArrayList) t84VarG.d).isEmpty()) {
                            if (size != iS) {
                                break;
                            }
                            size -= 2;
                        } else {
                            t84VarG.d = null;
                            break;
                        }
                    }
                }
            }
        }
        return t84VarG.c();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009e  */
    @Override // defpackage.tj8
    public final pne a(f9e f9eVar) throws IOException {
        boolean z;
        dle dleVar = f9eVar.e;
        String str = Object.class.cast(dleVar.e.get(Object.class)) instanceof String ? (String) Object.class.cast(dleVar.e.get(Object.class)) : "NO_TAG";
        long jNanoTime = System.nanoTime();
        Locale locale = Locale.US;
        k28 k28VarB = b(dleVar.a);
        yf2 yf2Var = f9eVar.d;
        c9e c9eVar = yf2Var != null ? (c9e) yf2Var.f : null;
        String str2 = "Sending request: url = " + k28VarB + ", tag = " + str + ", connection = " + c9eVar + ", headers = {" + dleVar.c.toString().replace("\n", ", ") + "}";
        String str3 = this.a;
        gm0.n(str3, str2);
        try {
            pne pneVarB = f9eVar.b(dleVar);
            long jAbs = Math.abs(System.nanoTime() - jNanoTime) / 1000000;
            k28 k28VarB2 = b(pneVarB.a.a);
            int i = pneVarB.d;
            if (i != 307 && i != 308) {
                switch (i) {
                    case 300:
                    case 301:
                    case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                    case HttpStatus.SC_SEE_OTHER /* 303 */:
                        z = true;
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = true;
            }
            String strReplace = pneVarB.f.toString().replace("\n", ", ");
            StringBuilder sb = new StringBuilder("Received response: url = ");
            sb.append(k28VarB2);
            sb.append(", tag = ");
            sb.append(str);
            sb.append(", code = ");
            sb.append(i);
            sb.append(", isRedirect=");
            sb.append(z);
            sb.append(". Takes ");
            qv1.s(jAbs, "ms, headers = {", strReplace, sb);
            sb.append("}");
            String string = sb.toString();
            if (pneVarB.E()) {
                gm0.n(str3, string);
                return pneVarB;
            }
            gm0.q(str3, string);
            return pneVarB;
        } catch (ClassCastException unused) {
            qr7.k("ClassCastException");
            return null;
        }
    }
}
