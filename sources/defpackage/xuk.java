package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xuk {
    public static void a() {
        Exception exc = new Exception();
        String simpleName = e2k.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static hq b(nmc nmcVar) {
        String str;
        int iM = nmcVar.m();
        if (nmcVar.m() != 1684108385) {
            lvb.G0("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = nmcVar.m();
        byte[] bArr = r21.a;
        int i = iM2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            qt4.y(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        nmcVar.O(4);
        int i2 = iM - 16;
        byte[] bArr2 = new byte[i2];
        nmcVar.k(0, bArr2, i2);
        return new hq(str, null, 3, bArr2);
    }

    public static smh c(int i, nmc nmcVar, String str) {
        int iM = nmcVar.m();
        if (nmcVar.m() == 1684108385 && iM >= 22) {
            nmcVar.O(10);
            int iH = nmcVar.H();
            if (iH > 0) {
                String strH = zo5.h(iH, "");
                int iH2 = nmcVar.H();
                if (iH2 > 0) {
                    strH = qt4.j(iH2, strH, "/");
                }
                return new smh(str, null, c98.r(strH));
            }
        }
        lvb.G0("MetadataUtil", "Failed to parse index/count attribute: ".concat(gn2.a(i)));
        return null;
    }

    public static int d(nmc nmcVar) {
        int iM = nmcVar.m();
        if (nmcVar.m() == 1684108385) {
            nmcVar.O(8);
            int i = iM - 16;
            if (i == 1) {
                return nmcVar.A();
            }
            if (i == 2) {
                return nmcVar.H();
            }
            if (i == 3) {
                return nmcVar.D();
            }
            if (i == 4 && (nmcVar.j() & np0.m) == 0) {
                return nmcVar.E();
            }
        }
        lvb.G0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static e48 e(int i, String str, nmc nmcVar, boolean z, boolean z2) {
        int iD = d(nmcVar);
        if (z2) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            return z ? new smh(str, null, c98.r(Integer.toString(iD))) : new cz3("und", str, Integer.toString(iD));
        }
        lvb.G0("MetadataUtil", "Failed to parse uint8 attribute: ".concat(gn2.a(i)));
        return null;
    }

    public static smh f(int i, nmc nmcVar, String str) {
        int iM = nmcVar.m();
        if (nmcVar.m() == 1684108385) {
            nmcVar.O(8);
            return new smh(str, null, c98.r(nmcVar.w(iM - 16)));
        }
        lvb.G0("MetadataUtil", "Failed to parse text attribute: ".concat(gn2.a(i)));
        return null;
    }

    public static void g(int i, lwa lwaVar, a87 a87Var, lwa lwaVar2, lwa... lwaVarArr) {
        if (lwaVar2 == null) {
            lwaVar2 = new lwa(new jwa[0]);
        }
        if (lwaVar != null) {
            z88 z88VarL = c98.l();
            for (jwa jwaVar : lwaVar.a) {
                if (qp9.class.isAssignableFrom(jwaVar.getClass())) {
                    z88VarL.c((jwa) qp9.class.cast(jwaVar));
                }
            }
            a98 a98VarListIterator = z88VarL.h().listIterator(0);
            while (a98VarListIterator.hasNext()) {
                qp9 qp9Var = (qp9) a98VarListIterator.next();
                if (!qp9Var.a.equals("com.android.capture.fps") || i == 2) {
                    lwaVar2 = lwaVar2.a(qp9Var);
                }
            }
        }
        for (lwa lwaVar3 : lwaVarArr) {
            lwaVar2 = lwaVar2.b(lwaVar3);
        }
        if (lwaVar2.a.length > 0) {
            a87Var.k = lwaVar2;
        }
    }
}
