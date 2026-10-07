package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class uhd {
    public static final ul9 a;

    static {
        ul9 ul9Var = new ul9();
        ul9Var.put(zfe.a(String.class), n5h.a);
        ul9Var.put(zfe.a(Character.TYPE), jt2.a);
        ul9Var.put(zfe.a(char[].class), xs2.c);
        ul9Var.put(zfe.a(Double.TYPE), hp5.a);
        ul9Var.put(zfe.a(double[].class), cp5.c);
        ul9Var.put(zfe.a(Float.TYPE), sx6.a);
        ul9Var.put(zfe.a(float[].class), px6.c);
        ul9Var.put(zfe.a(Long.TYPE), ti9.a);
        ul9Var.put(zfe.a(long[].class), ei9.c);
        ul9Var.put(zfe.a(cai.class), gai.a);
        ul9Var.put(zfe.a(Integer.TYPE), ij8.a);
        ul9Var.put(zfe.a(int[].class), yi8.c);
        ul9Var.put(zfe.a(x9i.class), bai.a);
        ul9Var.put(zfe.a(Short.TYPE), k1g.a);
        ul9Var.put(zfe.a(short[].class), d1g.c);
        ul9Var.put(zfe.a(iai.class), mai.a);
        ul9Var.put(zfe.a(Byte.TYPE), w61.a);
        ul9Var.put(zfe.a(byte[].class), r61.c);
        ul9Var.put(zfe.a(s9i.class), w9i.a);
        ul9Var.put(zfe.a(Boolean.TYPE), b01.a);
        ul9Var.put(zfe.a(boolean[].class), a01.c);
        ul9Var.put(zfe.a(sbi.class), tbi.b);
        ul9Var.put(zfe.a(Void.class), lib.a);
        try {
            sr3 sr3VarA = zfe.a(ew5.class);
            ghb ghbVar = ew5.b;
            ul9Var.put(sr3VarA, iw5.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            ul9Var.put(zfe.a(dai.class), fai.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            ul9Var.put(zfe.a(y9i.class), aai.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            ul9Var.put(zfe.a(jai.class), lai.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            ul9Var.put(zfe.a(t9i.class), v9i.c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            ul9Var.put(zfe.a(bri.class), cri.a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        a = ul9Var.b();
    }

    public static final thd a(String str, rhd rhdVar) {
        Object it = ((wl9) a.values()).iterator();
        while (((sl9) it).hasNext()) {
            aw8 aw8Var = (aw8) ((tl9) it).next();
            if (str.equals(aw8Var.d().i())) {
                StringBuilder sbV = qt4.v("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbV.append(zfe.a(aw8Var.getClass()).h());
                sbV.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                ore.p(s5h.x0(sbV.toString()));
                return null;
            }
        }
        return new thd(str, rhdVar);
    }

    public static final aw8 b(rv8 rv8Var) {
        return (aw8) a.get(rv8Var);
    }
}
