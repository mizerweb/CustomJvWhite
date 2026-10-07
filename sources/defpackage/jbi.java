package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class jbi {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public jbi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087 A[PHI: r18
  0x0087: PHI (r18v7 java.lang.String) = 
  (r18v2 java.lang.String)
  (r18v2 java.lang.String)
  (r18v2 java.lang.String)
  (r18v2 java.lang.String)
  (r18v2 java.lang.String)
  (r18v2 java.lang.String)
  (r18v2 java.lang.String)
  (r18v2 java.lang.String)
  (r18v4 java.lang.String)
  (r18v9 java.lang.String)
 binds: [B:90:0x0128, B:84:0x011b, B:78:0x010e, B:72:0x0101, B:66:0x00f4, B:60:0x00e7, B:54:0x00da, B:48:0x00cd, B:41:0x00b9, B:29:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j, nq4 nq4Var, String str, String str2) {
        ibi ibiVar;
        String str3;
        String str4;
        String strK;
        String strK2;
        int length;
        int length2;
        long j2 = j;
        if (nq4Var instanceof ibi) {
            ibiVar = (ibi) nq4Var;
            int i = ibiVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ibiVar.g = i - Integer.MIN_VALUE;
            } else {
                ibiVar = new ibi(this, nq4Var);
            }
        } else {
            ibiVar = new ibi(this, nq4Var);
        }
        Object obj = ibiVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = ibiVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            String name = jbi.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    if (str != 0) {
                        if (gm0.c()) {
                            str3 = "***";
                            strK = str.toString();
                        } else {
                            str3 = "***";
                            if (str instanceof Collection) {
                                Collection collection = (Collection) str;
                                if (collection.isEmpty()) {
                                    str4 = "{}";
                                    strK = "[]";
                                } else {
                                    strK = c0a.k(collection.size(), "[**", "**]");
                                }
                            } else if (str instanceof Map) {
                                Map map = (Map) str;
                                if (map.isEmpty()) {
                                    strK = "{}";
                                    str4 = strK;
                                } else {
                                    strK = c0a.k(map.size(), "{**", "**}");
                                }
                            } else if (str instanceof Object[]) {
                                Object[] objArr = (Object[]) str;
                                str4 = "{}";
                                if (objArr.length == 0) {
                                    strK = "[]";
                                } else {
                                    length2 = objArr.length;
                                    strK = c0a.k(length2, "[**", "**]");
                                }
                            } else {
                                str4 = "{}";
                                if (str instanceof int[]) {
                                    int[] iArr = (int[]) str;
                                    if (iArr.length == 0) {
                                        strK = "[]";
                                    } else {
                                        length2 = iArr.length;
                                        strK = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (str instanceof float[]) {
                                    float[] fArr = (float[]) str;
                                    if (fArr.length == 0) {
                                        strK = "[]";
                                    } else {
                                        length2 = fArr.length;
                                        strK = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (str instanceof long[]) {
                                    long[] jArr = (long[]) str;
                                    if (jArr.length == 0) {
                                        strK = "[]";
                                    } else {
                                        length2 = jArr.length;
                                        strK = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (str instanceof double[]) {
                                    double[] dArr = (double[]) str;
                                    if (dArr.length == 0) {
                                        strK = "[]";
                                    } else {
                                        length2 = dArr.length;
                                        strK = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (str instanceof short[]) {
                                    short[] sArr = (short[]) str;
                                    if (sArr.length == 0) {
                                        strK = "[]";
                                    } else {
                                        length2 = sArr.length;
                                        strK = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (str instanceof byte[]) {
                                    byte[] bArr = (byte[]) str;
                                    if (bArr.length == 0) {
                                        strK = "[]";
                                    } else {
                                        length2 = bArr.length;
                                        strK = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (str instanceof char[]) {
                                    char[] cArr = (char[]) str;
                                    if (cArr.length == 0) {
                                        strK = "[]";
                                    } else {
                                        length2 = cArr.length;
                                        strK = c0a.k(length2, "[**", "**]");
                                    }
                                } else if (str instanceof boolean[]) {
                                    boolean[] zArr = (boolean[]) str;
                                    if (zArr.length == 0) {
                                        strK = "[]";
                                    } else {
                                        length2 = zArr.length;
                                        strK = c0a.k(length2, "[**", "**]");
                                    }
                                } else {
                                    strK = str3;
                                }
                            }
                        }
                        str4 = "{}";
                    } else {
                        str3 = "***";
                        str4 = "{}";
                        strK = null;
                    }
                    if (str2 == 0) {
                        strK2 = null;
                    } else if (gm0.c()) {
                        strK2 = str2.toString();
                    } else if (str2 instanceof Collection) {
                        Collection collection2 = (Collection) str2;
                        if (collection2.isEmpty()) {
                            strK2 = "[]";
                        } else {
                            length = collection2.size();
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else if (str2 instanceof Map) {
                        Map map2 = (Map) str2;
                        strK2 = map2.isEmpty() ? str4 : c0a.k(map2.size(), "{**", "**}");
                    } else if (str2 instanceof Object[]) {
                        Object[] objArr2 = (Object[]) str2;
                        if (objArr2.length == 0) {
                            strK2 = "[]";
                        } else {
                            length = objArr2.length;
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else if (str2 instanceof int[]) {
                        int[] iArr2 = (int[]) str2;
                        if (iArr2.length == 0) {
                            strK2 = "[]";
                        } else {
                            length = iArr2.length;
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else if (str2 instanceof float[]) {
                        float[] fArr2 = (float[]) str2;
                        if (fArr2.length == 0) {
                            strK2 = "[]";
                        } else {
                            length = fArr2.length;
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else if (str2 instanceof long[]) {
                        long[] jArr2 = (long[]) str2;
                        if (jArr2.length == 0) {
                            strK2 = "[]";
                        } else {
                            length = jArr2.length;
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else if (str2 instanceof double[]) {
                        double[] dArr2 = (double[]) str2;
                        if (dArr2.length == 0) {
                            strK2 = "[]";
                        } else {
                            length = dArr2.length;
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else if (str2 instanceof short[]) {
                        short[] sArr2 = (short[]) str2;
                        if (sArr2.length == 0) {
                            strK2 = "[]";
                        } else {
                            length = sArr2.length;
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else if (str2 instanceof byte[]) {
                        byte[] bArr2 = (byte[]) str2;
                        if (bArr2.length == 0) {
                            strK2 = "[]";
                        } else {
                            length = bArr2.length;
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else if (str2 instanceof char[]) {
                        char[] cArr2 = (char[]) str2;
                        if (cArr2.length == 0) {
                            strK2 = "[]";
                        } else {
                            length = cArr2.length;
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else if (str2 instanceof boolean[]) {
                        boolean[] zArr2 = (boolean[]) str2;
                        if (zArr2.length == 0) {
                            strK2 = "[]";
                        } else {
                            length = zArr2.length;
                            strK2 = c0a.k(length, "[**", "**]");
                        }
                    } else {
                        strK2 = str3;
                    }
                    a4cVar.c(je9Var, name, zo5.w(qt4.t(j2, "undo rename #", " ", strK), "|", strK2), null);
                }
            }
            no4 no4Var = (no4) this.c.getValue();
            z92 z92Var = new z92(str, str2, 7);
            ibiVar.d = j2;
            ibiVar.g = 1;
            if (no4Var.b(j2, z92Var, ibiVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = ibiVar.d;
            ch3.d0(obj);
        }
        ((whh) this.a.getValue()).f(c0a.s(j2));
        ((ij4) this.b.getValue()).a(j2);
        return sbi.a;
    }
}
