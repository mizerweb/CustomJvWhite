package androidx.datastore.preferences.protobuf;

import defpackage.b1k;
import defpackage.bm9;
import defpackage.c71;
import defpackage.fm9;
import defpackage.gm9;
import defpackage.i5e;
import defpackage.i79;
import defpackage.kdi;
import defpackage.kp6;
import defpackage.l3f;
import defpackage.ldi;
import defpackage.lp6;
import defpackage.mci;
import defpackage.mw7;
import defpackage.np0;
import defpackage.o8e;
import defpackage.ore;
import defpackage.oxj;
import defpackage.pwd;
import defpackage.qt4;
import defpackage.r5a;
import defpackage.rxj;
import defpackage.sxj;
import defpackage.vg8;
import defpackage.vu3;
import defpackage.wfb;
import defpackage.wj8;
import defpackage.xh6;
import defpackage.xtj;
import defpackage.zh6;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements l3f {
    public static final int[] o = new int[0];
    public static final Unsafe p = ldi.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final a e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final wfb k;
    public final i79 l;
    public final i m;
    public final gm9 n;

    public f(int[] iArr, Object[] objArr, int i, int i2, a aVar, boolean z, int[] iArr2, int i3, int i4, wfb wfbVar, i79 i79Var, i iVar, zh6 zh6Var, gm9 gm9Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = aVar instanceof d;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = wfbVar;
        this.l = i79Var;
        this.m = iVar;
        this.e = aVar;
        this.n = gm9Var;
    }

    public static long A(long j, Object obj) {
        return ((Long) ldi.d.i(j, obj)).longValue();
    }

    public static Field C(String str, Class cls) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbV = qt4.v("Field ", str, " for ");
            sbV.append(cls.getName());
            sbV.append(" not found. Known fields are ");
            sbV.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbV.toString());
        }
    }

    public static int F(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void J(int i, Object obj, b1k b1kVar) throws IOException {
        if (!(obj instanceof String)) {
            b1kVar.H(i, (c71) obj);
        } else {
            ((vu3) b1kVar.b).E(i, (String) obj);
        }
    }

    public static List s(long j, Object obj) {
        return (List) ldi.d.i(j, obj);
    }

    public static f w(i5e i5eVar, wfb wfbVar, i79 i79Var, i iVar, zh6 zh6Var, gm9 gm9Var) {
        if (i5eVar instanceof i5e) {
            return x(i5eVar, wfbVar, i79Var, iVar, zh6Var, gm9Var);
        }
        ore.m();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0283  */
    /* JADX WARN: Code duplicated, block: B:127:0x0287  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:166:0x035b  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ad  */
    public static f x(i5e i5eVar, wfb wfbVar, i79 i79Var, i iVar, zh6 zh6Var, gm9 gm9Var) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int[] iArr2;
        int i15;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        Field fieldC;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldC2;
        int i26;
        Object obj2;
        Field fieldC3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        char cCharAt14;
        int i32 = 0;
        boolean z = (i5eVar.d & 1) != 1;
        String str = i5eVar.b;
        int length = str.length();
        int iCharAt3 = str.charAt(0);
        if (iCharAt3 >= 55296) {
            int i33 = iCharAt3 & 8191;
            int i34 = 1;
            int i35 = 13;
            while (true) {
                i = i34 + 1;
                cCharAt14 = str.charAt(i34);
                if (cCharAt14 < 55296) {
                    break;
                }
                i33 |= (cCharAt14 & 8191) << i35;
                i35 += 13;
                i34 = i;
            }
            iCharAt3 = i33 | (cCharAt14 << i35);
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int iCharAt4 = str.charAt(i);
        if (iCharAt4 >= 55296) {
            int i37 = iCharAt4 & 8191;
            int i38 = 13;
            while (true) {
                i31 = i36 + 1;
                cCharAt13 = str.charAt(i36);
                if (cCharAt13 < 55296) {
                    break;
                }
                i37 |= (cCharAt13 & 8191) << i38;
                i38 += 13;
                i36 = i31;
            }
            iCharAt4 = i37 | (cCharAt13 << i38);
            i36 = i31;
        }
        if (iCharAt4 == 0) {
            i4 = 0;
            i6 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            iArr = o;
            i5 = 0;
        } else {
            int i39 = i36 + 1;
            int iCharAt5 = str.charAt(i36);
            if (iCharAt5 >= 55296) {
                int i40 = iCharAt5 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt8 = str.charAt(i39);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt5 = i40 | (cCharAt8 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt6 = str.charAt(i39);
            if (iCharAt6 >= 55296) {
                int i43 = iCharAt6 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt7 = str.charAt(i42);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt6 = i43 | (cCharAt7 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt7 = str.charAt(i42);
            if (iCharAt7 >= 55296) {
                int i46 = iCharAt7 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt6 = str.charAt(i45);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt7 = i46 | (cCharAt6 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            int iCharAt8 = str.charAt(i45);
            if (iCharAt8 >= 55296) {
                int i49 = iCharAt8 & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt5 = str.charAt(i48);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt8 = i49 | (cCharAt5 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            iCharAt = str.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt4 = str.charAt(i51);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt = i52 | (cCharAt4 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            iCharAt2 = str.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt3 = str.charAt(i54);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt2 = i55 | (cCharAt3 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = str.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = i57;
                int i60 = 13;
                while (true) {
                    i8 = i59 + 1;
                    cCharAt2 = str.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i59 = i8;
                }
                iCharAt9 = i58 | (cCharAt2 << i60);
                i2 = i8;
            } else {
                i2 = i57;
            }
            int i61 = i2 + 1;
            int iCharAt10 = str.charAt(i2);
            if (iCharAt10 >= 55296) {
                int i62 = iCharAt10 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i7 = i63 + 1;
                    cCharAt = str.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i63 = i7;
                }
                iCharAt10 = i62 | (cCharAt << i64);
                i61 = i7;
            }
            int[] iArr3 = new int[iCharAt10 + iCharAt2 + iCharAt9];
            i3 = (iCharAt5 * 2) + iCharAt6;
            int i65 = iCharAt7;
            iArr = iArr3;
            i4 = i65;
            i5 = iCharAt8;
            i6 = iCharAt10;
            i32 = iCharAt5;
            i36 = i61;
        }
        Unsafe unsafe = p;
        Object[] objArr = i5eVar.c;
        int i66 = i32;
        Class<?> cls = i5eVar.a.getClass();
        int i67 = iCharAt3;
        int[] iArr4 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i68 = iCharAt2 + i6;
        int i69 = i6;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i36 < length) {
            int i73 = i36 + 1;
            int iCharAt11 = str.charAt(i36);
            int i74 = length;
            if (iCharAt11 >= 55296) {
                int i75 = iCharAt11 & 8191;
                int i76 = i73;
                int i77 = 13;
                while (true) {
                    i30 = i76 + 1;
                    cCharAt12 = str.charAt(i76);
                    iArr2 = iArr4;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i30;
                    iArr4 = iArr2;
                }
                iCharAt11 = i75 | (cCharAt12 << i77);
                i15 = i30;
            } else {
                iArr2 = iArr4;
                i15 = i73;
            }
            int i78 = i15 + 1;
            int iCharAt12 = str.charAt(i15);
            if (iCharAt12 >= 55296) {
                int i79 = iCharAt12 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i28 = i80 + 1;
                    cCharAt11 = str.charAt(i80);
                    i29 = i79;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 = i29 | ((cCharAt11 & 8191) << i81);
                    i81 += 13;
                    i80 = i28;
                }
                iCharAt12 = i29 | (cCharAt11 << i81);
                i16 = i28;
            } else {
                i16 = i78;
            }
            int i82 = i4;
            int i83 = iCharAt12 & 255;
            Object[] objArr3 = objArr;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i84 = iCharAt11;
            if (i83 >= 51) {
                int i85 = i16 + 1;
                int iCharAt13 = str.charAt(i16);
                char c = 55296;
                if (iCharAt13 >= 55296) {
                    int i86 = iCharAt13 & 8191;
                    int i87 = 13;
                    while (true) {
                        i27 = i85 + 1;
                        cCharAt10 = str.charAt(i85);
                        if (cCharAt10 < c) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i85 = i27;
                        c = 55296;
                    }
                    iCharAt13 = i86 | (cCharAt10 << i87);
                    i85 = i27;
                }
                int i88 = i83 - 51;
                int i89 = iCharAt13;
                if (i88 == 9 || i88 == 17) {
                    i24 = i3 + 1;
                    objArr2[((i72 / 3) * 2) + 1] = objArr3[i3];
                } else {
                    if (i88 == 12 && (i67 & 1) == 1) {
                        i24 = i3 + 1;
                        objArr2[((i72 / 3) * 2) + 1] = objArr3[i3];
                    }
                    i25 = i89 * 2;
                    obj = objArr3[i25];
                    if (obj instanceof Field) {
                        fieldC2 = (Field) obj;
                    } else {
                        fieldC2 = C((String) obj, cls);
                        objArr3[i25] = fieldC2;
                    }
                    int i90 = i85;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldC2);
                    i26 = i25 + 1;
                    obj2 = objArr3[i26];
                    if (obj2 instanceof Field) {
                        fieldC3 = (Field) obj2;
                    } else {
                        fieldC3 = C((String) obj2, cls);
                        objArr3[i26] = fieldC3;
                    }
                    int i91 = i3;
                    z = z;
                    i21 = i91;
                    i36 = i90;
                    i22 = iObjectFieldOffset3;
                    i17 = i5;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC3);
                    i20 = 0;
                }
                i3 = i24;
                i25 = i89 * 2;
                obj = objArr3[i25];
                if (obj instanceof Field) {
                    fieldC2 = (Field) obj;
                } else {
                    fieldC2 = C((String) obj, cls);
                    objArr3[i25] = fieldC2;
                }
                int i92 = i85;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldC2);
                i26 = i25 + 1;
                obj2 = objArr3[i26];
                if (obj2 instanceof Field) {
                    fieldC3 = (Field) obj2;
                } else {
                    fieldC3 = C((String) obj2, cls);
                    objArr3[i26] = fieldC3;
                }
                int i93 = i3;
                z = z;
                i21 = i93;
                i36 = i92;
                i22 = iObjectFieldOffset4;
                i17 = i5;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC3);
                i20 = 0;
            } else {
                int i94 = i3 + 1;
                Field fieldC4 = C((String) objArr3[i3], cls);
                if (i83 == 9 || i83 == 17) {
                    i17 = i5;
                    objArr2[((i72 / 3) * 2) + 1] = fieldC4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i17 = i5;
                        i23 = i3 + 2;
                        objArr2[((i72 / 3) * 2) + 1] = objArr3[i94];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i17 = i5;
                        if ((i67 & 1) == 1) {
                            i23 = i3 + 2;
                            objArr2[((i72 / 3) * 2) + 1] = objArr3[i94];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
                        if ((i67 & 1) == 1 || i83 > 17) {
                            i19 = i16;
                            i20 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            int i95 = i16 + 1;
                            int iCharAt14 = str.charAt(i16);
                            if (iCharAt14 >= 55296) {
                                int i96 = iCharAt14 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i19 = i95 + 1;
                                    cCharAt9 = str.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i19;
                                }
                                iCharAt14 = i96 | (cCharAt9 << i97);
                            } else {
                                i19 = i95;
                            }
                            int i98 = (iCharAt14 / 32) + (i66 * 2);
                            Object obj3 = objArr3[i98];
                            if (obj3 instanceof Field) {
                                fieldC = (Field) obj3;
                            } else {
                                fieldC = C((String) obj3, cls);
                                objArr3[i98] = fieldC;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldC);
                            i20 = iCharAt14 % 32;
                        }
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        i21 = i18;
                        i22 = iObjectFieldOffset;
                        i36 = i19;
                    } else {
                        if (i83 == 50) {
                            int i99 = i69 + 1;
                            iArr[i69] = i72;
                            int i100 = (i72 / 3) * 2;
                            int i101 = i3 + 2;
                            objArr2[i100] = objArr3[i94];
                            if ((iCharAt12 & np0.q) != 0) {
                                i18 = i3 + 3;
                                objArr2[i100 + 1] = objArr3[i101];
                                i17 = i5;
                                i69 = i99;
                            } else {
                                i18 = i101;
                                i69 = i99;
                                i17 = i5;
                            }
                        } else {
                            i17 = i5;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
                        if ((i67 & 1) == 1) {
                            i19 = i16;
                            i20 = 0;
                            iObjectFieldOffset2 = 0;
                        } else {
                            i19 = i16;
                            i20 = 0;
                            iObjectFieldOffset2 = 0;
                        }
                        if (i83 >= 18) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        i21 = i18;
                        i22 = iObjectFieldOffset;
                        i36 = i19;
                    }
                    i18 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
                    if ((i67 & 1) == 1) {
                        i19 = i16;
                        i20 = 0;
                        iObjectFieldOffset2 = 0;
                    } else {
                        i19 = i16;
                        i20 = 0;
                        iObjectFieldOffset2 = 0;
                    }
                    if (i83 >= 18) {
                        iArr[i70] = iObjectFieldOffset;
                        i70++;
                    }
                    i21 = i18;
                    i22 = iObjectFieldOffset;
                    i36 = i19;
                }
                i18 = i94;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldC4);
                if ((i67 & 1) == 1) {
                    i19 = i16;
                    i20 = 0;
                    iObjectFieldOffset2 = 0;
                } else {
                    i19 = i16;
                    i20 = 0;
                    iObjectFieldOffset2 = 0;
                }
                if (i83 >= 18) {
                    iArr[i70] = iObjectFieldOffset;
                    i70++;
                }
                i21 = i18;
                i22 = iObjectFieldOffset;
                i36 = i19;
            }
            int i102 = i72 + 1;
            iArr2[i72] = i84;
            int i103 = i72 + 2;
            String str2 = str;
            iArr2[i102] = ((iCharAt12 & np0.o) != 0 ? 536870912 : 0) | ((iCharAt12 & np0.n) != 0 ? 268435456 : 0) | (i83 << 20) | i22;
            i72 += 3;
            iArr2[i103] = (i20 << 20) | iObjectFieldOffset2;
            boolean z2 = z;
            i3 = i21;
            z = z2;
            i4 = i82;
            length = i74;
            objArr = objArr3;
            iArr4 = iArr2;
            i5 = i17;
            str = str2;
        }
        return new f(iArr4, objArr2, i4, i5, i5eVar.a, z, iArr, i6, i68, wfbVar, i79Var, iVar, zh6Var, gm9Var);
    }

    public static long y(int i) {
        return i & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) ldi.d.i(j, obj)).intValue();
    }

    public final void B(Object obj, int i, o8e o8eVar) {
        if ((536870912 & i) != 0) {
            ldi.o(i & 1048575, obj, o8eVar.L());
        } else if (this.f) {
            ldi.o(i & 1048575, obj, o8eVar.B());
        } else {
            ldi.o(i & 1048575, obj, o8eVar.q());
        }
    }

    public final void D(int i, Object obj) {
        if (this.g) {
            return;
        }
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        ldi.m(j, obj, ldi.d.g(j, obj) | (1 << (i2 >>> 20)));
    }

    public final void E(int i, int i2, Object obj) {
        ldi.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int G(int i) {
        return this.a[i + 1];
    }

    public final void H(Object obj, b1k b1kVar) throws IOException {
        int i;
        int i2;
        int i3;
        boolean z;
        int[] iArr = this.a;
        int length = iArr.length;
        Unsafe unsafe = p;
        int i4 = -1;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 = i3 + 3) {
            int iG = G(i6);
            int i7 = iArr[i6];
            int iF = F(iG);
            if (this.g || iF > 17) {
                i = 1048575;
                i2 = 0;
            } else {
                int i8 = iArr[i6 + 2];
                i = 1048575;
                int i9 = i8 & 1048575;
                if (i9 != i4) {
                    i5 = unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            }
            long j = iG & i;
            switch (iF) {
                case 0:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        double dE = ldi.d.e(j, obj);
                        vu3 vu3Var = (vu3) b1kVar.b;
                        vu3Var.getClass();
                        vu3Var.y(i7, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        float f = ldi.d.f(j, obj);
                        vu3 vu3Var2 = (vu3) b1kVar.b;
                        vu3Var2.getClass();
                        vu3Var2.w(i7, Float.floatToRawIntBits(f));
                    }
                    break;
                case 2:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).J(i7, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).J(i7, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).A(i7, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).y(i7, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).w(i7, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).t(i7, ldi.d.c(j, obj));
                    }
                    break;
                case 8:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        J(i7, unsafe.getObject(obj, j), b1kVar);
                    }
                    break;
                case 9:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).D(i7, (a) unsafe.getObject(obj, j), n(i3));
                    }
                    break;
                case 10:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        b1kVar.H(i7, (c71) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).H(i7, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).A(i7, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).w(i7, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        ((vu3) b1kVar.b).y(i7, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        int i10 = unsafe.getInt(obj, j);
                        ((vu3) b1kVar.b).H(i7, (i10 >> 31) ^ (i10 << 1));
                    }
                    break;
                case 16:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        ((vu3) b1kVar.b).J(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    break;
                case 17:
                    i3 = i6;
                    if ((i2 & i5) != 0) {
                        b1kVar.I(i7, unsafe.getObject(obj, j), n(i3));
                    }
                    break;
                case 18:
                    i3 = i6;
                    h.A(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 19:
                    i3 = i6;
                    h.E(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    i3 = i6;
                    h.H(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 21:
                    i3 = i6;
                    h.P(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 22:
                    i3 = i6;
                    h.G(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 23:
                    i3 = i6;
                    h.D(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 24:
                    i3 = i6;
                    h.C(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 25:
                    i3 = i6;
                    h.y(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 26:
                    i3 = i6;
                    h.N(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar);
                    break;
                case 27:
                    i3 = i6;
                    h.I(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, n(i3));
                    break;
                case 28:
                    i3 = i6;
                    h.z(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar);
                    break;
                case 29:
                    i3 = i6;
                    z = false;
                    h.O(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 30:
                    i3 = i6;
                    z = false;
                    h.B(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 31:
                    i3 = i6;
                    z = false;
                    h.J(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 32:
                    i3 = i6;
                    z = false;
                    h.K(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 33:
                    i3 = i6;
                    z = false;
                    h.L(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case 34:
                    i3 = i6;
                    z = false;
                    h.M(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, false);
                    break;
                case vg8.l /* 35 */:
                    i3 = i6;
                    h.A(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 36:
                    i3 = i6;
                    h.E(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    i3 = i6;
                    h.H(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 38:
                    i3 = i6;
                    h.P(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 39:
                    i3 = i6;
                    h.G(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 40:
                    i3 = i6;
                    h.D(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 41:
                    i3 = i6;
                    h.C(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 42:
                    i3 = i6;
                    h.y(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 43:
                    i3 = i6;
                    h.O(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 44:
                    i3 = i6;
                    h.B(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 45:
                    i3 = i6;
                    h.J(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 46:
                    i3 = i6;
                    h.K(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 47:
                    i3 = i6;
                    h.L(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 48:
                    i3 = i6;
                    h.M(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, true);
                    break;
                case 49:
                    i3 = i6;
                    h.F(iArr[i3], (List) unsafe.getObject(obj, j), b1kVar, n(i3));
                    break;
                case 50:
                    i3 = i6;
                    I(b1kVar, i7, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        double dDoubleValue = ((Double) ldi.d.i(j, obj)).doubleValue();
                        vu3 vu3Var3 = (vu3) b1kVar.b;
                        vu3Var3.getClass();
                        vu3Var3.y(i7, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        float fFloatValue = ((Float) ldi.d.i(j, obj)).floatValue();
                        vu3 vu3Var4 = (vu3) b1kVar.b;
                        vu3Var4.getClass();
                        vu3Var4.w(i7, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).J(i7, A(j, obj));
                    }
                    break;
                case 54:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).J(i7, A(j, obj));
                    }
                    break;
                case 55:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).A(i7, z(j, obj));
                    }
                    break;
                case 56:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).y(i7, A(j, obj));
                    }
                    break;
                case 57:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).w(i7, z(j, obj));
                    }
                    break;
                case 58:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).t(i7, ((Boolean) ldi.d.i(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        J(i7, unsafe.getObject(obj, j), b1kVar);
                    }
                    break;
                case 60:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).D(i7, (a) unsafe.getObject(obj, j), n(i3));
                    }
                    break;
                case 61:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        b1kVar.H(i7, (c71) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).H(i7, z(j, obj));
                    }
                    break;
                case 63:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).A(i7, z(j, obj));
                    }
                    break;
                case 64:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).w(i7, z(j, obj));
                    }
                    break;
                case 65:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        ((vu3) b1kVar.b).y(i7, A(j, obj));
                    }
                    break;
                case 66:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        int iZ = z(j, obj);
                        ((vu3) b1kVar.b).H(i7, (iZ >> 31) ^ (iZ << 1));
                    }
                    break;
                case 67:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        long jA = A(j, obj);
                        ((vu3) b1kVar.b).J(i7, (jA >> 63) ^ (jA << 1));
                    }
                    break;
                case 68:
                    i3 = i6;
                    if (r(i7, i3, obj)) {
                        b1kVar.I(i7, unsafe.getObject(obj, j), n(i3));
                    }
                    break;
                default:
                    i3 = i6;
                    break;
            }
        }
        ((mci) this.m).getClass();
        ((d) obj).unknownFields.d(b1kVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0140  */
    /* JADX WARN: Code duplicated, block: B:48:0x014d  */
    /* JADX WARN: Code duplicated, block: B:49:0x015d  */
    /* JADX WARN: Code duplicated, block: B:50:0x016e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0175  */
    /* JADX WARN: Code duplicated, block: B:53:0x017e  */
    /* JADX WARN: Code duplicated, block: B:54:0x018a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0196  */
    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01df  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:71:0x0201  */
    /* JADX WARN: Code duplicated, block: B:72:0x020c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0213  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149 A[SYNTHETIC] */
    public final void I(b1k b1kVar, int i, Object obj, int i2) throws IOException {
        int iO;
        int size;
        int iN;
        int i3;
        int iM;
        int size2;
        int iN2;
        if (obj != null) {
            Object objM = m(i2);
            this.n.getClass();
            xtj xtjVar = ((bm9) objM).a;
            rxj rxjVar = (rxj) xtjVar.c;
            rxj rxjVar2 = (rxj) xtjVar.b;
            vu3 vu3Var = (vu3) b1kVar.b;
            vu3Var.getClass();
            for (Map.Entry entry : ((fm9) obj).entrySet()) {
                vu3Var.G(i, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i4 = kp6.c;
                int iM2 = vu3.m(1);
                oxj oxjVar = rxj.d;
                if (rxjVar2 == oxjVar) {
                    iM2 *= 2;
                }
                int iO2 = 8;
                switch (rxjVar2.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        iO = 8;
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key2);
                                kp6.b(vu3Var, rxjVar, 2, value2);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key3 = entry.getKey();
                                Object value3 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key3);
                                kp6.b(vu3Var, rxjVar, 2, value3);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key4 = entry.getKey();
                                Object value4 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key4);
                                kp6.b(vu3Var, rxjVar, 2, value4);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key5 = entry.getKey();
                                Object value5 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key5);
                                kp6.b(vu3Var, rxjVar, 2, value5);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key6 = entry.getKey();
                                Object value6 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key6);
                                kp6.b(vu3Var, rxjVar, 2, value6);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key7 = entry.getKey();
                                Object value7 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key7);
                                kp6.b(vu3Var, rxjVar, 2, value7);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key8 = entry.getKey();
                                Object value8 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key8);
                                kp6.b(vu3Var, rxjVar, 2, value8);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key9 = entry.getKey();
                                Object value9 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key9);
                                kp6.b(vu3Var, rxjVar, 2, value9);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key10 = entry.getKey();
                                Object value10 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key10);
                                kp6.b(vu3Var, rxjVar, 2, value10);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11 = entry.getKey();
                                Object value11 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11);
                                kp6.b(vu3Var, rxjVar, 2, value11);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key12 = entry.getKey();
                                Object value12 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key12);
                                kp6.b(vu3Var, rxjVar, 2, value12);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key13 = entry.getKey();
                                Object value13 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key13);
                                kp6.b(vu3Var, rxjVar, 2, value13);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key14 = entry.getKey();
                                Object value14 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key14);
                                kp6.b(vu3Var, rxjVar, 2, value14);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key15 = entry.getKey();
                                Object value15 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key15);
                                kp6.b(vu3Var, rxjVar, 2, value15);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key16 = entry.getKey();
                                Object value16 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key16);
                                kp6.b(vu3Var, rxjVar, 2, value16);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key17 = entry.getKey();
                                Object value17 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key17);
                                kp6.b(vu3Var, rxjVar, 2, value17);
                                break;
                            case 16:
                                int iIntValue = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue >> 31) ^ (iIntValue << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key18 = entry.getKey();
                                Object value18 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key18);
                                kp6.b(vu3Var, rxjVar, 2, value18);
                                break;
                            case 17:
                                long jLongValue = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue >> 63) ^ (jLongValue << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key19 = entry.getKey();
                                Object value19 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key19);
                                kp6.b(vu3Var, rxjVar, 2, value19);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 1:
                        ((Float) key).getClass();
                        iO = 4;
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key110 = entry.getKey();
                                Object value110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key110);
                                kp6.b(vu3Var, rxjVar, 2, value110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111 = entry.getKey();
                                Object value111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111);
                                kp6.b(vu3Var, rxjVar, 2, value111);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key112 = entry.getKey();
                                Object value112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key112);
                                kp6.b(vu3Var, rxjVar, 2, value112);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key113 = entry.getKey();
                                Object value113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key113);
                                kp6.b(vu3Var, rxjVar, 2, value113);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key114 = entry.getKey();
                                Object value114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key114);
                                kp6.b(vu3Var, rxjVar, 2, value114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key115 = entry.getKey();
                                Object value115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key115);
                                kp6.b(vu3Var, rxjVar, 2, value115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key116 = entry.getKey();
                                Object value116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key116);
                                kp6.b(vu3Var, rxjVar, 2, value116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key117 = entry.getKey();
                                Object value117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key117);
                                kp6.b(vu3Var, rxjVar, 2, value117);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key118 = entry.getKey();
                                Object value118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key118);
                                kp6.b(vu3Var, rxjVar, 2, value118);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key119 = entry.getKey();
                                Object value119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key119);
                                kp6.b(vu3Var, rxjVar, 2, value119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1110 = entry.getKey();
                                Object value1110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1110);
                                kp6.b(vu3Var, rxjVar, 2, value1110);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111 = entry.getKey();
                                Object value1111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111);
                                kp6.b(vu3Var, rxjVar, 2, value1111);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1112 = entry.getKey();
                                Object value1112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1112);
                                kp6.b(vu3Var, rxjVar, 2, value1112);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1113 = entry.getKey();
                                Object value1113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1113);
                                kp6.b(vu3Var, rxjVar, 2, value1113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1114 = entry.getKey();
                                Object value1114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1114);
                                kp6.b(vu3Var, rxjVar, 2, value1114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1115 = entry.getKey();
                                Object value1115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1115);
                                kp6.b(vu3Var, rxjVar, 2, value1115);
                                break;
                            case 16:
                                int iIntValue2 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1116 = entry.getKey();
                                Object value1116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1116);
                                kp6.b(vu3Var, rxjVar, 2, value1116);
                                break;
                            case 17:
                                long jLongValue2 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1117 = entry.getKey();
                                Object value1117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1117);
                                kp6.b(vu3Var, rxjVar, 2, value1117);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 2:
                        iO = vu3.o(((Long) key).longValue());
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1118 = entry.getKey();
                                Object value1118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1118);
                                kp6.b(vu3Var, rxjVar, 2, value1118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1119 = entry.getKey();
                                Object value1119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1119);
                                kp6.b(vu3Var, rxjVar, 2, value1119);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11110 = entry.getKey();
                                Object value11110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11110);
                                kp6.b(vu3Var, rxjVar, 2, value11110);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111 = entry.getKey();
                                Object value11111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111);
                                kp6.b(vu3Var, rxjVar, 2, value11111);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11112 = entry.getKey();
                                Object value11112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11112);
                                kp6.b(vu3Var, rxjVar, 2, value11112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11113 = entry.getKey();
                                Object value11113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11113);
                                kp6.b(vu3Var, rxjVar, 2, value11113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11114 = entry.getKey();
                                Object value11114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11114);
                                kp6.b(vu3Var, rxjVar, 2, value11114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11115 = entry.getKey();
                                Object value11115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11115);
                                kp6.b(vu3Var, rxjVar, 2, value11115);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key11116 = entry.getKey();
                                Object value11116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11116);
                                kp6.b(vu3Var, rxjVar, 2, value11116);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11117 = entry.getKey();
                                Object value11117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11117);
                                kp6.b(vu3Var, rxjVar, 2, value11117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11118 = entry.getKey();
                                Object value11118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11118);
                                kp6.b(vu3Var, rxjVar, 2, value11118);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11119 = entry.getKey();
                                Object value11119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11119);
                                kp6.b(vu3Var, rxjVar, 2, value11119);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111110 = entry.getKey();
                                Object value111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111110);
                                kp6.b(vu3Var, rxjVar, 2, value111110);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111 = entry.getKey();
                                Object value111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111112 = entry.getKey();
                                Object value111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111112);
                                kp6.b(vu3Var, rxjVar, 2, value111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111113 = entry.getKey();
                                Object value111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111113);
                                kp6.b(vu3Var, rxjVar, 2, value111113);
                                break;
                            case 16:
                                int iIntValue3 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key111114 = entry.getKey();
                                Object value111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111114);
                                kp6.b(vu3Var, rxjVar, 2, value111114);
                                break;
                            case 17:
                                long jLongValue3 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key111115 = entry.getKey();
                                Object value111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111115);
                                kp6.b(vu3Var, rxjVar, 2, value111115);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 3:
                        iO = vu3.o(((Long) key).longValue());
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111116 = entry.getKey();
                                Object value111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111116);
                                kp6.b(vu3Var, rxjVar, 2, value111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111117 = entry.getKey();
                                Object value111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111117);
                                kp6.b(vu3Var, rxjVar, 2, value111117);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111118 = entry.getKey();
                                Object value111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111118);
                                kp6.b(vu3Var, rxjVar, 2, value111118);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111119 = entry.getKey();
                                Object value111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111119);
                                kp6.b(vu3Var, rxjVar, 2, value111119);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111110 = entry.getKey();
                                Object value1111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111110);
                                kp6.b(vu3Var, rxjVar, 2, value1111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111 = entry.getKey();
                                Object value1111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111);
                                kp6.b(vu3Var, rxjVar, 2, value1111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111112 = entry.getKey();
                                Object value1111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111112);
                                kp6.b(vu3Var, rxjVar, 2, value1111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111113 = entry.getKey();
                                Object value1111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111113);
                                kp6.b(vu3Var, rxjVar, 2, value1111113);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111114 = entry.getKey();
                                Object value1111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111114);
                                kp6.b(vu3Var, rxjVar, 2, value1111114);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111115 = entry.getKey();
                                Object value1111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111115);
                                kp6.b(vu3Var, rxjVar, 2, value1111115);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111116 = entry.getKey();
                                Object value1111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111116);
                                kp6.b(vu3Var, rxjVar, 2, value1111116);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111117 = entry.getKey();
                                Object value1111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111117);
                                kp6.b(vu3Var, rxjVar, 2, value1111117);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111118 = entry.getKey();
                                Object value1111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111118);
                                kp6.b(vu3Var, rxjVar, 2, value1111118);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111119 = entry.getKey();
                                Object value1111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111119);
                                kp6.b(vu3Var, rxjVar, 2, value1111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111110 = entry.getKey();
                                Object value11111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111110);
                                kp6.b(vu3Var, rxjVar, 2, value11111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111 = entry.getKey();
                                Object value11111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111);
                                kp6.b(vu3Var, rxjVar, 2, value11111111);
                                break;
                            case 16:
                                int iIntValue4 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111112 = entry.getKey();
                                Object value11111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111112);
                                kp6.b(vu3Var, rxjVar, 2, value11111112);
                                break;
                            case 17:
                                long jLongValue4 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111113 = entry.getKey();
                                Object value11111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111113);
                                kp6.b(vu3Var, rxjVar, 2, value11111113);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 4:
                        iO = vu3.k(((Integer) key).intValue());
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111114 = entry.getKey();
                                Object value11111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111114);
                                kp6.b(vu3Var, rxjVar, 2, value11111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111115 = entry.getKey();
                                Object value11111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111115);
                                kp6.b(vu3Var, rxjVar, 2, value11111115);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111116 = entry.getKey();
                                Object value11111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111116);
                                kp6.b(vu3Var, rxjVar, 2, value11111116);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111117 = entry.getKey();
                                Object value11111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111117);
                                kp6.b(vu3Var, rxjVar, 2, value11111117);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111118 = entry.getKey();
                                Object value11111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111118);
                                kp6.b(vu3Var, rxjVar, 2, value11111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111119 = entry.getKey();
                                Object value11111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111119);
                                kp6.b(vu3Var, rxjVar, 2, value11111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111110 = entry.getKey();
                                Object value111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111110);
                                kp6.b(vu3Var, rxjVar, 2, value111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111 = entry.getKey();
                                Object value111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111111);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111112 = entry.getKey();
                                Object value111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111112);
                                kp6.b(vu3Var, rxjVar, 2, value111111112);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111113 = entry.getKey();
                                Object value111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111113);
                                kp6.b(vu3Var, rxjVar, 2, value111111113);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111114 = entry.getKey();
                                Object value111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111114);
                                kp6.b(vu3Var, rxjVar, 2, value111111114);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111115 = entry.getKey();
                                Object value111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111115);
                                kp6.b(vu3Var, rxjVar, 2, value111111115);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111116 = entry.getKey();
                                Object value111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111116);
                                kp6.b(vu3Var, rxjVar, 2, value111111116);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111117 = entry.getKey();
                                Object value111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111117);
                                kp6.b(vu3Var, rxjVar, 2, value111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111118 = entry.getKey();
                                Object value111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111118);
                                kp6.b(vu3Var, rxjVar, 2, value111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111119 = entry.getKey();
                                Object value111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111119);
                                kp6.b(vu3Var, rxjVar, 2, value111111119);
                                break;
                            case 16:
                                int iIntValue5 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111110 = entry.getKey();
                                Object value1111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111110);
                                kp6.b(vu3Var, rxjVar, 2, value1111111110);
                                break;
                            case 17:
                                long jLongValue5 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111 = entry.getKey();
                                Object value1111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 5:
                        ((Long) key).getClass();
                        iO = 8;
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111112 = entry.getKey();
                                Object value1111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111112);
                                kp6.b(vu3Var, rxjVar, 2, value1111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111113 = entry.getKey();
                                Object value1111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111113);
                                kp6.b(vu3Var, rxjVar, 2, value1111111113);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111114 = entry.getKey();
                                Object value1111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111114);
                                kp6.b(vu3Var, rxjVar, 2, value1111111114);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111115 = entry.getKey();
                                Object value1111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111115);
                                kp6.b(vu3Var, rxjVar, 2, value1111111115);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111116 = entry.getKey();
                                Object value1111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111116);
                                kp6.b(vu3Var, rxjVar, 2, value1111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111117 = entry.getKey();
                                Object value1111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111117);
                                kp6.b(vu3Var, rxjVar, 2, value1111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111118 = entry.getKey();
                                Object value1111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111118);
                                kp6.b(vu3Var, rxjVar, 2, value1111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111119 = entry.getKey();
                                Object value1111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111119);
                                kp6.b(vu3Var, rxjVar, 2, value1111111119);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111110 = entry.getKey();
                                Object value11111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111110);
                                kp6.b(vu3Var, rxjVar, 2, value11111111110);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111 = entry.getKey();
                                Object value11111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111112 = entry.getKey();
                                Object value11111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111112);
                                kp6.b(vu3Var, rxjVar, 2, value11111111112);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111113 = entry.getKey();
                                Object value11111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111113);
                                kp6.b(vu3Var, rxjVar, 2, value11111111113);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111114 = entry.getKey();
                                Object value11111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111114);
                                kp6.b(vu3Var, rxjVar, 2, value11111111114);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111115 = entry.getKey();
                                Object value11111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111115);
                                kp6.b(vu3Var, rxjVar, 2, value11111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111116 = entry.getKey();
                                Object value11111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111116);
                                kp6.b(vu3Var, rxjVar, 2, value11111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111117 = entry.getKey();
                                Object value11111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111117);
                                kp6.b(vu3Var, rxjVar, 2, value11111111117);
                                break;
                            case 16:
                                int iIntValue6 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111118 = entry.getKey();
                                Object value11111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111118);
                                kp6.b(vu3Var, rxjVar, 2, value11111111118);
                                break;
                            case 17:
                                long jLongValue6 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111119 = entry.getKey();
                                Object value11111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111119);
                                kp6.b(vu3Var, rxjVar, 2, value11111111119);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 6:
                        ((Integer) key).getClass();
                        iO = 4;
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111110 = entry.getKey();
                                Object value111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111 = entry.getKey();
                                Object value111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111112 = entry.getKey();
                                Object value111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value111111111112);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111113 = entry.getKey();
                                Object value111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value111111111113);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111114 = entry.getKey();
                                Object value111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111115 = entry.getKey();
                                Object value111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111116 = entry.getKey();
                                Object value111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111117 = entry.getKey();
                                Object value111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value111111111117);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111118 = entry.getKey();
                                Object value111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value111111111118);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111119 = entry.getKey();
                                Object value111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value111111111119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111110 = entry.getKey();
                                Object value1111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111110);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111 = entry.getKey();
                                Object value1111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111112 = entry.getKey();
                                Object value1111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111112);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111113 = entry.getKey();
                                Object value1111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111114 = entry.getKey();
                                Object value1111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111115 = entry.getKey();
                                Object value1111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111115);
                                break;
                            case 16:
                                int iIntValue7 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111116 = entry.getKey();
                                Object value1111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111116);
                                break;
                            case 17:
                                long jLongValue7 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111117 = entry.getKey();
                                Object value1111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111117);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 7:
                        ((Boolean) key).getClass();
                        iO = 1;
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111118 = entry.getKey();
                                Object value1111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111119 = entry.getKey();
                                Object value1111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111119);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111110 = entry.getKey();
                                Object value11111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111110);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111 = entry.getKey();
                                Object value11111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111112 = entry.getKey();
                                Object value11111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111113 = entry.getKey();
                                Object value11111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111114 = entry.getKey();
                                Object value11111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111115 = entry.getKey();
                                Object value11111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111115);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111116 = entry.getKey();
                                Object value11111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111116);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111117 = entry.getKey();
                                Object value11111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111118 = entry.getKey();
                                Object value11111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111118);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111119 = entry.getKey();
                                Object value11111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111119);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111110 = entry.getKey();
                                Object value111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111110);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111 = entry.getKey();
                                Object value111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111112 = entry.getKey();
                                Object value111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111113 = entry.getKey();
                                Object value111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111113);
                                break;
                            case 16:
                                int iIntValue8 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111114 = entry.getKey();
                                Object value111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111114);
                                break;
                            case 17:
                                long jLongValue8 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111115 = entry.getKey();
                                Object value111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111115);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 8:
                        if (key instanceof c71) {
                            size = ((c71) key).size();
                            iN = vu3.n(size);
                            iO = size + iN;
                        } else {
                            iO = vu3.l((String) key);
                        }
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111116 = entry.getKey();
                                Object value111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111117 = entry.getKey();
                                Object value111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111117);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111118 = entry.getKey();
                                Object value111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111118);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111119 = entry.getKey();
                                Object value111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111119);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111110 = entry.getKey();
                                Object value1111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111 = entry.getKey();
                                Object value1111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111112 = entry.getKey();
                                Object value1111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111113 = entry.getKey();
                                Object value1111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111113);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111114 = entry.getKey();
                                Object value1111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111114);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111115 = entry.getKey();
                                Object value1111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111115);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111116 = entry.getKey();
                                Object value1111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111116);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111117 = entry.getKey();
                                Object value1111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111117);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111118 = entry.getKey();
                                Object value1111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111118);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111119 = entry.getKey();
                                Object value1111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111110 = entry.getKey();
                                Object value11111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111 = entry.getKey();
                                Object value11111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111);
                                break;
                            case 16:
                                int iIntValue9 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111112 = entry.getKey();
                                Object value11111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111112);
                                break;
                            case 17:
                                long jLongValue9 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111113 = entry.getKey();
                                Object value11111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111113);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 9:
                        iO = ((a) key).a();
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111114 = entry.getKey();
                                Object value11111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111115 = entry.getKey();
                                Object value11111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111115);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111116 = entry.getKey();
                                Object value11111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111116);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111117 = entry.getKey();
                                Object value11111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111117);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111118 = entry.getKey();
                                Object value11111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111119 = entry.getKey();
                                Object value11111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111110 = entry.getKey();
                                Object value111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111 = entry.getKey();
                                Object value111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111112 = entry.getKey();
                                Object value111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111112);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111113 = entry.getKey();
                                Object value111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111113);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111114 = entry.getKey();
                                Object value111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111114);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111115 = entry.getKey();
                                Object value111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111115);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111116 = entry.getKey();
                                Object value111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111116);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111117 = entry.getKey();
                                Object value111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111118 = entry.getKey();
                                Object value111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111119 = entry.getKey();
                                Object value111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111119);
                                break;
                            case 16:
                                int iIntValue10 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111110 = entry.getKey();
                                Object value1111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111110);
                                break;
                            case 17:
                                long jLongValue10 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111 = entry.getKey();
                                Object value1111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 10:
                        size = ((a) key).a();
                        iN = vu3.n(size);
                        iO = size + iN;
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111112 = entry.getKey();
                                Object value1111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111113 = entry.getKey();
                                Object value1111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111113);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111114 = entry.getKey();
                                Object value1111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111114);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111115 = entry.getKey();
                                Object value1111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111115);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111116 = entry.getKey();
                                Object value1111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111117 = entry.getKey();
                                Object value1111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111118 = entry.getKey();
                                Object value1111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111119 = entry.getKey();
                                Object value1111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111119);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111110 = entry.getKey();
                                Object value11111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111110);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111 = entry.getKey();
                                Object value11111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111112 = entry.getKey();
                                Object value11111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111112);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111113 = entry.getKey();
                                Object value11111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111113);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111114 = entry.getKey();
                                Object value11111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111114);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111115 = entry.getKey();
                                Object value11111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111116 = entry.getKey();
                                Object value11111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111117 = entry.getKey();
                                Object value11111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111117);
                                break;
                            case 16:
                                int iIntValue11 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111118 = entry.getKey();
                                Object value11111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111118);
                                break;
                            case 17:
                                long jLongValue11 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111119 = entry.getKey();
                                Object value11111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111119);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 11:
                        if (key instanceof c71) {
                            size = ((c71) key).size();
                            iN = vu3.n(size);
                        } else {
                            size = ((byte[]) key).length;
                            iN = vu3.n(size);
                        }
                        iO = size + iN;
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111110 = entry.getKey();
                                Object value111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111 = entry.getKey();
                                Object value111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111112 = entry.getKey();
                                Object value111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111112);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111113 = entry.getKey();
                                Object value111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111113);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111114 = entry.getKey();
                                Object value111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111115 = entry.getKey();
                                Object value111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111116 = entry.getKey();
                                Object value111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111117 = entry.getKey();
                                Object value111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111118 = entry.getKey();
                                Object value111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111118);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111119 = entry.getKey();
                                Object value111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111110 = entry.getKey();
                                Object value1111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111112 = entry.getKey();
                                Object value1111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111112);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111113 = entry.getKey();
                                Object value1111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111114 = entry.getKey();
                                Object value1111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111115 = entry.getKey();
                                Object value1111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111115);
                                break;
                            case 16:
                                int iIntValue12 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111116 = entry.getKey();
                                Object value1111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111116);
                                break;
                            case 17:
                                long jLongValue12 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111117 = entry.getKey();
                                Object value1111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111117);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 12:
                        iO = vu3.n(((Integer) key).intValue());
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111118 = entry.getKey();
                                Object value1111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111119 = entry.getKey();
                                Object value1111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111119);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111110 = entry.getKey();
                                Object value11111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111110);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111112 = entry.getKey();
                                Object value11111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111113 = entry.getKey();
                                Object value11111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111114 = entry.getKey();
                                Object value11111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111115 = entry.getKey();
                                Object value11111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111116 = entry.getKey();
                                Object value11111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111116);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111117 = entry.getKey();
                                Object value11111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111118 = entry.getKey();
                                Object value11111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111119 = entry.getKey();
                                Object value11111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111119);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111110);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue13 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue13 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111115);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 13:
                        iO = vu3.k(((Integer) key).intValue());
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111116);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111117);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111118);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111119);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111110);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111112);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111113);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111114);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111115);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111116);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111117);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111118);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111119);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111110);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111);
                                break;
                            case 16:
                                int iIntValue14 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111112);
                                break;
                            case 17:
                                long jLongValue14 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111113);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 14:
                        ((Integer) key).getClass();
                        iO = 4;
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111114);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111115);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111116);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111117);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111118);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111119);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111110);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111112);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111113);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111114);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111115);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111116);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111117);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111118);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111119);
                                break;
                            case 16:
                                int iIntValue15 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111110);
                                break;
                            case 17:
                                long jLongValue15 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 15:
                        ((Long) key).getClass();
                        iO = 8;
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111112);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111113);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111114);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111115);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111116);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111117);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111118);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111119);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111110);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111112);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111113);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111114);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111115);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111116);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111117);
                                break;
                            case 16:
                                int iIntValue16 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111118);
                                break;
                            case 17:
                                long jLongValue16 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111119);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 16:
                        int iIntValue17 = ((Integer) key).intValue();
                        iO = vu3.n((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111110);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111111);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111112);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111113);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111114);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111115);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111116 = entry.getKey();
                                Object value111111111111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111116);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111117 = entry.getKey();
                                Object value111111111111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111117);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111118 = entry.getKey();
                                Object value111111111111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111118);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111119 = entry.getKey();
                                Object value111111111111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111119);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111110 = entry.getKey();
                                Object value1111111111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111110);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111111 = entry.getKey();
                                Object value1111111111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111111);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111112 = entry.getKey();
                                Object value1111111111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111112);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111113 = entry.getKey();
                                Object value1111111111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111113);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111114 = entry.getKey();
                                Object value1111111111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111114);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111115 = entry.getKey();
                                Object value1111111111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111115);
                                break;
                            case 16:
                                int iIntValue18 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111116 = entry.getKey();
                                Object value1111111111111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111116);
                                break;
                            case 17:
                                long jLongValue17 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111117 = entry.getKey();
                                Object value1111111111111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111117);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    case 17:
                        long jLongValue18 = ((Long) key).longValue();
                        iO = vu3.o((jLongValue18 << 1) ^ (jLongValue18 >> 63));
                        i3 = iO + iM2;
                        iM = vu3.m(2);
                        if (rxjVar == oxjVar) {
                            iM *= 2;
                        }
                        switch (rxjVar.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111118 = entry.getKey();
                                Object value1111111111111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111118);
                                break;
                            case 1:
                                ((Float) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key1111111111111111111111111111119 = entry.getKey();
                                Object value1111111111111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key1111111111111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value1111111111111111111111111111119);
                                break;
                            case 2:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111110 = entry.getKey();
                                Object value11111111111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111110);
                                break;
                            case 3:
                                iO2 = vu3.o(((Long) value).longValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111111 = entry.getKey();
                                Object value11111111111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111111);
                                break;
                            case 4:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111112 = entry.getKey();
                                Object value11111111111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111112);
                                break;
                            case 5:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111113 = entry.getKey();
                                Object value11111111111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111113);
                                break;
                            case 6:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111114 = entry.getKey();
                                Object value11111111111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111114);
                                break;
                            case 7:
                                ((Boolean) value).getClass();
                                iO2 = 1;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111115 = entry.getKey();
                                Object value11111111111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111115);
                                break;
                            case 8:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                    iO2 = iN2 + size2;
                                } else {
                                    iO2 = vu3.l((String) value);
                                }
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111116 = entry.getKey();
                                Object value11111111111111111111111111111116 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111116);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111116);
                                break;
                            case 9:
                                iO2 = ((a) value).a();
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111117 = entry.getKey();
                                Object value11111111111111111111111111111117 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111117);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111117);
                                break;
                            case 10:
                                size2 = ((a) value).a();
                                iN2 = vu3.n(size2);
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111118 = entry.getKey();
                                Object value11111111111111111111111111111118 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111118);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111118);
                                break;
                            case 11:
                                if (value instanceof c71) {
                                    size2 = ((c71) value).size();
                                    iN2 = vu3.n(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    iN2 = vu3.n(size2);
                                }
                                iO2 = iN2 + size2;
                                vu3Var.I(iO2 + iM + i3);
                                Object key11111111111111111111111111111119 = entry.getKey();
                                Object value11111111111111111111111111111119 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key11111111111111111111111111111119);
                                kp6.b(vu3Var, rxjVar, 2, value11111111111111111111111111111119);
                                break;
                            case 12:
                                iO2 = vu3.n(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111111110 = entry.getKey();
                                Object value111111111111111111111111111111110 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111111110);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111111110);
                                break;
                            case 13:
                                iO2 = vu3.k(((Integer) value).intValue());
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111111111 = entry.getKey();
                                Object value111111111111111111111111111111111 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111111111);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111111111);
                                break;
                            case 14:
                                ((Integer) value).getClass();
                                iO2 = 4;
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111111112 = entry.getKey();
                                Object value111111111111111111111111111111112 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111111112);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111111112);
                                break;
                            case 15:
                                ((Long) value).getClass();
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111111113 = entry.getKey();
                                Object value111111111111111111111111111111113 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111111113);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111111113);
                                break;
                            case 16:
                                int iIntValue19 = ((Integer) value).intValue();
                                iO2 = vu3.n((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111111114 = entry.getKey();
                                Object value111111111111111111111111111111114 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111111114);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111111114);
                                break;
                            case 17:
                                long jLongValue19 = ((Long) value).longValue();
                                iO2 = vu3.o((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                                vu3Var.I(iO2 + iM + i3);
                                Object key111111111111111111111111111111115 = entry.getKey();
                                Object value111111111111111111111111111111115 = entry.getValue();
                                kp6.b(vu3Var, rxjVar2, 1, key111111111111111111111111111111115);
                                kp6.b(vu3Var, rxjVar, 2, value111111111111111111111111111111115);
                                break;
                            default:
                                ore.q("There is no way to get here, but the compiler thinks otherwise.");
                                break;
                        }
                        break;
                    default:
                        ore.q("There is no way to get here, but the compiler thinks otherwise.");
                        break;
                }
                return;
            }
        }
    }

    @Override // defpackage.l3f
    public final void a(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long jG = G(iArr[i2]) & 1048575;
            Object objI = ldi.d.i(jG, obj);
            if (objI != null) {
                this.n.getClass();
                ((fm9) objI).a = false;
                ldi.o(jG, obj, objI);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(iArr[i], obj);
            i++;
        }
        ((mci) this.m).getClass();
        ((d) obj).unknownFields.e = false;
    }

    @Override // defpackage.l3f
    public final int b(a aVar) {
        return this.g ? p(aVar) : o(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:67:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x010e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:83:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0125 A[SYNTHETIC] */
    @Override // defpackage.l3f
    public final boolean c(Object obj) {
        int i;
        int iF;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean zQ = true;
            if (i3 >= this.i) {
                return true;
            }
            int i5 = this.h[i3];
            int[] iArr = this.a;
            int i6 = iArr[i5];
            int iG = G(i5);
            boolean z = this.g;
            if (z) {
                i = 0;
            } else {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = p.getInt(obj, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & iG) == 0) {
                iF = F(iG);
                if (iF != 9 || iF == 17) {
                    if (z) {
                        zQ = q(i5, obj);
                    } else if ((i & i4) == 0) {
                        zQ = false;
                    }
                    if (zQ) {
                        continue;
                    } else if (!n(i5).c(ldi.d.i(iG & 1048575, obj))) {
                    }
                    i3++;
                } else {
                    if (iF != 27) {
                        if (iF == 60 || iF == 68) {
                            if (!r(i6, i5, obj)) {
                                continue;
                            } else if (!n(i5).c(ldi.d.i(iG & 1048575, obj))) {
                            }
                            i3++;
                        } else if (iF != 49) {
                            if (iF != 50) {
                                continue;
                            } else {
                                Object objI = ldi.d.i(iG & 1048575, obj);
                                this.n.getClass();
                                fm9 fm9Var = (fm9) objI;
                                if (!fm9Var.isEmpty() && ((rxj) ((bm9) m(i5)).a.c).a == sxj.i) {
                                    l3f l3fVarA = null;
                                    for (Object obj2 : fm9Var.values()) {
                                        if (l3fVarA == null) {
                                            l3fVarA = pwd.c.a(obj2.getClass());
                                        }
                                        if (!l3fVarA.c(obj2)) {
                                        }
                                    }
                                }
                            }
                            i3++;
                        }
                    }
                    List list = (List) ldi.d.i(iG & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        l3f l3fVarN = n(i5);
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            if (l3fVarN.c(list.get(i9))) {
                            }
                        }
                    }
                    i3++;
                }
            } else {
                if (z ? q(i5, obj) : (i4 & i) != 0) {
                    iF = F(iG);
                    if (iF != 9) {
                    }
                    if (z) {
                        zQ = q(i5, obj);
                    } else if ((i & i4) == 0) {
                        zQ = false;
                    }
                    if (zQ) {
                        continue;
                    } else if (!n(i5).c(ldi.d.i(iG & 1048575, obj))) {
                    }
                    i3++;
                }
            }
            return false;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18501. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.l3f
    public final void d(java.lang.Object r19, defpackage.o8e r20, defpackage.xh6 r21) {
        /*
            Method dump skipped, instruction units count: 1850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.f.d(java.lang.Object, o8e, xh6):void");
    }

    @Override // defpackage.l3f
    public final Object e() {
        this.k.getClass();
        return ((d) this.e).d(4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    @Override // defpackage.l3f
    public final void f(d dVar, d dVar2) {
        d dVar3;
        dVar2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                d dVar4 = dVar;
                if (this.g) {
                    return;
                }
                h.w(this.m, dVar4, dVar2);
                return;
            }
            int iG = G(i);
            long j = 1048575 & iG;
            int i2 = iArr[i];
            switch (F(iG)) {
                case 0:
                    if (!q(i, dVar2)) {
                        dVar3 = dVar;
                    } else {
                        kdi kdiVar = ldi.d;
                        dVar3 = dVar;
                        kdiVar.m(dVar3, j, kdiVar.e(j, dVar2));
                        D(i, dVar3);
                    }
                    break;
                case 1:
                    if (q(i, dVar2)) {
                        kdi kdiVar2 = ldi.d;
                        kdiVar2.n(dVar, j, kdiVar2.f(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 2:
                    if (q(i, dVar2)) {
                        ldi.n(dVar, j, ldi.d.h(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 3:
                    if (q(i, dVar2)) {
                        ldi.n(dVar, j, ldi.d.h(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 4:
                    if (q(i, dVar2)) {
                        ldi.m(j, dVar, ldi.d.g(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 5:
                    if (q(i, dVar2)) {
                        ldi.n(dVar, j, ldi.d.h(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 6:
                    if (q(i, dVar2)) {
                        ldi.m(j, dVar, ldi.d.g(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 7:
                    if (q(i, dVar2)) {
                        kdi kdiVar3 = ldi.d;
                        kdiVar3.k(dVar, j, kdiVar3.c(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 8:
                    if (q(i, dVar2)) {
                        ldi.o(j, dVar, ldi.d.i(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 9:
                    u(dVar, i, dVar2);
                    dVar3 = dVar;
                    break;
                case 10:
                    if (q(i, dVar2)) {
                        ldi.o(j, dVar, ldi.d.i(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 11:
                    if (q(i, dVar2)) {
                        ldi.m(j, dVar, ldi.d.g(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 12:
                    if (q(i, dVar2)) {
                        ldi.m(j, dVar, ldi.d.g(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 13:
                    if (q(i, dVar2)) {
                        ldi.m(j, dVar, ldi.d.g(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 14:
                    if (q(i, dVar2)) {
                        ldi.n(dVar, j, ldi.d.h(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 15:
                    if (q(i, dVar2)) {
                        ldi.m(j, dVar, ldi.d.g(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 16:
                    if (q(i, dVar2)) {
                        ldi.n(dVar, j, ldi.d.h(j, dVar2));
                        D(i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 17:
                    u(dVar, i, dVar2);
                    dVar3 = dVar;
                    break;
                case 18:
                case 19:
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case vg8.l /* 35 */:
                case 36:
                case LangUtils.HASH_OFFSET /* 37 */:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.l.b(j, dVar, dVar2);
                    dVar3 = dVar;
                    break;
                case 50:
                    Class cls = h.a;
                    kdi kdiVar4 = ldi.d;
                    Object objI = kdiVar4.i(j, dVar);
                    Object objI2 = kdiVar4.i(j, dVar2);
                    this.n.getClass();
                    ldi.o(j, dVar, gm9.b(objI, objI2));
                    dVar3 = dVar;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (r(i2, i, dVar2)) {
                        ldi.o(j, dVar, ldi.d.i(j, dVar2));
                        E(i2, i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 60:
                    v(dVar, i, dVar2);
                    dVar3 = dVar;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i2, i, dVar2)) {
                        ldi.o(j, dVar, ldi.d.i(j, dVar2));
                        E(i2, i, dVar);
                    }
                    dVar3 = dVar;
                    break;
                case 68:
                    v(dVar, i, dVar2);
                    dVar3 = dVar;
                    break;
                default:
                    dVar3 = dVar;
                    break;
            }
            i += 3;
            dVar = dVar3;
        }
    }

    @Override // defpackage.l3f
    public final void g(Object obj, b1k b1kVar) throws IOException {
        b1kVar.getClass();
        vu3 vu3Var = (vu3) b1kVar.b;
        if (!this.g) {
            H(obj, b1kVar);
            return;
        }
        int[] iArr = this.a;
        int length = iArr.length;
        for (int i = 0; i < length; i += 3) {
            int iG = G(i);
            int i2 = iArr[i];
            switch (F(iG)) {
                case 0:
                    if (q(i, obj)) {
                        double dE = ldi.d.e(iG & 1048575, obj);
                        vu3Var.getClass();
                        vu3Var.y(i2, Double.doubleToRawLongBits(dE));
                    }
                    break;
                case 1:
                    if (q(i, obj)) {
                        float f = ldi.d.f(iG & 1048575, obj);
                        vu3Var.getClass();
                        vu3Var.w(i2, Float.floatToRawIntBits(f));
                    }
                    break;
                case 2:
                    if (q(i, obj)) {
                        vu3Var.J(i2, ldi.d.h(iG & 1048575, obj));
                    }
                    break;
                case 3:
                    if (q(i, obj)) {
                        vu3Var.J(i2, ldi.d.h(iG & 1048575, obj));
                    }
                    break;
                case 4:
                    if (q(i, obj)) {
                        vu3Var.A(i2, ldi.d.g(iG & 1048575, obj));
                    }
                    break;
                case 5:
                    if (q(i, obj)) {
                        vu3Var.y(i2, ldi.d.h(iG & 1048575, obj));
                    }
                    break;
                case 6:
                    if (q(i, obj)) {
                        vu3Var.w(i2, ldi.d.g(iG & 1048575, obj));
                    }
                    break;
                case 7:
                    if (q(i, obj)) {
                        vu3Var.t(i2, ldi.d.c(iG & 1048575, obj));
                    }
                    break;
                case 8:
                    if (q(i, obj)) {
                        J(i2, ldi.d.i(iG & 1048575, obj), b1kVar);
                    }
                    break;
                case 9:
                    if (q(i, obj)) {
                        vu3Var.D(i2, (a) ldi.d.i(iG & 1048575, obj), n(i));
                    }
                    break;
                case 10:
                    if (q(i, obj)) {
                        b1kVar.H(i2, (c71) ldi.d.i(iG & 1048575, obj));
                    }
                    break;
                case 11:
                    if (q(i, obj)) {
                        vu3Var.H(i2, ldi.d.g(iG & 1048575, obj));
                    }
                    break;
                case 12:
                    if (q(i, obj)) {
                        vu3Var.A(i2, ldi.d.g(iG & 1048575, obj));
                    }
                    break;
                case 13:
                    if (q(i, obj)) {
                        vu3Var.w(i2, ldi.d.g(iG & 1048575, obj));
                    }
                    break;
                case 14:
                    if (q(i, obj)) {
                        vu3Var.y(i2, ldi.d.h(iG & 1048575, obj));
                    }
                    break;
                case 15:
                    if (q(i, obj)) {
                        int iG2 = ldi.d.g(iG & 1048575, obj);
                        vu3Var.H(i2, (iG2 >> 31) ^ (iG2 << 1));
                    }
                    break;
                case 16:
                    if (q(i, obj)) {
                        long jH = ldi.d.h(iG & 1048575, obj);
                        vu3Var.J(i2, (jH >> 63) ^ (jH << 1));
                    }
                    break;
                case 17:
                    if (q(i, obj)) {
                        b1kVar.I(i2, ldi.d.i(iG & 1048575, obj), n(i));
                    }
                    break;
                case 18:
                    h.A(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 19:
                    h.E(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    h.H(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 21:
                    h.P(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 22:
                    h.G(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 23:
                    h.D(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 24:
                    h.C(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 25:
                    h.y(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 26:
                    h.N(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar);
                    break;
                case 27:
                    h.I(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, n(i));
                    break;
                case 28:
                    h.z(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar);
                    break;
                case 29:
                    h.O(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 30:
                    h.B(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 31:
                    h.J(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 32:
                    h.K(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 33:
                    h.L(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case 34:
                    h.M(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, false);
                    break;
                case vg8.l /* 35 */:
                    h.A(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 36:
                    h.E(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    h.H(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 38:
                    h.P(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 39:
                    h.G(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 40:
                    h.D(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 41:
                    h.C(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 42:
                    h.y(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 43:
                    h.O(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 44:
                    h.B(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 45:
                    h.J(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 46:
                    h.K(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 47:
                    h.L(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 48:
                    h.M(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, true);
                    break;
                case 49:
                    h.F(iArr[i], (List) ldi.d.i(iG & 1048575, obj), b1kVar, n(i));
                    break;
                case 50:
                    I(b1kVar, i2, ldi.d.i(iG & 1048575, obj), i);
                    break;
                case 51:
                    if (r(i2, i, obj)) {
                        double dDoubleValue = ((Double) ldi.d.i(iG & 1048575, obj)).doubleValue();
                        vu3Var.getClass();
                        vu3Var.y(i2, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (r(i2, i, obj)) {
                        float fFloatValue = ((Float) ldi.d.i(iG & 1048575, obj)).floatValue();
                        vu3Var.getClass();
                        vu3Var.w(i2, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (r(i2, i, obj)) {
                        vu3Var.J(i2, A(iG & 1048575, obj));
                    }
                    break;
                case 54:
                    if (r(i2, i, obj)) {
                        vu3Var.J(i2, A(iG & 1048575, obj));
                    }
                    break;
                case 55:
                    if (r(i2, i, obj)) {
                        vu3Var.A(i2, z(iG & 1048575, obj));
                    }
                    break;
                case 56:
                    if (r(i2, i, obj)) {
                        vu3Var.y(i2, A(iG & 1048575, obj));
                    }
                    break;
                case 57:
                    if (r(i2, i, obj)) {
                        vu3Var.w(i2, z(iG & 1048575, obj));
                    }
                    break;
                case 58:
                    if (r(i2, i, obj)) {
                        vu3Var.t(i2, ((Boolean) ldi.d.i(iG & 1048575, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i2, i, obj)) {
                        J(i2, ldi.d.i(iG & 1048575, obj), b1kVar);
                    }
                    break;
                case 60:
                    if (r(i2, i, obj)) {
                        vu3Var.D(i2, (a) ldi.d.i(iG & 1048575, obj), n(i));
                    }
                    break;
                case 61:
                    if (r(i2, i, obj)) {
                        b1kVar.H(i2, (c71) ldi.d.i(iG & 1048575, obj));
                    }
                    break;
                case 62:
                    if (r(i2, i, obj)) {
                        vu3Var.H(i2, z(iG & 1048575, obj));
                    }
                    break;
                case 63:
                    if (r(i2, i, obj)) {
                        vu3Var.A(i2, z(iG & 1048575, obj));
                    }
                    break;
                case 64:
                    if (r(i2, i, obj)) {
                        vu3Var.w(i2, z(iG & 1048575, obj));
                    }
                    break;
                case 65:
                    if (r(i2, i, obj)) {
                        vu3Var.y(i2, A(iG & 1048575, obj));
                    }
                    break;
                case 66:
                    if (r(i2, i, obj)) {
                        int iZ = z(iG & 1048575, obj);
                        vu3Var.H(i2, (iZ >> 31) ^ (iZ << 1));
                    }
                    break;
                case 67:
                    if (r(i2, i, obj)) {
                        long jA = A(iG & 1048575, obj);
                        vu3Var.J(i2, (jA >> 63) ^ (jA << 1));
                    }
                    break;
                case 68:
                    if (r(i2, i, obj)) {
                        b1kVar.I(i2, ldi.d.i(iG & 1048575, obj), n(i));
                    }
                    break;
            }
        }
        ((mci) this.m).getClass();
        ((d) obj).unknownFields.d(b1kVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.l3f
    public final int h(d dVar) {
        int i;
        int iB;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iG = G(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iG;
            int i6 = 1237;
            int iHashCode = 37;
            switch (F(iG)) {
                case 0:
                    i = i3 * 53;
                    iB = wj8.b(Double.doubleToLongBits(ldi.d.e(j, dVar)));
                    i3 = iB + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iB = Float.floatToIntBits(ldi.d.f(j, dVar));
                    i3 = iB + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iB = wj8.b(ldi.d.h(j, dVar));
                    i3 = iB + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iB = wj8.b(ldi.d.h(j, dVar));
                    i3 = iB + i;
                    break;
                case 4:
                    i = i3 * 53;
                    iB = ldi.d.g(j, dVar);
                    i3 = iB + i;
                    break;
                case 5:
                    i = i3 * 53;
                    iB = wj8.b(ldi.d.h(j, dVar));
                    i3 = iB + i;
                    break;
                case 6:
                    i = i3 * 53;
                    iB = ldi.d.g(j, dVar);
                    i3 = iB + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean zC = ldi.d.c(j, dVar);
                    Charset charset = wj8.a;
                    if (zC) {
                        i6 = 1231;
                    }
                    i3 = i6 + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    iB = ((String) ldi.d.i(j, dVar)).hashCode();
                    i3 = iB + i;
                    break;
                case 9:
                    Object objI = ldi.d.i(j, dVar);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iB = ldi.d.i(j, dVar).hashCode();
                    i3 = iB + i;
                    break;
                case 11:
                    i = i3 * 53;
                    iB = ldi.d.g(j, dVar);
                    i3 = iB + i;
                    break;
                case 12:
                    i = i3 * 53;
                    iB = ldi.d.g(j, dVar);
                    i3 = iB + i;
                    break;
                case 13:
                    i = i3 * 53;
                    iB = ldi.d.g(j, dVar);
                    i3 = iB + i;
                    break;
                case 14:
                    i = i3 * 53;
                    iB = wj8.b(ldi.d.h(j, dVar));
                    i3 = iB + i;
                    break;
                case 15:
                    i = i3 * 53;
                    iB = ldi.d.g(j, dVar);
                    i3 = iB + i;
                    break;
                case 16:
                    i = i3 * 53;
                    iB = wj8.b(ldi.d.h(j, dVar));
                    i3 = iB + i;
                    break;
                case 17:
                    Object objI2 = ldi.d.i(j, dVar);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case vg8.l /* 35 */:
                case 36:
                case LangUtils.HASH_OFFSET /* 37 */:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iB = ldi.d.i(j, dVar).hashCode();
                    i3 = iB + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iB = ldi.d.i(j, dVar).hashCode();
                    i3 = iB + i;
                    break;
                case 51:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = wj8.b(Double.doubleToLongBits(((Double) ldi.d.i(j, dVar)).doubleValue()));
                        i3 = iB + i;
                    }
                    break;
                case 52:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = Float.floatToIntBits(((Float) ldi.d.i(j, dVar)).floatValue());
                        i3 = iB + i;
                    }
                    break;
                case 53:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = wj8.b(A(j, dVar));
                        i3 = iB + i;
                    }
                    break;
                case 54:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = wj8.b(A(j, dVar));
                        i3 = iB + i;
                    }
                    break;
                case 55:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = z(j, dVar);
                        i3 = iB + i;
                    }
                    break;
                case 56:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = wj8.b(A(j, dVar));
                        i3 = iB + i;
                    }
                    break;
                case 57:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = z(j, dVar);
                        i3 = iB + i;
                    }
                    break;
                case 58:
                    if (r(i5, i4, dVar)) {
                        i2 = i3 * 53;
                        boolean zBooleanValue = ((Boolean) ldi.d.i(j, dVar)).booleanValue();
                        Charset charset2 = wj8.a;
                        if (zBooleanValue) {
                            i6 = 1231;
                        }
                        i3 = i6 + i2;
                    }
                    break;
                case 59:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = ((String) ldi.d.i(j, dVar)).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 60:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = ldi.d.i(j, dVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 61:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = ldi.d.i(j, dVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
                case 62:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = z(j, dVar);
                        i3 = iB + i;
                    }
                    break;
                case 63:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = z(j, dVar);
                        i3 = iB + i;
                    }
                    break;
                case 64:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = z(j, dVar);
                        i3 = iB + i;
                    }
                    break;
                case 65:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = wj8.b(A(j, dVar));
                        i3 = iB + i;
                    }
                    break;
                case 66:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = z(j, dVar);
                        i3 = iB + i;
                    }
                    break;
                case 67:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = wj8.b(A(j, dVar));
                        i3 = iB + i;
                    }
                    break;
                case 68:
                    if (r(i5, i4, dVar)) {
                        i = i3 * 53;
                        iB = ldi.d.i(j, dVar).hashCode();
                        i3 = iB + i;
                    }
                    break;
            }
        }
        ((mci) this.m).getClass();
        return dVar.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // defpackage.l3f
    public final boolean i(d dVar, d dVar2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zX = true;
            if (i < length) {
                int iG = G(i);
                long j = iG & 1048575;
                switch (F(iG)) {
                    case 0:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar = ldi.d;
                            if (Double.doubleToLongBits(kdiVar.e(j, dVar)) != Double.doubleToLongBits(kdiVar.e(j, dVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar2 = ldi.d;
                            if (Float.floatToIntBits(kdiVar2.f(j, dVar)) != Float.floatToIntBits(kdiVar2.f(j, dVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar3 = ldi.d;
                            if (kdiVar3.h(j, dVar) != kdiVar3.h(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar4 = ldi.d;
                            if (kdiVar4.h(j, dVar) != kdiVar4.h(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar5 = ldi.d;
                            if (kdiVar5.g(j, dVar) != kdiVar5.g(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar6 = ldi.d;
                            if (kdiVar6.h(j, dVar) != kdiVar6.h(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar7 = ldi.d;
                            if (kdiVar7.g(j, dVar) != kdiVar7.g(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar8 = ldi.d;
                            if (kdiVar8.c(j, dVar) != kdiVar8.c(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar9 = ldi.d;
                            if (!h.x(kdiVar9.i(j, dVar), kdiVar9.i(j, dVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar10 = ldi.d;
                            if (!h.x(kdiVar10.i(j, dVar), kdiVar10.i(j, dVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar11 = ldi.d;
                            if (!h.x(kdiVar11.i(j, dVar), kdiVar11.i(j, dVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar12 = ldi.d;
                            if (kdiVar12.g(j, dVar) != kdiVar12.g(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar13 = ldi.d;
                            if (kdiVar13.g(j, dVar) != kdiVar13.g(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar14 = ldi.d;
                            if (kdiVar14.g(j, dVar) != kdiVar14.g(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar15 = ldi.d;
                            if (kdiVar15.h(j, dVar) != kdiVar15.h(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar16 = ldi.d;
                            if (kdiVar16.g(j, dVar) != kdiVar16.g(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar17 = ldi.d;
                            if (kdiVar17.h(j, dVar) != kdiVar17.h(j, dVar2)) {
                                zX = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(dVar, dVar2, i)) {
                            zX = false;
                        } else {
                            kdi kdiVar18 = ldi.d;
                            if (!h.x(kdiVar18.i(j, dVar), kdiVar18.i(j, dVar2))) {
                                zX = false;
                            }
                        }
                        break;
                    case 18:
                    case 19:
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case vg8.l /* 35 */:
                    case 36:
                    case LangUtils.HASH_OFFSET /* 37 */:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        kdi kdiVar19 = ldi.d;
                        zX = h.x(kdiVar19.i(j, dVar), kdiVar19.i(j, dVar2));
                        break;
                    case 50:
                        kdi kdiVar20 = ldi.d;
                        zX = h.x(kdiVar20.i(j, dVar), kdiVar20.i(j, dVar2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        kdi kdiVar21 = ldi.d;
                        if (kdiVar21.g(j2, dVar) != kdiVar21.g(j2, dVar2) || !h.x(kdiVar21.i(j, dVar), kdiVar21.i(j, dVar2))) {
                            zX = false;
                        }
                        break;
                }
                if (zX) {
                    i += 3;
                }
            } else {
                mci mciVar = (mci) this.m;
                mciVar.getClass();
                j jVar = dVar.unknownFields;
                mciVar.getClass();
                if (jVar.equals(dVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j(d dVar, Object obj, int i) {
        return q(i, dVar) == q(i, obj);
    }

    public final void k(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        if (ldi.d.i(G(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        ore.m();
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final l3f n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        l3f l3fVar = (l3f) objArr[i2];
        if (l3fVar != null) {
            return l3fVar;
        }
        l3f l3fVarA = pwd.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = l3fVarA;
        return l3fVarA;
    }

    public final int o(Object obj) {
        int i;
        int iM;
        int iO;
        int iM2;
        int iK;
        int i2;
        int iM3;
        int iL;
        int iE;
        int iM4;
        int iJ;
        Unsafe unsafe = p;
        int i3 = -1;
        int i4 = 0;
        int iG = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                ((mci) this.m).getClass();
                return ((d) obj).unknownFields.a() + iG;
            }
            int iG2 = G(i4);
            int i6 = iArr[i4];
            int iF = F(iG2);
            if (iF <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
            } else {
                i = 0;
            }
            long j = iG2 & 1048575;
            switch (iF) {
                case 0:
                    if ((i & i5) != 0) {
                        iG = r5a.g(i6, 8, iG);
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        iG = r5a.g(i6, 4, iG);
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iM = vu3.m(i6);
                        iO = vu3.o(j2);
                        iM4 = iO + iM;
                        iG += iM4;
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        iM = vu3.m(i6);
                        iO = vu3.o(j3);
                        iM4 = iO + iM;
                        iG += iM4;
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        int i9 = unsafe.getInt(obj, j);
                        iM2 = vu3.m(i6);
                        iK = vu3.k(i9);
                        i2 = iK + iM2;
                        iG += i2;
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        i2 = vu3.i(i6);
                        iG += i2;
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        i2 = vu3.h(i6);
                        iG += i2;
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        iG = r5a.g(i6, 1, iG);
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof c71) {
                            int iM5 = vu3.m(i6);
                            int size = ((c71) object).size();
                            iE = mw7.e(size, size, iM5, iG);
                        } else {
                            iM3 = vu3.m(i6);
                            iL = vu3.l((String) object);
                            iE = iL + iM3 + iG;
                        }
                        iG = iE;
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        Object object2 = unsafe.getObject(obj, j);
                        l3f l3fVarN = n(i4);
                        Class cls = h.a;
                        int iM6 = vu3.m(i6);
                        int iB = ((a) object2).b(l3fVarN);
                        iG = mw7.e(iB, iB, iM6, iG);
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        i2 = vu3.f(i6, (c71) unsafe.getObject(obj, j));
                        iG += i2;
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        int i10 = unsafe.getInt(obj, j);
                        iM2 = vu3.m(i6);
                        iK = vu3.n(i10);
                        i2 = iK + iM2;
                        iG += i2;
                    }
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        iM2 = vu3.m(i6);
                        iK = vu3.k(i11);
                        i2 = iK + iM2;
                        iG += i2;
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        iG = r5a.g(i6, 4, iG);
                    }
                    break;
                case 14:
                    if ((i & i5) != 0) {
                        iG = r5a.g(i6, 8, iG);
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iM2 = vu3.m(i6);
                        iK = vu3.n((i12 >> 31) ^ (i12 << 1));
                        i2 = iK + iM2;
                        iG += i2;
                    }
                    break;
                case 16:
                    if ((i5 & i) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        iM = vu3.m(i6);
                        iO = vu3.o((j4 >> 63) ^ (j4 << 1));
                        iM4 = iO + iM;
                        iG += iM4;
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        i2 = vu3.j(i6, (a) unsafe.getObject(obj, j), n(i4));
                        iG += i2;
                    }
                    break;
                case 18:
                    i2 = h.f(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 19:
                    i2 = h.d(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    i2 = h.j(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 21:
                    i2 = h.t(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 22:
                    i2 = h.h(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 23:
                    i2 = h.f(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 24:
                    i2 = h.d(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls2 = h.a;
                    int size2 = list.size();
                    iM4 = size2 == 0 ? 0 : (vu3.m(i6) + 1) * size2;
                    iG += iM4;
                    break;
                case 26:
                    i2 = h.q(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 27:
                    i2 = h.l(i6, (List) unsafe.getObject(obj, j), n(i4));
                    iG += i2;
                    break;
                case 28:
                    i2 = h.a(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 29:
                    i2 = h.r(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 30:
                    i2 = h.b(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 31:
                    i2 = h.d(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 32:
                    i2 = h.f(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 33:
                    i2 = h.m(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case 34:
                    i2 = h.o(i6, (List) unsafe.getObject(obj, j));
                    iG += i2;
                    break;
                case vg8.l /* 35 */:
                    int iG3 = h.g((List) unsafe.getObject(obj, j));
                    if (iG3 > 0) {
                        iG = mw7.e(iG3, vu3.m(i6), iG3, iG);
                    }
                    break;
                case 36:
                    int iE2 = h.e((List) unsafe.getObject(obj, j));
                    if (iE2 > 0) {
                        iG = mw7.e(iE2, vu3.m(i6), iE2, iG);
                    }
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    int iK2 = h.k((List) unsafe.getObject(obj, j));
                    if (iK2 > 0) {
                        iG = mw7.e(iK2, vu3.m(i6), iK2, iG);
                    }
                    break;
                case 38:
                    int iU = h.u((List) unsafe.getObject(obj, j));
                    if (iU > 0) {
                        iG = mw7.e(iU, vu3.m(i6), iU, iG);
                    }
                    break;
                case 39:
                    int i13 = h.i((List) unsafe.getObject(obj, j));
                    if (i13 > 0) {
                        iG = mw7.e(i13, vu3.m(i6), i13, iG);
                    }
                    break;
                case 40:
                    int iG4 = h.g((List) unsafe.getObject(obj, j));
                    if (iG4 > 0) {
                        iG = mw7.e(iG4, vu3.m(i6), iG4, iG);
                    }
                    break;
                case 41:
                    int iE3 = h.e((List) unsafe.getObject(obj, j));
                    if (iE3 > 0) {
                        iG = mw7.e(iE3, vu3.m(i6), iE3, iG);
                    }
                    break;
                case 42:
                    List list2 = (List) unsafe.getObject(obj, j);
                    Class cls3 = h.a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iG = mw7.e(size3, vu3.m(i6), size3, iG);
                    }
                    break;
                case 43:
                    int iS = h.s((List) unsafe.getObject(obj, j));
                    if (iS > 0) {
                        iG = mw7.e(iS, vu3.m(i6), iS, iG);
                    }
                    break;
                case 44:
                    int iC = h.c((List) unsafe.getObject(obj, j));
                    if (iC > 0) {
                        iG = mw7.e(iC, vu3.m(i6), iC, iG);
                    }
                    break;
                case 45:
                    int iE4 = h.e((List) unsafe.getObject(obj, j));
                    if (iE4 > 0) {
                        iG = mw7.e(iE4, vu3.m(i6), iE4, iG);
                    }
                    break;
                case 46:
                    int iG5 = h.g((List) unsafe.getObject(obj, j));
                    if (iG5 > 0) {
                        iG = mw7.e(iG5, vu3.m(i6), iG5, iG);
                    }
                    break;
                case 47:
                    int iN = h.n((List) unsafe.getObject(obj, j));
                    if (iN > 0) {
                        iG = mw7.e(iN, vu3.m(i6), iN, iG);
                    }
                    break;
                case 48:
                    int iP = h.p((List) unsafe.getObject(obj, j));
                    if (iP > 0) {
                        iG = mw7.e(iP, vu3.m(i6), iP, iG);
                    }
                    break;
                case 49:
                    List list3 = (List) unsafe.getObject(obj, j);
                    l3f l3fVarN2 = n(i4);
                    Class cls4 = h.a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iJ = 0;
                    } else {
                        iJ = 0;
                        for (int i14 = 0; i14 < size4; i14++) {
                            iJ += vu3.j(i6, (a) list3.get(i14), l3fVarN2);
                        }
                    }
                    iG += iJ;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    Object objM = m(i4);
                    this.n.getClass();
                    i2 = gm9.a(object3, i6, objM);
                    iG += i2;
                    break;
                case 51:
                    if (r(i6, i4, obj)) {
                        iG = r5a.g(i6, 8, iG);
                    }
                    break;
                case 52:
                    if (r(i6, i4, obj)) {
                        iG = r5a.g(i6, 4, iG);
                    }
                    break;
                case 53:
                    if (r(i6, i4, obj)) {
                        long jA = A(j, obj);
                        iM = vu3.m(i6);
                        iO = vu3.o(jA);
                        iM4 = iO + iM;
                        iG += iM4;
                    }
                    break;
                case 54:
                    if (r(i6, i4, obj)) {
                        long jA2 = A(j, obj);
                        iM = vu3.m(i6);
                        iO = vu3.o(jA2);
                        iM4 = iO + iM;
                        iG += iM4;
                    }
                    break;
                case 55:
                    if (r(i6, i4, obj)) {
                        int iZ = z(j, obj);
                        iM2 = vu3.m(i6);
                        iK = vu3.k(iZ);
                        i2 = iK + iM2;
                        iG += i2;
                    }
                    break;
                case 56:
                    if (r(i6, i4, obj)) {
                        i2 = vu3.i(i6);
                        iG += i2;
                    }
                    break;
                case 57:
                    if (r(i6, i4, obj)) {
                        i2 = vu3.h(i6);
                        iG += i2;
                    }
                    break;
                case 58:
                    if (r(i6, i4, obj)) {
                        iG = r5a.g(i6, 1, iG);
                    }
                    break;
                case 59:
                    if (r(i6, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof c71) {
                            int iM7 = vu3.m(i6);
                            int size5 = ((c71) object4).size();
                            iE = mw7.e(size5, size5, iM7, iG);
                        } else {
                            iM3 = vu3.m(i6);
                            iL = vu3.l((String) object4);
                            iE = iL + iM3 + iG;
                        }
                        iG = iE;
                    }
                    break;
                case 60:
                    if (r(i6, i4, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        l3f l3fVarN3 = n(i4);
                        Class cls5 = h.a;
                        int iM8 = vu3.m(i6);
                        int iB2 = ((a) object5).b(l3fVarN3);
                        iG = mw7.e(iB2, iB2, iM8, iG);
                    }
                    break;
                case 61:
                    if (r(i6, i4, obj)) {
                        i2 = vu3.f(i6, (c71) unsafe.getObject(obj, j));
                        iG += i2;
                    }
                    break;
                case 62:
                    if (r(i6, i4, obj)) {
                        int iZ2 = z(j, obj);
                        iM2 = vu3.m(i6);
                        iK = vu3.n(iZ2);
                        i2 = iK + iM2;
                        iG += i2;
                    }
                    break;
                case 63:
                    if (r(i6, i4, obj)) {
                        int iZ3 = z(j, obj);
                        iM2 = vu3.m(i6);
                        iK = vu3.k(iZ3);
                        i2 = iK + iM2;
                        iG += i2;
                    }
                    break;
                case 64:
                    if (r(i6, i4, obj)) {
                        iG = r5a.g(i6, 4, iG);
                    }
                    break;
                case 65:
                    if (r(i6, i4, obj)) {
                        iG = r5a.g(i6, 8, iG);
                    }
                    break;
                case 66:
                    if (r(i6, i4, obj)) {
                        int iZ4 = z(j, obj);
                        iM2 = vu3.m(i6);
                        iK = vu3.n((iZ4 >> 31) ^ (iZ4 << 1));
                        i2 = iK + iM2;
                        iG += i2;
                    }
                    break;
                case 67:
                    if (r(i6, i4, obj)) {
                        long jA3 = A(j, obj);
                        iM = vu3.m(i6);
                        iO = vu3.o((jA3 >> 63) ^ (jA3 << 1));
                        iM4 = iO + iM;
                        iG += iM4;
                    }
                    break;
                case 68:
                    if (r(i6, i4, obj)) {
                        i2 = vu3.j(i6, (a) unsafe.getObject(obj, j), n(i4));
                        iG += i2;
                    }
                    break;
            }
            i4 += 3;
        }
    }

    public final int p(Object obj) {
        int iM;
        int iO;
        int iM2;
        int iK;
        int i;
        int iM3;
        int iL;
        int iM4;
        int iO2;
        int iJ;
        Unsafe unsafe = p;
        int i2 = 0;
        int iG = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                ((mci) this.m).getClass();
                return ((d) obj).unknownFields.a() + iG;
            }
            int iG2 = G(i2);
            int iF = F(iG2);
            int i3 = iArr[i2];
            long j = iG2 & 1048575;
            if (iF >= lp6.b.a && iF <= lp6.c.a) {
                int i4 = iArr[i2 + 2];
            }
            switch (iF) {
                case 0:
                    if (q(i2, obj)) {
                        iG = r5a.g(i3, 8, iG);
                    }
                    break;
                case 1:
                    if (q(i2, obj)) {
                        iG = r5a.g(i3, 4, iG);
                    }
                    break;
                case 2:
                    if (q(i2, obj)) {
                        long jH = ldi.d.h(j, obj);
                        iM = vu3.m(i3);
                        iO = vu3.o(jH);
                        i = iO + iM;
                        iG += i;
                    }
                    break;
                case 3:
                    if (q(i2, obj)) {
                        long jH2 = ldi.d.h(j, obj);
                        iM = vu3.m(i3);
                        iO = vu3.o(jH2);
                        i = iO + iM;
                        iG += i;
                    }
                    break;
                case 4:
                    if (q(i2, obj)) {
                        int iG3 = ldi.d.g(j, obj);
                        iM2 = vu3.m(i3);
                        iK = vu3.k(iG3);
                        i = iK + iM2;
                        iG += i;
                    }
                    break;
                case 5:
                    if (q(i2, obj)) {
                        i = vu3.i(i3);
                        iG += i;
                    }
                    break;
                case 6:
                    if (q(i2, obj)) {
                        i = vu3.h(i3);
                        iG += i;
                    }
                    break;
                case 7:
                    if (q(i2, obj)) {
                        iG = r5a.g(i3, 1, iG);
                    }
                    break;
                case 8:
                    if (q(i2, obj)) {
                        Object objI = ldi.d.i(j, obj);
                        if (objI instanceof c71) {
                            int iM5 = vu3.m(i3);
                            int size = ((c71) objI).size();
                            iG = mw7.e(size, size, iM5, iG);
                        } else {
                            iM3 = vu3.m(i3);
                            iL = vu3.l((String) objI);
                            iG = iL + iM3 + iG;
                        }
                    }
                    break;
                case 9:
                    if (q(i2, obj)) {
                        Object objI2 = ldi.d.i(j, obj);
                        l3f l3fVarN = n(i2);
                        Class cls = h.a;
                        int iM6 = vu3.m(i3);
                        int iB = ((a) objI2).b(l3fVarN);
                        iG = mw7.e(iB, iB, iM6, iG);
                    }
                    break;
                case 10:
                    if (q(i2, obj)) {
                        i = vu3.f(i3, (c71) ldi.d.i(j, obj));
                        iG += i;
                    }
                    break;
                case 11:
                    if (q(i2, obj)) {
                        int iG4 = ldi.d.g(j, obj);
                        iM2 = vu3.m(i3);
                        iK = vu3.n(iG4);
                        i = iK + iM2;
                        iG += i;
                    }
                    break;
                case 12:
                    if (q(i2, obj)) {
                        int iG5 = ldi.d.g(j, obj);
                        iM2 = vu3.m(i3);
                        iK = vu3.k(iG5);
                        i = iK + iM2;
                        iG += i;
                    }
                    break;
                case 13:
                    if (q(i2, obj)) {
                        iG = r5a.g(i3, 4, iG);
                    }
                    break;
                case 14:
                    if (q(i2, obj)) {
                        iG = r5a.g(i3, 8, iG);
                    }
                    break;
                case 15:
                    if (q(i2, obj)) {
                        int iG6 = ldi.d.g(j, obj);
                        iM2 = vu3.m(i3);
                        iK = vu3.n((iG6 >> 31) ^ (iG6 << 1));
                        i = iK + iM2;
                        iG += i;
                    }
                    break;
                case 16:
                    if (q(i2, obj)) {
                        long jH3 = ldi.d.h(j, obj);
                        iM4 = vu3.m(i3);
                        iO2 = vu3.o((jH3 >> 63) ^ (jH3 << 1));
                        i = iO2 + iM4;
                        iG += i;
                    }
                    break;
                case 17:
                    if (q(i2, obj)) {
                        i = vu3.j(i3, (a) ldi.d.i(j, obj), n(i2));
                        iG += i;
                    }
                    break;
                case 18:
                    i = h.f(i3, s(j, obj));
                    iG += i;
                    break;
                case 19:
                    i = h.d(i3, s(j, obj));
                    iG += i;
                    break;
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    i = h.j(i3, s(j, obj));
                    iG += i;
                    break;
                case 21:
                    i = h.t(i3, s(j, obj));
                    iG += i;
                    break;
                case 22:
                    i = h.h(i3, s(j, obj));
                    iG += i;
                    break;
                case 23:
                    i = h.f(i3, s(j, obj));
                    iG += i;
                    break;
                case 24:
                    i = h.d(i3, s(j, obj));
                    iG += i;
                    break;
                case 25:
                    List listS = s(j, obj);
                    Class cls2 = h.a;
                    int size2 = listS.size();
                    iG += size2 == 0 ? 0 : (vu3.m(i3) + 1) * size2;
                    break;
                case 26:
                    i = h.q(i3, s(j, obj));
                    iG += i;
                    break;
                case 27:
                    i = h.l(i3, s(j, obj), n(i2));
                    iG += i;
                    break;
                case 28:
                    i = h.a(i3, s(j, obj));
                    iG += i;
                    break;
                case 29:
                    i = h.r(i3, s(j, obj));
                    iG += i;
                    break;
                case 30:
                    i = h.b(i3, s(j, obj));
                    iG += i;
                    break;
                case 31:
                    i = h.d(i3, s(j, obj));
                    iG += i;
                    break;
                case 32:
                    i = h.f(i3, s(j, obj));
                    iG += i;
                    break;
                case 33:
                    i = h.m(i3, s(j, obj));
                    iG += i;
                    break;
                case 34:
                    i = h.o(i3, s(j, obj));
                    iG += i;
                    break;
                case vg8.l /* 35 */:
                    int iG7 = h.g((List) unsafe.getObject(obj, j));
                    if (iG7 > 0) {
                        iG = mw7.e(iG7, vu3.m(i3), iG7, iG);
                    }
                    break;
                case 36:
                    int iE = h.e((List) unsafe.getObject(obj, j));
                    if (iE > 0) {
                        iG = mw7.e(iE, vu3.m(i3), iE, iG);
                    }
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    int iK2 = h.k((List) unsafe.getObject(obj, j));
                    if (iK2 > 0) {
                        iG = mw7.e(iK2, vu3.m(i3), iK2, iG);
                    }
                    break;
                case 38:
                    int iU = h.u((List) unsafe.getObject(obj, j));
                    if (iU > 0) {
                        iG = mw7.e(iU, vu3.m(i3), iU, iG);
                    }
                    break;
                case 39:
                    int i5 = h.i((List) unsafe.getObject(obj, j));
                    if (i5 > 0) {
                        iG = mw7.e(i5, vu3.m(i3), i5, iG);
                    }
                    break;
                case 40:
                    int iG8 = h.g((List) unsafe.getObject(obj, j));
                    if (iG8 > 0) {
                        iG = mw7.e(iG8, vu3.m(i3), iG8, iG);
                    }
                    break;
                case 41:
                    int iE2 = h.e((List) unsafe.getObject(obj, j));
                    if (iE2 > 0) {
                        iG = mw7.e(iE2, vu3.m(i3), iE2, iG);
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls3 = h.a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iG = mw7.e(size3, vu3.m(i3), size3, iG);
                    }
                    break;
                case 43:
                    int iS = h.s((List) unsafe.getObject(obj, j));
                    if (iS > 0) {
                        iG = mw7.e(iS, vu3.m(i3), iS, iG);
                    }
                    break;
                case 44:
                    int iC = h.c((List) unsafe.getObject(obj, j));
                    if (iC > 0) {
                        iG = mw7.e(iC, vu3.m(i3), iC, iG);
                    }
                    break;
                case 45:
                    int iE3 = h.e((List) unsafe.getObject(obj, j));
                    if (iE3 > 0) {
                        iG = mw7.e(iE3, vu3.m(i3), iE3, iG);
                    }
                    break;
                case 46:
                    int iG9 = h.g((List) unsafe.getObject(obj, j));
                    if (iG9 > 0) {
                        iG = mw7.e(iG9, vu3.m(i3), iG9, iG);
                    }
                    break;
                case 47:
                    int iN = h.n((List) unsafe.getObject(obj, j));
                    if (iN > 0) {
                        iG = mw7.e(iN, vu3.m(i3), iN, iG);
                    }
                    break;
                case 48:
                    int iP = h.p((List) unsafe.getObject(obj, j));
                    if (iP > 0) {
                        iG = mw7.e(iP, vu3.m(i3), iP, iG);
                    }
                    break;
                case 49:
                    List listS2 = s(j, obj);
                    l3f l3fVarN2 = n(i2);
                    Class cls4 = h.a;
                    int size4 = listS2.size();
                    if (size4 == 0) {
                        iJ = 0;
                    } else {
                        iJ = 0;
                        for (int i6 = 0; i6 < size4; i6++) {
                            iJ += vu3.j(i3, (a) listS2.get(i6), l3fVarN2);
                        }
                    }
                    iG += iJ;
                    break;
                case 50:
                    Object objI3 = ldi.d.i(j, obj);
                    Object objM = m(i2);
                    this.n.getClass();
                    i = gm9.a(objI3, i3, objM);
                    iG += i;
                    break;
                case 51:
                    if (r(i3, i2, obj)) {
                        iG = r5a.g(i3, 8, iG);
                    }
                    break;
                case 52:
                    if (r(i3, i2, obj)) {
                        iG = r5a.g(i3, 4, iG);
                    }
                    break;
                case 53:
                    if (r(i3, i2, obj)) {
                        long jA = A(j, obj);
                        iM = vu3.m(i3);
                        iO = vu3.o(jA);
                        i = iO + iM;
                        iG += i;
                    }
                    break;
                case 54:
                    if (r(i3, i2, obj)) {
                        long jA2 = A(j, obj);
                        iM = vu3.m(i3);
                        iO = vu3.o(jA2);
                        i = iO + iM;
                        iG += i;
                    }
                    break;
                case 55:
                    if (r(i3, i2, obj)) {
                        int iZ = z(j, obj);
                        iM2 = vu3.m(i3);
                        iK = vu3.k(iZ);
                        i = iK + iM2;
                        iG += i;
                    }
                    break;
                case 56:
                    if (r(i3, i2, obj)) {
                        i = vu3.i(i3);
                        iG += i;
                    }
                    break;
                case 57:
                    if (r(i3, i2, obj)) {
                        i = vu3.h(i3);
                        iG += i;
                    }
                    break;
                case 58:
                    if (r(i3, i2, obj)) {
                        iG = r5a.g(i3, 1, iG);
                    }
                    break;
                case 59:
                    if (r(i3, i2, obj)) {
                        Object objI4 = ldi.d.i(j, obj);
                        if (objI4 instanceof c71) {
                            int iM7 = vu3.m(i3);
                            int size5 = ((c71) objI4).size();
                            iG = mw7.e(size5, size5, iM7, iG);
                        } else {
                            iM3 = vu3.m(i3);
                            iL = vu3.l((String) objI4);
                            iG = iL + iM3 + iG;
                        }
                    }
                    break;
                case 60:
                    if (r(i3, i2, obj)) {
                        Object objI5 = ldi.d.i(j, obj);
                        l3f l3fVarN3 = n(i2);
                        Class cls5 = h.a;
                        int iM8 = vu3.m(i3);
                        int iB2 = ((a) objI5).b(l3fVarN3);
                        iG = mw7.e(iB2, iB2, iM8, iG);
                    }
                    break;
                case 61:
                    if (r(i3, i2, obj)) {
                        i = vu3.f(i3, (c71) ldi.d.i(j, obj));
                        iG += i;
                    }
                    break;
                case 62:
                    if (r(i3, i2, obj)) {
                        int iZ2 = z(j, obj);
                        iM2 = vu3.m(i3);
                        iK = vu3.n(iZ2);
                        i = iK + iM2;
                        iG += i;
                    }
                    break;
                case 63:
                    if (r(i3, i2, obj)) {
                        int iZ3 = z(j, obj);
                        iM2 = vu3.m(i3);
                        iK = vu3.k(iZ3);
                        i = iK + iM2;
                        iG += i;
                    }
                    break;
                case 64:
                    if (r(i3, i2, obj)) {
                        iG = r5a.g(i3, 4, iG);
                    }
                    break;
                case 65:
                    if (r(i3, i2, obj)) {
                        iG = r5a.g(i3, 8, iG);
                    }
                    break;
                case 66:
                    if (r(i3, i2, obj)) {
                        int iZ4 = z(j, obj);
                        iM2 = vu3.m(i3);
                        iK = vu3.n((iZ4 >> 31) ^ (iZ4 << 1));
                        i = iK + iM2;
                        iG += i;
                    }
                    break;
                case 67:
                    if (r(i3, i2, obj)) {
                        long jA3 = A(j, obj);
                        iM4 = vu3.m(i3);
                        iO2 = vu3.o((jA3 >> 63) ^ (jA3 << 1));
                        i = iO2 + iM4;
                        iG += i;
                    }
                    break;
                case 68:
                    if (r(i3, i2, obj)) {
                        i = vu3.j(i3, (a) ldi.d.i(j, obj), n(i2));
                        iG += i;
                    }
                    break;
            }
            i2 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x010a A[RETURN] */
    public final boolean q(int i, Object obj) {
        if (!this.g) {
            int i2 = this.a[i + 2];
            if ((ldi.d.g(i2 & 1048575, obj) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
        int iG = G(i);
        long j = iG & 1048575;
        switch (F(iG)) {
            case 0:
                if (ldi.d.e(j, obj) != 0.0d) {
                    return true;
                }
                return false;
            case 1:
                if (ldi.d.f(j, obj) != 0.0f) {
                    return true;
                }
                return false;
            case 2:
                if (ldi.d.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (ldi.d.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (ldi.d.g(j, obj) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (ldi.d.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (ldi.d.g(j, obj) != 0) {
                    return true;
                }
                return false;
            case 7:
                return ldi.d.c(j, obj);
            case 8:
                Object objI = ldi.d.i(j, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof c71) {
                    return !c71.c.equals(objI);
                }
                ore.a();
                return false;
            case 9:
                if (ldi.d.i(j, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                return !c71.c.equals(ldi.d.i(j, obj));
            case 11:
                if (ldi.d.g(j, obj) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (ldi.d.g(j, obj) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (ldi.d.g(j, obj) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (ldi.d.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (ldi.d.g(j, obj) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (ldi.d.h(j, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (ldi.d.i(j, obj) != null) {
                    return true;
                }
                return false;
            default:
                ore.a();
                return false;
        }
    }

    public final boolean r(int i, int i2, Object obj) {
        return ldi.d.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void t(Object obj, int i, Object obj2, xh6 xh6Var, o8e o8eVar) {
        long jG = G(i) & 1048575;
        Object objI = ldi.d.i(jG, obj);
        gm9 gm9Var = this.n;
        if (objI == null) {
            gm9Var.getClass();
            objI = fm9.b.b();
            ldi.o(jG, obj, objI);
        } else {
            gm9Var.getClass();
            if (!((fm9) objI).a) {
                fm9 fm9VarB = fm9.b.b();
                gm9.b(fm9VarB, objI);
                ldi.o(jG, obj, fm9VarB);
                objI = fm9VarB;
            }
        }
        gm9Var.getClass();
        o8eVar.k((fm9) objI, ((bm9) obj2).a, xh6Var);
    }

    public final void u(Object obj, int i, Object obj2) {
        long jG = G(i) & 1048575;
        if (q(i, obj2)) {
            kdi kdiVar = ldi.d;
            Object objI = kdiVar.i(jG, obj);
            Object objI2 = kdiVar.i(jG, obj2);
            if (objI != null && objI2 != null) {
                ldi.o(jG, obj, wj8.c(objI, objI2));
                D(i, obj);
            } else if (objI2 != null) {
                ldi.o(jG, obj, objI2);
                D(i, obj);
            }
        }
    }

    public final void v(Object obj, int i, Object obj2) {
        int iG = G(i);
        int i2 = this.a[i];
        long j = iG & 1048575;
        if (r(i2, i, obj2)) {
            kdi kdiVar = ldi.d;
            Object objI = kdiVar.i(j, obj);
            Object objI2 = kdiVar.i(j, obj2);
            if (objI != null && objI2 != null) {
                ldi.o(j, obj, wj8.c(objI, objI2));
                E(i2, i, obj);
            } else if (objI2 != null) {
                ldi.o(j, obj, objI2);
                E(i2, i, obj);
            }
        }
    }
}
